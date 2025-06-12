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
import com.google.android.gms.location.internal.zzj;

public class ActivityRecognition {
    public static abstract class zza extends com.google.android.gms.common.api.zza.zza {
        public zza(GoogleApiClient googleApiClient0) {
            super(ActivityRecognition.zzNX, googleApiClient0);
        }
    }

    public static final Api API = null;
    public static final ActivityRecognitionApi ActivityRecognitionApi = null;
    public static final String CLIENT_NAME = "activity_recognition";
    private static final ClientKey zzNX;
    private static final com.google.android.gms.common.api.Api.zza zzNY;

    static {
        ActivityRecognition.zzNX = new ClientKey();
        ActivityRecognition.zzNY = new com.google.android.gms.common.api.Api.zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzj zzo(Context context0, Looper looper0, zze zze0, NoOptions api$ApiOptions$NoOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return new zzj(context0, looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, "activity_recognition");
            }
        };
        ActivityRecognition.API = new Api("ActivityRecognition.API", ActivityRecognition.zzNY, ActivityRecognition.zzNX, new Scope[0]);
        ActivityRecognition.ActivityRecognitionApi = new com.google.android.gms.location.internal.zza();
    }
}

