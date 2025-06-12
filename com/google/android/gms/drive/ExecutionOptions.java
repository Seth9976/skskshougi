package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.drive.internal.zzs;

public final class ExecutionOptions {
    public static final class Builder {
        private String zzadn;
        private boolean zzado;
        private int zzadp;

        public Builder() {
            this.zzadp = 0;
        }

        public ExecutionOptions build() {
            if(this.zzadp == 1 && !this.zzado) {
                throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
            }
            return new ExecutionOptions(this.zzadn, this.zzado, this.zzadp);
        }

        public Builder setConflictStrategy(int strategy) {
            if(!ExecutionOptions.zzbY(strategy)) {
                throw new IllegalArgumentException("Unrecognized value for conflict strategy: " + strategy);
            }
            this.zzadp = strategy;
            return this;
        }

        public Builder setNotifyOnCompletion(boolean notify) {
            this.zzado = notify;
            return this;
        }

        public Builder setTrackingTag(String trackingTag) {
            if(!ExecutionOptions.zzct(trackingTag)) {
                throw new IllegalArgumentException("trackingTag must not be null nor empty, and the length must be <= the maximum length (65536)");
            }
            this.zzadn = trackingTag;
            return this;
        }
    }

    public static final int CONFLICT_STRATEGY_KEEP_REMOTE = 1;
    public static final int CONFLICT_STRATEGY_OVERWRITE_REMOTE = 0;
    public static final int MAX_TRACKING_TAG_STRING_LENGTH = 0x10000;
    private final String zzadn;
    private final boolean zzado;
    private final int zzadp;

    public ExecutionOptions(String trackingTag, boolean notifyOnCompletion, int conflictStrategy) {
        this.zzadn = trackingTag;
        this.zzado = notifyOnCompletion;
        this.zzadp = conflictStrategy;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object o) {
        return o != null && o.getClass() == this.getClass() ? o == this || zzt.equal(this.zzadn, ((ExecutionOptions)o).zzadn) && this.zzadp == ((ExecutionOptions)o).zzadp && this.zzado == ((ExecutionOptions)o).zzado : false;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzadn, this.zzadp, Boolean.valueOf(this.zzado)});
    }

    public static void zza(GoogleApiClient googleApiClient0, ExecutionOptions executionOptions0) {
        if(executionOptions0.zzpj() && !((zzs)googleApiClient0.zza(Drive.zzNX)).zzpE()) {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
        }
    }

    public static boolean zzbX(int v) {
        return v == 1;
    }

    public static boolean zzbY(int v) {
        return v == 0 || v == 1;
    }

    public static boolean zzct(String s) {
        return s != null && !s.isEmpty() && s.length() <= 0x10000;
    }

    public String zzpi() {
        return this.zzadn;
    }

    public boolean zzpj() {
        return this.zzado;
    }

    public int zzpk() {
        return this.zzadp;
    }
}

