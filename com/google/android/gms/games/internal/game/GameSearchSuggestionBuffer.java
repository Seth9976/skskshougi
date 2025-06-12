package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class GameSearchSuggestionBuffer extends AbstractDataBuffer {
    public GameSearchSuggestionBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.zzfL(x0);
    }

    public GameSearchSuggestion zzfL(int v) {
        return new GameSearchSuggestionRef(this.zzWu, v);
    }
}

