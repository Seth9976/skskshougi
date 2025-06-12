package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzu;

public final class RealTimeMessage implements Parcelable {
    public static final Parcelable.Creator CREATOR = null;
    public static final int RELIABLE = 1;
    public static final int UNRELIABLE;
    private final String zzauq;
    private final byte[] zzaur;
    private final int zzaus;

    static {
        RealTimeMessage.CREATOR = new Parcelable.Creator() {
            public RealTimeMessage zzdL(Parcel parcel0) {
                return new RealTimeMessage(parcel0, null);
            }

            public RealTimeMessage[] zzfU(int v) {
                return new RealTimeMessage[v];
            }
        };
    }

    private RealTimeMessage(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    RealTimeMessage(Parcel x0, com.google.android.gms.games.multiplayer.realtime.RealTimeMessage.1 x1) {
        this(x0);
    }

    public RealTimeMessage(String senderParticipantId, byte[] messageData, int isReliable) {
        this.zzauq = (String)zzu.zzu(senderParticipantId);
        this.zzaur = (byte[])((byte[])zzu.zzu(messageData)).clone();
        this.zzaus = isReliable;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getMessageData() {
        return this.zzaur;
    }

    public String getSenderParticipantId() {
        return this.zzauq;
    }

    public boolean isReliable() {
        return this.zzaus == 1;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flag) {
        parcel.writeString(this.zzauq);
        parcel.writeByteArray(this.zzaur);
        parcel.writeInt(this.zzaus);
    }
}

