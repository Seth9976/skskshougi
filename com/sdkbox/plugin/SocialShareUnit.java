package com.sdkbox.plugin;

import android.content.Context;
import com.sdkbox.jnibridge.NativeBridge;
import java.util.Map;

public class SocialShareUnit {
    Context mContext;

    public SocialShareUnit(Context cxt) {
        this.mContext = cxt;
    }

    public boolean configure(JSON json) {
        return true;
    }

    public String getId() {
        return "SocialShareUnit";
    }

    public String identify() {
        return "SocialShareUnit";
    }

    public boolean notifyShareState(SocialShareResponse response) {
        SDKBox.runOnGLThread(new Runnable() {
            @Override
            public void run() {
                NativeBridge.emit("PluginShareEvent", response);
            }
        });
        return true;
    }

    public boolean share(Map map0) {
        return false;
    }

    public boolean shareDialog(Map map0) {
        return false;
    }
}

