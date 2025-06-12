package com.google.android.gms.games.internal.events;

import java.util.concurrent.atomic.AtomicReference;

public abstract class EventIncrementManager {
    private final AtomicReference zzasM;

    public EventIncrementManager() {
        this.zzasM = new AtomicReference();
    }

    public void flush() {
        EventIncrementCache eventIncrementCache0 = (EventIncrementCache)this.zzasM.get();
        if(eventIncrementCache0 != null) {
            eventIncrementCache0.flush();
        }
    }

    public void zzp(String s, int v) {
        EventIncrementCache eventIncrementCache0 = (EventIncrementCache)this.zzasM.get();
        if(eventIncrementCache0 == null) {
            eventIncrementCache0 = this.zzsS();
            if(!this.zzasM.compareAndSet(null, eventIncrementCache0)) {
                eventIncrementCache0 = (EventIncrementCache)this.zzasM.get();
            }
        }
        eventIncrementCache0.zzw(s, v);
    }

    protected abstract EventIncrementCache zzsS();
}

