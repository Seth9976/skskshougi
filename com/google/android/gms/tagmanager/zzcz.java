package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

abstract class zzcz extends zzca {
    public zzcz(String s) {
        super(s);
    }

    @Override  // com.google.android.gms.tagmanager.zzca
    protected boolean zza(zza zzag$zza0, zza zzag$zza1, Map map0) {
        String s = zzdf.zzg(zzag$zza0);
        String s1 = zzdf.zzg(zzag$zza1);
        return s != "" && s1 != "" ? this.zza(s, s1, map0) : false;
    }

    protected abstract boolean zza(String arg1, String arg2, Map arg3);
}

