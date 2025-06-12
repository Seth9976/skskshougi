package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;

class zzbi extends zzd {
    private final zzb zzOs;
    private final DownloadProgressListener zzags;

    zzbi(zzb zza$zzb0, DownloadProgressListener driveFile$DownloadProgressListener0) {
        this.zzOs = zza$zzb0;
        this.zzags = driveFile$DownloadProgressListener0;
    }

    @Override  // com.google.android.gms.drive.internal.zzd
    public void zza(OnContentsResponse onContentsResponse0) throws RemoteException {
        zza zzq$zza0 = new zza((onContentsResponse0.zzpK() ? new Status(-1) : Status.zzXP), new zzt(onContentsResponse0.zzpJ()));
        this.zzOs.zzm(zzq$zza0);
    }

    @Override  // com.google.android.gms.drive.internal.zzd
    public void zza(OnDownloadProgressResponse onDownloadProgressResponse0) throws RemoteException {
        if(this.zzags != null) {
            this.zzags.onProgress(onDownloadProgressResponse0.zzpM(), onDownloadProgressResponse0.zzpN());
        }
    }

    @Override  // com.google.android.gms.drive.internal.zzd
    public void zzt(Status status0) throws RemoteException {
        zza zzq$zza0 = new zza(status0, null);
        this.zzOs.zzm(zzq$zza0);
    }
}

