package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public class Command implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator CREATOR;
    private String mValue;
    private String zzKI;
    private String zzKJ;

    static {
        Command.CREATOR = new Parcelable.Creator() {
            @Deprecated
            public Command[] zzaa(int v) {
                return new Command[v];
            }

            @Deprecated
            public Command zzq(Parcel parcel0) {
                return new Command(parcel0);
            }
        };
    }

    @Deprecated
    public Command() {
    }

    @Deprecated
    Command(Parcel in) {
        this.readFromParcel(in);
    }

    @Override  // android.os.Parcelable
    @Deprecated
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.zzKI;
    }

    public String getValue() {
        return this.mValue;
    }

    @Deprecated
    private void readFromParcel(Parcel in) {
        this.zzKI = in.readString();
        this.zzKJ = in.readString();
        this.mValue = in.readString();
    }

    @Override  // android.os.Parcelable
    @Deprecated
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(this.zzKI);
        out.writeString(this.zzKJ);
        out.writeString(this.mValue);
    }
}

