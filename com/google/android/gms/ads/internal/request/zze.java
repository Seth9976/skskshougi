package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.internal.zzgd;

@zzgd
public class zze extends zzi {
    final int zzCk;

    public zze(Context context0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, int v) {
        super(context0, context0.getMainLooper(), 8, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        this.zzCk = v;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    protected com.google.android.gms.ads.internal.request.zzi zzS(IBinder iBinder0) {
        return zza.zzU(iBinder0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzS(iBinder0);
    }

    public com.google.android.gms.ads.internal.request.zzi zzfy() throws DeadObjectException {
        return (com.google.android.gms.ads.internal.request.zzi)super.zznM();
    }
}

