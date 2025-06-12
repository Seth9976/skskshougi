package com.google.android.gms.playlog.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.zzoz.zza;

public class zzd implements ConnectionCallbacks, OnConnectionFailedListener {
    private zzf zzaGD;
    private final zza zzaGN;
    private boolean zzaGO;

    public zzd(zza zzoz$zza0) {
        this.zzaGN = zzoz$zza0;
        this.zzaGD = null;
        this.zzaGO = true;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
    public void onConnected(Bundle connectionHint) {
        this.zzaGD.zzak(false);
        if(this.zzaGO && this.zzaGN != null) {
            this.zzaGN.zzxl();
        }
        this.zzaGO = false;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult result) {
        this.zzaGD.zzak(true);
        if(this.zzaGO && this.zzaGN != null) {
            if(result.hasResolution()) {
                this.zzaGN.zzf(result.getResolution());
            }
            else {
                this.zzaGN.zzxm();
            }
        }
        this.zzaGO = false;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
    public void onConnectionSuspended(int cause) {
        this.zzaGD.zzak(true);
    }

    public void zza(zzf zzf0) {
        this.zzaGD = zzf0;
    }

    public void zzaj(boolean z) {
        this.zzaGO = z;
    }
}

