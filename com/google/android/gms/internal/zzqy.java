package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.zzc;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg.zza;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public class zzqy extends zzg {
    private static zzqy zzaSv;

    protected zzqy() {
        super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
    }

    private static zzqy zzAM() {
        if(zzqy.zzaSv == null) {
            zzqy.zzaSv = new zzqy();
        }
        return zzqy.zzaSv;
    }

    public static zzqq zza(Activity activity0, zzc zzc0, WalletFragmentOptions walletFragmentOptions0, zzqr zzqr0) throws GooglePlayServicesNotAvailableException {
        int v = GooglePlayServicesUtil.isGooglePlayServicesAvailable(activity0);
        if(v != 0) {
            throw new GooglePlayServicesNotAvailableException(v);
        }
        try {
            return ((zzqt)zzqy.zzAM().zzak(activity0)).zza(zze.zzw(activity0), zzc0, walletFragmentOptions0, zzqr0);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeException(remoteException0);
        }
        catch(zza zzg$zza0) {
            throw new RuntimeException(zzg$zza0);
        }
    }

    @Override  // com.google.android.gms.dynamic.zzg
    protected Object zzd(IBinder iBinder0) {
        return this.zzdM(iBinder0);
    }

    protected zzqt zzdM(IBinder iBinder0) {
        return com.google.android.gms.internal.zzqt.zza.zzdI(iBinder0);
    }
}

