package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zza;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzgd;

@zzgd
public final class AdSizeParcel implements SafeParcelable {
    public static final zzh CREATOR;
    public final int height;
    public final int heightPixels;
    public final int versionCode;
    public final int width;
    public final int widthPixels;
    public final String zzsm;
    public final boolean zzsn;
    public final AdSizeParcel[] zzso;
    public final boolean zzsp;

    static {
        AdSizeParcel.CREATOR = new zzh();
    }

    public AdSizeParcel() {
        this(3, "interstitial_mb", 0, 0, true, 0, 0, null, false);
    }

    AdSizeParcel(int versionCode, String formatString, int height, int heightPixels, boolean isInterstitial, int width, int widthPixels, AdSizeParcel[] supportedAdSizes, boolean isNative) {
        this.versionCode = versionCode;
        this.zzsm = formatString;
        this.height = height;
        this.heightPixels = heightPixels;
        this.zzsn = isInterstitial;
        this.width = width;
        this.widthPixels = widthPixels;
        this.zzso = supportedAdSizes;
        this.zzsp = isNative;
    }

    public AdSizeParcel(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    public AdSizeParcel(Context context, AdSize[] adSizes) {
        int v;
        AdSize adSize0 = adSizes[0];
        this.versionCode = 3;
        this.zzsn = false;
        this.width = adSize0.getWidth();
        this.height = adSize0.getHeight();
        boolean z = this.width == -1;
        boolean z1 = this.height == -2;
        DisplayMetrics displayMetrics0 = context.getResources().getDisplayMetrics();
        if(z) {
            this.widthPixels = !zzk.zzcA().zzQ(context) || !zzk.zzcA().zzR(context) ? AdSizeParcel.zza(displayMetrics0) : AdSizeParcel.zza(displayMetrics0) - zzk.zzcA().zzS(context);
            double f = (double)(((float)this.widthPixels) / displayMetrics0.density);
            v = f - ((double)(((int)f))) >= 0.01 ? ((int)f) + 1 : ((int)f);
        }
        else {
            this.widthPixels = zzk.zzcA().zza(displayMetrics0, this.width);
            v = this.width;
        }
        int v1 = z1 ? AdSizeParcel.zzc(displayMetrics0) : this.height;
        this.heightPixels = zzk.zzcA().zza(displayMetrics0, v1);
        this.zzsm = !z && !z1 ? adSize0.toString() : v + "x" + v1 + "_as";
        if(adSizes.length > 1) {
            this.zzso = new AdSizeParcel[adSizes.length];
            for(int v2 = 0; v2 < adSizes.length; ++v2) {
                this.zzso[v2] = new AdSizeParcel(context, adSizes[v2]);
            }
        }
        else {
            this.zzso = null;
        }
        this.zzsp = false;
    }

    public AdSizeParcel(AdSizeParcel adSize, AdSizeParcel[] supportedAdSizes) {
        this(3, adSize.zzsm, adSize.height, adSize.heightPixels, adSize.zzsn, adSize.width, adSize.widthPixels, supportedAdSizes, adSize.zzsp);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzh.zza(this, out, flags);
    }

    public static int zza(DisplayMetrics displayMetrics0) {
        return displayMetrics0.widthPixels;
    }

    public static int zzb(DisplayMetrics displayMetrics0) {
        return (int)(((float)AdSizeParcel.zzc(displayMetrics0)) * displayMetrics0.density);
    }

    private static int zzc(DisplayMetrics displayMetrics0) {
        int v = (int)(((float)displayMetrics0.heightPixels) / displayMetrics0.density);
        if(v <= 400) {
            return 0x20;
        }
        return v > 720 ? 90 : 50;
    }

    public static AdSizeParcel zzcx() {
        return new AdSizeParcel(3, "reward_mb", 0, 0, false, 0, 0, null, false);
    }

    public AdSize zzcy() {
        return zza.zza(this.width, this.height, this.zzsm);
    }

    public static AdSizeParcel zzs(Context context0) {
        return new AdSizeParcel(3, "320x50_mb", 0, 0, false, 0, 0, null, true);
    }
}

