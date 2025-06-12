package com.sdkbox.jnibridge;

import com.sdkbox.plugin.SdkboxLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NativeBridge {
    private static final Object latch;
    private static HashMap observersByEvent;

    static {
        NativeBridge.latch = new Object();
        NativeBridge.observersByEvent = new HashMap();
    }

    public static void addEventListener(String event, long ptr) {
        synchronized(NativeBridge.latch) {
            List observers = (List)NativeBridge.observersByEvent.get(event);
            if(observers == null) {
                observers = new ArrayList();
                NativeBridge.observersByEvent.put(event, observers);
            }
            if(observers.contains(ptr)) {
                SdkboxLog.d("SDKBOX_CORE", "Already have nativeObserver for event: %s.", new Object[]{event});
            }
            else {
                observers.add(ptr);
            }
        }
    }

    public static void emit(String event, Object params) {
        synchronized(NativeBridge.latch) {
            List obe = (List)NativeBridge.observersByEvent.get(event);
            if(obe == null) {
                SdkboxLog.i("SDKBOX_CORE", "Emit \'%s\' w/o registered observers.", new Object[]{event});
            }
            else {
                Object[] arr_object = obe.toArray();
                if(arr_object.length == 0) {
                    SdkboxLog.d("SDKBOX_CORE", "Emit native event: %s for 0 observers.", new Object[]{event});
                }
                for(int v = 0; v < arr_object.length; ++v) {
                    NativeBridge.emitNative(((long)(((Long)arr_object[v]))), event, params);
                }
            }
        }
    }

    public static native void emitNative(long arg0, String arg1, Object arg2) {
    }

    public static void removeEventListener(String event, long ptr) {
        synchronized(NativeBridge.latch) {
            List observers = (List)NativeBridge.observersByEvent.get(event);
            if(observers == null) {
                SdkboxLog.d("SDKBOX_CORE", "Removing native observer for event: %s.", new Object[]{event});
            }
            else {
                observers.remove(Long.valueOf(ptr));
            }
        }
    }
}

