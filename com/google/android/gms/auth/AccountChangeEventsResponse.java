package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.List;

public class AccountChangeEventsResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int mVersion;
    final List zzoB;

    static {
        AccountChangeEventsResponse.CREATOR = new zzc();
    }

    AccountChangeEventsResponse(int version, List list0) {
        this.mVersion = version;
        this.zzoB = (List)zzu.zzu(list0);
    }

    public AccountChangeEventsResponse(List list0) {
        this.mVersion = 1;
        this.zzoB = (List)zzu.zzu(list0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List getEvents() {
        return this.zzoB;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzc.zza(this, dest, flags);
    }
}

