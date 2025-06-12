package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzu;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class zzb implements Iterator {
    protected final DataBuffer zzYp;
    protected int zzYq;

    public zzb(DataBuffer dataBuffer0) {
        this.zzYp = (DataBuffer)zzu.zzu(dataBuffer0);
        this.zzYq = -1;
    }

    @Override
    public boolean hasNext() {
        return this.zzYq < this.zzYp.getCount() - 1;
    }

    @Override
    public Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException("Cannot advance the iterator beyond " + this.zzYq);
        }
        int v = this.zzYq + 1;
        this.zzYq = v;
        return this.zzYp.get(v);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}

