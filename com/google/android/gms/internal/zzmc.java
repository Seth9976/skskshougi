package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.Fitness;

public class zzmc extends zzlw {
    static abstract class zza extends com.google.android.gms.common.api.zza.zza {
        public zza(GoogleApiClient googleApiClient0) {
            super(Fitness.zzajB, googleApiClient0);
        }
    }

    public static class zzb implements com.google.android.gms.common.api.Api.zza {
        @Override  // com.google.android.gms.common.api.Api$zza
        public int getPriority() {
            return 0x7FFFFFFF;
        }

        @Override  // com.google.android.gms.common.api.Api$zza
        public Client zza(Context context0, Looper looper0, zze zze0, Object object0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            return this.zzm(context0, looper0, zze0, ((NoOptions)object0), googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        }

        public zzmc zzm(Context context0, Looper looper0, zze zze0, NoOptions api$ApiOptions$NoOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
            return new zzmc(context0, looper0, zze0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        }
    }

    static abstract class zzc extends zza {
        zzc(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return this.zzb(x0);
        }

        protected Status zzb(Status status0) {
            zzu.zzV(!status0.isSuccess());
            return status0;
        }
    }

    public zzmc(Context context0, Looper looper0, zze zze0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        super(context0, looper0, 55, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.fitness.SensorsApi";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzbn(iBinder0);
    }

    protected zzmn zzbn(IBinder iBinder0) {
        return com.google.android.gms.internal.zzmn.zza.zzby(iBinder0);
    }
}

