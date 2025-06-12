package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.Map;
import java.util.Set;

public abstract class zzca extends zzak {
    private static final String zzaLE;
    private static final String zzaMC;

    static {
        zzca.zzaLE = "arg0";
        zzca.zzaMC = "arg1";
    }

    // 去混淆评级： 低(20)
    public zzca(String s) {
        super(s, new String[]{"arg0", "arg1"});
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public zza zzE(Map map0) {
        for(Object object0: map0.values()) {
            if(((zza)object0) == zzdf.zzzQ()) {
                return zzdf.zzI(Boolean.FALSE);
            }
            if(false) {
                break;
            }
        }
        zza zzag$zza0 = (zza)map0.get("arg0");
        zza zzag$zza1 = (zza)map0.get("arg1");
        return zzag$zza0 != null && zzag$zza1 != null ? zzdf.zzI(Boolean.valueOf(this.zza(zzag$zza0, zzag$zza1, map0))) : zzdf.zzI(Boolean.FALSE);
    }

    protected abstract boolean zza(zza arg1, zza arg2, Map arg3);

    @Override  // com.google.android.gms.tagmanager.zzak
    public String zzyM() {
        return super.zzyM();
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public Set zzyN() {
        return super.zzyN();
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public boolean zzyh() {
        return true;
    }
}

