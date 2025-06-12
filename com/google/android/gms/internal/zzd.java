package com.google.android.gms.internal;

public class zzd implements zzo {
    private int zzo;
    private int zzp;
    private final int zzq;
    private final float zzr;

    public zzd() {
        this(2500, 1, 1.0f);
    }

    public zzd(int v, int v1, float f) {
        this.zzo = v;
        this.zzq = v1;
        this.zzr = f;
    }

    @Override  // com.google.android.gms.internal.zzo
    public void zza(zzr zzr0) throws zzr {
        ++this.zzp;
        this.zzo = (int)(((float)this.zzo) + ((float)this.zzo) * this.zzr);
        if(!this.zzf()) {
            throw zzr0;
        }
    }

    @Override  // com.google.android.gms.internal.zzo
    public int zzd() {
        return this.zzo;
    }

    @Override  // com.google.android.gms.internal.zzo
    public int zze() {
        return this.zzp;
    }

    protected boolean zzf() {
        return this.zzp <= this.zzq;
    }
}

