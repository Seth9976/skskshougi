package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.AbstractDataBuffer;

public final class MilestoneBuffer extends AbstractDataBuffer {
    public Milestone get(int position) {
        return new MilestoneRef(this.zzWu, position);
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.get(x0);
    }
}

