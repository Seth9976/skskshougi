package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.tagmanager.zzbg;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class zzqp {
    private boolean mClosed;
    private String zzaLc;
    private final ScheduledExecutorService zzaMX;
    private ScheduledFuture zzaMZ;

    public zzqp() {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    public zzqp(String s) {
        this(Executors.newSingleThreadScheduledExecutor());
        this.zzaLc = s;
    }

    zzqp(ScheduledExecutorService scheduledExecutorService0) {
        this.zzaMZ = null;
        this.zzaLc = null;
        this.zzaMX = scheduledExecutorService0;
        this.mClosed = false;
    }

    public void zza(Context context0, zzqd zzqd0, long v, zzqn zzqn0) {
        synchronized(this) {
            zzbg.zzaB("ResourceLoaderScheduler: Loading new resource.");
            if(this.zzaMZ != null) {
                return;
            }
            zzqo zzqo0 = this.zzaLc == null ? new zzqo(context0, zzqd0, zzqn0) : new zzqo(context0, zzqd0, zzqn0, this.zzaLc);
            this.zzaMZ = this.zzaMX.schedule(zzqo0, v, TimeUnit.MILLISECONDS);
        }
    }
}

