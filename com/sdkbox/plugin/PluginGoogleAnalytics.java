package com.sdkbox.plugin;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders.AppViewBuilder;
import com.google.android.gms.analytics.HitBuilders.EventBuilder;
import com.google.android.gms.analytics.HitBuilders.ExceptionBuilder;
import com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder;
import com.google.android.gms.analytics.HitBuilders.SocialBuilder;
import com.google.android.gms.analytics.HitBuilders.TimingBuilder;
import com.google.android.gms.analytics.Tracker;
import java.util.HashMap;
import java.util.Map;

public class PluginGoogleAnalytics implements IPluginGoogleAnalytics, PluginListener {
    private static final String DEFAULT_SCREEN_NAME = "Plugin initialization screen";
    private static final String ERROR_END_SESSION = "Start session called w/o valid tracker.";
    private static final String ERROR_LOG_ADVERTISING = "Advertising called w/o valid tracker.";
    private static final String ERROR_LOG_EVENT = "Log Event called w/o valid tracker.";
    private static final String ERROR_LOG_EXCEPTION = "Log Exception called w/o valid tracker.";
    private static final String ERROR_LOG_SCREEN = "Log Screen called w/o valid tracker.";
    private static final String ERROR_LOG_SOCIAL = "Log Social called w/o valid tracker.";
    private static final String ERROR_LOG_TIMING = "Log Timing called w/o valid tracker.";
    private static final String ERROR_NO_TRACKER_ID = "No Tracker ID found in plugin config.";
    private static final String ERROR_SET_USER = "Set User called w/o valid tracker.";
    private static final String ERROR_START_SESSION = "Start session called w/o valid tracker.";
    private static final String ERROR_TRACKER = " called w/o valid tracker.";
    private static final String PLUGIN_LOG_TAG = "IPluginGoogleAnalytics";
    private Context ctx;
    private GoogleAnalytics ga;
    private Tracker tracker;
    private Map trackers;

    public PluginGoogleAnalytics(Context ctx) {
        this.ctx = null;
        this.ga = null;
        this.tracker = null;
        this.trackers = new HashMap();
        this.ctx = ctx;
        this.ga = GoogleAnalytics.getInstance(ctx);
    }

    public void configure(String trackerId) {
        if(trackerId == null) {
            Log.d("IPluginGoogleAnalytics", "Null tracker id at configure time.");
            return;
        }
        Log.d("IPluginGoogleAnalytics", "Configure with trackerId: " + trackerId);
        this.createTracker(trackerId);
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public void createTracker(String trackerId) {
        if(((Tracker)this.trackers.get(trackerId)) == null) {
            Tracker tr = this.ga.newTracker(trackerId);
            if(this.trackers.size() == 0) {
                tr.setScreenName(this.ctx.getClass().getCanonicalName());
            }
            this.trackers.put(trackerId, tr);
        }
        this.enableTracker(trackerId);
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public void dispatchHits() {
        this.ga.dispatchLocalHits();
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public void dispatchPeriodically(int numberOfSeconds) {
        this.ga.setLocalDispatchPeriod(numberOfSeconds);
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public void enableAdvertisingTracking(boolean e) {
        if(this.tracker != null) {
            this.tracker.enableAdvertisingIdCollection(e);
            return;
        }
        Log.e("IPluginGoogleAnalytics", "Advertising called w/o valid tracker.");
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public void enableTracker(String trackerId) {
        if(trackerId == null) {
            return;
        }
        Tracker tr = (Tracker)this.trackers.get(trackerId);
        if(tr == null) {
            Log.d("IPluginGoogleAnalytics", "Trying to enable unknown tracker: " + trackerId);
            return;
        }
        Log.d("IPluginGoogleAnalytics", "Selected tracker: " + trackerId);
        this.tracker = tr;
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public String getPluginVersion() {
        return "4.0";
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public String getSDKVersion() {
        return "GoogleAnalytics V4";
    }

    private String getString(String s) {
        return s == null ? "" : s;
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public void logEvent(String eventCategory, String eventAction, String eventLabel, long value) {
        if(this.tracker != null) {
            this.tracker.send(new EventBuilder().setCategory(this.getString(eventCategory)).setAction(this.getString(eventAction)).setLabel(this.getString(eventLabel)).setValue(value).build());
            return;
        }
        Log.e("IPluginGoogleAnalytics", "Log Event called w/o valid tracker.");
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public void logException(String exceptionDescription, boolean isFatal) {
        if(this.tracker != null) {
            this.tracker.send(new ExceptionBuilder().setDescription(exceptionDescription).setFatal(isFatal).build());
            return;
        }
        Log.e("IPluginGoogleAnalytics", "Log Exception called w/o valid tracker.");
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public void logScreen(String screenName) {
        if(this.tracker != null) {
            this.tracker.setScreenName(screenName);
            this.tracker.send(new ScreenViewBuilder().build());
            return;
        }
        Log.e("IPluginGoogleAnalytics", "Log Screen called w/o valid tracker.");
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public void logSocial(String socialNetwork, String socialAction, String socialTarget) {
        if(this.tracker != null) {
            this.tracker.send(new SocialBuilder().setNetwork(socialNetwork).setAction(socialAction).setTarget(socialTarget).build());
            return;
        }
        Log.e("IPluginGoogleAnalytics", "Log Social called w/o valid tracker.");
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public void logTiming(String timingCategory, long timingInterval, String timingName, String timingLabel) {
        if(this.tracker != null) {
            this.tracker.send(new TimingBuilder().setCategory(timingCategory).setValue(timingInterval).setVariable(this.getString(timingName)).setLabel(this.getString(timingLabel)).build());
            return;
        }
        Log.e("IPluginGoogleAnalytics", "Log Timing called w/o valid tracker.");
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
        this.stopSession();
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

    public void setDimension(int index, String value) {
        if(this.tracker != null) {
            this.tracker.send(((AppViewBuilder)new AppViewBuilder().setCustomDimension(index, value)).build());
            return;
        }
        Log.e("IPluginGoogleAnalytics", "GoogleAnalytics isn\'t initialized correctly");
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public void setDryRun(boolean dr) {
        this.ga.setDryRun(dr);
    }

    public void setMetric(int index, String value) {
        if(this.tracker != null) {
            this.tracker.send(((AppViewBuilder)new AppViewBuilder().setCustomMetric(index, Float.parseFloat(value))).build());
            return;
        }
        Log.e("IPluginGoogleAnalytics", "GoogleAnalytics isn\'t initialized correctly");
    }

    public void setUser(String userID) {
        if(this.tracker != null) {
            this.tracker.set("&uid", userID);
            return;
        }
        Log.e("IPluginGoogleAnalytics", "Set User called w/o valid tracker.");
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public void startSession() {
        if(this.tracker != null) {
            this.tracker.send(((ScreenViewBuilder)new ScreenViewBuilder().setNewSession()).build());
            return;
        }
        Log.e("IPluginGoogleAnalytics", "Start session called w/o valid tracker.");
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public void stopPeriodicalDispatch() {
        this.ga.setLocalDispatchPeriod(-1);
    }

    @Override  // com.sdkbox.plugin.IPluginGoogleAnalytics
    public void stopSession() {
        if(this.tracker != null) {
            this.tracker.send(((ScreenViewBuilder)new ScreenViewBuilder().set("&sc", "end")).build());
            return;
        }
        Log.e("IPluginGoogleAnalytics", "Start session called w/o valid tracker.");
    }
}

