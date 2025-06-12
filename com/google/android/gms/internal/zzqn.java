package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.tagmanager.zzbg;

public abstract class zzqn {
    public static enum zza {
        NOT_AVAILABLE,
        IO_ERROR,
        SERVER_ERROR;

    }

    public class zzb {
        private final com.google.android.gms.internal.zzqe.zza.zza zzaPp;
        private final long zzaPr;
        private final Object zzaQa;

        public Object zzAH() {
            return this.zzaQa;
        }

        public com.google.android.gms.internal.zzqe.zza.zza zzAh() {
            return this.zzaPp;
        }

        public long zzAl() {
            return this.zzaPr;
        }
    }

    private zzqd zzaPU;
    private zzqb zzaPV;
    private zzlb zzpw;

    public zzqn(zzqd zzqd0, zzqb zzqb0) {
        this(zzqd0, zzqb0, zzld.zzoQ());
    }

    public zzqn(zzqd zzqd0, zzqb zzqb0, zzlb zzlb0) {
        boolean z = true;
        super();
        if(zzqd0.zzAf().size() != 1) {
            z = false;
        }
        zzu.zzV(z);
        this.zzaPU = zzqd0;
        this.zzaPV = zzqb0;
        this.zzpw = zzlb0;
    }

    protected abstract zzb zza(zzpy arg1);

    protected abstract void zza(zzqe arg1);

    public void zza(zza zzqn$zza0) {
        zzbg.zzaz(("ResourceManager: Failed to download a resource: " + zzqn$zza0.name()));
        zzpy zzpy0 = (zzpy)this.zzaPU.zzAf().get(0);
        zzb zzqn$zzb0 = this.zza(zzpy0);
        this.zza(new zzqe((zzqn$zzb0 == null || !(zzqn$zzb0.zzAH() instanceof zzc) ? new com.google.android.gms.internal.zzqe.zza(Status.zzXR, zzpy0, com.google.android.gms.internal.zzqe.zza.zza.zzaPu) : new com.google.android.gms.internal.zzqe.zza(Status.zzXP, zzpy0, null, ((zzc)zzqn$zzb0.zzAH()), zzqn$zzb0.zzAh(), zzqn$zzb0.zzAl()))));
    }

    public void zzu(byte[] arr_b) {
        Object object1;
        com.google.android.gms.internal.zzqe.zza.zza zzqe$zza$zza1;
        long v1;
        zzbg.zzaB("ResourceManager: Resource downloaded from Network: ");
        zzpy zzpy0 = (zzpy)this.zzaPU.zzAf().get(0);
        com.google.android.gms.internal.zzqe.zza.zza zzqe$zza$zza0 = com.google.android.gms.internal.zzqe.zza.zza.zzaPu;
        Object object0 = null;
        long v = 0L;
        try {
            object0 = this.zzaPV.zzt(arr_b);
            v = this.zzpw.currentTimeMillis();
            if(object0 == null) {
                zzbg.zzaA("Parsed resource from network is null");
                zzb zzqn$zzb0 = this.zza(zzpy0);
                if(zzqn$zzb0 != null) {
                    object0 = zzqn$zzb0.zzAH();
                    zzqe$zza$zza0 = zzqn$zzb0.zzAh();
                    v = zzqn$zzb0.zzAl();
                }
            }
            v1 = v;
            zzqe$zza$zza1 = zzqe$zza$zza0;
            object1 = object0;
        }
        catch(zzg unused_ex) {
            zzbg.zzaA("Resource from network is corrupted");
            zzb zzqn$zzb1 = this.zza(zzpy0);
            if(zzqn$zzb1 == null) {
                v1 = v;
                zzqe$zza$zza1 = zzqe$zza$zza0;
                object1 = object0;
            }
            else {
                v1 = v;
                zzqe$zza$zza1 = zzqn$zzb1.zzAh();
                object1 = zzqn$zzb1.zzAH();
            }
        }
        this.zza(new zzqe((object1 == null ? new com.google.android.gms.internal.zzqe.zza(Status.zzXR, zzpy0, com.google.android.gms.internal.zzqe.zza.zza.zzaPu) : new com.google.android.gms.internal.zzqe.zza(Status.zzXP, zzpy0, arr_b, ((zzc)object1), zzqe$zza$zza1, v1))));
    }
}

