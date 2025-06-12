package com.google.android.gms.ads.reward;

import com.google.android.gms.ads.AdRequest;

public interface RewardedVideoAd {
    void destroy();

    RewardedVideoAdListener getRewardedVideoAdListener();

    String getUserId();

    boolean isLoaded();

    void loadAd(String arg1, AdRequest arg2);

    void pause();

    void resume();

    void setRewardedVideoAdListener(RewardedVideoAdListener arg1);

    void setUserId(String arg1);

    void show();
}

