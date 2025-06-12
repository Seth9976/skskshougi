package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class LeaderboardBuffer extends zzf {
    public LeaderboardBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected Object zzj(int v, int v1) {
        return this.zzn(v, v1);
    }

    protected Leaderboard zzn(int v, int v1) {
        return new LeaderboardRef(this.zzWu, v, v1);
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected String zzni() {
        return "external_leaderboard_id";
    }
}

