package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.purchase.zze;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzg;

@zzgd
public final class zzfl extends zzg {
    static final class zza extends Exception {
        public zza(String s) {
            super(s);
        }
    }

    private static final zzfl zzBb;

    static {
        zzfl.zzBb = new zzfl();
    }

    private zzfl() {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    protected zzfh zzR(IBinder iBinder0) {
        return com.google.android.gms.internal.zzfh.zza.zzO(iBinder0);
    }

    private static boolean zzc(Activity activity0) throws zza {
        Intent intent0 = activity0.getIntent();
        if(!intent0.hasExtra("com.google.android.gms.ads.internal.purchase.useClientJar")) {
            throw new zza("InAppPurchaseManager requires the useClientJar flag in intent extras.");
        }
        return intent0.getBooleanExtra("com.google.android.gms.ads.internal.purchase.useClientJar", false);
    }

    @Override  // com.google.android.gms.dynamic.zzg
    protected Object zzd(IBinder iBinder0) {
        return this.zzR(iBinder0);
    }

    public static zzfg zze(Activity activity0) {
        try {
            if(zzfl.zzc(activity0)) {
                zzb.zzay("Using AdOverlay from the client jar.");
                return new zze(activity0);
            }
            return zzfl.zzBb.zzf(activity0);
        }
        catch(zza zzfl$zza0) {
            zzb.zzaC(zzfl$zza0.getMessage());
            return null;
        }
    }

    private zzfg zzf(Activity activity0) {
        try {
            zzd zzd0 = com.google.android.gms.dynamic.zze.zzw(activity0);
            return com.google.android.gms.internal.zzfg.zza.zzN(((zzfh)this.zzak(activity0)).zzd(zzd0));
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not create remote InAppPurchaseManager.", remoteException0);
            return null;
        }
        catch(com.google.android.gms.dynamic.zzg.zza zzg$zza0) {
            zzb.zzd("Could not create remote InAppPurchaseManager.", zzg$zza0);
            return null;
        }
    }
}

