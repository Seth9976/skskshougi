package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class zza implements ServiceConnection {
    boolean zzVE;
    private final BlockingQueue zzVF;

    public zza() {
        this.zzVE = false;
        this.zzVF = new LinkedBlockingQueue();
    }

    @Override  // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        this.zzVF.add(service);
    }

    @Override  // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
    }

    public IBinder zzmh() throws InterruptedException {
        if(Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
        }
        if(this.zzVE) {
            throw new IllegalStateException();
        }
        this.zzVE = true;
        return (IBinder)this.zzVF.take();
    }
}

