package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class DataItemParcelable implements SafeParcelable, DataItem {
    public static final Parcelable.Creator CREATOR;
    private final Uri mUri;
    final int zzCY;
    private final Map zzaUo;
    private byte[] zzauL;

    static {
        DataItemParcelable.CREATOR = new zzab();
    }

    DataItemParcelable(int versionCode, Uri uri, Bundle assetBundle, byte[] data) {
        this.zzCY = versionCode;
        this.mUri = uri;
        HashMap hashMap0 = new HashMap();
        assetBundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for(Object object0: assetBundle.keySet()) {
            hashMap0.put(((String)object0), ((DataItemAssetParcelable)assetBundle.getParcelable(((String)object0))));
        }
        this.zzaUo = hashMap0;
        this.zzauL = data;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
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
    public DataItem setData(byte[] x0) {
        return this.zzv(x0);
    }

    @Override
    public String toString() {
        return this.toString(Log.isLoggable("DataItem", 3));
    }

    public String toString(boolean verbose) {
        StringBuilder stringBuilder0 = new StringBuilder("DataItemParcelable[");
        stringBuilder0.append("@");
        stringBuilder0.append(Integer.toHexString(this.hashCode()));
        StringBuilder stringBuilder1 = new StringBuilder().append(",dataSz=");
        String s = this.zzauL == null ? "null" : ((int)this.zzauL.length);
        stringBuilder0.append(stringBuilder1.append(s).toString());
        stringBuilder0.append(", numAssets=" + this.zzaUo.size());
        stringBuilder0.append(", uri=" + this.mUri);
        if(!verbose) {
            stringBuilder0.append("]");
            return stringBuilder0.toString();
        }
        stringBuilder0.append("]\n  assets: ");
        for(Object object0: this.zzaUo.keySet()) {
            stringBuilder0.append("\n    " + ((String)object0) + ": " + this.zzaUo.get(((String)object0)));
        }
        stringBuilder0.append("\n  ]");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzab.zza(this, dest, flags);
    }

    public Bundle zzAR() {
        Bundle bundle0 = new Bundle();
        bundle0.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for(Object object0: this.zzaUo.entrySet()) {
            bundle0.putParcelable(((String)((Map.Entry)object0).getKey()), new DataItemAssetParcelable(((DataItemAsset)((Map.Entry)object0).getValue())));
        }
        return bundle0;
    }

    public DataItemParcelable zzBf() [...] // Inlined contents

    public DataItemParcelable zzv(byte[] arr_b) {
        this.zzauL = arr_b;
        return this;
    }
}

