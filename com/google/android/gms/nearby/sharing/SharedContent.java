package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Arrays;

public class SharedContent implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int versionCode;
    @Deprecated
    private String zzaGl;
    private ViewableItem[] zzaGm;
    private LocalContent[] zzaGn;

    static {
        SharedContent.CREATOR = new zzc();
    }

    private SharedContent() {
        this.versionCode = 2;
    }

    SharedContent(int versionCode, String uri, ViewableItem[] viewableItems, LocalContent[] localContents) {
        this.versionCode = versionCode;
        this.zzaGl = uri;
        this.zzaGm = viewableItems;
        this.zzaGn = localContents;
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
        return o instanceof SharedContent ? zzt.equal(this.zzaGm, ((SharedContent)o).zzaGm) && zzt.equal(this.zzaGn, ((SharedContent)o).zzaGn) && zzt.equal(this.zzaGl, ((SharedContent)o).zzaGl) : false;
    }

    public String getUri() {
        return this.zzaGl;
    }

    int getVersionCode() {
        return this.versionCode;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzaGm, this.zzaGn, this.zzaGl});
    }

    @Override
    public String toString() {
        return "SharedContent[viewableItems=" + Arrays.toString(this.zzaGm) + ", localContents=" + Arrays.toString(this.zzaGn) + "]";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzc.zza(this, dest, flags);
    }

    public ViewableItem[] zzxe() {
        return this.zzaGm;
    }

    public LocalContent[] zzxf() {
        return this.zzaGn;
    }
}

