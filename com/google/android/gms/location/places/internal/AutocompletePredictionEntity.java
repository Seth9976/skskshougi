package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.location.places.AutocompletePrediction.Substring;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.List;

public class AutocompletePredictionEntity implements SafeParcelable, AutocompletePrediction {
    public static class SubstringEntity implements SafeParcelable, Substring {
        public static final Parcelable.Creator CREATOR;
        final int mLength;
        final int mOffset;
        final int zzCY;

        static {
            SubstringEntity.CREATOR = new zzu();
        }

        public SubstringEntity(int versionCode, int offset, int length) {
            this.zzCY = versionCode;
            this.mOffset = offset;
            this.mLength = length;
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
            return object instanceof SubstringEntity ? zzt.equal(this.mOffset, ((SubstringEntity)object).mOffset) && zzt.equal(this.mLength, ((SubstringEntity)object).mLength) : false;
        }

        @Override  // com.google.android.gms.location.places.AutocompletePrediction$Substring
        public int getLength() {
            return this.mLength;
        }

        @Override  // com.google.android.gms.location.places.AutocompletePrediction$Substring
        public int getOffset() {
            return this.mOffset;
        }

        @Override
        public int hashCode() {
            return zzt.hashCode(new Object[]{this.mOffset, this.mLength});
        }

        @Override
        public String toString() {
            return zzt.zzt(this).zzg("offset", this.mOffset).zzg("length", this.mLength).toString();
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            zzu.zza(this, parcel, flags);
        }
    }

    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final List zzaAe;
    final int zzaAf;
    final String zzakM;
    final String zzazK;
    final List zzazo;

    static {
        AutocompletePredictionEntity.CREATOR = new zza();
    }

    AutocompletePredictionEntity(int versionCode, String description, String placeId, List list0, List list1, int personalizationType) {
        this.zzCY = versionCode;
        this.zzakM = description;
        this.zzazK = placeId;
        this.zzazo = list0;
        this.zzaAe = list1;
        this.zzaAf = personalizationType;
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
        return object instanceof AutocompletePredictionEntity ? zzt.equal(this.zzakM, ((AutocompletePredictionEntity)object).zzakM) && zzt.equal(this.zzazK, ((AutocompletePredictionEntity)object).zzazK) && zzt.equal(this.zzazo, ((AutocompletePredictionEntity)object).zzazo) && zzt.equal(this.zzaAe, ((AutocompletePredictionEntity)object).zzaAe) && zzt.equal(this.zzaAf, ((AutocompletePredictionEntity)object).zzaAf) : false;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.location.places.AutocompletePrediction
    public String getDescription() {
        return this.zzakM;
    }

    @Override  // com.google.android.gms.location.places.AutocompletePrediction
    public List getMatchedSubstrings() {
        return this.zzaAe;
    }

    @Override  // com.google.android.gms.location.places.AutocompletePrediction
    public String getPlaceId() {
        return this.zzazK;
    }

    @Override  // com.google.android.gms.location.places.AutocompletePrediction
    public List getPlaceTypes() {
        return this.zzazo;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzakM, this.zzazK, this.zzazo, this.zzaAe, this.zzaAf});
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("description", this.zzakM).zzg("placeId", this.zzazK).zzg("placeTypes", this.zzazo).zzg("substrings", this.zzaAe).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zza.zza(this, parcel, flags);
    }

    public static AutocompletePredictionEntity zza(String s, String s1, List list0, List list1, int v) {
        return new AutocompletePredictionEntity(0, ((String)com.google.android.gms.common.internal.zzu.zzu(s)), s1, list0, list1, v);
    }

    public AutocompletePrediction zzuL() [...] // Inlined contents
}

