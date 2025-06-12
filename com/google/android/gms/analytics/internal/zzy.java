package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzkf;

public final class zzy {
    public static final class zza {
        private final Object zzLQ;
        private final zzkf zzLR;
        private Object zzLS;

        private zza(zzkf zzkf0, Object object0) {
            zzu.zzu(zzkf0);
            this.zzLR = zzkf0;
            this.zzLQ = object0;
        }

        public Object get() {
            return this.zzLS == null ? this.zzLQ : this.zzLS;
        }

        static zza zza(String s, float f) {
            return zza.zza(s, f, f);
        }

        static zza zza(String s, float f, float f1) {
            return new zza(zzkf.zza(s, f1), f);
        }

        static zza zza(String s, int v, int v1) {
            return new zza(zzkf.zza(s, v1), v);
        }

        static zza zza(String s, long v, long v1) {
            return new zza(zzkf.zza(s, v1), v);
        }

        static zza zza(String s, boolean z, boolean z1) {
            return new zza(zzkf.zzg(s, z1), Boolean.valueOf(z));
        }

        static zza zzc(String s, long v) {
            return zza.zza(s, v, v);
        }

        static zza zzd(String s, String s1, String s2) {
            return new zza(zzkf.zzs(s, s2), s1);
        }

        static zza zzd(String s, boolean z) {
            return zza.zza(s, z, z);
        }

        static zza zze(String s, int v) {
            return zza.zza(s, v, v);
        }

        static zza zzm(String s, String s1) {
            return zza.zzd(s, s1, s1);
        }
    }

    public static zza zzKZ;
    public static zza zzLA;
    public static zza zzLB;
    public static zza zzLC;
    public static zza zzLD;
    public static zza zzLE;
    public static zza zzLF;
    public static zza zzLG;
    public static zza zzLH;
    public static zza zzLI;
    public static zza zzLJ;
    public static zza zzLK;
    public static zza zzLL;
    public static zza zzLM;
    public static zza zzLN;
    public static zza zzLO;
    public static zza zzLP;
    public static zza zzLa;
    public static zza zzLb;
    public static zza zzLc;
    public static zza zzLd;
    public static zza zzLe;
    public static zza zzLf;
    public static zza zzLg;
    public static zza zzLh;
    public static zza zzLi;
    public static zza zzLj;
    public static zza zzLk;
    public static zza zzLl;
    public static zza zzLm;
    public static zza zzLn;
    public static zza zzLo;
    public static zza zzLp;
    public static zza zzLq;
    public static zza zzLr;
    public static zza zzLs;
    public static zza zzLt;
    public static zza zzLu;
    public static zza zzLv;
    public static zza zzLw;
    public static zza zzLx;
    public static zza zzLy;
    public static zza zzLz;

    static {
        zzy.zzKZ = zza.zzd("analytics.service_enabled", false);
        zzy.zzLa = zza.zzd("analytics.service_client_enabled", true);
        zzy.zzLb = zza.zzd("analytics.log_tag", "GAv4", "GAv4-SVC");
        zzy.zzLc = zza.zzc("analytics.max_tokens", 60L);
        zzy.zzLd = zza.zza("analytics.tokens_per_sec", 0.5f);
        zzy.zzLe = zza.zza("analytics.max_stored_hits", 2000, 20000);
        zzy.zzLf = zza.zze("analytics.max_stored_hits_per_app", 2000);
        zzy.zzLg = zza.zze("analytics.max_stored_properties_per_app", 100);
        zzy.zzLh = zza.zza("analytics.local_dispatch_millis", 1800000L, 120000L);
        zzy.zzLi = zza.zza("analytics.initial_local_dispatch_millis", 5000L, 5000L);
        zzy.zzLj = zza.zzc("analytics.min_local_dispatch_millis", 120000L);
        zzy.zzLk = zza.zzc("analytics.max_local_dispatch_millis", 7200000L);
        zzy.zzLl = zza.zzc("analytics.dispatch_alarm_millis", 7200000L);
        zzy.zzLm = zza.zzc("analytics.max_dispatch_alarm_millis", 32400000L);
        zzy.zzLn = zza.zze("analytics.max_hits_per_dispatch", 20);
        zzy.zzLo = zza.zze("analytics.max_hits_per_batch", 20);
        zzy.zzLp = zza.zzm("analytics.insecure_host", "http://www.google-analytics.com");
        zzy.zzLq = zza.zzm("analytics.secure_host", "https://ssl.google-analytics.com");
        zzy.zzLr = zza.zzm("analytics.simple_endpoint", "/collect");
        zzy.zzLs = zza.zzm("analytics.batching_endpoint", "/batch");
        zzy.zzLt = zza.zze("analytics.max_get_length", 0x7F4);
        zzy.zzLu = zza.zzd("analytics.batching_strategy.k", "BATCH_BY_COUNT", "BATCH_BY_COUNT");
        zzy.zzLv = zza.zzm("analytics.compression_strategy.k", "GZIP");
        zzy.zzLw = zza.zze("analytics.max_hits_per_request.k", 20);
        zzy.zzLx = zza.zze("analytics.max_hit_length.k", 0x2000);
        zzy.zzLy = zza.zze("analytics.max_post_length.k", 0x2000);
        zzy.zzLz = zza.zze("analytics.max_batch_post_length", 0x2000);
        zzy.zzLA = zza.zzm("analytics.fallback_responses.k", "404,502");
        zzy.zzLB = zza.zze("analytics.batch_retry_interval.seconds.k", 3600);
        zzy.zzLC = zza.zzc("analytics.service_monitor_interval", 86400000L);
        zzy.zzLD = zza.zze("analytics.http_connection.connect_timeout_millis", 60000);
        zzy.zzLE = zza.zze("analytics.http_connection.read_timeout_millis", 61000);
        zzy.zzLF = zza.zzc("analytics.campaigns.time_limit", 86400000L);
        zzy.zzLG = zza.zzm("analytics.first_party_experiment_id", "");
        zzy.zzLH = zza.zze("analytics.first_party_experiment_variant", 0);
        zzy.zzLI = zza.zzd("analytics.test.disable_receiver", false);
        zzy.zzLJ = zza.zza("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
        zzy.zzLK = zza.zzc("analytics.service_client.connect_timeout_millis", 5000L);
        zzy.zzLL = zza.zzc("analytics.service_client.second_connect_delay_millis", 5000L);
        zzy.zzLM = zza.zzc("analytics.service_client.unexpected_reconnect_millis", 60000L);
        zzy.zzLN = zza.zzc("analytics.service_client.reconnect_throttle_millis", 1800000L);
        zzy.zzLO = zza.zzc("analytics.monitoring.sample_period_millis", 86400000L);
        zzy.zzLP = zza.zzc("analytics.initialization_warning_threshold", 5000L);
    }
}

