package com.google.android.gms.internal;

import java.io.IOException;

public abstract class zzrn {
    protected volatile int zzaWf;

    public zzrn() {
        this.zzaWf = -1;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.zzBK();
    }

    @Override
    public String toString() {
        return zzro.zzg(this);
    }

    protected int zzB() {
        return 0;
    }

    public zzrn zzBK() throws CloneNotSupportedException {
        return (zzrn)super.clone();
    }

    public int zzBU() {
        if(this.zzaWf < 0) {
            this.zzBV();
        }
        return this.zzaWf;
    }

    public int zzBV() {
        int v = this.zzB();
        this.zzaWf = v;
        return v;
    }

    public static final zzrn zza(zzrn zzrn0, byte[] arr_b) throws zzrm {
        return zzrn.zzb(zzrn0, arr_b, 0, arr_b.length);
    }

    public static final void zza(zzrn zzrn0, byte[] arr_b, int v, int v1) {
        try {
            zzrg zzrg0 = zzrg.zzb(arr_b, v, v1);
            zzrn0.zza(zzrg0);
            zzrg0.zzBH();
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", iOException0);
        }
    }

    public void zza(zzrg zzrg0) throws IOException {
    }

    public static final zzrn zzb(zzrn zzrn0, byte[] arr_b, int v, int v1) throws zzrm {
        try {
            zzrf zzrf0 = zzrf.zza(arr_b, v, v1);
            zzrn0.zzb(zzrf0);
            zzrf0.zzkz(0);
            return zzrn0;
        }
        catch(zzrm zzrm0) {
            throw zzrm0;
        }
        catch(IOException unused_ex) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public abstract zzrn zzb(zzrf arg1) throws IOException;

    public static final byte[] zzf(zzrn zzrn0) {
        byte[] arr_b = new byte[zzrn0.zzBV()];
        zzrn.zza(zzrn0, arr_b, 0, arr_b.length);
        return arr_b;
    }
}

