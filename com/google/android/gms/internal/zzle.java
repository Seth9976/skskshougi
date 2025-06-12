package com.google.android.gms.internal;

import android.content.res.Configuration;
import android.content.res.Resources;

public final class zzle {
    // 去混淆评级： 低(20)
    public static boolean zzb(Resources resources0) {
        if(resources0 == null) {
            return false;
        }
        return (resources0.getConfiguration().screenLayout & 15) <= 3 ? zzle.zzc(resources0) : true;
    }

    private static boolean zzc(Resources resources0) {
        Configuration configuration0 = resources0.getConfiguration();
        return (configuration0.screenLayout & 15) <= 3 && configuration0.smallestScreenWidthDp >= 600;
    }
}

