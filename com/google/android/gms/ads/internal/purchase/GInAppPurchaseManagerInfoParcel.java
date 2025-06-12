package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzfe;
import com.google.android.gms.internal.zzgd;

@zzgd
public final class GInAppPurchaseManagerInfoParcel implements SafeParcelable {
    public static final zza CREATOR;
    public final int versionCode;
    public final zzj zzAA;
    public final zzfe zzAy;
    public final Context zzAz;
    public final zzk zzqe;

    static {
        GInAppPurchaseManagerInfoParcel.CREATOR = new zza();
    }

    GInAppPurchaseManagerInfoParcel(int versionCode, IBinder wrappedInAppPurchaseVerifier, IBinder wrappedInAppPurchase, IBinder wrappedAppContext, IBinder wrappedOnPlayStorePurchaseFinishedListener) {
        this.versionCode = versionCode;
        this.zzqe = (zzk)zze.zzn(com.google.android.gms.dynamic.zzd.zza.zzbg(wrappedInAppPurchaseVerifier));
        this.zzAy = (zzfe)zze.zzn(com.google.android.gms.dynamic.zzd.zza.zzbg(wrappedInAppPurchase));
        this.zzAz = (Context)zze.zzn(com.google.android.gms.dynamic.zzd.zza.zzbg(wrappedAppContext));
        this.zzAA = (zzj)zze.zzn(com.google.android.gms.dynamic.zzd.zza.zzbg(wrappedOnPlayStorePurchaseFinishedListener));
    }

    public GInAppPurchaseManagerInfoParcel(Context appContext, zzk inAppPurchaseVerifier, zzfe inAppPurchase, zzj onPlayStorePurchaseFinishedListener) {
        this.versionCode = 2;
        this.zzAz = appContext;
        this.zzqe = inAppPurchaseVerifier;
        this.zzAy = inAppPurchase;
        this.zzAA = onPlayStorePurchaseFinishedListener;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zza.zza(this, out, flags);
    }

    public static void zza(Intent intent0, GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel0) {
        Bundle bundle0 = new Bundle(1);
        bundle0.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", gInAppPurchaseManagerInfoParcel0);
        intent0.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle0);
    }

    public static GInAppPurchaseManagerInfoParcel zzc(Intent intent0) {
        try {
            Bundle bundle0 = intent0.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            bundle0.setClassLoader(GInAppPurchaseManagerInfoParcel.class.getClassLoader());
            return (GInAppPurchaseManagerInfoParcel)bundle0.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    IBinder zzfa() {
        return zze.zzw(this.zzAA).asBinder();
    }

    IBinder zzfb() {
        return zze.zzw(this.zzqe).asBinder();
    }

    IBinder zzfc() {
        return zze.zzw(this.zzAy).asBinder();
    }

    IBinder zzfd() {
        return zze.zzw(this.zzAz).asBinder();
    }
}

