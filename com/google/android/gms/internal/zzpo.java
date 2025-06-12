package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;

public class zzpo extends zzi {
    public zzpo(Context context0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, zze zze0) {
        super(context0, context0.getMainLooper(), 73, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.search.internal.ISearchAuthService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.search.service.SEARCH_AUTH_START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzdB(iBinder0);
    }

    protected zzpn zzdB(IBinder iBinder0) {
        return zza.zzdA(iBinder0);
    }
}

