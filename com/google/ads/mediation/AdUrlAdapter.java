package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

public final class AdUrlAdapter extends AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter {
    @Override  // com.google.ads.mediation.AbstractAdViewAdapter
    protected Bundle zza(Bundle bundle0, Bundle bundle1) {
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        bundle0.putBundle("sdk_less_server_data", bundle1);
        bundle0.putBoolean("_noRefresh", true);
        return bundle0;
    }
}

