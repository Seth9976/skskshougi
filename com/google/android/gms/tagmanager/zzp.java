package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractPendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzaf.zzf;
import com.google.android.gms.internal.zzaf.zzj;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzqa;
import com.google.android.gms.internal.zzqe;

public class zzp extends AbstractPendingResult {
    interface zza {
        boolean zzb(Container arg1);
    }

    class zzb implements zzbf {
        final zzp zzaKZ;

        private zzb() {
        }

        zzb(com.google.android.gms.tagmanager.zzp.1 zzp$10) {
        }

        public void zza(com.google.android.gms.internal.zzpx.zza zzpx$zza0) {
            zzj zzaf$zzj0;
            if(zzpx$zza0.zzaPa == null) {
                zzf zzaf$zzf0 = zzpx$zza0.zziO;
                zzaf$zzj0 = new zzj();
                zzaf$zzj0.zziO = zzaf$zzf0;
                zzaf$zzj0.zziN = null;
                zzaf$zzj0.zziP = zzaf$zzf0.version;
            }
            else {
                zzaf$zzj0 = zzpx$zza0.zzaPa;
            }
            zzp.this.zza(zzaf$zzj0, zzpx$zza0.zzaOZ, true);
        }

        @Override  // com.google.android.gms.tagmanager.zzbf
        public void zza(com.google.android.gms.tagmanager.zzbf.zza zzbf$zza0) {
            if(!zzp.this.zzaKT) {
                zzp.this.zzR(0L);
            }
        }

        @Override  // com.google.android.gms.tagmanager.zzbf
        public void zzyv() {
        }

        @Override  // com.google.android.gms.tagmanager.zzbf
        public void zzz(Object object0) {
            this.zza(((com.google.android.gms.internal.zzpx.zza)object0));
        }
    }

    class zzc implements zzbf {
        final zzp zzaKZ;

        private zzc() {
        }

        zzc(com.google.android.gms.tagmanager.zzp.1 zzp$10) {
        }

        @Override  // com.google.android.gms.tagmanager.zzbf
        public void zza(com.google.android.gms.tagmanager.zzbf.zza zzbf$zza0) {
            synchronized(zzp.this) {
                if(!zzp.this.isReady()) {
                    if(zzp.this.zzaKS == null) {
                        ContainerHolder containerHolder0 = zzp.this.zzaU(Status.zzXS);
                        zzp.this.setResult(containerHolder0);
                    }
                    else {
                        zzp.this.setResult(zzp.this.zzaKS);
                    }
                }
            }
            zzp.this.zzR(3600000L);
        }

        public void zzb(zzj zzaf$zzj0) {
            synchronized(zzp.this) {
                if(zzaf$zzj0.zziO == null) {
                    if(zzp.this.zzaKU.zziO == null) {
                        zzbg.zzaz("Current resource is null; network resource is also null");
                        zzp.this.zzR(3600000L);
                        return;
                    }
                    zzaf$zzj0.zziO = zzp.this.zzaKU.zziO;
                }
                long v1 = zzp.this.zzpw.currentTimeMillis();
                zzp.this.zza(zzaf$zzj0, v1, false);
                zzbg.zzaB(("setting refresh time to current time: " + zzp.this.zzaKD));
                if(!zzp.this.zzyu()) {
                    zzp.this.zza(zzaf$zzj0);
                }
            }
        }

        @Override  // com.google.android.gms.tagmanager.zzbf
        public void zzyv() {
        }

        @Override  // com.google.android.gms.tagmanager.zzbf
        public void zzz(Object object0) {
            this.zzb(((zzj)object0));
        }
    }

    class zzd implements com.google.android.gms.tagmanager.zzo.zza {
        final zzp zzaKZ;

        private zzd() {
        }

        zzd(com.google.android.gms.tagmanager.zzp.1 zzp$10) {
        }

        @Override  // com.google.android.gms.tagmanager.zzo$zza
        public void zzej(String s) {
            zzp.this.zzej(s);
        }

        @Override  // com.google.android.gms.tagmanager.zzo$zza
        public String zzyo() {
            return zzp.this.zzyo();
        }

        @Override  // com.google.android.gms.tagmanager.zzo$zza
        public void zzyq() {
            if(zzp.this.zzaKO.zzkb()) {
                zzp.this.zzR(0L);
            }
        }
    }

    interface zze extends Releasable {
        void zza(zzbf arg1);

        void zzem(String arg1);

        void zzf(long arg1, String arg2);
    }

    interface com.google.android.gms.tagmanager.zzp.zzf extends Releasable {
        void zza(zzbf arg1);

        void zzb(com.google.android.gms.internal.zzpx.zza arg1);

        com.google.android.gms.internal.zzqf.zzc zziR(int arg1);

        void zzyw();
    }

    private final Context mContext;
    private final Looper zzWt;
    private long zzaKD;
    private final TagManager zzaKK;
    private final zzd zzaKN;
    private final zzcd zzaKO;
    private final int zzaKP;
    private com.google.android.gms.tagmanager.zzp.zzf zzaKQ;
    private zzqa zzaKR;
    private volatile zzo zzaKS;
    private volatile boolean zzaKT;
    private zzj zzaKU;
    private String zzaKV;
    private zze zzaKW;
    private zza zzaKX;
    private final String zzaKy;
    private final zzlb zzpw;

    zzp(Context context0, TagManager tagManager0, Looper looper0, String s, int v, com.google.android.gms.tagmanager.zzp.zzf zzp$zzf0, zze zzp$zze0, zzqa zzqa0, zzlb zzlb0, zzcd zzcd0) {
        super((looper0 == null ? Looper.getMainLooper() : looper0));
        this.mContext = context0;
        this.zzaKK = tagManager0;
        if(looper0 == null) {
            looper0 = Looper.getMainLooper();
        }
        this.zzWt = looper0;
        this.zzaKy = s;
        this.zzaKP = v;
        this.zzaKQ = zzp$zzf0;
        this.zzaKW = zzp$zze0;
        this.zzaKR = zzqa0;
        this.zzaKN = new zzd(this, null);
        this.zzaKU = new zzj();
        this.zzpw = zzlb0;
        this.zzaKO = zzcd0;
        if(this.zzyu()) {
            this.zzej(zzcb.zzzf().zzzh());
        }
    }

    public zzp(Context context0, TagManager tagManager0, Looper looper0, String s, int v, zzs zzs0) {
        this(context0, tagManager0, looper0, s, v, new zzcn(context0, s), new zzcm(context0, s, zzs0), new zzqa(context0), zzld.zzoQ(), new zzbe(30, 900000L, 5000L, "refreshing", zzld.zzoQ()));
        this.zzaKR.zzeU("https://www.googletagmanager.com");
    }

    @Override  // com.google.android.gms.common.api.AbstractPendingResult
    protected Result createFailedResult(Status x0) {
        return this.zzaU(x0);
    }

    public void load(String resourceIdParameterName) {
        zzqa zzqa0 = this.zzaKR;
        com.google.android.gms.tagmanager.zzp.1 zzp$10 = new com.google.android.gms.internal.zzqa.zza() {
            @Override  // com.google.android.gms.internal.zzqa$zza
            public void zza(zzqe zzqe0) {
                if(zzqe0.getStatus() != Status.zzXP) {
                    zzbg.zzaz(("Load request failed for the container " + zzp.this.zzaKy));
                    ContainerHolder containerHolder0 = zzp.this.zzaU(Status.zzXR);
                    zzp.this.setResult(containerHolder0);
                    return;
                }
                com.google.android.gms.internal.zzqf.zzc zzqf$zzc0 = zzqe0.zzAg().zzAk();
                if(zzqf$zzc0 == null) {
                    zzbg.zzaz("Response doesn\'t have the requested container");
                    Status status0 = new Status(8, "Response doesn\'t have the requested container", null);
                    ContainerHolder containerHolder1 = zzp.this.zzaU(status0);
                    zzp.this.setResult(containerHolder1);
                    return;
                }
                zzo zzo0 = new zzo(zzp.this.zzaKK, zzp.this.zzWt, new Container(zzp.this.mContext, zzp.this.zzaKK.getDataLayer(), zzp.this.zzaKy, zzqe0.zzAg().zzAl(), zzqf$zzc0), new com.google.android.gms.tagmanager.zzo.zza() {
                    @Override  // com.google.android.gms.tagmanager.zzo$zza
                    public void zzej(String s) {
                        zzp.this.zzej(s);
                    }

                    @Override  // com.google.android.gms.tagmanager.zzo$zza
                    public String zzyo() {
                        return zzp.this.zzyo();
                    }

                    @Override  // com.google.android.gms.tagmanager.zzo$zza
                    public void zzyq() {
                        if(zzp.this.zzaKO.zzkb()) {
                            zzp.this.load(com.google.android.gms.tagmanager.zzp.1.this.zzaKY);
                        }
                    }
                });
                zzp.this.zzaKS = zzo0;
                zzp.this.setResult(zzp.this.zzaKS);
            }
        };
        zzqa0.zza(this.zzaKy, (this.zzaKP == -1 ? null : this.zzaKP), resourceIdParameterName, zzp$10);
    }

    private void zzR(long v) {
        synchronized(this) {
            if(this.zzaKW == null) {
                zzbg.zzaC("Refresh requested, but no network load scheduler.");
            }
            else {
                this.zzaKW.zzf(v, this.zzaKU.zziP);
            }
        }
    }

    private void zza(zzj zzaf$zzj0) {
        synchronized(this) {
            if(this.zzaKQ != null) {
                com.google.android.gms.internal.zzpx.zza zzpx$zza0 = new com.google.android.gms.internal.zzpx.zza();
                zzpx$zza0.zzaOZ = this.zzaKD;
                zzpx$zza0.zziO = new zzf();
                zzpx$zza0.zzaPa = zzaf$zzj0;
                this.zzaKQ.zzb(zzpx$zza0);
            }
        }
    }

    private void zza(zzj zzaf$zzj0, long v, boolean z) {
        synchronized(this) {
            if(!z || !this.zzaKT) {
                boolean z1 = !this.isReady();
                this.zzaKU = zzaf$zzj0;
                this.zzaKD = v;
                this.zzR(Math.max(0L, Math.min(43200000L, this.zzaKD + 43200000L - this.zzpw.currentTimeMillis())));
                Container container0 = new Container(this.mContext, this.zzaKK.getDataLayer(), this.zzaKy, v, zzaf$zzj0);
                if(this.zzaKS == null) {
                    this.zzaKS = new zzo(this.zzaKK, this.zzWt, container0, this.zzaKN);
                }
                else {
                    this.zzaKS.zza(container0);
                }
                if(!this.isReady() && this.zzaKX.zzb(container0)) {
                    this.setResult(this.zzaKS);
                }
            }
        }
    }

    protected ContainerHolder zzaU(Status status0) {
        if(this.zzaKS != null) {
            return this.zzaKS;
        }
        if(status0 == Status.zzXS) {
            zzbg.zzaz("timer expired: setting result to failure");
        }
        return new zzo(status0);
    }

    private void zzam(boolean z) {
        this.zzaKQ.zza(new zzb(this, null));
        this.zzaKW.zza(new zzc(this, null));
        com.google.android.gms.internal.zzqf.zzc zzqf$zzc0 = this.zzaKQ.zziR(this.zzaKP);
        if(zzqf$zzc0 != null) {
            Container container0 = new Container(this.mContext, this.zzaKK.getDataLayer(), this.zzaKy, 0L, zzqf$zzc0);
            this.zzaKS = new zzo(this.zzaKK, this.zzWt, container0, this.zzaKN);
        }
        this.zzaKX = new zza() {
            // 去混淆评级： 低(30)
            @Override  // com.google.android.gms.tagmanager.zzp$zza
            public boolean zzb(Container container0) {
                return z ? container0.getLastRefreshTime() + 43200000L >= zzp.this.zzpw.currentTimeMillis() : !container0.isDefault();
            }
        };
        if(this.zzyu()) {
            this.zzaKW.zzf(0L, "");
            return;
        }
        this.zzaKQ.zzyw();
    }

    void zzej(String s) {
        synchronized(this) {
            this.zzaKV = s;
            if(this.zzaKW != null) {
                this.zzaKW.zzem(s);
            }
        }
    }

    String zzyo() {
        synchronized(this) {
        }
        return this.zzaKV;
    }

    public void zzyr() {
        com.google.android.gms.internal.zzqf.zzc zzqf$zzc0 = this.zzaKQ.zziR(this.zzaKP);
        if(zzqf$zzc0 == null) {
            zzbg.zzaz("Default was requested, but no default container was found");
            this.setResult(this.zzaU(new Status(10, "Default was requested, but no default container was found", null)));
        }
        else {
            Container container0 = new Container(this.mContext, this.zzaKK.getDataLayer(), this.zzaKy, 0L, zzqf$zzc0);
            com.google.android.gms.tagmanager.zzp.2 zzp$20 = new com.google.android.gms.tagmanager.zzo.zza() {
                @Override  // com.google.android.gms.tagmanager.zzo$zza
                public void zzej(String s) {
                    zzp.this.zzej(s);
                }

                @Override  // com.google.android.gms.tagmanager.zzo$zza
                public String zzyo() {
                    return zzp.this.zzyo();
                }

                @Override  // com.google.android.gms.tagmanager.zzo$zza
                public void zzyq() {
                    zzbg.zzaC("Refresh ignored: container loaded as default only.");
                }
            };
            this.setResult(new zzo(this.zzaKK, this.zzWt, container0, zzp$20));
        }
        this.zzaKW = null;
        this.zzaKQ = null;
    }

    public void zzys() {
        this.zzam(false);
    }

    public void zzyt() {
        this.zzam(true);
    }

    private boolean zzyu() {
        zzcb zzcb0 = zzcb.zzzf();
        return (zzcb0.zzzg() == com.google.android.gms.tagmanager.zzcb.zza.zzaMJ || zzcb0.zzzg() == com.google.android.gms.tagmanager.zzcb.zza.zzaMK) && this.zzaKy.equals(zzcb0.getContainerId());
    }
}

