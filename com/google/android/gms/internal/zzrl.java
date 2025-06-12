package com.google.android.gms.internal;

import java.util.Arrays;

public final class zzrl {
    public static final Object zzaWe;

    static {
        zzrl.zzaWe = new Object();
    }

    // 去混淆评级： 低(20)
    public static boolean equals(float[] field1, float[] field2) {
        return field1 != null && field1.length != 0 ? Arrays.equals(field1, field2) : field2 == null || field2.length == 0;
    }

    // 去混淆评级： 低(20)
    public static boolean equals(int[] field1, int[] field2) {
        return field1 != null && field1.length != 0 ? Arrays.equals(field1, field2) : field2 == null || field2.length == 0;
    }

    // 去混淆评级： 低(20)
    public static boolean equals(long[] field1, long[] field2) {
        return field1 != null && field1.length != 0 ? Arrays.equals(field1, field2) : field2 == null || field2.length == 0;
    }

    public static boolean equals(Object[] field1, Object[] field2) {
        int v = field1 == null ? 0 : field1.length;
        int v1 = field2 == null ? 0 : field2.length;
        int v2 = 0;
        for(int v3 = 0; true; ++v3) {
            if(v3 >= v || field1[v3] != null) {
                int v4;
                for(v4 = v2; v4 < v1 && field2[v4] == null; ++v4) {
                }
                int v5 = v3 < v ? 0 : 1;
                int v6 = v4 < v1 ? 0 : 1;
                if(v5 != 0 && v6 != 0) {
                    return true;
                }
                if(v5 != v6 || !field1[v3].equals(field2[v4])) {
                    break;
                }
                v2 = v4 + 1;
            }
        }
        return false;
    }

    public static int hashCode(float[] field) {
        return field != null && field.length != 0 ? Arrays.hashCode(field) : 0;
    }

    public static int hashCode(int[] field) {
        return field != null && field.length != 0 ? Arrays.hashCode(field) : 0;
    }

    public static int hashCode(long[] field) {
        return field != null && field.length != 0 ? Arrays.hashCode(field) : 0;
    }

    public static int hashCode(Object[] field) {
        int v = 0;
        int v1 = field == null ? 0 : field.length;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = field[v2];
            if(object0 != null) {
                v = v * 0x1F + object0.hashCode();
            }
        }
        return v;
    }

    public static int zza(byte[][] arr2_b) {
        int v = 0;
        int v1 = arr2_b == null ? 0 : arr2_b.length;
        for(int v2 = 0; v2 < v1; ++v2) {
            byte[] arr_b = arr2_b[v2];
            if(arr_b != null) {
                v = v * 0x1F + Arrays.hashCode(arr_b);
            }
        }
        return v;
    }

    public static void zza(zzrh zzrh0, zzrh zzrh1) {
        if(zzrh0.zzaVU != null) {
            zzrh1.zzaVU = zzrh0.zzaVU.zzBL();
        }
    }

    public static boolean zza(byte[][] arr2_b, byte[][] arr2_b1) {
        int v = arr2_b == null ? 0 : arr2_b.length;
        int v1 = arr2_b1 == null ? 0 : arr2_b1.length;
        int v2 = 0;
        for(int v3 = 0; true; ++v3) {
            if(v3 >= v || arr2_b[v3] != null) {
                int v4;
                for(v4 = v2; v4 < v1 && arr2_b1[v4] == null; ++v4) {
                }
                int v5 = v3 < v ? 0 : 1;
                int v6 = v4 < v1 ? 0 : 1;
                if(v5 != 0 && v6 != 0) {
                    return true;
                }
                if(v5 != v6 || !Arrays.equals(arr2_b[v3], arr2_b1[v4])) {
                    break;
                }
                v2 = v4 + 1;
            }
        }
        return false;
    }
}

