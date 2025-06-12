package com.google.android.gms.internal;

import java.io.IOException;

class zzas implements zzaq {
    private zzrg zznC;
    private byte[] zznD;
    private final int zznE;

    public zzas(int v) {
        this.zznE = v;
        this.reset();
    }

    @Override  // com.google.android.gms.internal.zzaq
    public void reset() {
        this.zznD = new byte[this.zznE];
        this.zznC = zzrg.zzA(this.zznD);
    }

    @Override  // com.google.android.gms.internal.zzaq
    public byte[] zzac() throws IOException {
        int v = this.zznC.zzBG();
        if(v < 0) {
            throw new IOException();
        }
        if(v == 0) {
            return this.zznD;
        }
        byte[] arr_b = new byte[this.zznD.length - v];
        System.arraycopy(this.zznD, 0, arr_b, 0, arr_b.length);
        return arr_b;
    }

    @Override  // com.google.android.gms.internal.zzaq
    public void zzb(int v, long v1) throws IOException {
        this.zznC.zzb(v, v1);
    }

    @Override  // com.google.android.gms.internal.zzaq
    public void zzb(int v, String s) throws IOException {
        this.zznC.zzb(v, s);
    }
}

