package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions.Builder;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.internal.zzlg;
import java.io.InputStream;
import java.io.OutputStream;

public class zzt implements DriveContents {
    private boolean mClosed;
    private final Contents zzafa;
    private boolean zzafb;
    private boolean zzafc;

    public zzt(Contents contents0) {
        this.mClosed = false;
        this.zzafb = false;
        this.zzafc = false;
        this.zzafa = (Contents)zzu.zzu(contents0);
    }

    @Override  // com.google.android.gms.drive.DriveContents
    public PendingResult commit(GoogleApiClient apiClient, MetadataChangeSet changeSet) {
        return this.commit(apiClient, changeSet, null);
    }

    @Override  // com.google.android.gms.drive.DriveContents
    public PendingResult commit(GoogleApiClient apiClient, MetadataChangeSet changeSet, ExecutionOptions executionOptions) {
        if(executionOptions == null) {
            executionOptions = new Builder().build();
        }
        if(this.zzafa.getMode() == 0x10000000) {
            throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
        }
        if(ExecutionOptions.zzbX(executionOptions.zzpk()) && !this.zzafa.zzpc()) {
            throw new IllegalStateException("DriveContents must be valid for conflict detection.");
        }
        ExecutionOptions.zza(apiClient, executionOptions);
        if(this.zzpg()) {
            throw new IllegalStateException("DriveContents already closed.");
        }
        if(this.getDriveId() == null) {
            throw new IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
        }
        if(changeSet == null) {
            changeSet = MetadataChangeSet.zzads;
        }
        this.zzpf();
        return apiClient.zzb(new zza(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                Context context0 = zzs0.getContext();
                changeSet.zzpm().setContext(context0);
                zzs0.zzpB().zza(new CloseContentsAndUpdateMetadataRequest(zzt.this.zzafa.getDriveId(), changeSet.zzpm(), zzt.this.zzafa.getRequestId(), zzt.this.zzafa.zzpc(), executionOptions), new zzbq(this));
            }
        });
    }

    @Override  // com.google.android.gms.drive.DriveContents
    public void discard(GoogleApiClient apiClient) {
        if(this.zzpg()) {
            throw new IllegalStateException("DriveContents already closed.");
        }
        this.zzpf();
        ((com.google.android.gms.drive.internal.zzt.4)apiClient.zzb(new zza(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new CloseContentsRequest(zzt.this.zzafa.getRequestId(), false), new zzbq(this));
            }
        })).setResultCallback(new ResultCallback() {
            public void zzm(Status status0) {
                if(!status0.isSuccess()) {
                    zzx.zzv("DriveContentsImpl", "Error discarding contents");
                    return;
                }
                zzx.zzt("DriveContentsImpl", "Contents discarded");
            }
        });
    }

    @Override  // com.google.android.gms.drive.DriveContents
    public DriveId getDriveId() {
        return this.zzafa.getDriveId();
    }

    @Override  // com.google.android.gms.drive.DriveContents
    public InputStream getInputStream() {
        if(this.zzpg()) {
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        }
        if(this.zzafa.getMode() != 0x10000000) {
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        }
        if(this.zzafb) {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        }
        this.zzafb = true;
        return this.zzafa.getInputStream();
    }

    @Override  // com.google.android.gms.drive.DriveContents
    public int getMode() {
        return this.zzafa.getMode();
    }

    @Override  // com.google.android.gms.drive.DriveContents
    public OutputStream getOutputStream() {
        if(this.zzpg()) {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        if(this.zzafa.getMode() != 0x20000000) {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        }
        if(this.zzafc) {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        }
        this.zzafc = true;
        return this.zzafa.getOutputStream();
    }

    @Override  // com.google.android.gms.drive.DriveContents
    public ParcelFileDescriptor getParcelFileDescriptor() {
        if(this.zzpg()) {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        return this.zzafa.getParcelFileDescriptor();
    }

    @Override  // com.google.android.gms.drive.DriveContents
    public PendingResult reopenForWrite(GoogleApiClient apiClient) {
        if(this.zzpg()) {
            throw new IllegalStateException("DriveContents already closed.");
        }
        if(this.zzafa.getMode() != 0x10000000) {
            throw new IllegalStateException("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
        }
        this.zzpf();
        return apiClient.zza(new zzb(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new OpenContentsRequest(zzt.this.getDriveId(), 0x20000000, zzt.this.zzafa.getRequestId()), new zzbi(this, null));
            }
        });
    }

    @Override  // com.google.android.gms.drive.DriveContents
    public Contents zzpe() {
        return this.zzafa;
    }

    @Override  // com.google.android.gms.drive.DriveContents
    public void zzpf() {
        zzlg.zza(this.zzafa.getParcelFileDescriptor());
        this.mClosed = true;
    }

    @Override  // com.google.android.gms.drive.DriveContents
    public boolean zzpg() {
        return this.mClosed;
    }
}

