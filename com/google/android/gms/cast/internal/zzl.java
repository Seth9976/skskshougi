package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.Locale;

public class zzl {
    protected final String mTag;
    private static boolean zzUT;
    private final boolean zzUU;
    private boolean zzUV;
    private boolean zzUW;
    private String zzUX;

    static {
        zzl.zzUT = false;
    }

    public zzl(String s) {
        this(s, false);
    }

    public zzl(String s, boolean z) {
        zzu.zzh(s, "The log tag cannot be null or empty.");
        this.mTag = s;
        this.zzUU = s.length() <= 23;
        this.zzUV = z;
        this.zzUW = false;
    }

    public void zzS(boolean z) {
        this.zzUV = z;
    }

    public void zza(String s, Object[] arr_object) {
        if(this.zzma()) {
            String s1 = this.zzg(s, arr_object);
            Log.v(this.mTag, s1);
        }
    }

    public void zzb(String s, Object[] arr_object) {
        if(this.zzlZ() || zzl.zzUT) {
            String s1 = this.zzg(s, arr_object);
            Log.d(this.mTag, s1);
        }
    }

    public void zzb(Throwable throwable0, String s, Object[] arr_object) {
        if(this.zzlZ() || zzl.zzUT) {
            String s1 = this.zzg(s, arr_object);
            Log.d(this.mTag, s1, throwable0);
        }
    }

    public void zzbJ(String s) {
        this.zzUX = TextUtils.isEmpty(s) ? null : String.format("[%s] ", s);
    }

    public void zzc(String s, Object[] arr_object) {
        String s1 = this.zzg(s, arr_object);
        Log.e(this.mTag, s1);
    }

    public void zzc(Throwable throwable0, String s, Object[] arr_object) {
        String s1 = this.zzg(s, arr_object);
        Log.w(this.mTag, s1, throwable0);
    }

    public void zze(String s, Object[] arr_object) {
        String s1 = this.zzg(s, arr_object);
        Log.i(this.mTag, s1);
    }

    public void zzf(String s, Object[] arr_object) {
        String s1 = this.zzg(s, arr_object);
        Log.w(this.mTag, s1);
    }

    protected String zzg(String s, Object[] arr_object) {
        if(arr_object.length == 0) {
            return TextUtils.isEmpty(this.zzUX) ? s : this.zzUX + s;
        }
        s = String.format(Locale.ROOT, s, arr_object);
        return TextUtils.isEmpty(this.zzUX) ? s : this.zzUX + s;
    }

    // 去混淆评级： 低(30)
    public boolean zzlZ() {
        return this.zzUV || this.zzUU && Log.isLoggable(this.mTag, 3);
    }

    public boolean zzma() {
        return this.zzUW;
    }

    public static boolean zzmb() [...] // Potential decryptor
}

