package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zznq;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class Promotion {
    public static final String ACTION_CLICK = "click";
    public static final String ACTION_VIEW = "view";
    Map zzJj;

    public Promotion() {
        this.zzJj = new HashMap();
    }

    void put(String name, String value) {
        zzu.zzb(name, "Name should be non-null");
        this.zzJj.put(name, value);
    }

    public Promotion setCreative(String value) {
        this.put("cr", value);
        return this;
    }

    public Promotion setId(String value) {
        this.put("id", value);
        return this;
    }

    public Promotion setName(String value) {
        this.put("nm", value);
        return this;
    }

    public Promotion setPosition(String value) {
        this.put("ps", value);
        return this;
    }

    @Override
    public String toString() {
        return zznq.zzD(this.zzJj);
    }

    public Map zzaQ(String s) {
        Map map0 = new HashMap();
        for(Object object0: this.zzJj.entrySet()) {
            map0.put(s + ((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
        return map0;
    }
}

