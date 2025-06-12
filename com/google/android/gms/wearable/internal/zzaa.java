package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class zzaa implements DataItem {
    private Uri mUri;
    private Map zzaUo;
    private byte[] zzauL;

    public zzaa(DataItem dataItem0) {
        this.mUri = dataItem0.getUri();
        this.zzauL = dataItem0.getData();
        HashMap hashMap0 = new HashMap();
        for(Object object0: dataItem0.getAssets().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(map$Entry0.getKey() != null) {
                hashMap0.put(map$Entry0.getKey(), ((DataItemAsset)map$Entry0.getValue()).freeze());
            }
        }
        this.zzaUo = Collections.unmodifiableMap(hashMap0);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.wearable.DataItem
    public Map getAssets() {
        return this.zzaUo;
    }

    @Override  // com.google.android.gms.wearable.DataItem
    public byte[] getData() {
        return this.zzauL;
    }

    @Override  // com.google.android.gms.wearable.DataItem
    public Uri getUri() {
        return this.mUri;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override  // com.google.android.gms.wearable.DataItem
    public DataItem setData(byte[] data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return this.toString(Log.isLoggable("DataItem", 3));
    }

    public String toString(boolean verbose) {
        StringBuilder stringBuilder0 = new StringBuilder("DataItemEntity{ ");
        stringBuilder0.append("uri=" + this.mUri);
        StringBuilder stringBuilder1 = new StringBuilder().append(", dataSz=");
        String s = this.zzauL == null ? "null" : ((int)this.zzauL.length);
        stringBuilder0.append(stringBuilder1.append(s).toString());
        stringBuilder0.append(", numAssets=" + this.zzaUo.size());
        if(verbose && !this.zzaUo.isEmpty()) {
            stringBuilder0.append(", assets=[");
            String s1 = "";
            for(Object object0: this.zzaUo.entrySet()) {
                stringBuilder0.append(s1 + ((String)((Map.Entry)object0).getKey()) + ": " + ((DataItemAsset)((Map.Entry)object0).getValue()).getId());
                s1 = ", ";
            }
            stringBuilder0.append("]");
        }
        stringBuilder0.append(" }");
        return stringBuilder0.toString();
    }

    public DataItem zzBe() [...] // Inlined contents
}

