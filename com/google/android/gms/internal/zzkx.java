package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzt;
import java.util.ArrayList;

public final class zzkx {
    public static int zza(Object[] arr_object, Object object0) {
        int v1 = arr_object == null ? 0 : arr_object.length;
        for(int v = 0; v < v1; ++v) {
            if(zzt.equal(arr_object[v], object0)) {
                return v;
            }
        }
        return -1;
    }

    public static void zza(StringBuilder stringBuilder0, double[] arr_f) {
        for(int v = 0; v < arr_f.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(Double.toString(arr_f[v]));
        }
    }

    public static void zza(StringBuilder stringBuilder0, float[] arr_f) {
        for(int v = 0; v < arr_f.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(Float.toString(arr_f[v]));
        }
    }

    public static void zza(StringBuilder stringBuilder0, int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(Integer.toString(arr_v[v]));
        }
    }

    public static void zza(StringBuilder stringBuilder0, long[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(Long.toString(arr_v[v]));
        }
    }

    public static void zza(StringBuilder stringBuilder0, Object[] arr_object) {
        for(int v = 0; v < arr_object.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(arr_object[v].toString());
        }
    }

    public static void zza(StringBuilder stringBuilder0, String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append("\"").append(arr_s[v]).append("\"");
        }
    }

    public static void zza(StringBuilder stringBuilder0, boolean[] arr_z) {
        for(int v = 0; v < arr_z.length; ++v) {
            if(v != 0) {
                stringBuilder0.append(",");
            }
            stringBuilder0.append(Boolean.toString(arr_z[v]));
        }
    }

    public static Integer[] zza(int[] arr_v) {
        if(arr_v == null) {
            return null;
        }
        Integer[] arr_integer = new Integer[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_integer[v] = (int)arr_v[v];
        }
        return arr_integer;
    }

    public static ArrayList zzb(Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            arrayList0.add(arr_object[v]);
        }
        return arrayList0;
    }

    public static boolean zzb(Object[] arr_object, Object object0) {
        return zzkx.zza(arr_object, object0) >= 0;
    }

    public static ArrayList zzoP() {
        return new ArrayList();
    }
}

