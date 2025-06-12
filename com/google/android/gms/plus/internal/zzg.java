package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.plus.PlusOneDummyView;

public final class zzg extends com.google.android.gms.dynamic.zzg {
    private static final zzg zzaHt;

    static {
        zzg.zzaHt = new zzg();
    }

    private zzg() {
        super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
    }

    public static View zza(Context context0, int v, int v1, String s, int v2) {
        try {
            if(s == null) {
                throw new NullPointerException();
            }
            return (View)zze.zzn(((zzc)zzg.zzaHt.zzak(context0)).zza(zze.zzw(context0), v, v1, s, v2));
        }
        catch(Exception unused_ex) {
            return new PlusOneDummyView(context0, v);
        }
    }

    @Override  // com.google.android.gms.dynamic.zzg
    protected Object zzd(IBinder iBinder0) {
        return this.zzdv(iBinder0);
    }

    protected zzc zzdv(IBinder iBinder0) {
        return zza.zzds(iBinder0);
    }
}

