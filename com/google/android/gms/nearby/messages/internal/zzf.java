package com.google.android.gms.nearby.messages.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;

class zzf extends zzi {
    private String zzOe;
    private String zzaGa;

    zzf(Context context0, Looper looper0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, zze zze0, com.google.android.gms.nearby.messages.zze zze1) {
        super(context0, looper0, 62, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
        this.zzOe = zze0.zzny();
        if(zze1 != null) {
            this.zzaGa = zze1.zzayp;
        }
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public boolean requiresAccount() {
        return true;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzdg(iBinder0);
    }

    protected zzc zzdg(IBinder iBinder0) {
        return zza.zzdf(iBinder0);
    }
}

