package com.google.android.gms.appdatasearch;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zziv;

public final class zza {
    public static final ClientKey zzMO;
    private static final com.google.android.gms.common.api.Api.zza zzMP;
    public static final Api zzMQ;
    public static final zzk zzMR;

    static {
        zza.zzMO = new ClientKey();
        zza.zzMP = new com.google.android.gms.common.api.Api.zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzit zza(Context context0, Looper looper0, zze zze0, NoOptions api$ApiOptions$NoOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return new zzit(context0, looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
            }
        };
        zza.zzMQ = new Api("AppDataSearch.LIGHTWEIGHT_API", zza.zzMP, zza.zzMO, new Scope[0]);
        zza.zzMR = new zziv();
    }
}

