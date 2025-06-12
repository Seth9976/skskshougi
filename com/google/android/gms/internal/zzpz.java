package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzbg;
import com.google.android.gms.tagmanager.zzdf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class zzpz {
    static zza zza(int v, JSONArray jSONArray0, zza[] arr_zzag$zza, Set set0) throws zzg, JSONException {
        int v1 = 0;
        if(set0.contains(v)) {
            zzpz.zzeT(("Value cycle detected. Current value reference: " + v + "." + "  Previous value references: " + set0 + "."));
        }
        Object object0 = zzpz.zza(jSONArray0, v, "values");
        if(arr_zzag$zza[v] != null) {
            return arr_zzag$zza[v];
        }
        set0.add(v);
        zza zzag$zza0 = new zza();
        if(object0 instanceof JSONArray) {
            zzag$zza0.type = 2;
            zzag$zza0.zzjb = true;
            zzag$zza0.zziS = new zza[((JSONArray)object0).length()];
            while(v1 < zzag$zza0.zziS.length) {
                zza[] arr_zzag$zza1 = zzag$zza0.zziS;
                arr_zzag$zza1[v1] = zzpz.zza(((JSONArray)object0).getInt(v1), jSONArray0, arr_zzag$zza, set0);
                ++v1;
            }
        }
        else if(object0 instanceof JSONObject) {
            JSONArray jSONArray1 = ((JSONObject)object0).optJSONArray("escaping");
            if(jSONArray1 != null) {
                zzag$zza0.zzja = new int[jSONArray1.length()];
                for(int v2 = 0; v2 < zzag$zza0.zzja.length; ++v2) {
                    int[] arr_v = zzag$zza0.zzja;
                    arr_v[v2] = jSONArray1.getInt(v2);
                }
            }
            if(((JSONObject)object0).has("function_id")) {
                zzag$zza0.type = 5;
                zzag$zza0.zziW = ((JSONObject)object0).getString("function_id");
            }
            else if(((JSONObject)object0).has("macro_reference")) {
                zzag$zza0.type = 4;
                zzag$zza0.zzjb = true;
                zzag$zza0.zziV = zzdf.zzg(zzpz.zza(((JSONObject)object0).getInt("macro_reference"), jSONArray0, arr_zzag$zza, set0));
            }
            else if(((JSONObject)object0).has("template_token")) {
                zzag$zza0.type = 7;
                zzag$zza0.zzjb = true;
                JSONArray jSONArray2 = ((JSONObject)object0).getJSONArray("template_token");
                zzag$zza0.zziZ = new zza[jSONArray2.length()];
                while(v1 < zzag$zza0.zziZ.length) {
                    zza[] arr_zzag$zza2 = zzag$zza0.zziZ;
                    arr_zzag$zza2[v1] = zzpz.zza(jSONArray2.getInt(v1), jSONArray0, arr_zzag$zza, set0);
                    ++v1;
                }
            }
            else {
                zzag$zza0.type = 3;
                zzag$zza0.zzjb = true;
                int v3 = ((JSONObject)object0).length();
                zzag$zza0.zziT = new zza[v3];
                zzag$zza0.zziU = new zza[v3];
                Iterator iterator0 = ((JSONObject)object0).keys();
                for(int v4 = 0; iterator0.hasNext(); ++v4) {
                    Object object1 = iterator0.next();
                    zza[] arr_zzag$zza3 = zzag$zza0.zziT;
                    arr_zzag$zza3[v4] = zzpz.zza(((int)new Integer(((String)object1))), jSONArray0, arr_zzag$zza, set0);
                    zza[] arr_zzag$zza4 = zzag$zza0.zziU;
                    arr_zzag$zza4[v4] = zzpz.zza(((JSONObject)object0).getInt(((String)object1)), jSONArray0, arr_zzag$zza, set0);
                }
            }
        }
        else if(object0 instanceof String) {
            zzag$zza0.zziR = (String)object0;
            zzag$zza0.type = 1;
        }
        else if(object0 instanceof Boolean) {
            zzag$zza0.zziY = ((Boolean)object0).booleanValue();
            zzag$zza0.type = 8;
        }
        else if(object0 instanceof Integer) {
            zzag$zza0.zziX = (long)(((int)(((Integer)object0))));
            zzag$zza0.type = 6;
        }
        else {
            zzpz.zzeT(("Invalid value type: " + object0));
        }
        arr_zzag$zza[v] = zzag$zza0;
        set0.remove(v);
        return zzag$zza0;
    }

    static com.google.android.gms.internal.zzqf.zza zza(JSONObject jSONObject0, JSONArray jSONArray0, JSONArray jSONArray1, zza[] arr_zzag$zza, int v) throws zzg, JSONException {
        zzb zzqf$zzb0 = com.google.android.gms.internal.zzqf.zza.zzAm();
        JSONArray jSONArray2 = jSONObject0.getJSONArray("property");
        for(int v1 = 0; v1 < jSONArray2.length(); ++v1) {
            JSONObject jSONObject1 = (JSONObject)zzpz.zza(jSONArray0, jSONArray2.getInt(v1), "properties");
            String s = (String)zzpz.zza(jSONArray1, jSONObject1.getInt("key"), "key");
            zza zzag$zza0 = (zza)zzpz.zza(arr_zzag$zza, jSONObject1.getInt("value"), "value");
            if("push_after_evaluate".equals(s)) {
                zzqf$zzb0.zzq(zzag$zza0);
            }
            else {
                zzqf$zzb0.zzb(s, zzag$zza0);
            }
        }
        return zzqf$zzb0.zzAo();
    }

    static zze zza(JSONObject jSONObject0, List list0, List list1, List list2, zza[] arr_zzag$zza) throws JSONException {
        zzf zzqf$zzf0 = zze.zzAt();
        JSONArray jSONArray0 = jSONObject0.optJSONArray("positive_predicate");
        JSONArray jSONArray1 = jSONObject0.optJSONArray("negative_predicate");
        JSONArray jSONArray2 = jSONObject0.optJSONArray("add_tag");
        JSONArray jSONArray3 = jSONObject0.optJSONArray("remove_tag");
        JSONArray jSONArray4 = jSONObject0.optJSONArray("add_tag_rule_name");
        JSONArray jSONArray5 = jSONObject0.optJSONArray("remove_tag_rule_name");
        JSONArray jSONArray6 = jSONObject0.optJSONArray("add_macro");
        JSONArray jSONArray7 = jSONObject0.optJSONArray("remove_macro");
        JSONArray jSONArray8 = jSONObject0.optJSONArray("add_macro_rule_name");
        JSONArray jSONArray9 = jSONObject0.optJSONArray("remove_macro_rule_name");
        if(jSONArray0 != null) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                zzqf$zzf0.zzd(((com.google.android.gms.internal.zzqf.zza)list2.get(jSONArray0.getInt(v))));
            }
        }
        if(jSONArray1 != null) {
            for(int v1 = 0; v1 < jSONArray1.length(); ++v1) {
                zzqf$zzf0.zze(((com.google.android.gms.internal.zzqf.zza)list2.get(jSONArray1.getInt(v1))));
            }
        }
        if(jSONArray2 != null) {
            for(int v2 = 0; v2 < jSONArray2.length(); ++v2) {
                zzqf$zzf0.zzf(((com.google.android.gms.internal.zzqf.zza)list0.get(jSONArray2.getInt(v2))));
            }
        }
        if(jSONArray3 != null) {
            for(int v3 = 0; v3 < jSONArray3.length(); ++v3) {
                zzqf$zzf0.zzg(((com.google.android.gms.internal.zzqf.zza)list0.get(jSONArray3.getInt(v3))));
            }
        }
        if(jSONArray4 != null) {
            for(int v4 = 0; v4 < jSONArray4.length(); ++v4) {
                zzqf$zzf0.zzeW(arr_zzag$zza[jSONArray4.getInt(v4)].zziR);
            }
        }
        if(jSONArray5 != null) {
            for(int v5 = 0; v5 < jSONArray5.length(); ++v5) {
                zzqf$zzf0.zzeX(arr_zzag$zza[jSONArray5.getInt(v5)].zziR);
            }
        }
        if(jSONArray6 != null) {
            for(int v6 = 0; v6 < jSONArray6.length(); ++v6) {
                zzqf$zzf0.zzh(((com.google.android.gms.internal.zzqf.zza)list1.get(jSONArray6.getInt(v6))));
            }
        }
        if(jSONArray7 != null) {
            for(int v7 = 0; v7 < jSONArray7.length(); ++v7) {
                zzqf$zzf0.zzi(((com.google.android.gms.internal.zzqf.zza)list1.get(jSONArray7.getInt(v7))));
            }
        }
        if(jSONArray8 != null) {
            for(int v8 = 0; v8 < jSONArray8.length(); ++v8) {
                zzqf$zzf0.zzeY(arr_zzag$zza[jSONArray8.getInt(v8)].zziR);
            }
        }
        if(jSONArray9 != null) {
            for(int v9 = 0; v9 < jSONArray9.length(); ++v9) {
                zzqf$zzf0.zzeZ(arr_zzag$zza[jSONArray9.getInt(v9)].zziR);
            }
        }
        return zzqf$zzf0.zzAE();
    }

    private static Object zza(JSONArray jSONArray0, int v, String s) throws zzg {
        if(v >= 0 && v < jSONArray0.length()) {
            try {
                return jSONArray0.get(v);
            }
            catch(JSONException unused_ex) {
            }
        }
        zzpz.zzeT(("Index out of bounds detected: " + v + " in " + s));
        return null;
    }

    private static Object zza(Object[] arr_object, int v, String s) throws zzg {
        if(v < 0 || v >= arr_object.length) {
            zzpz.zzeT(("Index out of bounds detected: " + v + " in " + s));
        }
        return arr_object[v];
    }

    static List zza(JSONArray jSONArray0, JSONArray jSONArray1, JSONArray jSONArray2, zza[] arr_zzag$zza) throws JSONException, zzg {
        List list0 = new ArrayList();
        for(int v = 0; v < jSONArray0.length(); ++v) {
            list0.add(zzpz.zza(jSONArray0.getJSONObject(v), jSONArray1, jSONArray2, arr_zzag$zza, v));
        }
        return list0;
    }

    private static void zzeT(String s) throws zzg {
        zzbg.zzaz(s);
        throw new zzg(s);
    }

    static zzc zzey(String s) throws JSONException, zzg {
        JSONObject jSONObject0 = new JSONObject(s);
        Object object0 = jSONObject0.get("resource");
        if(!(object0 instanceof JSONObject)) {
            throw new zzg("Resource map not found");
        }
        zzd zzqf$zzd0 = zzc.zzAp();
        zza[] arr_zzag$zza = zzpz.zzj(((JSONObject)object0));
        JSONArray jSONArray0 = ((JSONObject)object0).getJSONArray("properties");
        JSONArray jSONArray1 = ((JSONObject)object0).getJSONArray("key");
        List list0 = zzpz.zza(((JSONObject)object0).getJSONArray("tags"), jSONArray0, jSONArray1, arr_zzag$zza);
        List list1 = zzpz.zza(((JSONObject)object0).getJSONArray("predicates"), jSONArray0, jSONArray1, arr_zzag$zza);
        List list2 = zzpz.zza(((JSONObject)object0).getJSONArray("macros"), jSONArray0, jSONArray1, arr_zzag$zza);
        for(Object object1: list2) {
            zzqf$zzd0.zzc(((com.google.android.gms.internal.zzqf.zza)object1));
        }
        JSONArray jSONArray2 = ((JSONObject)object0).getJSONArray("rules");
        for(int v = 0; v < jSONArray2.length(); ++v) {
            zzqf$zzd0.zzb(zzpz.zza(jSONArray2.getJSONObject(v), list0, list2, list1, arr_zzag$zza));
        }
        zzqf$zzd0.zzeV("1");
        zzqf$zzd0.zzjb(1);
        jSONObject0.optJSONArray("runtime");
        return zzqf$zzd0.zzAs();
    }

    static zza[] zzj(JSONObject jSONObject0) throws JSONException, zzg {
        Object object0 = jSONObject0.opt("values");
        if(!(object0 instanceof JSONArray)) {
            throw new zzg("Missing Values list");
        }
        zza[] arr_zzag$zza = new zza[((JSONArray)object0).length()];
        for(int v = 0; v < arr_zzag$zza.length; ++v) {
            zzpz.zza(v, ((JSONArray)object0), arr_zzag$zza, new HashSet(0));
        }
        return arr_zzag$zza;
    }
}

