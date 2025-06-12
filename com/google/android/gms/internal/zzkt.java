package com.google.android.gms.internal;

public class zzkt {
    public static final int[] EMPTY_INTS;
    public static final long[] EMPTY_LONGS;
    public static final Object[] EMPTY_OBJECTS;

    static {
        zzkt.EMPTY_INTS = new int[0];
        zzkt.EMPTY_LONGS = new long[0];
        zzkt.EMPTY_OBJECTS = new Object[0];
    }

    public static int binarySearch(int[] array, int size, int value) {
        int v2 = 0;
        int v3 = size - 1;
        while(v2 <= v3) {
            int v4 = v2 + v3 >>> 1;
            int v5 = array[v4];
            if(v5 < value) {
                v2 = v4 + 1;
                continue;
            }
            if(v5 > value) {
                v3 = v4 - 1;
                continue;
            }
            return v4;
        }
        return ~v2;
    }

    // 去混淆评级： 低(20)
    public static boolean equal(Object a, Object b) {
        return a == b || a != null && a.equals(b);
    }
}

