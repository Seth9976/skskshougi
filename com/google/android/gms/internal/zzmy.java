package com.google.android.gms.internal;

public class zzmy {
    private static final ThreadLocal zzakW;

    static {
        zzmy.zzakW = new ThreadLocal();
    }

    // 去混淆评级： 低(20)
    public static String zzcL(String s) {
        return zzmy.zzqQ() ? s : zzmy.zzx(s, ((String)zzmy.zzakW.get()));
    }

    public static boolean zzqQ() {
        String s = (String)zzmy.zzakW.get();
        return s == null || s.startsWith("com.google");
    }

    public static String zzx(String s, String s1) {
        if(s == null || s1 == null) {
            return s;
        }
        byte[] arr_b = new byte[s.length() + s1.length()];
        System.arraycopy(s.getBytes(), 0, arr_b, 0, s.length());
        System.arraycopy(s1.getBytes(), 0, arr_b, s.length(), s1.length());
        return Integer.toHexString(zzlj.zza(arr_b, 0, arr_b.length, 0));
    }
}

