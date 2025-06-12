package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import jeb.synthetic.FIN;

public abstract class GcmListenerService extends Service {
    private int zzavB;
    private int zzavC;
    private final Object zzqt;

    public GcmListenerService() {
        this.zzqt = new Object();
        this.zzavC = 0;
    }

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(String from, Bundle data) {
    }

    public void onMessageSent(String msgId) {
    }

    public void onSendError(String msgId, String error) {
    }

    @Override  // android.app.Service
    public final int onStartCommand(Intent intent, int flags, int startId) {
        synchronized(this.zzqt) {
            this.zzavB = startId;
            ++this.zzavC;
        }
        if(Build.VERSION.SDK_INT >= 11) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(() -> {
                int v1;
                try {
                    if(!"com.google.android.c2dm.intent.RECEIVE".equals(this.val$intent.getAction())) {
                        return;
                    }
                    String s = this.val$intent.getStringExtra("message_type");
                    String s1 = s == null ? "gcm" : s;
                    switch(s1) {
                        case "deleted_messages": {
                            break;
                        }
                        case "gcm": {
                            GcmListenerService.this.zzs(this.val$intent.getExtras());
                            break;
                        }
                        case "send_error": {
                            GcmListenerService.this.onSendError(this.val$intent.getStringExtra("google.message_id"), this.val$intent.getStringExtra("error"));
                            break;
                        }
                        case "send_event": {
                            GcmListenerService.this.onMessageSent(this.val$intent.getStringExtra("google.message_id"));
                            break;
                        }
                        default: {
                            Log.w("GcmListenerService", "Received message with unknown type: " + s1);
                        }
                    }
                    synchronized(GcmListenerService.this.zzqt) {
                        v1 = FIN.finallyOpen$NT();
                        --GcmListenerService.this.zzavC;
                        if(GcmListenerService.this.zzavC == 0) {
                            GcmListenerService.this.zzgf(GcmListenerService.this.zzavB);
                        }
                        FIN.finallyCodeBegin$NT(v1);
                    }
                }
                finally {
                    GcmReceiver.completeWakefulIntent(this.val$intent);
                }
                FIN.finallyCodeEnd$NT(v1);
            });
            return 3;
        }
        new AsyncTask() {
            protected Void zzb(Void[] arr_void) {
                GcmListenerService.this.zzk(intent);
                return null;
            }
        }.execute(new Void[0]);
        return 3;

        class com.google.android.gms.gcm.GcmListenerService.1 implements Runnable {
            com.google.android.gms.gcm.GcmListenerService.1(Intent intent0) {
            }

            @Override
            public void run() {
                GcmListenerService.this.zzk(this.val$intent);
            }
        }

    }

    boolean zzgf(int v) {
        return this.stopSelfResult(v);
    }

    // 检测为 lambda 实现。
    private final void zzk(Intent intent0) {
        int v1;
        try {
            if(!"com.google.android.c2dm.intent.RECEIVE".equals(intent0.getAction())) {
                return;
            }
            String s = intent0.getStringExtra("message_type");
            String s1 = s == null ? "gcm" : s;
            switch(s1) {
                case "deleted_messages": {
                    break;
                }
                case "gcm": {
                    this.zzs(intent0.getExtras());
                    break;
                }
                case "send_error": {
                    this.onSendError(intent0.getStringExtra("google.message_id"), intent0.getStringExtra("error"));
                    break;
                }
                case "send_event": {
                    this.onMessageSent(intent0.getStringExtra("google.message_id"));
                    break;
                }
                default: {
                    Log.w("GcmListenerService", "Received message with unknown type: " + s1);
                }
            }
            synchronized(this.zzqt) {
                v1 = FIN.finallyOpen$NT();
                --this.zzavC;
                if(this.zzavC == 0) {
                    this.zzgf(this.zzavB);
                }
                FIN.finallyCodeBegin$NT(v1);
            }
        }
        finally {
            GcmReceiver.completeWakefulIntent(intent0);
        }
        FIN.finallyCodeEnd$NT(v1);
    }

    private void zzs(Bundle bundle0) {
        bundle0.remove("message_type");
        bundle0.remove("android.support.content.wakelockid");
        if(zza.zzt(bundle0)) {
            zza.zzar(this).zzu(bundle0);
            return;
        }
        bundle0.getString("from");
        bundle0.remove("from");
    }
}

