package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.internal.zzaz;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzid;

@zzgd
public class zze extends zzc {
    public zze(Context context0, AdSizeParcel adSizeParcel0, String s, zzef zzef0, VersionInfoParcel versionInfoParcel0) {
        super(context0, adSizeParcel0, s, zzef0, versionInfoParcel0);
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    public void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    @Override  // com.google.android.gms.ads.internal.zzc
    public boolean zza(zzha zzha0, zzha zzha1) {
        if(!super.zza(zzha0, zzha1)) {
            return false;
        }
        if(this.zzon.zzbM() && !this.zzb(zzha0, zzha1)) {
            this.zze(0);
            return false;
        }
        this.zza(zzha1, false);
        if(this.zzon.zzbM()) {
            if(zzha1.zzzE != null && (zzha1.zzzE.zzgF().zzbU() || zzha1.zzFl != null)) {
                zzaz zzaz0 = this.zzop.zza(this.zzon.zzpN, zzha1);
                if(zzha1.zzzE.zzgF().zzbU() && zzaz0 != null) {
                    zzaz0.zza(this);
                }
            }
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

    @Override  // com.google.android.gms.ads.internal.zzb
    protected boolean zzaU() {
        boolean z = true;
        if(!zzo.zzbv().zza(this.zzon.zzpH.getPackageManager(), "org.dyndns.vivi.SkskShogi", "android.permission.INTERNET")) {
            zzk.zzcA().zza(this.zzon.zzpK, this.zzon.zzpN, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        if(!zzo.zzbv().zzG(this.zzon.zzpH)) {
            zzk.zzcA().zza(this.zzon.zzpK, this.zzon.zzpN, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if(!z && this.zzon.zzpK != null) {
            this.zzon.zzpK.setVisibility(0);
        }
        return z;
    }

    private boolean zzb(zzha zzha0, zzha zzha1) {
        View view0;
        if(zzha1.zzCK) {
            try {
                zzd zzd0 = zzha1.zzya.getView();
                if(zzd0 == null) {
                    zzb.zzaC("View in mediation adapter is null.");
                    return false;
                }
                view0 = (View)com.google.android.gms.dynamic.zze.zzn(zzd0);
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Could not get View from mediation adapter.", remoteException0);
                return false;
            }
            View view1 = this.zzon.zzpK.getNextView();
            if(view1 != null) {
                if(view1 instanceof zzid) {
                    ((zzid)view1).destroy();
                }
                this.zzon.zzpK.removeView(view1);
            }
            try {
                this.zzb(view0);
            }
            catch(Throwable throwable0) {
                zzb.zzd("Could not add mediation view to view hierarchy.", throwable0);
                return false;
            }
        }
        else if(zzha1.zzFn != null) {
            zzha1.zzzE.zza(zzha1.zzFn);
            this.zzon.zzpK.removeAllViews();
            this.zzon.zzpK.setMinimumWidth(zzha1.zzFn.widthPixels);
            this.zzon.zzpK.setMinimumHeight(zzha1.zzFn.heightPixels);
            this.zzb(zzha1.zzzE.getWebView());
        }
        if(this.zzon.zzpK.getChildCount() > 1) {
            this.zzon.zzpK.showNext();
        }
        if(zzha0 != null) {
            View view2 = this.zzon.zzpK.getNextView();
            if(view2 instanceof zzid) {
                ((zzid)view2).zza(this.zzon.zzpH, this.zzon.zzpN);
            }
            else if(view2 != null) {
                this.zzon.zzpK.removeView(view2);
            }
            this.zzon.zzbL();
        }
        this.zzon.zzpK.setVisibility(0);
        return true;
    }
}

