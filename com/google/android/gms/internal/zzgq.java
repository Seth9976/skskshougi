package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

@zzgd
public class zzgq extends zzhh implements zzgr, zzgu {
    private final Context mContext;
    private final zza zzBs;
    private int zzBv;
    private final String zzEO;
    private final zzgp zzEV;
    private final zzgu zzEW;
    private final String zzEX;
    private int zzEY;
    private final Object zzqt;
    private final String zzxQ;

    public zzgq(Context context0, String s, String s1, String s2, zza zzha$zza0, zzgp zzgp0, zzgu zzgu0) {
        this.zzEY = 0;
        this.zzBv = 3;
        this.mContext = context0;
        this.zzxQ = s;
        this.zzEO = s1;
        this.zzEX = s2;
        this.zzBs = zzha$zza0;
        this.zzEV = zzgp0;
        this.zzqt = new Object();
        this.zzEW = zzgu0;
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void onStop() {
    }

    @Override  // com.google.android.gms.internal.zzgr
    public void zzI(int v) {
        this.zzb(this.zzxQ, 0);
    }

    @Override  // com.google.android.gms.internal.zzgu
    public void zzap(String s) {
        synchronized(this.zzqt) {
            this.zzEY = 1;
            this.zzqt.notify();
        }
    }

    @Override  // com.google.android.gms.internal.zzgu
    public void zzb(String s, int v) {
        synchronized(this.zzqt) {
            this.zzEY = 2;
            this.zzBv = v;
            this.zzqt.notify();
        }
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void zzdP() {
        if(this.zzEV == null || this.zzEV.zzfN() == null || this.zzEV.zzfM() == null) {
            return;
        }
        zzgt zzgt0 = this.zzEV.zzfN();
        zzgt0.zza(this);
        zzgt0.zza(this);
        AdRequestParcel adRequestParcel0 = this.zzBs.zzFr.zzCm;
        zzeg zzeg0 = this.zzEV.zzfM();
        try {
            if(zzeg0.isInitialized()) {
                com.google.android.gms.internal.zzgq.1 zzgq$10 = new Runnable() {
                    @Override
                    public void run() {
                        try {
                            zzeg0.zza(adRequestParcel0, zzgq.this.zzEX);
                        }
                        catch(RemoteException remoteException0) {
                            zzb.zzd("Fail to load ad from adapter.", remoteException0);
                            zzgq.this.zzb(zzgq.this.zzxQ, 0);
                        }
                    }
                };
                com.google.android.gms.ads.internal.util.client.zza.zzGF.post(zzgq$10);
            }
            else {
                com.google.android.gms.internal.zzgq.2 zzgq$20 = new Runnable() {
                    @Override
                    public void run() {
                        try {
                            zzd zzd0 = zze.zzw(zzgq.this.mContext);
                            zzeg0.zza(zzd0, adRequestParcel0, zzgq.this.zzEO, zzgt0, zzgq.this.zzEX);
                        }
                        catch(RemoteException remoteException0) {
                            zzb.zzd(("Fail to initialize adapter " + zzgq.this.zzxQ), remoteException0);
                            zzgq.this.zzb(zzgq.this.zzxQ, 0);
                        }
                    }
                };
                com.google.android.gms.ads.internal.util.client.zza.zzGF.post(zzgq$20);
            }
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Fail to check if adapter is initialized.", remoteException0);
            this.zzb(this.zzxQ, 0);
        }
        this.zzk(zzo.zzbz().elapsedRealtime());
        zzgt0.zza(null);
        zzgt0.zza(null);
        if(this.zzEY == 1) {
            this.zzEW.zzap(this.zzxQ);
            return;
        }
        this.zzEW.zzb(this.zzxQ, this.zzBv);
    }

    protected boolean zze(long v) {
        long v1 = 20000L - (zzo.zzbz().elapsedRealtime() - v);
        if(v1 <= 0L) {
            return false;
        }
        try {
            this.zzqt.wait(v1);
            return true;
        }
        catch(InterruptedException unused_ex) {
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.zzgr
    public void zzfO() {
        zzeg zzeg0 = this.zzEV.zzfM();
        try {
            zzeg0.zza(this.zzBs.zzFr.zzCm, this.zzEX);
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Fail to load ad from adapter.", remoteException0);
            this.zzb(this.zzxQ, 0);
        }
    }

    private void zzk(long v) {
        while(true) {
            Object object0 = this.zzqt;
            synchronized(object0) {
                if(this.zzEY != 0) {
                    return;
                }
                if(!this.zze(v)) {
                    return;
                }
            }
        }
    }
}

