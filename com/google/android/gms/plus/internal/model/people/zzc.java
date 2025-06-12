package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfO(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziE(x0);
    }

    static void zza(CoverEntity personEntity$CoverEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        Set set0 = personEntity$CoverEntity0.zzaHQ;
        if(set0.contains(1)) {
            zzb.zzc(parcel0, 1, personEntity$CoverEntity0.zzCY);
        }
        if(set0.contains(2)) {
            zzb.zza(parcel0, 2, personEntity$CoverEntity0.zzaJj, v, true);
        }
        if(set0.contains(3)) {
            zzb.zza(parcel0, 3, personEntity$CoverEntity0.zzaJk, v, true);
        }
        if(set0.contains(4)) {
            zzb.zzc(parcel0, 4, personEntity$CoverEntity0.zzaJl);
        }
        zzb.zzH(parcel0, v1);
    }

    public CoverEntity zzfO(Parcel parcel0) {
        CoverPhotoEntity personEntity$CoverEntity$CoverPhotoEntity0 = null;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        HashSet hashSet0 = new HashSet();
        CoverInfoEntity personEntity$CoverEntity$CoverInfoEntity0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    hashSet0.add(1);
                    break;
                }
                case 2: {
                    CoverInfoEntity personEntity$CoverEntity$CoverInfoEntity1 = (CoverInfoEntity)zza.zza(parcel0, v3, CoverInfoEntity.CREATOR);
                    hashSet0.add(2);
                    personEntity$CoverEntity$CoverInfoEntity0 = personEntity$CoverEntity$CoverInfoEntity1;
                    break;
                }
                case 3: {
                    CoverPhotoEntity personEntity$CoverEntity$CoverPhotoEntity1 = (CoverPhotoEntity)zza.zza(parcel0, v3, CoverPhotoEntity.CREATOR);
                    hashSet0.add(3);
                    personEntity$CoverEntity$CoverPhotoEntity0 = personEntity$CoverEntity$CoverPhotoEntity1;
                    break;
                }
                case 4: {
                    v = zza.zzg(parcel0, v3);
                    hashSet0.add(4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new CoverEntity(hashSet0, v2, personEntity$CoverEntity$CoverInfoEntity0, personEntity$CoverEntity$CoverPhotoEntity0, v);
    }

    public CoverEntity[] zziE(int v) {
        return new CoverEntity[v];
    }
}

