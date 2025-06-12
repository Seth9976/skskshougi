package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

public final class PaymentMethodTokenizationParameters implements SafeParcelable {
    public final class Builder {
        final PaymentMethodTokenizationParameters zzaRA;

        private Builder() {
        }

        Builder(com.google.android.gms.wallet.PaymentMethodTokenizationParameters.1 x1) {
        }

        public Builder addParameter(String name, String value) {
            zzu.zzh(name, "Tokenization parameter name must not be empty");
            zzu.zzh(value, "Tokenization parameter value must not be empty");
            PaymentMethodTokenizationParameters.this.zzaDN.putString(name, value);
            return this;
        }

        public PaymentMethodTokenizationParameters build() {
            return PaymentMethodTokenizationParameters.this;
        }

        public Builder setPaymentMethodTokenizationType(int tokenizationType) {
            PaymentMethodTokenizationParameters.this.zzaRz = tokenizationType;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    Bundle zzaDN;
    int zzaRz;

    static {
        PaymentMethodTokenizationParameters.CREATOR = new zzp();
    }

    private PaymentMethodTokenizationParameters() {
        this.zzaDN = new Bundle();
        this.zzCY = 1;
    }

    PaymentMethodTokenizationParameters(int versionCode, int tokenizationType, Bundle parameters) {
        new Bundle();
        this.zzCY = versionCode;
        this.zzaRz = tokenizationType;
        this.zzaDN = parameters;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getParameters() {
        return new Bundle(this.zzaDN);
    }

    public int getPaymentMethodTokenizationType() {
        return this.zzaRz;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    public static Builder newBuilder() {
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters0 = new PaymentMethodTokenizationParameters();
        paymentMethodTokenizationParameters0.getClass();
        return new Builder(paymentMethodTokenizationParameters0, null);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzp.zza(this, out, flags);
    }

    class com.google.android.gms.wallet.PaymentMethodTokenizationParameters.1 {
    }

}

