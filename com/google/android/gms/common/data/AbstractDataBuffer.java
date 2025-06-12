package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

public abstract class AbstractDataBuffer implements DataBuffer {
    protected final DataHolder zzWu;

    protected AbstractDataBuffer(DataHolder dataHolder) {
        this.zzWu = dataHolder;
        if(this.zzWu != null) {
            this.zzWu.zzp(this);
        }
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    @Deprecated
    public final void close() {
        this.release();
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public abstract Object get(int arg1);

    @Override  // com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        return this.zzWu == null ? 0 : this.zzWu.getCount();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.common.data.DataBuffer
    @Deprecated
    public boolean isClosed() {
        return this.zzWu == null || this.zzWu.isClosed();
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public Iterator iterator() {
        return new zzb(this);
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public void release() {
        if(this.zzWu != null) {
            this.zzWu.close();
        }
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public Iterator singleRefIterator() {
        return new zzg(this);
    }

    @Override  // com.google.android.gms.common.data.DataBuffer
    public Bundle zznb() {
        return this.zzWu.zznb();
    }
}

