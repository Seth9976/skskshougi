package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Locale;

public final class ChangesAvailableEvent implements SafeParcelable, DriveEvent {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final String zzOx;
    final ChangesAvailableOptions zzadO;

    static {
        ChangesAvailableEvent.CREATOR = new zzb();
    }

    ChangesAvailableEvent(int versionCode, String accountName, ChangesAvailableOptions changesAvailableOptions) {
        this.zzCY = versionCode;
        this.zzOx = accountName;
        this.zzadO = changesAvailableOptions;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object o) {
        return o != null && o.getClass() == this.getClass() ? o == this || zzt.equal(this.zzadO, ((ChangesAvailableEvent)o).zzadO) && zzt.equal(this.zzOx, ((ChangesAvailableEvent)o).zzOx) : false;
    }

    @Override  // com.google.android.gms.drive.events.DriveEvent
    public int getType() {
        return 4;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzadO, this.zzOx});
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", this.zzadO);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzb.zza(this, dest, flags);
    }
}

