package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class MessageType implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String type;
    final int versionCode;
    public final String zzaby;

    static {
        MessageType.CREATOR = new zzd();
    }

    MessageType(int versionCode, String namespace, String type) {
        this.versionCode = versionCode;
        this.zzaby = namespace;
        this.type = type;
    }

    public MessageType(String namespace, String type) {
        this(1, namespace, type);
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
        return o instanceof MessageType ? zzt.equal(this.zzaby, ((MessageType)o).zzaby) && zzt.equal(this.type, ((MessageType)o).type) : false;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzaby, this.type});
    }

    @Override
    public String toString() {
        return "namespace=" + this.zzaby + ", type=" + this.type;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzd.zza(this, dest, flags);
    }
}

