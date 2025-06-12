package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzi;

public class zzkp extends zzi {
    public zzkp(Context context0, Looper looper0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        super(context0, looper0, 39, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public String getStartServiceAction() {
        return "com.google.android.gms.common.service.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzaK(iBinder0);
    }

    protected zzkr zzaK(IBinder iBinder0) {
        return zza.zzaM(iBinder0);
    }
}

