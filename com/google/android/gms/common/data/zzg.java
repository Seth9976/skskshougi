package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

public class zzg extends zzb {
    private Object zzYM;

    public zzg(DataBuffer dataBuffer0) {
        super(dataBuffer0);
    }

    @Override  // com.google.android.gms.common.data.zzb
    public Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException("Cannot advance the iterator beyond " + this.zzYq);
        }
        ++this.zzYq;
        if(this.zzYq == 0) {
            this.zzYM = this.zzYp.get(0);
            if(!(this.zzYM instanceof zzc)) {
                throw new IllegalStateException("DataBuffer reference of type " + this.zzYM.getClass() + " is not movable");
            }
        }
        else {
            ((zzc)this.zzYM).zzbf(this.zzYq);
        }
        return this.zzYM;
    }
}

