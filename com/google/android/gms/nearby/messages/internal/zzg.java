package com.google.android.gms.nearby.messages.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.nearby.messages.zzc;

public class zzg implements zzc {
    public static final ClientKey zzNX;
    public static final zza zzNY;

    static {
        zzg.zzNX = new ClientKey();
        zzg.zzNY = new zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzf zza(Context context0, Looper looper0, zze zze0, com.google.android.gms.nearby.messages.zze zze1, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return new zzf(context0, looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0, zze1);
            }
        };
    }
}

