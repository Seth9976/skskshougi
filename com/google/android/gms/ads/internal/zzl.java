package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.MobileAdsSettingsParcel;
import com.google.android.gms.ads.internal.client.zzv.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.purchase.InAppPurchaseActivity;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zznw;
import com.google.android.gms.internal.zzod;
import com.google.android.gms.internal.zzpv;
import com.google.android.gms.internal.zzpw;
import java.util.regex.Pattern;

@zzgd
public class zzl extends zza implements com.google.android.gms.internal.zznw.zza, com.google.android.gms.internal.zzpw.zza {
    private final Context mContext;
    private static final Object zzoW;
    private static zzl zzoX;
    zzpv zzoY;
    String zzoZ;
    String zzpa;
    private boolean zzpb;
    private boolean zzpc;

    static {
        zzl.zzoW = new Object();
    }

    zzl(Context context0) {
        this.mContext = context0;
        this.zzpb = false;
    }

    public String getClientId() {
        synchronized(zzl.zzoW) {
            return !this.zzpc ? null : GoogleAnalytics.getInstance(this.mContext).getClientId();
        }
    }

    @Override  // com.google.android.gms.internal.zznw$zza
    public void zza(zzod zzod0) {
    }

    @Override  // com.google.android.gms.internal.zznw$zza
    public void zza(zzod zzod0, Activity activity0) {
        if(zzod0 != null && activity0 != null) {
            if(activity0 instanceof AdActivity) {
                int v = zzo.zzbv().zzk(activity0);
                if(v == 1) {
                    zzod0.zzai(true);
                    zzod0.setScreenName("Interstitial Ad");
                    return;
                }
                if(v == 2 || v == 3) {
                    zzod0.setScreenName("Expanded Ad");
                    return;
                }
                zzod0.setScreenName(null);
                return;
            }
            if(activity0 instanceof InAppPurchaseActivity) {
                zzod0.setScreenName(null);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzv
    public void zza(String s, MobileAdsSettingsParcel mobileAdsSettingsParcel0) {
        synchronized(zzl.zzoW) {
            if(this.zzpb) {
                zzb.zzaC("Mobile ads is initialized already.");
                return;
            }
            if(this.mContext == null) {
                zzb.zzaC("Fail to initialize mobile ads because context is null.");
                return;
            }
            if(TextUtils.isEmpty(s)) {
                zzb.zzaC("Fail to initialize mobile ads because ApplicationCode is empty.");
                return;
            }
            this.zzpb = true;
            this.zzb(s, mobileAdsSettingsParcel0);
        }
    }

    void zzb(String s, MobileAdsSettingsParcel mobileAdsSettingsParcel0) {
        if(mobileAdsSettingsParcel0 != null && mobileAdsSettingsParcel0.zztf) {
            if(!zzo.zzbv().zza(this.mContext.getPackageManager(), "org.dyndns.vivi.SkskShogi", "android.permission.INTERNET")) {
                zzb.zzaz("Missing permission android.permission.INTERNET");
                return;
            }
            if(!zzo.zzbv().zza(this.mContext.getPackageManager(), "org.dyndns.vivi.SkskShogi", "android.permission.ACCESS_NETWORK_STATE")) {
                zzb.zzaz("Missing permission android.permission.ACCESS_NETWORK_STATE");
                return;
            }
            if(!Pattern.matches("ca-app-[a-z0-9_-]+~[a-z0-9_-]+", s)) {
                throw new IllegalArgumentException("Please provide a valid application code");
            }
            this.zzpc = true;
            this.zzoZ = s;
            this.zzpa = mobileAdsSettingsParcel0.zztg;
            zzpw zzpw0 = zzpw.zzaK(this.mContext);
            com.google.android.gms.internal.zzpv.zza zzpv$zza0 = new com.google.android.gms.internal.zzpv.zza(this.zzoZ);
            if(!TextUtils.isEmpty(this.zzpa)) {
                zzpv$zza0.zzeS(this.zzpa);
            }
            zzpw0.zza(zzpv$zza0.zzzW());
            zzpw0.zza(this);
            zznw.zzaC(this.mContext).zza(this);
            zzpw0.start();
        }
    }

    public boolean zzbl() {
        synchronized(zzl.zzoW) {
        }
        return this.zzpc;
    }

    @Override  // com.google.android.gms.internal.zzpw$zza
    public void zzbm() {
        this.zzoY = zzpw.zzaK(this.mContext).zzzX();
    }

    public int zzbn() {
        synchronized(zzl.zzoW) {
            if(!this.zzpc) {
                return -1;
            }
            zzod zzod0 = zznw.zzaC(this.mContext).zzwe();
            return zzod0 != null ? zzod0.zzbn() : -1;
        }
    }

    public static zzl zzq(Context context0) {
        synchronized(zzl.zzoW) {
            if(zzl.zzoX == null) {
                zzl.zzoX = new zzl(context0.getApplicationContext());
            }
            return zzl.zzoX;
        }
    }
}

