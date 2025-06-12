package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.zzc;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zznq;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class Product {
    Map zzJj;

    public Product() {
        this.zzJj = new HashMap();
    }

    void put(String name, String value) {
        zzu.zzb(name, "Name should be non-null");
        this.zzJj.put(name, value);
    }

    public Product setBrand(String value) {
        this.put("br", value);
        return this;
    }

    public Product setCategory(String value) {
        this.put("ca", value);
        return this;
    }

    public Product setCouponCode(String value) {
        this.put("cc", value);
        return this;
    }

    public Product setCustomDimension(int index, String value) {
        this.put(zzc.zzY(index), value);
        return this;
    }

    public Product setCustomMetric(int index, int value) {
        this.put(zzc.zzZ(index), Integer.toString(value));
        return this;
    }

    public Product setId(String value) {
        this.put("id", value);
        return this;
    }

    public Product setName(String value) {
        this.put("nm", value);
        return this;
    }

    public Product setPosition(int value) {
        this.put("ps", Integer.toString(value));
        return this;
    }

    public Product setPrice(double value) {
        this.put("pr", Double.toString(value));
        return this;
    }

    public Product setQuantity(int value) {
        this.put("qt", Integer.toString(value));
        return this;
    }

    public Product setVariant(String value) {
        this.put("va", value);
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

