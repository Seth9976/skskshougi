package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import java.util.concurrent.Future;

@zzgd
public final class zzgh {
    private String zzDK;
    private String zzDL;
    private zzhs zzDM;
    zzd zzDN;
    public final zzdg zzDO;
    public final zzdg zzDP;
    zzid zzoA;
    private final Object zzqt;

    public zzgh(String s, String s1) {
        this.zzqt = new Object();
        this.zzDM = new zzhs();
        this.zzDO = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                synchronized(zzgh.this.zzqt) {
                    if(zzgh.this.zzDM.isDone()) {
                        return;
                    }
                    if(!zzgh.this.zzDK.equals(map0.get("request_id"))) {
                        return;
                    }
                    zzgj zzgj0 = new zzgj(1, map0);
                    zzb.zzaC(("Invalid " + zzgj0.getType() + " request error: " + zzgj0.zzfG()));
                    zzgh.this.zzDM.zzf(zzgj0);
                }
            }
        };
        this.zzDP = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                synchronized(zzgh.this.zzqt) {
                    if(zzgh.this.zzDM.isDone()) {
                        return;
                    }
                    zzgj zzgj0 = new zzgj(-2, map0);
                    if(!zzgh.this.zzDK.equals(zzgj0.getRequestId())) {
                        zzb.zzaC((zzgj0.getRequestId() + " ==== " + zzgh.this.zzDK));
                        return;
                    }
                    String s = zzgj0.getUrl();
                    if(s == null) {
                        zzb.zzaC("URL missing in loadAdUrl GMSG.");
                        return;
                    }
                    if(s.contains("%40mediation_adapters%40")) {
                        String s1 = s.replaceAll("%40mediation_adapters%40", zzhg.zza(zzid0.getContext(), ((String)map0.get("check_adapters")), zzgh.this.zzDL));
                        zzgj0.setUrl(s1);
                        zzb.zzaB(("Ad request URL modified to " + s1));
                    }
                    zzgh.this.zzDM.zzf(zzgj0);
                }
            }
        };
        this.zzDL = s1;
        this.zzDK = s;
    }

    public void zzb(zzd zzdt$zzd0) {
        this.zzDN = zzdt$zzd0;
    }

    public void zze(zzid zzid0) {
        this.zzoA = zzid0;
    }

    public zzd zzfD() {
        return this.zzDN;
    }

    public Future zzfE() {
        return this.zzDM;
    }

    public void zzfF() {
        if(this.zzoA != null) {
            this.zzoA.destroy();
            this.zzoA = null;
        }
    }
}

