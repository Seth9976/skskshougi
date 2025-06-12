package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class zzin extends zznq {
    private Map zzJb;

    public zzin() {
        this.zzJb = new HashMap(4);
    }

    @Override
    public String toString() {
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.zzJb.entrySet()) {
            hashMap0.put("metric" + ((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
        return zzin.zzy(hashMap0);
    }

    public void zza(zzin zzin0) {
        zzin0.zzJb.putAll(this.zzJb);
    }

    @Override  // com.google.android.gms.internal.zznq
    public void zza(zznq zznq0) {
        this.zza(((zzin)zznq0));
    }

    public Map zzhu() {
        return Collections.unmodifiableMap(this.zzJb);
    }
}

