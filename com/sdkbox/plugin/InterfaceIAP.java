package com.sdkbox.plugin;

import java.util.Map;

public interface InterfaceIAP {
    public static final int PluginType = 3;

    String getVersion();

    void initIAP(Map arg1, String arg2);

    void purchase(String arg1, int arg2);

    void requestProducts();

    void restorePurchase();
}

