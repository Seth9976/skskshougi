package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.DataItemAsset;

public class DataItemAssetParcelable implements SafeParcelable, DataItemAsset {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    private final String zzKI;
    private final String zztw;

    static {
        DataItemAssetParcelable.CREATOR = new zzy();
    }

    DataItemAssetParcelable(int versionCode, String id, String key) {
        this.zzCY = versionCode;
        this.zzKI = id;
        this.zztw = key;
    }

    public DataItemAssetParcelable(DataItemAsset value) {
        this.zzCY = 1;
        this.zzKI = (String)zzu.zzu(value.getId());
        this.zztw = (String)zzu.zzu(value.getDataItemKey());
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
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
        stringBuilder0.append("DataItemAssetParcelable[");
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

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzy.zza(this, dest, flags);
    }

    public DataItemAsset zzBd() [...] // Inlined contents
}

