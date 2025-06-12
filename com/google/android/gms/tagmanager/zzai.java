package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzai extends zzak {
    private static final String ID;
    private final zzcp zzaKA;

    static {
        zzai.ID = "_e";
    }

    public zzai(zzcp zzcp0) {
        super("_e", new String[0]);
        this.zzaKA = zzcp0;
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        String s = this.zzaKA.zzzp();
        return s == null ? zzdf.zzzQ() : zzdf.zzI(s);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return false;
    }
}

