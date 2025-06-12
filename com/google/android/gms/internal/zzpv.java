package com.google.android.gms.internal;

public final class zzpv {
    public static final class zza {
        private boolean zzaOS;
        private boolean zzaOT;
        private final String zzaOU;
        private String zztd;

        public zza(String s) {
            this.zzaOS = true;
            this.zzaOT = false;
            this.zzaOU = s;
        }

        public zza zzap(boolean z) {
            this.zzaOS = z;
            return this;
        }

        public zza zzaq(boolean z) {
            this.zzaOT = z;
            return this;
        }

        public zza zzeS(String s) {
            this.zztd = s;
            return this;
        }

        public zzpv zzzW() {
            return new zzpv(this, null);
        }
    }

    private final boolean zzaOS;
    private final boolean zzaOT;
    private final String zzaOU;
    private final String zztd;

    private zzpv(zza zzpv$zza0) {
        this.zzaOU = zzpv$zza0.zzaOU;
        this.zzaOS = zzpv$zza0.zzaOS;
        this.zzaOT = zzpv$zza0.zzaOT;
        this.zztd = zzpv$zza0.zztd;
    }

    zzpv(zza zzpv$zza0, com.google.android.gms.internal.zzpv.1 zzpv$10) {
        this(zzpv$zza0);
    }

    public String getTrackingId() {
        return this.zztd;
    }

    public String zzzT() {
        return this.zzaOU;
    }

    public boolean zzzU() {
        return this.zzaOS;
    }

    public boolean zzzV() {
        return this.zzaOT;
    }

    class com.google.android.gms.internal.zzpv.1 {
    }

}

