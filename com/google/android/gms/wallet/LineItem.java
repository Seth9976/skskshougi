package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LineItem implements SafeParcelable {
    public final class Builder {
        final LineItem zzaQL;

        private Builder() {
        }

        Builder(com.google.android.gms.wallet.LineItem.1 x1) {
        }

        public LineItem build() {
            return LineItem.this;
        }

        public Builder setCurrencyCode(String currencyCode) {
            LineItem.this.zzaQg = currencyCode;
            return this;
        }

        public Builder setDescription(String description) {
            LineItem.this.description = description;
            return this;
        }

        public Builder setQuantity(String quantity) {
            LineItem.this.zzaQI = quantity;
            return this;
        }

        public Builder setRole(int role) {
            LineItem.this.zzaQK = role;
            return this;
        }

        public Builder setTotalPrice(String totalPrice) {
            LineItem.this.zzaQf = totalPrice;
            return this;
        }

        public Builder setUnitPrice(String unitPrice) {
            LineItem.this.zzaQJ = unitPrice;
            return this;
        }
    }

    public interface Role {
        public static final int REGULAR = 0;
        public static final int SHIPPING = 2;
        public static final int TAX = 1;

    }

    public static final Parcelable.Creator CREATOR;
    String description;
    private final int zzCY;
    String zzaQI;
    String zzaQJ;
    int zzaQK;
    String zzaQf;
    String zzaQg;

    static {
        LineItem.CREATOR = new zzi();
    }

    LineItem() {
        this.zzCY = 1;
        this.zzaQK = 0;
    }

    LineItem(int versionCode, String description, String quantity, String unitPrice, String totalPrice, int role, String currencyCode) {
        this.zzCY = versionCode;
        this.description = description;
        this.zzaQI = quantity;
        this.zzaQJ = unitPrice;
        this.zzaQf = totalPrice;
        this.zzaQK = role;
        this.zzaQg = currencyCode;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCurrencyCode() {
        return this.zzaQg;
    }

    public String getDescription() {
        return this.description;
    }

    public String getQuantity() {
        return this.zzaQI;
    }

    public int getRole() {
        return this.zzaQK;
    }

    public String getTotalPrice() {
        return this.zzaQf;
    }

    public String getUnitPrice() {
        return this.zzaQJ;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    public static Builder newBuilder() {
        LineItem lineItem0 = new LineItem();
        lineItem0.getClass();
        return new Builder(lineItem0, null);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzi.zza(this, dest, flags);
    }

    class com.google.android.gms.wallet.LineItem.1 {
    }

}

