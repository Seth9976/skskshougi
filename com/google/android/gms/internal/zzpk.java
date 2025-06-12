package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzi;

public class zzpk extends zzi {
    public zzpk(Context context0, Looper looper0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        super(context0, looper0, 45, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzdy(iBinder0);
    }

    public void zza(zzph zzph0, byte[] arr_b) throws RemoteException {
        ((zzpi)this.zznM()).zza(zzph0, arr_b);
    }

    protected zzpi zzdy(IBinder iBinder0) {
        return zza.zzdx(iBinder0);
    }
}

