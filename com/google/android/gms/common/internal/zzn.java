package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.zzoy;

public final class zzn {
    public static final int zzaaX;
    private static final String zzaaY;
    private final String zzaaZ;
    private final String zzaba;

    static {
        zzn.zzaaX = 15;
        zzn.zzaaY = null;
    }

    public zzn(String s) {
        this(s, zzn.zzaaY);
    }

    public zzn(String s, String s1) {
        zzu.zzb(s, "log tag cannot be null");
        zzu.zzb(s.length() <= 23, "tag \"%s\" is longer than the %d character maximum", new Object[]{s, 23});
        this.zzaaZ = s;
        if(s1 == null || s1.length() <= 0) {
            this.zzaba = zzn.zzaaY;
            return;
        }
        this.zzaba = s1;
    }

    public void zza(Context context0, String s, String s1, Throwable throwable0) {
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_stackTraceElement.length && v < 2; ++v) {
            stringBuilder0.append(arr_stackTraceElement[v].toString());
            stringBuilder0.append("\n");
        }
        zzoy zzoy0 = new zzoy(context0, 10);
        zzoy0.zza("GMS_WTF", null, new String[]{"GMS_WTF", stringBuilder0.toString()});
        zzoy0.send();
        if(this.zzbv(7)) {
            Log.e(s, this.zzch(s1), throwable0);
            Log.wtf(s, this.zzch(s1), throwable0);
        }
    }

    public void zza(String s, String s1, Throwable throwable0) {
        if(this.zzbv(4)) {
            Log.i(s, this.zzch(s1), throwable0);
        }
    }

    public void zzb(String s, String s1, Throwable throwable0) {
        if(this.zzbv(5)) {
            Log.w(s, this.zzch(s1), throwable0);
        }
    }

    public boolean zzbv(int v) {
        return Log.isLoggable(this.zzaaZ, v);
    }

    public void zzc(String s, String s1, Throwable throwable0) {
        if(this.zzbv(6)) {
            Log.e(s, this.zzch(s1), throwable0);
        }
    }

    private String zzch(String s) {
        return this.zzaba == null ? s : this.zzaba + s;
    }

    public void zzt(String s, String s1) {
        if(this.zzbv(3)) {
            Log.d(s, this.zzch(s1));
        }
    }

    public void zzu(String s, String s1) {
        if(this.zzbv(5)) {
            Log.w(s, this.zzch(s1));
        }
    }

    public void zzv(String s, String s1) {
        if(this.zzbv(6)) {
            Log.e(s, this.zzch(s1));
        }
    }
}

