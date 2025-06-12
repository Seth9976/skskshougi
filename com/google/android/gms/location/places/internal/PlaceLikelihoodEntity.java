package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;

public class PlaceLikelihoodEntity implements SafeParcelable, PlaceLikelihood {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final PlaceImpl zzaAK;
    final float zzaAL;

    static {
        PlaceLikelihoodEntity.CREATOR = new zzl();
    }

    PlaceLikelihoodEntity(int versionCode, PlaceImpl place, float likelihood) {
        this.zzCY = versionCode;
        this.zzaAK = place;
        this.zzaAL = likelihood;
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
        return object instanceof PlaceLikelihoodEntity ? this.zzaAK.equals(((PlaceLikelihoodEntity)object).zzaAK) && this.zzaAL == ((PlaceLikelihoodEntity)object).zzaAL : false;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.location.places.PlaceLikelihood
    public float getLikelihood() {
        return this.zzaAL;
    }

    @Override  // com.google.android.gms.location.places.PlaceLikelihood
    public Place getPlace() {
        return this.zzaAK;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzaAK, this.zzaAL});
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("place", this.zzaAK).zzg("likelihood", this.zzaAL).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zzl.zza(this, parcel, flags);
    }

    public static PlaceLikelihoodEntity zza(PlaceImpl placeImpl0, float f) {
        return new PlaceLikelihoodEntity(0, ((PlaceImpl)zzu.zzu(placeImpl0)), f);
    }

    public PlaceLikelihood zzuY() [...] // Inlined contents
}

