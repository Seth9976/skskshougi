package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

public class zzan extends zzd {
    protected boolean zzIx;
    protected int zzKR;
    protected String zzLU;
    protected String zzLV;
    protected int zzLX;
    protected boolean zzML;
    protected boolean zzMM;
    protected boolean zzMN;

    public zzan(zzf zzf0) {
        super(zzf0);
    }

    public int getLogLevel() {
        this.zzia();
        return this.zzKR;
    }

    void zza(zzaa zzaa0) {
        this.zzaT("Loading global XML config values");
        if(zzaa0.zzjK()) {
            String s = zzaa0.zzjL();
            this.zzLU = s;
            this.zzb("XML config - app name", s);
        }
        if(zzaa0.zzjM()) {
            String s1 = zzaa0.zzjN();
            this.zzLV = s1;
            this.zzb("XML config - app version", s1);
        }
        if(zzaa0.zzjO()) {
            int v = zzan.zzbo(zzaa0.zzjP());
            if(v >= 0) {
                this.zzKR = v;
                this.zza("XML config - log level", v);
            }
        }
        if(zzaa0.zzjQ()) {
            int v1 = zzaa0.zzjR();
            this.zzLX = v1;
            this.zzMM = true;
            this.zzb("XML config - dispatch period (sec)", v1);
        }
        if(zzaa0.zzjS()) {
            boolean z = zzaa0.zzjT();
            this.zzIx = z;
            this.zzMN = true;
            this.zzb("XML config - dry run", Boolean.valueOf(z));
        }
    }

    private static int zzbo(String s) {
        String s1 = s.toLowerCase();
        if("verbose".equals(s1)) {
            return 0;
        }
        if("info".equals(s1)) {
            return 1;
        }
        if("warning".equals(s1)) {
            return 2;
        }
        return "error".equals(s1) ? 3 : -1;
    }

    @Override  // com.google.android.gms.analytics.internal.zzd
    protected void zzhn() {
        this.zzkI();
    }

    public String zzjL() {
        this.zzia();
        return this.zzLU;
    }

    public String zzjN() {
        this.zzia();
        return this.zzLV;
    }

    public boolean zzjO() {
        this.zzia();
        return this.zzML;
    }

    public boolean zzjQ() {
        this.zzia();
        return this.zzMM;
    }

    public boolean zzjS() {
        this.zzia();
        return this.zzMN;
    }

    public boolean zzjT() {
        this.zzia();
        return this.zzIx;
    }

    public int zzkH() {
        this.zzia();
        return this.zzLX;
    }

    protected void zzkI() {
        ApplicationInfo applicationInfo0;
        Context context0 = this.getContext();
        try {
            applicationInfo0 = context0.getPackageManager().getApplicationInfo("org.dyndns.vivi.SkskShogi", 0x81);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            this.zzd("PackageManager doesn\'t know about the app package", packageManager$NameNotFoundException0);
            applicationInfo0 = null;
        }
        if(applicationInfo0 == null) {
            this.zzaW("Couldn\'t get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle0 = applicationInfo0.metaData;
        if(bundle0 != null) {
            int v = bundle0.getInt("com.google.android.gms.analytics.globalConfigResource");
            if(v > 0) {
                zzaa zzaa0 = (zzaa)new zzz(this.zzhM()).zzab(v);
                if(zzaa0 != null) {
                    this.zza(zzaa0);
                }
            }
        }
    }
}

