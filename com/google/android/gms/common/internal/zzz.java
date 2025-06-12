package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public class zzz extends zzi {
    private final zzb zzabf;

    public zzz(Context context0, Looper looper0, int v, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, zze zze0, zzb api$zzb0) {
        super(context0, looper0, v, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
        this.zzabf = api$zzb0;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return this.zzabf.getServiceDescriptor();
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return this.zzabf.getStartServiceAction();
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzabf.zzT(iBinder0);
    }
}

