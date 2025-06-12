package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class NearbyAlertFilter extends zza implements SafeParcelable {
    public static final zzd CREATOR;
    final int zzCY;
    final List zzazs;
    private final Set zzazt;
    final List zzazu;
    final List zzazv;
    private final Set zzazw;
    private final Set zzazx;

    static {
        NearbyAlertFilter.CREATOR = new zzd();
    }

    NearbyAlertFilter(int versionCode, List list0, List list1, List list2) {
        this.zzCY = versionCode;
        this.zzazs = list1 == null ? Collections.emptyList() : Collections.unmodifiableList(list1);
        this.zzazv = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.zzazu = list0 == null ? Collections.emptyList() : Collections.unmodifiableList(list0);
        this.zzazt = NearbyAlertFilter.zzl(this.zzazs);
        this.zzazx = NearbyAlertFilter.zzl(this.zzazv);
        this.zzazw = NearbyAlertFilter.zzl(this.zzazu);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }
        return object instanceof NearbyAlertFilter ? this.zzazt.equals(((NearbyAlertFilter)object).zzazt) && this.zzazx.equals(((NearbyAlertFilter)object).zzazx) && this.zzazw.equals(((NearbyAlertFilter)object).zzazw) : false;
    }

    @Override  // com.google.android.gms.location.places.zza
    public Set getPlaceIds() {
        return this.zzazw;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzazt, this.zzazx, this.zzazw});
    }

    @Override
    public String toString() {
        com.google.android.gms.common.internal.zzt.zza zzt$zza0 = zzt.zzt(this);
        if(!this.zzazt.isEmpty()) {
            zzt$zza0.zzg("types", this.zzazt);
        }
        if(!this.zzazw.isEmpty()) {
            zzt$zza0.zzg("placeIds", this.zzazw);
        }
        if(!this.zzazx.isEmpty()) {
            zzt$zza0.zzg("requestedUserDataTypes", this.zzazx);
        }
        return zzt$zza0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzd.zza(this, parcel, flags);
    }

    // 去混淆评级： 低(20)
    public static NearbyAlertFilter zza(Collection collection0, Collection collection1, Collection collection2) {
        if((collection0 == null || collection0.isEmpty()) && (collection1 == null || collection1.isEmpty()) && (collection2 == null || collection2.isEmpty())) {
            throw new IllegalArgumentException("NearbyAlertFilters must contain at least onePlaceId, PlaceType, or UserDataType to match results with.");
        }
        return new NearbyAlertFilter(0, NearbyAlertFilter.zzc(collection0), NearbyAlertFilter.zzc(collection1), NearbyAlertFilter.zzc(collection2));
    }
}

