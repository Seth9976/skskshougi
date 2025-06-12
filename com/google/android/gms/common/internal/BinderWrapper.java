package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private IBinder zzZQ;

    static {
        BinderWrapper.CREATOR = new Parcelable.Creator() {
            public BinderWrapper zzV(Parcel parcel0) {
                return new BinderWrapper(parcel0, null);
            }

            public BinderWrapper[] zzbq(int v) {
                return new BinderWrapper[v];
            }
        };
    }

    public BinderWrapper() {
        this.zzZQ = null;
    }

    public BinderWrapper(IBinder binder) {
        this.zzZQ = binder;
    }

    private BinderWrapper(Parcel in) {
        this.zzZQ = in.readStrongBinder();
    }

    BinderWrapper(Parcel x0, com.google.android.gms.common.internal.BinderWrapper.1 x1) {
        this(x0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStrongBinder(this.zzZQ);
    }
}

