package com.google.android.gms.ads.internal.reward.client;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class zzg extends zza {
    private final RewardedVideoAdListener zzES;

    public zzg(RewardedVideoAdListener rewardedVideoAdListener0) {
        this.zzES = rewardedVideoAdListener0;
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzd
    public void onRewardedVideoAdClosed() {
        if(this.zzES != null) {
            this.zzES.onRewardedVideoAdClosed();
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzd
    public void onRewardedVideoAdFailedToLoad(int errorCode) {
        if(this.zzES != null) {
            this.zzES.onRewardedVideoAdFailedToLoad(errorCode);
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzd
    public void onRewardedVideoAdLeftApplication() {
        if(this.zzES != null) {
            this.zzES.onRewardedVideoAdLeftApplication();
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzd
    public void onRewardedVideoAdLoaded() {
        if(this.zzES != null) {
            this.zzES.onRewardedVideoAdLoaded();
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzd
    public void onRewardedVideoAdOpened() {
        if(this.zzES != null) {
            this.zzES.onRewardedVideoAdOpened();
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzd
    public void onRewardedVideoStarted() {
        if(this.zzES != null) {
            this.zzES.onRewardedVideoStarted();
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzd
    public void zza(com.google.android.gms.ads.internal.reward.client.zza zza0) {
        if(this.zzES != null) {
            zze zze0 = new zze(zza0);
            this.zzES.onRewarded(zze0);
        }
    }
}

