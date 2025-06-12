package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.zzf;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.zzc;
import com.google.android.gms.ads.internal.purchase.zzd;
import com.google.android.gms.ads.internal.purchase.zzg;
import com.google.android.gms.ads.internal.purchase.zzj;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzdi;
import com.google.android.gms.internal.zzdz;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzff;
import com.google.android.gms.internal.zzfj;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzhl;
import java.util.ArrayList;
import java.util.List;

@zzgd
public abstract class zzb extends zza implements zzf, zzj, zzdi, zzdz {
    private final Messenger mMessenger;
    protected final zzef zzoq;
    protected transient boolean zzor;

    public zzb(Context context0, AdSizeParcel adSizeParcel0, String s, zzef zzef0, VersionInfoParcel versionInfoParcel0) {
        this(new zzp(context0, adSizeParcel0, s, versionInfoParcel0), zzef0, null);
    }

    zzb(zzp zzp0, zzef zzef0, zzn zzn0) {
        super(zzp0, zzn0);
        this.zzoq = zzef0;
        this.mMessenger = new Messenger(new zzfc(this.zzon.zzpH));
        this.zzor = false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public String getMediationAdapterClassName() {
        return this.zzon.zzpO == null ? null : this.zzon.zzpO.zzyb;
    }

    @Override  // com.google.android.gms.ads.internal.zza
    public void onAdClicked() {
        if(this.zzon.zzpO == null) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Ad state was null when trying to ping click URLs.");
            return;
        }
        if(this.zzon.zzpO.zzFm != null && this.zzon.zzpO.zzFm.zzxF != null) {
            zzo.zzbG().zza(this.zzon.zzpH, this.zzon.zzpJ.zzGG, this.zzon.zzpO, this.zzon.zzpG, false, this.zza(this.zzon.zzpO.zzFm.zzxF, this.zzon.zzpO.zzCC));
        }
        if(this.zzon.zzpO.zzxZ != null && this.zzon.zzpO.zzxZ.zzxx != null) {
            zzo.zzbG().zza(this.zzon.zzpH, this.zzon.zzpJ.zzGG, this.zzon.zzpO, this.zzon.zzpG, false, this.zzon.zzpO.zzxZ.zzxx);
        }
        super.onAdClicked();
    }

    @Override  // com.google.android.gms.ads.internal.zza
    public void pause() {
        zzu.zzbY("pause must be called on the main UI thread.");
        if(this.zzon.zzpO != null && this.zzon.zzbM()) {
            zzo.zzbx().zza(this.zzon.zzpO.zzzE.getWebView());
        }
        if(this.zzon.zzpO != null && this.zzon.zzpO.zzya != null) {
            try {
                this.zzon.zzpO.zzya.pause();
            }
            catch(RemoteException unused_ex) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Could not pause mediation adapter.");
            }
        }
        this.zzop.zzi(this.zzon.zzpO);
        this.zzom.pause();
    }

    @Override  // com.google.android.gms.ads.internal.zza
    public void resume() {
        zzu.zzbY("resume must be called on the main UI thread.");
        if(this.zzon.zzpO != null && this.zzon.zzbM()) {
            zzo.zzbx().zzb(this.zzon.zzpO.zzzE.getWebView());
        }
        if(this.zzon.zzpO != null && this.zzon.zzpO.zzya != null) {
            try {
                this.zzon.zzpO.zzya.resume();
            }
            catch(RemoteException unused_ex) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Could not resume mediation adapter.");
            }
        }
        this.zzom.resume();
        this.zzop.zzj(this.zzon.zzpO);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzr
    public void showInterstitial() {
        throw new IllegalStateException("showInterstitial is not supported for current ad type");
    }

    private com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza zza(AdRequestParcel adRequestParcel0, Bundle bundle0) {
        PackageInfo packageInfo0;
        ApplicationInfo applicationInfo0 = this.zzon.zzpH.getApplicationInfo();
        try {
            packageInfo0 = this.zzon.zzpH.getPackageManager().getPackageInfo(applicationInfo0.packageName, 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            packageInfo0 = null;
        }
        DisplayMetrics displayMetrics0 = this.zzon.zzpH.getResources().getDisplayMetrics();
        Bundle bundle1 = null;
        if(this.zzon.zzpK != null && this.zzon.zzpK.getParent() != null) {
            int[] arr_v = new int[2];
            this.zzon.zzpK.getLocationOnScreen(arr_v);
            int v = arr_v[0];
            int v1 = arr_v[1];
            int v2 = this.zzon.zzpK.getWidth();
            int v3 = this.zzon.zzpK.getHeight();
            int v4 = !this.zzon.zzpK.isShown() || v + v2 <= 0 || v1 + v3 <= 0 || v > displayMetrics0.widthPixels || v1 > displayMetrics0.heightPixels ? 0 : 1;
            bundle1 = new Bundle(5);
            bundle1.putInt("x", v);
            bundle1.putInt("y", v1);
            bundle1.putInt("width", v2);
            bundle1.putInt("height", v3);
            bundle1.putInt("visible", v4);
        }
        String s = zzo.zzby().zzfW();
        zzp zzp0 = this.zzon;
        zzp0.zzpQ = new zzhb(s, this.zzon.zzpG);
        this.zzon.zzpQ.zzh(adRequestParcel0);
        String s1 = zzo.zzbv().zza(this.zzon.zzpH, this.zzon.zzpK, this.zzon.zzpN);
        int v5 = zzl.zzq(this.zzon.zzpH).zzbn();
        boolean z = zzl.zzq(this.zzon.zzpH).zzbl();
        long v6 = 0L;
        if(this.zzon.zzpU != null) {
            try {
                v6 = this.zzon.zzpU.getValue();
            }
            catch(RemoteException unused_ex) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Cannot get correlation id, default to 0.");
            }
        }
        Bundle bundle2 = zzo.zzby().zza(this.zzon.zzpH, this, s);
        ArrayList arrayList0 = new ArrayList();
        for(int v7 = 0; v7 < this.zzon.zzqa.size(); ++v7) {
            arrayList0.add(this.zzon.zzqa.keyAt(v7));
        }
        AdSizeParcel adSizeParcel0 = this.zzon.zzpN;
        String s2 = this.zzon.zzpG;
        String s3 = zzo.zzby().getSessionId();
        VersionInfoParcel versionInfoParcel0 = this.zzon.zzpJ;
        List list0 = this.zzon.zzqd;
        boolean z1 = zzo.zzby().zzga();
        int v8 = displayMetrics0.widthPixels;
        int v9 = displayMetrics0.heightPixels;
        float f = displayMetrics0.density;
        List list1 = zzbz.zzdb();
        return new com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza(bundle1, adRequestParcel0, adSizeParcel0, s2, applicationInfo0, packageInfo0, s, s3, versionInfoParcel0, bundle2, list0, arrayList0, bundle0, z1, this.mMessenger, v8, v9, f, s1, z, v5, v6, "39ed6915-f846-49d9-9d05-c22ba192cdf2", list1, this.zzon.zzpF, this.zzon.zzqb);
    }

    @Override  // com.google.android.gms.ads.internal.zza
    public void zza(zzff zzff0) {
        zzu.zzbY("setInAppPurchaseListener must be called on the main UI thread.");
        this.zzon.zzpV = zzff0;
    }

    @Override  // com.google.android.gms.ads.internal.zza
    public void zza(zzfj zzfj0, String s) {
        zzu.zzbY("setPlayStorePurchaseParams must be called on the main UI thread.");
        zzp zzp0 = this.zzon;
        zzp0.zzqe = new zzk(s);
        this.zzon.zzpW = zzfj0;
        if(!zzo.zzby().zzfZ() && zzfj0 != null) {
            new zzc(this.zzon.zzpH, this.zzon.zzpW, this.zzon.zzqe).zzgi();
        }
    }

    protected void zza(zzha zzha0, boolean z) {
        if(zzha0 == null) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Ad state was null when trying to ping impression URLs.");
            return;
        }
        super.zzc(zzha0);
        if(zzha0.zzFm != null && zzha0.zzFm.zzxG != null) {
            zzo.zzbG().zza(this.zzon.zzpH, this.zzon.zzpJ.zzGG, zzha0, this.zzon.zzpG, z, this.zza(zzha0.zzFm.zzxG, zzha0.zzCC));
        }
        if(zzha0.zzxZ != null && zzha0.zzxZ.zzxy != null) {
            zzo.zzbG().zza(this.zzon.zzpH, this.zzon.zzpJ.zzGG, zzha0, this.zzon.zzpG, z, zzha0.zzxZ.zzxy);
        }
    }

    @Override  // com.google.android.gms.internal.zzdi
    public void zza(String s, ArrayList arrayList0) {
        zzd zzd0 = new zzd(s, arrayList0, this.zzon.zzpH, this.zzon.zzpJ.zzGG);
        if(this.zzon.zzpV == null) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("InAppPurchaseListener is not set. Try to launch default purchase flow.");
            if(!com.google.android.gms.ads.internal.client.zzk.zzcA().zzP(this.zzon.zzpH)) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Google Play Service unavailable, cannot launch default purchase flow.");
                return;
            }
            if(this.zzon.zzpW == null) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("PlayStorePurchaseListener is not set.");
                return;
            }
            if(this.zzon.zzqe == null) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("PlayStorePurchaseVerifier is not initialized.");
                return;
            }
            if(this.zzon.zzqi) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("An in-app purchase request is already in progress, abort");
                return;
            }
            try {
                this.zzon.zzqi = true;
                if(!this.zzon.zzpW.isValidPurchase(s)) {
                    this.zzon.zzqi = false;
                    return;
                }
            }
            catch(RemoteException unused_ex) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Could not start In-App purchase.");
                this.zzon.zzqi = false;
                return;
            }
            zzo.zzbF().zza(this.zzon.zzpH, this.zzon.zzpJ.zzGJ, new GInAppPurchaseManagerInfoParcel(this.zzon.zzpH, this.zzon.zzqe, zzd0, this));
            return;
        }
        try {
            this.zzon.zzpV.zza(zzd0);
        }
        catch(RemoteException unused_ex) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Could not start In-App purchase.");
        }
    }

    @Override  // com.google.android.gms.ads.internal.purchase.zzj
    public void zza(String s, boolean z, int v, Intent intent0, com.google.android.gms.ads.internal.purchase.zzf zzf0) {
        if(this.zzon.zzpW != null) {
            try {
                this.zzon.zzpW.zza(new zzg(this.zzon.zzpH, s, z, v, intent0, zzf0));
            }
            catch(RemoteException unused_ex) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("Fail to invoke PlayStorePurchaseListener.");
            }
        }
        com.google.android.gms.ads.internal.zzb.1 zzb$10 = new Runnable() {
            @Override
            public void run() {
                int v = zzo.zzbF().zzd(intent0);
                zzo.zzbF();
                if(v == 0 && zzb.this.zzon.zzpO != null && zzb.this.zzon.zzpO.zzzE != null && zzb.this.zzon.zzpO.zzzE.zzgD() != null) {
                    zzb.this.zzon.zzpO.zzzE.zzgD().close();
                }
                zzb.this.zzon.zzqi = false;
            }
        };
        zzhl.zzGk.postDelayed(zzb$10, 500L);
    }

    protected boolean zza(AdRequestParcel adRequestParcel0, zzha zzha0, boolean z) {
        if(!z && this.zzon.zzbM()) {
            if(zzha0.zzxJ > 0L) {
                this.zzom.zza(adRequestParcel0, zzha0.zzxJ);
                return this.zzom.zzbp();
            }
            if(zzha0.zzFm != null && zzha0.zzFm.zzxJ > 0L) {
                this.zzom.zza(adRequestParcel0, zzha0.zzFm.zzxJ);
                return this.zzom.zzbp();
            }
            if(!zzha0.zzCK && zzha0.errorCode == 2) {
                this.zzom.zzf(adRequestParcel0);
                return this.zzom.zzbp();
            }
        }
        return this.zzom.zzbp();
    }

    @Override  // com.google.android.gms.ads.internal.zza
    boolean zza(zzha zzha0) {
        if(this.zzoo != null) {
            AdRequestParcel adRequestParcel0 = this.zzoo;
            this.zzoo = null;
            return this.zza(adRequestParcel0, zzha0, false);
        }
        return zzha0.zzCm.extras == null ? this.zza(zzha0.zzCm, zzha0, false) : this.zza(zzha0.zzCm, zzha0, zzha0.zzCm.extras.getBoolean("_noRefresh", false));
    }

    @Override  // com.google.android.gms.ads.internal.zza
    protected boolean zza(zzha zzha0, zzha zzha1) {
        int v1;
        int v = 0;
        if(zzha0 != null && zzha0.zzyc != null) {
            zzha0.zzyc.zza(null);
        }
        if(zzha1.zzyc != null) {
            zzha1.zzyc.zza(this);
        }
        if(zzha1.zzFm == null) {
            v1 = 0;
        }
        else {
            v1 = zzha1.zzFm.zzxM;
            v = zzha1.zzFm.zzxN;
        }
        this.zzon.zzqf.zzf(v1, v);
        return true;
    }

    // 去混淆评级： 低(20)
    protected boolean zzaU() {
        return zzo.zzbv().zza(this.zzon.zzpH.getPackageManager(), "org.dyndns.vivi.SkskShogi", "android.permission.INTERNET") && zzo.zzbv().zzG(this.zzon.zzpH);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzf
    public void zzaV() {
        this.zzop.zzg(this.zzon.zzpO);
        this.zzor = false;
        this.zzaQ();
        this.zzon.zzpQ.zzfR();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzf
    public void zzaW() {
        this.zzor = true;
        this.zzaS();
    }

    @Override  // com.google.android.gms.internal.zzdz
    public void zzaX() {
        this.onAdClicked();
    }

    @Override  // com.google.android.gms.internal.zzdz
    public void zzaY() {
        this.zzaV();
    }

    @Override  // com.google.android.gms.internal.zzdz
    public void zzaZ() {
        this.zzaO();
    }

    @Override  // com.google.android.gms.ads.internal.zza
    public void zzb(zzha zzha0) {
        super.zzb(zzha0);
        if(zzha0.errorCode == 3 && zzha0.zzFm != null && zzha0.zzFm.zzxH != null) {
            com.google.android.gms.ads.internal.util.client.zzb.zzay("Pinging no fill URLs.");
            zzo.zzbG().zza(this.zzon.zzpH, this.zzon.zzpJ.zzGG, zzha0, this.zzon.zzpG, false, zzha0.zzFm.zzxH);
        }
    }

    @Override  // com.google.android.gms.ads.internal.zza
    public boolean zzb(AdRequestParcel adRequestParcel0) {
        if(!this.zzaU()) {
            return false;
        }
        Bundle bundle0 = this.zza(zzo.zzby().zzD(this.zzon.zzpH));
        this.zzom.cancel();
        this.zzon.zzqh = 0;
        com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza adRequestInfoParcel$zza0 = this.zza(adRequestParcel0, bundle0);
        zzp zzp0 = this.zzon;
        zzp0.zzpL = zzo.zzbr().zza(this.zzon.zzpH, adRequestInfoParcel$zza0, this.zzon.zzpI, this);
        return true;
    }

    @Override  // com.google.android.gms.internal.zzdz
    public void zzba() {
        this.zzaW();
    }

    @Override  // com.google.android.gms.internal.zzdz
    public void zzbb() {
        if(this.zzon.zzpO != null) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC(("Mediation adapter " + this.zzon.zzpO.zzyb + " refreshed, but mediation adapters should never refresh."));
        }
        this.zza(this.zzon.zzpO, true);
        this.zzaT();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.ads.internal.zza
    protected boolean zzc(AdRequestParcel adRequestParcel0) {
        return super.zzc(adRequestParcel0) && !this.zzor;
    }
}

