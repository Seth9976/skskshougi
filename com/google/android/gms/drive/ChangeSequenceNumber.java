package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.internal.zzaq;
import com.google.android.gms.internal.zzrn;

public class ChangeSequenceNumber implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final long zzacN;
    final long zzacO;
    final long zzacP;
    private volatile String zzacQ;

    static {
        ChangeSequenceNumber.CREATOR = new zza();
    }

    ChangeSequenceNumber(int versionCode, long sequenceNumber, long databaseInstanceId, long accountId) {
        boolean z = true;
        super();
        this.zzacQ = null;
        zzu.zzV(sequenceNumber != -1L);
        zzu.zzV(databaseInstanceId != -1L);
        if(accountId == -1L) {
            z = false;
        }
        zzu.zzV(z);
        this.zzCY = versionCode;
        this.zzacN = sequenceNumber;
        this.zzacO = databaseInstanceId;
        this.zzacP = accountId;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String encodeToString() {
        if(this.zzacQ == null) {
            this.zzacQ = "ChangeSequenceNumber:" + Base64.encodeToString(this.zzpb(), 10);
        }
        return this.zzacQ;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ChangeSequenceNumber ? ((ChangeSequenceNumber)obj).zzacO == this.zzacO && ((ChangeSequenceNumber)obj).zzacP == this.zzacP && ((ChangeSequenceNumber)obj).zzacN == this.zzacN : false;
    }

    @Override
    public int hashCode() {
        return (this.zzacN + String.valueOf(this.zzacO) + this.zzacP).hashCode();
    }

    @Override
    public String toString() {
        return this.encodeToString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zza.zza(this, out, flags);
    }

    final byte[] zzpb() {
        zzaq zzaq0 = new zzaq();
        zzaq0.versionCode = this.zzCY;
        zzaq0.zzafU = this.zzacN;
        zzaq0.zzafV = this.zzacO;
        zzaq0.zzafW = this.zzacP;
        return zzrn.zzf(zzaq0);
    }
}

