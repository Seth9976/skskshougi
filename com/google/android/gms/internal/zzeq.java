package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.Map;

@zzgd
public class zzeq {
    private final zzid zzoA;
    private final boolean zzyJ;
    private final String zzyK;

    public zzeq(zzid zzid0, Map map0) {
        this.zzoA = zzid0;
        this.zzyK = (String)map0.get("forceOrientation");
        if(map0.containsKey("allowOrientationChange")) {
            this.zzyJ = Boolean.parseBoolean(((String)map0.get("allowOrientationChange")));
            return;
        }
        this.zzyJ = true;
    }

    public void execute() {
        int v;
        if(this.zzoA == null) {
            zzb.zzaC("AdWebView is null");
            return;
        }
        if("portrait".equalsIgnoreCase(this.zzyK)) {
            v = zzo.zzbx().zzgr();
        }
        else if("landscape".equalsIgnoreCase(this.zzyK)) {
            v = zzo.zzbx().zzgq();
        }
        else {
            v = this.zzyJ ? -1 : zzo.zzbx().zzgs();
        }
        this.zzoA.setRequestedOrientation(v);
    }
}

