package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.zzc;
import com.google.android.gms.location.zzd.zza;
import com.google.android.gms.location.zzd;

public class LocationRequestUpdateData implements SafeParcelable {
    public static final zzl CREATOR;
    PendingIntent mPendingIntent;
    private final int zzCY;
    int zzazf;
    LocationRequestInternal zzazg;
    zzd zzazh;
    zzc zzazi;

    static {
        LocationRequestUpdateData.CREATOR = new zzl();
    }

    LocationRequestUpdateData(int versionCode, int operation, LocationRequestInternal locationRequest, IBinder locationListenerBinder, PendingIntent pendingIntent, IBinder locationCallbackBinder) {
        zzc zzc0 = null;
        super();
        this.zzCY = versionCode;
        this.zzazf = operation;
        this.zzazg = locationRequest;
        this.zzazh = locationListenerBinder == null ? null : zza.zzbT(locationListenerBinder);
        this.mPendingIntent = pendingIntent;
        if(locationCallbackBinder != null) {
            zzc0 = com.google.android.gms.location.zzc.zza.zzbS(locationCallbackBinder);
        }
        this.zzazi = zzc0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzl.zza(this, parcel, flags);
    }

    public static LocationRequestUpdateData zza(LocationRequestInternal locationRequestInternal0, zzc zzc0) {
        return new LocationRequestUpdateData(1, 1, locationRequestInternal0, null, null, zzc0.asBinder());
    }

    public static LocationRequestUpdateData zza(zzc zzc0) {
        return new LocationRequestUpdateData(1, 2, null, null, null, zzc0.asBinder());
    }

    public static LocationRequestUpdateData zzb(LocationRequestInternal locationRequestInternal0, PendingIntent pendingIntent0) {
        return new LocationRequestUpdateData(1, 1, locationRequestInternal0, null, pendingIntent0, null);
    }

    public static LocationRequestUpdateData zzb(LocationRequestInternal locationRequestInternal0, zzd zzd0) {
        return new LocationRequestUpdateData(1, 1, locationRequestInternal0, zzd0.asBinder(), null, null);
    }

    public static LocationRequestUpdateData zzb(zzd zzd0) {
        return new LocationRequestUpdateData(1, 2, null, zzd0.asBinder(), null, null);
    }

    public static LocationRequestUpdateData zze(PendingIntent pendingIntent0) {
        return new LocationRequestUpdateData(1, 2, null, null, pendingIntent0, null);
    }

    IBinder zzuy() {
        return this.zzazh == null ? null : this.zzazh.asBinder();
    }

    IBinder zzuz() {
        return this.zzazi == null ? null : this.zzazi.asBinder();
    }
}

