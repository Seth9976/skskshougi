package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzgd
public class zzgb implements zza {
    private final boolean zzBY;

    public zzgb(boolean z) {
        this.zzBY = z;
    }

    private void zza(zzfy zzfy0, JSONObject jSONObject0, zzkw zzkw0) throws JSONException {
        zzkw0.put(jSONObject0.getString("name"), zzfy0.zza(jSONObject0, "image_value", this.zzBY));
    }

    private void zza(JSONObject jSONObject0, zzkw zzkw0) throws JSONException {
        zzkw0.put(jSONObject0.getString("name"), jSONObject0.getString("string_value"));
    }

    @Override  // com.google.android.gms.internal.zzfy$zza
    public com.google.android.gms.ads.internal.formats.zzg.zza zza(zzfy zzfy0, JSONObject jSONObject0) throws JSONException, InterruptedException, ExecutionException {
        return this.zzd(zzfy0, jSONObject0);
    }

    private zzkw zzc(zzkw zzkw0) throws InterruptedException, ExecutionException {
        zzkw zzkw1 = new zzkw();
        for(int v = 0; v < zzkw0.size(); ++v) {
            zzkw1.put(zzkw0.keyAt(v), ((Future)zzkw0.valueAt(v)).get());
        }
        return zzkw1;
    }

    public zzf zzd(zzfy zzfy0, JSONObject jSONObject0) throws JSONException, InterruptedException, ExecutionException {
        zzkw zzkw0 = new zzkw();
        zzkw zzkw1 = new zzkw();
        zzhv zzhv0 = zzfy0.zze(jSONObject0);
        JSONArray jSONArray0 = jSONObject0.getJSONArray("custom_assets");
        for(int v = 0; v < jSONArray0.length(); ++v) {
            JSONObject jSONObject1 = jSONArray0.getJSONObject(v);
            String s = jSONObject1.getString("type");
            if("string".equals(s)) {
                this.zza(jSONObject1, zzkw1);
            }
            else if("image".equals(s)) {
                this.zza(zzfy0, jSONObject1, zzkw0);
            }
            else {
                zzb.zzaC(("Unknown custom asset type: " + s));
            }
        }
        return new zzf(jSONObject0.getString("custom_template_id"), this.zzc(zzkw0), zzkw1, ((com.google.android.gms.ads.internal.formats.zza)zzhv0.get()));
    }
}

