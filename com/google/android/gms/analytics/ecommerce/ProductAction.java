package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zznq;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class ProductAction {
    public static final String ACTION_ADD = "add";
    public static final String ACTION_CHECKOUT = "checkout";
    public static final String ACTION_CHECKOUT_OPTION = "checkout_option";
    @Deprecated
    public static final String ACTION_CHECKOUT_OPTIONS = "checkout_options";
    public static final String ACTION_CLICK = "click";
    public static final String ACTION_DETAIL = "detail";
    public static final String ACTION_PURCHASE = "purchase";
    public static final String ACTION_REFUND = "refund";
    public static final String ACTION_REMOVE = "remove";
    Map zzJj;

    public ProductAction(String action) {
        this.zzJj = new HashMap();
        this.put("&pa", action);
    }

    public Map build() {
        return new HashMap(this.zzJj);
    }

    void put(String name, String value) {
        zzu.zzb(name, "Name should be non-null");
        this.zzJj.put(name, value);
    }

    public ProductAction setCheckoutOptions(String value) {
        this.put("&col", value);
        return this;
    }

    public ProductAction setCheckoutStep(int value) {
        this.put("&cos", Integer.toString(value));
        return this;
    }

    public ProductAction setProductActionList(String value) {
        this.put("&pal", value);
        return this;
    }

    public ProductAction setProductListSource(String value) {
        this.put("&pls", value);
        return this;
    }

    public ProductAction setTransactionAffiliation(String value) {
        this.put("&ta", value);
        return this;
    }

    public ProductAction setTransactionCouponCode(String value) {
        this.put("&tcc", value);
        return this;
    }

    public ProductAction setTransactionId(String value) {
        this.put("&ti", value);
        return this;
    }

    public ProductAction setTransactionRevenue(double value) {
        this.put("&tr", Double.toString(value));
        return this;
    }

    public ProductAction setTransactionShipping(double value) {
        this.put("&ts", Double.toString(value));
        return this;
    }

    public ProductAction setTransactionTax(double value) {
        this.put("&tt", Double.toString(value));
        return this;
    }

    @Override
    public String toString() {
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.zzJj.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((String)map$Entry0.getKey()).startsWith("&")) {
                hashMap0.put(((String)map$Entry0.getKey()).substring(1), map$Entry0.getValue());
            }
            else {
                hashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        return zznq.zzD(hashMap0);
    }
}

