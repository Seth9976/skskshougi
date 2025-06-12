package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class LocalContent implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private int type;
    private final int versionCode;
    private String zzaGk;

    static {
        LocalContent.CREATOR = new zzb();
    }

    private LocalContent() {
        this.versionCode = 1;
    }

    LocalContent(int versionCode, int type, String contentUri) {
        this.versionCode = versionCode;
        this.type = type;
        this.zzaGk = contentUri;
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
        return o instanceof LocalContent ? zzt.equal(this.type, ((LocalContent)o).type) && zzt.equal(this.zzaGk, ((LocalContent)o).zzaGk) : false;
    }

    public int getType() {
        return this.type;
    }

    int getVersionCode() {
        return this.versionCode;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.type, this.zzaGk});
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder().append("LocalContent[contentUri=").append(this.zzaGk).append(", type=");
        return this.type == 1 ? stringBuilder0.append("PUBLIC_CONTENT").append("]").toString() : stringBuilder0.append("APP_CONTENT").append("]").toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzb.zza(this, dest, flags);
    }

    public String zzxd() {
        return this.zzaGk;
    }
}

