package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.PriorityQueue;

public class zzbp {
    public static class zza {
        final long value;
        final String zzrT;

        zza(long v, String s) {
            this.value = v;
            this.zzrT = s;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(Object other) {
            return other != null && other instanceof zza ? ((zza)other).value == this.value : false;
        }

        @Override
        public int hashCode() {
            return (int)this.value;
        }
    }

    static long zza(int v, int v1, long v2, long v3, long v4) {
        return ((v2 + 0x4000FFFFL - (((long)v) + 0x7FFFFFFFL) % 0x4000FFFFL * v3 % 0x4000FFFFL) % 0x4000FFFFL * v4 % 0x4000FFFFL + (((long)v1) + 0x7FFFFFFFL) % 0x4000FFFFL) % 0x4000FFFFL;
    }

    static long zza(long v, int v1) {
        switch(v1) {
            case 0: {
                return 1L;
            }
            case 1: {
                return v;
            }
            default: {
                return v1 % 2 == 0 ? zzbp.zza(v * v % 0x4000FFFFL, v1 / 2) % 0x4000FFFFL : zzbp.zza(v * v % 0x4000FFFFL, v1 / 2) % 0x4000FFFFL * v % 0x4000FFFFL;
            }
        }
    }

    static String zza(String[] arr_s, int v, int v1) {
        if(arr_s.length < v + v1) {
            zzb.zzaz("Unable to construct shingle");
            return "";
        }
        StringBuffer stringBuffer0 = new StringBuffer();
        for(int v2 = v; v2 < v + v1 - 1; ++v2) {
            stringBuffer0.append(arr_s[v2]);
            stringBuffer0.append(' ');
        }
        stringBuffer0.append(arr_s[v + v1 - 1]);
        return stringBuffer0.toString();
    }

    static void zza(int v, long v1, String s, PriorityQueue priorityQueue0) {
        zza zzbp$zza0 = new zza(v1, s);
        if((priorityQueue0.size() != v || ((zza)priorityQueue0.peek()).value <= zzbp$zza0.value) && !priorityQueue0.contains(zzbp$zza0)) {
            priorityQueue0.add(zzbp$zza0);
            if(priorityQueue0.size() > v) {
                priorityQueue0.poll();
            }
        }
    }

    public static void zza(String[] arr_s, int v, int v1, PriorityQueue priorityQueue0) {
        long v2 = zzbp.zzb(arr_s, 0, v1);
        zzbp.zza(v, v2, zzbp.zza(arr_s, 0, v1), priorityQueue0);
        long v3 = zzbp.zza(0x1001FFFL, v1 - 1);
        for(int v4 = 1; v4 < arr_s.length - v1 + 1; ++v4) {
            v2 = zzbp.zza(zzbn.zzB(arr_s[v4 - 1]), zzbn.zzB(arr_s[v4 + v1 - 1]), v2, v3, 0x1001FFFL);
            zzbp.zza(v, v2, zzbp.zza(arr_s, v4, v1), priorityQueue0);
        }
    }

    private static long zzb(String[] arr_s, int v, int v1) {
        long v2 = (((long)zzbn.zzB(arr_s[v])) + 0x7FFFFFFFL) % 0x4000FFFFL;
        for(int v3 = v + 1; v3 < v + v1; ++v3) {
            v2 = (v2 * 0x1001FFFL % 0x4000FFFFL + (((long)zzbn.zzB(arr_s[v3])) + 0x7FFFFFFFL) % 0x4000FFFFL) % 0x4000FFFFL;
        }
        return v2;
    }
}

