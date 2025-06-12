package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.internal.formats.zzd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzfz implements zza {
    private final boolean zzBY;
    private final boolean zzBZ;

    public zzfz(boolean z, boolean z1) {
        this.zzBY = z;
        this.zzBZ = z1;
    }

    @Override  // com.google.android.gms.internal.zzfy$zza
    public com.google.android.gms.ads.internal.formats.zzg.zza zza(zzfy zzfy0, JSONObject jSONObject0) throws JSONException, InterruptedException, ExecutionException {
        return this.zzb(zzfy0, jSONObject0);
    }

    public zzd zzb(zzfy zzfy0, JSONObject jSONObject0) throws JSONException, InterruptedException, ExecutionException {
        List list0 = zzfy0.zza(jSONObject0, "images", true, this.zzBY, this.zzBZ);
        zzhv zzhv0 = zzfy0.zza(jSONObject0, "app_icon", true, this.zzBY);
        zzhv zzhv1 = zzfy0.zze(jSONObject0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(((zzhv)object0).get());
        }
        return new zzd(jSONObject0.getString("headline"), arrayList0, jSONObject0.getString("body"), ((zzc)zzhv0.get()), jSONObject0.getString("call_to_action"), jSONObject0.optDouble("rating", -1.0), jSONObject0.optString("store"), jSONObject0.optString("price"), ((com.google.android.gms.ads.internal.formats.zza)zzhv1.get()));
    }
}

