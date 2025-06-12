package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.Window;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzaz;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzdk;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzid;

@zzgd
public class zzj extends zzc implements zzdk {
    protected transient boolean zzoT;

    public zzj(Context context0, AdSizeParcel adSizeParcel0, String s, zzef zzef0, VersionInfoParcel versionInfoParcel0) {
        super(context0, adSizeParcel0, s, zzef0, versionInfoParcel0);
        this.zzoT = false;
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    public void showInterstitial() {
        zzu.zzbY("showInterstitial must be called on the main UI thread.");
        if(this.zzon.zzpO == null) {
            zzb.zzaC("The interstitial has not loaded.");
            return;
        }
        boolean z = this.zzon.zzpH.getApplicationContext() != null;
        if(!this.zzoT) {
            zzb.zzaC("It is not recommended to show an interstitial before onAdLoaded completes.");
            Bundle bundle0 = new Bundle();
            bundle0.putString("appid", "org.dyndns.vivi.SkskShogi");
            bundle0.putString("action", "show_interstitial_before_load_finish");
            this.zza(bundle0);
        }
        if(!zzo.zzbv().zzM(this.zzon.zzpH)) {
            zzb.zzaC("It is not recommended to show an interstitial when app is not in foreground.");
            Bundle bundle1 = new Bundle();
            bundle1.putString("appid", "org.dyndns.vivi.SkskShogi");
            bundle1.putString("action", "show_interstitial_app_not_in_foreground");
            this.zza(bundle1);
        }
        if(!this.zzon.zzbN()) {
            if(this.zzon.zzpO.zzzE.zzgJ()) {
                zzb.zzaC("The interstitial is already showing.");
                return;
            }
            this.zzon.zzpO.zzzE.zzB(true);
            if(this.zzon.zzpO.zzzE.zzgF().zzbU() || this.zzon.zzpO.zzFl != null) {
                zzaz zzaz0 = this.zzop.zza(this.zzon.zzpN, this.zzon.zzpO);
                if(this.zzon.zzpO.zzzE.zzgF().zzbU() && zzaz0 != null) {
                    zzaz0.zza(this);
                }
            }
            if(this.zzon.zzpO.zzCK) {
                try {
                    this.zzon.zzpO.zzya.showInterstitial();
                }
                catch(RemoteException remoteException0) {
                    zzb.zzd("Could not show interstitial.", remoteException0);
                    this.zzbk();
                }
                return;
            }
            InterstitialAdParameterParcel interstitialAdParameterParcel0 = new InterstitialAdParameterParcel(this.zzon.zzoU, this.zzbj());
            int v = this.zzon.zzpO.zzzE.getRequestedOrientation();
            if(v == -1) {
                v = this.zzon.zzpO.orientation;
            }
            AdOverlayInfoParcel adOverlayInfoParcel0 = new AdOverlayInfoParcel(this, this, this, this.zzon.zzpO.zzzE, v, this.zzon.zzpJ, this.zzon.zzpO.zzCP, interstitialAdParameterParcel0);
            zzo.zzbt().zza(this.zzon.zzpH, adOverlayInfoParcel0);
        }
    }

    private void zza(Bundle bundle0) {
        zzo.zzbv().zza(this.zzon.zzpH, this.zzon.zzpJ.zzGG, "gmob-apps", bundle0, false);
    }

    @Override  // com.google.android.gms.ads.internal.zzc
    protected zzid zza(zzd zzd0) {
        zzid zzid0 = zzo.zzbw().zza(this.zzon.zzpH, this.zzon.zzpN, false, false, this.zzon.zzpI, this.zzon.zzpJ);
        zzid0.zzgF().zzb(this, null, this, this, ((Boolean)zzbz.zzuk.get()).booleanValue(), this, this, zzd0, null);
        return zzid0;
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    protected boolean zza(AdRequestParcel adRequestParcel0, zzha zzha0, boolean z) {
        if(this.zzon.zzbM()) {
            zzo.zzbx().zza(zzha0.zzzE.getWebView());
        }
        return this.zzom.zzbp();
    }

    @Override  // com.google.android.gms.ads.internal.zzc
    public boolean zza(zzha zzha0, zzha zzha1) {
        if(!super.zza(zzha0, zzha1)) {
            return false;
        }
        if(this.zzon.zzbM()) {
            if(zzha1.zzzE != null) {
                zzha1.zzzE.zzgF().zzgS();
                return true;
            }
        }
        else if(this.zzon.zzqg != null && zzha1.zzFl != null) {
            this.zzop.zza(this.zzon.zzpN, zzha1, this.zzon.zzqg);
            return true;
        }
        return true;
    }

    @Override  // com.google.android.gms.ads.internal.zza
    protected boolean zzaT() {
        if(super.zzaT()) {
            this.zzoT = true;
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    public void zzaV() {
        this.zzbk();
        super.zzaV();
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    public void zzaW() {
        this.recordImpression();
        super.zzaW();
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    public boolean zzb(AdRequestParcel adRequestParcel0) {
        if(this.zzon.zzpO != null) {
            zzb.zzaC("An interstitial is already loading. Aborting.");
            return false;
        }
        return super.zzb(adRequestParcel0);
    }

    protected boolean zzbj() {
        if(this.zzon.zzpH instanceof Activity) {
            Window window0 = ((Activity)this.zzon.zzpH).getWindow();
            if(window0 != null && window0.getDecorView() != null) {
                Rect rect0 = new Rect();
                Rect rect1 = new Rect();
                window0.getDecorView().getGlobalVisibleRect(rect0, null);
                window0.getDecorView().getWindowVisibleDisplayFrame(rect1);
                return rect0.bottom != 0 && rect1.bottom != 0 && rect0.top == rect1.top;
            }
        }
        return false;
    }

    private void zzbk() {
        if(this.zzon.zzbM()) {
            this.zzon.zzbJ();
            this.zzon.zzpO = null;
            this.zzon.zzoU = false;
            this.zzoT = false;
        }
    }

    @Override  // com.google.android.gms.internal.zzdk
    public void zzd(boolean z) {
        this.zzon.zzoU = z;
    }
}

