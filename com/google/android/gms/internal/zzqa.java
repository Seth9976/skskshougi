package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.tagmanager.zzbg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zzqa {
    public interface zza {
        void zza(zzqe arg1);
    }

    class zzb extends zzqn {
        final zzqa zzaPj;
        private final zza zzaPk;

        zzb(zzqd zzqd0, zzqb zzqb0, zza zzqa$zza0) {
            super(zzqd0, zzqb0);
            this.zzaPk = zzqa$zza0;
        }

        @Override  // com.google.android.gms.internal.zzqn
        protected com.google.android.gms.internal.zzqn.zzb zza(zzpy zzpy0) {
            return null;
        }

        @Override  // com.google.android.gms.internal.zzqn
        protected void zza(zzqe zzqe0) {
            com.google.android.gms.internal.zzqe.zza zzqe$zza0 = zzqe0.zzAg();
            zzqa.this.zza(zzqe$zza0);
            if(zzqe$zza0.getStatus() == Status.zzXP && zzqe$zza0.zzAh() == com.google.android.gms.internal.zzqe.zza.zza.zzaPu && zzqe$zza0.zzAi() != null && zzqe$zza0.zzAi().length > 0) {
                zzqa.this.zzaPe.zze(zzqe$zza0.zzAj().zzAb(), zzqe$zza0.zzAi());
                zzbg.zzaB("Resource successfully load from Network.");
                this.zzaPk.zza(zzqe0);
                return;
            }
            zzbg.zzaB(("Response status: " + (zzqe$zza0.getStatus().isSuccess() ? "SUCCESS" : "FAILURE")));
            if(zzqe$zza0.getStatus().isSuccess()) {
                zzbg.zzaB(("Response source: " + zzqe$zza0.zzAh().toString()));
                zzbg.zzaB(("Response size: " + zzqe$zza0.zzAi().length));
            }
            zzqa.this.zza(zzqe$zza0.zzAj(), this.zzaPk);
        }
    }

    static class zzc {
        private Object mData;
        private Status zzOt;
        private long zzaPl;

        public zzc(Status status0, Object object0, long v) {
            this.zzOt = status0;
            this.mData = object0;
            this.zzaPl = v;
        }

        public long zzAe() {
            return this.zzaPl;
        }

        public void zzO(Object object0) {
            this.mData = object0;
        }

        public void zzU(long v) {
            this.zzaPl = v;
        }

        public void zzaV(Status status0) {
            this.zzOt = status0;
        }
    }

    private final Context mContext;
    private String zzaLc;
    private final zzqh zzaPe;
    Map zzaPf;
    private final Map zzaPg;
    private final zzlb zzpw;

    public zzqa(Context context0) {
        this(context0, new HashMap(), new zzqh(context0), zzld.zzoQ());
    }

    zzqa(Context context0, Map map0, zzqh zzqh0, zzlb zzlb0) {
        this.zzaLc = null;
        this.zzaPf = new HashMap();
        this.mContext = context0;
        this.zzpw = zzlb0;
        this.zzaPe = zzqh0;
        this.zzaPg = map0;
    }

    private void zza(zzqd zzqd0, zza zzqa$zza0) {
        boolean z = true;
        List list0 = zzqd0.zzAf();
        if(list0.size() != 1) {
            z = false;
        }
        zzu.zzV(z);
        this.zza(((zzpy)list0.get(0)), zzqa$zza0);
    }

    void zza(zzpy zzpy0, zza zzqa$zza0) {
        String s = zzpy0.zzAb();
        zzqb zzqb0 = zzqc.zzaPm;
        com.google.android.gms.internal.zzqa.1 zzqa$10 = new zzqg() {
            @Override  // com.google.android.gms.internal.zzqg
            public void zza(Status status0, Object object0, Integer integer0, long v) {
                zzqe zzqe0 = new zzqe((status0.isSuccess() ? new com.google.android.gms.internal.zzqe.zza(Status.zzXP, zzpy0, null, ((com.google.android.gms.internal.zzqf.zzc)object0), (integer0 == zzqh.zzaPM ? com.google.android.gms.internal.zzqe.zza.zza.zzaPw : com.google.android.gms.internal.zzqe.zza.zza.zzaPv), v) : new com.google.android.gms.internal.zzqe.zza(new Status(16, "There is no valid resource for the container: " + zzpy0.getContainerId()), null, com.google.android.gms.internal.zzqe.zza.zza.zzaPv)));
                zzqa$zza0.zza(zzqe0);
            }
        };
        this.zzaPe.zza(s, zzpy0.zzzZ(), zzqb0, zzqa$10);
    }

    void zza(zzqd zzqd0, zza zzqa$zza0, zzqn zzqn0) {
        zzqp zzqp2;
        int v = 0;
        for(Object object0: zzqd0.zzAf()) {
            zzc zzqa$zzc0 = (zzc)this.zzaPf.get(((zzpy)object0).getContainerId());
            v = (zzqa$zzc0 == null ? this.zzaPe.zzfa(((zzpy)object0).getContainerId()) : zzqa$zzc0.zzAe()) + 900000L >= this.zzpw.currentTimeMillis() ? v : 1;
        }
        if(v != 0) {
            zzqp zzqp0 = (zzqp)this.zzaPg.get("");
            if(zzqp0 == null) {
                zzqp zzqp1 = this.zzaLc == null ? new zzqp() : new zzqp(this.zzaLc);
                this.zzaPg.put("", zzqp1);
                zzqp2 = zzqp1;
            }
            else {
                zzqp2 = zzqp0;
            }
            zzqp2.zza(this.mContext, zzqd0, 0L, zzqn0);
            return;
        }
        this.zza(zzqd0, zzqa$zza0);
    }

    void zza(com.google.android.gms.internal.zzqe.zza zzqe$zza0) {
        String s = zzqe$zza0.zzAj().getContainerId();
        Status status0 = zzqe$zza0.getStatus();
        com.google.android.gms.internal.zzqf.zzc zzqf$zzc0 = zzqe$zza0.zzAk();
        if(this.zzaPf.containsKey(s)) {
            zzc zzqa$zzc0 = (zzc)this.zzaPf.get(s);
            zzqa$zzc0.zzU(this.zzpw.currentTimeMillis());
            if(status0 == Status.zzXP) {
                zzqa$zzc0.zzaV(status0);
                zzqa$zzc0.zzO(zzqf$zzc0);
            }
            return;
        }
        this.zzaPf.put(s, new zzc(status0, zzqf$zzc0, this.zzpw.currentTimeMillis()));
    }

    public void zza(String s, Integer integer0, String s1, zza zzqa$zza0) {
        zzqd zzqd0 = new zzqd().zzb(new zzpy(s, integer0, s1, false));
        this.zza(zzqd0, zzqa$zza0, new zzb(this, zzqd0, zzqc.zzaPm, zzqa$zza0));
    }

    public void zzeU(String s) {
        this.zzaLc = s;
    }
}

