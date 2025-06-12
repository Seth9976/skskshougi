package com.google.android.gms.safetynet;

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
import com.google.android.gms.internal.zzpj;
import com.google.android.gms.internal.zzpk;
import com.google.android.gms.internal.zzpl;

public final class SafetyNet {
    public static final Api API;
    public static final SafetyNetApi SafetyNetApi;
    public static final ClientKey zzNX;
    public static final zza zzNY;
    public static final zzb zzaJy;

    static {
        SafetyNet.zzNX = new ClientKey();
        SafetyNet.zzNY = new zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzpk zzt(Context context0, Looper looper0, zze zze0, NoOptions api$ApiOptions$NoOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return new zzpk(context0, looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
            }
        };
        SafetyNet.API = new Api("SafetyNet.API", SafetyNet.zzNY, SafetyNet.zzNX, new Scope[0]);
        SafetyNet.SafetyNetApi = new zzpj();
        SafetyNet.zzaJy = new zzpl();
    }
}

