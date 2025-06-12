package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.AbstractDataBuffer;

public final class GameBadgeBuffer extends AbstractDataBuffer {
    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.zzfI(x0);
    }

    public GameBadge zzfI(int v) {
        return new GameBadgeRef(this.zzWu, v);
    }
}

