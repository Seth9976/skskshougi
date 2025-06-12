package com.google.android.gms.internal;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class zzku {
    private int size;
    private final LinkedHashMap zzabn;
    private int zzabo;
    private int zzabp;
    private int zzabq;
    private int zzabr;
    private int zzabs;
    private int zzabt;

    public zzku(int v) {
        if(v <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.zzabo = v;
        this.zzabn = new LinkedHashMap(0, 0.75f, true);
    }

    protected Object create(Object object0) [...] // Inlined contents

    protected void entryRemoved(boolean evicted, Object object0, Object object1, Object object2) {
    }

    public final void evictAll() {
        this.trimToSize(-1);
    }

    public final Object get(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized(this) {
            Object object1 = this.zzabn.get(object0);
            if(object1 != null) {
                ++this.zzabs;
                return object1;
            }
            ++this.zzabt;
            return null;
        }
    }

    public final Object put(Object object0, Object object1) {
        Object object2;
        if(object0 == null || object1 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized(this) {
            ++this.zzabp;
            this.size += this.zzc(object0, object1);
            object2 = this.zzabn.put(object0, object1);
            if(object2 != null) {
                this.size -= this.zzc(object0, object2);
            }
        }
        if(object2 != null) {
            this.entryRemoved(false, object0, object2, object1);
        }
        this.trimToSize(this.zzabo);
        return object2;
    }

    public final int size() {
        synchronized(this) {
        }
        return this.size;
    }

    protected int sizeOf(Object object0, Object object1) {
        return 1;
    }

    @Override
    public final String toString() {
        int v = 0;
        synchronized(this) {
            int v2 = this.zzabs + this.zzabt;
            if(v2 != 0) {
                v = this.zzabs * 100 / v2;
            }
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.zzabo, this.zzabs, this.zzabt, v);
    }

    public void trimToSize(int maxSize) {
        Object object2;
        Object object1;
        while(true) {
            synchronized(this) {
                if(this.size < 0 || this.zzabn.isEmpty() && this.size != 0) {
                    throw new IllegalStateException(this.getClass().getName() + ".sizeOf() is reporting inconsistent results!");
                }
                if(this.size <= maxSize || this.zzabn.isEmpty()) {
                    return;
                }
                Object object0 = this.zzabn.entrySet().iterator().next();
                object1 = ((Map.Entry)object0).getKey();
                object2 = ((Map.Entry)object0).getValue();
                this.zzabn.remove(object1);
                this.size -= this.zzc(object1, object2);
                ++this.zzabr;
            }
            this.entryRemoved(true, object1, object2, null);
        }
    }

    private int zzc(Object object0, Object object1) {
        int v = this.sizeOf(object0, object1);
        if(v < 0) {
            throw new IllegalStateException("Negative size: " + object0 + "=" + object1);
        }
        return v;
    }
}

