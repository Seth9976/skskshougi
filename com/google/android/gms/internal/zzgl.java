package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzo;
import java.util.WeakHashMap;

@zzgd
public final class zzgl {
    class zza {
        public final long zzEI;
        public final zzgk zzEJ;
        final zzgl zzEK;

        public zza(zzgk zzgk0) {
            this.zzEI = zzo.zzbz().currentTimeMillis();
            this.zzEJ = zzgk0;
        }

        public boolean hasExpired() {
            long v = (long)(((Long)zzbz.zzuw.get()));
            long v1 = zzo.zzbz().currentTimeMillis();
            return v + this.zzEI < v1;
        }
    }

    private WeakHashMap zzEH;

    public zzgl() {
        this.zzEH = new WeakHashMap();
    }

    public zzgk zzC(Context context0) {
        zza zzgl$zza0 = (zza)this.zzEH.get(context0);
        zzgk zzgk0 = zzgl$zza0 == null || zzgl$zza0.hasExpired() || !((Boolean)zzbz.zzuv.get()).booleanValue() ? new com.google.android.gms.internal.zzgk.zza(context0).zzfJ() : new com.google.android.gms.internal.zzgk.zza(context0, zzgl$zza0.zzEJ).zzfJ();
        this.zzEH.put(context0, new zza(this, zzgk0));
        return zzgk0;
    }
}

