package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

public final class Cart implements SafeParcelable {
    public final class Builder {
        final Cart zzaQi;

        private Builder() {
        }

        Builder(com.google.android.gms.wallet.Cart.1 x1) {
        }

        public Builder addLineItem(LineItem lineItem) {
            Cart.this.zzaQh.add(lineItem);
            return this;
        }

        public Cart build() {
            return Cart.this;
        }

        public Builder setCurrencyCode(String currencyCode) {
            Cart.this.zzaQg = currencyCode;
            return this;
        }

        public Builder setLineItems(List list0) {
            Cart.this.zzaQh.clear();
            Cart.this.zzaQh.addAll(list0);
            return this;
        }

        public Builder setTotalPrice(String totalPrice) {
            Cart.this.zzaQf = totalPrice;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    String zzaQf;
    String zzaQg;
    ArrayList zzaQh;

    static {
        Cart.CREATOR = new zzb();
    }

    Cart() {
        this.zzCY = 1;
        this.zzaQh = new ArrayList();
    }

    Cart(int versionCode, String totalPrice, String currencyCode, ArrayList arrayList0) {
        this.zzCY = versionCode;
        this.zzaQf = totalPrice;
        this.zzaQg = currencyCode;
        this.zzaQh = arrayList0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCurrencyCode() {
        return this.zzaQg;
    }

    public ArrayList getLineItems() {
        return this.zzaQh;
    }

    public String getTotalPrice() {
        return this.zzaQf;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    public static Builder newBuilder() {
        Cart cart0 = new Cart();
        cart0.getClass();
        return new Builder(cart0, null);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzb.zza(this, dest, flags);
    }

    class com.google.android.gms.wallet.Cart.1 {
    }

}

