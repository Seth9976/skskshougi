package com.google.android.gms.tagmanager;

import java.util.Map;

class zzam extends zzbv {
    private static final String ID;

    static {
        zzam.ID = "_ge";
    }

    public zzam() {
        super("_ge");
    }

    @Override  // com.google.android.gms.tagmanager.zzbv
    protected boolean zza(zzde zzde0, zzde zzde1, Map map0) {
        return zzde0.zza(zzde1) >= 0;
    }
}

