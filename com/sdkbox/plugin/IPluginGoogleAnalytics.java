package com.sdkbox.plugin;

public interface IPluginGoogleAnalytics {
    public static final int PluginType = 4;

    void createTracker(String arg1);

    void dispatchHits();

    void dispatchPeriodically(int arg1);

    void enableAdvertisingTracking(boolean arg1);

    void enableTracker(String arg1);

    String getPluginVersion();

    String getSDKVersion();

    void logEvent(String arg1, String arg2, String arg3, long arg4);

    void logException(String arg1, boolean arg2);

    void logScreen(String arg1);

    void logSocial(String arg1, String arg2, String arg3);

    void logTiming(String arg1, long arg2, String arg3, String arg4);

    void setDryRun(boolean arg1);

    void startSession();

    void stopPeriodicalDispatch();

    void stopSession();
}

