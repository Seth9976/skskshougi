package com.sdkbox.plugin;

import java.util.Hashtable;

public interface InterfaceAds {
    public static final int PluginType = 1;

    String getPluginVersion();

    String getSDKVersion();

    void hideAds(Hashtable arg1);

    void init(Hashtable arg1);

    void setDebug(boolean arg1);

    void showAds(Hashtable arg1);
}

