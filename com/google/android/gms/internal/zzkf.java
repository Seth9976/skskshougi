package com.google.android.gms.internal;

import android.os.Binder;

public abstract class zzkf {
    interface zza {
        Long getLong(String arg1, Long arg2);

        String getString(String arg1, String arg2);

        Boolean zzb(String arg1, Boolean arg2);

        Float zzb(String arg1, Float arg2);

        Integer zzb(String arg1, Integer arg2);
    }

    private Object zzLS;
    private static zza zzYj;
    private static int zzYk;
    private static String zzYl;
    private static final Object zzoW;
    protected final String zztw;
    protected final Object zztx;

    static {
        zzkf.zzoW = new Object();
        zzkf.zzYj = null;
        zzkf.zzYk = 0;
        zzkf.zzYl = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    }

    protected zzkf(String s, Object object0) {
        this.zzLS = null;
        this.zztw = s;
        this.zztx = object0;
    }

    public final Object get() {
        return this.zzLS == null ? this.zzbP(this.zztw) : this.zzLS;
    }

    public static boolean isInitialized() {
        return zzkf.zzYj != null;
    }

    public static zzkf zza(String s, Float float0) {
        return new zzkf(s, float0) {
            protected Float zzbT(String s) {
                return zzkf.zzYj.zzb(this.zztw, ((Float)this.zztx));
            }
        };
    }

    public static zzkf zza(String s, Integer integer0) {
        return new zzkf(s, integer0) {
            protected Integer zzbS(String s) {
                return zzkf.zzYj.zzb(this.zztw, ((Integer)this.zztx));
            }
        };
    }

    public static zzkf zza(String s, Long long0) {
        return new zzkf(s, long0) {
            protected Long zzbR(String s) {
                return zzkf.zzYj.getLong(this.zztw, ((Long)this.zztx));
            }
        };
    }

    protected abstract Object zzbP(String arg1);

    public static zzkf zzg(String s, boolean z) {
        return new zzkf(s, Boolean.valueOf(z)) {
            protected Boolean zzbQ(String s) {
                return zzkf.zzYj.zzb(this.zztw, ((Boolean)this.zztx));
            }
        };
    }

    public static int zzmY() {
        return zzkf.zzYk;
    }

    public final Object zzmZ() {
        long v = Binder.clearCallingIdentity();
        try {
            return this.get();
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
    }

    public static zzkf zzs(String s, String s1) {
        return new zzkf(s, s1) {
            protected String zzbU(String s) {
                return zzkf.zzYj.getString(this.zztw, ((String)this.zztx));
            }
        };
    }
}

