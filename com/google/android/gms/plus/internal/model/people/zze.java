package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfQ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziG(x0);
    }

    static void zza(CoverPhotoEntity personEntity$CoverEntity$CoverPhotoEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        Set set0 = personEntity$CoverEntity$CoverPhotoEntity0.zzaHQ;
        if(set0.contains(1)) {
            zzb.zzc(parcel0, 1, personEntity$CoverEntity$CoverPhotoEntity0.zzCY);
        }
        if(set0.contains(2)) {
            zzb.zzc(parcel0, 2, personEntity$CoverEntity$CoverPhotoEntity0.zznN);
        }
        if(set0.contains(3)) {
            zzb.zza(parcel0, 3, personEntity$CoverEntity$CoverPhotoEntity0.zzF, true);
        }
        if(set0.contains(4)) {
            zzb.zzc(parcel0, 4, personEntity$CoverEntity$CoverPhotoEntity0.zznM);
        }
        zzb.zzH(parcel0, v1);
    }

    public CoverPhotoEntity zzfQ(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        HashSet hashSet0 = new HashSet();
        String s = null;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    hashSet0.add(1);
                    break;
                }
                case 2: {
                    v2 = zza.zzg(parcel0, v4);
                    hashSet0.add(2);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v4);
                    hashSet0.add(3);
                    break;
                }
                case 4: {
                    v = zza.zzg(parcel0, v4);
                    hashSet0.add(4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new CoverPhotoEntity(hashSet0, v3, v2, s, v);
    }

    public CoverPhotoEntity[] zziG(int v) {
        return new CoverPhotoEntity[v];
    }
}

