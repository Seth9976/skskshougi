package com.google.android.gms.tagmanager;

import com.google.android.gms.analytics.CampaignTrackingReceiver;

public final class InstallReferrerReceiver extends CampaignTrackingReceiver {
    @Override  // com.google.android.gms.analytics.CampaignTrackingReceiver
    protected void zzaL(String s) {
        zzax.zzex(s);
    }

    @Override  // com.google.android.gms.analytics.CampaignTrackingReceiver
    protected Class zzhf() {
        return InstallReferrerService.class;
    }
}

