package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.ArrayList;
import java.util.List;

public final class ApplicationMetadata implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    String mName;
    private final int zzCY;
    String zzQv;
    List zzQw;
    String zzQx;
    Uri zzQy;
    List zzvi;

    static {
        ApplicationMetadata.CREATOR = new zza();
    }

    private ApplicationMetadata() {
        this.zzCY = 1;
        this.zzvi = new ArrayList();
        this.zzQw = new ArrayList();
    }

    ApplicationMetadata(int versionCode, String applicationId, String name, List list0, List list1, String senderAppIdentifier, Uri senderAppLaunchUrl) {
        this.zzCY = versionCode;
        this.zzQv = applicationId;
        this.mName = name;
        this.zzvi = list0;
        this.zzQw = list1;
        this.zzQx = senderAppIdentifier;
        this.zzQy = senderAppLaunchUrl;
    }

    public boolean areNamespacesSupported(List list0) {
        return this.zzQw != null && this.zzQw.containsAll(list0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(23)
    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        return obj instanceof ApplicationMetadata ? zzf.zza(this.zzQv, ((ApplicationMetadata)obj).zzQv) && zzf.zza(this.zzvi, ((ApplicationMetadata)obj).zzvi) && zzf.zza(this.mName, ((ApplicationMetadata)obj).mName) && zzf.zza(this.zzQw, ((ApplicationMetadata)obj).zzQw) && zzf.zza(this.zzQx, ((ApplicationMetadata)obj).zzQx) && zzf.zza(this.zzQy, ((ApplicationMetadata)obj).zzQy) : false;
    }

    public String getApplicationId() {
        return this.zzQv;
    }

    public List getImages() {
        return this.zzvi;
    }

    public String getName() {
        return this.mName;
    }

    public String getSenderAppIdentifier() {
        return this.zzQx;
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzCY, this.zzQv, this.mName, this.zzvi, this.zzQw, this.zzQx, this.zzQy});
    }

    public boolean isNamespaceSupported(String namespace) {
        return this.zzQw != null && this.zzQw.contains(namespace);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder().append("applicationId: ").append(this.zzQv).append(", name: ").append(this.mName).append(", images.count: ").append((this.zzvi == null ? 0 : this.zzvi.size())).append(", namespaces.count: ");
        return this.zzQw == null ? stringBuilder0.append(0).append(", senderAppIdentifier: ").append(this.zzQx).append(", senderAppLaunchUrl: ").append(this.zzQy).toString() : stringBuilder0.append(this.zzQw.size()).append(", senderAppIdentifier: ").append(this.zzQx).append(", senderAppLaunchUrl: ").append(this.zzQy).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zza.zza(this, out, flags);
    }

    public Uri zzle() {
        return this.zzQy;
    }
}

