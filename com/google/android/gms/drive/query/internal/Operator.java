package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class Operator implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final String mTag;
    final int zzCY;
    public static final Operator zzaih;
    public static final Operator zzaii;
    public static final Operator zzaij;
    public static final Operator zzaik;
    public static final Operator zzail;
    public static final Operator zzaim;
    public static final Operator zzain;
    public static final Operator zzaio;
    public static final Operator zzaip;

    static {
        Operator.CREATOR = new zzn();
        Operator.zzaih = new Operator("=");
        Operator.zzaii = new Operator("<");
        Operator.zzaij = new Operator("<=");
        Operator.zzaik = new Operator(">");
        Operator.zzail = new Operator(">=");
        Operator.zzaim = new Operator("and");
        Operator.zzain = new Operator("or");
        Operator.zzaio = new Operator("not");
        Operator.zzaip = new Operator("contains");
    }

    Operator(int versionCode, String tag) {
        this.zzCY = versionCode;
        this.mTag = tag;
    }

    private Operator(String tag) {
        this(1, tag);
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
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        return this.mTag == null ? ((Operator)obj).mTag == null : this.mTag.equals(((Operator)obj).mTag);
    }

    public String getTag() {
        return this.mTag;
    }

    @Override
    public int hashCode() {
        return this.mTag == null ? 0x1F : this.mTag.hashCode() + 0x1F;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzn.zza(this, out, flags);
    }
}

