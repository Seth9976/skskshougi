package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

abstract class zzbv extends zzca {
    public zzbv(String s) {
        super(s);
    }

    @Override  // com.google.android.gms.tagmanager.zzca
    protected boolean zza(zza zzag$zza0, zza zzag$zza1, Map map0) {
        zzde zzde0 = zzdf.zzh(zzag$zza0);
        zzde zzde1 = zzdf.zzh(zzag$zza1);
        return zzde0 != zzdf.zzzO() && zzde1 != zzdf.zzzO() ? this.zza(zzde0, zzde1, map0) : false;
    }

    protected abstract boolean zza(zzde arg1, zzde arg2, Map arg3);
}

