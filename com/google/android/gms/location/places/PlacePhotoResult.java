package com.google.android.gms.location.places;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class PlacePhotoResult implements Result, SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final Bitmap mBitmap;
    final int zzCY;
    private final Status zzOt;
    final BitmapTeleporter zzazJ;

    static {
        PlacePhotoResult.CREATOR = new zzj();
    }

    PlacePhotoResult(int versionCode, Status status, BitmapTeleporter teleporter) {
        this.zzCY = versionCode;
        this.zzOt = status;
        this.zzazJ = teleporter;
        if(this.zzazJ != null) {
            this.mBitmap = teleporter.zznc();
            return;
        }
        this.mBitmap = null;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("status", this.zzOt).zzg("bitmap", this.mBitmap).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzj.zza(this, parcel, flags);
    }
}

