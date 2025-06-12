package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzu;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzh {
    private final long zzJS;
    private final String zzJT;
    private final boolean zzJU;
    private long zzJV;
    private final String zzJd;
    private final Map zzyn;

    public zzh(long v, String s, String s1, boolean z, long v1, Map map0) {
        zzu.zzcj(s);
        zzu.zzcj(s1);
        this.zzJS = v;
        this.zzJd = s;
        this.zzJT = s1;
        this.zzJU = z;
        this.zzJV = v1;
        if(map0 != null) {
            this.zzyn = new HashMap(map0);
            return;
        }
        this.zzyn = Collections.emptyMap();
    }

    public String getClientId() {
        return this.zzJd;
    }

    public long zzii() {
        return this.zzJS;
    }

    public String zzij() {
        return this.zzJT;
    }

    public boolean zzik() {
        return this.zzJU;
    }

    public long zzil() {
        return this.zzJV;
    }

    public Map zzn() {
        return this.zzyn;
    }

    public void zzn(long v) {
        this.zzJV = v;
    }
}

