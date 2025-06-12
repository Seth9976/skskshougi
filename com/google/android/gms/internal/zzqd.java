package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.List;

public class zzqd {
    private final List zzaPn;

    public zzqd() {
        this.zzaPn = new ArrayList();
    }

    public String getId() [...] // Potential decryptor

    public List zzAf() {
        return this.zzaPn;
    }

    public zzqd zzb(zzpy zzpy0) throws IllegalArgumentException {
        zzu.zzu(zzpy0);
        for(Object object0: this.zzaPn) {
            if(((zzpy)object0).getContainerId().equals(zzpy0.getContainerId())) {
                throw new IllegalArgumentException("The container is already being requested. " + zzpy0.getContainerId());
            }
            if(false) {
                break;
            }
        }
        this.zzaPn.add(zzpy0);
        return this;
    }
}

