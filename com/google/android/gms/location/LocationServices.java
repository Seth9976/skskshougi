package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.internal.zzd;
import com.google.android.gms.location.internal.zzj;
import com.google.android.gms.location.internal.zzo;

public class LocationServices {
    public static abstract class zza extends com.google.android.gms.common.api.zza.zza {
        public zza(GoogleApiClient googleApiClient0) {
            super(LocationServices.zzNX, googleApiClient0);
        }
    }

    public static final Api API;
    public static final FusedLocationProviderApi FusedLocationApi;
    public static final GeofencingApi GeofencingApi;
    public static final SettingsApi SettingsApi;
    private static final ClientKey zzNX;
    private static final com.google.android.gms.common.api.Api.zza zzNY;

    static {
        LocationServices.zzNX = new ClientKey();
        LocationServices.zzNY = new com.google.android.gms.common.api.Api.zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzj zzo(Context context0, Looper looper0, zze zze0, NoOptions api$ApiOptions$NoOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return new zzj(context0, looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, "locationServices", zze0);
            }
        };
        LocationServices.API = new Api("LocationServices.API", LocationServices.zzNY, LocationServices.zzNX, new Scope[0]);
        LocationServices.FusedLocationApi = new zzd();
        LocationServices.GeofencingApi = new com.google.android.gms.location.internal.zze();
        LocationServices.SettingsApi = new zzo();
    }

    public static zzj zze(GoogleApiClient googleApiClient0) {
        boolean z = true;
        zzu.zzb(googleApiClient0 != null, "GoogleApiClient parameter is required.");
        zzj zzj0 = (zzj)googleApiClient0.zza(LocationServices.zzNX);
        if(zzj0 == null) {
            z = false;
        }
        zzu.zza(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zzj0;
    }
}

