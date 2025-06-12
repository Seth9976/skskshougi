package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@zzgd
public final class zzgi {
    private int mOrientation;
    private List zzBK;
    private String zzDR;
    private String zzDS;
    private List zzDT;
    private String zzDU;
    private String zzDV;
    private List zzDW;
    private long zzDX;
    private boolean zzDY;
    private final long zzDZ;
    private long zzEa;
    private boolean zzEb;
    private boolean zzEc;
    private boolean zzEd;
    private boolean zzEe;
    private int zzEf;
    private String zzvj;
    private final AdRequestInfoParcel zzxm;

    public zzgi(AdRequestInfoParcel adRequestInfoParcel0) {
        this.zzDX = -1L;
        this.zzDY = false;
        this.zzDZ = -1L;
        this.zzEa = -1L;
        this.mOrientation = -1;
        this.zzEb = false;
        this.zzEc = false;
        this.zzEd = false;
        this.zzEe = true;
        this.zzEf = 0;
        this.zzxm = adRequestInfoParcel0;
    }

    public void zza(String s, Map map0, String s1) {
        this.zzDS = s;
        this.zzvj = s1;
        this.zzi(map0);
    }

    static String zzc(Map map0, String s) {
        List list0 = (List)map0.get(s);
        return list0 == null || list0.isEmpty() ? null : ((String)list0.get(0));
    }

    static long zzd(Map map0, String s) {
        List list0 = (List)map0.get(s);
        if(list0 != null && !list0.isEmpty()) {
            String s1 = (String)list0.get(0);
            try {
                return (long)(Float.parseFloat(s1) * 1000.0f);
            }
            catch(NumberFormatException unused_ex) {
                zzb.zzaC(("Could not parse float from " + s + " header: " + s1));
            }
        }
        return -1L;
    }

    static List zze(Map map0, String s) {
        List list0 = (List)map0.get(s);
        if(list0 != null && !list0.isEmpty()) {
            String s1 = (String)list0.get(0);
            return s1 == null ? null : Arrays.asList(s1.trim().split("\\s+"));
        }
        return null;
    }

    private boolean zzf(Map map0, String s) {
        List list0 = (List)map0.get(s);
        return list0 != null && !list0.isEmpty() && Boolean.valueOf(((String)list0.get(0))).booleanValue();
    }

    public void zzi(Map map0) {
        this.zzj(map0);
        this.zzk(map0);
        this.zzl(map0);
        this.zzm(map0);
        this.zzn(map0);
        this.zzr(map0);
        this.zzs(map0);
        this.zzt(map0);
        this.zzu(map0);
        this.zzo(map0);
        this.zzv(map0);
        this.zzq(map0);
        this.zzp(map0);
        this.zzw(map0);
        this.zzx(map0);
    }

    private void zzj(Map map0) {
        this.zzDR = zzgi.zzc(map0, "X-Afma-Ad-Size");
    }

    public AdResponseParcel zzj(long v) {
        return new AdResponseParcel(this.zzxm, this.zzDS, this.zzvj, this.zzDT, this.zzDW, this.zzDX, this.zzDY, -1L, this.zzBK, this.zzEa, this.mOrientation, this.zzDR, v, this.zzDU, this.zzDV, this.zzEb, this.zzEc, this.zzEd, this.zzEe, false, this.zzEf);
    }

    private void zzk(Map map0) {
        List list0 = zzgi.zze(map0, "X-Afma-Click-Tracking-Urls");
        if(list0 != null) {
            this.zzDT = list0;
        }
    }

    private void zzl(Map map0) {
        List list0 = (List)map0.get("X-Afma-Debug-Dialog");
        if(list0 != null && !list0.isEmpty()) {
            this.zzDU = (String)list0.get(0);
        }
    }

    private void zzm(Map map0) {
        List list0 = zzgi.zze(map0, "X-Afma-Tracking-Urls");
        if(list0 != null) {
            this.zzDW = list0;
        }
    }

    private void zzn(Map map0) {
        long v = zzgi.zzd(map0, "X-Afma-Interstitial-Timeout");
        if(v != -1L) {
            this.zzDX = v;
        }
    }

    private void zzo(Map map0) {
        this.zzDV = zzgi.zzc(map0, "X-Afma-ActiveView");
    }

    private void zzp(Map map0) {
        this.zzEc |= this.zzxm != null && this.zzxm.zzCs != 0;
    }

    private void zzq(Map map0) {
        this.zzEb |= this.zzf(map0, "X-Afma-Custom-Rendering-Allowed");
    }

    private void zzr(Map map0) {
        this.zzDY |= this.zzf(map0, "X-Afma-Mediation");
    }

    private void zzs(Map map0) {
        List list0 = zzgi.zze(map0, "X-Afma-Manual-Tracking-Urls");
        if(list0 != null) {
            this.zzBK = list0;
        }
    }

    private void zzt(Map map0) {
        long v = zzgi.zzd(map0, "X-Afma-Refresh-Rate");
        if(v != -1L) {
            this.zzEa = v;
        }
    }

    private void zzu(Map map0) {
        List list0 = (List)map0.get("X-Afma-Orientation");
        if(list0 != null && !list0.isEmpty()) {
            String s = (String)list0.get(0);
            if("portrait".equalsIgnoreCase(s)) {
                this.mOrientation = zzo.zzbx().zzgr();
                return;
            }
            if("landscape".equalsIgnoreCase(s)) {
                this.mOrientation = zzo.zzbx().zzgq();
            }
        }
    }

    private void zzv(Map map0) {
        List list0 = (List)map0.get("X-Afma-Use-HTTPS");
        if(list0 != null && !list0.isEmpty()) {
            this.zzEd = Boolean.valueOf(((String)list0.get(0))).booleanValue();
        }
    }

    private void zzw(Map map0) {
        List list0 = (List)map0.get("X-Afma-Content-Url-Opted-Out");
        if(list0 != null && !list0.isEmpty()) {
            this.zzEe = Boolean.valueOf(((String)list0.get(0))).booleanValue();
        }
    }

    private void zzx(Map map0) {
        List list0 = zzgi.zze(map0, "X-Afma-OAuth-Token-Status");
        this.zzEf = 0;
        if(list0 != null) {
            for(Object object0: list0) {
                if("Clear".equalsIgnoreCase(((String)object0))) {
                    this.zzEf = 1;
                    return;
                }
                if("No-Op".equalsIgnoreCase(((String)object0))) {
                    this.zzEf = 0;
                    return;
                }
                if(false) {
                    break;
                }
            }
        }
    }
}

