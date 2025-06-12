package com.google.android.gms.appstate;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class zzb extends zzc implements AppState {
    zzb(DataHolder dataHolder0, int v) {
        super(dataHolder0, v);
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return zza.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzkT();
    }

    @Override  // com.google.android.gms.appstate.AppState
    public byte[] getConflictData() {
        return this.getByteArray("conflict_data");
    }

    @Override  // com.google.android.gms.appstate.AppState
    public String getConflictVersion() {
        return this.getString("conflict_version");
    }

    @Override  // com.google.android.gms.appstate.AppState
    public int getKey() {
        return this.getInteger("key");
    }

    @Override  // com.google.android.gms.appstate.AppState
    public byte[] getLocalData() {
        return this.getByteArray("local_data");
    }

    @Override  // com.google.android.gms.appstate.AppState
    public String getLocalVersion() {
        return this.getString("local_version");
    }

    @Override  // com.google.android.gms.appstate.AppState
    public boolean hasConflict() {
        return !this.zzbX("conflict_version");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return zza.zza(this);
    }

    @Override
    public String toString() {
        return zza.zzb(this);
    }

    public AppState zzkT() {
        return new zza(this);
    }
}

