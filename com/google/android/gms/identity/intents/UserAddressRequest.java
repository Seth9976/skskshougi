package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class UserAddressRequest implements SafeParcelable {
    public final class Builder {
        final UserAddressRequest zzawy;

        private Builder() {
        }

        Builder(com.google.android.gms.identity.intents.UserAddressRequest.1 x1) {
        }

        public Builder addAllowedCountrySpecification(CountrySpecification countrySpecification) {
            if(UserAddressRequest.this.zzawx == null) {
                UserAddressRequest.this.zzawx = new ArrayList();
            }
            UserAddressRequest.this.zzawx.add(countrySpecification);
            return this;
        }

        public Builder addAllowedCountrySpecifications(Collection collection0) {
            if(UserAddressRequest.this.zzawx == null) {
                UserAddressRequest.this.zzawx = new ArrayList();
            }
            UserAddressRequest.this.zzawx.addAll(collection0);
            return this;
        }

        public UserAddressRequest build() {
            if(UserAddressRequest.this.zzawx != null) {
                UserAddressRequest.this.zzawx = Collections.unmodifiableList(UserAddressRequest.this.zzawx);
            }
            return UserAddressRequest.this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    List zzawx;

    static {
        UserAddressRequest.CREATOR = new zza();
    }

    UserAddressRequest() {
        this.zzCY = 1;
    }

    UserAddressRequest(int versionCode, List list0) {
        this.zzCY = versionCode;
        this.zzawx = list0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    public static Builder newBuilder() {
        UserAddressRequest userAddressRequest0 = new UserAddressRequest();
        userAddressRequest0.getClass();
        return new Builder(userAddressRequest0, null);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zza.zza(this, out, flags);
    }

    class com.google.android.gms.identity.intents.UserAddressRequest.1 {
    }

}

