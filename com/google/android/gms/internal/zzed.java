package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzed {
    public List zza(JSONObject jSONObject0, String s) throws JSONException {
        JSONArray jSONArray0 = jSONObject0.optJSONArray(s);
        if(jSONArray0 != null) {
            ArrayList arrayList0 = new ArrayList(jSONArray0.length());
            for(int v = 0; v < jSONArray0.length(); ++v) {
                arrayList0.add(jSONArray0.getString(v));
            }
            return Collections.unmodifiableList(arrayList0);
        }
        return null;
    }

    public void zza(Context context0, String s, zzha zzha0, String s1, boolean z, List list0) {
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                String s2 = zzo.zzby().getSessionId();
                String s3 = ((String)object0).replaceAll("@gw_adlocid@", s1).replaceAll("@gw_adnetrefresh@", (z ? "1" : "0")).replaceAll("@gw_qdata@", zzha0.zzFm.zzxI).replaceAll("@gw_sdkver@", s).replaceAll("@gw_sessid@", s2).replaceAll("@gw_seqnum@", zzha0.zzCp);
                if(zzha0.zzxZ != null) {
                    s3 = s3.replaceAll("@gw_adnetid@", zzha0.zzxZ.zzxt).replaceAll("@gw_allocid@", zzha0.zzxZ.zzxv);
                }
                new zzhp(context0, s, s3).zzgi();
            }
        }
    }
}

