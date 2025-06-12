package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.zznx;

public class zzk extends zzd {
    private final zznx zzKm;

    zzk(zzf zzf0) {
        super(zzf0);
        this.zzKm = new zznx();
    }

    public void zzhi() {
        zzan zzan0 = this.zzhm();
        String s = zzan0.zzjL();
        if(s != null) {
            this.zzKm.setAppName(s);
        }
        String s1 = zzan0.zzjN();
        if(s1 != null) {
            this.zzKm.setAppVersion(s1);
        }
    }

    @Override  // com.google.android.gms.analytics.internal.zzd
    protected void zzhn() {
        this.zzhS().zzwc().zza(this.zzKm);
        this.zzhi();
    }

    public zznx zzix() {
        this.zzia();
        return this.zzKm;
    }
}

