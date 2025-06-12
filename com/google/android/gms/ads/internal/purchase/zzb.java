package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.internal.zzgd;

@zzgd
public class zzb {
    private final Context mContext;
    Object zzAB;

    public zzb(Context context0) {
        this.mContext = context0;
    }

    public void destroy() {
        this.zzAB = null;
    }

    public void zzK(IBinder iBinder0) {
        try {
            this.zzAB = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", IBinder.class).invoke(null, iBinder0);
        }
        catch(Exception unused_ex) {
            com.google.android.gms.ads.internal.util.client.zzb.zzaC("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
        }
    }

    public Bundle zzb(String s, String s1, String s2) {
        try {
            Class class0 = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return (Bundle)class0.getDeclaredMethod("getBuyIntent", Integer.TYPE, String.class, String.class, String.class, String.class).invoke(class0.cast(this.zzAB), 3, s, s1, "inapp", s2);
        }
        catch(Exception exception0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", exception0);
            return null;
        }
    }

    public int zzh(String s, String s1) {
        try {
            Class class0 = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return (int)(((Integer)class0.getDeclaredMethod("consumePurchase", Integer.TYPE, String.class, String.class).invoke(class0.cast(this.zzAB), 3, s, s1)));
        }
        catch(Exception exception0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", exception0);
            return 5;
        }
    }

    public Bundle zzi(String s, String s1) {
        try {
            Class class0 = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
            return (Bundle)class0.getDeclaredMethod("getPurchases", Integer.TYPE, String.class, String.class, String.class).invoke(class0.cast(this.zzAB), 3, s, "inapp", s1);
        }
        catch(Exception exception0) {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", exception0);
            return null;
        }
    }
}

