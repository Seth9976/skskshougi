package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzgd
public class zzdq implements Iterable {
    private final List zzwE;

    public zzdq() {
        this.zzwE = new LinkedList();
    }

    @Override
    public Iterator iterator() {
        return this.zzwE.iterator();
    }

    public void zza(zzdp zzdp0) {
        this.zzwE.add(zzdp0);
    }

    public boolean zza(zzid zzid0) {
        zzdp zzdp0 = this.zzc(zzid0);
        if(zzdp0 != null) {
            zzdp0.zzwB.abort();
            return true;
        }
        return false;
    }

    public void zzb(zzdp zzdp0) {
        this.zzwE.remove(zzdp0);
    }

    public boolean zzb(zzid zzid0) {
        return this.zzc(zzid0) != null;
    }

    private zzdp zzc(zzid zzid0) {
        for(Object object0: zzo.zzbH()) {
            zzdp zzdp0 = (zzdp)object0;
            if(zzdp0.zzoA == zzid0) {
                return zzdp0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }
}

