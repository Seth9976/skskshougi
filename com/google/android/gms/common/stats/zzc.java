package com.google.android.gms.common.stats;

import com.google.android.gms.internal.zzkf;

public final class zzc {
    public static final class zza {
        public static zzkf zzact;
        public static zzkf zzacu;
        public static zzkf zzacv;
        public static zzkf zzacw;
        public static zzkf zzacx;
        public static zzkf zzacy;

        static {
            zza.zzact = zzkf.zza("gms:common:stats:connections:level", zzd.zzacz);
            zza.zzacu = zzkf.zzs("gms:common:stats:connections:ignored_calling_processes", "");
            zza.zzacv = zzkf.zzs("gms:common:stats:connections:ignored_calling_services", "");
            zza.zzacw = zzkf.zzs("gms:common:stats:connections:ignored_target_processes", "");
            zza.zzacx = zzkf.zzs("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
            zza.zzacy = zzkf.zza("gms:common:stats:connections:time_out_duration", 600000L);
        }
    }

    public static zzkf zzacr;
    public static zzkf zzacs;

    static {
        zzc.zzacr = zzkf.zzg("gms:common:stats:debug", false);
        zzc.zzacs = zzkf.zza("gms:common:stats:max_num_of_events", 100);
    }
}

