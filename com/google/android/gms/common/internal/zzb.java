package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;

public final class zzb {
    public static void zzU(boolean z) {
        if(!z) {
            throw new IllegalStateException();
        }
    }

    public static void zza(boolean z, Object object0) {
        if(!z) {
            throw new IllegalStateException(String.valueOf(object0));
        }
    }

    public static void zzbY(String s) {
        if(Looper.getMainLooper().getThread() != Thread.currentThread()) {
            Log.e("Asserts", "checkMainThread: current thread " + Thread.currentThread() + " IS NOT the main thread " + Looper.getMainLooper().getThread() + "!");
            throw new IllegalStateException(s);
        }
    }

    public static void zzbZ(String s) {
        if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Log.e("Asserts", "checkNotMainThread: current thread " + Thread.currentThread() + " IS the main thread " + Looper.getMainLooper().getThread() + "!");
            throw new IllegalStateException(s);
        }
    }

    public static void zzq(Object object0) {
        if(object0 == null) {
            throw new IllegalArgumentException("null reference");
        }
    }
}

