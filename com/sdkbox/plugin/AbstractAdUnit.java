package com.sdkbox.plugin;

import android.content.Context;
import android.content.Intent;
import com.sdkbox.reflect.AdActionType;
import com.sdkbox.reflect.AdUnit;
import com.sdkbox.reflect.AdUnitAvailabilityObserver;
import com.sdkbox.reflect.AdUnitObserver;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class AbstractAdUnit implements AdUnit {
    public static final String ADTYPE_BANNER = "BANNER";
    public static final String ADTYPE_INTERSTITIAL = "INTERSTITIAL";
    public static final String ADTYPE_REWARDED = "REWARDED";
    public static final String ADTYPE_VIDEO = "VIDEO";
    protected JSON _adunit_config;
    protected CopyOnWriteArrayList _availability_listeners;
    protected Context _context;
    protected CopyOnWriteArrayList _observers;

    public AbstractAdUnit(Context context) {
        this._context = context;
        this._observers = new CopyOnWriteArrayList();
        this._availability_listeners = new CopyOnWriteArrayList();
        this._adunit_config = null;
    }

    @Override  // com.sdkbox.reflect.AdUnit
    public void cacheControl(JSON cacheOpts) {
    }

    @Override  // com.sdkbox.reflect.AdUnit
    public void configure(JSON configuration) {
        this._adunit_config = configuration;
        SDKBox.addListener(this);
        this.traceInit(this.getId(), configuration);
    }

    protected void notifyAvailability(boolean available, String zone_or_location) {
        AdUnitAvailabilityObserver[] listeners = (AdUnitAvailabilityObserver[])this._availability_listeners.toArray(new AdUnitAvailabilityObserver[this._availability_listeners.size()]);
        for(int v = 0; v < listeners.length; ++v) {
            listeners[v].onAdAvailable(this, available, zone_or_location);
        }
    }

    protected void notifyPlayAdResult(String zone, AdActionType action_type, Object extras) {
        AdUnitObserver[] observers = (AdUnitObserver[])this._observers.toArray(new AdUnitObserver[this._observers.size()]);
        for(int v = 0; v < observers.length; ++v) {
            observers[v].onPlayAdResult(this.getId(), zone, action_type, extras);
        }
    }

    protected void notifyRewardResult(String zone, float amount, boolean success) {
        AdUnitObserver[] observers = (AdUnitObserver[])this._observers.toArray(new AdUnitObserver[this._observers.size()]);
        for(int v = 0; v < observers.length; ++v) {
            observers[v].onRewardResult(this.getId(), zone, amount, success);
        }
    }

    @Override  // com.sdkbox.reflect.AdUnit
    public void observe(AdUnitObserver auo) {
        this._observers.add(auo);
    }

    @Override  // com.sdkbox.reflect.AdUnit
    public void observeAvailability(AdUnitAvailabilityObserver al) {
        this._availability_listeners.add(al);
    }

    @Override  // com.sdkbox.plugin.PluginListener
    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        return false;
    }

    @Override  // com.sdkbox.plugin.PluginListener
    public boolean onBackPressed() {
        return false;
    }

    @Override  // com.sdkbox.plugin.PluginListener
    public void onDestroy() {
    }

    @Override  // com.sdkbox.plugin.PluginListener
    public void onPause() {
    }

    @Override  // com.sdkbox.plugin.PluginListener
    public void onResume() {
    }

    @Override  // com.sdkbox.plugin.PluginListener
    public void onStart() {
    }

    @Override  // com.sdkbox.plugin.PluginListener
    public void onStop() {
    }

    @Override  // com.sdkbox.reflect.AdUnit
    public void stopObserving(AdUnitObserver auo) {
        this._observers.remove(auo);
    }

    @Override  // com.sdkbox.reflect.AdUnit
    public void stopObservingAvailability(AdUnitAvailabilityObserver al) {
        this._availability_listeners.remove(al);
    }

    protected void traceInit(String tag, JSON c) {
    }
}

