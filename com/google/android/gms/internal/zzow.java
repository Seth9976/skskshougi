package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzi;

public class zzow extends zzi {
    public zzow(Context context0, Looper looper0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        super(context0, looper0, 3, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.panorama.internal.IPanoramaService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.panorama.service.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public IInterface zzT(IBinder iBinder0) {
        return this.zzdo(iBinder0);
    }

    public zzou zzdo(IBinder iBinder0) {
        return zza.zzdn(iBinder0);
    }
}

