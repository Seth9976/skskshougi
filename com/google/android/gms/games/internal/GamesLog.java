package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.zzn;

public final class GamesLog {
    private static final zzn zzaft;

    static {
        GamesLog.zzaft = new zzn("Games");
    }

    public static void zza(String s, String s1, Throwable throwable0) {
        GamesLog.zzaft.zza(s, s1, throwable0);
    }

    public static void zzb(String s, String s1, Throwable throwable0) {
        GamesLog.zzaft.zzb(s, s1, throwable0);
    }

    public static void zzu(String s, String s1) {
        GamesLog.zzaft.zzu(s, s1);
    }

    public static void zzv(String s, String s1) {
        GamesLog.zzaft.zzv(s, s1);
    }
}

