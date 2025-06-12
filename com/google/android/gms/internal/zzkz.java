package com.google.android.gms.internal;

import android.content.Context;
import java.util.regex.Pattern;

public final class zzkz {
    private static Pattern zzacJ;

    static {
        zzkz.zzacJ = null;
    }

    public static boolean zzai(Context context0) {
        return context0.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int zzbN(int v) [...] // Inlined contents

    public static int zzbO(int v) {
        return v % 1000 / 100;
    }

    public static boolean zzbP(int v) {
        return zzkz.zzbO(v) == 3;
    }
}

