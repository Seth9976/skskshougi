package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Arrays;

public class ViewableItem implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int versionCode;
    private String[] zzaGo;

    static {
        ViewableItem.CREATOR = new zzf();
    }

    private ViewableItem() {
        this.versionCode = 1;
    }

    ViewableItem(int versionCode, String[] uris) {
        this.versionCode = versionCode;
        this.zzaGo = uris;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        return o instanceof ViewableItem ? zzt.equal(this.zzaGo, ((ViewableItem)o).zzaGo) : false;
    }

    int getVersionCode() {
        return this.versionCode;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzaGo});
    }

    @Override
    public String toString() {
        return "ViewableItem[uris=" + Arrays.toString(this.zzaGo) + "]";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzf.zza(this, dest, flags);
    }

    public String[] zzxg() {
        return this.zzaGo;
    }
}

