package com.google.android.gms.internal;

import java.io.IOException;

public final class zzrq {
    public static final int[] zzaWh;
    public static final long[] zzaWi;
    public static final float[] zzaWj;
    public static final double[] zzaWk;
    public static final boolean[] zzaWl;
    public static final String[] zzaWm;
    public static final byte[][] zzaWn;
    public static final byte[] zzaWo;

    static {
        zzrq.zzaWh = new int[0];
        zzrq.zzaWi = new long[0];
        zzrq.zzaWj = new float[0];
        zzrq.zzaWk = new double[0];
        zzrq.zzaWl = new boolean[0];
        zzrq.zzaWm = new String[0];
        zzrq.zzaWn = new byte[0][];
        zzrq.zzaWo = new byte[0];
    }

    static int zzD(int v, int v1) {
        return v << 3 | v1;
    }

    public static final int zzb(zzrf zzrf0, int v) throws IOException {
        int v1 = 1;
        int v2 = zzrf0.getPosition();
        zzrf0.zzkA(v);
        while(zzrf0.zzBr() == v) {
            zzrf0.zzkA(v);
            ++v1;
        }
        zzrf0.zzkE(v2);
        return v1;
    }

    static int zzkU(int v) [...] // Inlined contents

    public static int zzkV(int v) [...] // Inlined contents
}

