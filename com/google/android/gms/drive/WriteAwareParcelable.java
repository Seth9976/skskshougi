package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzu;

public abstract class WriteAwareParcelable implements Parcelable {
    private volatile transient boolean zzadM;

    public WriteAwareParcelable() {
        this.zzadM = false;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzu.zzU(!this.zzpt());
        this.zzadM = true;
        this.zzI(dest, flags);
    }

    protected abstract void zzI(Parcel arg1, int arg2);

    public final boolean zzpt() {
        return this.zzadM;
    }
}

