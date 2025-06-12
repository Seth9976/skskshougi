package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.zzrb.zza;
import com.google.android.gms.internal.zzrb;
import com.google.android.gms.internal.zzrc;
import com.google.android.gms.internal.zzrm;
import java.util.ArrayList;

public class DataMapItem {
    private final Uri mUri;
    private final DataMap zzaSV;

    private DataMapItem(DataItem source) {
        this.mUri = source.getUri();
        this.zzaSV = this.zza(((DataItem)source.freeze()));
    }

    public static DataMapItem fromDataItem(DataItem dataItem) {
        if(dataItem == null) {
            throw new IllegalStateException("provided dataItem is null");
        }
        return new DataMapItem(dataItem);
    }

    public DataMap getDataMap() {
        return this.zzaSV;
    }

    public Uri getUri() {
        return this.mUri;
    }

    private DataMap zza(DataItem dataItem0) {
        if(dataItem0.getData() == null && dataItem0.getAssets().size() > 0) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn\'t made with DataMapItem.");
        }
        if(dataItem0.getData() == null) {
            return new DataMap();
        }
        try {
            ArrayList arrayList0 = new ArrayList();
            int v = dataItem0.getAssets().size();
            for(int v1 = 0; v1 < v; ++v1) {
                DataItemAsset dataItemAsset0 = (DataItemAsset)dataItem0.getAssets().get(Integer.toString(v1));
                if(dataItemAsset0 == null) {
                    throw new IllegalStateException("Cannot find DataItemAsset referenced in data at " + v1 + " for " + dataItem0);
                }
                arrayList0.add(Asset.createFromRef(dataItemAsset0.getId()));
            }
            return zzrb.zza(new zza(zzrc.zzw(dataItem0.getData()), arrayList0));
        }
        catch(zzrm | NullPointerException zzrm0) {
            Log.w("DataItem", "Unable to parse datamap from dataItem. uri=" + dataItem0.getUri() + ", data=" + Base64.encodeToString(dataItem0.getData(), 0));
            throw new IllegalStateException("Unable to parse datamap from dataItem.  uri=" + dataItem0.getUri(), zzrm0);
        }
    }
}

