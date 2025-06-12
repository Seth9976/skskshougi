package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class zzk {
    private static final Object zzaaJ;
    private static zzk zzaaK;

    static {
        zzk.zzaaJ = new Object();
    }

    public abstract boolean zza(ComponentName arg1, ServiceConnection arg2, String arg3);

    public abstract boolean zza(String arg1, ServiceConnection arg2, String arg3);

    public static zzk zzah(Context context0) {
        synchronized(zzk.zzaaJ) {
            if(zzk.zzaaK == null) {
                zzk.zzaaK = new zzl(context0.getApplicationContext());
            }
            return zzk.zzaaK;
        }
    }

    public abstract void zzb(ComponentName arg1, ServiceConnection arg2, String arg3);

    public abstract void zzb(String arg1, ServiceConnection arg2, String arg3);
}

