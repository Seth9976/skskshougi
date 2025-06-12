package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class LeaderboardScoreBuffer extends AbstractDataBuffer {
    private final LeaderboardScoreBufferHeader zzatC;

    public LeaderboardScoreBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zzatC = new LeaderboardScoreBufferHeader(dataHolder.zznb());
    }

    public LeaderboardScore get(int position) {
        return new LeaderboardScoreRef(this.zzWu, position);
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.get(x0);
    }

    public LeaderboardScoreBufferHeader zztF() {
        return this.zzatC;
    }
}

