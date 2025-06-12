package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;

public class zzj {
    private String zzadv;
    private DriveId zzady;
    protected MetadataChangeSet zzaex;
    private Integer zzaey;
    private final int zzaez;

    public zzj(int v) {
        this.zzaez = v;
    }

    public IntentSender build(GoogleApiClient apiClient) {
        zzu.zzb(this.zzaex, "Must provide initial metadata to CreateFileActivityBuilder.");
        zzu.zza(apiClient.isConnected(), "Client must be connected");
        zzs zzs0 = (zzs)apiClient.zza(Drive.zzNX);
        this.zzaex.zzpm().setContext(zzs0.getContext());
        int v = this.zzaey == null ? 0 : ((int)this.zzaey);
        try {
            return zzs0.zzpB().zza(new CreateFileIntentSenderRequest(this.zzaex.zzpm(), v, this.zzadv, this.zzady, this.zzaez));
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeException("Unable to connect Drive Play Service", remoteException0);
        }
    }

    public void zza(DriveId driveId0) {
        this.zzady = (DriveId)zzu.zzu(driveId0);
    }

    public void zza(MetadataChangeSet metadataChangeSet0) {
        this.zzaex = (MetadataChangeSet)zzu.zzu(metadataChangeSet0);
    }

    public void zzct(int v) {
        this.zzaey = v;
    }

    public void zzcv(String s) {
        this.zzadv = (String)zzu.zzu(s);
    }
}

