package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataItemAsset;

public class zzz extends zzc implements DataItemAsset {
    public zzz(DataHolder dataHolder0, int v) {
        super(dataHolder0, v);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzBd();
    }

    @Override  // com.google.android.gms.wearable.DataItemAsset
    public String getDataItemKey() {
        return this.getString("asset_key");
    }

    @Override  // com.google.android.gms.wearable.DataItemAsset
    public String getId() {
        return this.getString("asset_id");
    }

    public DataItemAsset zzBd() {
        return new zzx(this);
    }
}

