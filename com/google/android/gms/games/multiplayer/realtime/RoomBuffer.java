package com.google.android.gms.games.multiplayer.realtime;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class RoomBuffer extends zzf {
    public RoomBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected Object zzj(int v, int v1) {
        return this.zzp(v, v1);
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected String zzni() {
        return "external_match_id";
    }

    protected Room zzp(int v, int v1) {
        return new RoomRef(this.zzWu, v, v1);
    }
}

