package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.zzrb.zza;
import com.google.android.gms.internal.zzrb;
import com.google.android.gms.internal.zzrn;

public class PutDataMapRequest {
    private final DataMap zzaSV;
    private final PutDataRequest zzaSW;

    private PutDataMapRequest(PutDataRequest putDataRequest, DataMap dataMap) {
        this.zzaSW = putDataRequest;
        this.zzaSV = new DataMap();
        if(dataMap != null) {
            this.zzaSV.putAll(dataMap);
        }
    }

    public PutDataRequest asPutDataRequest() {
        zza zzrb$zza0 = zzrb.zza(this.zzaSV);
        byte[] arr_b = zzrn.zzf(zzrb$zza0.zzaVj);
        this.zzaSW.setData(arr_b);
        int v = zzrb$zza0.zzaVk.size();
        for(int v1 = 0; v1 < v; ++v1) {
            String s = Integer.toString(v1);
            Asset asset0 = (Asset)zzrb$zza0.zzaVk.get(v1);
            if(s == null) {
                throw new IllegalStateException("asset key cannot be null: " + asset0);
            }
            if(asset0 == null) {
                throw new IllegalStateException("asset cannot be null: key=" + s);
            }
            if(Log.isLoggable("DataMap", 3)) {
                Log.d("DataMap", "asPutDataRequest: adding asset: " + s + " " + asset0);
            }
            this.zzaSW.putAsset(s, asset0);
        }
        return this.zzaSW;
    }

    public static PutDataMapRequest create(String path) {
        return new PutDataMapRequest(PutDataRequest.create(path), null);
    }

    public static PutDataMapRequest createFromDataMapItem(DataMapItem source) {
        return new PutDataMapRequest(PutDataRequest.zzn(source.getUri()), source.getDataMap());
    }

    public static PutDataMapRequest createWithAutoAppendedId(String pathPrefix) {
        return new PutDataMapRequest(PutDataRequest.createWithAutoAppendedId(pathPrefix), null);
    }

    public DataMap getDataMap() {
        return this.zzaSV;
    }

    public Uri getUri() {
        return this.zzaSW.getUri();
    }
}

