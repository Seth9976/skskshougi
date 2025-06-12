package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

@Deprecated
public class zzae {
    private static volatile Logger zzMk;

    static {
        zzae.setLogger(new zzs());
    }

    public static Logger getLogger() {
        return zzae.zzMk;
    }

    public static void setLogger(Logger logger) {
        zzae.zzMk = logger;
    }

    public static boolean zzL(int v) {
        return zzae.getLogger() != null && zzae.getLogger().getLogLevel() <= v;
    }

    public static void zzaA(String s) {
        zzaf zzaf0 = zzaf.zzkc();
        if(zzaf0 != null) {
            zzaf0.zzaV(s);
        }
        else if(zzae.zzL(1)) {
            Log.i("GAv4", s);
        }
        Logger logger0 = zzae.zzMk;
        if(logger0 != null) {
            logger0.info(s);
        }
    }

    public static void zzaB(String s) {
        zzaf zzaf0 = zzaf.zzkc();
        if(zzaf0 != null) {
            zzaf0.zzaT(s);
        }
        else if(zzae.zzL(0)) {
            Log.v("GAv4", s);
        }
        Logger logger0 = zzae.zzMk;
        if(logger0 != null) {
            logger0.verbose(s);
        }
    }

    public static void zzaC(String s) {
        zzaf zzaf0 = zzaf.zzkc();
        if(zzaf0 != null) {
            zzaf0.zzaW(s);
        }
        else if(zzae.zzL(2)) {
            Log.w("GAv4", s);
        }
        Logger logger0 = zzae.zzMk;
        if(logger0 != null) {
            logger0.warn(s);
        }
    }

    public static void zzf(String s, Object object0) {
        zzaf zzaf0 = zzaf.zzkc();
        if(zzaf0 != null) {
            zzaf0.zze(s, object0);
        }
        else if(zzae.zzL(3)) {
            Log.e("GAv4", (object0 == null ? s : s + ":" + object0));
        }
        Logger logger0 = zzae.zzMk;
        if(logger0 != null) {
            logger0.error(s);
        }
    }
}

