package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzgd;

@zzgd
public final class zzb {
    // 去混淆评级： 低(40)
    public static boolean zzL(int v) {
        return (v >= 5 || Log.isLoggable("Ads", v)) && (v != 2 || zzb.zzgx());
    }

    public static void zza(String s, Throwable throwable0) {
        if(zzb.zzL(3)) {
            Log.d("Ads", s, throwable0);
        }
    }

    public static void zzaA(String s) {
        if(zzb.zzL(4)) {
            Log.i("Ads", s);
        }
    }

    public static void zzaB(String s) {
        if(zzb.zzL(2)) {
            Log.v("Ads", s);
        }
    }

    public static void zzaC(String s) {
        if(zzb.zzL(5)) {
            Log.w("Ads", s);
        }
    }

    public static void zzay(String s) {
        if(zzb.zzL(3)) {
            Log.d("Ads", s);
        }
    }

    public static void zzaz(String s) {
        if(zzb.zzL(6)) {
            Log.e("Ads", s);
        }
    }

    public static void zzb(String s, Throwable throwable0) {
        if(zzb.zzL(6)) {
            Log.e("Ads", s, throwable0);
        }
    }

    public static void zzc(String s, Throwable throwable0) {
        if(zzb.zzL(4)) {
            Log.i("Ads", s, throwable0);
        }
    }

    public static void zzd(String s, Throwable throwable0) {
        if(zzb.zzL(5)) {
            Log.w("Ads", s, throwable0);
        }
    }

    public static boolean zzgx() {
        return ((Boolean)zzbz.zzut.get()).booleanValue();
    }
}

