package com.google.android.gms.tagmanager;

import android.util.LruCache;

class zzba implements zzl {
    private LruCache zzaMe;

    zzba(int v, zza zzm$zza0) {
        this.zzaMe = new LruCache(v) {
            @Override  // android.util.LruCache
            protected int sizeOf(Object object0, Object object1) {
                return zzm$zza0.sizeOf(object0, object1);
            }
        };
    }

    @Override  // com.google.android.gms.tagmanager.zzl
    public Object get(Object object0) {
        return this.zzaMe.get(object0);
    }

    @Override  // com.google.android.gms.tagmanager.zzl
    public void zzf(Object object0, Object object1) {
        this.zzaMe.put(object0, object1);
    }
}

