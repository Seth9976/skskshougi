package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zza;
import com.google.android.gms.drive.Drive;

public abstract class zzr extends zza {
    public static abstract class com.google.android.gms.drive.internal.zzr.zza extends zzr {
        public com.google.android.gms.drive.internal.zzr.zza(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return x0;
        }

        protected Status zzb(Status status0) [...] // Inlined contents
    }

    public zzr(GoogleApiClient googleApiClient0) {
        super(Drive.zzNX, googleApiClient0);
    }
}

