package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult;
import com.google.android.gms.drive.DrivePreferencesApi;
import com.google.android.gms.drive.FileUploadPreferences;

public class zzy implements DrivePreferencesApi {
    class zza extends zzd {
        private final zzb zzOs;
        final zzy zzafu;

        private zza(zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        zza(zzb zza$zzb0, com.google.android.gms.drive.internal.zzy.1 zzy$10) {
            this(zza$zzb0);
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zza(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse0) throws RemoteException {
            FileUploadPreferencesImpl fileUploadPreferencesImpl0 = onDeviceUsagePreferenceResponse0.zzpL();
            com.google.android.gms.drive.internal.zzy.zzb zzy$zzb0 = new com.google.android.gms.drive.internal.zzy.zzb(zzy.this, Status.zzXP, fileUploadPreferencesImpl0, null);
            this.zzOs.zzm(zzy$zzb0);
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zzt(Status status0) throws RemoteException {
            com.google.android.gms.drive.internal.zzy.zzb zzy$zzb0 = new com.google.android.gms.drive.internal.zzy.zzb(zzy.this, status0, null, null);
            this.zzOs.zzm(zzy$zzb0);
        }
    }

    class com.google.android.gms.drive.internal.zzy.zzb implements FileUploadPreferencesResult {
        private final Status zzOt;
        final zzy zzafu;
        private final FileUploadPreferences zzafw;

        private com.google.android.gms.drive.internal.zzy.zzb(Status status0, FileUploadPreferences fileUploadPreferences0) {
            this.zzOt = status0;
            this.zzafw = fileUploadPreferences0;
        }

        com.google.android.gms.drive.internal.zzy.zzb(Status status0, FileUploadPreferences fileUploadPreferences0, com.google.android.gms.drive.internal.zzy.1 zzy$10) {
            this(status0, fileUploadPreferences0);
        }

        @Override  // com.google.android.gms.drive.DrivePreferencesApi$FileUploadPreferencesResult
        public FileUploadPreferences getFileUploadPreferences() {
            return this.zzafw;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    abstract class zzc extends zzr {
        final zzy zzafu;

        public zzc(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return this.zzz(x0);
        }

        protected FileUploadPreferencesResult zzz(Status status0) {
            return new com.google.android.gms.drive.internal.zzy.zzb(zzy.this, status0, null, null);
        }
    }

    @Override  // com.google.android.gms.drive.DrivePreferencesApi
    public PendingResult getFileUploadPreferences(GoogleApiClient apiClient) {
        return apiClient.zza(new zzc(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zzd(new zza(zzy.this, this, null));
            }
        });
    }

    @Override  // com.google.android.gms.drive.DrivePreferencesApi
    public PendingResult setFileUploadPreferences(GoogleApiClient apiClient, FileUploadPreferences fileUploadPreferences) {
        if(!(fileUploadPreferences instanceof FileUploadPreferencesImpl)) {
            throw new IllegalArgumentException("Invalid preference value");
        }
        return apiClient.zzb(new com.google.android.gms.drive.internal.zzr.zza(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new SetFileUploadPreferencesRequest(((FileUploadPreferencesImpl)fileUploadPreferences)), new zzbq(this));
            }
        });
    }
}

