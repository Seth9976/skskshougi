package com.google.android.gms.games.multiplayer.turnbased;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class TurnBasedMatchBuffer extends zzf {
    public TurnBasedMatchBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected Object zzj(int v, int v1) {
        return this.zzq(v, v1);
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected String zzni() {
        return "external_match_id";
    }

    protected TurnBasedMatch zzq(int v, int v1) {
        return new TurnBasedMatchRef(this.zzWu, v, v1);
    }
}

