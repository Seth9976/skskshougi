package com.sdkbox.services.jni;

import com.sdkbox.jnibridge.NativeBridge;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RequestManager {
    static ExecutorService dispatcher;

    static {
        RequestManager.dispatcher = Executors.newFixedThreadPool(1);
    }

    public static void callRemove(long ptr_nativeXHR) {
        RequestManager.dispatcher.execute(new Runnable() {
            @Override
            public void run() {
                NativeBridge.emit("XHRRemove", ptr_nativeXHR);
            }
        });
    }
}

