package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzgd;

@zzgd
public class zzb implements MediationRewardedVideoAdListener {
    private final zza zzFj;

    public zzb(zza zza0) {
        this.zzFj = zza0;
    }

    @Override  // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public void onAdClicked(MediationRewardedVideoAdAdapter adapter) {
        zzu.zzbY("onAdClicked must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onAdClicked.");
        try {
            zzd zzd0 = zze.zzw(adapter);
            this.zzFj.zzj(zzd0);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdClicked.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public void onAdClosed(MediationRewardedVideoAdAdapter adapter) {
        zzu.zzbY("onAdClosed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onAdClosed.");
        try {
            zzd zzd0 = zze.zzw(adapter);
            this.zzFj.zzi(zzd0);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdClosed.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public void onAdFailedToLoad(MediationRewardedVideoAdAdapter adapter, int errorCode) {
        zzu.zzbY("onAdFailedToLoad must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onAdFailedToLoad.");
        try {
            zzd zzd0 = zze.zzw(adapter);
            this.zzFj.zzc(zzd0, errorCode);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdFailedToLoad.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public void onAdLeftApplication(MediationRewardedVideoAdAdapter adapter) {
        zzu.zzbY("onAdLeftApplication must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onAdLeftApplication.");
        try {
            zzd zzd0 = zze.zzw(adapter);
            this.zzFj.zzk(zzd0);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdLeftApplication.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public void onAdLoaded(MediationRewardedVideoAdAdapter adapter) {
        zzu.zzbY("onAdLoaded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onAdLoaded.");
        try {
            zzd zzd0 = zze.zzw(adapter);
            this.zzFj.zzf(zzd0);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdLoaded.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public void onAdOpened(MediationRewardedVideoAdAdapter adapter) {
        zzu.zzbY("onAdOpened must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onAdOpened.");
        try {
            zzd zzd0 = zze.zzw(adapter);
            this.zzFj.zzg(zzd0);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onAdOpened.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public void onInitializationFailed(MediationRewardedVideoAdAdapter adapter, int errorCode) {
        zzu.zzbY("onInitializationFailed must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onInitializationFailed.");
        try {
            zzd zzd0 = zze.zzw(adapter);
            this.zzFj.zzb(zzd0, errorCode);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onInitializationFailed.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public void onInitializationSucceeded(MediationRewardedVideoAdAdapter adapter) {
        zzu.zzbY("onInitializationSucceeded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onInitializationSucceeded.");
        try {
            zzd zzd0 = zze.zzw(adapter);
            this.zzFj.zze(zzd0);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onInitializationSucceeded.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public void onRewarded(MediationRewardedVideoAdAdapter adapter, RewardItem rewardItem) {
        zzu.zzbY("onRewarded must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onRewarded.");
        try {
            if(rewardItem != null) {
                zzd zzd0 = zze.zzw(adapter);
                RewardItemParcel rewardItemParcel0 = new RewardItemParcel(rewardItem);
                this.zzFj.zza(zzd0, rewardItemParcel0);
                return;
            }
            zzd zzd1 = zze.zzw(adapter);
            RewardItemParcel rewardItemParcel1 = new RewardItemParcel(adapter.getClass().getName(), 1);
            this.zzFj.zza(zzd1, rewardItemParcel1);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onRewarded.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
    public void onVideoStarted(MediationRewardedVideoAdAdapter adapter) {
        zzu.zzbY("onVideoStarted must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.zzb.zzay("Adapter called onVideoStarted.");
        try {
            zzd zzd0 = zze.zzw(adapter);
            this.zzFj.zzh(zzd0);
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call onVideoStarted.", remoteException0);
        }
    }
}

