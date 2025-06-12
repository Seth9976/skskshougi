package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

@zzgd
public class zzbj implements Application.ActivityLifecycleCallbacks {
    private Activity mActivity;
    private Context mContext;
    private final Object zzqt;

    public zzbj(Application application0, Activity activity0) {
        this.zzqt = new Object();
        application0.registerActivityLifecycleCallbacks(this);
        this.setActivity(activity0);
        this.mContext = application0.getApplicationContext();
    }

    public Activity getActivity() {
        return this.mActivity;
    }

    public Context getContext() {
        return this.mContext;
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        synchronized(this.zzqt) {
            if(this.mActivity == null) {
                return;
            }
            if(this.mActivity.equals(activity)) {
                this.mActivity = null;
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.setActivity(activity);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.setActivity(activity);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle savedInstanceState) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.setActivity(activity);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    private void setActivity(Activity activity) {
        synchronized(this.zzqt) {
            if(!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.mActivity = activity;
            }
        }
    }
}

