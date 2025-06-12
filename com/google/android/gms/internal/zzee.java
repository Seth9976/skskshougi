package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Map;

@zzgd
public final class zzee extends zza {
    private Map zzyd;

    @Override  // com.google.android.gms.internal.zzef
    public zzeg zzY(String s) throws RemoteException {
        return this.zzaa(s);
    }

    @Override  // com.google.android.gms.internal.zzef
    public boolean zzZ(String s) throws RemoteException {
        try {
            Class class0 = Class.forName(s, false, zzee.class.getClassLoader());
            return CustomEvent.class.isAssignableFrom(class0);
        }
        catch(Throwable unused_ex) {
            zzb.zzaC(("Could not load custom event implementation class: " + s + ", assuming old implementation."));
            return false;
        }
    }

    private zzeg zzaa(String s) throws RemoteException {
        try {
            Class class0 = Class.forName(s, false, zzee.class.getClassLoader());
            if(MediationAdapter.class.isAssignableFrom(class0)) {
                MediationAdapter mediationAdapter0 = (MediationAdapter)class0.newInstance();
                return new zzel(mediationAdapter0, ((NetworkExtras)this.zzyd.get(mediationAdapter0.getAdditionalParametersType())));
            }
            if(com.google.android.gms.ads.mediation.MediationAdapter.class.isAssignableFrom(class0)) {
                return new zzej(((com.google.android.gms.ads.mediation.MediationAdapter)class0.newInstance()));
            }
            zzb.zzaC(("Could not instantiate mediation adapter: " + s + " (not a valid adapter)."));
            throw new RemoteException();
        }
        catch(Throwable throwable0) {
            zzb.zzaC(("Could not instantiate mediation adapter: " + s + ". " + throwable0.getMessage()));
            throw new RemoteException();
        }
    }

    public void zzf(Map map0) {
        this.zzyd = map0;
    }
}

