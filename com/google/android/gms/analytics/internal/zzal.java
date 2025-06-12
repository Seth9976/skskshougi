package com.google.android.gms.analytics.internal;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

public class zzal implements zzp {
    public double zzME;
    public int zzMF;
    public int zzMG;
    public int zzMH;
    public int zzMI;
    public Map zzMJ;
    public String zztd;

    public zzal() {
        this.zzME = -1.0;
        this.zzMF = -1;
        this.zzMG = -1;
        this.zzMH = -1;
        this.zzMI = -1;
        this.zzMJ = new HashMap();
    }

    public int getSessionTimeout() {
        return this.zzMF;
    }

    public String getTrackingId() {
        return this.zztd;
    }

    public String zzbh(String s) {
        String s1 = (String)this.zzMJ.get(s);
        return s1 == null ? s : s1;
    }

    public double zzkA() {
        return this.zzME;
    }

    public boolean zzkB() {
        return this.zzMF >= 0;
    }

    public boolean zzkC() {
        return this.zzMG != -1;
    }

    public boolean zzkD() {
        return this.zzMG == 1;
    }

    public boolean zzkE() {
        return this.zzMH != -1;
    }

    public boolean zzkF() {
        return this.zzMH == 1;
    }

    public boolean zzkG() {
        return this.zzMI == 1;
    }

    public boolean zzky() {
        return this.zztd != null;
    }

    public boolean zzkz() {
        return this.zzME >= 0.0;
    }

    public String zzq(Activity activity0) {
        return this.zzbh(activity0.getClass().getCanonicalName());
    }
}

