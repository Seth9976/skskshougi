package com.google.android.gms.appstate;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class AppStateBuffer extends AbstractDataBuffer {
    public AppStateBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    public AppState get(int position) {
        return new zzb(this.zzWu, position);
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.get(x0);
    }
}

