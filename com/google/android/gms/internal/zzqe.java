package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class zzqe implements Result {
    public static class zza {
        public static enum com.google.android.gms.internal.zzqe.zza.zza {
            NETWORK,
            DISK,
            DEFAULT;

        }

        private final Status zzOt;
        private final com.google.android.gms.internal.zzqe.zza.zza zzaPp;
        private final byte[] zzaPq;
        private final long zzaPr;
        private final zzpy zzaPs;
        private final zzc zzaPt;

        public zza(Status status0, zzpy zzpy0, com.google.android.gms.internal.zzqe.zza.zza zzqe$zza$zza0) {
            this(status0, zzpy0, null, null, zzqe$zza$zza0, 0L);
        }

        public zza(Status status0, zzpy zzpy0, byte[] arr_b, zzc zzqf$zzc0, com.google.android.gms.internal.zzqe.zza.zza zzqe$zza$zza0, long v) {
            this.zzOt = status0;
            this.zzaPs = zzpy0;
            this.zzaPq = arr_b;
            this.zzaPt = zzqf$zzc0;
            this.zzaPp = zzqe$zza$zza0;
            this.zzaPr = v;
        }

        public Status getStatus() {
            return this.zzOt;
        }

        public com.google.android.gms.internal.zzqe.zza.zza zzAh() {
            return this.zzaPp;
        }

        public byte[] zzAi() {
            return this.zzaPq;
        }

        public zzpy zzAj() {
            return this.zzaPs;
        }

        public zzc zzAk() {
            return this.zzaPt;
        }

        public long zzAl() {
            return this.zzaPr;
        }
    }

    private final zza zzaPo;

    public zzqe(zza zzqe$zza0) {
        this.zzaPo = zzqe$zza0;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzaPo.getStatus();
    }

    public zza zzAg() {
        return this.zzaPo;
    }
}

