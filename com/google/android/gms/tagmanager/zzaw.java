package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzaw extends zzak {
    private static final String ID;
    private static final String zzaKp;
    private final Context zzpH;

    static {
        zzaw.ID = "_ir";
        zzaw.zzaKp = "component";
    }

    public zzaw(Context context0) {
        super("_ir", new String[0]);
        this.zzpH = context0;
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        String s = ((zza)map0.get("component")) == null ? null : zzdf.zzg(((zza)map0.get("component")));
        String s1 = zzax.zzj(this.zzpH, s);
        return s1 == null ? zzdf.zzzQ() : zzdf.zzI(s1);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

