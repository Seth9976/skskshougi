package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Query;

public class QueryRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final Query zzagu;

    static {
        QueryRequest.CREATOR = new zzbk();
    }

    QueryRequest(int versionCode, Query query) {
        this.zzCY = versionCode;
        this.zzagu = query;
    }

    public QueryRequest(Query query) {
        this(1, query);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzbk.zza(this, dest, flags);
    }
}

