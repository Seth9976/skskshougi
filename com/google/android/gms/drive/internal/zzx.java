package com.google.android.gms.drive.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzn;

public final class zzx {
    private static final zzn zzaft;

    static {
        zzx.zzaft = new zzn("GmsDrive");
    }

    public static void zza(String s, Throwable throwable0, String s1) {
        zzx.zzaft.zzc(s, s1, throwable0);
    }

    public static void zze(Context context0, String s, String s1) {
        zzx.zzaft.zza(context0, s, s1, new Throwable());
    }

    public static void zzt(String s, String s1) {
        zzx.zzaft.zzt(s, s1);
    }

    public static void zzu(String s, String s1) {
        zzx.zzaft.zzu(s, s1);
    }

    public static void zzv(String s, String s1) {
        zzx.zzaft.zzv(s, s1);
    }
}

