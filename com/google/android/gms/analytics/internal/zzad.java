package com.google.android.gms.analytics.internal;

public class zzad {
    private final long zzMf;
    private final int zzMg;
    private double zzMh;
    private long zzMi;
    private final Object zzMj;
    private final String zzuO;

    public zzad(int v, long v1, String s) {
        this.zzMj = new Object();
        this.zzMg = v;
        this.zzMh = (double)this.zzMg;
        this.zzMf = v1;
        this.zzuO = s;
    }

    public zzad(String s) {
        this(60, 2000L, s);
    }

    public boolean zzkb() {
        synchronized(this.zzMj) {
            long v1 = System.currentTimeMillis();
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
            zzae.zzaC(("Excessive " + this.zzuO + " detected; call ignored."));
            return false;
        }
    }
}

