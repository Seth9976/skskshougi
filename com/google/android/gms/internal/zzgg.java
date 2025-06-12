package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.SearchAdRequestParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public final class zzgg {
    private static final SimpleDateFormat zzDJ;

    static {
        zzgg.zzDJ = new SimpleDateFormat("yyyyMMdd");
    }

    private static String zzG(int v) {
        return String.format(Locale.US, "#%06x", ((int)(0xFFFFFF & v)));
    }

    public static AdResponseParcel zza(Context context0, AdRequestInfoParcel adRequestInfoParcel0, String s) {
        long v6;
        List list5;
        List list3;
        List list1;
        AdResponseParcel adResponseParcel1;
        String s7;
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            String s1 = jSONObject0.optString("ad_base_url", null);
            String s2 = jSONObject0.optString("ad_url", null);
            String s3 = jSONObject0.optString("ad_size", null);
            String s4 = jSONObject0.optString("ad_html", null);
            long v = -1L;
            String s5 = jSONObject0.optString("debug_dialog", null);
            long v1 = jSONObject0.has("interstitial_timeout") ? ((long)(jSONObject0.getDouble("interstitial_timeout") * 1000.0)) : -1L;
            String s6 = jSONObject0.optString("orientation", null);
            int v2 = -1;
            if("portrait".equals(s6)) {
                v2 = zzo.zzbx().zzgr();
            }
            else if("landscape".equals(s6)) {
                v2 = zzo.zzbx().zzgq();
            }
            if(TextUtils.isEmpty(s4)) {
                if(TextUtils.isEmpty(s2)) {
                    zzb.zzaC("Could not parse the mediation config: Missing required ad_html or ad_url field.");
                    return new AdResponseParcel(0);
                }
                AdResponseParcel adResponseParcel0 = zzgf.zza(adRequestInfoParcel0, context0, adRequestInfoParcel0.zzpJ.zzGG, s2, null, null, null);
                s1 = adResponseParcel0.zzzG;
                s7 = adResponseParcel0.zzCI;
                v = adResponseParcel0.zzCO;
                adResponseParcel1 = adResponseParcel0;
            }
            else {
                if(TextUtils.isEmpty(s1)) {
                    zzb.zzaC("Could not parse the mediation config: Missing required ad_base_url field");
                    return new AdResponseParcel(0);
                }
                adResponseParcel1 = null;
                s7 = s4;
            }
            JSONArray jSONArray0 = jSONObject0.optJSONArray("click_urls");
            List list0 = adResponseParcel1 == null ? null : adResponseParcel1.zzxF;
            if(jSONArray0 != null) {
                if(list0 == null) {
                    list0 = new LinkedList();
                }
                for(int v3 = 0; v3 < jSONArray0.length(); ++v3) {
                    list0.add(jSONArray0.getString(v3));
                }
            }
            list1 = list0;
            JSONArray jSONArray1 = jSONObject0.optJSONArray("impression_urls");
            List list2 = adResponseParcel1 == null ? null : adResponseParcel1.zzxG;
            if(jSONArray1 != null) {
                if(list2 == null) {
                    list2 = new LinkedList();
                }
                for(int v4 = 0; v4 < jSONArray1.length(); ++v4) {
                    list2.add(jSONArray1.getString(v4));
                }
            }
            list3 = list2;
            JSONArray jSONArray2 = jSONObject0.optJSONArray("manual_impression_urls");
            List list4 = adResponseParcel1 == null ? null : adResponseParcel1.zzCM;
            if(jSONArray2 != null) {
                if(list4 == null) {
                    list4 = new LinkedList();
                }
                for(int v5 = 0; v5 < jSONArray2.length(); ++v5) {
                    list4.add(jSONArray2.getString(v5));
                }
            }
            list5 = list4;
            if(adResponseParcel1 == null) {
                v6 = v1;
            }
            else {
                if(adResponseParcel1.orientation != -1) {
                    v2 = adResponseParcel1.orientation;
                }
                v6 = adResponseParcel1.zzCJ > 0L ? adResponseParcel1.zzCJ : v1;
            }
            String s8 = jSONObject0.optString("active_view");
            String s9 = null;
            boolean z = jSONObject0.optBoolean("ad_is_javascript", false);
            if(z) {
                s9 = jSONObject0.optString("ad_passback_url", null);
            }
            boolean z1 = jSONObject0.optBoolean("mediation", false);
            boolean z2 = jSONObject0.optBoolean("custom_render_allowed", false);
            boolean z3 = jSONObject0.optBoolean("native", false);
            boolean z4 = jSONObject0.optBoolean("content_url_opted_out", true);
            boolean z5 = jSONObject0.optBoolean("prefetch", false);
            int v7 = jSONObject0.optInt("oauth2_token_status", 0);
            long v8 = jSONObject0.optLong("refresh_interval_milliseconds", -1L);
            return new AdResponseParcel(adRequestInfoParcel0, s1, s7, list1, list3, v6, z1, jSONObject0.optLong("mediation_config_cache_time_milliseconds", -1L), list5, v8, v2, s3, v, s5, z, s9, s8, z2, z3, adRequestInfoParcel0.zzCu, z4, z5, v7);
        }
        catch(JSONException jSONException0) {
            zzb.zzaC(("Could not parse the mediation config: " + jSONException0.getMessage()));
            return new AdResponseParcel(0);
        }
    }

    public static JSONObject zza(AdRequestInfoParcel adRequestInfoParcel0, zzgk zzgk0, Location location0, zzbr zzbr0, String s, String s1, List list0) {
        try {
            HashMap hashMap0 = new HashMap();
            if(list0.size() > 0) {
                hashMap0.put("eid", TextUtils.join(",", list0));
            }
            if(adRequestInfoParcel0.zzCl != null) {
                hashMap0.put("ad_pos", adRequestInfoParcel0.zzCl);
            }
            zzgg.zza(hashMap0, adRequestInfoParcel0.zzCm);
            hashMap0.put("format", adRequestInfoParcel0.zzpN.zzsm);
            if(adRequestInfoParcel0.zzpN.width == -1) {
                hashMap0.put("smart_w", "full");
            }
            if(adRequestInfoParcel0.zzpN.height == -2) {
                hashMap0.put("smart_h", "auto");
            }
            if(adRequestInfoParcel0.zzpN.zzso != null) {
                StringBuilder stringBuilder0 = new StringBuilder();
                AdSizeParcel[] arr_adSizeParcel = adRequestInfoParcel0.zzpN.zzso;
                for(int v = 0; v < arr_adSizeParcel.length; ++v) {
                    AdSizeParcel adSizeParcel0 = arr_adSizeParcel[v];
                    if(stringBuilder0.length() != 0) {
                        stringBuilder0.append("|");
                    }
                    stringBuilder0.append((adSizeParcel0.width == -1 ? ((int)(((float)adSizeParcel0.widthPixels) / zzgk0.zzCy)) : adSizeParcel0.width));
                    stringBuilder0.append("x");
                    stringBuilder0.append((adSizeParcel0.height == -2 ? ((int)(((float)adSizeParcel0.heightPixels) / zzgk0.zzCy)) : adSizeParcel0.height));
                }
                hashMap0.put("sz", stringBuilder0);
            }
            if(adRequestInfoParcel0.zzCs != 0) {
                hashMap0.put("native_version", adRequestInfoParcel0.zzCs);
                hashMap0.put("native_templates", adRequestInfoParcel0.zzqd);
                hashMap0.put("native_image_orientation", zzgg.zzc(adRequestInfoParcel0.zzqb));
                if(!adRequestInfoParcel0.zzCG.isEmpty()) {
                    hashMap0.put("native_custom_templates", adRequestInfoParcel0.zzCG);
                }
            }
            hashMap0.put("slotname", adRequestInfoParcel0.zzpG);
            hashMap0.put("pn", adRequestInfoParcel0.applicationInfo.packageName);
            if(adRequestInfoParcel0.zzCn != null) {
                hashMap0.put("vc", adRequestInfoParcel0.zzCn.versionCode);
            }
            hashMap0.put("ms", s1);
            hashMap0.put("seq_num", adRequestInfoParcel0.zzCp);
            hashMap0.put("session_id", adRequestInfoParcel0.zzCq);
            hashMap0.put("js", adRequestInfoParcel0.zzpJ.zzGG);
            zzgg.zza(hashMap0, zzgk0);
            hashMap0.put("fdz", new Integer(zzbr0.zzcX()));
            hashMap0.put("platform", Build.MANUFACTURER);
            hashMap0.put("submodel", Build.MODEL);
            if(adRequestInfoParcel0.zzCm.versionCode >= 2 && adRequestInfoParcel0.zzCm.zzsf != null) {
                zzgg.zza(hashMap0, adRequestInfoParcel0.zzCm.zzsf);
            }
            if(adRequestInfoParcel0.versionCode >= 2) {
                hashMap0.put("quality_signals", adRequestInfoParcel0.zzCr);
            }
            if(adRequestInfoParcel0.versionCode >= 4 && adRequestInfoParcel0.zzCu) {
                hashMap0.put("forceHttps", Boolean.valueOf(adRequestInfoParcel0.zzCu));
            }
            if(adRequestInfoParcel0.versionCode >= 4 && adRequestInfoParcel0.zzCt != null) {
                hashMap0.put("content_info", adRequestInfoParcel0.zzCt);
            }
            if(adRequestInfoParcel0.versionCode >= 5) {
                hashMap0.put("u_sd", adRequestInfoParcel0.zzCy);
                hashMap0.put("sh", adRequestInfoParcel0.zzCx);
                hashMap0.put("sw", adRequestInfoParcel0.zzCw);
            }
            else {
                hashMap0.put("u_sd", zzgk0.zzCy);
                hashMap0.put("sh", zzgk0.zzCx);
                hashMap0.put("sw", zzgk0.zzCw);
            }
            if(adRequestInfoParcel0.versionCode >= 6) {
                if(!TextUtils.isEmpty(adRequestInfoParcel0.zzCz)) {
                    try {
                        hashMap0.put("view_hierarchy", new JSONObject(adRequestInfoParcel0.zzCz));
                    }
                    catch(JSONException jSONException1) {
                        zzb.zzd("Problem serializing view hierarchy to JSON", jSONException1);
                    }
                }
                if(((Boolean)zzbz.zzun.get()).booleanValue() && adRequestInfoParcel0.zzCA) {
                    hashMap0.put("ga_hid", adRequestInfoParcel0.zzCB);
                    hashMap0.put("ga_cid", adRequestInfoParcel0.zzCC);
                }
                hashMap0.put("correlation_id", adRequestInfoParcel0.zzCD);
            }
            if(adRequestInfoParcel0.versionCode >= 7) {
                hashMap0.put("request_id", adRequestInfoParcel0.zzCE);
            }
            zzgg.zza(hashMap0, s);
            if(zzb.zzL(2)) {
                zzb.zzaB(("Ad Request JSON: " + zzo.zzbv().zzy(hashMap0).toString(2)));
            }
            return zzo.zzbv().zzy(hashMap0);
        }
        catch(JSONException jSONException0) {
            zzb.zzaC(("Problem serializing ad request to JSON: " + jSONException0.getMessage()));
            return null;
        }
    }

    private static void zza(HashMap hashMap0, Location location0) {
        HashMap hashMap1 = new HashMap();
        Float float0 = (float)(location0.getAccuracy() * 1000.0f);
        Long long0 = (long)(location0.getTime() * 1000L);
        Long long1 = (long)(location0.getLatitude() * 10000000.0);
        Long long2 = (long)(location0.getLongitude() * 10000000.0);
        hashMap1.put("radius", float0);
        hashMap1.put("lat", long1);
        hashMap1.put("long", long2);
        hashMap1.put("time", long0);
        hashMap0.put("uule", hashMap1);
    }

    private static void zza(HashMap hashMap0, AdRequestParcel adRequestParcel0) {
        String s = zzhg.zzgh();
        if(s != null) {
            hashMap0.put("abf", s);
        }
        if(adRequestParcel0.zzrX != -1L) {
            Date date0 = new Date(adRequestParcel0.zzrX);
            hashMap0.put("cust_age", zzgg.zzDJ.format(date0));
        }
        if(adRequestParcel0.extras != null) {
            hashMap0.put("extras", adRequestParcel0.extras);
        }
        if(adRequestParcel0.zzrY != -1) {
            hashMap0.put("cust_gender", adRequestParcel0.zzrY);
        }
        if(adRequestParcel0.zzrZ != null) {
            hashMap0.put("kw", adRequestParcel0.zzrZ);
        }
        if(adRequestParcel0.zzsb != -1) {
            hashMap0.put("tag_for_child_directed_treatment", adRequestParcel0.zzsb);
        }
        if(adRequestParcel0.zzsa) {
            hashMap0.put("adtest", "on");
        }
        if(adRequestParcel0.versionCode >= 2) {
            if(adRequestParcel0.zzsc) {
                hashMap0.put("d_imp_hdr", 1);
            }
            if(!TextUtils.isEmpty(adRequestParcel0.zzsd)) {
                hashMap0.put("ppid", adRequestParcel0.zzsd);
            }
            if(adRequestParcel0.zzse != null) {
                zzgg.zza(hashMap0, adRequestParcel0.zzse);
            }
        }
        if(adRequestParcel0.versionCode >= 3 && adRequestParcel0.zzsg != null) {
            hashMap0.put("url", adRequestParcel0.zzsg);
        }
        if(adRequestParcel0.versionCode >= 5) {
            if(adRequestParcel0.zzsi != null) {
                hashMap0.put("custom_targeting", adRequestParcel0.zzsi);
            }
            if(adRequestParcel0.zzsj != null) {
                hashMap0.put("category_exclusions", adRequestParcel0.zzsj);
            }
            if(adRequestParcel0.zzsk != null) {
                hashMap0.put("request_agent", adRequestParcel0.zzsk);
            }
        }
    }

    private static void zza(HashMap hashMap0, SearchAdRequestParcel searchAdRequestParcel0) {
        String s1;
        String s = null;
        if(Color.alpha(searchAdRequestParcel0.zzth) != 0) {
            hashMap0.put("acolor", zzgg.zzG(searchAdRequestParcel0.zzth));
        }
        if(Color.alpha(searchAdRequestParcel0.backgroundColor) != 0) {
            hashMap0.put("bgcolor", zzgg.zzG(searchAdRequestParcel0.backgroundColor));
        }
        if(Color.alpha(searchAdRequestParcel0.zzti) != 0 && Color.alpha(searchAdRequestParcel0.zztj) != 0) {
            hashMap0.put("gradientto", zzgg.zzG(searchAdRequestParcel0.zzti));
            hashMap0.put("gradientfrom", zzgg.zzG(searchAdRequestParcel0.zztj));
        }
        if(Color.alpha(searchAdRequestParcel0.zztk) != 0) {
            hashMap0.put("bcolor", zzgg.zzG(searchAdRequestParcel0.zztk));
        }
        hashMap0.put("bthick", Integer.toString(searchAdRequestParcel0.zztl));
        switch(searchAdRequestParcel0.zztm) {
            case 0: {
                s1 = "none";
                break;
            }
            case 1: {
                s1 = "dashed";
                break;
            }
            case 2: {
                s1 = "dotted";
                break;
            }
            case 3: {
                s1 = "solid";
                break;
            }
            default: {
                s1 = null;
            }
        }
        if(s1 != null) {
            hashMap0.put("btype", s1);
        }
        switch(searchAdRequestParcel0.zztn) {
            case 0: {
                s = "light";
                break;
            }
            case 1: {
                s = "medium";
                break;
            }
            case 2: {
                s = "dark";
            }
        }
        if(s != null) {
            hashMap0.put("callbuttoncolor", s);
        }
        if(searchAdRequestParcel0.zzto != null) {
            hashMap0.put("channel", searchAdRequestParcel0.zzto);
        }
        if(Color.alpha(searchAdRequestParcel0.zztp) != 0) {
            hashMap0.put("dcolor", zzgg.zzG(searchAdRequestParcel0.zztp));
        }
        if(searchAdRequestParcel0.zztq != null) {
            hashMap0.put("font", searchAdRequestParcel0.zztq);
        }
        if(Color.alpha(searchAdRequestParcel0.zztr) != 0) {
            hashMap0.put("hcolor", zzgg.zzG(searchAdRequestParcel0.zztr));
        }
        hashMap0.put("headersize", Integer.toString(searchAdRequestParcel0.zzts));
        if(searchAdRequestParcel0.zztt != null) {
            hashMap0.put("q", searchAdRequestParcel0.zztt);
        }
    }

    private static void zza(HashMap hashMap0, zzgk zzgk0) {
        hashMap0.put("am", zzgk0.zzEn);
        hashMap0.put("cog", zzgg.zzx(zzgk0.zzEo));
        hashMap0.put("coh", zzgg.zzx(zzgk0.zzEp));
        if(!TextUtils.isEmpty(zzgk0.zzEq)) {
            hashMap0.put("carrier", zzgk0.zzEq);
        }
        hashMap0.put("gl", zzgk0.zzEr);
        if(zzgk0.zzEs) {
            hashMap0.put("simulator", 1);
        }
        hashMap0.put("ma", zzgg.zzx(zzgk0.zzEt));
        hashMap0.put("sp", zzgg.zzx(zzgk0.zzEu));
        hashMap0.put("hl", zzgk0.zzEv);
        if(!TextUtils.isEmpty(zzgk0.zzEw)) {
            hashMap0.put("mv", zzgk0.zzEw);
        }
        hashMap0.put("muv", zzgk0.zzEx);
        if(zzgk0.zzEy != -2) {
            hashMap0.put("cnt", zzgk0.zzEy);
        }
        hashMap0.put("gnt", zzgk0.zzEz);
        hashMap0.put("pt", zzgk0.zzEA);
        hashMap0.put("rm", zzgk0.zzEB);
        hashMap0.put("riv", zzgk0.zzEC);
        Bundle bundle0 = new Bundle();
        bundle0.putInt("active_network_state", zzgk0.zzEG);
        bundle0.putBoolean("active_network_metered", zzgk0.zzEF);
        hashMap0.put("connectivity", bundle0);
        Bundle bundle1 = new Bundle();
        bundle1.putBoolean("is_charging", zzgk0.zzEE);
        bundle1.putDouble("battery_level", zzgk0.zzED);
        hashMap0.put("battery", bundle1);
    }

    private static void zza(HashMap hashMap0, String s) {
        if(s != null) {
            HashMap hashMap1 = new HashMap();
            hashMap1.put("token", s);
            hashMap0.put("pan", hashMap1);
        }
    }

    private static String zzc(NativeAdOptionsParcel nativeAdOptionsParcel0) {
        switch((nativeAdOptionsParcel0 == null ? 0 : nativeAdOptionsParcel0.zzvD)) {
            case 1: {
                return "portrait";
            }
            case 2: {
                return "landscape";
            }
            default: {
                return "any";
            }
        }
    }

    // 去混淆评级： 低(20)
    private static Integer zzx(boolean z) {
        return z ? 1 : 0;
    }
}

