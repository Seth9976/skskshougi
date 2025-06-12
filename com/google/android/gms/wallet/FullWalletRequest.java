package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FullWalletRequest implements SafeParcelable {
    public final class Builder {
        final FullWalletRequest zzaQy;

        private Builder() {
        }

        Builder(com.google.android.gms.wallet.FullWalletRequest.1 x1) {
        }

        public FullWalletRequest build() {
            return FullWalletRequest.this;
        }

        public Builder setCart(Cart cart) {
            FullWalletRequest.this.zzaQx = cart;
            return this;
        }

        public Builder setGoogleTransactionId(String googleTransactionId) {
            FullWalletRequest.this.zzaQm = googleTransactionId;
            return this;
        }

        public Builder setMerchantTransactionId(String merchantTransactionId) {
            FullWalletRequest.this.zzaQn = merchantTransactionId;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    String zzaQm;
    String zzaQn;
    Cart zzaQx;

    static {
        FullWalletRequest.CREATOR = new zzf();
    }

    FullWalletRequest() {
        this.zzCY = 1;
    }

    FullWalletRequest(int versionCode, String googleTransactionId, String merchantTransactionId, Cart cart) {
        this.zzCY = versionCode;
        this.zzaQm = googleTransactionId;
        this.zzaQn = merchantTransactionId;
        this.zzaQx = cart;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Cart getCart() {
        return this.zzaQx;
    }

    public String getGoogleTransactionId() {
        return this.zzaQm;
    }

    public String getMerchantTransactionId() {
        return this.zzaQn;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    public static Builder newBuilder() {
        FullWalletRequest fullWalletRequest0 = new FullWalletRequest();
        fullWalletRequest0.getClass();
        return new Builder(fullWalletRequest0, null);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzf.zza(this, dest, flags);
    }

    class com.google.android.gms.wallet.FullWalletRequest.1 {
    }

}

