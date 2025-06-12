package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.Map;

class zzb extends zzak {
    private static final String ID;
    private final zza zzaKo;

    static {
        zzb.ID = "_aid";
    }

    public zzb(Context context0) {
        this(zza.zzaE(context0));
    }

    zzb(zza zza0) {
        super("_aid", new String[0]);
        this.zzaKo = zza0;
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public com.google.android.gms.internal.zzag.zza zzE(Map map0) {
        String s = this.zzaKo.zzyd();
        return s == null ? zzdf.zzzQ() : zzdf.zzI(s);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return false;
    }
}

