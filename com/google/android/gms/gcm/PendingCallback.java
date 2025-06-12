package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public class PendingCallback implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    final IBinder zzZQ;

    static {
        PendingCallback.CREATOR = new Parcelable.Creator() {
            public PendingCallback zzdW(Parcel parcel0) {
                return new PendingCallback(parcel0);
            }

            public PendingCallback[] zzgi(int v) {
                return new PendingCallback[v];
            }
        };
    }

    public PendingCallback(Parcel in) {
        this.zzZQ = in.readStrongBinder();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public IBinder getIBinder() {
        return this.zzZQ;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.zzZQ);
    }
}

