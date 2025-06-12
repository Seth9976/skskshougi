package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DriveSpace implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final String mName;
    final int zzCY;
    public static final DriveSpace zzadi;
    public static final DriveSpace zzadj;
    public static final DriveSpace zzadk;
    public static final Set zzadl;
    public static final String zzadm;

    static {
        DriveSpace.CREATOR = new zzg();
        DriveSpace.zzadi = new DriveSpace("DRIVE");
        DriveSpace.zzadj = new DriveSpace("APP_DATA_FOLDER");
        DriveSpace.zzadk = new DriveSpace("PHOTOS");
        DriveSpace.zzadl = Collections.unmodifiableSet(new HashSet(Arrays.asList(new DriveSpace[]{DriveSpace.zzadi, DriveSpace.zzadj, DriveSpace.zzadk})));
        DriveSpace.zzadm = TextUtils.join(",", DriveSpace.zzadl.toArray());
    }

    DriveSpace(int versionCode, String name) {
        this.zzCY = versionCode;
        this.mName = (String)zzu.zzu(name);
    }

    private DriveSpace(String name) {
        this(1, name);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return o != null && o.getClass() == DriveSpace.class ? this.mName.equals(((DriveSpace)o).mName) : false;
    }

    public String getName() {
        return this.mName;
    }

    @Override
    public int hashCode() {
        return 0x4A54C0DE ^ this.mName.hashCode();
    }

    @Override
    public String toString() {
        return this.mName;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzg.zza(this, out, flags);
    }
}

