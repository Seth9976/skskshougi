package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.Map;

class zzc extends zzak {
    private static final String ID;
    private final zza zzaKo;

    static {
        zzc.ID = "_ate";
    }

    public zzc(Context context0) {
        this(zza.zzaE(context0));
    }

    zzc(zza zza0) {
        super("_ate", new String[0]);
        this.zzaKo = zza0;
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public com.google.android.gms.internal.zzag.zza zzE(Map map0) {
        return this.zzaKo.isLimitAdTrackingEnabled() ? zzdf.zzI(Boolean.FALSE) : zzdf.zzI(Boolean.TRUE);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return false;
    }
}

