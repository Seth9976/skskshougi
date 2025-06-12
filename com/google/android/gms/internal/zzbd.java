package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.overlay.zzf;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.ads.internal.zzo;
import org.json.JSONObject;

@zzgd
public class zzbd implements zzbb {
    private final zzid zzoA;

    public zzbd(Context context0, VersionInfoParcel versionInfoParcel0) {
        this.zzoA = zzo.zzbw().zza(context0, new AdSizeParcel(), false, false, null, versionInfoParcel0);
        this.zzoA.setWillNotDraw(true);
    }

    @Override  // com.google.android.gms.internal.zzbb
    public void destroy() {
        this.zzoA.destroy();
    }

    private void runOnUiThread(Runnable runnable) {
        if(zzk.zzcA().zzgw()) {
            runnable.run();
            return;
        }
        zzhl.zzGk.post(runnable);
    }

    @Override  // com.google.android.gms.internal.zzbb
    public void zza(zza zza0, zzf zzf0, zzde zzde0, com.google.android.gms.ads.internal.overlay.zzk zzk0, boolean z, zzdi zzdi0, zzdk zzdk0, zzd zzd0, zzev zzev0) {
        this.zzoA.zzgF().zzb(zza0, zzf0, zzde0, zzk0, z, zzdi0, zzdk0, new zzd(false), zzev0);
    }

    @Override  // com.google.android.gms.internal.zzbb
    public void zza(com.google.android.gms.internal.zzbb.zza zzbb$zza0) {
        this.zzoA.zzgF().zza(new com.google.android.gms.internal.zzie.zza() {
            @Override  // com.google.android.gms.internal.zzie$zza
            public void zza(zzid zzid0, boolean z) {
                zzbb$zza0.zzcf();
            }
        });
    }

    @Override  // com.google.android.gms.internal.zzbe
    public void zza(String s, zzdg zzdg0) {
        this.zzoA.zzgF().zza(s, zzdg0);
    }

    @Override  // com.google.android.gms.internal.zzbe
    public void zza(String s, String s1) {
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                zzbd.this.zzoA.zza(s, s1);
            }
        });
    }

    @Override  // com.google.android.gms.internal.zzbe
    public void zza(String s, JSONObject jSONObject0) {
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                zzbd.this.zzoA.zza(s, jSONObject0);
            }
        });
    }

    @Override  // com.google.android.gms.internal.zzbe
    public void zzb(String s, zzdg zzdg0) {
        this.zzoA.zzgF().zzb(s, zzdg0);
    }

    @Override  // com.google.android.gms.internal.zzbb
    public zzbf zzce() {
        return new zzbg(this);
    }

    @Override  // com.google.android.gms.internal.zzbb
    public void zzr(String s) {
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                zzbd.this.zzoA.loadData(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", s), "text/html", "UTF-8");
            }
        });
    }

    @Override  // com.google.android.gms.internal.zzbb
    public void zzs(String s) {
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                zzbd.this.zzoA.loadUrl(s);
            }
        });
    }

    @Override  // com.google.android.gms.internal.zzbb
    public void zzt(String s) {
        this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                zzbd.this.zzoA.loadData(s, "text/html", "UTF-8");
            }
        });
    }
}

