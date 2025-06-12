package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public class HitBuilders {
    @Deprecated
    public static class AppViewBuilder extends HitBuilder {
        public AppViewBuilder() {
            this.set("&t", "screenview");
        }

        @Override  // com.google.android.gms.analytics.HitBuilders$HitBuilder
        public Map build() {
            return super.build();
        }
    }

    public static class EventBuilder extends HitBuilder {
        public EventBuilder() {
            this.set("&t", "event");
        }

        public EventBuilder(String category, String action) {
            this.setCategory(category);
            this.setAction(action);
        }

        @Override  // com.google.android.gms.analytics.HitBuilders$HitBuilder
        public Map build() {
            return super.build();
        }

        public EventBuilder setAction(String action) {
            this.set("&ea", action);
            return this;
        }

        public EventBuilder setCategory(String category) {
            this.set("&ec", category);
            return this;
        }

        public EventBuilder setLabel(String label) {
            this.set("&el", label);
            return this;
        }

        public EventBuilder setValue(long value) {
            this.set("&ev", Long.toString(value));
            return this;
        }
    }

    public static class ExceptionBuilder extends HitBuilder {
        public ExceptionBuilder() {
            this.set("&t", "exception");
        }

        @Override  // com.google.android.gms.analytics.HitBuilders$HitBuilder
        public Map build() {
            return super.build();
        }

        public ExceptionBuilder setDescription(String description) {
            this.set("&exd", description);
            return this;
        }

        public ExceptionBuilder setFatal(boolean fatal) {
            this.set("&exf", zzam.zzH(fatal));
            return this;
        }
    }

    public static class HitBuilder {
        private Map zzIB;
        ProductAction zzIC;
        Map zzID;
        List zzIE;
        List zzIF;

        protected HitBuilder() {
            this.zzIB = new HashMap();
            this.zzID = new HashMap();
            this.zzIE = new ArrayList();
            this.zzIF = new ArrayList();
        }

        public HitBuilder addImpression(Product product, String impressionList) {
            if(product == null) {
                zzae.zzaC("product should be non-null");
                return this;
            }
            if(impressionList == null) {
                impressionList = "";
            }
            if(!this.zzID.containsKey(impressionList)) {
                this.zzID.put(impressionList, new ArrayList());
            }
            ((List)this.zzID.get(impressionList)).add(product);
            return this;
        }

        public HitBuilder addProduct(Product product) {
            if(product == null) {
                zzae.zzaC("product should be non-null");
                return this;
            }
            this.zzIF.add(product);
            return this;
        }

        public HitBuilder addPromotion(Promotion promotion) {
            if(promotion == null) {
                zzae.zzaC("promotion should be non-null");
                return this;
            }
            this.zzIE.add(promotion);
            return this;
        }

        public Map build() {
            Map map0 = new HashMap(this.zzIB);
            if(this.zzIC != null) {
                map0.putAll(this.zzIC.build());
            }
            int v = 1;
            for(Object object0: this.zzIE) {
                map0.putAll(((Promotion)object0).zzaQ(zzc.zzT(v)));
                ++v;
            }
            int v1 = 1;
            for(Object object1: this.zzIF) {
                map0.putAll(((Product)object1).zzaQ(zzc.zzR(v1)));
                ++v1;
            }
            int v2 = 1;
            for(Object object2: this.zzID.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object2;
                List list0 = (List)map$Entry0.getValue();
                String s = zzc.zzW(v2);
                int v3 = 1;
                for(Object object3: list0) {
                    map0.putAll(((Product)object3).zzaQ(s + zzc.zzV(v3)));
                    ++v3;
                }
                if(!TextUtils.isEmpty(((CharSequence)map$Entry0.getKey()))) {
                    map0.put(s + "nm", map$Entry0.getKey());
                }
                ++v2;
            }
            return map0;
        }

        protected String get(String paramName) {
            return (String)this.zzIB.get(paramName);
        }

        public final HitBuilder set(String paramName, String paramValue) {
            if(paramName != null) {
                this.zzIB.put(paramName, paramValue);
                return this;
            }
            zzae.zzaC(" HitBuilder.set() called with a null paramName.");
            return this;
        }

        public final HitBuilder setAll(Map map0) {
            if(map0 == null) {
                return this;
            }
            this.zzIB.putAll(new HashMap(map0));
            return this;
        }

        public HitBuilder setCampaignParamsFromUrl(String utmParams) {
            String s1 = zzam.zzbk(utmParams);
            if(TextUtils.isEmpty(s1)) {
                return this;
            }
            Map map0 = zzam.zzbi(s1);
            this.set("&cc", ((String)map0.get("utm_content")));
            this.set("&cm", ((String)map0.get("utm_medium")));
            this.set("&cn", ((String)map0.get("utm_campaign")));
            this.set("&cs", ((String)map0.get("utm_source")));
            this.set("&ck", ((String)map0.get("utm_term")));
            this.set("&ci", ((String)map0.get("utm_id")));
            this.set("&anid", ((String)map0.get("anid")));
            this.set("&gclid", ((String)map0.get("gclid")));
            this.set("&dclid", ((String)map0.get("dclid")));
            this.set("&aclid", ((String)map0.get("aclid")));
            this.set("&gmob_t", ((String)map0.get("gmob_t")));
            return this;
        }

        public HitBuilder setCustomDimension(int index, String dimension) {
            this.set(zzc.zzN(index), dimension);
            return this;
        }

        public HitBuilder setCustomMetric(int index, float metric) {
            this.set(zzc.zzP(index), Float.toString(metric));
            return this;
        }

        protected HitBuilder setHitType(String hitType) {
            this.set("&t", hitType);
            return this;
        }

        public HitBuilder setNewSession() {
            this.set("&sc", "start");
            return this;
        }

        public HitBuilder setNonInteraction(boolean nonInteraction) {
            this.set("&ni", zzam.zzH(nonInteraction));
            return this;
        }

        public HitBuilder setProductAction(ProductAction action) {
            this.zzIC = action;
            return this;
        }

        public HitBuilder setPromotionAction(String action) {
            this.zzIB.put("&promoa", action);
            return this;
        }
    }

    @Deprecated
    public static class ItemBuilder extends HitBuilder {
        public ItemBuilder() {
            this.set("&t", "item");
        }

        @Override  // com.google.android.gms.analytics.HitBuilders$HitBuilder
        public Map build() {
            return super.build();
        }

        public ItemBuilder setCategory(String category) {
            this.set("&iv", category);
            return this;
        }

        public ItemBuilder setCurrencyCode(String currencyCode) {
            this.set("&cu", currencyCode);
            return this;
        }

        public ItemBuilder setName(String name) {
            this.set("&in", name);
            return this;
        }

        public ItemBuilder setPrice(double price) {
            this.set("&ip", Double.toString(price));
            return this;
        }

        public ItemBuilder setQuantity(long quantity) {
            this.set("&iq", Long.toString(quantity));
            return this;
        }

        public ItemBuilder setSku(String sku) {
            this.set("&ic", sku);
            return this;
        }

        public ItemBuilder setTransactionId(String transactionid) {
            this.set("&ti", transactionid);
            return this;
        }
    }

    public static class ScreenViewBuilder extends HitBuilder {
        public ScreenViewBuilder() {
            this.set("&t", "screenview");
        }

        @Override  // com.google.android.gms.analytics.HitBuilders$HitBuilder
        public Map build() {
            return super.build();
        }
    }

    public static class SocialBuilder extends HitBuilder {
        public SocialBuilder() {
            this.set("&t", "social");
        }

        @Override  // com.google.android.gms.analytics.HitBuilders$HitBuilder
        public Map build() {
            return super.build();
        }

        public SocialBuilder setAction(String action) {
            this.set("&sa", action);
            return this;
        }

        public SocialBuilder setNetwork(String network) {
            this.set("&sn", network);
            return this;
        }

        public SocialBuilder setTarget(String target) {
            this.set("&st", target);
            return this;
        }
    }

    public static class TimingBuilder extends HitBuilder {
        public TimingBuilder() {
            this.set("&t", "timing");
        }

        public TimingBuilder(String category, String variable, long value) {
            this.setVariable(variable);
            this.setValue(value);
            this.setCategory(category);
        }

        @Override  // com.google.android.gms.analytics.HitBuilders$HitBuilder
        public Map build() {
            return super.build();
        }

        public TimingBuilder setCategory(String category) {
            this.set("&utc", category);
            return this;
        }

        public TimingBuilder setLabel(String label) {
            this.set("&utl", label);
            return this;
        }

        public TimingBuilder setValue(long value) {
            this.set("&utt", Long.toString(value));
            return this;
        }

        public TimingBuilder setVariable(String variable) {
            this.set("&utv", variable);
            return this;
        }
    }

    @Deprecated
    public static class TransactionBuilder extends HitBuilder {
        public TransactionBuilder() {
            this.set("&t", "transaction");
        }

        @Override  // com.google.android.gms.analytics.HitBuilders$HitBuilder
        public Map build() {
            return super.build();
        }

        public TransactionBuilder setAffiliation(String affiliation) {
            this.set("&ta", affiliation);
            return this;
        }

        public TransactionBuilder setCurrencyCode(String currencyCode) {
            this.set("&cu", currencyCode);
            return this;
        }

        public TransactionBuilder setRevenue(double revenue) {
            this.set("&tr", Double.toString(revenue));
            return this;
        }

        public TransactionBuilder setShipping(double shipping) {
            this.set("&ts", Double.toString(shipping));
            return this;
        }

        public TransactionBuilder setTax(double tax) {
            this.set("&tt", Double.toString(tax));
            return this;
        }

        public TransactionBuilder setTransactionId(String transactionid) {
            this.set("&ti", transactionid);
            return this;
        }
    }

}

