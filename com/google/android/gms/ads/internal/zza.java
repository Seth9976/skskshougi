package com.google.android.gms.ads.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.overlay.zzk;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzaw;
import com.google.android.gms.internal.zzay;
import com.google.android.gms.internal.zzaz;
import com.google.android.gms.internal.zzbh;
import com.google.android.gms.internal.zzbk;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcd;
import com.google.android.gms.internal.zzce;
import com.google.android.gms.internal.zzci;
import com.google.android.gms.internal.zzde;
import com.google.android.gms.internal.zzff;
import com.google.android.gms.internal.zzfj;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzhe;
import com.google.android.gms.internal.zzhf;
import com.google.android.gms.internal.zzhl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@zzgd
public abstract class zza extends com.google.android.gms.ads.internal.client.zzr.zza implements com.google.android.gms.ads.internal.client.zza, zzk, com.google.android.gms.ads.internal.request.zza.zza, zzaw, zzde, com.google.android.gms.internal.zzft.zza, zzhe {
    private zzce zzoj;
    private zzcd zzok;
    private zzcd zzol;
    protected final zzn zzom;
    protected final zzp zzon;
    protected transient AdRequestParcel zzoo;
    protected final zzay zzop;

    zza(zzp zzp0, zzn zzn0) {
        this.zzon = zzp0;
        if(zzn0 == null) {
            zzn0 = new zzn(this);
        }
        this.zzom = zzn0;
        zzo.zzbv().zzH(this.zzon.zzpH);
        zzo.zzby().zzb(this.zzon.zzpH, this.zzon.zzpJ);
        this.zzop = zzo.zzby().zzgd();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public void destroy() {
        zzu.zzbY("destroy must be called on the main UI thread.");
        this.zzom.cancel();
        this.zzop.zzh(this.zzon.zzpO);
        this.zzon.destroy();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public boolean isReady() {
        zzu.zzbY("isLoaded must be called on the main UI thread.");
        return this.zzon.zzpL == null && this.zzon.zzpM == null && this.zzon.zzpO != null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public void onAdClicked() {
        if(this.zzon.zzpO == null) {
            zzb.zzaC("Ad state was null when trying to ping click URLs.");
            return;
        }
        zzb.zzay("Pinging click URLs.");
        this.zzon.zzpQ.zzfQ();
        if(this.zzon.zzpO.zzxF != null) {
            zzhl zzhl0 = zzo.zzbv();
            String s = this.zzon.zzpJ.zzGG;
            ArrayList arrayList0 = this.zza(this.zzon.zzpO.zzxF, this.zzon.zzpO.zzCC);
            zzhl0.zza(this.zzon.zzpH, s, arrayList0);
        }
        if(this.zzon.zzpR != null) {
            try {
                this.zzon.zzpR.onAdClicked();
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Could not notify onAdClicked event.", remoteException0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzde
    public void onAppEvent(String name, String info) {
        if(this.zzon.zzpT != null) {
            try {
                this.zzon.zzpT.onAppEvent(name, info);
            }
            catch(RemoteException remoteException0) {
                zzb.zzd("Could not call the AppEventListener.", remoteException0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public void pause() {
        zzu.zzbY("pause must be called on the main UI thread.");
    }

    protected void recordImpression() {
        this.zzc(this.zzon.zzpO);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public void resume() {
        zzu.zzbY("resume must be called on the main UI thread.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public void stopLoading() {
        zzu.zzbY("stopLoading must be called on the main UI thread.");
        this.zzon.zzf(true);
    }

    Bundle zza(zzbk zzbk0) {
        String s;
        if(zzbk0 != null) {
            if(zzbk0.zzct()) {
                zzbk0.wakeup();
            }
            zzbh zzbh0 = zzbk0.zzcr();
            if(zzbh0 == null) {
                s = null;
            }
            else {
                s = zzbh0.zzci();
                zzb.zzay(("In AdManger: loadAd, " + zzbh0.toString()));
            }
            if(s != null) {
                Bundle bundle0 = new Bundle(1);
                bundle0.putString("fingerprint", s);
                bundle0.putInt("v", 1);
                return bundle0;
            }
        }
        return null;
    }

    // 去混淆评级： 低(30)
    String zza(String s, String s1, int v) {
        return !((Boolean)zzbz.zzun.get()).booleanValue() || !zzl.zzq(this.zzon.zzpH).zzbl() || TextUtils.isEmpty(s) ? s : Uri.parse(s).buildUpon().appendQueryParameter("ga_cid", s1).appendQueryParameter("ga_hid", String.valueOf(v)).build().toString();
    }

    ArrayList zza(List list0, String s) {
        int v = zzl.zzq(this.zzon.zzpH).zzbn();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(this.zza(((String)object0), s, v));
        }
        return arrayList0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public void zza(AdSizeParcel adSizeParcel0) {
        zzu.zzbY("setAdSize must be called on the main UI thread.");
        this.zzon.zzpN = adSizeParcel0;
        if(this.zzon.zzpO != null && this.zzon.zzqh == 0) {
            this.zzon.zzpO.zzzE.zza(adSizeParcel0);
        }
        if(this.zzon.zzpK == null) {
            return;
        }
        if(this.zzon.zzpK.getChildCount() > 1) {
            this.zzon.zzpK.removeView(this.zzon.zzpK.getNextView());
        }
        this.zzon.zzpK.setMinimumWidth(adSizeParcel0.widthPixels);
        this.zzon.zzpK.setMinimumHeight(adSizeParcel0.heightPixels);
        this.zzon.zzpK.requestLayout();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public void zza(zzm zzm0) {
        zzu.zzbY("setAdListener must be called on the main UI thread.");
        this.zzon.zzpR = zzm0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public void zza(com.google.android.gms.ads.internal.client.zzn zzn0) {
        zzu.zzbY("setAdListener must be called on the main UI thread.");
        this.zzon.zzpS = zzn0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public void zza(zzt zzt0) {
        zzu.zzbY("setAppEventListener must be called on the main UI thread.");
        this.zzon.zzpT = zzt0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public void zza(com.google.android.gms.ads.internal.client.zzu zzu0) {
        zzu.zzbY("setCorrelationIdProvider must be called on the main UI thread");
        this.zzon.zzpU = zzu0;
    }

    @Override  // com.google.android.gms.internal.zzaw
    public void zza(zzaz zzaz0, boolean z) {
        if(this.zzon.zzpO != null && this.zzon.zzpO.zzzE != null) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("isVisible", (z ? "1" : "0"));
            this.zzon.zzpO.zzzE.zzc("onAdVisibilityChanged", hashMap0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public void zza(zzci zzci0) {
        throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public void zza(zzff zzff0) {
        throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public void zza(zzfj zzfj0, String s) {
        throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
    }

    @Override  // com.google.android.gms.ads.internal.request.zza$zza
    public void zza(com.google.android.gms.internal.zzha.zza zzha$zza0) {
        this.zzoj.zza(this.zzok, new String[]{"arf"});
        this.zzol = this.zzoj.zzdo();
        this.zzon.zzpL = null;
        this.zzon.zzpP = zzha$zza0;
        if(this.zzb(zzha$zza0)) {
            zzb.zzay(("AdRenderer: " + this.zzon.zzpM.getClass().getName()));
        }
    }

    @Override  // com.google.android.gms.internal.zzhe
    public void zza(HashSet hashSet0) {
        this.zzon.zza(hashSet0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public boolean zza(AdRequestParcel adRequestParcel0) {
        zzu.zzbY("loadAd must be called on the main UI thread.");
        if(this.zzon.zzpL != null || this.zzon.zzpM != null) {
            if(this.zzoo != null) {
                zzb.zzaC("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            }
            this.zzoo = adRequestParcel0;
            return false;
        }
        zzb.zzaA("Starting ad request.");
        this.zzaL();
        this.zzok = this.zzoj.zzdo();
        if(!adRequestParcel0.zzsa) {
            zzb.zzaA(("Use AdRequest.Builder.addTestDevice(\"" + com.google.android.gms.ads.internal.client.zzk.zzcA().zzO(this.zzon.zzpH) + "\") to get test ads on this device."));
        }
        return this.zzb(adRequestParcel0);
    }

    boolean zza(zzha zzha0) {
        return false;
    }

    protected abstract boolean zza(zzha arg1, zzha arg2);

    void zzaL() {
        this.zzoj = new zzce("load_ad");
        this.zzok = new zzcd(-1L, null, null);
        this.zzol = new zzcd(-1L, null, null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public zzd zzaM() {
        zzu.zzbY("getAdFrame must be called on the main UI thread.");
        return zze.zzw(this.zzon.zzpK);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public AdSizeParcel zzaN() {
        zzu.zzbY("getAdSize must be called on the main UI thread.");
        return this.zzon.zzpN;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzk
    public void zzaO() {
        this.zzaR();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public void zzaP() {
        zzu.zzbY("recordManualImpression must be called on the main UI thread.");
        if(this.zzon.zzpO == null) {
            zzb.zzaC("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        zzb.zzay("Pinging manual tracking URLs.");
        if(this.zzon.zzpO.zzCM != null) {
            zzo.zzbv().zza(this.zzon.zzpH, this.zzon.zzpJ.zzGG, this.zzon.zzpO.zzCM);
        }
    }

    protected boolean zzaQ() {
        zzb.zzaB("Ad closing.");
        if(this.zzon.zzpS == null) {
            return false;
        }
        try {
            this.zzon.zzpS.onAdClosed();
            return true;
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call AdListener.onAdClosed().", remoteException0);
            return false;
        }
    }

    private boolean zzaR() {
        zzb.zzaA("Ad leaving application.");
        if(this.zzon.zzpS == null) {
            return false;
        }
        try {
            this.zzon.zzpS.onAdLeftApplication();
            return true;
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call AdListener.onAdLeftApplication().", remoteException0);
            return false;
        }
    }

    protected boolean zzaS() {
        zzb.zzaA("Ad opening.");
        if(this.zzon.zzpS == null) {
            return false;
        }
        try {
            this.zzon.zzpS.onAdOpened();
            return true;
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call AdListener.onAdOpened().", remoteException0);
            return false;
        }
    }

    protected boolean zzaT() {
        zzb.zzaA("Ad finished loading.");
        if(this.zzon.zzpS == null) {
            return false;
        }
        try {
            this.zzon.zzpS.onAdLoaded();
            return true;
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call AdListener.onAdLoaded().", remoteException0);
            return false;
        }
    }

    protected void zzb(View view0) {
        this.zzon.zzpK.addView(view0, zzo.zzbx().zzgt());
    }

    @Override  // com.google.android.gms.internal.zzft$zza
    public void zzb(zzha zzha0) {
        this.zzoj.zza(this.zzol, new String[]{"awr"});
        this.zzoj.zza(this.zzok, new String[]{"ttc"});
        this.zzon.zzpM = null;
        if(zzha0.errorCode != -2 && zzha0.errorCode != 3) {
            zzo.zzby().zzb(this.zzon.zzbI());
        }
        if(zzha0.errorCode != -1) {
            if(this.zza(zzha0)) {
                zzb.zzay("Ad refresh scheduled.");
            }
            if(zzha0.errorCode != -2) {
                this.zze(zzha0.errorCode);
                return;
            }
            if(this.zzon.zzqf == null) {
                this.zzon.zzqf = new zzhf(this.zzon.zzpG);
            }
            this.zzop.zzg(this.zzon.zzpO);
            if(this.zza(this.zzon.zzpO, zzha0)) {
                this.zzon.zzpO = zzha0;
                this.zzon.zzbO();
                if(zzo.zzby().zzfY() != null) {
                    zzo.zzby().zzfY().zza(this.zzoj);
                }
                if(this.zzon.zzbM()) {
                    this.zzaT();
                }
            }
        }
    }

    protected abstract boolean zzb(AdRequestParcel arg1);

    protected abstract boolean zzb(com.google.android.gms.internal.zzha.zza arg1);

    protected void zzc(zzha zzha0) {
        if(zzha0 == null) {
            zzb.zzaC("Ad state was null when trying to ping impression URLs.");
            return;
        }
        zzb.zzay("Pinging Impression URLs.");
        this.zzon.zzpQ.zzfP();
        if(zzha0.zzxG != null) {
            zzhl zzhl0 = zzo.zzbv();
            String s = this.zzon.zzpJ.zzGG;
            ArrayList arrayList0 = this.zza(zzha0.zzxG, zzha0.zzCC);
            zzhl0.zza(this.zzon.zzpH, s, arrayList0);
        }
    }

    protected boolean zzc(AdRequestParcel adRequestParcel0) {
        ViewParent viewParent0 = this.zzon.zzpK.getParent();
        return viewParent0 instanceof View && ((View)viewParent0).isShown() && zzo.zzbv().zzgl();
    }

    public void zzd(AdRequestParcel adRequestParcel0) {
        if(this.zzc(adRequestParcel0)) {
            this.zza(adRequestParcel0);
            return;
        }
        zzb.zzaA("Ad is not visible. Not refreshing ad.");
        this.zzom.zzf(adRequestParcel0);
    }

    protected boolean zze(int v) {
        zzb.zzaC(("Failed to load ad: " + v));
        if(this.zzon.zzpS == null) {
            return false;
        }
        try {
            this.zzon.zzpS.onAdFailedToLoad(v);
            return true;
        }
        catch(RemoteException remoteException0) {
            zzb.zzd("Could not call AdListener.onAdFailedToLoad().", remoteException0);
            return false;
        }
    }
}

