package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.math.BigInteger;
import java.util.Locale;

@zzgd
public final class zzhg {
    private static zzcb zzFX;
    private static String zzFY;
    private static final Object zzoW;

    static {
        zzhg.zzoW = new Object();
    }

    public static String zza(Context context0, String s, String s1) {
        synchronized(zzhg.zzoW) {
            if(zzhg.zzFY == null && !TextUtils.isEmpty(s)) {
                zzhg.zzb(context0, s, s1);
            }
            return zzhg.zzFY;
        }
    }

    private static void zzb(Context context0, String s, String s1) {
        try {
            ClassLoader classLoader0 = context0.createPackageContext(s1, 3).getClassLoader();
            Class class0 = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader0);
        }
        catch(Throwable unused_ex) {
            zzhg.zzFY = "err";
            return;
        }
        BigInteger bigInteger0 = new BigInteger(new byte[1]);
        String[] arr_s = s.split(",");
        BigInteger bigInteger1 = bigInteger0;
        for(int v = 0; v < arr_s.length; ++v) {
            if(zzo.zzbv().zza(classLoader0, class0, arr_s[v])) {
                bigInteger1 = bigInteger1.setBit(v);
            }
        }
        zzhg.zzFY = String.format(Locale.US, "%X", bigInteger1);
    }

    public static void zze(Context context0, String s) {
        synchronized(zzhg.zzoW) {
            if(zzhg.zzFX == null) {
                zzca zzca0 = new zzca();
                zzca0.zzb(context0, s);
                try {
                    zzhg.zzFX = zzo.zzbA().zzb(zzca0);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    zzb.zzaC(("Cannot initialize CSI reporter." + illegalArgumentException0.getMessage()));
                }
            }
        }
    }

    public static zzcb zzfY() {
        synchronized(zzhg.zzoW) {
        }
        return zzhg.zzFX;
    }

    public static String zzgh() {
        synchronized(zzhg.zzoW) {
        }
        return zzhg.zzFY;
    }
}

