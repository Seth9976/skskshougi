package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.internal.zzag.zza;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zzdg extends zzdd {
    private static final String ID;
    private final DataLayer zzaKz;
    private static final String zzaOC;
    private static final String zzaOD;
    private static final String zzaOE;
    private static final String zzaOF;
    private static final String zzaOG;
    private static final String zzaOH;
    private static final String zzaOI;
    private static final String zzaOJ;
    private static final String zzaOK;
    private static final List zzaOL;
    private static final Pattern zzaOM;
    private static final Pattern zzaON;
    private static Map zzaOO;
    private static Map zzaOP;
    private final Set zzaOQ;
    private final zzdc zzaOR;

    static {
        zzdg.ID = "_ua";
        zzdg.zzaOC = "account";
        zzdg.zzaOD = "analytics_pass_through";
        zzdg.zzaOE = "enable_ecommerce";
        zzdg.zzaOF = "ecommerce_use_data_layer";
        zzdg.zzaOG = "ecommerce_macro_data";
        zzdg.zzaOH = "analytics_fields";
        zzdg.zzaOI = "track_transaction";
        zzdg.zzaOJ = "transaction_datalayer_map";
        zzdg.zzaOK = "transaction_item_datalayer_map";
        zzdg.zzaOL = Arrays.asList(new String[]{"detail", "checkout", "checkout_option", "click", "add", "remove", "purchase", "refund"});
        zzdg.zzaOM = Pattern.compile("dimension(\\d+)");
        zzdg.zzaON = Pattern.compile("metric(\\d+)");
    }

    public zzdg(Context context0, DataLayer dataLayer0) {
        this(context0, dataLayer0, new zzdc(context0));
    }

    zzdg(Context context0, DataLayer dataLayer0, zzdc zzdc0) {
        super("_ua", new String[0]);
        this.zzaKz = dataLayer0;
        this.zzaOR = zzdc0;
        this.zzaOQ = new HashSet();
        this.zzaOQ.add("");
        this.zzaOQ.add("0");
        this.zzaOQ.add("false");
    }

    @Override  // com.google.android.gms.tagmanager.zzdd
    public zza zzE(Map map0) {
        return super.zzE(map0);
    }

    @Override  // com.google.android.gms.tagmanager.zzdd
    public void zzG(Map map0) {
        Tracker tracker0 = this.zzaOR.zzeG("_GTM_DEFAULT_TRACKER_");
        tracker0.enableAdvertisingIdCollection(this.zzi(map0, "collect_adid"));
        if(this.zzi(map0, "enable_ecommerce")) {
            this.zzb(tracker0, map0);
            return;
        }
        if(this.zzi(map0, "analytics_pass_through")) {
            tracker0.send(this.zzm(((zza)map0.get("analytics_fields"))));
            return;
        }
        if(this.zzi(map0, "track_transaction")) {
            this.zza(tracker0, map0);
            return;
        }
        zzbg.zzaC("Ignoring unknown tag.");
    }

    private Double zzM(Object object0) {
        if(object0 instanceof String) {
            try {
                return Double.valueOf(((String)object0));
            }
            catch(NumberFormatException numberFormatException0) {
                throw new RuntimeException("Cannot convert the object to Double: " + numberFormatException0.getMessage());
            }
        }
        if(object0 instanceof Integer) {
            return ((Integer)object0).doubleValue();
        }
        if(!(object0 instanceof Double)) {
            throw new RuntimeException("Cannot convert the object to Double: " + object0.toString());
        }
        return (Double)object0;
    }

    private Integer zzN(Object object0) {
        if(object0 instanceof String) {
            try {
                return Integer.valueOf(((String)object0));
            }
            catch(NumberFormatException numberFormatException0) {
                throw new RuntimeException("Cannot convert the object to Integer: " + numberFormatException0.getMessage());
            }
        }
        if(object0 instanceof Double) {
            return ((Double)object0).intValue();
        }
        if(!(object0 instanceof Integer)) {
            throw new RuntimeException("Cannot convert the object to Integer: " + object0.toString());
        }
        return (Integer)object0;
    }

    private Promotion zzO(Map map0) {
        Promotion promotion0 = new Promotion();
        String s = (String)map0.get("id");
        if(s != null) {
            promotion0.setId(String.valueOf(s));
        }
        String s1 = (String)map0.get("name");
        if(s1 != null) {
            promotion0.setName(String.valueOf(s1));
        }
        String s2 = (String)map0.get("creative");
        if(s2 != null) {
            promotion0.setCreative(String.valueOf(s2));
        }
        String s3 = (String)map0.get("position");
        if(s3 != null) {
            promotion0.setPosition(String.valueOf(s3));
        }
        return promotion0;
    }

    private Product zzP(Map map0) {
        int v1;
        int v;
        Product product0 = new Product();
        Object object0 = map0.get("id");
        if(object0 != null) {
            product0.setId(String.valueOf(object0));
        }
        Object object1 = map0.get("name");
        if(object1 != null) {
            product0.setName(String.valueOf(object1));
        }
        Object object2 = map0.get("brand");
        if(object2 != null) {
            product0.setBrand(String.valueOf(object2));
        }
        Object object3 = map0.get("category");
        if(object3 != null) {
            product0.setCategory(String.valueOf(object3));
        }
        Object object4 = map0.get("variant");
        if(object4 != null) {
            product0.setVariant(String.valueOf(object4));
        }
        Object object5 = map0.get("coupon");
        if(object5 != null) {
            product0.setCouponCode(String.valueOf(object5));
        }
        Object object6 = map0.get("position");
        if(object6 != null) {
            product0.setPosition(((int)this.zzN(object6)));
        }
        Object object7 = map0.get("price");
        if(object7 != null) {
            product0.setPrice(((double)this.zzM(object7)));
        }
        Object object8 = map0.get("quantity");
        if(object8 != null) {
            product0.setQuantity(((int)this.zzN(object8)));
        }
        for(Object object9: map0.keySet()) {
            String s = (String)object9;
            Matcher matcher0 = zzdg.zzaOM.matcher(s);
            if(matcher0.matches()) {
                try {
                    v = Integer.parseInt(matcher0.group(1));
                }
                catch(NumberFormatException unused_ex) {
                    zzbg.zzaC(("illegal number in custom dimension value: " + s));
                    continue;
                }
                product0.setCustomDimension(v, String.valueOf(map0.get(s)));
            }
            else {
                Matcher matcher1 = zzdg.zzaON.matcher(s);
                if(matcher1.matches()) {
                    try {
                        v1 = Integer.parseInt(matcher1.group(1));
                    }
                    catch(NumberFormatException unused_ex) {
                        zzbg.zzaC(("illegal number in custom metric value: " + s));
                        continue;
                    }
                    product0.setCustomMetric(v1, ((int)this.zzN(map0.get(s))));
                }
            }
        }
        return product0;
    }

    private Map zzQ(Map map0) {
        zza zzag$zza0 = (zza)map0.get("transaction_datalayer_map");
        if(zzag$zza0 != null) {
            return this.zzc(zzag$zza0);
        }
        if(zzdg.zzaOO == null) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("transactionId", "&ti");
            hashMap0.put("transactionAffiliation", "&ta");
            hashMap0.put("transactionTax", "&tt");
            hashMap0.put("transactionShipping", "&ts");
            hashMap0.put("transactionTotal", "&tr");
            hashMap0.put("transactionCurrency", "&cu");
            zzdg.zzaOO = hashMap0;
        }
        return zzdg.zzaOO;
    }

    private Map zzR(Map map0) {
        zza zzag$zza0 = (zza)map0.get("transaction_item_datalayer_map");
        if(zzag$zza0 != null) {
            return this.zzc(zzag$zza0);
        }
        if(zzdg.zzaOP == null) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("name", "&in");
            hashMap0.put("sku", "&ic");
            hashMap0.put("category", "&iv");
            hashMap0.put("price", "&ip");
            hashMap0.put("quantity", "&iq");
            hashMap0.put("currency", "&cu");
            zzdg.zzaOP = hashMap0;
        }
        return zzdg.zzaOP;
    }

    private void zza(Tracker tracker0, Map map0) {
        String s = this.zzeO("transactionId");
        if(s == null) {
            zzbg.zzaz("Cannot find transactionId in data layer.");
            return;
        }
        LinkedList linkedList0 = new LinkedList();
        try {
            Map map1 = this.zzm(((zza)map0.get("analytics_fields")));
            map1.put("&t", "transaction");
            for(Object object0: this.zzQ(map0).entrySet()) {
                this.zzd(map1, ((String)((Map.Entry)object0).getValue()), this.zzeO(((String)((Map.Entry)object0).getKey())));
            }
            linkedList0.add(map1);
            List list0 = this.zzeP("transactionProducts");
            if(list0 != null) {
                for(Object object1: list0) {
                    Map map2 = (Map)object1;
                    if(map2.get("name") == null) {
                        zzbg.zzaz("Unable to send transaction item hit due to missing \'name\' field.");
                        return;
                    }
                    Map map3 = this.zzm(((zza)map0.get("analytics_fields")));
                    map3.put("&t", "item");
                    map3.put("&ti", s);
                    for(Object object2: this.zzR(map0).entrySet()) {
                        this.zzd(map3, ((String)((Map.Entry)object2).getValue()), ((String)map2.get(((Map.Entry)object2).getKey())));
                    }
                    linkedList0.add(map3);
                }
            }
            for(Object object3: linkedList0) {
                tracker0.send(((Map)object3));
            }
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            zzbg.zzb("Unable to send transaction", illegalArgumentException0);
        }
    }

    private void zzb(Tracker tracker0, Map map0) {
        boolean z;
        List list0;
        Map map2;
        ScreenViewBuilder hitBuilders$ScreenViewBuilder0 = new ScreenViewBuilder();
        Map map1 = this.zzm(((zza)map0.get(zzdg.zzaOH)));
        hitBuilders$ScreenViewBuilder0.setAll(map1);
        if(this.zzi(map0, "ecommerce_use_data_layer")) {
            Object object0 = this.zzaKz.get("ecommerce");
            map2 = object0 instanceof Map ? ((Map)object0) : null;
        }
        else {
            Object object1 = zzdf.zzl(((zza)map0.get("ecommerce_macro_data")));
            map2 = object1 instanceof Map ? ((Map)object1) : null;
        }
        if(map2 != null) {
            String s = (String)map1.get("&cu");
            if(s == null) {
                s = (String)map2.get("currencyCode");
            }
            if(s != null) {
                hitBuilders$ScreenViewBuilder0.set("&cu", s);
            }
            Object object2 = map2.get("impressions");
            if(object2 instanceof List) {
                for(Object object3: ((List)object2)) {
                    Map map3 = (Map)object3;
                    try {
                        hitBuilders$ScreenViewBuilder0.addImpression(this.zzP(map3), ((String)map3.get("list")));
                    }
                    catch(RuntimeException runtimeException0) {
                        zzbg.zzaz(("Failed to extract a product from DataLayer. " + runtimeException0.getMessage()));
                    }
                }
            }
            if(map2.containsKey("promoClick")) {
                list0 = (List)((Map)map2.get("promoClick")).get("promotions");
            }
            else {
                list0 = map2.containsKey("promoView") ? ((List)((Map)map2.get("promoView")).get("promotions")) : null;
            }
            if(list0 == null) {
                z = true;
            }
            else {
                for(Object object4: list0) {
                    Map map4 = (Map)object4;
                    try {
                        hitBuilders$ScreenViewBuilder0.addPromotion(this.zzO(map4));
                    }
                    catch(RuntimeException runtimeException1) {
                        zzbg.zzaz(("Failed to extract a promotion from DataLayer. " + runtimeException1.getMessage()));
                    }
                }
                if(map2.containsKey("promoClick")) {
                    hitBuilders$ScreenViewBuilder0.set("&promoa", "click");
                    z = false;
                }
                else {
                    hitBuilders$ScreenViewBuilder0.set("&promoa", "view");
                    z = true;
                }
            }
            if(z) {
                for(Object object5: zzdg.zzaOL) {
                    String s1 = (String)object5;
                    if(map2.containsKey(s1)) {
                        Map map5 = (Map)map2.get(s1);
                        List list1 = (List)map5.get("products");
                        if(list1 != null) {
                            for(Object object6: list1) {
                                Map map6 = (Map)object6;
                                try {
                                    hitBuilders$ScreenViewBuilder0.addProduct(this.zzP(map6));
                                }
                                catch(RuntimeException runtimeException2) {
                                    zzbg.zzaz(("Failed to extract a product from DataLayer. " + runtimeException2.getMessage()));
                                }
                            }
                        }
                        try {
                            hitBuilders$ScreenViewBuilder0.setProductAction((map5.containsKey("actionField") ? this.zze(s1, ((Map)map5.get("actionField"))) : new ProductAction(s1)));
                        }
                        catch(RuntimeException runtimeException3) {
                            zzbg.zzaz(("Failed to extract a product action from DataLayer. " + runtimeException3.getMessage()));
                        }
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        tracker0.send(hitBuilders$ScreenViewBuilder0.build());
    }

    private Map zzc(zza zzag$zza0) {
        Object object0 = zzdf.zzl(zzag$zza0);
        if(!(object0 instanceof Map)) {
            return null;
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object1: ((Map)object0).entrySet()) {
            linkedHashMap0.put(((Map.Entry)object1).getKey().toString(), ((Map.Entry)object1).getValue().toString());
        }
        return linkedHashMap0;
    }

    private void zzd(Map map0, String s, String s1) {
        if(s1 != null) {
            map0.put(s, s1);
        }
    }

    private ProductAction zze(String s, Map map0) {
        ProductAction productAction0 = new ProductAction(s);
        Object object0 = map0.get("id");
        if(object0 != null) {
            productAction0.setTransactionId(String.valueOf(object0));
        }
        Object object1 = map0.get("affiliation");
        if(object1 != null) {
            productAction0.setTransactionAffiliation(String.valueOf(object1));
        }
        Object object2 = map0.get("coupon");
        if(object2 != null) {
            productAction0.setTransactionCouponCode(String.valueOf(object2));
        }
        Object object3 = map0.get("list");
        if(object3 != null) {
            productAction0.setProductActionList(String.valueOf(object3));
        }
        Object object4 = map0.get("option");
        if(object4 != null) {
            productAction0.setCheckoutOptions(String.valueOf(object4));
        }
        Object object5 = map0.get("revenue");
        if(object5 != null) {
            productAction0.setTransactionRevenue(((double)this.zzM(object5)));
        }
        Object object6 = map0.get("tax");
        if(object6 != null) {
            productAction0.setTransactionTax(((double)this.zzM(object6)));
        }
        Object object7 = map0.get("shipping");
        if(object7 != null) {
            productAction0.setTransactionShipping(((double)this.zzM(object7)));
        }
        Object object8 = map0.get("step");
        if(object8 != null) {
            productAction0.setCheckoutStep(((int)this.zzN(object8)));
        }
        return productAction0;
    }

    private String zzeO(String s) {
        Object object0 = this.zzaKz.get(s);
        return object0 == null ? null : object0.toString();
    }

    private List zzeP(String s) {
        Object object0 = this.zzaKz.get(s);
        if(object0 == null) {
            return null;
        }
        if(!(object0 instanceof List)) {
            throw new IllegalArgumentException("transactionProducts should be of type List.");
        }
        for(Object object1: ((List)object0)) {
            if(!(object1 instanceof Map)) {
                throw new IllegalArgumentException("Each element of transactionProducts should be of type Map.");
            }
            if(false) {
                break;
            }
        }
        return (List)object0;
    }

    private boolean zzi(Map map0, String s) {
        zza zzag$zza0 = (zza)map0.get(s);
        return zzag$zza0 == null ? false : zzdf.zzk(zzag$zza0).booleanValue();
    }

    private Map zzm(zza zzag$zza0) {
        if(zzag$zza0 == null) {
            return new HashMap();
        }
        Map map0 = this.zzc(zzag$zza0);
        if(map0 == null) {
            return new HashMap();
        }
        String s = (String)map0.get("&aip");
        if(s != null && this.zzaOQ.contains(s.toLowerCase())) {
            map0.remove("&aip");
        }
        return map0;
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public String zzyM() {
        return super.zzyM();
    }

    @Override  // com.google.android.gms.tagmanager.zzak
    public Set zzyN() {
        return super.zzyN();
    }

    @Override  // com.google.android.gms.tagmanager.zzdd
    public boolean zzyh() {
        return super.zzyh();
    }
}

