package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Pattern;

public final class zzf {
    private static final Pattern zzUP;

    static {
        zzf.zzUP = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");
    }

    public static double zzA(long v) {
        return ((double)v) / 1000.0;
    }

    // 去混淆评级： 低(40)
    private static boolean zza(char c) {
        return c >= 65 && c <= 90 || c >= 97 && c <= 0x7A || c >= 0x30 && c <= 57 || (c == 45 || c == 0x5F);
    }

    // 去混淆评级： 低(30)
    public static boolean zza(Object object0, Object object1) {
        return object0 == null && object1 == null || object0 != null && object1 != null && object0.equals(object1);
    }

    public static String zzb(Locale locale0) {
        StringBuilder stringBuilder0 = new StringBuilder(20);
        stringBuilder0.append(locale0.getLanguage());
        String s = locale0.getCountry();
        if(!TextUtils.isEmpty(s)) {
            stringBuilder0.append('-').append(s);
        }
        String s1 = locale0.getVariant();
        if(!TextUtils.isEmpty(s1)) {
            stringBuilder0.append('-').append(s1);
        }
        return stringBuilder0.toString();
    }

    public static void zzbD(String s) throws IllegalArgumentException {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        }
        if(s.length() > 0x80) {
            throw new IllegalArgumentException("Invalid namespace length");
        }
        if(!s.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        }
        if(s.length() == 11) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    public static String zzbE(String s) [...] // Inlined contents

    public static String zzbF(String s) {
        if(zzf.zzUP.matcher(s).matches()) {
            return s;
        }
        StringBuilder stringBuilder0 = new StringBuilder(s.length());
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(!zzf.zza(((char)v1)) && v1 != 46 && v1 != 58) {
                stringBuilder0.append(String.format("%%%04x", ((int)(v1 & 0xFFFF))));
            }
            else {
                stringBuilder0.append(((char)v1));
            }
        }
        return stringBuilder0.toString();
    }

    public static long zze(double f) {
        return (long)(1000.0 * f);
    }
}

