package com.google.android.gms.location.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;

public class zzb extends zzi {
    protected final zzn zzayq;
    private final String zzayw;

    public zzb(Context context0, Looper looper0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, String s, zze zze0) {
        super(context0, looper0, 23, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
        this.zzayq = new zzn() {
            @Override  // com.google.android.gms.location.internal.zzn
            public void zznL() {
                zzb.this.zznL();
            }

            public zzg zzut() throws DeadObjectException {
                return (zzg)zzb.this.zznM();
            }
        };
        this.zzayw = s;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzbU(iBinder0);
    }

    protected zzg zzbU(IBinder iBinder0) {
        return zza.zzbW(iBinder0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected Bundle zzkR() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("client_name", this.zzayw);
        return bundle0;
    }
}

