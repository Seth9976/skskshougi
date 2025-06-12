package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;

@zzgd
public abstract class zzfs extends zzhh {
    public static final class zza extends Exception {
        private final int zzBv;

        public zza(String s, int v) {
            super(s);
            this.zzBv = v;
        }

        public int getErrorCode() {
            return this.zzBv;
        }
    }

    protected final Context mContext;
    protected final com.google.android.gms.internal.zzft.zza zzBq;
    protected final Object zzBr;
    protected final com.google.android.gms.internal.zzha.zza zzBs;
    protected AdResponseParcel zzBt;
    protected final zzid zzoA;
    protected final Object zzqt;

    protected zzfs(Context context0, com.google.android.gms.internal.zzha.zza zzha$zza0, zzid zzid0, com.google.android.gms.internal.zzft.zza zzft$zza0) {
        this.zzqt = new Object();
        this.zzBr = new Object();
        this.mContext = context0;
        this.zzBs = zzha$zza0;
        this.zzBt = zzha$zza0.zzFs;
        this.zzoA = zzid0;
        this.zzBq = zzft$zza0;
    }

    // 检测为 lambda 实现。
    @Override  // com.google.android.gms.internal.zzhh
    public void onStop() {
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void zzdP() {
        synchronized(this.zzqt) {
            zzb.zzay("AdRendererBackgroundTask started.");
            int v1 = this.zzBs.errorCode;
            try {
                this.zzh(SystemClock.elapsedRealtime());
            }
            catch(zza zzfs$zza0) {
                int v2 = zzfs$zza0.getErrorCode();
                if(v2 != -1 && v2 != 3) {
                    zzb.zzaC(zzfs$zza0.getMessage());
                }
                else {
                    zzb.zzaA(zzfs$zza0.getMessage());
                }
                this.zzBt = this.zzBt == null ? new AdResponseParcel(v2) : new AdResponseParcel(v2, this.zzBt.zzxJ);
                com.google.android.gms.internal.zzfs.1 zzfs$10 = () -> {
                };
                zzhl.zzGk.post(zzfs$10);
                v1 = v2;
            }
            com.google.android.gms.internal.zzfs.2 zzfs$20 = new Runnable() {
                @Override
                public void run() {
                    synchronized(zzfs.this.zzqt) {
                        zzfs.this.zzk(this.zzz(v1));
                    }
                }
            };
            zzhl.zzGk.post(zzfs$20);
        }

        class com.google.android.gms.internal.zzfs.1 implements Runnable {
            @Override
            public void run() {
                zzfs.this.onStop();
            }
        }

    }

    protected abstract void zzh(long arg1) throws zza;

    protected void zzk(zzha zzha0) {
        this.zzBq.zzb(zzha0);
    }

    protected zzha zzz(int v) {
        return new zzha(this.zzBs.zzFr.zzCm, this.zzoA, this.zzBt.zzxF, v, this.zzBt.zzxG, this.zzBt.zzCM, this.zzBt.orientation, this.zzBt.zzxJ, this.zzBs.zzFr.zzCp, this.zzBt.zzCK, null, null, null, null, null, this.zzBt.zzCL, this.zzBs.zzpN, this.zzBt.zzCJ, this.zzBs.zzFo, this.zzBt.zzCO, this.zzBt.zzCP, this.zzBs.zzFl, null, this.zzBs.zzFr.zzCC);
    }
}

