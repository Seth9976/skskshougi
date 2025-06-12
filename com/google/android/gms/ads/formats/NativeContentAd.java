package com.google.android.gms.ads.formats;

import java.util.List;

public abstract class NativeContentAd extends NativeAd {
    public interface OnContentAdLoadedListener {
        void onContentAdLoaded(NativeContentAd arg1);
    }

    public abstract CharSequence getAdvertiser();

    public abstract CharSequence getBody();

    public abstract CharSequence getCallToAction();

    public abstract CharSequence getHeadline();

    public abstract List getImages();

    public abstract Image getLogo();
}

