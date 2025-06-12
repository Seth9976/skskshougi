package com.google.android.gms.common.internal;

import android.os.Looper;
import android.text.TextUtils;

public final class zzu {
    public static void zzU(boolean z) {
        if(!z) {
            throw new IllegalStateException();
        }
    }

    public static void zzV(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    public static int zza(int v, Object object0) {
        if(v == 0) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
        return v;
    }

    public static void zza(boolean z, Object object0) {
        if(!z) {
            throw new IllegalStateException(String.valueOf(object0));
        }
    }

    public static void zza(boolean z, String s, Object[] arr_object) {
        if(!z) {
            throw new IllegalStateException(String.format(s, arr_object));
        }
    }

    public static Object zzb(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException(String.valueOf(object1));
        }
        return object0;
    }

    public static void zzb(boolean z, Object object0) {
        if(!z) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
    }

    public static void zzb(boolean z, String s, Object[] arr_object) {
        if(!z) {
            throw new IllegalArgumentException(String.format(s, arr_object));
        }
    }

    public static void zzbY(String s) {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(s);
        }
    }

    public static void zzbZ(String s) {
        if(Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(s);
        }
    }

    public static int zzbw(int v) {
        if(v == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        return v;
    }

    public static String zzcj(String s) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return s;
    }

    public static String zzh(String s, Object object0) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException(String.valueOf(object0));
        }
        return s;
    }

    public static Object zzu(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("null reference");
        }
        return object0;
    }
}

