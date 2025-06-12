package com.google.android.gms.tagmanager;

import java.util.Map;

class zzan extends zzbv {
    private static final String ID;

    static {
        zzan.ID = "_gt";
    }

    public zzan() {
        super("_gt");
    }

    @Override  // com.google.android.gms.tagmanager.zzbv
    protected boolean zza(zzde zzde0, zzde zzde1, Map map0) {
        return zzde0.zza(zzde1) > 0;
    }
}

