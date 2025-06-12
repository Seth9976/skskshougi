package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

final class zzrp {
    final int tag;
    final byte[] zzaWg;

    zzrp(int v, byte[] arr_b) {
        this.tag = v;
        this.zzaWg = arr_b;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        return o instanceof zzrp ? this.tag == ((zzrp)o).tag && Arrays.equals(this.zzaWg, ((zzrp)o).zzaWg) : false;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.zzaWg);
        return (this.tag + 0x20F) * 0x1F + v;
    }

    int zzB() {
        return zzrg.zzkO(this.tag) + this.zzaWg.length;
    }

    void zza(zzrg zzrg0) throws IOException {
        zzrg0.zzkN(this.tag);
        zzrg0.zzD(this.zzaWg);
    }
}

