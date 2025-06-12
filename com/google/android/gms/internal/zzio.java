package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzio extends zznq {
    private final Map zzyn;

    public zzio() {
        this.zzyn = new HashMap();
    }

    public void set(String name, String value) {
        String s2 = this.zzaM(name);
        this.zzyn.put(s2, value);
    }

    @Override
    public String toString() {
        return zzio.zzy(this.zzyn);
    }

    public void zza(zzio zzio0) {
        zzu.zzu(zzio0);
        zzio0.zzyn.putAll(this.zzyn);
    }

    @Override  // com.google.android.gms.internal.zznq
    public void zza(zznq zznq0) {
        this.zza(((zzio)zznq0));
    }

    private String zzaM(String s) {
        zzu.zzcj(s);
        if(s != null && s.startsWith("&")) {
            s = s.substring(1);
        }
        zzu.zzh(s, "Name can not be empty or \"&\"");
        return s;
    }

    public Map zzhv() {
        return Collections.unmodifiableMap(this.zzyn);
    }
}

