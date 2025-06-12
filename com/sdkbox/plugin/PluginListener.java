package com.sdkbox.plugin;

import android.content.Intent;

public interface PluginListener {
    boolean onActivityResult(int arg1, int arg2, Intent arg3);

    boolean onBackPressed();

    void onDestroy();

    void onPause();

    void onResume();

    void onStart();

    void onStop();
}

