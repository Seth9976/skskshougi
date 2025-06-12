package com.google.android.gms.games.internal.events;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class EventIncrementCache {
    final Object zzasG;
    private Handler zzasH;
    private boolean zzasI;
    private HashMap zzasJ;
    private int zzasK;

    public EventIncrementCache(Looper looper, int flushIntervalMillis) {
        this.zzasG = new Object();
        this.zzasH = new Handler(looper);
        this.zzasJ = new HashMap();
        this.zzasK = flushIntervalMillis;
    }

    public void flush() {
        synchronized(this.zzasG) {
            for(Object object1: this.zzasJ.entrySet()) {
                this.zzs(((String)((Map.Entry)object1).getKey()), ((AtomicInteger)((Map.Entry)object1).getValue()).get());
            }
            this.zzasJ.clear();
        }
    }

    protected abstract void zzs(String arg1, int arg2);

    // 检测为 lambda 实现。
    private void zzth() {
        synchronized(this.zzasG) {
            this.zzasI = false;
            this.flush();
        }
    }

    public void zzw(String s, int v) {
        synchronized(this.zzasG) {
            if(!this.zzasI) {
                this.zzasI = true;
                this.zzasH.postDelayed(() -> synchronized(EventIncrementCache.this.zzasG) {
                    EventIncrementCache.this.zzasI = false;
                    EventIncrementCache.this.flush();
                }, ((long)this.zzasK));
            }
            AtomicInteger atomicInteger0 = (AtomicInteger)this.zzasJ.get(s);
            if(atomicInteger0 == null) {
                atomicInteger0 = new AtomicInteger();
                this.zzasJ.put(s, atomicInteger0);
            }
            atomicInteger0.addAndGet(v);
        }

        class com.google.android.gms.games.internal.events.EventIncrementCache.1 implements Runnable {
            @Override
            public void run() {
                EventIncrementCache.this.zzth();
            }
        }

    }
}

