package com.google.android.gms.tagmanager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

class zzcw implements zzl {
    private final Map zzaNR;
    private final int zzaNS;
    private final zza zzaNT;
    private int zzaNU;

    zzcw(int v, zza zzm$zza0) {
        this.zzaNR = new HashMap();
        this.zzaNS = v;
        this.zzaNT = zzm$zza0;
    }

    @Override  // com.google.android.gms.tagmanager.zzl
    public Object get(Object object0) {
        synchronized(this) {
            return this.zzaNR.get(object0);
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzl
    public void zzf(Object object0, Object object1) {
        synchronized(this) {
            if(object0 == null || object1 == null) {
                throw new NullPointerException("key == null || value == null");
            }
            this.zzaNU += this.zzaNT.sizeOf(object0, object1);
            if(this.zzaNU > this.zzaNS) {
                Iterator iterator0 = this.zzaNR.entrySet().iterator();
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    int v1 = this.zzaNU;
                    Object object3 = ((Map.Entry)object2).getKey();
                    Object object4 = ((Map.Entry)object2).getValue();
                    this.zzaNU = v1 - this.zzaNT.sizeOf(object3, object4);
                    iterator0.remove();
                    if(this.zzaNU <= this.zzaNS) {
                        break;
                    }
                }
            }
            this.zzaNR.put(object0, object1);
        }
    }
}

