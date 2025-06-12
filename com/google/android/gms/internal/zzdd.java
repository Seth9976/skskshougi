package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

@zzgd
public final class zzdd implements zzdg {
    private final zzde zzvU;

    public zzdd(zzde zzde0) {
        this.zzvU = zzde0;
    }

    @Override  // com.google.android.gms.internal.zzdg
    public void zza(zzid zzid0, Map map0) {
        String s = (String)map0.get("name");
        if(s == null) {
            zzb.zzaC("App event with no name parameter.");
            return;
        }
        String s1 = (String)map0.get("info");
        this.zzvU.onAppEvent(s, s1);
    }
}

