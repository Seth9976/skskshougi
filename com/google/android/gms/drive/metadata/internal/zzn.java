package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.zzb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;

public class zzn extends zzb {
    public zzn(String s, int v) {
        super(s, Collections.singleton(s), Collections.emptySet(), v);
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected void zza(Bundle bundle0, Object object0) {
        this.zza(bundle0, ((Collection)object0));
    }

    protected void zza(Bundle bundle0, Collection collection0) {
        bundle0.putStringArrayList(this.getName(), new ArrayList(collection0));
    }

    @Override  // com.google.android.gms.drive.metadata.zzb
    protected Object zzc(DataHolder dataHolder0, int v, int v1) {
        return this.zzd(dataHolder0, v, v1);
    }

    public static final Collection zzcx(String s) throws JSONException {
        if(s == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        JSONArray jSONArray0 = new JSONArray(s);
        for(int v = 0; v < jSONArray0.length(); ++v) {
            arrayList0.add(jSONArray0.getString(v));
        }
        return Collections.unmodifiableCollection(arrayList0);
    }

    @Override  // com.google.android.gms.drive.metadata.zzb
    protected Collection zzd(DataHolder dataHolder0, int v, int v1) {
        try {
            return zzn.zzcx(dataHolder0.zzd(this.getName(), v, v1));
        }
        catch(JSONException jSONException0) {
            throw new IllegalStateException("DataHolder supplied invalid JSON", jSONException0);
        }
    }

    @Override  // com.google.android.gms.drive.metadata.zza
    protected Object zzj(Bundle bundle0) {
        return this.zzo(bundle0);
    }

    protected Collection zzo(Bundle bundle0) {
        return bundle0.getStringArrayList(this.getName());
    }
}

