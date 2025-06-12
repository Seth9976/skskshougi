package com.google.ads.mediation.admob;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

public final class AdMobAdapter extends AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter {
    @Override  // com.google.ads.mediation.AbstractAdViewAdapter
    protected Bundle zza(Bundle bundle0, Bundle bundle1) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        bundle0.putInt("gw", 1);
        bundle0.putString("mad_hac", bundle1.getString("mad_hac"));
        if(!TextUtils.isEmpty(bundle1.getString("adJson"))) {
            bundle0.putString("_ad", bundle1.getString("adJson"));
        }
        bundle0.putBoolean("_noRefresh", true);
        return bundle0;
    }
}

