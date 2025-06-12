package com.google.android.gms.wearable;

import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Random;

public class PutDataRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = null;
    public static final String WEAR_URI_SCHEME = "wear";
    private final Uri mUri;
    final int zzCY;
    private static final Random zzaSX;
    private final Bundle zzaSY;
    private byte[] zzauL;

    static {
        PutDataRequest.CREATOR = new zzf();
        PutDataRequest.zzaSX = new SecureRandom();
    }

    private PutDataRequest(int versionCode, Uri uri) {
        this(versionCode, uri, new Bundle(), null);
    }

    PutDataRequest(int versionCode, Uri uri, Bundle assets, byte[] data) {
        this.zzCY = versionCode;
        this.mUri = uri;
        this.zzaSY = assets;
        this.zzaSY.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        this.zzauL = data;
    }

    public static PutDataRequest create(String path) {
        return PutDataRequest.zzn(PutDataRequest.zzfg(path));
    }

    public static PutDataRequest createFromDataItem(DataItem source) {
        PutDataRequest putDataRequest0 = PutDataRequest.zzn(source.getUri());
        for(Object object0: source.getAssets().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((DataItemAsset)map$Entry0.getValue()).getId() == null) {
                throw new IllegalStateException("Cannot create an asset for a put request without a digest: " + ((String)map$Entry0.getKey()));
            }
            putDataRequest0.putAsset(((String)map$Entry0.getKey()), Asset.createFromRef(((DataItemAsset)map$Entry0.getValue()).getId()));
        }
        putDataRequest0.setData(source.getData());
        return putDataRequest0;
    }

    public static PutDataRequest createWithAutoAppendedId(String pathPrefix) {
        StringBuilder stringBuilder0 = new StringBuilder(pathPrefix);
        if(!pathPrefix.endsWith("/")) {
            stringBuilder0.append("/");
        }
        stringBuilder0.append("PN").append(PutDataRequest.zzaSX.nextLong());
        return new PutDataRequest(1, PutDataRequest.zzfg(stringBuilder0.toString()));
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Asset getAsset(String key) {
        return (Asset)this.zzaSY.getParcelable(key);
    }

    public Map getAssets() {
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.zzaSY.keySet()) {
            hashMap0.put(((String)object0), ((Asset)this.zzaSY.getParcelable(((String)object0))));
        }
        return Collections.unmodifiableMap(hashMap0);
    }

    public byte[] getData() {
        return this.zzauL;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public boolean hasAsset(String key) {
        return this.zzaSY.containsKey(key);
    }

    public PutDataRequest putAsset(String key, Asset value) {
        zzu.zzu(key);
        zzu.zzu(value);
        this.zzaSY.putParcelable(key, value);
        return this;
    }

    public PutDataRequest removeAsset(String key) {
        this.zzaSY.remove(key);
        return this;
    }

    public PutDataRequest setData(byte[] data) {
        this.zzauL = data;
        return this;
    }

    @Override
    public String toString() {
        return this.toString(Log.isLoggable("DataMap", 3));
    }

    public String toString(boolean verbose) {
        StringBuilder stringBuilder0 = new StringBuilder("PutDataRequest[");
        StringBuilder stringBuilder1 = new StringBuilder().append("dataSz=");
        String s = this.zzauL == null ? "null" : ((int)this.zzauL.length);
        stringBuilder0.append(stringBuilder1.append(s).toString());
        stringBuilder0.append(", numAssets=" + this.zzaSY.size());
        stringBuilder0.append(", uri=" + this.mUri);
        if(!verbose) {
            stringBuilder0.append("]");
            return stringBuilder0.toString();
        }
        stringBuilder0.append("]\n  assets: ");
        for(Object object0: this.zzaSY.keySet()) {
            stringBuilder0.append("\n    " + ((String)object0) + ": " + this.zzaSY.getParcelable(((String)object0)));
        }
        stringBuilder0.append("\n  ]");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzf.zza(this, dest, flags);
    }

    public Bundle zzAR() {
        return this.zzaSY;
    }

    private static Uri zzfg(String s) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        }
        if(!s.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        if(s.startsWith("//")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        return new Uri.Builder().scheme("wear").path(s).build();
    }

    public static PutDataRequest zzn(Uri uri0) {
        return new PutDataRequest(1, uri0);
    }
}

