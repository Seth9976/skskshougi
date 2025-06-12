package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.HashMap;
import java.util.Map;

public final class zzog implements Application.ActivityLifecycleCallbacks {
    private final zznw zzaEV;
    private final Map zzaEW;

    public zzog(zznw zznw0) {
        zzu.zzu(zznw0);
        this.zzaEV = zznw0;
        this.zzaEW = new HashMap();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        if(savedInstanceState != null) {
            Bundle bundle1 = savedInstanceState.getBundle("com.google.android.gms.measurement.screen_view");
            if(bundle1 != null) {
                int v = bundle1.getInt("id");
                if(v <= 0) {
                    Log.w("com.google.android.gms.measurement.internal.ActivityLifecycleTracker", "Invalid screenId in saved activity state");
                    return;
                }
                zzod zzod0 = this.zza(activity, v);
                zzod0.setScreenName(bundle1.getString("name"));
                zzod0.zzhL(bundle1.getInt("referrer_id"));
                zzod0.zzdJ(bundle1.getString("referrer_name"));
                zzod0.zzai(bundle1.getBoolean("interstitial"));
                zzod0.zzwF();
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.zzaEW.remove(activity);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        if(outState != null) {
            zzod zzod0 = (zzod)this.zzaEW.get(activity);
            if(zzod0 != null) {
                Bundle bundle1 = new Bundle();
                bundle1.putInt("id", zzod0.zzbn());
                bundle1.putString("name", zzod0.zzwB());
                bundle1.putInt("referrer_id", zzod0.zzwC());
                bundle1.putString("referrer_name", zzod0.zzwD());
                bundle1.putBoolean("interstitial", zzod0.zzwG());
                outState.putBundle("com.google.android.gms.measurement.screen_view", bundle1);
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        zzod zzod0 = this.zza(activity, 0);
        this.zzaEV.zzb(zzod0, activity);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    zzod zza(Activity activity0, int v) {
        zzu.zzu(activity0);
        zzod zzod0 = (zzod)this.zzaEW.get(activity0);
        if(zzod0 == null) {
            zzod0 = v == 0 ? new zzod(true) : new zzod(true, v);
            zzod0.setScreenName(activity0.getClass().getCanonicalName());
            this.zzaEW.put(activity0, zzod0);
        }
        return zzod0;
    }
}

