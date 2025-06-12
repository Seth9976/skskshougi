package com.google.android.gms.internal;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.zza;
import java.util.Date;
import java.util.HashSet;

@zzgd
public final class zzen {
    public static int zza(ErrorCode adRequest$ErrorCode0) {
        switch(adRequest$ErrorCode0) {
            case INVALID_REQUEST: {
                return 1;
            }
            case NETWORK_ERROR: {
                return 2;
            }
            case NO_FILL: {
                return 3;
            }
            default: {
                return 0;
            }
        }
    }

    public static AdSize zzb(AdSizeParcel adSizeParcel0) {
        AdSize[] arr_adSize = {AdSize.SMART_BANNER, AdSize.BANNER, AdSize.IAB_MRECT, AdSize.IAB_BANNER, AdSize.IAB_LEADERBOARD, AdSize.IAB_WIDE_SKYSCRAPER};
        for(int v = 0; v < 6; ++v) {
            if(arr_adSize[v].getWidth() == adSizeParcel0.width && arr_adSize[v].getHeight() == adSizeParcel0.height) {
                return arr_adSize[v];
            }
        }
        return new AdSize(zza.zza(adSizeParcel0.width, adSizeParcel0.height, adSizeParcel0.zzsm));
    }

    public static MediationAdRequest zzg(AdRequestParcel adRequestParcel0) {
        if(adRequestParcel0.zzrZ != null) {
            HashSet hashSet0 = new HashSet(adRequestParcel0.zzrZ);
            return new MediationAdRequest(new Date(adRequestParcel0.zzrX), zzen.zzt(adRequestParcel0.zzrY), hashSet0, adRequestParcel0.zzsa, adRequestParcel0.zzsf);
        }
        return new MediationAdRequest(new Date(adRequestParcel0.zzrX), zzen.zzt(adRequestParcel0.zzrY), null, adRequestParcel0.zzsa, adRequestParcel0.zzsf);
    }

    public static Gender zzt(int v) {
        switch(v) {
            case 1: {
                return Gender.MALE;
            }
            case 2: {
                return Gender.FEMALE;
            }
            default: {
                return Gender.UNKNOWN;
            }
        }
    }
}

