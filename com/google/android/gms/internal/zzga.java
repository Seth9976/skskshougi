package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.internal.formats.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzga implements zza {
    private final boolean zzBY;
    private final boolean zzBZ;

    public zzga(boolean z, boolean z1) {
        this.zzBY = z;
        this.zzBZ = z1;
    }

    @Override  // com.google.android.gms.internal.zzfy$zza
    public com.google.android.gms.ads.internal.formats.zzg.zza zza(zzfy zzfy0, JSONObject jSONObject0) throws JSONException, InterruptedException, ExecutionException {
        return this.zzc(zzfy0, jSONObject0);
    }

    public zze zzc(zzfy zzfy0, JSONObject jSONObject0) throws JSONException, InterruptedException, ExecutionException {
        List list0 = zzfy0.zza(jSONObject0, "images", true, this.zzBY, this.zzBZ);
        zzhv zzhv0 = zzfy0.zza(jSONObject0, "secondary_image", false, this.zzBY);
        zzhv zzhv1 = zzfy0.zze(jSONObject0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(((zzhv)object0).get());
        }
        return new zze(jSONObject0.getString("headline"), arrayList0, jSONObject0.getString("body"), ((zzc)zzhv0.get()), jSONObject0.getString("call_to_action"), jSONObject0.getString("advertiser"), ((com.google.android.gms.ads.internal.formats.zza)zzhv1.get()));
    }
}

