package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;

@zzgd
public abstract class zzfp extends zzfs implements zza {
    private final zzie zzBd;
    protected boolean zzBe;
    private boolean zzxo;

    protected zzfp(Context context0, com.google.android.gms.internal.zzha.zza zzha$zza0, zzid zzid0, com.google.android.gms.internal.zzft.zza zzft$zza0) {
        super(context0, zzha$zza0, zzid0, zzft$zza0);
        this.zzBe = false;
        this.zzxo = false;
        this.zzBd = zzid0.zzgF();
    }

    @Override  // com.google.android.gms.internal.zzfs
    public void onStop() {
        synchronized(this.zzBr) {
            this.zzoA.stopLoading();
            zzo.zzbx().zza(this.zzoA.getWebView());
        }
    }

    @Override  // com.google.android.gms.internal.zzie$zza
    public void zza(zzid zzid0, boolean z) {
        boolean z1 = true;
        synchronized(this.zzqt) {
            zzb.zzay("WebView finished loading.");
            this.zzBe = true;
            if(z) {
                z1 = false;
            }
            this.zzxo = z1;
            this.zzqt.notify();
        }
    }

    private boolean zze(long v) throws com.google.android.gms.internal.zzfs.zza {
        long v1 = 60000L - (SystemClock.elapsedRealtime() - v);
        if(v1 <= 1L) {
            return false;
        }
        try {
            this.zzqt.wait(v1);
            return true;
        }
        catch(InterruptedException unused_ex) {
            throw new com.google.android.gms.internal.zzfs.zza("Ad request cancelled.", -1);
        }
    }

    protected void zzg(long v) throws com.google.android.gms.internal.zzfs.zza {
        do {
            if(!this.zze(v)) {
                throw new com.google.android.gms.internal.zzfs.zza("Timed out waiting for WebView to finish loading.", 2);
            }
            if(this.zzxo) {
                throw new com.google.android.gms.internal.zzfs.zza("Received cancellation request from creative.", 0);
            }
        }
        while(!this.zzBe);
    }
}

