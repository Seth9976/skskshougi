package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.wearable.internal.zzav;
import com.google.android.gms.wearable.internal.zzax;
import com.google.android.gms.wearable.internal.zzbi;
import com.google.android.gms.wearable.internal.zzbk;
import com.google.android.gms.wearable.internal.zzbm;
import com.google.android.gms.wearable.internal.zzt;
import com.google.android.gms.wearable.internal.zzu;

public class Wearable {
    public static final class WearableOptions implements Optional {
        public static class Builder {
            public WearableOptions build() {
                return new WearableOptions(this, null);
            }
        }

        private WearableOptions(Builder builder) {
        }

        WearableOptions(Builder x0, com.google.android.gms.wearable.Wearable.1 x1) {
            this(x0);
        }
    }

    public static final Api API;
    public static final CapabilityApi CapabilityApi;
    public static final ChannelApi ChannelApi;
    public static final DataApi DataApi;
    public static final MessageApi MessageApi;
    public static final NodeApi NodeApi;
    public static final ClientKey zzNX;
    private static final zza zzNY;
    public static final com.google.android.gms.wearable.zza zzaSZ;
    public static final zzd zzaTa;
    public static final zzg zzaTb;
    public static final zzi zzaTc;

    static {
        Wearable.DataApi = new zzu();
        Wearable.CapabilityApi = new com.google.android.gms.wearable.internal.zzg();
        Wearable.MessageApi = new zzav();
        Wearable.NodeApi = new zzax();
        Wearable.ChannelApi = new com.google.android.gms.wearable.internal.zzi();
        Wearable.zzaSZ = new com.google.android.gms.wearable.internal.zzd();
        Wearable.zzaTa = new zzt();
        Wearable.zzaTb = new zzbi();
        Wearable.zzaTc = new zzbm();
        Wearable.zzNX = new ClientKey();
        Wearable.zzNY = new zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzbk zza(Context context0, Looper looper0, zze zze0, WearableOptions wearable$WearableOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                if(wearable$WearableOptions0 != null) {
                    return new zzbk(context0, looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
                }
                new WearableOptions(new Builder(), null);
                return new zzbk(context0, looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
            }
        };
        Wearable.API = new Api("Wearable.API", Wearable.zzNY, Wearable.zzNX, new Scope[0]);
    }
}

