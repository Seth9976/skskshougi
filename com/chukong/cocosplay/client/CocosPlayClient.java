package com.chukong.cocosplay.client;

import android.app.Activity;

public class CocosPlayClient {
    public static String getGameRoot() [...] // Inlined contents

    public static native String[] getSearchPaths() {
    }

    public static boolean init(Activity activity, boolean isDemo) {
        return false;
    }

    public static boolean isDemo() [...] // Inlined contents

    public static boolean isEnabled() [...] // Inlined contents

    public static boolean isNotifyFileLoadedEnabled() {
        return false;
    }

    public static void notifyFileLoaded(String filePath) {
    }

    public static void updateAssets(String filePath) {
    }
}

