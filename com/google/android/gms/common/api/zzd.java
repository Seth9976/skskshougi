package com.google.android.gms.common.api;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public class zzd implements zzh {
    private final zzg zzWK;

    public zzd(zzg zzg0) {
        this.zzWK = zzg0;
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void begin() {
        while(!this.zzWK.zzXo.isEmpty()) {
            try {
                this.zza(((zze)this.zzWK.zzXo.remove()));
            }
            catch(DeadObjectException deadObjectException0) {
                Log.w("GoogleApiClientConnected", "Service died while flushing queue", deadObjectException0);
            }
        }
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void connect() {
    }

    @Override  // com.google.android.gms.common.api.zzh
    public String getName() {
        return "CONNECTED";
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void onConnected(Bundle connectionHint) {
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void onConnectionSuspended(int cause) {
        switch(cause) {
            case 1: {
                this.zzWK.zzmQ();
                this.zzaV(1);
                return;
            }
            case 2: {
                this.zzaV(2);
                this.zzWK.connect();
            }
        }
    }

    private void zza(zze zzg$zze0) throws DeadObjectException {
        this.zzWK.zzb(zzg$zze0);
        ClientKey api$ClientKey0 = zzg$zze0.zzms();
        Client api$Client0 = this.zzWK.zza(api$ClientKey0);
        if(!api$Client0.isConnected()) {
            ClientKey api$ClientKey1 = zzg$zze0.zzms();
            if(this.zzWK.zzXv.containsKey(api$ClientKey1)) {
                zzg$zze0.zzr(new Status(17));
                return;
            }
        }
        zzg$zze0.zzb(api$Client0);
    }

    @Override  // com.google.android.gms.common.api.zzh
    public zza zza(zza zza$zza0) {
        return this.zzb(zza$zza0);
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void zza(ConnectionResult connectionResult0, Api api0, int v) {
    }

    @Override  // com.google.android.gms.common.api.zzh
    public void zzaV(int v) {
        if(v == -1) {
            this.zzWK.zzmK();
            this.zzWK.zzXv.clear();
        }
        else {
            for(Object object0: this.zzWK.zzXA) {
                ((zze)object0).forceFailureUnlessReady(new Status(8, "The connection to Google Play services was lost"));
            }
        }
        this.zzWK.zze(null);
        if(v != -1) {
            this.zzWK.zzXn.zzbu(v);
        }
        this.zzWK.zzXn.zznT();
    }

    @Override  // com.google.android.gms.common.api.zzh
    public zza zzb(zza zza$zza0) {
        try {
            this.zza(zza$zza0);
        }
        catch(DeadObjectException unused_ex) {
            this.zzaV(1);
        }
        return zza$zza0;
    }
}

