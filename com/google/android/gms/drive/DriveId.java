package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.internal.zzar;
import com.google.android.gms.drive.internal.zzas;
import com.google.android.gms.drive.internal.zzx;
import com.google.android.gms.internal.zzrm;
import com.google.android.gms.internal.zzrn;

public class DriveId implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = null;
    public static final int RESOURCE_TYPE_FILE = 0;
    public static final int RESOURCE_TYPE_FOLDER = 1;
    public static final int RESOURCE_TYPE_UNKNOWN = -1;
    final int zzCY;
    final long zzacO;
    private volatile String zzacQ;
    final String zzadd;
    final long zzade;
    final int zzadf;
    private volatile String zzadg;

    static {
        DriveId.CREATOR = new zzd();
    }

    DriveId(int versionCode, String resourceId, long sqlId, long databaseInstanceId, int resourceType) {
        boolean z = false;
        super();
        this.zzacQ = null;
        this.zzadg = null;
        this.zzCY = versionCode;
        this.zzadd = resourceId;
        zzu.zzV(!"".equals(resourceId));
        if(resourceId != null || sqlId != -1L) {
            z = true;
        }
        zzu.zzV(z);
        this.zzade = sqlId;
        this.zzacO = databaseInstanceId;
        this.zzadf = resourceType;
    }

    public DriveId(String resourceId, long sqlId, long databaseInstanceId, int resourceType) {
        this(1, (resourceId == null || !resourceId.startsWith("generated-android-") ? resourceId : null), sqlId, databaseInstanceId, resourceType);
    }

    public static DriveId decodeFromString(String s) {
        zzu.zzb(s.startsWith("DriveId:"), "Invalid DriveId: " + s);
        return DriveId.zzk(Base64.decode(s.substring(8), 10));
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String encodeToString() {
        if(this.zzacQ == null) {
            this.zzacQ = "DriveId:" + Base64.encodeToString(this.zzpb(), 10);
        }
        return this.zzacQ;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof DriveId) {
            if(((DriveId)obj).zzacO != this.zzacO) {
                zzx.zzu("DriveId", "Attempt to compare invalid DriveId detected. Has local storage been cleared?");
                return false;
            }
            if(((DriveId)obj).zzade == -1L && this.zzade == -1L) {
                return ((DriveId)obj).zzadd.equals(this.zzadd);
            }
            if(this.zzadd == null || ((DriveId)obj).zzadd == null) {
                return ((DriveId)obj).zzade == this.zzade;
            }
            if(((DriveId)obj).zzade == this.zzade) {
                if(((DriveId)obj).zzadd.equals(this.zzadd)) {
                    return true;
                }
                zzx.zzu("DriveId", "Unexpected unequal resourceId for same DriveId object.");
                return false;
            }
        }
        return false;
    }

    public String getResourceId() {
        return this.zzadd;
    }

    public int getResourceType() {
        return this.zzadf;
    }

    @Override
    public int hashCode() {
        return this.zzade == -1L ? this.zzadd.hashCode() : (this.zzacO + String.valueOf(this.zzade)).hashCode();
    }

    public final String toInvariantString() {
        if(this.zzadg == null) {
            this.zzadg = Base64.encodeToString(this.zzph(), 10);
        }
        return this.zzadg;
    }

    @Override
    public String toString() {
        return this.encodeToString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzd.zza(this, out, flags);
    }

    public static DriveId zzcs(String s) {
        zzu.zzu(s);
        return new DriveId(s, -1L, -1L, -1);
    }

    static DriveId zzk(byte[] arr_b) {
        try {
            zzar zzar0 = zzar.zzl(arr_b);
            return "".equals(zzar0.zzafX) ? new DriveId(zzar0.versionCode, null, zzar0.zzafY, zzar0.zzafV, zzar0.zzafZ) : new DriveId(zzar0.versionCode, zzar0.zzafX, zzar0.zzafY, zzar0.zzafV, zzar0.zzafZ);
        }
        catch(zzrm unused_ex) {
            throw new IllegalArgumentException();
        }
    }

    final byte[] zzpb() {
        zzar zzar0 = new zzar();
        zzar0.versionCode = this.zzCY;
        zzar0.zzafX = this.zzadd == null ? "" : this.zzadd;
        zzar0.zzafY = this.zzade;
        zzar0.zzafV = this.zzacO;
        zzar0.zzafZ = this.zzadf;
        return zzrn.zzf(zzar0);
    }

    private byte[] zzph() {
        zzas zzas0 = new zzas();
        zzas0.zzafY = this.zzade;
        zzas0.zzafV = this.zzacO;
        return zzrn.zzf(zzas0);
    }
}

