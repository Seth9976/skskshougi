package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzgd
public class zzhs implements zzhv {
    private Object zzGK;
    private boolean zzGL;
    private final zzhw zzGM;
    private final Object zzqt;
    private boolean zzxo;

    public zzhs() {
        this.zzqt = new Object();
        this.zzGK = null;
        this.zzGL = false;
        this.zzxo = false;
        this.zzGM = new zzhw();
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        if(!mayInterruptIfRunning) {
            return false;
        }
        synchronized(this.zzqt) {
            if(this.zzGL) {
                return false;
            }
            this.zzxo = true;
            this.zzGL = true;
            this.zzqt.notifyAll();
            this.zzGM.zzgy();
            return true;
        }
    }

    @Override
    public Object get() {
        synchronized(this.zzqt) {
            if(!this.zzGL) {
                try {
                    this.zzqt.wait();
                }
                catch(InterruptedException unused_ex) {
                }
            }
            if(this.zzxo) {
                throw new CancellationException("CallbackFuture was cancelled.");
            }
            return this.zzGK;
        }
    }

    @Override
    public Object get(long timeout, TimeUnit unit) throws TimeoutException {
        synchronized(this.zzqt) {
            if(!this.zzGL) {
                try {
                    long v2 = unit.toMillis(timeout);
                    if(v2 != 0L) {
                        this.zzqt.wait(v2);
                    }
                }
                catch(InterruptedException unused_ex) {
                }
            }
            if(!this.zzGL) {
                throw new TimeoutException("CallbackFuture timed out.");
            }
            if(this.zzxo) {
                throw new CancellationException("CallbackFuture was cancelled.");
            }
            return this.zzGK;
        }
    }

    @Override
    public boolean isCancelled() {
        synchronized(this.zzqt) {
        }
        return this.zzxo;
    }

    @Override
    public boolean isDone() {
        synchronized(this.zzqt) {
        }
        return this.zzGL;
    }

    @Override  // com.google.android.gms.internal.zzhv
    public void zzb(Runnable runnable0) {
        this.zzGM.zzb(runnable0);
    }

    public void zzf(Object object0) {
        synchronized(this.zzqt) {
            if(this.zzGL) {
                throw new IllegalStateException("Provided CallbackFuture with multiple values.");
            }
            this.zzGL = true;
            this.zzGK = object0;
            this.zzqt.notifyAll();
            this.zzGM.zzgy();
        }
    }
}

