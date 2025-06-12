package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzu;
import java.util.List;

public class GcmNetworkManager {
    public static final int RESULT_FAILURE = 2;
    public static final int RESULT_RESCHEDULE = 1;
    public static final int RESULT_SUCCESS;
    private Context mContext;
    private final PendingIntent mPendingIntent;
    private static GcmNetworkManager zzavE;

    private GcmNetworkManager(Context context) {
        this.mContext = context;
        this.mPendingIntent = PendingIntent.getBroadcast(this.mContext, 0, new Intent(), 0);
    }

    public void cancelAllTasks(Class class0) {
        this.zzcZ(class0.getName());
        Intent intent0 = this.zztR();
        if(intent0 == null) {
            return;
        }
        intent0.putExtra("scheduler_action", "CANCEL_ALL");
        intent0.putExtra("component", new ComponentName(this.mContext, class0));
        this.mContext.sendBroadcast(intent0);
    }

    public void cancelTask(String tag, Class class0) {
        GcmNetworkManager.zzcY(tag);
        this.zzcZ(class0.getName());
        Intent intent0 = this.zztR();
        if(intent0 == null) {
            return;
        }
        intent0.putExtra("scheduler_action", "CANCEL_TASK");
        intent0.putExtra("tag", tag);
        intent0.putExtra("component", new ComponentName(this.mContext, class0));
        this.mContext.sendBroadcast(intent0);
    }

    public static GcmNetworkManager getInstance(Context context) {
        if(GcmNetworkManager.zzavE == null) {
            GcmNetworkManager.zzavE = new GcmNetworkManager(context.getApplicationContext());
        }
        return GcmNetworkManager.zzavE;
    }

    public void schedule(Task task) {
        this.zzcZ(task.getServiceName());
        Intent intent0 = this.zztR();
        if(intent0 == null) {
            return;
        }
        Bundle bundle0 = intent0.getExtras();
        bundle0.putString("scheduler_action", "SCHEDULE_TASK");
        task.toBundle(bundle0);
        intent0.putExtras(bundle0);
        this.mContext.sendBroadcast(intent0);
    }

    static void zzcY(String s) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("Must provide a valid tag.");
        }
        if(100 < s.length()) {
            throw new IllegalArgumentException("Tag is larger than max permissible tag length (100)");
        }
    }

    private void zzcZ(String s) {
        boolean z = true;
        zzu.zzb(s, "GcmTaskService must not be null.");
        Intent intent0 = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY");
        intent0.setPackage("org.dyndns.vivi.SkskShogi");
        List list0 = this.mContext.getPackageManager().queryIntentServices(intent0, 0);
        zzu.zzb(list0 != null && list0.size() != 0, "There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?");
        for(Object object0: list0) {
            if(!((ResolveInfo)object0).serviceInfo.name.equals(s)) {
                continue;
            }
            zzu.zzb(z, "The GcmTaskService class you provided " + s + " does not seem to support receiving" + " com.google.android.gms.gcm.ACTION_TASK_READY.");
            return;
        }
        z = false;
        zzu.zzb(z, "The GcmTaskService class you provided " + s + " does not seem to support receiving" + " com.google.android.gms.gcm.ACTION_TASK_READY.");
    }

    private Intent zztR() {
        int v = GoogleCloudMessaging.zzat(this.mContext);
        if(v < GoogleCloudMessaging.zzavP) {
            Log.e("GcmNetworkManager", "Google Play Services is not available, dropping GcmNetworkManager request. code=" + v);
            return null;
        }
        Intent intent0 = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent0.setPackage(GoogleCloudMessaging.zzas(this.mContext));
        intent0.putExtra("app", this.mPendingIntent);
        return intent0;
    }
}

