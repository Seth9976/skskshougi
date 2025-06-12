package com.sdkbox.reflect;

import com.sdkbox.plugin.JSON;
import com.sdkbox.plugin.PluginListener;

public interface AdUnit extends PluginListener {
    boolean available(String arg1);

    void cacheControl(JSON arg1);

    void configure(JSON arg1);

    String getId();

    String identify();

    void observe(AdUnitObserver arg1);

    void observeAvailability(AdUnitAvailabilityObserver arg1);

    void play();

    boolean play(String arg1, JSON arg2);

    void stopObserving(AdUnitObserver arg1);

    void stopObservingAvailability(AdUnitAvailabilityObserver arg1);
}

