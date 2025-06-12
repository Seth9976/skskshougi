package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public final class zzdf {
    public static final zzdg zzvV;
    public static final zzdg zzvW;
    public static final zzdg zzvX;
    public static final zzdg zzvY;
    public static final zzdg zzvZ;
    public static final zzdg zzwa;
    public static final zzdg zzwb;
    public static final zzdg zzwc;
    public static final zzdg zzwd;
    public static final zzdg zzwe;
    public static final zzdg zzwf;

    static {
        zzdf.zzvV = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
            }
        };
        zzdf.zzvW = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                String s = (String)map0.get("urls");
                if(TextUtils.isEmpty(s)) {
                    zzb.zzaC("URLs missing in canOpenURLs GMSG.");
                    return;
                }
                String[] arr_s = s.split(",");
                HashMap hashMap0 = new HashMap();
                PackageManager packageManager0 = zzid0.getContext().getPackageManager();
                for(int v = 0; v < arr_s.length; ++v) {
                    String s1 = arr_s[v];
                    String[] arr_s1 = s1.split(";", 2);
                    hashMap0.put(s1, Boolean.valueOf(packageManager0.resolveActivity(new Intent((arr_s1.length <= 1 ? "android.intent.action.VIEW" : arr_s1[1].trim()), Uri.parse(arr_s1[0].trim())), 0x10000) != null));
                }
                zzid0.zzc("openableURLs", hashMap0);
            }
        };
        zzdf.zzvX = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                JSONObject jSONObject2;
                JSONArray jSONArray0;
                JSONObject jSONObject0;
                PackageManager packageManager0 = zzid0.getContext().getPackageManager();
                String s = (String)map0.get("data");
                try {
                    jSONObject0 = new JSONObject(s);
                }
                catch(JSONException unused_ex) {
                    zzid0.zzb("openableIntents", new JSONObject());
                    return;
                }
                try {
                    jSONArray0 = jSONObject0.getJSONArray("intents");
                }
                catch(JSONException unused_ex) {
                    zzid0.zzb("openableIntents", new JSONObject());
                    return;
                }
                JSONObject jSONObject1 = new JSONObject();
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    try {
                        jSONObject2 = jSONArray0.getJSONObject(v);
                    }
                    catch(JSONException jSONException0) {
                        zzb.zzb("Error parsing the intent data.", jSONException0);
                        continue;
                    }
                    String s1 = jSONObject2.optString("id");
                    String s2 = jSONObject2.optString("u");
                    String s3 = jSONObject2.optString("i");
                    String s4 = jSONObject2.optString("m");
                    String s5 = jSONObject2.optString("p");
                    String s6 = jSONObject2.optString("c");
                    jSONObject2.optString("f");
                    jSONObject2.optString("e");
                    Intent intent0 = new Intent();
                    if(!TextUtils.isEmpty(s2)) {
                        intent0.setData(Uri.parse(s2));
                    }
                    if(!TextUtils.isEmpty(s3)) {
                        intent0.setAction(s3);
                    }
                    if(!TextUtils.isEmpty(s4)) {
                        intent0.setType(s4);
                    }
                    if(!TextUtils.isEmpty(s5)) {
                        intent0.setPackage(s5);
                    }
                    if(!TextUtils.isEmpty(s6)) {
                        String[] arr_s = s6.split("/", 2);
                        if(arr_s.length == 2) {
                            intent0.setComponent(new ComponentName(arr_s[0], arr_s[1]));
                        }
                    }
                    boolean z = packageManager0.resolveActivity(intent0, 0x10000) != null;
                    try {
                        jSONObject1.put(s1, z);
                    }
                    catch(JSONException jSONException1) {
                        zzb.zzb("Error constructing openable urls response.", jSONException1);
                    }
                }
                zzid0.zzb("openableIntents", jSONObject1);
            }
        };
        zzdf.zzvY = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                Uri uri1;
                String s = (String)map0.get("u");
                if(s == null) {
                    zzb.zzaC("URL missing from click GMSG.");
                    return;
                }
                Uri uri0 = Uri.parse(s);
                try {
                    zzan zzan0 = zzid0.zzgH();
                    if(zzan0 == null || !zzan0.zzb(uri0)) {
                        goto label_12;
                    }
                    else {
                        uri1 = zzan0.zza(uri0, zzid0.getContext());
                    }
                }
                catch(zzao unused_ex) {
                    zzb.zzaC(("Unable to append parameter to URL: " + s));
                    uri1 = uri0;
                }
                new zzhp(zzid0.getContext(), zzid0.zzgI().zzGG, uri1.toString()).zzgi();
                return;
            label_12:
                uri1 = uri0;
                new zzhp(zzid0.getContext(), zzid0.zzgI().zzGG, uri1.toString()).zzgi();
            }
        };
        zzdf.zzvZ = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                zzc zzc0 = zzid0.zzgD();
                if(zzc0 != null) {
                    zzc0.close();
                    return;
                }
                zzc zzc1 = zzid0.zzgE();
                if(zzc1 != null) {
                    zzc1.close();
                    return;
                }
                zzb.zzaC("A GMSG tried to close something that wasn\'t an overlay.");
            }
        };
        zzdf.zzwa = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                zzid0.zzC("1".equals(map0.get("custom_close")));
            }
        };
        zzdf.zzwb = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                String s = (String)map0.get("u");
                if(s == null) {
                    zzb.zzaC("URL missing from httpTrack GMSG.");
                    return;
                }
                new zzhp(zzid0.getContext(), zzid0.zzgI().zzGG, s).zzgi();
            }
        };
        zzdf.zzwc = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                zzb.zzaA(("Received log message: " + ((String)map0.get("string"))));
            }
        };
        zzdf.zzwd = new zzdg() {
            @Override  // com.google.android.gms.internal.zzdg
            public void zza(zzid zzid0, Map map0) {
                String s = (String)map0.get("tx");
                String s1 = (String)map0.get("ty");
                String s2 = (String)map0.get("td");
                try {
                    int v = Integer.parseInt(s);
                    int v1 = Integer.parseInt(s1);
                    int v2 = Integer.parseInt(s2);
                    zzan zzan0 = zzid0.zzgH();
                    if(zzan0 != null) {
                        zzan0.zzab().zza(v, v1, v2);
                    }
                }
                catch(NumberFormatException unused_ex) {
                    zzb.zzaC("Could not parse touch parameters from gmsg.");
                }
            }
        };
        zzdf.zzwe = new zzdo();
        zzdf.zzwf = new zzds();
    }
}

