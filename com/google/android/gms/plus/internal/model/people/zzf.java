package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfR(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziH(x0);
    }

    static void zza(ImageEntity personEntity$ImageEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        Set set0 = personEntity$ImageEntity0.zzaHQ;
        if(set0.contains(1)) {
            zzb.zzc(parcel0, 1, personEntity$ImageEntity0.zzCY);
        }
        if(set0.contains(2)) {
            zzb.zza(parcel0, 2, personEntity$ImageEntity0.zzF, true);
        }
        zzb.zzH(parcel0, v1);
    }

    public ImageEntity zzfR(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        HashSet hashSet0 = new HashSet();
        int v1 = 0;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    hashSet0.add(1);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v2);
                    hashSet0.add(2);
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
        return new ImageEntity(hashSet0, v1, s);
    }

    public ImageEntity[] zziH(int v) {
        return new ImageEntity[v];
    }
}

