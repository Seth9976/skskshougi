package com.google.android.gms.tagmanager;

class zzcs implements zzcd {
    private final long zzMf;
    private final int zzMg;
    private double zzMh;
    private final Object zzMj;
    private long zzaNC;

    public zzcs() {
        this(60, 2000L);
    }

    public zzcs(int v, long v1) {
        this.zzMj = new Object();
        this.zzMg = v;
        this.zzMh = (double)this.zzMg;
        this.zzMf = v1;
    }

    @Override  // com.google.android.gms.tagmanager.zzcd
    public boolean zzkb() {
        synchronized(this.zzMj) {
            long v1 = System.currentTimeMillis();
            if(this.zzMh < ((double)this.zzMg)) {
                double f = ((double)(v1 - this.zzaNC)) / ((double)this.zzMf);
                if(f > 0.0) {
                    this.zzMh = Math.min(this.zzMg, f + this.zzMh);
                }
            }
            this.zzaNC = v1;
            if(this.zzMh >= 1.0) {
                --this.zzMh;
                return true;
            }
            zzbg.zzaC("No more tokens available.");
            return false;
        }
    }
}

