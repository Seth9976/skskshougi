package com.google.android.gms.internal;

import android.os.Binder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@zzgd
public class zzbw {
    private final Collection zztA;
    private final Collection zzty;
    private final Collection zztz;

    public zzbw() {
        this.zzty = new ArrayList();
        this.zztz = new ArrayList();
        this.zztA = new ArrayList();
    }

    public void zza(zzbs zzbs0) {
        this.zzty.add(zzbs0);
    }

    public void zza(zzbv zzbv0) {
        this.zztz.add(zzbv0);
    }

    public void zzb(zzbv zzbv0) {
        this.zztA.add(zzbv0);
    }

    public List zzda() {
        List list0 = new ArrayList();
        long v = Binder.clearCallingIdentity();
        try {
            for(Object object0: this.zztA) {
                String s = (String)((zzbv)object0).zzcZ().get();
                if(s != null) {
                    list0.add(s);
                }
            }
            return list0;
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    public List zzdb() {
        List list0 = new ArrayList();
        for(Object object0: this.zztz) {
            String s = (String)((zzbv)object0).get();
            if(s != null) {
                list0.add(s);
            }
        }
        return list0;
    }
}

