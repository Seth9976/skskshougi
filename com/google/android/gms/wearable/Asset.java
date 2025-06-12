package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class Asset implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Uri uri;
    final int zzCY;
    private String zzaSM;
    public ParcelFileDescriptor zzaSN;
    private byte[] zzauL;

    static {
        Asset.CREATOR = new zzc();
    }

    Asset(int versionCode, byte[] data, String digest, ParcelFileDescriptor fd, Uri uri) {
        this.zzCY = versionCode;
        this.zzauL = data;
        this.zzaSM = digest;
        this.zzaSN = fd;
        this.uri = uri;
    }

    public static Asset createFromBytes(byte[] assetData) {
        if(assetData == null) {
            throw new IllegalArgumentException("Asset data cannot be null");
        }
        return new Asset(1, assetData, null, null, null);
    }

    public static Asset createFromFd(ParcelFileDescriptor fd) {
        if(fd == null) {
            throw new IllegalArgumentException("Asset fd cannot be null");
        }
        return new Asset(1, null, null, fd, null);
    }

    public static Asset createFromRef(String digest) {
        if(digest == null) {
            throw new IllegalArgumentException("Asset digest cannot be null");
        }
        return new Asset(1, null, digest, null, null);
    }

    public static Asset createFromUri(Uri uri) {
        if(uri == null) {
            throw new IllegalArgumentException("Asset uri cannot be null");
        }
        return new Asset(1, null, null, null, uri);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        return o instanceof Asset ? zzt.equal(this.zzauL, ((Asset)o).zzauL) && zzt.equal(this.zzaSM, ((Asset)o).zzaSM) && zzt.equal(this.zzaSN, ((Asset)o).zzaSN) && zzt.equal(this.uri, ((Asset)o).uri) : false;
    }

    public byte[] getData() {
        return this.zzauL;
    }

    public String getDigest() {
        return this.zzaSM;
    }

    public ParcelFileDescriptor getFd() {
        return this.zzaSN;
    }

    public Uri getUri() {
        return this.uri;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzauL, this.zzaSM, this.zzaSN, this.uri});
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Asset[@");
        stringBuilder0.append(Integer.toHexString(this.hashCode()));
        if(this.zzaSM == null) {
            stringBuilder0.append(", nodigest");
        }
        else {
            stringBuilder0.append(", ");
            stringBuilder0.append(this.zzaSM);
        }
        if(this.zzauL != null) {
            stringBuilder0.append(", size=");
            stringBuilder0.append(this.zzauL.length);
        }
        if(this.zzaSN != null) {
            stringBuilder0.append(", fd=");
            stringBuilder0.append(this.zzaSN);
        }
        if(this.uri != null) {
            stringBuilder0.append(", uri=");
            stringBuilder0.append(this.uri);
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzc.zza(this, dest, flags | 1);
    }
}

