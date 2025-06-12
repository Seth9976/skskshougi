package com.google.android.gms.analytics;

import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.internal.zzab;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzc;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzh;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzio;
import com.google.android.gms.internal.zzip;
import com.google.android.gms.internal.zzno;
import com.google.android.gms.internal.zznq;
import com.google.android.gms.internal.zznu;
import com.google.android.gms.internal.zznx;
import com.google.android.gms.internal.zzny;
import com.google.android.gms.internal.zznz;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzob;
import com.google.android.gms.internal.zzoc;
import com.google.android.gms.internal.zzod;
import com.google.android.gms.internal.zzoe;
import com.google.android.gms.internal.zzof;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public class zzb extends zzc implements zznu {
    private final zzf zzIa;
    private static DecimalFormat zzIk;
    private final Uri zzIl;
    private final boolean zzIm;
    private final boolean zzIn;
    private final String zztd;

    public zzb(zzf zzf0, String s) {
        this(zzf0, s, true, false);
    }

    public zzb(zzf zzf0, String s, boolean z, boolean z1) {
        super(zzf0);
        zzu.zzcj(s);
        this.zzIa = zzf0;
        this.zztd = s;
        this.zzIm = z;
        this.zzIn = z1;
        this.zzIl = zzb.zzaK(this.zztd);
    }

    static String zza(double f) {
        if(zzb.zzIk == null) {
            zzb.zzIk = new DecimalFormat("0.######");
        }
        return zzb.zzIk.format(f);
    }

    private static void zza(Map map0, String s, double f) {
        if(f != 0.0) {
            map0.put(s, zzb.zza(f));
        }
    }

    private static void zza(Map map0, String s, int v, int v1) {
        if(v > 0 && v1 > 0) {
            map0.put(s, v + "x" + v1);
        }
    }

    private static void zza(Map map0, String s, String s1) {
        if(!TextUtils.isEmpty(s1)) {
            map0.put(s, s1);
        }
    }

    private static void zza(Map map0, String s, boolean z) {
        if(z) {
            map0.put(s, "1");
        }
    }

    static Uri zzaK(String s) {
        zzu.zzcj(s);
        Uri.Builder uri$Builder0 = new Uri.Builder();
        uri$Builder0.scheme("uri");
        uri$Builder0.authority("google-analytics.com");
        uri$Builder0.path(s);
        return uri$Builder0.build();
    }

    @Override  // com.google.android.gms.internal.zznu
    public void zzb(zzno zzno0) {
        zzu.zzu(zzno0);
        zzu.zzb(zzno0.zzvU(), "Can\'t deliver not submitted measurement");
        zzu.zzbZ("deliver should be called on worker thread");
        zzno zzno1 = zzno0.zzvP();
        zznq zznq0 = zzno1.zze(zzip.class);
        if(TextUtils.isEmpty(((zzip)zznq0).zzhw())) {
            this.zzhQ().zzg(zzb.zzc(zzno1), "Ignoring measurement without type");
            return;
        }
        if(TextUtils.isEmpty(((zzip)zznq0).getClientId())) {
            this.zzhQ().zzg(zzb.zzc(zzno1), "Ignoring measurement without client id");
            return;
        }
        if(!this.zzIa.zzie().getAppOptOut()) {
            double f = ((zzip)zznq0).zzhB();
            if(zzam.zza(f, ((zzip)zznq0).getClientId())) {
                this.zzb("Sampling enabled. Hit sampled out. sampling rate", f);
                return;
            }
            Map map0 = zzb.zzc(zzno1);
            map0.put("v", "1");
            map0.put("_v", "ma7.5.71");
            map0.put("tid", this.zztd);
            if(this.zzIa.zzie().isDryRunEnabled()) {
                this.zzc("Dry run is enabled. GoogleAnalytics would have sent", zzb.zzz(map0));
                return;
            }
            HashMap hashMap0 = new HashMap();
            zzam.zzb(hashMap0, "uid", ((zzip)zznq0).getUserId());
            zznx zznx0 = (zznx)zzno0.zzd(zznx.class);
            if(zznx0 != null) {
                zzam.zzb(hashMap0, "an", zznx0.zzjL());
                zzam.zzb(hashMap0, "aid", zznx0.zzsK());
                zzam.zzb(hashMap0, "av", zznx0.zzjN());
                zzam.zzb(hashMap0, "aiid", zznx0.zzwi());
            }
            boolean z = !TextUtils.isEmpty(((zzip)zznq0).zzhx());
            zzh zzh0 = new zzh(0L, ((zzip)zznq0).getClientId(), this.zztd, z, 0L, hashMap0);
            map0.put("_s", String.valueOf(this.zzhl().zza(zzh0)));
            zzab zzab0 = new zzab(this.zzhQ(), map0, zzno0.zzvS(), true);
            this.zzhl().zza(zzab0);
        }
    }

    public static Map zzc(zzno zzno0) {
        Map map0 = new HashMap();
        zzio zzio0 = (zzio)zzno0.zzd(zzio.class);
        if(zzio0 != null) {
            for(Object object0: zzio0.zzhv().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s = zzb.zzh(map$Entry0.getValue());
                if(s != null) {
                    map0.put(map$Entry0.getKey(), s);
                }
            }
        }
        zzip zzip0 = (zzip)zzno0.zzd(zzip.class);
        if(zzip0 != null) {
            zzb.zza(map0, "t", zzip0.zzhw());
            zzb.zza(map0, "cid", zzip0.getClientId());
            zzb.zza(map0, "uid", zzip0.getUserId());
            zzb.zza(map0, "sc", zzip0.zzhz());
            zzb.zza(map0, "sf", zzip0.zzhB());
            zzb.zza(map0, "ni", zzip0.zzhA());
            zzb.zza(map0, "adid", zzip0.zzhx());
            zzb.zza(map0, "ate", zzip0.zzhy());
        }
        zzod zzod0 = (zzod)zzno0.zzd(zzod.class);
        if(zzod0 != null) {
            zzb.zza(map0, "cd", zzod0.zzwB());
            zzb.zza(map0, "a", ((double)zzod0.zzbn()));
            zzb.zza(map0, "dr", zzod0.zzwE());
        }
        zzob zzob0 = (zzob)zzno0.zzd(zzob.class);
        if(zzob0 != null) {
            zzb.zza(map0, "ec", zzob0.zzwy());
            zzb.zza(map0, "ea", zzob0.getAction());
            zzb.zza(map0, "el", zzob0.getLabel());
            zzb.zza(map0, "ev", ((double)zzob0.getValue()));
        }
        zzny zzny0 = (zzny)zzno0.zzd(zzny.class);
        if(zzny0 != null) {
            zzb.zza(map0, "cn", zzny0.getName());
            zzb.zza(map0, "cs", zzny0.getSource());
            zzb.zza(map0, "cm", zzny0.zzwj());
            zzb.zza(map0, "ck", zzny0.zzwk());
            zzb.zza(map0, "cc", zzny0.getContent());
            zzb.zza(map0, "ci", zzny0.getId());
            zzb.zza(map0, "anid", zzny0.zzwl());
            zzb.zza(map0, "gclid", zzny0.zzwm());
            zzb.zza(map0, "dclid", zzny0.zzwn());
            zzb.zza(map0, "aclid", zzny0.zzwo());
        }
        zzoc zzoc0 = (zzoc)zzno0.zzd(zzoc.class);
        if(zzoc0 != null) {
            zzb.zza(map0, "exd", zzoc0.getDescription());
            zzb.zza(map0, "exf", zzoc0.zzwz());
        }
        zzoe zzoe0 = (zzoe)zzno0.zzd(zzoe.class);
        if(zzoe0 != null) {
            zzb.zza(map0, "sn", zzoe0.zzwI());
            zzb.zza(map0, "sa", zzoe0.getAction());
            zzb.zza(map0, "st", zzoe0.getTarget());
        }
        zzof zzof0 = (zzof)zzno0.zzd(zzof.class);
        if(zzof0 != null) {
            zzb.zza(map0, "utv", zzof0.zzwJ());
            zzb.zza(map0, "utt", ((double)zzof0.getTimeInMillis()));
            zzb.zza(map0, "utc", zzof0.zzwy());
            zzb.zza(map0, "utl", zzof0.getLabel());
        }
        zzim zzim0 = (zzim)zzno0.zzd(zzim.class);
        if(zzim0 != null) {
            for(Object object1: zzim0.zzht().entrySet()) {
                Map.Entry map$Entry1 = (Map.Entry)object1;
                String s1 = com.google.android.gms.analytics.zzc.zzO(((int)(((Integer)map$Entry1.getKey()))));
                if(!TextUtils.isEmpty(s1)) {
                    map0.put(s1, map$Entry1.getValue());
                }
            }
        }
        zzin zzin0 = (zzin)zzno0.zzd(zzin.class);
        if(zzin0 != null) {
            for(Object object2: zzin0.zzhu().entrySet()) {
                Map.Entry map$Entry2 = (Map.Entry)object2;
                String s2 = com.google.android.gms.analytics.zzc.zzQ(((int)(((Integer)map$Entry2.getKey()))));
                if(!TextUtils.isEmpty(s2)) {
                    map0.put(s2, zzb.zza(((double)(((Double)map$Entry2.getValue())))));
                }
            }
        }
        zzoa zzoa0 = (zzoa)zzno0.zzd(zzoa.class);
        if(zzoa0 != null) {
            ProductAction productAction0 = zzoa0.zzwu();
            if(productAction0 != null) {
                for(Object object3: productAction0.build().entrySet()) {
                    Map.Entry map$Entry3 = (Map.Entry)object3;
                    if(((String)map$Entry3.getKey()).startsWith("&")) {
                        map0.put(((String)map$Entry3.getKey()).substring(1), map$Entry3.getValue());
                    }
                    else {
                        map0.put(map$Entry3.getKey(), map$Entry3.getValue());
                    }
                }
            }
            int v = 1;
            for(Object object4: zzoa0.zzwx()) {
                map0.putAll(((Promotion)object4).zzaQ(com.google.android.gms.analytics.zzc.zzU(v)));
                ++v;
            }
            int v1 = 1;
            for(Object object5: zzoa0.zzwv()) {
                map0.putAll(((Product)object5).zzaQ(com.google.android.gms.analytics.zzc.zzS(v1)));
                ++v1;
            }
            int v2 = 1;
            for(Object object6: zzoa0.zzww().entrySet()) {
                Map.Entry map$Entry4 = (Map.Entry)object6;
                List list0 = (List)map$Entry4.getValue();
                String s3 = com.google.android.gms.analytics.zzc.zzX(v2);
                int v3 = 1;
                for(Object object7: list0) {
                    map0.putAll(((Product)object7).zzaQ(s3 + com.google.android.gms.analytics.zzc.zzV(v3)));
                    ++v3;
                }
                if(!TextUtils.isEmpty(((CharSequence)map$Entry4.getKey()))) {
                    map0.put(s3 + "nm", map$Entry4.getKey());
                }
                ++v2;
            }
        }
        zznz zznz0 = (zznz)zzno0.zzd(zznz.class);
        if(zznz0 != null) {
            zzb.zza(map0, "ul", zznz0.getLanguage());
            zzb.zza(map0, "sd", ((double)zznz0.zzwp()));
            zzb.zza(map0, "sr", zznz0.zzwq(), zznz0.zzwr());
            zzb.zza(map0, "vp", zznz0.zzws(), zznz0.zzwt());
        }
        zznx zznx0 = (zznx)zzno0.zzd(zznx.class);
        if(zznx0 != null) {
            zzb.zza(map0, "an", zznx0.zzjL());
            zzb.zza(map0, "aid", zznx0.zzsK());
            zzb.zza(map0, "aiid", zznx0.zzwi());
            zzb.zza(map0, "av", zznx0.zzjN());
        }
        return map0;
    }

    private static String zzh(Object object0) {
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof String) {
            return TextUtils.isEmpty(((String)object0)) ? null : ((String)object0);
        }
        if(object0 instanceof Double) {
            return ((double)(((Double)object0))) == 0.0 ? null : zzb.zza(((double)(((Double)object0))));
        }
        if(object0 instanceof Boolean) {
            return object0 == Boolean.FALSE ? null : "1";
        }
        return String.valueOf(object0);
    }

    @Override  // com.google.android.gms.internal.zznu
    public Uri zzhe() {
        return this.zzIl;
    }

    private static String zzz(Map map0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: map0.entrySet()) {
            if(stringBuilder0.length() != 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(((String)((Map.Entry)object0).getKey()));
            stringBuilder0.append("=");
            stringBuilder0.append(((String)((Map.Entry)object0).getValue()));
        }
        return stringBuilder0.toString();
    }
}

