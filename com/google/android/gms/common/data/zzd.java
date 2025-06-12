package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class zzd extends AbstractDataBuffer {
    private static final String[] zzYu;
    private final Parcelable.Creator zzYv;

    static {
        zzd.zzYu = new String[]{"data"};
    }

    public zzd(DataHolder dataHolder0, Parcelable.Creator parcelable$Creator0) {
        super(dataHolder0);
        this.zzYv = parcelable$Creator0;
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.zzbg(x0);
    }

    public SafeParcelable zzbg(int v) {
        byte[] arr_b = this.zzWu.zzg("data", v, this.zzWu.zzbh(v));
        Parcel parcel0 = Parcel.obtain();
        parcel0.unmarshall(arr_b, 0, arr_b.length);
        parcel0.setDataPosition(0);
        SafeParcelable safeParcelable0 = (SafeParcelable)this.zzYv.createFromParcel(parcel0);
        parcel0.recycle();
        return safeParcelable0;
    }
}

