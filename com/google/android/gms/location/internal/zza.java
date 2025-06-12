package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionApi;

public class zza implements ActivityRecognitionApi {
    static abstract class com.google.android.gms.location.internal.zza.zza extends com.google.android.gms.location.ActivityRecognition.zza {
        public com.google.android.gms.location.internal.zza.zza(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return x0;
        }

        public Status zzb(Status status0) [...] // Inlined contents
    }

    @Override  // com.google.android.gms.location.ActivityRecognitionApi
    public PendingResult removeActivityUpdates(GoogleApiClient client, PendingIntent callbackIntent) {
        return client.zzb(new com.google.android.gms.location.internal.zza.zza(client) {
            protected void zza(zzj zzj0) throws RemoteException {
                zzj0.zza(callbackIntent);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.location.ActivityRecognitionApi
    public PendingResult requestActivityUpdates(GoogleApiClient client, long detectionIntervalMillis, PendingIntent callbackIntent) {
        return client.zzb(new com.google.android.gms.location.internal.zza.zza(client) {
            protected void zza(zzj zzj0) throws RemoteException {
                zzj0.zza(detectionIntervalMillis, callbackIntent);
                this.setResult(Status.zzXP);
            }
        });
    }
}

