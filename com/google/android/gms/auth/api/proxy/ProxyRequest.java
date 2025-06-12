package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ProxyRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int versionCode;
    public static final int zzPh;
    public static final int zzPi;
    public static final int zzPj;
    public static final int zzPk;
    public static final int zzPl;
    public static final int zzPm;
    public static final int zzPn;
    public static final int zzPo;
    public static final int zzPp;
    public final int zzPq;
    public final long zzPr;
    public final byte[] zzPs;
    Bundle zzPt;
    public final String zzzf;

    static {
        ProxyRequest.CREATOR = new zzb();
        ProxyRequest.zzPh = 0;
        ProxyRequest.zzPi = 1;
        ProxyRequest.zzPj = 2;
        ProxyRequest.zzPk = 3;
        ProxyRequest.zzPl = 4;
        ProxyRequest.zzPm = 5;
        ProxyRequest.zzPn = 6;
        ProxyRequest.zzPo = 7;
        ProxyRequest.zzPp = 7;
    }

    ProxyRequest(int version, String googleUrl, int httpMethod, long timeoutMillis, byte[] body, Bundle headers) {
        this.versionCode = version;
        this.zzzf = googleUrl;
        this.zzPq = httpMethod;
        this.zzPr = timeoutMillis;
        this.zzPs = body;
        this.zzPt = headers;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public String toString() {
        return "ProxyRequest[ url: " + this.zzzf + ", method: " + this.zzPq + " ]";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzb.zza(this, parcel, flags);
    }
}

