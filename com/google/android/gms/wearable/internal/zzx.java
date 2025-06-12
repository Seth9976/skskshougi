package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

public class zzx implements DataItemAsset {
    private final String zzKI;
    private final String zztw;

    public zzx(DataItemAsset dataItemAsset0) {
        this.zzKI = dataItemAsset0.getId();
        this.zztw = dataItemAsset0.getDataItemKey();
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.wearable.DataItemAsset
    public String getDataItemKey() {
        return this.zztw;
    }

    @Override  // com.google.android.gms.wearable.DataItemAsset
    public String getId() {
        return this.zzKI;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("DataItemAssetEntity[");
        stringBuilder0.append("@");
        stringBuilder0.append(Integer.toHexString(this.hashCode()));
        if(this.zzKI == null) {
            stringBuilder0.append(",noid");
        }
        else {
            stringBuilder0.append(",");
            stringBuilder0.append(this.zzKI);
        }
        stringBuilder0.append(", key=");
        stringBuilder0.append(this.zztw);
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public DataItemAsset zzBd() [...] // Inlined contents
}

