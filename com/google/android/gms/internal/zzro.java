package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzro {
    private static void zza(String s, Object object0, StringBuffer stringBuffer0, StringBuffer stringBuffer1) throws IllegalAccessException, InvocationTargetException {
        Method method1;
        String s3;
        if(object0 != null) {
            if(!(object0 instanceof zzrn)) {
                goto label_50;
            }
            int v = stringBuffer0.length();
            if(s != null) {
                stringBuffer1.append(stringBuffer0).append(zzro.zzfk(s)).append(" <\n");
                stringBuffer0.append("  ");
            }
            Class class0 = object0.getClass();
            Field[] arr_field = class0.getFields();
            for(int v1 = 0; v1 < arr_field.length; ++v1) {
                Field field0 = arr_field[v1];
                int v2 = field0.getModifiers();
                String s1 = field0.getName();
                if((v2 & 1) == 1 && (v2 & 8) != 8 && !s1.startsWith("_") && !s1.endsWith("_")) {
                    Class class1 = field0.getType();
                    Object object1 = field0.get(object0);
                    if(!class1.isArray()) {
                        zzro.zza(s1, object1, stringBuffer0, stringBuffer1);
                    }
                    else if(class1.getComponentType() == Byte.TYPE) {
                        zzro.zza(s1, object1, stringBuffer0, stringBuffer1);
                    }
                    else {
                        int v3 = object1 == null ? 0 : Array.getLength(object1);
                        for(int v4 = 0; v4 < v3; ++v4) {
                            zzro.zza(s1, Array.get(object1, v4), stringBuffer0, stringBuffer1);
                        }
                    }
                }
            }
            Method[] arr_method = class0.getMethods();
            for(int v5 = 0; v5 < arr_method.length; ++v5) {
                String s2 = arr_method[v5].getName();
                if(s2.startsWith("set")) {
                    try {
                        s3 = s2.substring(3);
                        Method method0 = class0.getMethod("has" + s3);
                    }
                    catch(NoSuchMethodException unused_ex) {
                        continue;
                    }
                    if(((Boolean)method0.invoke(object0, new Object[0])).booleanValue()) {
                        try {
                            method1 = class0.getMethod("get" + s3);
                        }
                        catch(NoSuchMethodException unused_ex) {
                            continue;
                        }
                        zzro.zza(s3, method1.invoke(object0), stringBuffer0, stringBuffer1);
                    }
                }
            }
            if(s != null) {
                stringBuffer0.setLength(v);
                stringBuffer1.append(stringBuffer0).append(">\n");
                return;
            label_50:
                String s4 = zzro.zzfk(s);
                stringBuffer1.append(stringBuffer0).append(s4).append(": ");
                if(object0 instanceof String) {
                    String s5 = zzro.zzfl(((String)object0));
                    stringBuffer1.append("\"").append(s5).append("\"");
                }
                else if(object0 instanceof byte[]) {
                    zzro.zza(((byte[])object0), stringBuffer1);
                }
                else {
                    stringBuffer1.append(object0);
                }
                stringBuffer1.append("\n");
            }
        }
    }

    private static void zza(byte[] arr_b, StringBuffer stringBuffer0) {
        if(arr_b == null) {
            stringBuffer0.append("\"\"");
            return;
        }
        stringBuffer0.append('\"');
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v] & 0xFF;
            if(v1 == 34 || v1 == 92) {
                stringBuffer0.append('\\').append(((char)v1));
            }
            else if(v1 < 0x20 || v1 >= 0x7F) {
                stringBuffer0.append(String.format("\\%03o", v1));
            }
            else {
                stringBuffer0.append(((char)v1));
            }
        }
        stringBuffer0.append('\"');
    }

    private static String zzcr(String s) {
        int v = s.length();
        StringBuilder stringBuilder0 = new StringBuilder(v);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(v2 < 0x20 || v2 > 0x7E || v2 == 34 || v2 == 39) {
                stringBuilder0.append(String.format("\\u%04x", v2));
            }
            else {
                stringBuilder0.append(((char)v2));
            }
        }
        return stringBuilder0.toString();
    }

    private static String zzfk(String s) {
        StringBuffer stringBuffer0 = new StringBuffer();
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(v == 0) {
                stringBuffer0.append(Character.toLowerCase(((char)v1)));
            }
            else if(Character.isUpperCase(((char)v1))) {
                stringBuffer0.append('_').append(Character.toLowerCase(((char)v1)));
            }
            else {
                stringBuffer0.append(((char)v1));
            }
        }
        return stringBuffer0.toString();
    }

    private static String zzfl(String s) {
        if(!s.startsWith("http") && s.length() > 200) {
            s = s.substring(0, 200) + "[...]";
        }
        return zzro.zzcr(s);
    }

    public static String zzg(zzrn zzrn0) {
        if(zzrn0 == null) {
            return "";
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        try {
            zzro.zza(null, zzrn0, new StringBuffer(), stringBuffer0);
            return stringBuffer0.toString();
        }
        catch(IllegalAccessException illegalAccessException0) {
            return "Error printing proto: " + illegalAccessException0.getMessage();
        }
        catch(InvocationTargetException invocationTargetException0) {
            return "Error printing proto: " + invocationTargetException0.getMessage();
        }
    }
}

