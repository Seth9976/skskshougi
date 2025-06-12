package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.AbstractDataBuffer;

public final class ParticipantBuffer extends AbstractDataBuffer {
    public Participant get(int position) {
        return new ParticipantRef(this.zzWu, position);
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.get(x0);
    }
}

