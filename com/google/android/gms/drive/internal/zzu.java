package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.zzi.zzb;
import com.google.android.gms.common.api.zzi;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveId;

public class zzu extends zzz implements DriveFile {
    static class zza implements DownloadProgressListener {
        private final zzi zzafi;

        public zza(zzi zzi0) {
            this.zzafi = zzi0;
        }

        @Override  // com.google.android.gms.drive.DriveFile$DownloadProgressListener
        public void onProgress(long bytesDownloaded, long bytesExpected) {
            com.google.android.gms.drive.internal.zzu.zza.1 zzu$zza$10 = new zzb() {
                public void zza(DownloadProgressListener driveFile$DownloadProgressListener0) {
                    driveFile$DownloadProgressListener0.onProgress(bytesDownloaded, bytesExpected);
                }

                @Override  // com.google.android.gms.common.api.zzi$zzb
                public void zzmw() {
                }
            };
            this.zzafi.zza(zzu$zza$10);
        }
    }

    public zzu(DriveId driveId0) {
        super(driveId0);
    }

    @Override  // com.google.android.gms.drive.DriveFile
    public PendingResult open(GoogleApiClient apiClient, int mode, DownloadProgressListener listener) {
        if(mode != 0x10000000 && mode != 0x20000000 && mode != 0x30000000) {
            throw new IllegalArgumentException("Invalid mode provided.");
        }
        return apiClient.zza(new com.google.android.gms.drive.internal.zzq.zzb(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                this.setCancelToken(zzs0.zzpB().zza(new OpenContentsRequest(zzu.this.getDriveId(), mode, 0), new zzbi(this, zzu.zza(apiClient, listener))).zzpF());
            }
        });
    }

    private static DownloadProgressListener zza(GoogleApiClient googleApiClient0, DownloadProgressListener driveFile$DownloadProgressListener0) {
        return driveFile$DownloadProgressListener0 == null ? null : new zza(googleApiClient0.zzo(driveFile$DownloadProgressListener0));
    }
}

