package com.google.android.gms.iid;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.gcm.GcmReceiver;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import java.io.IOException;

public class InstanceIDListenerService extends Service {
    static String ACTION;
    private static String zzavK;
    MessengerCompat zzawU;
    BroadcastReceiver zzawV;
    private static String zzawW;
    int zzawX;
    int zzawY;

    static {
        InstanceIDListenerService.ACTION = "action";
        InstanceIDListenerService.zzavK = "google.com/iid";
        InstanceIDListenerService.zzawW = "CMD";
    }

    public InstanceIDListenerService() {
        this.zzawU = new MessengerCompat(new Handler(Looper.getMainLooper()) {
            @Override  // android.os.Handler
            public void handleMessage(Message msg) {
                int v = MessengerCompat.zzc(msg);
                InstanceIDListenerService.this.zza(msg, v);
            }
        });
        this.zzawV = new BroadcastReceiver() {
            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if(Log.isLoggable("InstanceID", 3)) {
                    intent.getStringExtra("registration_id");
                    Log.d("InstanceID", "Received GSF callback using dynamic receiver: " + intent.getExtras());
                }
                InstanceIDListenerService.this.zzn(intent);
                InstanceIDListenerService.this.stop();
            }
        };
    }

    @Override  // android.app.Service
    public IBinder onBind(Intent intent) {
        return intent == null || !"com.google.android.gms.iid.InstanceID".equals(intent.getAction()) ? null : this.zzawU.getBinder();
    }

    @Override  // android.app.Service
    public void onCreate() {
        IntentFilter intentFilter0 = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
        intentFilter0.addCategory("org.dyndns.vivi.SkskShogi");
        this.registerReceiver(this.zzawV, intentFilter0, "com.google.android.c2dm.permission.RECEIVE", null);
    }

    @Override  // android.app.Service
    public void onDestroy() {
        this.unregisterReceiver(this.zzawV);
    }

    @Override  // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        this.zzgn(startId);
        try {
            if(intent == null) {
                return 2;
            }
            if("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
                if(Build.VERSION.SDK_INT <= 18) {
                    Intent intent1 = (Intent)intent.getParcelableExtra("GSF");
                    if(intent1 != null) {
                        this.startService(intent1);
                        return 1;
                    }
                }
                this.zzn(intent);
            }
        }
        finally {
            this.stop();
        }
        if(intent.getStringExtra("from") != null) {
            GcmReceiver.completeWakefulIntent(intent);
        }
        return 2;
    }

    public void onTokenRefresh() {
    }

    void stop() {
        synchronized(this) {
            --this.zzawX;
            if(this.zzawX == 0) {
                this.stopSelf(this.zzawY);
            }
            if(Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Stop " + this.zzawX + " " + this.zzawY);
            }
        }
    }

    static void zza(Context context0, zzd zzd0) {
        zzd0.zzul();
        Intent intent0 = new Intent("com.google.android.gms.iid.InstanceID");
        intent0.putExtra("CMD", "RST");
        intent0.setPackage("org.dyndns.vivi.SkskShogi");
        context0.startService(intent0);
    }

    private void zza(Message message0, int v) {
        zzc.zzaw(this);
        this.getPackageManager();
        if(v != zzc.zzaxf && v != zzc.zzaxe) {
            Log.w("InstanceID", "Message from unexpected caller " + v + " mine=" + zzc.zzaxe + " appid=" + zzc.zzaxf);
            return;
        }
        this.zzn(((Intent)message0.obj));
    }

    public void zzab(boolean z) {
    }

    static void zzav(Context context0) {
        Intent intent0 = new Intent("com.google.android.gms.iid.InstanceID");
        intent0.setPackage("org.dyndns.vivi.SkskShogi");
        intent0.putExtra("CMD", "SYNC");
        context0.startService(intent0);
    }

    void zzgn(int v) {
        synchronized(this) {
            ++this.zzawX;
            if(v > this.zzawY) {
                this.zzawY = v;
            }
        }
    }

    public void zzn(Intent intent0) {
        InstanceID instanceID0;
        String s = intent0.getStringExtra("subtype");
        if(s == null) {
            instanceID0 = InstanceID.getInstance(this);
        }
        else {
            Bundle bundle0 = new Bundle();
            bundle0.putString("subtype", s);
            instanceID0 = InstanceID.zza(this, bundle0);
        }
        String s1 = intent0.getStringExtra("CMD");
        if(intent0.getStringExtra("error") != null || intent0.getStringExtra("registration_id") != null) {
            if(Log.isLoggable("InstanceID", 3)) {
                Log.d("InstanceID", "Register result in service " + s);
            }
            instanceID0.zzuh().zzr(intent0);
            return;
        }
        if(Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Service command " + s + " " + s1 + " " + intent0.getExtras());
        }
        if(intent0.getStringExtra("unregistered") != null) {
            zzd zzd0 = instanceID0.zzug();
            if(s == null) {
                s = "";
            }
            zzd0.zzdi(s);
            instanceID0.zzuh().zzr(intent0);
            return;
        }
        if("RST".equals(s1)) {
            instanceID0.zzuf();
            return;
        }
        if(!"RST_FULL".equals(s1)) {
            if("SYNC".equals(s1)) {
                instanceID0.zzug().zzdi(s);
                return;
            }
            if("PING".equals(s1)) {
                try {
                    GoogleCloudMessaging.getInstance(this).send("google.com/iid", "0", 0L, intent0.getExtras());
                }
                catch(IOException unused_ex) {
                    Log.w("InstanceID", "Failed to send ping response");
                }
            }
        }
        else if(!instanceID0.zzug().isEmpty()) {
            instanceID0.zzug().zzul();
        }
    }
}

