package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzx.zza;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.zzs;
import com.google.android.gms.common.internal.zzu;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class PublisherAdRequest {
    public static final class Builder {
        private final zza zznL;

        public Builder() {
            this.zznL = new zza();
        }

        public Builder addCategoryExclusion(String categoryExclusion) {
            this.zznL.zzK(categoryExclusion);
            return this;
        }

        public Builder addCustomEventExtrasBundle(Class class0, Bundle customEventExtras) {
            this.zznL.zzb(class0, customEventExtras);
            return this;
        }

        public Builder addCustomTargeting(String key, String value) {
            this.zznL.zzb(key, value);
            return this;
        }

        public Builder addCustomTargeting(String key, List list0) {
            if(list0 != null) {
                String s1 = zzs.zzci(",").zza(list0);
                this.zznL.zzb(key, s1);
            }
            return this;
        }

        public Builder addKeyword(String keyword) {
            this.zznL.zzE(keyword);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zznL.zza(networkExtras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class0, Bundle networkExtras) {
            this.zznL.zza(class0, networkExtras);
            return this;
        }

        public Builder addTestDevice(String deviceId) {
            this.zznL.zzF(deviceId);
            return this;
        }

        public PublisherAdRequest build() {
            return new PublisherAdRequest(this, null);
        }

        public Builder setBirthday(Date birthday) {
            this.zznL.zza(birthday);
            return this;
        }

        public Builder setContentUrl(String contentUrl) {
            zzu.zzb(contentUrl, "Content URL must be non-null.");
            zzu.zzh(contentUrl, "Content URL must be non-empty.");
            zzu.zzb(contentUrl.length() <= 0x200, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[]{0x200, contentUrl.length()});
            this.zznL.zzH(contentUrl);
            return this;
        }

        public Builder setGender(int gender) {
            this.zznL.zzm(gender);
            return this;
        }

        public Builder setLocation(Location location) {
            this.zznL.zza(location);
            return this;
        }

        public Builder setManualImpressionsEnabled(boolean manualImpressionsEnabled) {
            this.zznL.zzj(manualImpressionsEnabled);
            return this;
        }

        public Builder setPublisherProvidedId(String publisherProvidedId) {
            this.zznL.zzI(publisherProvidedId);
            return this;
        }

        public Builder setRequestAgent(String requestAgent) {
            this.zznL.zzJ(requestAgent);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean tagForChildDirectedTreatment) {
            this.zznL.zzk(tagForChildDirectedTreatment);
            return this;
        }
    }

    public static final String DEVICE_ID_EMULATOR = null;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN;
    private final zzx zznK;

    static {
        PublisherAdRequest.DEVICE_ID_EMULATOR = zzx.DEVICE_ID_EMULATOR;
    }

    private PublisherAdRequest(Builder builder) {
        this.zznK = new zzx(builder.zznL);
    }

    PublisherAdRequest(Builder x0, com.google.android.gms.ads.doubleclick.PublisherAdRequest.1 x1) {
        this(x0);
    }

    public Date getBirthday() {
        return this.zznK.getBirthday();
    }

    public String getContentUrl() {
        return this.zznK.getContentUrl();
    }

    public Bundle getCustomEventExtrasBundle(Class class0) {
        return this.zznK.getCustomEventExtrasBundle(class0);
    }

    public Bundle getCustomTargeting() {
        return this.zznK.getCustomTargeting();
    }

    public int getGender() {
        return this.zznK.getGender();
    }

    public Set getKeywords() {
        return this.zznK.getKeywords();
    }

    public Location getLocation() {
        return this.zznK.getLocation();
    }

    public boolean getManualImpressionsEnabled() {
        return this.zznK.getManualImpressionsEnabled();
    }

    @Deprecated
    public NetworkExtras getNetworkExtras(Class class0) {
        return this.zznK.getNetworkExtras(class0);
    }

    public Bundle getNetworkExtrasBundle(Class class0) {
        return this.zznK.getNetworkExtrasBundle(class0);
    }

    public String getPublisherProvidedId() {
        return this.zznK.getPublisherProvidedId();
    }

    public boolean isTestDevice(Context context) {
        return this.zznK.isTestDevice(context);
    }

    public static void updateCorrelator() {
        zzx.updateCorrelator();
    }

    public zzx zzaF() {
        return this.zznK;
    }

    class com.google.android.gms.ads.doubleclick.PublisherAdRequest.1 {
    }

}

