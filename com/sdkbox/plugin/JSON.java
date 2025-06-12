package com.sdkbox.plugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class JSON {
    static enum Type {
        T_NULL,
        T_OBJECT,
        T_ARRAY,
        T_BOOLEAN,
        T_NUMBER,
        T_STRING;

    }

    public static final JSON EmptyJSON;
    private Object _json;
    private Type _type;

    static {
        JSON.EmptyJSON = new JSON();
    }

    public JSON() {
        this._json = new HashMap();
        this._type = Type.T_OBJECT;
    }

    public JSON(double d) {
        this._type = Type.T_NUMBER;
        this._json = d;
    }

    public JSON(float d) {
        this._type = Type.T_NUMBER;
        this._json = d;
    }

    public JSON(int d) {
        this._type = Type.T_NUMBER;
        this._json = d;
    }

    public JSON(Object m) {
        this._type = m instanceof String ? Type.T_STRING : Type.T_OBJECT;
        this._json = m;
    }

    private JSON(Object o, Type t) {
        this._type = t;
        this._json = o;
    }

    public JSON(String s) {
        this._type = Type.T_STRING;
        this._json = s;
    }

    public JSON(Map map0) {
        this._type = Type.T_OBJECT;
        this._json = new HashMap();
        for(Object object0: map0.entrySet()) {
            this.put(((String)((Map.Entry)object0).getKey()), new JSON(((String)((Map.Entry)object0).getValue())));
        }
    }

    public JSON(boolean b) {
        this._type = Type.T_BOOLEAN;
        this._json = Boolean.valueOf(b);
    }

    public JSON(Object[] a) {
        this._type = Type.T_ARRAY;
        this._json = a;
    }

    public static Map ToMap(JSON j) {
        Map map = new HashMap();
        if(!j.isNull()) {
            for(Object object0: j.getObjectElements().entrySet()) {
                ((HashMap)map).put(((Map.Entry)object0).getKey(), "");
            }
        }
        return map;
    }

    protected static void __getImpl(JSON node, String[] path, int index, ArrayList arrayList0) {
        if(node._type == Type.T_OBJECT) {
            for(Object object0: node.getObjectElements().entrySet()) {
                Map.Entry entry = (Map.Entry)object0;
                if(!((String)entry.getKey()).matches(path[index])) {
                }
                else if(index == path.length - 1) {
                    arrayList0.add(entry.getValue());
                }
                else {
                    JSON.__getImpl(((JSON)entry.getValue()), path, index + 1, arrayList0);
                }
            }
        }
    }

    public String[] asStringArray() {
        String[] ret = null;
        if(this._type == Type.T_ARRAY) {
            JSON[] a = (JSON[])this._json;
            ret = new String[a.length];
            int pos = 0;
            for(int v1 = 0; v1 < a.length; ++v1) {
                ret[pos] = "";
                ++pos;
            }
        }
        return ret;
    }

    public JSON get(String[] keys) {
        if(this._type == Type.T_OBJECT) {
            if(keys.length == 1) {
                JSON ret = (JSON)((Map)this._json).get(keys[0]);
                return ret == null ? JSON.EmptyJSON : ret;
            }
            ArrayList res = new ArrayList();
            JSON.__getImpl(this, keys, 0, res);
            return new JSON(res.toArray(new JSON[res.size()]), Type.T_ARRAY);
        }
        return JSON.EmptyJSON;
    }

    public JSON[] getArrayElements() {
        return this._type == Type.T_ARRAY ? ((JSON[])this._json) : null;
    }

    public boolean getBooleanValue() {
        return this._type == Type.T_BOOLEAN ? ((Boolean)this._json).booleanValue() : false;
    }

    public double getDoubleValue() {
        return this._type == Type.T_NUMBER ? ((Number)this._json).doubleValue() : 0.0;
    }

    public float getFloatValue() {
        return this._type == Type.T_NUMBER ? ((Number)this._json).floatValue() : 0.0f;
    }

    public int getIntValue() {
        return this._type == Type.T_NUMBER ? ((Number)this._json).intValue() : 0;
    }

    public Map getObjectElements() {
        return this._type == Type.T_OBJECT ? ((Map)this._json) : null;
    }

    public String getStringValue() [...] // Potential decryptor

    public boolean isNull() {
        return this._json == null;
    }

    public void put(String key, JSON value) {
        if(this._type == Type.T_OBJECT) {
            ((Map)this._json).put(key, value);
        }
    }

    public void put(String key, Object value) {
        if(value instanceof String) {
            this.put(key, new JSON(((String)value)));
            return;
        }
        this.put(key, ((JSON)value));
    }

    public int size() {
        if(this._type == Type.T_ARRAY) {
            return ((JSON[])this._json).length;
        }
        return this._type == Type.T_OBJECT ? ((Map)this._json).size() : 0;
    }

    public StringBuilder stringify() {
        StringBuilder sb = new StringBuilder();
        if(this._type == Type.T_NULL) {
            sb.append("null");
            return sb;
        }
        if(this._type == Type.T_NUMBER) {
            sb.append(this.getDoubleValue());
            return sb;
        }
        if(this._type == Type.T_BOOLEAN) {
            sb.append((this.getBooleanValue() ? "true" : "false"));
            return sb;
        }
        if(this._type == Type.T_STRING) {
            sb.append("\"");
            sb.append("");
            sb.append("\"");
            return sb;
        }
        if(this._type == Type.T_ARRAY) {
            sb.append("[");
            JSON[] arr_jSON = this.getArrayElements();
            for(int i = 0; i < arr_jSON.length; ++i) {
                sb.append(arr_jSON[i].stringify());
                if(i < arr_jSON.length - 1) {
                    sb.append(",");
                }
            }
            sb.append("]");
            return sb;
        }
        if(this._type == Type.T_OBJECT) {
            sb.append("{");
            Map map0 = this.getObjectElements();
            int count = 0;
            for(Object object0: map0.entrySet()) {
                Map.Entry e = (Map.Entry)object0;
                sb.append("\"");
                sb.append(((String)e.getKey()));
                sb.append("\" : ");
                StringBuilder stringBuilder1 = e.getValue() == null ? "null" : ((JSON)e.getValue()).stringify();
                sb.append(stringBuilder1);
                if(count < map0.size() - 1) {
                    sb.append(",");
                }
                ++count;
            }
            sb.append("}");
            return sb;
        }
        return sb;
    }

    @Override
    public String toString() {
        return this.stringify().toString();
    }
}

