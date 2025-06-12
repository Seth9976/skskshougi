package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public class Permission implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    private int zzadA;
    private String zzadB;
    private String zzadC;
    private int zzadD;
    private boolean zzadE;
    private String zzadz;

    static {
        Permission.CREATOR = new zzh();
    }

    Permission(int versionCode, String accountIdentifier, int accountType, String accountDisplayName, String photoLink, int role, boolean isLinkRequired) {
        this.zzCY = versionCode;
        this.zzadz = accountIdentifier;
        this.zzadA = accountType;
        this.zzadB = accountDisplayName;
        this.zzadC = photoLink;
        this.zzadD = role;
        this.zzadE = isLinkRequired;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object o) {
        return o != null && o.getClass() == this.getClass() ? o == this || zzt.equal(this.zzadz, ((Permission)o).zzadz) && this.zzadA == ((Permission)o).zzadA && this.zzadD == ((Permission)o).zzadD && this.zzadE == ((Permission)o).zzadE : false;
    }

    public int getRole() {
        return Permission.zzca(this.zzadD) ? this.zzadD : -1;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzadz, this.zzadA, this.zzadD, Boolean.valueOf(this.zzadE)});
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzh.zza(this, dest, flags);
    }

    public static boolean zzbZ(int v) {
        return v == 0x100 || v == 0x101 || v == 0x102;
    }

    public static boolean zzca(int v) {
        return v == 0 || v == 1 || v == 2 || v == 3;
    }

    public String zzpo() {
        return Permission.zzbZ(this.zzadA) ? this.zzadz : null;
    }

    public int zzpp() {
        return Permission.zzbZ(this.zzadA) ? this.zzadA : -1;
    }

    public String zzpq() {
        return this.zzadB;
    }

    public String zzpr() {
        return this.zzadC;
    }

    public boolean zzps() {
        return this.zzadE;
    }
}

