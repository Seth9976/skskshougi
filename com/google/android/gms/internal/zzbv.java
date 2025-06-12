package com.google.android.gms.internal;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzo;

@zzgd
public abstract class zzbv implements zzbs {
    private final String zztw;
    private final Object zztx;

    private zzbv(String s, Object object0) {
        this.zztw = s;
        this.zztx = object0;
        zzo.zzbD().zza(this);
    }

    zzbv(String s, Object object0, com.google.android.gms.internal.zzbv.1 zzbv$10) {
        this(s, object0);
    }

    public Object get() {
        return zzo.zzbE().zzc(this);
    }

    public String getKey() {
        return this.zztw;
    }

    public static zzbv zzO(String s) {
        zzbv zzbv0 = zzbv.zzc(s, null);
        zzo.zzbD().zza(zzbv0);
        return zzbv0;
    }

    public static zzbv zzP(String s) {
        zzbv zzbv0 = zzbv.zzc(s, null);
        zzo.zzbD().zzb(zzbv0);
        return zzbv0;
    }

    public static zzbv zza(String s, int v) {
        return new zzbv(s, v) {
            {
                super(s, integer0, null);
            }

            @Override  // com.google.android.gms.internal.zzbv
            public Object zza(SharedPreferences sharedPreferences0) {
                return this.zzc(sharedPreferences0);
            }

            public Integer zzc(SharedPreferences sharedPreferences0) {
                return sharedPreferences0.getInt(this.getKey(), ((int)(((Integer)this.zzcY()))));
            }

            @Override  // com.google.android.gms.internal.zzbv
            public zzkf zzcZ() {
                return zzkf.zza(this.getKey(), ((Integer)this.zzcY()));
            }
        };
    }

    public static zzbv zza(String s, Boolean boolean0) {
        return new zzbv(s, boolean0) {
            {
                super(s, boolean0, null);
            }

            @Override  // com.google.android.gms.internal.zzbv
            public Object zza(SharedPreferences sharedPreferences0) {
                return this.zzb(sharedPreferences0);
            }

            public Boolean zzb(SharedPreferences sharedPreferences0) {
                return Boolean.valueOf(sharedPreferences0.getBoolean(this.getKey(), ((Boolean)this.zzcY()).booleanValue()));
            }

            @Override  // com.google.android.gms.internal.zzbv
            public zzkf zzcZ() {
                return zzkf.zzg(this.getKey(), ((Boolean)this.zzcY()).booleanValue());
            }
        };
    }

    protected abstract Object zza(SharedPreferences arg1);

    public static zzbv zzb(String s, long v) {
        return new zzbv(s, v) {
            {
                super(s, long0, null);
            }

            @Override  // com.google.android.gms.internal.zzbv
            public Object zza(SharedPreferences sharedPreferences0) {
                return this.zzd(sharedPreferences0);
            }

            @Override  // com.google.android.gms.internal.zzbv
            public zzkf zzcZ() {
                return zzkf.zza(this.getKey(), ((Long)this.zzcY()));
            }

            public Long zzd(SharedPreferences sharedPreferences0) {
                return sharedPreferences0.getLong(this.getKey(), ((long)(((Long)this.zzcY()))));
            }
        };
    }

    public static zzbv zzc(String s, String s1) {
        return new zzbv(s, s1) {
            {
                super(s, s1, null);
            }

            @Override  // com.google.android.gms.internal.zzbv
            public Object zza(SharedPreferences sharedPreferences0) {
                return this.zze(sharedPreferences0);
            }

            @Override  // com.google.android.gms.internal.zzbv
            public zzkf zzcZ() {
                return zzkf.zzs(this.getKey(), ((String)this.zzcY()));
            }

            public String zze(SharedPreferences sharedPreferences0) {
                return sharedPreferences0.getString(this.getKey(), ((String)this.zzcY()));
            }
        };
    }

    public Object zzcY() {
        return this.zztx;
    }

    public abstract zzkf zzcZ();
}

