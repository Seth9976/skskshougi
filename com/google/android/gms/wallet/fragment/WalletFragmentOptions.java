package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class WalletFragmentOptions implements SafeParcelable {
    public final class Builder {
        final WalletFragmentOptions zzaSl;

        private Builder() {
        }

        Builder(com.google.android.gms.wallet.fragment.WalletFragmentOptions.1 x1) {
        }

        public WalletFragmentOptions build() {
            return WalletFragmentOptions.this;
        }

        public Builder setEnvironment(int environment) {
            WalletFragmentOptions.this.zzaRH = environment;
            return this;
        }

        public Builder setFragmentStyle(int styleResourceId) {
            WalletFragmentStyle walletFragmentStyle0 = new WalletFragmentStyle().setStyleResourceId(styleResourceId);
            WalletFragmentOptions.this.zzaSk = walletFragmentStyle0;
            return this;
        }

        public Builder setFragmentStyle(WalletFragmentStyle fragmentStyle) {
            WalletFragmentOptions.this.zzaSk = fragmentStyle;
            return this;
        }

        public Builder setMode(int mode) {
            WalletFragmentOptions.this.zzacS = mode;
            return this;
        }

        public Builder setTheme(int theme) {
            WalletFragmentOptions.this.mTheme = theme;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private int mTheme;
    final int zzCY;
    private int zzaRH;
    private WalletFragmentStyle zzaSk;
    private int zzacS;

    static {
        WalletFragmentOptions.CREATOR = new zzb();
    }

    private WalletFragmentOptions() {
        this.zzCY = 1;
    }

    WalletFragmentOptions(int versionCode, int environment, int theme, WalletFragmentStyle fragmentStyle, int mode) {
        this.zzCY = versionCode;
        this.zzaRH = environment;
        this.mTheme = theme;
        this.zzaSk = fragmentStyle;
        this.zzacS = mode;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getEnvironment() {
        return this.zzaRH;
    }

    public WalletFragmentStyle getFragmentStyle() {
        return this.zzaSk;
    }

    public int getMode() {
        return this.zzacS;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public static Builder newBuilder() {
        WalletFragmentOptions walletFragmentOptions0 = new WalletFragmentOptions();
        walletFragmentOptions0.getClass();
        return new Builder(walletFragmentOptions0, null);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzb.zza(this, dest, flags);
    }

    public static WalletFragmentOptions zza(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.WalletFragmentOptions);
        int v = typedArray0.getInt(styleable.WalletFragmentOptions_appTheme, 0);
        int v1 = typedArray0.getInt(styleable.WalletFragmentOptions_environment, 1);
        int v2 = typedArray0.getResourceId(styleable.WalletFragmentOptions_fragmentStyle, 0);
        int v3 = typedArray0.getInt(styleable.WalletFragmentOptions_fragmentMode, 1);
        typedArray0.recycle();
        WalletFragmentOptions walletFragmentOptions0 = new WalletFragmentOptions();
        walletFragmentOptions0.mTheme = v;
        walletFragmentOptions0.zzaRH = v1;
        walletFragmentOptions0.zzaSk = new WalletFragmentStyle().setStyleResourceId(v2);
        walletFragmentOptions0.zzaSk.zzaL(context0);
        walletFragmentOptions0.zzacS = v3;
        return walletFragmentOptions0;
    }

    public void zzaL(Context context0) {
        if(this.zzaSk != null) {
            this.zzaSk.zzaL(context0);
        }
    }

    class com.google.android.gms.wallet.fragment.WalletFragmentOptions.1 {
    }

}

