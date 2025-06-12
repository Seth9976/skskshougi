package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzo;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.zzu;
import java.util.HashMap;

@zzgd
public class zzgo extends zzb implements zzgs {
    private zzd zzEN;
    private String zzEO;
    private boolean zzEP;
    private HashMap zzEQ;

    public zzgo(Context context0, AdSizeParcel adSizeParcel0, zzef zzef0, VersionInfoParcel versionInfoParcel0) {
        super(context0, adSizeParcel0, null, zzef0, versionInfoParcel0);
        this.zzEQ = new HashMap();
    }

    @Override  // com.google.android.gms.ads.internal.zza
    public void destroy() {
        zzu.zzbY("destroy must be called on the main UI thread.");
        for(Object object0: this.zzEQ.keySet()) {
            String s = (String)object0;
            try {
                zzgp zzgp0 = (zzgp)this.zzEQ.get(s);
                if(zzgp0 == null || zzgp0.zzfM() == null) {
                    continue;
                }
                zzgp0.zzfM().destroy();
            }
            catch(RemoteException unused_ex) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC(("Fail to destroy adapter: " + s));
            }
        }
    }

    public boolean isLoaded() {
        zzu.zzbY("isLoaded must be called on the main UI thread.");
        return this.zzon.zzpL == null && this.zzon.zzpM == null && this.zzon.zzpO != null;
    }

    @Override  // com.google.android.gms.internal.zzgs
    public void onRewardedVideoAdClosed() {
        if(this.zzEN == null) {
            return;
        }
        try {
            this.zzEN.onRewardedVideoAdClosed();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdClosed().", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.zzgs
    public void onRewardedVideoAdLeftApplication() {
        if(this.zzEN == null) {
            return;
        }
        try {
            this.zzEN.onRewardedVideoAdLeftApplication();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdLeftApplication().", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.zzgs
    public void onRewardedVideoAdOpened() {
        this.recordImpression();
        if(this.zzEN == null) {
            return;
        }
        try {
            this.zzEN.onRewardedVideoAdOpened();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdOpened().", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.zzgs
    public void onRewardedVideoStarted() {
        zzo.zzbG().zza(this.zzon.zzpH, this.zzon.zzpJ.zzGG, this.zzon.zzpO, this.zzon.zzpG, false, this.zzon.zzpO.zzxZ.zzxB);
        if(this.zzEN == null) {
            return;
        }
        try {
            this.zzEN.onRewardedVideoStarted();
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onVideoStarted().", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    public void pause() {
        zzu.zzbY("pause must be called on the main UI thread.");
        for(Object object0: this.zzEQ.keySet()) {
            String s = (String)object0;
            try {
                zzgp zzgp0 = (zzgp)this.zzEQ.get(s);
                if(zzgp0 == null || zzgp0.zzfM() == null) {
                    continue;
                }
                zzgp0.zzfM().pause();
            }
            catch(RemoteException unused_ex) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC(("Fail to pause adapter: " + s));
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    public void resume() {
        zzu.zzbY("resume must be called on the main UI thread.");
        for(Object object0: this.zzEQ.keySet()) {
            String s = (String)object0;
            try {
                zzgp zzgp0 = (zzgp)this.zzEQ.get(s);
                if(zzgp0 == null || zzgp0.zzfM() == null) {
                    continue;
                }
                zzgp0.zzfM().resume();
            }
            catch(RemoteException unused_ex) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC(("Fail to resume adapter: " + s));
            }
        }
    }

    public void setUserId(String userId) {
        zzu.zzbY("setUserId must be called on the main UI thread.");
        this.zzEO = userId;
    }

    public void zza(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel0) {
        zzu.zzbY("loadAd must be called on the main UI thread.");
        if(TextUtils.isEmpty(rewardedVideoAdRequestParcel0.zzpG)) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("Invalid ad unit id. Aborting.");
            return;
        }
        this.zzEP = false;
        this.zzon.zzpG = rewardedVideoAdRequestParcel0.zzpG;
        super.zza(rewardedVideoAdRequestParcel0.zzCm);
    }

    public void zza(zzd zzd0) {
        zzu.zzbY("setRewardedVideoAdListener must be called on the main UI thread.");
        this.zzEN = zzd0;
    }

    @Override  // com.google.android.gms.internal.zzgs
    public void zza(RewardItemParcel rewardItemParcel0) {
        zzo.zzbG().zza(this.zzon.zzpH, this.zzon.zzpJ.zzGG, this.zzon.zzpO, this.zzon.zzpG, false, this.zzon.zzpO.zzxZ.zzxC);
        if(this.zzEN == null) {
            return;
        }
        try {
            if(this.zzon.zzpO != null && this.zzon.zzpO.zzFm != null && !TextUtils.isEmpty(this.zzon.zzpO.zzFm.zzxK)) {
                this.zzEN.zza(new zzgm(this.zzon.zzpO.zzFm.zzxK, this.zzon.zzpO.zzFm.zzxL));
                return;
            }
            this.zzEN.zza(new zzgm(rewardItemParcel0.type, rewardItemParcel0.zzFk));
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onRewarded().", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.zzb
    public boolean zza(zzha zzha0, zzha zzha1) {
        if(this.zzEN != null) {
            try {
                this.zzEN.onRewardedVideoAdLoaded();
            }
            catch(RemoteException remoteException0) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdLoaded().", remoteException0);
            }
            return true;
        }
        return true;
    }

    public zzgp zzao(String s) {
        zzgp zzgp1;
        zzgp zzgp0 = (zzgp)this.zzEQ.get(s);
        if(zzgp0 == null) {
            try {
                zzgp1 = new zzgp(this.zzoq.zzY(s), this);
            }
            catch(Exception exception0) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd(("Fail to instantiate adapter " + s), exception0);
                return zzgp0;
            }
            try {
                this.zzEQ.put(s, zzgp1);
                return zzgp1;
            }
            catch(Exception exception1) {
                zzgp0 = zzgp1;
                exception0 = exception1;
            }
            com.google.android.gms.ads.internal.util.client.zzb.zzd(("Fail to instantiate adapter " + s), exception0);
            return zzgp0;
        }
        return zzgp0;
    }

    @Override  // com.google.android.gms.ads.internal.zza
    public boolean zzb(zza zzha$zza0) {
        if(zzha$zza0.errorCode != -2) {
            this.zzb(new zzha(zzha$zza0, null, null, null, null, null, null));
            return true;
        }
        this.zzon.zzqh = 0;
        zzp zzp0 = this.zzon;
        zzp0.zzpM = new zzgv(this.zzon.zzpH, this.zzEO, zzha$zza0, this);
        this.zzon.zzpM.zzgi();
        return true;
    }

    @Override  // com.google.android.gms.ads.internal.zza
    protected boolean zze(int v) {
        com.google.android.gms.ads.internal.util.client.zzb.zzaC(("Failed to load ad: " + v));
        if(this.zzEN == null) {
            return false;
        }
        try {
            this.zzEN.onRewardedVideoAdFailedToLoad(v);
            return true;
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call RewardedVideoAdListener.onAdFailedToLoad().", remoteException0);
            return false;
        }
    }

    public void zzfK() {
        zzu.zzbY("showAd must be called on the main UI thread.");
        if(!this.isLoaded() || this.zzEP) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("The reward video has not loaded.");
            return;
        }
        this.zzEP = true;
        zzgp zzgp0 = this.zzao(this.zzon.zzpO.zzyb);
        if(zzgp0 != null && zzgp0.zzfM() != null) {
            try {
                zzgp0.zzfM().showVideo();
            }
            catch(RemoteException remoteException0) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call showVideo.", remoteException0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.zzgs
    public void zzfL() {
        this.onAdClicked();
    }
}

