package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzci;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzev;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzha.zza;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzid;

@zzgd
public abstract class zzc extends zzb implements zzf, zzev {
    public zzc(Context context0, AdSizeParcel adSizeParcel0, String s, zzef zzef0, VersionInfoParcel versionInfoParcel0) {
        super(context0, adSizeParcel0, s, zzef0, versionInfoParcel0);
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public void recordClick() {
        this.onAdClicked();
    }

    @Override  // com.google.android.gms.ads.internal.zzf, com.google.android.gms.ads.internal.zza
    public void recordImpression() {
        this.zza(this.zzon.zzpO, false);
    }

    protected zzid zza(zzd zzd0) {
        zzid zzid0;
        View view0 = this.zzon.zzpK.getNextView();
        if(view0 instanceof zzid) {
            zzid0 = (zzid)view0;
            zzid0.zza(this.zzon.zzpH, this.zzon.zzpN);
        }
        else {
            if(view0 != null) {
                this.zzon.zzpK.removeView(view0);
            }
            zzid0 = zzo.zzbw().zza(this.zzon.zzpH, this.zzon.zzpN, false, false, this.zzon.zzpI, this.zzon.zzpJ);
            if(this.zzon.zzpN.zzso == null) {
                this.zzb(zzid0.getWebView());
            }
        }
        zzid0.zzgF().zzb(this, this, this, this, false, this, null, zzd0, this);
        return zzid0;
    }

    @Override  // com.google.android.gms.internal.zzev
    public void zza(int v, int v1, int v2, int v3) {
        this.zzaS();
    }

    @Override  // com.google.android.gms.ads.internal.zza
    public void zza(zzci zzci0) {
        zzu.zzbY("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzon.zzqc = zzci0;
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    protected boolean zza(zzha zzha0, zzha zzha1) {
        if(this.zzon.zzbM() && this.zzon.zzpK != null) {
            this.zzon.zzpK.zzbP().zzaw(zzha1.zzCP);
        }
        return super.zza(zzha0, zzha1);
    }

    @Override  // com.google.android.gms.ads.internal.zza
    protected boolean zzb(zza zzha$zza0) {
        String s = null;
        zzd zzd0 = new zzd();
        zzid zzid0 = this.zza(zzd0);
        zzd0.zza(new com.google.android.gms.ads.internal.zzd.zzb(zzha$zza0, zzid0));
        zzid0.setOnTouchListener(new View.OnTouchListener() {
            @Override  // android.view.View$OnTouchListener
            public boolean onTouch(View v, MotionEvent event) {
                zzd0.recordClick();
                return false;
            }
        });
        zzid0.setOnClickListener(new View.OnClickListener() {
            @Override  // android.view.View$OnClickListener
            public void onClick(View v) {
                zzd0.recordClick();
            }
        });
        if(zzha$zza0.zzpN != null) {
            this.zzon.zzpN = zzha$zza0.zzpN;
        }
        if(zzha$zza0.errorCode != -2) {
            this.zzb(new zzha(zzha$zza0, zzid0, null, null, null, null, null));
            return false;
        }
        if(!zzha$zza0.zzFs.zzCK && zzha$zza0.zzFs.zzCT) {
            if(zzha$zza0.zzFs.zzzG != null) {
                s = zzo.zzbv().zzat(zzha$zza0.zzFs.zzzG);
            }
            zzcf zzcf0 = new zzcf(this, s, zzha$zza0.zzFs.zzCI);
            if(this.zzon.zzqc != null) {
                try {
                    this.zzon.zzqh = 1;
                    this.zzon.zzqc.zza(zzcf0);
                    return false;
                }
                catch(RemoteException remoteException0) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call the onCustomRenderedAdLoadedListener.", remoteException0);
                }
            }
        }
        this.zzon.zzqh = 0;
        zzp zzp0 = this.zzon;
        zzp0.zzpM = zzo.zzbu().zza(this.zzon.zzpH, this, zzha$zza0, this.zzon.zzpI, zzid0, this.zzoq, this);
        return true;
    }

    @Override  // com.google.android.gms.internal.zzev
    public void zzbc() {
        this.zzaQ();
    }

    @Override  // com.google.android.gms.ads.internal.zzf
    public void zzc(View view0) {
        this.zzon.zzqg = view0;
        this.zzb(new zzha(this.zzon.zzpP, null, null, null, null, null, null));
    }
}

