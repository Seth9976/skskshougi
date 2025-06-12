package com.google.android.gms.internal;

public class zzre {
    private final byte[] zzaVH;
    private int zzaVI;
    private int zzaVJ;

    public zzre(byte[] arr_b) {
        this.zzaVH = new byte[0x100];
        for(int v = 0; v < 0x100; ++v) {
            this.zzaVH[v] = (byte)v;
        }
        int v1 = 0;
        for(int v2 = 0; v2 < 0x100; ++v2) {
            v1 = v1 + this.zzaVH[v2] + arr_b[v2 % arr_b.length] & 0xFF;
            byte b = this.zzaVH[v2];
            this.zzaVH[v2] = this.zzaVH[v1];
            this.zzaVH[v1] = b;
        }
        this.zzaVI = 0;
        this.zzaVJ = 0;
    }

    public void zzy(byte[] arr_b) {
        int v = this.zzaVI;
        int v1 = this.zzaVJ;
        for(int v2 = 0; v2 < arr_b.length; ++v2) {
            v = v + 1 & 0xFF;
            v1 = v1 + this.zzaVH[v] & 0xFF;
            byte b = this.zzaVH[v];
            this.zzaVH[v] = this.zzaVH[v1];
            this.zzaVH[v1] = b;
            arr_b[v2] = (byte)(arr_b[v2] ^ this.zzaVH[this.zzaVH[v] + this.zzaVH[v1] & 0xFF]);
        }
        this.zzaVI = v;
        this.zzaVJ = v1;
    }
}

