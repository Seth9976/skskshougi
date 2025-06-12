package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import jeb.synthetic.FIN;

public class zzi implements RewardedVideoAd {
    private final Context mContext;
    private String zzEO;
    private RewardedVideoAdListener zzES;
    private final zzb zzET;
    private final Object zzqt;

    public zzi(Context context0, zzb zzb0) {
        this.zzqt = new Object();
        this.zzET = zzb0;
        this.mContext = context0;
    }

    @Override  // com.google.android.gms.ads.reward.RewardedVideoAd
    public void destroy() {
        synchronized(this.zzqt) {
            if(this.zzET == null) {
                return;
            }
            try {
                this.zzET.destroy();
            }
            catch(RemoteException remoteException0) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward destroy to RewardedVideoAd", remoteException0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.reward.RewardedVideoAd
    public RewardedVideoAdListener getRewardedVideoAdListener() {
        synchronized(this.zzqt) {
        }
        return this.zzES;
    }

    @Override  // com.google.android.gms.ads.reward.RewardedVideoAd
    public String getUserId() {
        synchronized(this.zzqt) {
        }
        return this.zzEO;
    }

    @Override  // com.google.android.gms.ads.reward.RewardedVideoAd
    public boolean isLoaded() {
        Object object0 = this.zzqt;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(this.zzET == null) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v);
            return false;
        }
        try {
            boolean z = this.zzET.isLoaded();
            FIN.finallyExec$NT(v);
            return z;
        }
        catch(RemoteException remoteException0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward isLoaded to RewardedVideoAd", remoteException0);
            FIN.finallyExec$NT(v);
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.reward.RewardedVideoAd
    public void loadAd(String adUnitId, AdRequest adRequest) {
        synchronized(this.zzqt) {
            if(this.zzET == null) {
                return;
            }
            try {
                RewardedVideoAdRequestParcel rewardedVideoAdRequestParcel0 = zzg.zzcw().zza(this.mContext, adRequest.zzaF(), adUnitId);
                this.zzET.zza(rewardedVideoAdRequestParcel0);
            }
            catch(RemoteException remoteException0) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward loadAd to RewardedVideoAd", remoteException0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.reward.RewardedVideoAd
    public void pause() {
        synchronized(this.zzqt) {
            if(this.zzET == null) {
                return;
            }
            try {
                this.zzET.pause();
            }
            catch(RemoteException remoteException0) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward pause to RewardedVideoAd", remoteException0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.reward.RewardedVideoAd
    public void resume() {
        synchronized(this.zzqt) {
            if(this.zzET == null) {
                return;
            }
            try {
                this.zzET.resume();
            }
            catch(RemoteException remoteException0) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward resume to RewardedVideoAd", remoteException0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.reward.RewardedVideoAd
    public void setRewardedVideoAdListener(RewardedVideoAdListener listener) {
        synchronized(this.zzqt) {
            if(this.zzES != null) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("A RewardedVideoAdListener has already been set, ignoring.");
                return;
            }
            this.zzES = listener;
            if(this.zzET != null) {
                try {
                    com.google.android.gms.ads.internal.reward.client.zzg zzg0 = new com.google.android.gms.ads.internal.reward.client.zzg(listener);
                    this.zzET.zza(zzg0);
                }
                catch(RemoteException remoteException0) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward setRewardedVideoAdListener to RewardedVideoAd", remoteException0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.ads.reward.RewardedVideoAd
    public void setUserId(String userId) {
        synchronized(this.zzqt) {
            if(!TextUtils.isEmpty(this.zzEO)) {
                com.google.android.gms.ads.internal.util.client.zzb.zzaC("A user id has already been set, ignoring.");
                return;
            }
            this.zzEO = userId;
            if(this.zzET != null) {
                try {
                    this.zzET.setUserId(userId);
                }
                catch(RemoteException remoteException0) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward setUserId to RewardedVideoAd", remoteException0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.ads.reward.RewardedVideoAd
    public void show() {
        synchronized(this.zzqt) {
            if(this.zzET == null) {
                return;
            }
            try {
                this.zzET.show();
            }
            catch(RemoteException remoteException0) {
                com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not forward show to RewardedVideoAd", remoteException0);
            }
        }
    }
}

