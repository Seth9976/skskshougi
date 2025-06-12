package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public final class zzdy {
    public final List zzxD;
    public final long zzxE;
    public final List zzxF;
    public final List zzxG;
    public final List zzxH;
    public final String zzxI;
    public final long zzxJ;
    public final String zzxK;
    public final int zzxL;
    public int zzxM;
    public int zzxN;

    public zzdy(String s) throws JSONException {
        JSONObject jSONObject0 = new JSONObject(s);
        if(zzb.zzL(2)) {
            zzb.zzaB(("Mediation Response JSON: " + jSONObject0.toString(2)));
        }
        JSONArray jSONArray0 = jSONObject0.getJSONArray("ad_networks");
        ArrayList arrayList0 = new ArrayList(jSONArray0.length());
        int v = -1;
        for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
            zzdx zzdx0 = new zzdx(jSONArray0.getJSONObject(v1));
            arrayList0.add(zzdx0);
            if(v < 0 && this.zza(zzdx0)) {
                v = v1;
            }
        }
        this.zzxM = v;
        this.zzxN = jSONArray0.length();
        this.zzxD = Collections.unmodifiableList(arrayList0);
        this.zzxI = jSONObject0.getString("qdata");
        JSONObject jSONObject1 = jSONObject0.optJSONObject("settings");
        if(jSONObject1 != null) {
            this.zzxE = jSONObject1.optLong("ad_network_timeout_millis", -1L);
            this.zzxF = zzo.zzbG().zza(jSONObject1, "click_urls");
            this.zzxG = zzo.zzbG().zza(jSONObject1, "imp_urls");
            this.zzxH = zzo.zzbG().zza(jSONObject1, "nofill_urls");
            long v2 = jSONObject1.optLong("refresh", -1L);
            this.zzxJ = v2 <= 0L ? -1L : v2 * 1000L;
            JSONArray jSONArray1 = jSONObject1.optJSONArray("rewards");
            if(jSONArray1 == null || jSONArray1.length() == 0) {
                this.zzxK = null;
                this.zzxL = 0;
                return;
            }
            this.zzxK = jSONArray1.getJSONObject(0).optString("rb_type");
            this.zzxL = jSONArray1.getJSONObject(0).optInt("rb_amount");
            return;
        }
        this.zzxE = -1L;
        this.zzxF = null;
        this.zzxG = null;
        this.zzxH = null;
        this.zzxJ = -1L;
        this.zzxK = null;
        this.zzxL = 0;
    }

    private boolean zza(zzdx zzdx0) {
        for(Object object0: zzdx0.zzxu) {
            if(((String)object0).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

