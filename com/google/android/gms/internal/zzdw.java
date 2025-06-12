package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

@zzgd
public final class zzdw {
    private final Context mContext;
    private final zzef zzoq;
    private final Object zzqt;
    private final AdRequestInfoParcel zzxm;
    private final zzdy zzxn;
    private boolean zzxo;
    private zzeb zzxp;

    public zzdw(Context context0, AdRequestInfoParcel adRequestInfoParcel0, zzef zzef0, zzdy zzdy0) {
        this.zzqt = new Object();
        this.zzxo = false;
        this.mContext = context0;
        this.zzxm = adRequestInfoParcel0;
        this.zzoq = zzef0;
        this.zzxn = zzdy0;
    }

    public void cancel() {
        synchronized(this.zzqt) {
            this.zzxo = true;
            if(this.zzxp != null) {
                this.zzxp.cancel();
            }
        }
    }

    public zzec zza(long v, long v1) {
        zzec zzec0;
        zzb.zzay("Starting mediation.");
        for(Object object0: this.zzxn.zzxD) {
            zzdx zzdx0 = (zzdx)object0;
            zzb.zzaA(("Trying mediation network: " + zzdx0.zzxt));
            for(Object object1: zzdx0.zzxu) {
                synchronized(this.zzqt) {
                    if(this.zzxo) {
                        return new zzec(-1);
                    }
                    this.zzxp = new zzeb(this.mContext, ((String)object1), this.zzoq, this.zzxn, zzdx0, this.zzxm.zzCm, this.zzxm.zzpN, this.zzxm.zzpJ);
                }
                zzec0 = this.zzxp.zzb(v, v1);
                if(zzec0.zzxY == 0) {
                    zzb.zzay("Adapter succeeded.");
                    return zzec0;
                }
                if(zzec0.zzya != null) {
                    com.google.android.gms.internal.zzdw.1 zzdw$10 = new Runnable() {
                        @Override
                        public void run() {
                            try {
                                zzec0.zzya.destroy();
                            }
                            catch(RemoteException remoteException0) {
                                zzb.zzd("Could not destroy mediation adapter.", remoteException0);
                            }
                        }
                    };
                    zzhl.zzGk.post(zzdw$10);
                }
            }
        }
        return new zzec(1);
    }
}

