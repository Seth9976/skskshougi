package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@zzgd
public final class zzdn implements zzdg {
    private final zzd zzww;
    private final zzep zzwx;
    private final zzdi zzwz;

    public zzdn(zzdi zzdi0, zzd zzd0, zzep zzep0) {
        this.zzwz = zzdi0;
        this.zzww = zzd0;
        this.zzwx = zzep0;
    }

    @Override  // com.google.android.gms.internal.zzdg
    public void zza(zzid zzid0, Map map0) {
        String s = (String)map0.get("a");
        if(s == null) {
            zzb.zzaC("Action missing from an open GMSG.");
            return;
        }
        if(this.zzww != null && !this.zzww.zzbd()) {
            String s1 = (String)map0.get("u");
            this.zzww.zzo(s1);
            return;
        }
        zzie zzie0 = zzid0.zzgF();
        if("expand".equalsIgnoreCase(s)) {
            if(zzid0.zzgJ()) {
                zzb.zzaC("Cannot expand WebView that is already expanded.");
                return;
            }
            this.zzm(false);
            zzie0.zza(zzdn.zzd(map0), zzdn.zze(map0));
            return;
        }
        if("webapp".equalsIgnoreCase(s)) {
            String s2 = (String)map0.get("u");
            this.zzm(false);
            if(s2 != null) {
                zzie0.zza(zzdn.zzd(map0), zzdn.zze(map0), s2);
                return;
            }
            zzie0.zza(zzdn.zzd(map0), zzdn.zze(map0), ((String)map0.get("html")), ((String)map0.get("baseurl")));
            return;
        }
        if("in_app_purchase".equalsIgnoreCase(s)) {
            String s3 = (String)map0.get("product_id");
            String s4 = (String)map0.get("report_urls");
            if(this.zzwz != null) {
                if(s4 != null && !s4.isEmpty()) {
                    ArrayList arrayList0 = new ArrayList(Arrays.asList(s4.split(" ")));
                    this.zzwz.zza(s3, arrayList0);
                    return;
                }
                ArrayList arrayList1 = new ArrayList();
                this.zzwz.zza(s3, arrayList1);
                return;
            }
            return;
        }
        this.zzm(true);
        zzid0.zzgH();
        String s5 = (String)map0.get("u");
        String s6 = TextUtils.isEmpty(s5) ? s5 : zzo.zzbv().zza(zzid0, s5);
        zzie0.zza(new AdLauncherIntentInfoParcel(((String)map0.get("i")), s6, ((String)map0.get("m")), ((String)map0.get("p")), ((String)map0.get("c")), ((String)map0.get("f")), ((String)map0.get("e"))));
    }

    private static boolean zzd(Map map0) {
        return "1".equals(map0.get("custom_close"));
    }

    private static int zze(Map map0) {
        String s = (String)map0.get("o");
        if(s != null) {
            if("p".equalsIgnoreCase(s)) {
                return zzo.zzbx().zzgr();
            }
            if("l".equalsIgnoreCase(s)) {
                return zzo.zzbx().zzgq();
            }
            return "c".equalsIgnoreCase(s) ? zzo.zzbx().zzgs() : -1;
        }
        return -1;
    }

    private void zzm(boolean z) {
        if(this.zzwx != null) {
            this.zzwx.zzn(z);
        }
    }
}

