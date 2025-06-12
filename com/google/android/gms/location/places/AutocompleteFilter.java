package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt.zza;
import com.google.android.gms.common.internal.zzt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AutocompleteFilter implements SafeParcelable {
    public static final zzc CREATOR;
    final int zzCY;
    final boolean zzazr;
    final List zzazs;
    private final Set zzazt;

    static {
        AutocompleteFilter.CREATOR = new zzc();
    }

    AutocompleteFilter(int versionCode, boolean restrictToPlaces, Collection collection0) {
        this.zzCY = versionCode;
        this.zzazr = restrictToPlaces;
        List list0 = collection0 == null ? Collections.emptyList() : new ArrayList(collection0);
        this.zzazs = list0;
        if(this.zzazs.isEmpty()) {
            this.zzazt = Collections.emptySet();
            return;
        }
        this.zzazt = Collections.unmodifiableSet(new HashSet(this.zzazs));
    }

    public static AutocompleteFilter create(Collection collection0) {
        return AutocompleteFilter.zza(true, collection0);
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
        return object instanceof AutocompleteFilter ? this.zzazt.equals(((AutocompleteFilter)object).zzazt) && this.zzazr == ((AutocompleteFilter)object).zzazr : false;
    }

    public Set getPlaceTypes() {
        return this.zzazt;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{Boolean.valueOf(this.zzazr), this.zzazt});
    }

    @Override
    public String toString() {
        zza zzt$zza0 = zzt.zzt(this);
        if(!this.zzazr) {
            zzt$zza0.zzg("restrictedToPlaces", Boolean.valueOf(this.zzazr));
        }
        zzt$zza0.zzg("placeTypes", this.zzazt);
        return zzt$zza0.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzc.zza(this, parcel, flags);
    }

    public static AutocompleteFilter zza(boolean z, Collection collection0) {
        return new AutocompleteFilter(0, z, collection0);
    }

    public boolean zzuE() {
        return this.zzazr;
    }
}

