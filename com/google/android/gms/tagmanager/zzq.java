package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzq extends zzak {
    private static final String ID;
    private final String zzTQ;

    static {
        zzq.ID = "_ctv";
    }

    public zzq(String s) {
        super("_ctv", new String[0]);
        this.zzTQ = s;
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        return this.zzTQ == null ? zzdf.zzzQ() : zzdf.zzI(this.zzTQ);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

