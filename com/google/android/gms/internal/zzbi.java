package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzgd
public class zzbi {
    private final Object zzqt;
    private int zzrt;
    private List zzru;

    public zzbi() {
        this.zzqt = new Object();
        this.zzru = new LinkedList();
    }

    public boolean zza(zzbh zzbh0) {
        synchronized(this.zzqt) {
            return this.zzru.contains(zzbh0);
        }
    }

    public boolean zzb(zzbh zzbh0) {
        synchronized(this.zzqt) {
            Iterator iterator0 = this.zzru.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(zzbh0 != ((zzbh)object1) && ((zzbh)object1).zzci().equals(zzbh0.zzci())) {
                    iterator0.remove();
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
    }

    public void zzc(zzbh zzbh0) {
        synchronized(this.zzqt) {
            if(this.zzru.size() >= 10) {
                zzb.zzay(("Queue is full, current size = " + this.zzru.size()));
                this.zzru.remove(0);
            }
            int v1 = this.zzrt;
            this.zzrt = v1 + 1;
            zzbh0.zzg(v1);
            this.zzru.add(zzbh0);
        }
    }

    public zzbh zzco() {
        int v3;
        zzbh zzbh2;
        zzbh zzbh0 = null;
        synchronized(this.zzqt) {
            if(this.zzru.size() == 0) {
                zzb.zzay("Queue empty");
                return null;
            }
            if(this.zzru.size() >= 2) {
                int v1 = 0x80000000;
                for(Object object1: this.zzru) {
                    zzbh zzbh1 = (zzbh)object1;
                    int v2 = zzbh1.getScore();
                    if(v2 > v1) {
                        zzbh2 = zzbh1;
                        v3 = v2;
                    }
                    else {
                        v3 = v1;
                        zzbh2 = zzbh0;
                    }
                    v1 = v3;
                    zzbh0 = zzbh2;
                }
                this.zzru.remove(zzbh0);
                return zzbh0;
            }
            zzbh zzbh3 = (zzbh)this.zzru.get(0);
            zzbh3.zzcj();
            return zzbh3;
        }
    }
}

