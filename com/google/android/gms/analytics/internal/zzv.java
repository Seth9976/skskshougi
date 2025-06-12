package com.google.android.gms.analytics.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.common.internal.zzu;

public class zzv extends zzd {
    private boolean zzKW;
    private boolean zzKX;
    private AlarmManager zzKY;

    protected zzv(zzf zzf0) {
        super(zzf0);
        this.zzKY = (AlarmManager)this.getContext().getSystemService("alarm");
    }

    public void cancel() {
        this.zzia();
        this.zzKX = false;
        this.zzKY.cancel(this.zzjI());
    }

    public boolean zzbp() {
        return this.zzKX;
    }

    @Override  // com.google.android.gms.analytics.internal.zzd
    protected void zzhn() {
        try {
            this.zzKY.cancel(this.zzjI());
            if(this.zzhR().zzjf() > 0L) {
                ActivityInfo activityInfo0 = this.getContext().getPackageManager().getReceiverInfo(new ComponentName(this.getContext(), AnalyticsReceiver.class), 2);
                if(activityInfo0 != null && activityInfo0.enabled) {
                    this.zzaT("Receiver registered. Using alarm for local dispatch.");
                    this.zzKW = true;
                }
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
    }

    public boolean zzjG() {
        return this.zzKW;
    }

    public void zzjH() {
        this.zzia();
        zzu.zza(this.zzjG(), "Receiver not registered");
        long v = this.zzhR().zzjf();
        if(v > 0L) {
            this.cancel();
            long v1 = this.zzhP().elapsedRealtime();
            this.zzKX = true;
            this.zzKY.setInexactRepeating(2, v1 + v, 0L, this.zzjI());
        }
    }

    private PendingIntent zzjI() {
        Intent intent0 = new Intent(this.getContext(), AnalyticsReceiver.class);
        intent0.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        return PendingIntent.getBroadcast(this.getContext(), 0, intent0, 0);
    }
}

