package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzm;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzgd
public class zzfx extends zzhh {
    private final zzfy zzBC;
    private Future zzBD;
    private final zza zzBq;
    private final com.google.android.gms.internal.zzha.zza zzBs;
    private final AdResponseParcel zzBt;
    private final Object zzqt;

    public zzfx(Context context0, zzm zzm0, zzbc zzbc0, com.google.android.gms.internal.zzha.zza zzha$zza0, zzan zzan0, zza zzft$zza0) {
        this(zzha$zza0, zzft$zza0, new zzfy(context0, zzm0, zzbc0, new zzho(context0), zzan0, zzha$zza0));
    }

    zzfx(com.google.android.gms.internal.zzha.zza zzha$zza0, zza zzft$zza0, zzfy zzfy0) {
        this.zzqt = new Object();
        this.zzBs = zzha$zza0;
        this.zzBt = zzha$zza0.zzFs;
        this.zzBq = zzft$zza0;
        this.zzBC = zzfy0;
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void onStop() {
        synchronized(this.zzqt) {
            if(this.zzBD != null) {
                this.zzBD.cancel(true);
            }
        }
    }

    private zzha zzA(int v) {
        return new zzha(this.zzBs.zzFr.zzCm, null, null, v, null, null, this.zzBt.orientation, this.zzBt.zzxJ, this.zzBs.zzFr.zzCp, false, null, null, null, null, null, this.zzBt.zzCL, this.zzBs.zzpN, this.zzBt.zzCJ, this.zzBs.zzFo, this.zzBt.zzCO, this.zzBt.zzCP, this.zzBs.zzFl, null, this.zzBs.zzFr.zzCC);
    }

    @Override  // com.google.android.gms.internal.zzhh
    public void zzdP() {
        int v1;
        zzha zzha0;
        try {
            synchronized(this.zzqt) {
                this.zzBD = zzhk.zza(this.zzBC);
            }
            zzha0 = (zzha)this.zzBD.get(60000L, TimeUnit.MILLISECONDS);
            v1 = -2;
        }
        catch(TimeoutException unused_ex) {
            zzb.zzaC("Timed out waiting for native ad.");
            this.zzBD.cancel(true);
            v1 = 2;
            zzha0 = null;
        }
        catch(ExecutionException unused_ex) {
            v1 = 0;
            zzha0 = null;
        }
        catch(InterruptedException unused_ex) {
            zzha0 = null;
            v1 = -1;
        }
        catch(CancellationException unused_ex) {
            zzha0 = null;
            v1 = -1;
        }
        if(zzha0 == null) {
            zzha0 = this.zzA(v1);
        }
        com.google.android.gms.internal.zzfx.1 zzfx$10 = new Runnable() {
            @Override
            public void run() {
                zzfx.this.zzBq.zzb(zzha0);
            }
        };
        zzhl.zzGk.post(zzfx$10);
    }
}

