package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.List;

public class PlaceUserData implements SafeParcelable {
    public static final zze CREATOR;
    final int zzCY;
    private final String zzOx;
    private final List zzaBj;
    private final List zzaBk;
    private final List zzaBl;
    private final String zzazK;

    static {
        PlaceUserData.CREATOR = new zze();
    }

    PlaceUserData(int versionCode, String accountName, String placeId, List list0, List list1, List list2) {
        this.zzCY = versionCode;
        this.zzOx = accountName;
        this.zzazK = placeId;
        this.zzaBj = list0;
        this.zzaBk = list1;
        this.zzaBl = list2;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }
        return object instanceof PlaceUserData ? this.zzOx.equals(((PlaceUserData)object).zzOx) && this.zzazK.equals(((PlaceUserData)object).zzazK) && this.zzaBj.equals(((PlaceUserData)object).zzaBj) && this.zzaBk.equals(((PlaceUserData)object).zzaBk) && this.zzaBl.equals(((PlaceUserData)object).zzaBl) : false;
    }

    public String getPlaceId() {
        return this.zzazK;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzOx, this.zzazK, this.zzaBj, this.zzaBk, this.zzaBl});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("accountName", this.zzOx).zzg("placeId", this.zzazK).zzg("testDataImpls", this.zzaBj).zzg("placeAliases", this.zzaBk).zzg("hereContents", this.zzaBl).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zze.zza(this, parcel, flags);
    }

    public String zzvb() {
        return this.zzOx;
    }

    public List zzvc() {
        return this.zzaBk;
    }

    public List zzvd() {
        return this.zzaBl;
    }

    public List zzve() {
        return this.zzaBj;
    }
}

