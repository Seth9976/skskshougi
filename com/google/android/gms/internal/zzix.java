package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;

public class zzix extends zzi {
    private final String zzOd;
    private final String zzOe;

    public zzix(Context context0, Looper looper0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, zze zze0) {
        super(context0, looper0, 77, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
        this.zzOd = zze0.zznz();
        this.zzOe = zze0.zzny();
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.appinvite.internal.IAppInviteService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.appinvite.service.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzag(iBinder0);
    }

    public void zza(zziy zziy0, String s) {
        try {
            ((zziz)this.zznM()).zza(zziy0, s);
        }
        catch(RemoteException unused_ex) {
        }
    }

    protected zziz zzag(IBinder iBinder0) {
        return zza.zzai(iBinder0);
    }

    public void zzb(zziy zziy0, String s) {
        try {
            ((zziz)this.zznM()).zzb(zziy0, s);
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String zzkQ() {
        return this.zzOd;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected Bundle zzkR() {
        return this.zzkS();
    }

    private Bundle zzkS() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("authPackage", this.zzOe);
        return bundle0;
    }
}

