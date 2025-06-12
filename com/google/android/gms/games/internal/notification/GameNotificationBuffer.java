package com.google.android.gms.games.internal.notification;

import com.google.android.gms.common.data.AbstractDataBuffer;

public final class GameNotificationBuffer extends AbstractDataBuffer {
    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.zzfN(x0);
    }

    public GameNotification zzfN(int v) {
        return new GameNotificationRef(this.zzWu, v);
    }
}

