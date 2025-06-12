package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzdl implements zzdg {
    final HashMap zzwv;

    public zzdl() {
        this.zzwv = new HashMap();
    }

    public Future zzU(String s) {
        Future future0 = new zzhs();
        this.zzwv.put(s, future0);
        return future0;
    }

    public void zzV(String s) {
        zzhs zzhs0 = (zzhs)this.zzwv.get(s);
        if(zzhs0 == null) {
            zzb.zzaz("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if(!zzhs0.isDone()) {
            zzhs0.cancel(true);
        }
        this.zzwv.remove(s);
    }

    @Override  // com.google.android.gms.internal.zzdg
    public void zza(zzid zzid0, Map map0) {
        this.zze(((String)map0.get("request_id")), ((String)map0.get("fetched_ad")));
    }

    public void zze(String s, String s1) {
        zzb.zzay("Received ad from the cache.");
        zzhs zzhs0 = (zzhs)this.zzwv.get(s);
        if(zzhs0 == null) {
            zzb.zzaz("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            zzhs0.zzf(new JSONObject(s1));
        }
        catch(JSONException jSONException0) {
            zzb.zzb("Failed constructing JSON object from value passed from javascript", jSONException0);
            zzhs0.zzf(null);
        }
        finally {
            this.zzwv.remove(s);
        }
    }
}

