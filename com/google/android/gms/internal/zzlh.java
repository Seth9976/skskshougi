package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzlh {
    private static final Pattern zzacL;
    private static final Pattern zzacM;

    static {
        zzlh.zzacL = Pattern.compile("\\\\.");
        zzlh.zzacM = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    public static String zzcr(String s) {
        if(!TextUtils.isEmpty(s)) {
            Matcher matcher0 = zzlh.zzacM.matcher(s);
            StringBuffer stringBuffer0 = null;
            while(matcher0.find()) {
                if(stringBuffer0 == null) {
                    stringBuffer0 = new StringBuffer();
                }
                switch(matcher0.group().charAt(0)) {
                    case 8: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\b");
                        break;
                    }
                    case 9: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\t");
                        break;
                    }
                    case 10: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\n");
                        break;
                    }
                    case 12: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\f");
                        break;
                    }
                    case 13: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\r");
                        break;
                    }
                    case 34: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\\\\"");
                        break;
                    }
                    case 0x2F: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\/");
                        break;
                    }
                    case 92: {
                        matcher0.appendReplacement(stringBuffer0, "\\\\\\\\");
                    }
                }
            }
            if(stringBuffer0 != null) {
                matcher0.appendTail(stringBuffer0);
                return stringBuffer0.toString();
            }
        }
        return s;
    }

    public static boolean zzd(Object object0, Object object1) {
        if(object0 == null && object1 == null) {
            return true;
        }
        if(object0 != null && object1 != null) {
            if(!(object0 instanceof JSONObject) || !(object1 instanceof JSONObject)) {
                if(!(object0 instanceof JSONArray) || !(object1 instanceof JSONArray)) {
                    return object0.equals(object1);
                }
                JSONArray jSONArray0 = (JSONArray)object0;
                JSONArray jSONArray1 = (JSONArray)object1;
                if(jSONArray0.length() == jSONArray1.length()) {
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        try {
                            if(!zzlh.zzd(jSONArray0.get(v), jSONArray1.get(v))) {
                                return false;
                            }
                        }
                        catch(JSONException unused_ex) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            else {
                JSONObject jSONObject0 = (JSONObject)object0;
                JSONObject jSONObject1 = (JSONObject)object1;
                if(jSONObject0.length() == jSONObject1.length()) {
                    Iterator iterator0 = jSONObject0.keys();
                    while(iterator0.hasNext()) {
                        Object object2 = iterator0.next();
                        String s = (String)object2;
                        if(jSONObject1.has(s)) {
                            try {
                                if(zzlh.zzd(jSONObject0.get(s), jSONObject1.get(s))) {
                                    continue;
                                }
                            }
                            catch(JSONException unused_ex) {
                                return false;
                            }
                        }
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}

