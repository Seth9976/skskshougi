package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;

public class zzjg extends zzi {
    public zzjg(Context context0, Looper looper0, zze zze0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        super(context0, looper0, 74, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.auth.api.accountstatus.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzam(iBinder0);
    }

    protected zzji zzam(IBinder iBinder0) {
        return zza.zzao(iBinder0);
    }
}

