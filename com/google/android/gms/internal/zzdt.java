package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzu;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import jeb.synthetic.FIN;

@zzgd
public class zzdt {
    static class zza {
        static int zzxc;
        static int zzxd;

        static {
            zza.zzxc = 60000;
            zza.zzxd = 10000;
        }
    }

    public interface zzb {
        void zzc(Object arg1);
    }

    public static class zzc implements zzb {
        @Override  // com.google.android.gms.internal.zzdt$zzb
        public void zzc(Object object0) {
        }
    }

    public static class zzd extends zzhy {
        private final Object zzqt;
        private final zze zzxe;
        private boolean zzxf;

        public zzd(zze zzdt$zze0) {
            this.zzqt = new Object();
            this.zzxe = zzdt$zze0;
        }

        public void release() {
            synchronized(this.zzqt) {
                if(this.zzxf) {
                    return;
                }
                this.zzxf = true;
                this.zza(new com.google.android.gms.internal.zzhx.zzc() {
                    public void zzb(zzbe zzbe0) {
                        com.google.android.gms.ads.internal.util.client.zzb.zzaB("Ending javascript session.");
                        ((zzbf)zzbe0).zzcg();
                    }
                }, new com.google.android.gms.internal.zzhx.zzb());
                this.zza(new com.google.android.gms.internal.zzhx.zzc() {
                    public void zzb(zzbe zzbe0) {
                        com.google.android.gms.ads.internal.util.client.zzb.zzaB("Releasing engine reference.");
                        zzd.this.zzxe.zzdW();
                    }
                }, new com.google.android.gms.internal.zzhx.zza() {
                    @Override  // com.google.android.gms.internal.zzhx$zza
                    public void run() {
                        zzd.this.zzxe.zzdW();
                    }
                });
            }
        }
    }

    public static class zze extends zzhy {
        private final Object zzqt;
        private zzb zzwQ;
        private boolean zzxh;
        private int zzxi;

        public zze(zzb zzdt$zzb0) {
            this.zzqt = new Object();
            this.zzwQ = zzdt$zzb0;
            this.zzxh = false;
            this.zzxi = 0;
        }

        public zzd zzdV() {
            zzd zzdt$zzd0 = new zzd(this);
            synchronized(this.zzqt) {
                this.zza(new com.google.android.gms.internal.zzhx.zzc() {
                    public void zza(zzbb zzbb0) {
                        com.google.android.gms.ads.internal.util.client.zzb.zzaB("Getting a new session for JS Engine.");
                        zzbf zzbf0 = zzbb0.zzce();
                        zzdt$zzd0.zzg(zzbf0);
                    }
                }, new com.google.android.gms.internal.zzhx.zza() {
                    @Override  // com.google.android.gms.internal.zzhx$zza
                    public void run() {
                        com.google.android.gms.ads.internal.util.client.zzb.zzaB("Rejecting reference for JS Engine.");
                        zzdt$zzd0.reject();
                    }
                });
                zzu.zzU(this.zzxi >= 0);
                ++this.zzxi;
                return zzdt$zzd0;
            }
        }

        protected void zzdW() {
            boolean z = true;
            synchronized(this.zzqt) {
                if(this.zzxi < 1) {
                    z = false;
                }
                zzu.zzU(z);
                com.google.android.gms.ads.internal.util.client.zzb.zzaB("Releasing 1 reference for JS Engine");
                --this.zzxi;
                this.zzdY();
            }
        }

        public void zzdX() {
            boolean z = true;
            synchronized(this.zzqt) {
                if(this.zzxi < 0) {
                    z = false;
                }
                zzu.zzU(z);
                com.google.android.gms.ads.internal.util.client.zzb.zzaB("Releasing root reference. JS Engine will be destroyed once other references are released.");
                this.zzxh = true;
                this.zzdY();
            }
        }

        protected void zzdY() {
            synchronized(this.zzqt) {
                zzu.zzU(this.zzxi >= 0);
                if(!this.zzxh || this.zzxi != 0) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaB("There are still references to the engine. Not destroying.");
                }
                else {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaB("No reference is left (including root). Cleaning up engine.");
                    this.zza(new com.google.android.gms.internal.zzhx.zzc() {
                        public void zza(zzbb zzbb0) {
                            zzhl.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    zze.this.zzwQ.zzc(zzbb0);
                                    zzbb0.destroy();
                                }
                            });
                        }
                    }, new com.google.android.gms.internal.zzhx.zzb());
                }
            }
        }
    }

    private final Context mContext;
    private final VersionInfoParcel zzoM;
    private final Object zzqt;
    private final String zzwO;
    private zzb zzwP;
    private zzb zzwQ;
    private zze zzwR;
    private int zzwS;

    public zzdt(Context context0, VersionInfoParcel versionInfoParcel0, String s) {
        this.zzqt = new Object();
        this.zzwS = 1;
        this.zzwO = s;
        this.mContext = context0.getApplicationContext();
        this.zzoM = versionInfoParcel0;
        this.zzwP = new zzc();
        this.zzwQ = new zzc();
    }

    public zzdt(Context context0, VersionInfoParcel versionInfoParcel0, String s, zzb zzdt$zzb0, zzb zzdt$zzb1) {
        this(context0, versionInfoParcel0, s);
        this.zzwP = zzdt$zzb0;
        this.zzwQ = zzdt$zzb1;
    }

    protected zzbb zza(Context context0, VersionInfoParcel versionInfoParcel0) {
        return new zzbd(context0, versionInfoParcel0);
    }

    private zze zzdS() {
        zze zzdt$zze0 = new zze(this.zzwQ);
        zzhl.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                zzbb zzbb0 = zzdt.this.zza(zzdt.this.mContext, zzdt.this.zzoM);
                zzbb0.zza(new com.google.android.gms.internal.zzbb.zza() {
                    @Override  // com.google.android.gms.internal.zzbb$zza
                    public void zzcf() {
                        new Timer().schedule(new TimerTask() {
                            @Override
                            public void run() {
                                Object object0 = zzdt.this.zzqt;
                                __monitor_enter(object0);
                                int v = FIN.finallyOpen$NT();
                                switch(com.google.android.gms.internal.zzdt.1.this.zzwT.getStatus()) {
                                    case -1: 
                                    case 1: {
                                        FIN.finallyCodeBegin$NT(v);
                                        __monitor_exit(object0);
                                        FIN.finallyCodeEnd$NT(v);
                                        return;
                                    }
                                    default: {
                                        com.google.android.gms.internal.zzdt.1.this.zzwT.reject();
                                        zzhl.runOnUiThread(new Runnable() {
                                            @Override
                                            public void run() {
                                                com.google.android.gms.internal.zzdt.1.1.this.zzwV.destroy();
                                            }
                                        });
                                        com.google.android.gms.ads.internal.util.client.zzb.zzaB("Could not receive loaded message in a timely manner. Rejecting.");
                                        FIN.finallyExec$NT(v);
                                    }
                                }
                            }
                        }, ((long)zza.zzxd));
                    }
                });
                zzbb0.zza("/jsLoaded", new zzdg() {
                    @Override  // com.google.android.gms.internal.zzdg
                    public void zza(zzid zzid0, Map map0) {
                        Object object0 = zzdt.this.zzqt;
                        __monitor_enter(object0);
                        int v = FIN.finallyOpen$NT();
                        switch(com.google.android.gms.internal.zzdt.1.this.zzwT.getStatus()) {
                            case -1: 
                            case 1: {
                                FIN.finallyCodeBegin$NT(v);
                                __monitor_exit(object0);
                                FIN.finallyCodeEnd$NT(v);
                                return;
                            }
                            default: {
                                zzdt.this.zzwS = 0;
                                zzdt.this.zzwP.zzc(zzbb0);
                                com.google.android.gms.internal.zzdt.1.this.zzwT.zzg(zzbb0);
                                zzdt.this.zzwR = com.google.android.gms.internal.zzdt.1.this.zzwT;
                                com.google.android.gms.ads.internal.util.client.zzb.zzaB("Successfully loaded JS Engine.");
                                FIN.finallyExec$NT(v);
                            }
                        }
                    }
                });
                zzhr zzhr0 = new zzhr();
                com.google.android.gms.internal.zzdt.1.3 zzdt$1$30 = new zzdg() {
                    @Override  // com.google.android.gms.internal.zzdg
                    public void zza(zzid zzid0, Map map0) {
                        synchronized(zzdt.this.zzqt) {
                            com.google.android.gms.ads.internal.util.client.zzb.zzaA("JS Engine is requesting an update");
                            if(zzdt.this.zzwS == 0) {
                                com.google.android.gms.ads.internal.util.client.zzb.zzaA("Starting reload.");
                                zzdt.this.zzwS = 2;
                                zzdt.this.zzdT();
                            }
                            zzbb0.zzb("/requestReload", ((zzdg)zzhr0.get()));
                        }
                    }
                };
                zzhr0.set(zzdt$1$30);
                zzbb0.zza("/requestReload", zzdt$1$30);
                if(zzdt.this.zzwO.endsWith(".js")) {
                    zzbb0.zzr(zzdt.this.zzwO);
                }
                else if(zzdt.this.zzwO.startsWith("<html>")) {
                    zzbb0.zzt(zzdt.this.zzwO);
                }
                else {
                    zzbb0.zzs(zzdt.this.zzwO);
                }
                new Timer().schedule(new TimerTask() {
                    @Override
                    public void run() {
                        Object object0 = zzdt.this.zzqt;
                        __monitor_enter(object0);
                        int v = FIN.finallyOpen$NT();
                        switch(com.google.android.gms.internal.zzdt.1.this.zzwT.getStatus()) {
                            case -1: 
                            case 1: {
                                FIN.finallyCodeBegin$NT(v);
                                __monitor_exit(object0);
                                FIN.finallyCodeEnd$NT(v);
                                return;
                            }
                            default: {
                                com.google.android.gms.internal.zzdt.1.this.zzwT.reject();
                                zzhl.runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        com.google.android.gms.internal.zzdt.1.4.this.zzwV.destroy();
                                    }
                                });
                                com.google.android.gms.ads.internal.util.client.zzb.zzaB("Could not receive loaded message in a timely manner. Rejecting.");
                                FIN.finallyExec$NT(v);
                            }
                        }
                    }
                }, ((long)zza.zzxc));
            }
        });
        return zzdt$zze0;
    }

    protected zze zzdT() {
        zze zzdt$zze0 = this.zzdS();
        zzdt$zze0.zza(new com.google.android.gms.internal.zzhx.zzc() {
            public void zza(zzbb zzbb0) {
                synchronized(zzdt.this.zzqt) {
                    zzdt.this.zzwS = 0;
                    if(zzdt.this.zzwR != null && zzdt$zze0 != zzdt.this.zzwR) {
                        com.google.android.gms.ads.internal.util.client.zzb.zzaB("New JS engine is loaded, marking previous one as destroyable.");
                        zzdt.this.zzwR.zzdX();
                    }
                    zzdt.this.zzwR = zzdt$zze0;
                }
            }
        }, new com.google.android.gms.internal.zzhx.zza() {
            @Override  // com.google.android.gms.internal.zzhx$zza
            public void run() {
                synchronized(zzdt.this.zzqt) {
                    zzdt.this.zzwS = 1;
                    com.google.android.gms.ads.internal.util.client.zzb.zzaB("Failed loading new engine. Marking new engine destroyable.");
                    zzdt$zze0.zzdX();
                }
            }
        });
        return zzdt$zze0;
    }

    public zzd zzdU() {
        zzd zzdt$zzd0;
        Object object0 = this.zzqt;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(this.zzwR == null || this.zzwR.getStatus() == -1) {
            this.zzwS = 2;
            this.zzwR = this.zzdT();
            zzdt$zzd0 = this.zzwR.zzdV();
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return zzdt$zzd0;
        }
        switch(this.zzwS) {
            case 0: {
                zzdt$zzd0 = this.zzwR.zzdV();
                FIN.finallyExec$NT(v);
                return zzdt$zzd0;
            }
            case 1: {
                this.zzwS = 2;
                this.zzdT();
                zzdt$zzd0 = this.zzwR.zzdV();
                FIN.finallyExec$NT(v);
                return zzdt$zzd0;
            }
            case 2: {
                zzdt$zzd0 = this.zzwR.zzdV();
                FIN.finallyExec$NT(v);
                return zzdt$zzd0;
            }
            default: {
                zzdt$zzd0 = this.zzwR.zzdV();
                FIN.finallyExec$NT(v);
                return zzdt$zzd0;
            }
        }
    }
}

