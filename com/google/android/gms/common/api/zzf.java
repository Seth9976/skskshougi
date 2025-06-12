package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public class zzf implements zzh {
    private final zzg zzWK;

    public zzf(zzg zzg0) {
        this.zzWK = zzg0;
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void begin() {
        this.zzWK.zzmL();
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void connect() {
        this.zzWK.zzmM();
    }

    @Override  // com.google.android.gms.common.api.zzh
    public String getName() {
        return "DISCONNECTED";
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void onConnected(Bundle connectionHint) {
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void onConnectionSuspended(int cause) {
    }

    @Override  // com.google.android.gms.common.api.zzh
    public zza zza(zza zza$zza0) {
        this.zzWK.zzXo.add(zza$zza0);
        return zza$zza0;
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void zza(ConnectionResult connectionResult0, Api api0, int v) {
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void zzaV(int v) {
        if(v == -1) {
            for(Object object0: this.zzWK.zzXo) {
                ((zze)object0).cancel();
            }
            this.zzWK.zzXo.clear();
            this.zzWK.zzmK();
            this.zzWK.zzXv.clear();
        }
    }

    @Override  // com.google.android.gms.common.api.zzh
    public zza zzb(zza zza$zza0) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}

