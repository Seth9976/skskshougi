package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.reward.client.zzb.zza;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public class zzgn extends zza {
    private final Context mContext;
    private final zzgo zzEM;
    private final VersionInfoParcel zzoM;
    private final Object zzqt;

    public zzgn(Context context0, zzef zzef0, VersionInfoParcel versionInfoParcel0) {
        this.mContext = context0;
        this.zzoM = versionInfoParcel0;
        this.zzEM = new zzgo(context0, AdSizeParcel.zzcx(), zzef0, versionInfoParcel0);
        this.zzqt = new Object();
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzb
    public void destroy() {
        synchronized(this.zzqt) {
            this.zzEM.destroy();
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzb
    public boolean isLoaded() {
        synchronized(this.zzqt) {
        }
        return this.zzEM.isLoaded();
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzb
    public void pause() {
        synchronized(this.zzqt) {
            this.zzEM.pause();
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzb
    public void resume() {
        synchronized(this.zzqt) {
            this.zzEM.resume();
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzb
    public void setUserId(String userId) {
        synchronized(this.zzqt) {
            this.zzEM.setUserId(userId);
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzb
    public void show() {
        synchronized(this.zzqt) {
            this.zzEM.zzfK();
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzb
    public void zza(RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel0) {
        synchronized(this.zzqt) {
            this.zzEM.zza(rewardedVideoAdRequestParcel0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.reward.client.zzb
    public void zza(zzd zzd0) {
        synchronized(this.zzqt) {
            this.zzEM.zza(zzd0);
        }
    }
}

