package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zze extends zzak {
    private static final String ID;
    private static final String zzaKp;
    private static final String zzaKq;
    private final Context zzpH;

    static {
        zze.ID = "_awcr";
        zze.zzaKp = "component";
        zze.zzaKq = "conversion_id";
    }

    public zze(Context context0) {
        super("_awcr", new String[]{"conversion_id"});
        this.zzpH = context0;
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        zza zzag$zza0 = (zza)map0.get("conversion_id");
        if(zzag$zza0 == null) {
            return zzdf.zzzQ();
        }
        String s = zzdf.zzg(zzag$zza0);
        zza zzag$zza1 = (zza)map0.get("component");
        String s1 = zzag$zza1 == null ? null : zzdf.zzg(zzag$zza1);
        String s2 = zzax.zzf(this.zzpH, s, s1);
        return s2 == null ? zzdf.zzzQ() : zzdf.zzI(s2);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

