package com.google.android.gms.internal;

import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class zzoa extends zznq {
    private ProductAction zzIC;
    private final Map zzID;
    private final List zzIE;
    private final List zzIF;

    public zzoa() {
        this.zzIF = new ArrayList();
        this.zzIE = new ArrayList();
        this.zzID = new HashMap();
    }

    @Override
    public String toString() {
        HashMap hashMap0 = new HashMap();
        if(!this.zzIF.isEmpty()) {
            hashMap0.put("products", this.zzIF);
        }
        if(!this.zzIE.isEmpty()) {
            hashMap0.put("promotions", this.zzIE);
        }
        if(!this.zzID.isEmpty()) {
            hashMap0.put("impressions", this.zzID);
        }
        hashMap0.put("productAction", this.zzIC);
        return zzoa.zzy(hashMap0);
    }

    public void zza(Product product0, String s) {
        if(product0 == null) {
            return;
        }
        if(s == null) {
            s = "";
        }
        if(!this.zzID.containsKey(s)) {
            ArrayList arrayList0 = new ArrayList();
            this.zzID.put(s, arrayList0);
        }
        ((List)this.zzID.get(s)).add(product0);
    }

    @Override  // com.google.android.gms.internal.zznq
    public void zza(zznq zznq0) {
        this.zza(((zzoa)zznq0));
    }

    public void zza(zzoa zzoa0) {
        zzoa0.zzIF.addAll(this.zzIF);
        zzoa0.zzIE.addAll(this.zzIE);
        for(Object object0: this.zzID.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            for(Object object1: ((List)((Map.Entry)object0).getValue())) {
                zzoa0.zza(((Product)object1), s);
            }
        }
        if(this.zzIC != null) {
            zzoa0.zzIC = this.zzIC;
        }
    }

    public ProductAction zzwu() {
        return this.zzIC;
    }

    public List zzwv() {
        return Collections.unmodifiableList(this.zzIF);
    }

    public Map zzww() {
        return this.zzID;
    }

    public List zzwx() {
        return Collections.unmodifiableList(this.zzIE);
    }
}

