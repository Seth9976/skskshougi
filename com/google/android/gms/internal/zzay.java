package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@zzgd
public class zzay implements zzba {
    private final VersionInfoParcel zzoM;
    private final Object zzqt;
    private final WeakHashMap zzqu;
    private final ArrayList zzqv;
    private final Context zzqw;
    private final zzdt zzqx;

    public zzay(Context context0, VersionInfoParcel versionInfoParcel0, zzdt zzdt0) {
        this.zzqt = new Object();
        this.zzqu = new WeakHashMap();
        this.zzqv = new ArrayList();
        this.zzqw = context0.getApplicationContext();
        this.zzoM = versionInfoParcel0;
        this.zzqx = zzdt0;
    }

    public zzaz zza(AdSizeParcel adSizeParcel0, zzha zzha0) {
        return this.zza(adSizeParcel0, zzha0, zzha0.zzzE.getWebView());
    }

    public zzaz zza(AdSizeParcel adSizeParcel0, zzha zzha0, View view0) {
        zzaz zzaz0;
        synchronized(this.zzqt) {
            if(this.zzf(zzha0)) {
                return (zzaz)this.zzqu.get(zzha0);
            }
            zzaz0 = new zzaz(adSizeParcel0, zzha0, this.zzoM, view0, this.zzqx);
            zzaz0.zza(this);
            this.zzqu.put(zzha0, zzaz0);
            this.zzqv.add(zzaz0);
            return zzaz0;
        }
    }

    @Override  // com.google.android.gms.internal.zzba
    public void zza(zzaz zzaz0) {
        synchronized(this.zzqt) {
            if(!zzaz0.zzbZ()) {
                this.zzqv.remove(zzaz0);
                Iterator iterator0 = this.zzqu.entrySet().iterator();
                while(iterator0.hasNext()) {
                    Object object1 = iterator0.next();
                    if(((Map.Entry)object1).getValue() == zzaz0) {
                        iterator0.remove();
                    }
                }
            }
        }
    }

    public boolean zzf(zzha zzha0) {
        synchronized(this.zzqt) {
            zzaz zzaz0 = (zzaz)this.zzqu.get(zzha0);
            return zzaz0 != null && zzaz0.zzbZ();
        }
    }

    public void zzg(zzha zzha0) {
        synchronized(this.zzqt) {
            zzaz zzaz0 = (zzaz)this.zzqu.get(zzha0);
            if(zzaz0 != null) {
                zzaz0.zzbX();
            }
        }
    }

    public void zzh(zzha zzha0) {
        synchronized(this.zzqt) {
            zzaz zzaz0 = (zzaz)this.zzqu.get(zzha0);
            if(zzaz0 != null) {
                zzaz0.stop();
            }
        }
    }

    public void zzi(zzha zzha0) {
        synchronized(this.zzqt) {
            zzaz zzaz0 = (zzaz)this.zzqu.get(zzha0);
            if(zzaz0 != null) {
                zzaz0.pause();
            }
        }
    }

    public void zzj(zzha zzha0) {
        synchronized(this.zzqt) {
            zzaz zzaz0 = (zzaz)this.zzqu.get(zzha0);
            if(zzaz0 != null) {
                zzaz0.resume();
            }
        }
    }
}

