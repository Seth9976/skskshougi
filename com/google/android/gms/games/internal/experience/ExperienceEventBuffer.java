package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class ExperienceEventBuffer extends AbstractDataBuffer {
    public ExperienceEventBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.zzfH(x0);
    }

    public ExperienceEvent zzfH(int v) {
        return new ExperienceEventRef(this.zzWu, v);
    }
}

