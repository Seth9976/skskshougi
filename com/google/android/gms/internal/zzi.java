package com.google.android.gms.internal;

import java.util.Map;

public class zzi {
    public final byte[] data;
    public final int statusCode;
    public final Map zzA;
    public final boolean zzB;
    public final long zzC;

    public zzi(int v, byte[] arr_b, Map map0, boolean z, long v1) {
        this.statusCode = v;
        this.data = arr_b;
        this.zzA = map0;
        this.zzB = z;
        this.zzC = v1;
    }

    public zzi(byte[] arr_b, Map map0) {
        this(200, arr_b, map0, false, 0L);
    }
}

