package com.google.android.gms.drive.events;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.zzx;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class DriveEventService extends Service implements ChangeListener, CompletionListener, zzc {
    final class zza extends Handler {
        final DriveEventService zzaef;

        @Override  // android.os.Handler
        public void handleMessage(Message msg) {
            zzx.zzt("DriveEventService", "handleMessage message type:" + msg.what);
            switch(msg.what) {
                case 1: {
                    DriveEventService.this.zza(((OnEventResponse)msg.obj));
                    return;
                }
                case 2: {
                    this.getLooper().quit();
                    return;
                }
                default: {
                    zzx.zzu("DriveEventService", "Unexpected message type:" + msg.what);
                }
            }
        }

        private Message zzb(OnEventResponse onEventResponse0) {
            return this.obtainMessage(1, onEventResponse0);
        }

        private Message zzpw() {
            return this.obtainMessage(2);
        }
    }

    final class zzb extends com.google.android.gms.drive.internal.zzam.zza {
        final DriveEventService zzaef;

        @Override  // com.google.android.gms.drive.internal.zzam
        public void zzc(OnEventResponse onEventResponse0) throws RemoteException {
            synchronized(DriveEventService.this) {
                zzx.zzt("DriveEventService", "onEvent: " + onEventResponse0);
                DriveEventService.this.zzpv();
                if(DriveEventService.this.zzaec == null) {
                    zzx.zzv("DriveEventService", "Receiving event before initialize is completed.");
                }
                else {
                    Message message0 = DriveEventService.this.zzaec.zzb(onEventResponse0);
                    DriveEventService.this.zzaec.sendMessage(message0);
                }
            }
        }
    }

    public static final String ACTION_HANDLE_EVENT = "com.google.android.gms.drive.events.HANDLE_EVENT";
    private final String mName;
    int zzZN;
    private CountDownLatch zzaeb;
    zza zzaec;
    boolean zzaed;

    protected DriveEventService() {
        this("DriveEventService");
    }

    protected DriveEventService(String name) {
        this.zzaed = false;
        this.zzZN = -1;
        this.mName = name;
    }

    protected int getCallingUid() {
        return Binder.getCallingUid();
    }

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder iBinder0;
        synchronized(this) {
            if("com.google.android.gms.drive.events.HANDLE_EVENT".equals(intent.getAction())) {
                if(this.zzaec == null && !this.zzaed) {
                    this.zzaed = true;
                    CountDownLatch countDownLatch0 = new CountDownLatch(1);
                    this.zzaeb = new CountDownLatch(1);
                    new Thread() {
                        @Override
                        public void run() {
                            try {
                                Looper.prepare();
                                DriveEventService.this.zzaec = new zza(DriveEventService.this);
                                DriveEventService.this.zzaed = false;
                                countDownLatch0.countDown();
                                zzx.zzt("DriveEventService", "Bound and starting loop");
                                Looper.loop();
                                zzx.zzt("DriveEventService", "Finished loop");
                            }
                            catch(Throwable throwable0) {
                                if(DriveEventService.this.zzaeb != null) {
                                    DriveEventService.this.zzaeb.countDown();
                                }
                                throw throwable0;
                            }
                            if(DriveEventService.this.zzaeb != null) {
                                DriveEventService.this.zzaeb.countDown();
                            }
                        }
                    }.start();
                    try {
                        if(!countDownLatch0.await(5000L, TimeUnit.MILLISECONDS)) {
                            zzx.zzv("DriveEventService", "Failed to synchronously initialize event handler.");
                        }
                    }
                    catch(InterruptedException interruptedException0) {
                        throw new RuntimeException("Unable to start event handler", interruptedException0);
                    }
                }
                iBinder0 = new zzb(this).asBinder();
            }
            else {
                iBinder0 = null;
            }
            return iBinder0;
        }
    }

    @Override  // com.google.android.gms.drive.events.ChangeListener
    public void onChange(ChangeEvent event) {
        zzx.zzu(this.mName, "Unhandled change event: " + event);
    }

    @Override  // com.google.android.gms.drive.events.CompletionListener
    public void onCompletion(CompletionEvent event) {
        zzx.zzu(this.mName, "Unhandled completion event: " + event);
    }

    @Override  // android.app.Service
    public void onDestroy() {
        synchronized(this) {
            zzx.zzt("DriveEventService", "onDestroy");
            if(this.zzaec != null) {
                Message message0 = this.zzaec.zzpw();
                this.zzaec.sendMessage(message0);
                this.zzaec = null;
                try {
                    if(!this.zzaeb.await(5000L, TimeUnit.MILLISECONDS)) {
                        zzx.zzu("DriveEventService", "Failed to synchronously quit event handler. Will quit itself");
                    }
                label_9:
                    this.zzaeb = null;
                }
                catch(InterruptedException unused_ex) {
                    goto label_9;
                }
            }
            super.onDestroy();
        }
    }

    @Override  // android.app.Service
    public boolean onUnbind(Intent intent) {
        return true;
    }

    private void zza(OnEventResponse onEventResponse0) {
        DriveEvent driveEvent0 = onEventResponse0.zzpO();
        zzx.zzt("DriveEventService", "handleEventMessage: " + driveEvent0);
        try {
            switch(driveEvent0.getType()) {
                case 1: {
                    this.onChange(((ChangeEvent)driveEvent0));
                    return;
                }
                case 2: {
                    this.onCompletion(((CompletionEvent)driveEvent0));
                    return;
                }
                case 4: {
                    this.zza(((ChangesAvailableEvent)driveEvent0));
                    return;
                }
                default: {
                    zzx.zzu(this.mName, "Unhandled event: " + driveEvent0);
                }
            }
        }
        catch(Exception exception0) {
            zzx.zza(this.mName, exception0, "Error handling event: " + driveEvent0);
        }
    }

    @Override  // com.google.android.gms.drive.events.zzc
    public void zza(ChangesAvailableEvent changesAvailableEvent0) {
        zzx.zzu(this.mName, "Unhandled changes available event: " + changesAvailableEvent0);
    }

    private void zzpv() throws SecurityException {
        int v = this.getCallingUid();
        if(v == this.zzZN) {
            return;
        }
        if(!GooglePlayServicesUtil.zzd(this, v)) {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
        this.zzZN = v;
    }
}

