package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;

@zzgd
public final class zzeb implements zza {
    private final Context mContext;
    private final VersionInfoParcel zzoM;
    private final zzef zzoq;
    private final AdRequestParcel zzph;
    private final Object zzqt;
    private final String zzxQ;
    private final long zzxR;
    private final zzdx zzxS;
    private final AdSizeParcel zzxT;
    private zzeg zzxU;
    private int zzxV;

    public zzeb(Context context0, String s, zzef zzef0, zzdy zzdy0, zzdx zzdx0, AdRequestParcel adRequestParcel0, AdSizeParcel adSizeParcel0, VersionInfoParcel versionInfoParcel0) {
        this.zzqt = new Object();
        this.zzxV = -2;
        this.mContext = context0;
        this.zzoq = zzef0;
        this.zzxS = zzdx0;
        this.zzxQ = "com.google.ads.mediation.customevent.CustomEventAdapter".equals(s) ? this.zzdZ() : s;
        this.zzxR = zzdy0.zzxE == -1L ? 10000L : zzdy0.zzxE;
        this.zzph = adRequestParcel0;
        this.zzxT = adSizeParcel0;
        this.zzoM = versionInfoParcel0;
    }

    public void cancel() {
        synchronized(this.zzqt) {
            if(this.zzxU != null) {
                try {
                    this.zzxU.destroy();
                }
                catch(RemoteException remoteException0) {
                    zzb.zzd("Could not destroy mediation adapter.", remoteException0);
                }
            }
            this.zzxV = -1;
            this.zzqt.notify();
        }
    }

    private void zza(long v, long v1, long v2, long v3) {
        while(this.zzxV == -2) {
            this.zzb(v, v1, v2, v3);
        }
    }

    private void zza(zzea zzea0) {
        if(((Boolean)zzbz.zzuu.get()).booleanValue() && "com.google.ads.mediation.AdUrlAdapter".equals(this.zzxQ)) {
            Bundle bundle0 = this.zzph.zzsh.getBundle(this.zzxQ);
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
            bundle0.putString("sdk_less_network_id", this.zzxS.zzxt);
            this.zzph.zzsh.putBundle(this.zzxQ, bundle0);
        }
        try {
            if(this.zzoM.zzGI < 4100000) {
                if(this.zzxT.zzsn) {
                    this.zzxU.zza(zze.zzw(this.mContext), this.zzph, this.zzxS.zzxz, zzea0);
                    return;
                }
                this.zzxU.zza(zze.zzw(this.mContext), this.zzxT, this.zzph, this.zzxS.zzxz, zzea0);
                return;
            }
            if(this.zzxT.zzsn) {
                this.zzxU.zza(zze.zzw(this.mContext), this.zzph, this.zzxS.zzxz, this.zzxS.zzxs, zzea0);
                return;
            }
            this.zzxU.zza(zze.zzw(this.mContext), this.zzxT, this.zzph, this.zzxS.zzxz, this.zzxS.zzxs, zzea0);
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not request ad from mediation adapter.", remoteException0);
            this.zzs(5);
        }
    }

    private void zzb(long v, long v1, long v2, long v3) {
        long v4 = SystemClock.elapsedRealtime();
        long v5 = v1 - (v4 - v);
        long v6 = v3 - (v4 - v2);
        if(v5 <= 0L || v6 <= 0L) {
            zzb.zzaA("Timed out waiting for adapter.");
            this.zzxV = 3;
            return;
        }
        try {
            this.zzqt.wait(Math.min(v5, v6));
        }
        catch(InterruptedException unused_ex) {
            this.zzxV = -1;
        }
    }

    public zzec zzb(long v, long v1) {
        zzea zzea0;
        synchronized(this.zzqt) {
            long v3 = SystemClock.elapsedRealtime();
            zzea0 = new zzea();
            com.google.android.gms.internal.zzeb.1 zzeb$10 = new Runnable() {
                @Override
                public void run() {
                    synchronized(zzeb.this.zzqt) {
                        if(zzeb.this.zzxV != -2) {
                            return;
                        }
                        zzeg zzeg0 = zzeb.this.zzea();
                        zzeb.this.zzxU = zzeg0;
                        if(zzeb.this.zzxU == null) {
                            zzeb.this.zzs(4);
                            return;
                        }
                        zzea0.zza(zzeb.this);
                        zzeb.this.zza(zzea0);
                    }
                }
            };
            zzhl.zzGk.post(zzeb$10);
            this.zza(v3, this.zzxR, v, v1);
        }
        return new zzec(this.zzxS, this.zzxU, this.zzxQ, zzea0, this.zzxV);
    }

    private String zzdZ() {
        try {
            if(!TextUtils.isEmpty(this.zzxS.zzxw)) {
                return this.zzoq.zzZ(this.zzxS.zzxw) ? "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter" : "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        }
        catch(RemoteException unused_ex) {
            zzb.zzaC("Fail to determine the custom event\'s version, assuming the old one.");
        }
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private zzeg zzea() {
        zzb.zzaA(("Instantiating mediation adapter: " + this.zzxQ));
        try {
            return this.zzoq.zzY(this.zzxQ);
        }
        catch(RemoteException remoteException0) {
            zzb.zza(("Could not instantiate mediation adapter: " + this.zzxQ), remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.zzec$zza
    public void zzs(int v) {
        synchronized(this.zzqt) {
            this.zzxV = v;
            this.zzqt.notify();
        }
    }
}

