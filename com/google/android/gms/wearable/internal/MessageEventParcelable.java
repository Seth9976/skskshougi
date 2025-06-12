package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.MessageEvent;

public class MessageEventParcelable implements SafeParcelable, MessageEvent {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    private final String zzaTQ;
    private final int zzacR;
    private final byte[] zzauL;
    private final String zzazL;

    static {
        MessageEventParcelable.CREATOR = new zzaw();
    }

    MessageEventParcelable(int versionCode, int requestId, String path, byte[] data, String source) {
        this.zzCY = versionCode;
        this.zzacR = requestId;
        this.zzaTQ = path;
        this.zzauL = data;
        this.zzazL = source;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.wearable.MessageEvent
    public byte[] getData() {
        return this.zzauL;
    }

    @Override  // com.google.android.gms.wearable.MessageEvent
    public String getPath() {
        return this.zzaTQ;
    }

    @Override  // com.google.android.gms.wearable.MessageEvent
    public int getRequestId() {
        return this.zzacR;
    }

    @Override  // com.google.android.gms.wearable.MessageEvent
    public String getSourceNodeId() {
        return this.zzazL;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder().append("MessageEventParcelable[").append(this.zzacR).append(",").append(this.zzaTQ).append(", size=");
        return this.zzauL == null ? stringBuilder0.append("null").append("]").toString() : stringBuilder0.append(((int)this.zzauL.length)).append("]").toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzaw.zza(this, dest, flags);
    }
}

