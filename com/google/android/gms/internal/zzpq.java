package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.signin.internal.zzg;
import com.google.android.gms.signin.internal.zzh;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class zzpq {
    public static final Api API;
    public static final ClientKey zzNX;
    public static final zza zzNY;
    static final zza zzaJO;
    public static final zzpr zzaJP;
    public static final Api zzada;
    public static final ClientKey zzajz;

    static {
        zzpq.zzNX = new ClientKey();
        zzpq.zzajz = new ClientKey();
        zzpq.zzNY = new zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzh zza(Context context0, Looper looper0, zze zze0, zzpt zzpt0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return zzpt0 == null ? new zzh(context0, looper0, true, zze0, zzpt.zzaJQ, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, Executors.newSingleThreadExecutor()) : new zzh(context0, looper0, true, zze0, zzpt0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, Executors.newSingleThreadExecutor());
            }
        };
        zzpq.zzaJO = new zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzh zzv(Context context0, Looper looper0, zze zze0, NoOptions api$ApiOptions$NoOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                ExecutorService executorService0 = Executors.newSingleThreadExecutor();
                return new zzh(context0, looper0, false, zze0, zzpt.zzaJQ, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, executorService0);
            }
        };
        zzpq.API = new Api("SignIn.API", zzpq.zzNY, zzpq.zzNX, new Scope[0]);
        zzpq.zzada = new Api("SignIn.INTERNAL_API", zzpq.zzaJO, zzpq.zzajz, new Scope[0]);
        zzpq.zzaJP = new zzg();
    }
}

