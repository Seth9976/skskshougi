package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class PlaceFilter extends zza implements SafeParcelable {
    @Deprecated
    public static final class com.google.android.gms.location.places.PlaceFilter.zza {
        private boolean zzazC;
        private Collection zzazD;
        private Collection zzazE;
        private String[] zzazF;

        private com.google.android.gms.location.places.PlaceFilter.zza() {
            this.zzazD = null;
            this.zzazC = false;
            this.zzazE = null;
            this.zzazF = null;
        }

        com.google.android.gms.location.places.PlaceFilter.zza(com.google.android.gms.location.places.PlaceFilter.1 placeFilter$10) {
        }

        public PlaceFilter zzuK() {
            List list0 = null;
            ArrayList arrayList0 = this.zzazD == null ? null : new ArrayList(this.zzazD);
            ArrayList arrayList1 = this.zzazE == null ? null : new ArrayList(this.zzazE);
            if(this.zzazF != null) {
                list0 = Arrays.asList(this.zzazF);
            }
            return new PlaceFilter(arrayList0, this.zzazC, list0, arrayList1);
        }
    }

    public static final zzf CREATOR;
    final int zzCY;
    final boolean zzazC;
    final List zzazs;
    private final Set zzazt;
    final List zzazu;
    final List zzazv;
    private final Set zzazw;
    private final Set zzazx;

    static {
        PlaceFilter.CREATOR = new zzf();
    }

    public PlaceFilter() {
        this(false, null);
    }

    PlaceFilter(int versionCode, List list0, boolean requireOpenNow, List list1, List list2) {
        this.zzCY = versionCode;
        this.zzazs = list0 == null ? Collections.emptyList() : Collections.unmodifiableList(list0);
        this.zzazC = requireOpenNow;
        this.zzazv = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.zzazu = list1 == null ? Collections.emptyList() : Collections.unmodifiableList(list1);
        this.zzazt = PlaceFilter.zzl(this.zzazs);
        this.zzazx = PlaceFilter.zzl(this.zzazv);
        this.zzazw = PlaceFilter.zzl(this.zzazu);
    }

    public PlaceFilter(Collection collection0, boolean requireOpenNow, Collection collection1, Collection collection2) {
        this(0, PlaceFilter.zzc(collection0), requireOpenNow, PlaceFilter.zzc(collection1), PlaceFilter.zzc(collection2));
    }

    public PlaceFilter(boolean requireOpenNow, Collection collection0) {
        this(null, requireOpenNow, collection0, null);
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
        return object instanceof PlaceFilter ? this.zzazt.equals(((PlaceFilter)object).zzazt) && this.zzazC == ((PlaceFilter)object).zzazC && this.zzazx.equals(((PlaceFilter)object).zzazx) && this.zzazw.equals(((PlaceFilter)object).zzazw) : false;
    }

    @Override  // com.google.android.gms.location.places.zza
    public Set getPlaceIds() {
        return this.zzazw;
    }

    public Set getPlaceTypes() {
        return this.zzazt;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzazt, Boolean.valueOf(this.zzazC), this.zzazx, this.zzazw});
    }

    @Override  // com.google.android.gms.location.places.zza
    public boolean isRestrictedToPlacesOpenNow() {
        return this.zzazC;
    }

    @Override
    public String toString() {
        com.google.android.gms.common.internal.zzt.zza zzt$zza0 = zzt.zzt(this);
        if(!this.zzazt.isEmpty()) {
            zzt$zza0.zzg("types", this.zzazt);
        }
        zzt$zza0.zzg("requireOpenNow", Boolean.valueOf(this.zzazC));
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
        zzf.zza(this, parcel, flags);
    }

    public Set zzuI() {
        return this.zzazx;
    }

    @Deprecated
    public static PlaceFilter zzuJ() {
        return new com.google.android.gms.location.places.PlaceFilter.zza(null).zzuK();
    }

    class com.google.android.gms.location.places.PlaceFilter.1 {
    }

}

