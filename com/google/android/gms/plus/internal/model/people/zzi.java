package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfU(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziK(x0);
    }

    static void zza(PlacesLivedEntity personEntity$PlacesLivedEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        Set set0 = personEntity$PlacesLivedEntity0.zzaHQ;
        if(set0.contains(1)) {
            zzb.zzc(parcel0, 1, personEntity$PlacesLivedEntity0.zzCY);
        }
        if(set0.contains(2)) {
            zzb.zza(parcel0, 2, personEntity$PlacesLivedEntity0.zzaJu);
        }
        if(set0.contains(3)) {
            zzb.zza(parcel0, 3, personEntity$PlacesLivedEntity0.mValue, true);
        }
        zzb.zzH(parcel0, v1);
    }

    public PlacesLivedEntity zzfU(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        HashSet hashSet0 = new HashSet();
        String s = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    hashSet0.add(1);
                    break;
                }
                case 2: {
                    z = zza.zzc(parcel0, v2);
                    hashSet0.add(2);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v2);
                    hashSet0.add(3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new PlacesLivedEntity(hashSet0, v1, z, s);
    }

    public PlacesLivedEntity[] zziK(int v) {
        return new PlacesLivedEntity[v];
    }
}

