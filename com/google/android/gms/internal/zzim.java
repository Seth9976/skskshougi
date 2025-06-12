package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class zzim extends zznq {
    private Map zzJa;

    public zzim() {
        this.zzJa = new HashMap(4);
    }

    @Override
    public String toString() {
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.zzJa.entrySet()) {
            hashMap0.put("dimension" + ((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
        return zzim.zzy(hashMap0);
    }

    public void zza(zzim zzim0) {
        zzim0.zzJa.putAll(this.zzJa);
    }

    @Override  // com.google.android.gms.internal.zznq
    public void zza(zznq zznq0) {
        this.zza(((zzim)zznq0));
    }

    public Map zzht() {
        return Collections.unmodifiableMap(this.zzJa);
    }
}

