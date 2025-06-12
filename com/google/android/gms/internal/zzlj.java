package com.google.android.gms.internal;

public class zzlj {
    public static int zza(byte[] arr_b, int v, int v1, int v2) {
        int v7;
        int v8;
        int v3 = v + (v1 & -4);
        int v4 = v2;
        while(v < v3) {
            int v5 = (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16 | arr_b[v + 3] << 24) * 0xCC9E2D51;
            int v6 = (v5 >>> 17 | v5 << 15) * 461845907 ^ v4;
            v4 = -430675100 + (v6 >>> 19 | v6 << 13) * 5;
            v += 4;
        }
        switch(v1 & 3) {
            case 1: {
                v8 = (arr_b[v3] & 0xFF) * 0xCC9E2D51;
                v7 = (v8 >>> 17 | v8 << 15) * 461845907 ^ v4;
                break;
            }
            case 2: {
                v8 = ((arr_b[v3 + 1] & 0xFF) << 8 | arr_b[v3] & 0xFF) * 0xCC9E2D51;
                v7 = (v8 >>> 17 | v8 << 15) * 461845907 ^ v4;
                break;
            }
            case 3: {
                v8 = ((arr_b[v3 + 2] & 0xFF) << 16 | (arr_b[v3 + 1] & 0xFF) << 8 | arr_b[v3] & 0xFF) * 0xCC9E2D51;
                v7 = (v8 >>> 17 | v8 << 15) * 461845907 ^ v4;
                break;
            }
            default: {
                v7 = v4;
            }
        }
        int v9 = (v7 ^ v1 ^ (v7 ^ v1) >>> 16) * -2048144789;
        int v10 = (v9 ^ v9 >>> 13) * -1028477387;
        return v10 ^ v10 >>> 16;
    }
}

