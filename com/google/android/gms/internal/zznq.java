package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;

public abstract class zznq {
    public static String zzD(Map map0) {
        return zznq.zza(map0, 1);
    }

    private static String zza(Object object0, int v) {
        if(v > 10) {
            return "ERROR: Recursive toString calls";
        }
        if(object0 == null) {
            return "";
        }
        if(object0 instanceof String) {
            return TextUtils.isEmpty(((String)object0)) ? "" : object0.toString();
        }
        if(object0 instanceof Integer) {
            return ((int)(((Integer)object0))) == 0 ? "" : object0.toString();
        }
        if(object0 instanceof Long) {
            return ((long)(((Long)object0))) == 0L ? "" : object0.toString();
        }
        if(object0 instanceof Double) {
            return ((double)(((Double)object0))) == 0.0 ? "" : object0.toString();
        }
        if(object0 instanceof Boolean) {
            return ((Boolean)object0).booleanValue() ? object0.toString() : "";
        }
        if(object0 instanceof List) {
            StringBuffer stringBuffer0 = new StringBuffer();
            if(v > 0) {
                stringBuffer0.append("[");
            }
            int v1 = stringBuffer0.length();
            for(Object object1: ((List)object0)) {
                if(stringBuffer0.length() > v1) {
                    stringBuffer0.append(", ");
                }
                stringBuffer0.append(zznq.zza(object1, v + 1));
            }
            if(v > 0) {
                stringBuffer0.append("]");
            }
            return stringBuffer0.toString();
        }
        if(object0 instanceof Map) {
            StringBuffer stringBuffer1 = new StringBuffer();
            int v2 = 0;
            boolean z = false;
            for(Object object2: new TreeMap(((Map)object0)).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object2;
                String s = zznq.zza(map$Entry0.getValue(), v + 1);
                if(!TextUtils.isEmpty(s)) {
                    if(v > 0 && !z) {
                        stringBuffer1.append("{");
                        z = true;
                        v2 = stringBuffer1.length();
                    }
                    if(stringBuffer1.length() > v2) {
                        stringBuffer1.append(", ");
                    }
                    stringBuffer1.append(((String)map$Entry0.getKey()));
                    stringBuffer1.append('=');
                    stringBuffer1.append(s);
                }
            }
            if(z) {
                stringBuffer1.append("}");
            }
            return stringBuffer1.toString();
        }
        return object0.toString();
    }

    public abstract void zza(zznq arg1);

    public static String zzy(Object object0) {
        return zznq.zza(object0, 0);
    }
}

