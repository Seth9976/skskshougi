package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.CreateFileActivityBuilder;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveApi.DriveIdResult;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.OpenFileActivityBuilder;
import com.google.android.gms.drive.query.Query;
import java.util.List;

public class zzq implements DriveApi {
    static class zza implements Releasable, DriveContentsResult {
        private final Status zzOt;
        private final DriveContents zzacW;

        public zza(Status status0, DriveContents driveContents0) {
            this.zzOt = status0;
            this.zzacW = driveContents0;
        }

        @Override  // com.google.android.gms.drive.DriveApi$DriveContentsResult
        public DriveContents getDriveContents() {
            return this.zzacW;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }

        @Override  // com.google.android.gms.common.api.Releasable
        public void release() {
            if(this.zzacW != null) {
                this.zzacW.zzpf();
            }
        }
    }

    static abstract class zzb extends zzr {
        zzb(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzu(x0);
        }

        public DriveContentsResult zzu(Status status0) {
            return new zza(status0, null);
        }
    }

    static class zzc extends zzd {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zza(OnDriveIdResponse onDriveIdResponse0) throws RemoteException {
            DriveId driveId0 = onDriveIdResponse0.getDriveId();
            com.google.android.gms.drive.internal.zzq.zzd zzq$zzd0 = new com.google.android.gms.drive.internal.zzq.zzd(Status.zzXP, driveId0);
            this.zzOs.zzm(zzq$zzd0);
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zza(OnMetadataResponse onMetadataResponse0) throws RemoteException {
            DriveId driveId0 = new zzn(onMetadataResponse0.zzpS()).getDriveId();
            com.google.android.gms.drive.internal.zzq.zzd zzq$zzd0 = new com.google.android.gms.drive.internal.zzq.zzd(Status.zzXP, driveId0);
            this.zzOs.zzm(zzq$zzd0);
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zzt(Status status0) throws RemoteException {
            com.google.android.gms.drive.internal.zzq.zzd zzq$zzd0 = new com.google.android.gms.drive.internal.zzq.zzd(status0, null);
            this.zzOs.zzm(zzq$zzd0);
        }
    }

    static class com.google.android.gms.drive.internal.zzq.zzd implements DriveIdResult {
        private final Status zzOt;
        private final DriveId zzacT;

        public com.google.android.gms.drive.internal.zzq.zzd(Status status0, DriveId driveId0) {
            this.zzOt = status0;
            this.zzacT = driveId0;
        }

        @Override  // com.google.android.gms.drive.DriveApi$DriveIdResult
        public DriveId getDriveId() {
            return this.zzacT;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static abstract class zze extends zzr {
        zze(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzv(x0);
        }

        public DriveIdResult zzv(Status status0) {
            return new com.google.android.gms.drive.internal.zzq.zzd(status0, null);
        }
    }

    static class zzf implements MetadataBufferResult {
        private final Status zzOt;
        private final MetadataBuffer zzaeK;
        private final boolean zzaeL;

        public zzf(Status status0, MetadataBuffer metadataBuffer0, boolean z) {
            this.zzOt = status0;
            this.zzaeK = metadataBuffer0;
            this.zzaeL = z;
        }

        @Override  // com.google.android.gms.drive.DriveApi$MetadataBufferResult
        public MetadataBuffer getMetadataBuffer() {
            return this.zzaeK;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }

        @Override  // com.google.android.gms.common.api.Releasable
        public void release() {
            if(this.zzaeK != null) {
                this.zzaeK.release();
            }
        }
    }

    static abstract class zzg extends zzr {
        zzg(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzw(x0);
        }

        public MetadataBufferResult zzw(Status status0) {
            return new zzf(status0, null, false);
        }
    }

    static class zzh extends zzd {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public zzh(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zza(OnContentsResponse onContentsResponse0) throws RemoteException {
            zzt zzt0 = new zzt(onContentsResponse0.zzpJ());
            zza zzq$zza0 = new zza(Status.zzXP, zzt0);
            this.zzOs.zzm(zzq$zza0);
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zzt(Status status0) throws RemoteException {
            zza zzq$zza0 = new zza(status0, null);
            this.zzOs.zzm(zzq$zza0);
        }
    }

    static class zzi extends zzd {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public zzi(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zza(OnListEntriesResponse onListEntriesResponse0) throws RemoteException {
            MetadataBuffer metadataBuffer0 = new MetadataBuffer(onListEntriesResponse0.zzpP());
            zzf zzq$zzf0 = new zzf(Status.zzXP, metadataBuffer0, onListEntriesResponse0.zzpQ());
            this.zzOs.zzm(zzq$zzf0);
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zzt(Status status0) throws RemoteException {
            zzf zzq$zzf0 = new zzf(status0, null, false);
            this.zzOs.zzm(zzq$zzf0);
        }
    }

    static class zzj extends com.google.android.gms.drive.internal.zzr.zza {
        zzj(GoogleApiClient googleApiClient0, Status status0) {
            super(googleApiClient0);
            this.setResult(status0);
        }

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
        }

        protected void zza(zzs zzs0) {
        }
    }

    @Override  // com.google.android.gms.drive.DriveApi
    public PendingResult cancelPendingActions(GoogleApiClient apiClient, List list0) {
        return ((zzs)apiClient.zza(Drive.zzNX)).cancelPendingActions(apiClient, list0);
    }

    @Override  // com.google.android.gms.drive.DriveApi
    public PendingResult fetchDriveId(GoogleApiClient apiClient, String resourceId) {
        return apiClient.zza(new zze(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new GetMetadataRequest(DriveId.zzcs(resourceId), false), new zzc(this));
            }
        });
    }

    @Override  // com.google.android.gms.drive.DriveApi
    public DriveFolder getAppFolder(GoogleApiClient apiClient) {
        if(!apiClient.isConnected()) {
            throw new IllegalStateException("Client must be connected");
        }
        DriveId driveId0 = ((zzs)apiClient.zza(Drive.zzNX)).zzpD();
        return driveId0 != null ? new zzw(driveId0) : null;
    }

    @Override  // com.google.android.gms.drive.DriveApi
    public DriveFile getFile(GoogleApiClient apiClient, DriveId driveId) {
        if(driveId == null) {
            throw new IllegalArgumentException("Id must be provided.");
        }
        if(!apiClient.isConnected()) {
            throw new IllegalStateException("Client must be connected");
        }
        return new zzu(driveId);
    }

    @Override  // com.google.android.gms.drive.DriveApi
    public DriveFolder getFolder(GoogleApiClient apiClient, DriveId driveId) {
        if(driveId == null) {
            throw new IllegalArgumentException("Id must be provided.");
        }
        if(!apiClient.isConnected()) {
            throw new IllegalStateException("Client must be connected");
        }
        return new zzw(driveId);
    }

    @Override  // com.google.android.gms.drive.DriveApi
    public DriveFolder getRootFolder(GoogleApiClient apiClient) {
        if(!apiClient.isConnected()) {
            throw new IllegalStateException("Client must be connected");
        }
        return new zzw(((zzs)apiClient.zza(Drive.zzNX)).zzpC());
    }

    @Override  // com.google.android.gms.drive.DriveApi
    public CreateFileActivityBuilder newCreateFileActivityBuilder() {
        return new CreateFileActivityBuilder();
    }

    @Override  // com.google.android.gms.drive.DriveApi
    public PendingResult newDriveContents(GoogleApiClient apiClient) {
        return this.zza(apiClient, 0x20000000);
    }

    @Override  // com.google.android.gms.drive.DriveApi
    public OpenFileActivityBuilder newOpenFileActivityBuilder() {
        return new OpenFileActivityBuilder();
    }

    @Override  // com.google.android.gms.drive.DriveApi
    public PendingResult query(GoogleApiClient apiClient, Query query) {
        if(query == null) {
            throw new IllegalArgumentException("Query must be provided.");
        }
        return apiClient.zza(new zzg(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new QueryRequest(query), new zzi(this));
            }
        });
    }

    @Override  // com.google.android.gms.drive.DriveApi
    public PendingResult requestSync(GoogleApiClient apiClient) {
        return apiClient.zzb(new com.google.android.gms.drive.internal.zzr.zza(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new zzbq(this));
            }
        });
    }

    public PendingResult zza(GoogleApiClient googleApiClient0, int v) {
        return googleApiClient0.zza(new zzb(googleApiClient0) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new CreateContentsRequest(v), new zzh(this));
            }
        });
    }
}

