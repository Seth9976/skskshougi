package com.google.android.gms.ads.formats;

import java.util.List;

public abstract class NativeAppInstallAd extends NativeAd {
    public interface OnAppInstallAdLoadedListener {
        void onAppInstallAdLoaded(NativeAppInstallAd arg1);
    }

    public abstract CharSequence getBody();

    public abstract CharSequence getCallToAction();

    public abstract CharSequence getHeadline();

    public abstract Image getIcon();

    public abstract List getImages();

    public abstract CharSequence getPrice();

    public abstract Double getStarRating();

    public abstract CharSequence getStore();
}

