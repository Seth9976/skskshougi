package com.google.android.gms.games.snapshot;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class SnapshotMetadataBuffer extends AbstractDataBuffer {
    public SnapshotMetadataBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    public SnapshotMetadata get(int position) {
        return new SnapshotMetadataRef(this.zzWu, position);
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.get(x0);
    }
}

