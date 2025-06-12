package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ParcelableCollaborator implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final String zzEO;
    final String zzFE;
    final String zzadI;
    final boolean zzais;
    final boolean zzait;
    final String zzaiu;
    final String zzaiv;

    static {
        ParcelableCollaborator.CREATOR = new zzp();
    }

    ParcelableCollaborator(int versionCode, boolean isMe, boolean isAnonymous, String sessionId, String userId, String displayName, String color, String photoUrl) {
        this.zzCY = versionCode;
        this.zzais = isMe;
        this.zzait = isAnonymous;
        this.zzFE = sessionId;
        this.zzEO = userId;
        this.zzadI = displayName;
        this.zzaiu = color;
        this.zzaiv = photoUrl;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        return obj instanceof ParcelableCollaborator ? this.zzFE.equals(((ParcelableCollaborator)obj).zzFE) : false;
    }

    @Override
    public int hashCode() {
        return this.zzFE.hashCode();
    }

    @Override
    public String toString() {
        return "Collaborator [isMe=" + this.zzais + ", isAnonymous=" + this.zzait + ", sessionId=" + this.zzFE + ", userId=" + this.zzEO + ", displayName=" + this.zzadI + ", color=" + this.zzaiu + ", photoUrl=" + this.zzaiv + "]";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzp.zza(this, dest, flags);
    }
}

