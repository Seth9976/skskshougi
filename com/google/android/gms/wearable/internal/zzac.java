package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class zzac extends zzc implements DataItem {
    private final int zzaoG;

    public zzac(DataHolder dataHolder0, int v, int v1) {
        super(dataHolder0, v);
        this.zzaoG = v1;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzBe();
    }

    @Override  // com.google.android.gms.wearable.DataItem
    public Map getAssets() {
        Map map0 = new HashMap(this.zzaoG);
        for(int v = 0; v < this.zzaoG; ++v) {
            zzz zzz0 = new zzz(this.zzWu, this.zzYs + v);
            if(zzz0.getDataItemKey() != null) {
                map0.put(zzz0.getDataItemKey(), zzz0);
            }
        }
        return map0;
    }

    @Override  // com.google.android.gms.wearable.DataItem
    public byte[] getData() {
        return this.getByteArray("data");
    }

    @Override  // com.google.android.gms.wearable.DataItem
    public Uri getUri() {
        return Uri.parse(this.getString("path"));
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
        byte[] arr_b = this.getData();
        Map map0 = this.getAssets();
        StringBuilder stringBuilder0 = new StringBuilder("DataItemInternal{ ");
        stringBuilder0.append("uri=" + this.getUri());
        StringBuilder stringBuilder1 = new StringBuilder().append(", dataSz=");
        String s = arr_b == null ? "null" : ((int)arr_b.length);
        stringBuilder0.append(stringBuilder1.append(s).toString());
        stringBuilder0.append(", numAssets=" + map0.size());
        if(verbose && !map0.isEmpty()) {
            stringBuilder0.append(", assets=[");
            String s1 = "";
            for(Object object0: map0.entrySet()) {
                stringBuilder0.append(s1 + ((String)((Map.Entry)object0).getKey()) + ": " + ((DataItemAsset)((Map.Entry)object0).getValue()).getId());
                s1 = ", ";
            }
            stringBuilder0.append("]");
        }
        stringBuilder0.append(" }");
        return stringBuilder0.toString();
    }

    public DataItem zzBe() {
        return new zzaa(this);
    }
}

