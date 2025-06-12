package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzcc extends zzak {
    private static final String ID;
    private static final String zzaMM;
    private static final String zzaMN;

    static {
        zzcc.ID = "_r";
        zzcc.zzaMM = "min";
        zzcc.zzaMN = "max";
    }

    public zzcc() {
        super("_r", new String[0]);
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        zza zzag$zza0 = (zza)map0.get("min");
        zza zzag$zza1 = (zza)map0.get("max");
        if(zzag$zza0 != null && zzag$zza0 != zzdf.zzzQ() && zzag$zza1 != null && zzag$zza1 != zzdf.zzzQ()) {
            zzde zzde0 = zzdf.zzh(zzag$zza0);
            zzde zzde1 = zzdf.zzh(zzag$zza1);
            if(zzde0 != zzdf.zzzO() && zzde1 != zzdf.zzzO()) {
                double f = zzde0.doubleValue();
                double f1 = zzde1.doubleValue();
                return f <= f1 ? zzdf.zzI(Math.round((f1 - f) * Math.random() + f)) : zzdf.zzI(Math.round(2147483647.0 * Math.random() + 0.0));
            }
        }
        return zzdf.zzI(Math.round(2147483647.0 * Math.random() + 0.0));
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return false;
    }
}

