package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public final class zzdx {
    public final String zzxA;
    public final List zzxB;
    public final List zzxC;
    public final String zzxs;
    public final String zzxt;
    public final List zzxu;
    public final String zzxv;
    public final String zzxw;
    public final List zzxx;
    public final List zzxy;
    public final String zzxz;

    public zzdx(JSONObject jSONObject0) throws JSONException {
        String s = null;
        super();
        this.zzxt = jSONObject0.getString("id");
        JSONArray jSONArray0 = jSONObject0.getJSONArray("adapters");
        ArrayList arrayList0 = new ArrayList(jSONArray0.length());
        for(int v = 0; v < jSONArray0.length(); ++v) {
            arrayList0.add(jSONArray0.getString(v));
        }
        this.zzxu = Collections.unmodifiableList(arrayList0);
        this.zzxv = jSONObject0.optString("allocation_id", null);
        this.zzxx = zzo.zzbG().zza(jSONObject0, "clickurl");
        this.zzxy = zzo.zzbG().zza(jSONObject0, "imp_urls");
        this.zzxB = zzo.zzbG().zza(jSONObject0, "video_start_urls");
        this.zzxC = zzo.zzbG().zza(jSONObject0, "video_complete_urls");
        JSONObject jSONObject1 = jSONObject0.optJSONObject("ad");
        this.zzxs = jSONObject1 == null ? null : jSONObject1.toString();
        JSONObject jSONObject2 = jSONObject0.optJSONObject("data");
        this.zzxz = jSONObject2 == null ? null : jSONObject2.toString();
        this.zzxA = jSONObject2 == null || jSONObject2.isNull("equivalent_ad_network_id") ? this.zzxt : jSONObject2.optString("equivalent_ad_network_id", this.zzxt);
        if(jSONObject2 != null) {
            s = jSONObject2.optString("class_name");
        }
        this.zzxw = s;
    }
}

