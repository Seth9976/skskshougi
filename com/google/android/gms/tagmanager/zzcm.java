package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class zzcm implements zze {
    interface zza {
        zzcl zza(zzs arg1);
    }

    interface zzb {
        ScheduledExecutorService zzzm();
    }

    private boolean mClosed;
    private final Context mContext;
    private String zzaKV;
    private final String zzaKy;
    private zzbf zzaMU;
    private zzs zzaMV;
    private final ScheduledExecutorService zzaMX;
    private final zza zzaMY;
    private ScheduledFuture zzaMZ;

    public zzcm(Context context0, String s, zzs zzs0) {
        this(context0, s, zzs0, null, null);
    }

    zzcm(Context context0, String s, zzs zzs0, zzb zzcm$zzb0, zza zzcm$zza0) {
        this.zzaMV = zzs0;
        this.mContext = context0;
        this.zzaKy = s;
        if(zzcm$zzb0 == null) {
            zzcm$zzb0 = new zzb() {
                @Override  // com.google.android.gms.tagmanager.zzcm$zzb
                public ScheduledExecutorService zzzm() {
                    return Executors.newSingleThreadScheduledExecutor();
                }
            };
        }
        this.zzaMX = zzcm$zzb0.zzzm();
        if(zzcm$zza0 == null) {
            this.zzaMY = new zza() {
                @Override  // com.google.android.gms.tagmanager.zzcm$zza
                public zzcl zza(zzs zzs0) {
                    return new zzcl(zzcm.this.mContext, zzcm.this.zzaKy, zzs0);
                }
            };
            return;
        }
        this.zzaMY = zzcm$zza0;
    }

    @Override  // com.google.android.gms.common.api.Releasable
    public void release() {
        synchronized(this) {
            this.zzzl();
            if(this.zzaMZ != null) {
                this.zzaMZ.cancel(false);
            }
            this.zzaMX.shutdown();
            this.mClosed = true;
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzp$zze
    public void zza(zzbf zzbf0) {
        synchronized(this) {
            this.zzzl();
            this.zzaMU = zzbf0;
        }
    }

    private zzcl zzeC(String s) {
        zzcl zzcl0 = this.zzaMY.zza(this.zzaMV);
        zzcl0.zza(this.zzaMU);
        zzcl0.zzem(this.zzaKV);
        zzcl0.zzeB(s);
        return zzcl0;
    }

    @Override  // com.google.android.gms.tagmanager.zzp$zze
    public void zzem(String s) {
        synchronized(this) {
            this.zzzl();
            this.zzaKV = s;
        }
    }

    @Override  // com.google.android.gms.tagmanager.zzp$zze
    public void zzf(long v, String s) {
        synchronized(this) {
            zzbg.zzaB(("loadAfterDelay: containerId=" + this.zzaKy + " delay=" + v));
            this.zzzl();
            if(this.zzaMU == null) {
                throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
            }
            if(this.zzaMZ != null) {
                this.zzaMZ.cancel(false);
            }
            zzcl zzcl0 = this.zzeC(s);
            this.zzaMZ = this.zzaMX.schedule(zzcl0, v, TimeUnit.MILLISECONDS);
        }
    }

    private void zzzl() {
        synchronized(this) {
            if(this.mClosed) {
                throw new IllegalStateException("called method after closed");
            }
        }
    }
}

