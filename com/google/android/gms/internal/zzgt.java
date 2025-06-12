package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.zza.zza;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

@zzgd
public class zzgt extends zza {
    private zzgu zzEW;
    private zzgr zzFc;
    private zzgs zzFd;

    public zzgt(zzgs zzgs0) {
        this.zzFd = zzgs0;
    }

    @Override  // com.google.android.gms.ads.internal.reward.mediation.client.zza
    public void zza(zzd zzd0, RewardItemParcel rewardItemParcel0) {
        if(this.zzFd != null) {
            this.zzFd.zza(rewardItemParcel0);
        }
    }

    public void zza(zzgr zzgr0) {
        this.zzFc = zzgr0;
    }

    public void zza(zzgu zzgu0) {
        this.zzEW = zzgu0;
    }

    @Override  // com.google.android.gms.ads.internal.reward.mediation.client.zza
    public void zzb(zzd zzd0, int v) {
        if(this.zzFc != null) {
            this.zzFc.zzI(v);
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.mediation.client.zza
    public void zzc(zzd zzd0, int v) {
        if(this.zzEW != null) {
            this.zzEW.zzb(zze.zzn(zzd0).getClass().getName(), v);
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.mediation.client.zza
    public void zze(zzd zzd0) {
        if(this.zzFc != null) {
            this.zzFc.zzfO();
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.mediation.client.zza
    public void zzf(zzd zzd0) {
        if(this.zzEW != null) {
            this.zzEW.zzap(zze.zzn(zzd0).getClass().getName());
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.mediation.client.zza
    public void zzg(zzd zzd0) {
        if(this.zzFd != null) {
            this.zzFd.onRewardedVideoAdOpened();
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.mediation.client.zza
    public void zzh(zzd zzd0) {
        if(this.zzFd != null) {
            this.zzFd.onRewardedVideoStarted();
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.mediation.client.zza
    public void zzi(zzd zzd0) {
        if(this.zzFd != null) {
            this.zzFd.onRewardedVideoAdClosed();
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.mediation.client.zza
    public void zzj(zzd zzd0) {
        if(this.zzFd != null) {
            this.zzFd.zzfL();
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.mediation.client.zza
    public void zzk(zzd zzd0) {
        if(this.zzFd != null) {
            this.zzFd.onRewardedVideoAdLeftApplication();
        }
    }
}

