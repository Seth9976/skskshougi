package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.internal.zzgd;

@zzgd
public class zzk {
    private final String zzsU;

    public zzk(String s) {
        this.zzsU = s;
    }

    public boolean zza(String s, int v, Intent intent0) {
        if(s != null && intent0 != null) {
            String s1 = zzo.zzbF().zze(intent0);
            String s2 = zzo.zzbF().zzf(intent0);
            if(s1 != null && s2 != null) {
                if(!s.equals(zzo.zzbF().zzai(s1))) {
                    zzb.zzaC("Developer payload not match.");
                    return false;
                }
                if(this.zzsU != null && !zzl.zzc(this.zzsU, s1, s2)) {
                    zzb.zzaC("Fail to verify signature.");
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public String zzfi() {
        return "3723731867916517425";
    }
}

