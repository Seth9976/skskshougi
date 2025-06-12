package com.google.android.gms.internal;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class zzs {
    static class zza {
        static class com.google.android.gms.internal.zzs.zza.zza {
            public final String name;
            public final long time;
            public final long zzan;

            public com.google.android.gms.internal.zzs.zza.zza(String s, long v, long v1) {
                this.name = s;
                this.zzan = v;
                this.time = v1;
            }
        }

        public static final boolean zzak;
        private final List zzal;
        private boolean zzam;

        static {
            zza.zzak = zzs.DEBUG;
        }

        zza() {
            this.zzal = new ArrayList();
            this.zzam = false;
        }

        @Override
        protected void finalize() throws Throwable {
            if(!this.zzam) {
                this.zzd("Request on the loose");
                zzs.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        public void zza(String s, long v) {
            synchronized(this) {
                if(this.zzam) {
                    throw new IllegalStateException("Marker added to finished log");
                }
                com.google.android.gms.internal.zzs.zza.zza zzs$zza$zza0 = new com.google.android.gms.internal.zzs.zza.zza(s, v, SystemClock.elapsedRealtime());
                this.zzal.add(zzs$zza$zza0);
            }
        }

        public void zzd(String s) {
            synchronized(this) {
                this.zzam = true;
                long v1 = this.zzx();
                if(v1 > 0L) {
                    long v2 = ((com.google.android.gms.internal.zzs.zza.zza)this.zzal.get(0)).time;
                    zzs.zzb("(%-4d ms) %s", new Object[]{v1, s});
                    long v3 = v2;
                    for(Object object0: this.zzal) {
                        zzs.zzb("(+%-4d) [%2d] %s", new Object[]{((long)(((com.google.android.gms.internal.zzs.zza.zza)object0).time - v3)), ((com.google.android.gms.internal.zzs.zza.zza)object0).zzan, ((com.google.android.gms.internal.zzs.zza.zza)object0).name});
                        v3 = ((com.google.android.gms.internal.zzs.zza.zza)object0).time;
                    }
                }
            }
        }

        private long zzx() {
            if(this.zzal.size() == 0) {
                return 0L;
            }
            long v = ((com.google.android.gms.internal.zzs.zza.zza)this.zzal.get(0)).time;
            return ((com.google.android.gms.internal.zzs.zza.zza)this.zzal.get(this.zzal.size() - 1)).time - v;
        }
    }

    public static boolean DEBUG;
    public static String TAG;

    static {
        zzs.TAG = "Volley";
        zzs.DEBUG = Log.isLoggable("Volley", 2);
    }

    public static void zza(String s, Object[] arr_object) {
        if(zzs.DEBUG) {
            Log.v(zzs.TAG, zzs.zzd(s, arr_object));
        }
    }

    public static void zza(Throwable throwable0, String s, Object[] arr_object) {
        Log.e(zzs.TAG, zzs.zzd(s, arr_object), throwable0);
    }

    public static void zzb(String s, Object[] arr_object) {
        Log.d(zzs.TAG, zzs.zzd(s, arr_object));
    }

    public static void zzc(String s, Object[] arr_object) {
        Log.e("Volley", zzs.zzd(s, arr_object));
    }

    private static String zzd(String s, Object[] arr_object) {
        if(arr_object != null) {
            s = String.format(Locale.US, s, arr_object);
        }
        StackTraceElement[] arr_stackTraceElement = new Throwable().fillInStackTrace().getStackTrace();
        for(int v = 2; v < arr_stackTraceElement.length; ++v) {
            if(!arr_stackTraceElement[v].getClass().equals(zzs.class)) {
                String s1 = arr_stackTraceElement[v].getClassName();
                String s2 = s1.substring(s1.lastIndexOf(46) + 1);
                String s3 = s2.substring(s2.lastIndexOf(36) + 1) + "." + arr_stackTraceElement[v].getMethodName();
                return String.format(Locale.US, "[%d] %s: %s", Thread.currentThread().getId(), s3, s);
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Thread.currentThread().getId(), "<unknown>", s);
    }
}

