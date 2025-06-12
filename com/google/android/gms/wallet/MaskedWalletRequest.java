package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;

public final class MaskedWalletRequest implements SafeParcelable {
    public final class Builder {
        final MaskedWalletRequest zzaRv;

        private Builder() {
        }

        Builder(com.google.android.gms.wallet.MaskedWalletRequest.1 x1) {
        }

        public Builder addAllowedCardNetwork(int allowedCardNetwork) {
            if(MaskedWalletRequest.this.zzaRu == null) {
                MaskedWalletRequest.this.zzaRu = new ArrayList();
            }
            MaskedWalletRequest.this.zzaRu.add(allowedCardNetwork);
            return this;
        }

        public Builder addAllowedCardNetworks(Collection collection0) {
            if(collection0 != null) {
                if(MaskedWalletRequest.this.zzaRu == null) {
                    MaskedWalletRequest.this.zzaRu = new ArrayList();
                }
                MaskedWalletRequest.this.zzaRu.addAll(collection0);
            }
            return this;
        }

        public Builder addAllowedCountrySpecificationForShipping(CountrySpecification countrySpecification) {
            if(MaskedWalletRequest.this.zzaRs == null) {
                MaskedWalletRequest.this.zzaRs = new ArrayList();
            }
            MaskedWalletRequest.this.zzaRs.add(countrySpecification);
            return this;
        }

        public Builder addAllowedCountrySpecificationsForShipping(Collection collection0) {
            if(collection0 != null) {
                if(MaskedWalletRequest.this.zzaRs == null) {
                    MaskedWalletRequest.this.zzaRs = new ArrayList();
                }
                MaskedWalletRequest.this.zzaRs.addAll(collection0);
            }
            return this;
        }

        public MaskedWalletRequest build() {
            return MaskedWalletRequest.this;
        }

        public Builder setAllowDebitCard(boolean allowDebitCard) {
            MaskedWalletRequest.this.zzaRr = allowDebitCard;
            return this;
        }

        public Builder setAllowPrepaidCard(boolean allowPrepaidCard) {
            MaskedWalletRequest.this.zzaRq = allowPrepaidCard;
            return this;
        }

        public Builder setCart(Cart cart) {
            MaskedWalletRequest.this.zzaQx = cart;
            return this;
        }

        public Builder setCurrencyCode(String currencyCode) {
            MaskedWalletRequest.this.zzaQg = currencyCode;
            return this;
        }

        public Builder setEstimatedTotalPrice(String estimatedTotalPrice) {
            MaskedWalletRequest.this.zzaRl = estimatedTotalPrice;
            return this;
        }

        public Builder setIsBillingAgreement(boolean isBillingAgreement) {
            MaskedWalletRequest.this.zzaRo = isBillingAgreement;
            return this;
        }

        public Builder setMerchantName(String merchantName) {
            MaskedWalletRequest.this.zzaRm = merchantName;
            return this;
        }

        public Builder setMerchantTransactionId(String merchantTransactionId) {
            MaskedWalletRequest.this.zzaQn = merchantTransactionId;
            return this;
        }

        public Builder setPaymentMethodTokenizationParameters(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
            MaskedWalletRequest.this.zzaRt = paymentMethodTokenizationParameters;
            return this;
        }

        public Builder setPhoneNumberRequired(boolean phoneNumberRequired) {
            MaskedWalletRequest.this.zzaRi = phoneNumberRequired;
            return this;
        }

        public Builder setShippingAddressRequired(boolean shippingAddressRequired) {
            MaskedWalletRequest.this.zzaRj = shippingAddressRequired;
            return this;
        }

        public Builder setShouldRetrieveWalletObjects(boolean shouldRetrieveWalletObjects) {
            MaskedWalletRequest.this.zzaRn = shouldRetrieveWalletObjects;
            return this;
        }

        public Builder setUseMinimalBillingAddress(boolean useMinimalBillingAddress) {
            MaskedWalletRequest.this.zzaRk = useMinimalBillingAddress;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    String zzaQg;
    String zzaQn;
    Cart zzaQx;
    boolean zzaRi;
    boolean zzaRj;
    boolean zzaRk;
    String zzaRl;
    String zzaRm;
    boolean zzaRn;
    boolean zzaRo;
    com.google.android.gms.wallet.CountrySpecification[] zzaRp;
    boolean zzaRq;
    boolean zzaRr;
    ArrayList zzaRs;
    PaymentMethodTokenizationParameters zzaRt;
    ArrayList zzaRu;

    static {
        MaskedWalletRequest.CREATOR = new zzl();
    }

    MaskedWalletRequest() {
        this.zzCY = 3;
        this.zzaRq = true;
        this.zzaRr = true;
    }

    MaskedWalletRequest(int versionCode, String merchantTransactionId, boolean phoneNumberRequired, boolean shippingAddressRequired, boolean useMinimalBillingAddress, String estimatedTotalPrice, String currencyCode, String merchantName, Cart cart, boolean shouldRetrieveWalletObjects, boolean isBillingAgreement, com.google.android.gms.wallet.CountrySpecification[] allowedShippingCountrySpecifications, boolean allowPrepaidCard, boolean allowDebitCard, ArrayList arrayList0, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, ArrayList arrayList1) {
        this.zzCY = versionCode;
        this.zzaQn = merchantTransactionId;
        this.zzaRi = phoneNumberRequired;
        this.zzaRj = shippingAddressRequired;
        this.zzaRk = useMinimalBillingAddress;
        this.zzaRl = estimatedTotalPrice;
        this.zzaQg = currencyCode;
        this.zzaRm = merchantName;
        this.zzaQx = cart;
        this.zzaRn = shouldRetrieveWalletObjects;
        this.zzaRo = isBillingAgreement;
        this.zzaRp = allowedShippingCountrySpecifications;
        this.zzaRq = allowPrepaidCard;
        this.zzaRr = allowDebitCard;
        this.zzaRs = arrayList0;
        this.zzaRt = paymentMethodTokenizationParameters;
        this.zzaRu = arrayList1;
    }

    public boolean allowDebitCard() {
        return this.zzaRr;
    }

    public boolean allowPrepaidCard() {
        return this.zzaRq;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ArrayList getAllowedCardNetworks() {
        return this.zzaRu;
    }

    public ArrayList getAllowedCountrySpecificationsForShipping() {
        return this.zzaRs;
    }

    public com.google.android.gms.wallet.CountrySpecification[] getAllowedShippingCountrySpecifications() {
        return this.zzaRp;
    }

    public Cart getCart() {
        return this.zzaQx;
    }

    public String getCurrencyCode() {
        return this.zzaQg;
    }

    public String getEstimatedTotalPrice() {
        return this.zzaRl;
    }

    public String getMerchantName() {
        return this.zzaRm;
    }

    public String getMerchantTransactionId() {
        return this.zzaQn;
    }

    public PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters() {
        return this.zzaRt;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    public boolean isBillingAgreement() {
        return this.zzaRo;
    }

    public boolean isPhoneNumberRequired() {
        return this.zzaRi;
    }

    public boolean isShippingAddressRequired() {
        return this.zzaRj;
    }

    public static Builder newBuilder() {
        MaskedWalletRequest maskedWalletRequest0 = new MaskedWalletRequest();
        maskedWalletRequest0.getClass();
        return new Builder(maskedWalletRequest0, null);
    }

    public boolean shouldRetrieveWalletObjects() {
        return this.zzaRn;
    }

    public boolean useMinimalBillingAddress() {
        return this.zzaRk;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzl.zza(this, dest, flags);
    }

    class com.google.android.gms.wallet.MaskedWalletRequest.1 {
    }

}

