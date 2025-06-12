package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.reward.client.zzi;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.internal.zzee;

public class zzaa {
    private static final Object zzoW;
    private static zzaa zzta;
    private zzv zztb;
    private RewardedVideoAd zztc;

    static {
        zzaa.zzoW = new Object();
    }

    public RewardedVideoAd getRewardedVideoAdInstance(Context context) {
        synchronized(zzaa.zzoW) {
            if(this.zztc != null) {
                return this.zztc;
            }
            zzee zzee0 = new zzee();
            this.zztc = new zzi(context, zzk.zzcF().zza(context, zzee0));
            return this.zztc;
        }
    }

    public void zza(Context context0, String s, zzab zzab0) {
        synchronized(zzaa.zzoW) {
            if(this.zztb != null) {
                return;
            }
            if(context0 == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            if(TextUtils.isEmpty(s)) {
                throw new IllegalArgumentException("applicationCode cannot be empty.");
            }
            try {
                this.zztb = zzk.zzcD().zzt(context0);
                this.zztb.zza(s, (zzab0 == null ? null : new MobileAdsSettingsParcel(zzab0)));
            }
            catch(RemoteException unused_ex) {
                zzb.zzaC("Fail to initialize mobile ads setting manager");
            }
        }
    }

    public static zzaa zzcP() {
        synchronized(zzaa.zzoW) {
            if(zzaa.zzta == null) {
                zzaa.zzta = new zzaa();
            }
            return zzaa.zzta;
        }
    }
}

