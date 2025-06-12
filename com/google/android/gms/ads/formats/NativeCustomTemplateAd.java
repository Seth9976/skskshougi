package com.google.android.gms.ads.formats;

import java.util.List;

public interface NativeCustomTemplateAd {
    public interface OnCustomClickListener {
        void onCustomClick(NativeCustomTemplateAd arg1, String arg2);
    }

    public interface OnCustomTemplateAdLoadedListener {
        void onCustomTemplateAdLoaded(NativeCustomTemplateAd arg1);
    }

    List getAvailableAssetNames();

    String getCustomTemplateId();

    Image getImage(String arg1);

    CharSequence getText(String arg1);

    void performClick(String arg1);

    void recordImpression();
}

