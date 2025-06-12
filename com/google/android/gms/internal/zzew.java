package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;

@zzgd
public final class zzew extends zzg {
    static final class zza extends Exception {
        public zza(String s) {
            super(s);
        }
    }

    private static final zzew zzAr;

    static {
        zzew.zzAr = new zzew();
    }

    private zzew() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    protected zzey zzH(IBinder iBinder0) {
        return com.google.android.gms.internal.zzey.zza.zzJ(iBinder0);
    }

    public static zzex zzb(Activity activity0) {
        try {
            if(zzew.zzc(activity0)) {
                zzb.zzay("Using AdOverlay from the client jar.");
                return new zzc(activity0);
            }
            return zzew.zzAr.zzd(activity0);
        }
        catch(zza zzew$zza0) {
            zzb.zzaC(zzew$zza0.getMessage());
            return null;
        }
    }

    private static boolean zzc(Activity activity0) throws zza {
        Intent intent0 = activity0.getIntent();
        if(!intent0.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            throw new zza("Ad overlay requires the useClientJar flag in intent extras.");
        }
        return intent0.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
    }

    private zzex zzd(Activity activity0) {
        try {
            zzd zzd0 = zze.zzw(activity0);
            return com.google.android.gms.internal.zzex.zza.zzI(((zzey)this.zzak(activity0)).zzc(zzd0));
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not create remote AdOverlay.", remoteException0);
            return null;
        }
        catch(com.google.android.gms.dynamic.zzg.zza zzg$zza0) {
            zzb.zzd("Could not create remote AdOverlay.", zzg$zza0);
            return null;
        }
    }

    @Override  // com.google.android.gms.dynamic.zzg
    protected Object zzd(IBinder iBinder0) {
        return this.zzH(iBinder0);
    }
}

