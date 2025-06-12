package com.google.android.gms.games.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class GameRequestBuffer extends zzf {
    public GameRequestBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected Object zzj(int v, int v1) {
        return this.zzs(v, v1);
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected String zzni() {
        return "external_request_id";
    }

    protected GameRequest zzs(int v, int v1) {
        return new GameRequestRef(this.zzWu, v, v1);
    }
}

