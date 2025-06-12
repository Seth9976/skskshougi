package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetChangesRequest implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final List zzadR;
    private final Set zzadS;
    final ChangeSequenceNumber zzafJ;
    final int zzafK;

    static {
        GetChangesRequest.CREATOR = new zzaf();
    }

    GetChangesRequest(int versionCode, ChangeSequenceNumber fromSequenceNumber, int maxResults, List list0) {
        this(versionCode, fromSequenceNumber, maxResults, list0, (list0 == null ? null : new HashSet(list0)));
    }

    private GetChangesRequest(int versionCode, ChangeSequenceNumber fromSequenceNumber, int maxResults, List list0, Set set0) {
        this.zzCY = versionCode;
        this.zzafJ = fromSequenceNumber;
        this.zzafK = maxResults;
        this.zzadR = list0;
        this.zzadS = set0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzaf.zza(this, dest, flags);
    }
}

