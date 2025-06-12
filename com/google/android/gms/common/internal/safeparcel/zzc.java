package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzu;

public final class zzc {
    public static SafeParcelable zza(Intent intent0, String s, Parcelable.Creator parcelable$Creator0) {
        byte[] arr_b = intent0.getByteArrayExtra(s);
        return arr_b == null ? null : zzc.zza(arr_b, parcelable$Creator0);
    }

    public static SafeParcelable zza(byte[] arr_b, Parcelable.Creator parcelable$Creator0) {
        zzu.zzu(parcelable$Creator0);
        Parcel parcel0 = Parcel.obtain();
        parcel0.unmarshall(arr_b, 0, arr_b.length);
        parcel0.setDataPosition(0);
        SafeParcelable safeParcelable0 = (SafeParcelable)parcelable$Creator0.createFromParcel(parcel0);
        parcel0.recycle();
        return safeParcelable0;
    }

    public static void zza(SafeParcelable safeParcelable0, Intent intent0, String s) {
        intent0.putExtra(s, zzc.zza(safeParcelable0));
    }

    public static byte[] zza(SafeParcelable safeParcelable0) {
        Parcel parcel0 = Parcel.obtain();
        safeParcelable0.writeToParcel(parcel0, 0);
        byte[] arr_b = parcel0.marshall();
        parcel0.recycle();
        return arr_b;
    }
}

