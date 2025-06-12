package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class GameInstanceBuffer extends AbstractDataBuffer {
    public GameInstanceBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.zzfK(x0);
    }

    public GameInstance zzfK(int v) {
        return new GameInstanceRef(this.zzWu, v);
    }
}

