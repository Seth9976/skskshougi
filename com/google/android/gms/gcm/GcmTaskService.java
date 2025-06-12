package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

public abstract class GcmTaskService extends Service {
    class zza extends Thread {
        private final String mTag;
        private final zzb zzavN;
        final GcmTaskService zzavO;

        zza(String s, IBinder iBinder0) {
            this.mTag = s;
            this.zzavN = com.google.android.gms.gcm.zzb.zza.zzbN(iBinder0);
        }

        @Override
        public void run() {
            TaskParams taskParams0 = new TaskParams(this.mTag);
            int v = GcmTaskService.this.onRunTask(taskParams0);
            try {
                this.zzavN.zzgg(v);
            }
            catch(RemoteException unused_ex) {
                Log.e("GcmTaskService", "Error reporting result of operation to scheduler for " + this.mTag);
            }
            finally {
                GcmTaskService.this.zzdc(this.mTag);
            }
        }
    }

    public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    private final Set zzavL;
    private int zzavM;

    public GcmTaskService() {
        this.zzavL = new HashSet();
    }

    @Override  // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onInitializeTasks() {
    }

    public abstract int onRunTask(TaskParams arg1);

    @Override  // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        if("com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) {
            String s = intent.getStringExtra("tag");
            Parcelable parcelable0 = intent.getParcelableExtra("callback");
            if(parcelable0 == null || !(parcelable0 instanceof PendingCallback)) {
                Log.e("GcmTaskService", "org.dyndns.vivi.SkskShogi " + s + ": Could not process request, invalid callback.");
                return 2;
            }
            synchronized(this.zzavL) {
                this.zzavL.add(s);
                this.stopSelf(this.zzavM);
                this.zzavM = startId;
            }
            new zza(this, s, ((PendingCallback)parcelable0).getIBinder()).start();
            return 2;
        }
        if("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) {
            synchronized(this.zzavL) {
                this.zzavM = startId;
                if(this.zzavL.size() == 0) {
                    this.stopSelf(this.zzavM);
                }
                return 2;
            }
        }
        return 2;
    }

    private void zzdc(String s) {
        synchronized(this.zzavL) {
            this.zzavL.remove(s);
            if(this.zzavL.size() == 0) {
                this.stopSelf(this.zzavM);
            }
        }
    }
}

