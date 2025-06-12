package com.sdkbox.services.jni;

import com.sdkbox.jnibridge.NativeBridge;
import com.sdkbox.services.HttpRequest;
import com.sdkbox.services.HttpRequestListener;
import com.sdkbox.services.HttpRequestReadyState;

public class XMLHttpRequestJNIListener implements HttpRequestListener {
    public class NativeEvent {
        public String errorDescription;
        public float progress;
        public HttpRequest sourceRequest;
        public int state;
        public int type;

        public NativeEvent(HttpRequest r, int type) {
            this.sourceRequest = r;
            this.type = type;
        }

        public NativeEvent(HttpRequest r, int type, float progress) {
            this(r, type);
            this.progress = progress;
        }

        public NativeEvent(HttpRequest r, int type, int state) {
            this(r, type);
            this.state = state;
        }

        public NativeEvent(HttpRequest r, int type, String errorDesc) {
            this(r, type);
            this.errorDescription = errorDesc;
        }

        String getError() {
            return this.errorDescription;
        }

        int getEventType() {
            return this.type;
        }

        float getProgress() {
            return this.progress;
        }

        Object getRequest() {
            return this.sourceRequest;
        }

        int getState() {
            return this.state;
        }
    }

    public static final String EVENT = "java_xhr_event";

    @Override  // com.sdkbox.services.HttpRequestListener
    public void onAbort(HttpRequest request) {
        if(request != null) {
            request.removeEventListener(this);
        }
        NativeBridge.emit("java_xhr_event", new NativeEvent(this, request, 1));
    }

    @Override  // com.sdkbox.services.HttpRequestListener
    public void onError(HttpRequest request, String description) {
        if(request != null) {
            request.removeEventListener(this);
        }
        NativeBridge.emit("java_xhr_event", new NativeEvent(this, request, 3, description));
    }

    @Override  // com.sdkbox.services.HttpRequestListener
    public void onLoad(HttpRequest request) {
        if(request != null) {
            request.removeEventListener(this);
        }
        NativeBridge.emit("java_xhr_event", new NativeEvent(this, request, 2));
    }

    @Override  // com.sdkbox.services.HttpRequestListener
    public void onProgress(HttpRequest request, float value) {
        NativeBridge.emit("java_xhr_event", new NativeEvent(this, request, 4, value));
    }

    @Override  // com.sdkbox.services.HttpRequestListener
    public void onReadyStateChange(HttpRequest request, HttpRequestReadyState state) {
        NativeBridge.emit("java_xhr_event", new NativeEvent(this, request, 5, state.getValue()));
    }

    @Override  // com.sdkbox.services.HttpRequestListener
    public void onTimeout(HttpRequest request) {
        if(request != null) {
            request.removeEventListener(this);
        }
        NativeBridge.emit("java_xhr_event", new NativeEvent(this, request, 0));
    }
}

