package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzlb;

class zzbe implements zzcd {
    private final long zzMf;
    private final int zzMg;
    private double zzMh;
    private long zzMi;
    private final Object zzMj;
    private final long zzaMh;
    private final zzlb zzpw;
    private final String zzuO;

    public zzbe(int v, long v1, long v2, String s, zzlb zzlb0) {
        this.zzMj = new Object();
        this.zzMg = v;
        this.zzMh = (double)this.zzMg;
        this.zzMf = v1;
        this.zzaMh = v2;
        this.zzuO = s;
        this.zzpw = zzlb0;
    }

    @Override  // com.google.android.gms.tagmanager.zzcd
    public boolean zzkb() {
        synchronized(this.zzMj) {
            long v1 = this.zzpw.currentTimeMillis();
            if(v1 - this.zzMi < this.zzaMh) {
                zzbg.zzaC(("Excessive " + this.zzuO + " detected; call ignored."));
                return false;
            }
            if(this.zzMh < ((double)this.zzMg)) {
                double f = ((double)(v1 - this.zzMi)) / ((double)this.zzMf);
                if(f > 0.0) {
                    this.zzMh = Math.min(this.zzMg, f + this.zzMh);
                }
            }
            this.zzMi = v1;
            if(this.zzMh >= 1.0) {
                --this.zzMh;
                return true;
            }
            zzbg.zzaC(("Excessive " + this.zzuO + " detected; call ignored."));
            return false;
        }
    }
}

