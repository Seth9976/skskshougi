package com.google.android.gms.games.request;

import com.google.android.gms.common.data.AbstractDataBuffer;

public final class GameRequestSummaryBuffer extends AbstractDataBuffer {
    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.zzga(x0);
    }

    public GameRequestSummary zzga(int v) {
        return new GameRequestSummaryRef(this.zzWu, v);
    }
}

