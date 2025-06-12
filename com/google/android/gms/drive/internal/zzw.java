package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder.DriveFileResult;
import com.google.android.gms.drive.DriveFolder.DriveFolderResult;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions.Builder;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.query.Filters;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SearchableField;

public class zzw extends zzz implements DriveFolder {
    static class zza extends zzd {
        private final zzb zzOs;

        public zza(zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zza(OnDriveIdResponse onDriveIdResponse0) throws RemoteException {
            zzu zzu0 = new zzu(onDriveIdResponse0.getDriveId());
            zzc zzw$zzc0 = new zzc(Status.zzXP, zzu0);
            this.zzOs.zzm(zzw$zzc0);
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zzt(Status status0) throws RemoteException {
            zzc zzw$zzc0 = new zzc(status0, null);
            this.zzOs.zzm(zzw$zzc0);
        }
    }

    static class com.google.android.gms.drive.internal.zzw.zzb extends zzd {
        private final zzb zzOs;

        public com.google.android.gms.drive.internal.zzw.zzb(zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zza(OnDriveIdResponse onDriveIdResponse0) throws RemoteException {
            zzw zzw0 = new zzw(onDriveIdResponse0.getDriveId());
            zze zzw$zze0 = new zze(Status.zzXP, zzw0);
            this.zzOs.zzm(zzw$zze0);
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zzt(Status status0) throws RemoteException {
            zze zzw$zze0 = new zze(status0, null);
            this.zzOs.zzm(zzw$zze0);
        }
    }

    static class zzc implements DriveFileResult {
        private final Status zzOt;
        private final DriveFile zzafr;

        public zzc(Status status0, DriveFile driveFile0) {
            this.zzOt = status0;
            this.zzafr = driveFile0;
        }

        @Override  // com.google.android.gms.drive.DriveFolder$DriveFileResult
        public DriveFile getDriveFile() {
            return this.zzafr;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static abstract class com.google.android.gms.drive.internal.zzw.zzd extends zzr {
        com.google.android.gms.drive.internal.zzw.zzd(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzx(x0);
        }

        public DriveFileResult zzx(Status status0) {
            return new zzc(status0, null);
        }
    }

    static class zze implements DriveFolderResult {
        private final Status zzOt;
        private final DriveFolder zzafs;

        public zze(Status status0, DriveFolder driveFolder0) {
            this.zzOt = status0;
            this.zzafs = driveFolder0;
        }

        @Override  // com.google.android.gms.drive.DriveFolder$DriveFolderResult
        public DriveFolder getDriveFolder() {
            return this.zzafs;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static abstract class zzf extends zzr {
        zzf(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzy(x0);
        }

        public DriveFolderResult zzy(Status status0) {
            return new zze(status0, null);
        }
    }

    public zzw(DriveId driveId0) {
        super(driveId0);
    }

    @Override  // com.google.android.gms.drive.DriveFolder
    public PendingResult createFile(GoogleApiClient apiClient, MetadataChangeSet changeSet, DriveContents driveContents) {
        return this.createFile(apiClient, changeSet, driveContents, null);
    }

    @Override  // com.google.android.gms.drive.DriveFolder
    public PendingResult createFile(GoogleApiClient apiClient, MetadataChangeSet changeSet, DriveContents driveContents, ExecutionOptions executionOptions) {
        if(executionOptions == null) {
            executionOptions = new Builder().build();
        }
        if(executionOptions.zzpk() != 0) {
            throw new IllegalStateException("May not set a conflict strategy for calls to createFile.");
        }
        return this.zza(apiClient, changeSet, driveContents, executionOptions);
    }

    @Override  // com.google.android.gms.drive.DriveFolder
    public PendingResult createFolder(GoogleApiClient apiClient, MetadataChangeSet changeSet) {
        if(changeSet == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        if(changeSet.getMimeType() != null && !changeSet.getMimeType().equals("application/vnd.google-apps.folder")) {
            throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
        }
        return apiClient.zzb(new zzf(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                Context context0 = zzs0.getContext();
                changeSet.zzpm().setContext(context0);
                zzs0.zzpB().zza(new CreateFolderRequest(zzw.this.getDriveId(), changeSet.zzpm()), new com.google.android.gms.drive.internal.zzw.zzb(this));
            }
        });
    }

    @Override  // com.google.android.gms.drive.DriveFolder
    public PendingResult listChildren(GoogleApiClient apiClient) {
        return this.queryChildren(apiClient, null);
    }

    @Override  // com.google.android.gms.drive.DriveFolder
    public PendingResult queryChildren(GoogleApiClient apiClient, Query query) {
        return new zzq().query(apiClient, this.zza(query));
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, MetadataChangeSet metadataChangeSet0, int v, int v1, ExecutionOptions executionOptions0) {
        ExecutionOptions.zza(googleApiClient0, executionOptions0);
        return googleApiClient0.zzb(new com.google.android.gms.drive.internal.zzw.zzd(googleApiClient0) {
            protected void zza(zzs zzs0) throws RemoteException {
                Context context0 = zzs0.getContext();
                metadataChangeSet0.zzpm().setContext(context0);
                CreateFileRequest createFileRequest0 = new CreateFileRequest(zzw.this.getDriveId(), metadataChangeSet0.zzpm(), v, v1, executionOptions0);
                zzs0.zzpB().zza(createFileRequest0, new zza(this));
            }
        });
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, MetadataChangeSet metadataChangeSet0, DriveContents driveContents0, ExecutionOptions executionOptions0) {
        int v;
        if(driveContents0 == null) {
            v = 1;
        }
        else {
            if(!(driveContents0 instanceof zzt)) {
                throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
            }
            if(driveContents0.getDriveId() != null) {
                throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
            }
            if(driveContents0.zzpg()) {
                throw new IllegalArgumentException("DriveContents are already closed.");
            }
            v = driveContents0.zzpe().getRequestId();
            driveContents0.zzpf();
        }
        if(metadataChangeSet0 == null) {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        if("application/vnd.google-apps.folder".equals(metadataChangeSet0.getMimeType())) {
            throw new IllegalArgumentException("May not create folders (mimetype: application/vnd.google-apps.folder) using this method. Use DriveFolder.createFolder() instead.");
        }
        return this.zza(googleApiClient0, metadataChangeSet0, v, 0, executionOptions0);
    }

    private Query zza(Query query0) {
        com.google.android.gms.drive.query.Query.Builder query$Builder0 = new com.google.android.gms.drive.query.Query.Builder();
        DriveId driveId0 = this.getDriveId();
        com.google.android.gms.drive.query.Query.Builder query$Builder1 = query$Builder0.addFilter(Filters.in(SearchableField.PARENTS, driveId0));
        if(query0 != null) {
            if(query0.getFilter() != null) {
                query$Builder1.addFilter(query0.getFilter());
            }
            query$Builder1.setPageToken(query0.getPageToken());
            query$Builder1.setSortOrder(query0.getSortOrder());
        }
        return query$Builder1.build();
    }
}

