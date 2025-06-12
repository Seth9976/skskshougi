package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

public interface zzb {
    public static class zza {
        public byte[] data;
        public String zzb;
        public long zzc;
        public long zzd;
        public long zze;
        public long zzf;
        public Map zzg;

        public zza() {
            this.zzg = Collections.emptyMap();
        }

        public boolean zzb() {
            return this.zze < System.currentTimeMillis();
        }

        public boolean zzc() {
            return this.zzf < System.currentTimeMillis();
        }
    }

    zza zza(String arg1);

    void zza();

    void zza(String arg1, zza arg2);
}

