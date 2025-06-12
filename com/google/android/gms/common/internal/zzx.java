package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;

public final class zzx extends zzg {
    private static final zzx zzabe;

    static {
        zzx.zzabe = new zzx();
    }

    private zzx() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public zzr zzaJ(IBinder iBinder0) {
        return zza.zzaI(iBinder0);
    }

    public static View zzb(Context context0, int v, int v1) throws com.google.android.gms.dynamic.zzg.zza {
        return zzx.zzabe.zzc(context0, v, v1);
    }

    private View zzc(Context context0, int v, int v1) throws com.google.android.gms.dynamic.zzg.zza {
        try {
            zzd zzd0 = zze.zzw(context0);
            return (View)zze.zzn(((zzr)this.zzak(context0)).zza(zzd0, v, v1));
        }
        catch(Exception exception0) {
            throw new com.google.android.gms.dynamic.zzg.zza("Could not get button with size " + v + " and color " + v1, exception0);
        }
    }

    @Override  // com.google.android.gms.dynamic.zzg
    public Object zzd(IBinder iBinder0) {
        return this.zzaJ(iBinder0);
    }
}

