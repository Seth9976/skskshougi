package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.gms.R.style;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class WalletFragmentStyle implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    Bundle zzaSm;
    int zzaSn;

    static {
        WalletFragmentStyle.CREATOR = new zzc();
    }

    public WalletFragmentStyle() {
        this.zzCY = 1;
        this.zzaSm = new Bundle();
    }

    WalletFragmentStyle(int versionCode, Bundle attributes, int styleResourceId) {
        this.zzCY = versionCode;
        this.zzaSm = attributes;
        this.zzaSn = styleResourceId;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public WalletFragmentStyle setBuyButtonAppearance(int buyButtonAppearance) {
        this.zzaSm.putInt("buyButtonAppearance", buyButtonAppearance);
        return this;
    }

    public WalletFragmentStyle setBuyButtonHeight(int height) {
        this.zzaSm.putLong("buyButtonHeight", Dimension.zzjx(height));
        return this;
    }

    public WalletFragmentStyle setBuyButtonHeight(int unit, float height) {
        this.zzaSm.putLong("buyButtonHeight", Dimension.zza(unit, height));
        return this;
    }

    public WalletFragmentStyle setBuyButtonText(int buyButtonText) {
        this.zzaSm.putInt("buyButtonText", buyButtonText);
        return this;
    }

    public WalletFragmentStyle setBuyButtonWidth(int width) {
        this.zzaSm.putLong("buyButtonWidth", Dimension.zzjx(width));
        return this;
    }

    public WalletFragmentStyle setBuyButtonWidth(int unit, float width) {
        this.zzaSm.putLong("buyButtonWidth", Dimension.zza(unit, width));
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsBackgroundColor(int color) {
        this.zzaSm.remove("maskedWalletDetailsBackgroundResource");
        this.zzaSm.putInt("maskedWalletDetailsBackgroundColor", color);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsBackgroundResource(int resourceId) {
        this.zzaSm.remove("maskedWalletDetailsBackgroundColor");
        this.zzaSm.putInt("maskedWalletDetailsBackgroundResource", resourceId);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundColor(int color) {
        this.zzaSm.remove("maskedWalletDetailsButtonBackgroundResource");
        this.zzaSm.putInt("maskedWalletDetailsButtonBackgroundColor", color);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonBackgroundResource(int resourceId) {
        this.zzaSm.remove("maskedWalletDetailsButtonBackgroundColor");
        this.zzaSm.putInt("maskedWalletDetailsButtonBackgroundResource", resourceId);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsButtonTextAppearance(int resourceId) {
        this.zzaSm.putInt("maskedWalletDetailsButtonTextAppearance", resourceId);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsHeaderTextAppearance(int resourceId) {
        this.zzaSm.putInt("maskedWalletDetailsHeaderTextAppearance", resourceId);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsLogoImageType(int imageType) {
        this.zzaSm.putInt("maskedWalletDetailsLogoImageType", imageType);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsLogoTextColor(int color) {
        this.zzaSm.putInt("maskedWalletDetailsLogoTextColor", color);
        return this;
    }

    public WalletFragmentStyle setMaskedWalletDetailsTextAppearance(int resourceId) {
        this.zzaSm.putInt("maskedWalletDetailsTextAppearance", resourceId);
        return this;
    }

    public WalletFragmentStyle setStyleResourceId(int id) {
        this.zzaSn = id;
        return this;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzc.zza(this, dest, flags);
    }

    private void zza(TypedArray typedArray0, int v, String s) {
        if(!this.zzaSm.containsKey(s)) {
            TypedValue typedValue0 = typedArray0.peekValue(v);
            if(typedValue0 != null) {
                this.zzaSm.putLong(s, Dimension.zza(typedValue0));
            }
        }
    }

    private void zza(TypedArray typedArray0, int v, String s, String s1) {
        if(!this.zzaSm.containsKey(s) && !this.zzaSm.containsKey(s1)) {
            TypedValue typedValue0 = typedArray0.peekValue(v);
            if(typedValue0 != null) {
                if(typedValue0.type >= 28 && typedValue0.type <= 0x1F) {
                    this.zzaSm.putInt(s, typedValue0.data);
                    return;
                }
                this.zzaSm.putInt(s1, typedValue0.resourceId);
            }
        }
    }

    // 去混淆评级： 低(20)
    public int zza(String s, DisplayMetrics displayMetrics0, int v) {
        return this.zzaSm.containsKey(s) ? Dimension.zza(this.zzaSm.getLong(s), displayMetrics0) : v;
    }

    public void zzaL(Context context0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes((this.zzaSn > 0 ? this.zzaSn : style.WalletFragmentDefaultStyle), styleable.WalletFragmentStyle);
        this.zza(typedArray0, styleable.WalletFragmentStyle_buyButtonWidth, "buyButtonWidth");
        this.zza(typedArray0, styleable.WalletFragmentStyle_buyButtonHeight, "buyButtonHeight");
        this.zzb(typedArray0, styleable.WalletFragmentStyle_buyButtonText, "buyButtonText");
        this.zzb(typedArray0, styleable.WalletFragmentStyle_buyButtonAppearance, "buyButtonAppearance");
        this.zzb(typedArray0, styleable.WalletFragmentStyle_maskedWalletDetailsTextAppearance, "maskedWalletDetailsTextAppearance");
        this.zzb(typedArray0, styleable.WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance, "maskedWalletDetailsHeaderTextAppearance");
        this.zza(typedArray0, styleable.WalletFragmentStyle_maskedWalletDetailsBackground, "maskedWalletDetailsBackgroundColor", "maskedWalletDetailsBackgroundResource");
        this.zzb(typedArray0, styleable.WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance, "maskedWalletDetailsButtonTextAppearance");
        this.zza(typedArray0, styleable.WalletFragmentStyle_maskedWalletDetailsButtonBackground, "maskedWalletDetailsButtonBackgroundColor", "maskedWalletDetailsButtonBackgroundResource");
        this.zzb(typedArray0, styleable.WalletFragmentStyle_maskedWalletDetailsLogoTextColor, "maskedWalletDetailsLogoTextColor");
        this.zzb(typedArray0, styleable.WalletFragmentStyle_maskedWalletDetailsLogoImageType, "maskedWalletDetailsLogoImageType");
        typedArray0.recycle();
    }

    private void zzb(TypedArray typedArray0, int v, String s) {
        if(!this.zzaSm.containsKey(s)) {
            TypedValue typedValue0 = typedArray0.peekValue(v);
            if(typedValue0 != null) {
                this.zzaSm.putInt(s, typedValue0.data);
            }
        }
    }
}

