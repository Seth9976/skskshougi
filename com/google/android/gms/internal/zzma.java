package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zze;

public class zzma extends zzlw {
    public static class zza implements com.google.android.gms.common.api.Api.zza {
        @Override  // com.google.android.gms.common.api.Api$zza
        public int getPriority() {
            return 0x7FFFFFFF;
        }

        @Override  // com.google.android.gms.common.api.Api$zza
        public Client zza(Context context0, Looper looper0, zze zze0, Object object0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            return this.zzk(context0, looper0, zze0, ((NoOptions)object0), googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        }

        public zzma zzk(Context context0, Looper looper0, zze zze0, NoOptions api$ApiOptions$NoOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            return new zzma(context0, looper0, zze0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        }
    }

    public zzma(Context context0, Looper looper0, zze zze0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        super(context0, looper0, 61, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.fitness.internal.IGoogleFitInternalApi";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.fitness.InternalApi";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzbl(iBinder0);
    }

    protected zzml zzbl(IBinder iBinder0) {
        return com.google.android.gms.internal.zzml.zza.zzbw(iBinder0);
    }
}

