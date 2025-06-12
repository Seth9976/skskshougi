package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.tagmanager.Container;
import java.util.Map;

class zzpu {
    static class zza implements com.google.android.gms.internal.zznw.zza {
        private final Tracker zzIq;

        zza(Tracker tracker0) {
            this.zzIq = tracker0;
        }

        @Override  // com.google.android.gms.internal.zznw$zza
        public void zza(zzod zzod0) {
            this.zzIq.setScreenName(zzod0.zzwB());
            ScreenViewBuilder hitBuilders$ScreenViewBuilder0 = new ScreenViewBuilder();
            hitBuilders$ScreenViewBuilder0.set("&a", String.valueOf(zzod0.zzbn()));
            Map map0 = hitBuilders$ScreenViewBuilder0.build();
            this.zzIq.send(map0);
        }

        @Override  // com.google.android.gms.internal.zznw$zza
        public void zza(zzod zzod0, Activity activity0) {
        }
    }

    private final Context mContext;
    private final zzpv zzoY;

    public zzpu(Context context0, Container container0, zzpv zzpv0) {
        this.mContext = context0;
        this.zzoY = zzpu.zza(container0, zzpv0);
        this.zzzS();
    }

    static zzpv zza(Container container0, zzpv zzpv0) {
        if(container0 == null || container0.isDefault()) {
            return zzpv0;
        }
        com.google.android.gms.internal.zzpv.zza zzpv$zza0 = new com.google.android.gms.internal.zzpv.zza(zzpv0.zzzT());
        zzpv$zza0.zzeS(container0.getString("trackingId")).zzap(container0.getBoolean("trackScreenViews")).zzaq(container0.getBoolean("collectAdIdentifiers"));
        return zzpv$zza0.zzzW();
    }

    void zzb(com.google.android.gms.internal.zznw.zza zznw$zza0) {
        zzu.zzu(zznw$zza0);
        zznw zznw0 = zznw.zzaC(this.mContext);
        zznw0.zzaf(true);
        zznw0.zza(zznw$zza0);
    }

    Tracker zzeR(String s) {
        return GoogleAnalytics.getInstance(this.mContext).newTracker(s);
    }

    public zzpv zzzR() {
        return this.zzoY;
    }

    private void zzzS() {
        if(this.zzoY.zzzU() && !TextUtils.isEmpty(this.zzoY.getTrackingId())) {
            Tracker tracker0 = this.zzeR(this.zzoY.getTrackingId());
            tracker0.enableAdvertisingIdCollection(this.zzoY.zzzV());
            this.zzb(new zza(tracker0));
        }
    }
}

