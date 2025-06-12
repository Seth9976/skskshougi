package com.sdkbox.reflect;

public interface AdUnitObserver {
    void onPlayAdResult(String arg1, String arg2, AdActionType arg3, Object arg4);

    void onRewardResult(String arg1, String arg2, float arg3, boolean arg4);
}

