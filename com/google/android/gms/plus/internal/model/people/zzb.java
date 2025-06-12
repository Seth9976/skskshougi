package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.HashSet;
import java.util.Set;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfN(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziD(x0);
    }

    static void zza(AgeRangeEntity personEntity$AgeRangeEntity0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        Set set0 = personEntity$AgeRangeEntity0.zzaHQ;
        if(set0.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, personEntity$AgeRangeEntity0.zzCY);
        }
        if(set0.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 2, personEntity$AgeRangeEntity0.zzaJh);
        }
        if(set0.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 3, personEntity$AgeRangeEntity0.zzaJi);
        }
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public AgeRangeEntity zzfN(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        HashSet hashSet0 = new HashSet();
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
                    v = zza.zzg(parcel0, v4);
                    hashSet0.add(3);
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
        return new AgeRangeEntity(hashSet0, v3, v2, v);
    }

    public AgeRangeEntity[] zziD(int v) {
        return new AgeRangeEntity[v];
    }
}

