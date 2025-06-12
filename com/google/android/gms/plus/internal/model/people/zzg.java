package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfS(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziI(x0);
    }

    static void zza(NameEntity personEntity$NameEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        Set set0 = personEntity$NameEntity0.zzaHQ;
        if(set0.contains(1)) {
            zzb.zzc(parcel0, 1, personEntity$NameEntity0.zzCY);
        }
        if(set0.contains(2)) {
            zzb.zza(parcel0, 2, personEntity$NameEntity0.zzaIo, true);
        }
        if(set0.contains(3)) {
            zzb.zza(parcel0, 3, personEntity$NameEntity0.zzaJo, true);
        }
        if(set0.contains(4)) {
            zzb.zza(parcel0, 4, personEntity$NameEntity0.zzaIr, true);
        }
        if(set0.contains(5)) {
            zzb.zza(parcel0, 5, personEntity$NameEntity0.zzaJp, true);
        }
        if(set0.contains(6)) {
            zzb.zza(parcel0, 6, personEntity$NameEntity0.zzaJq, true);
        }
        if(set0.contains(7)) {
            zzb.zza(parcel0, 7, personEntity$NameEntity0.zzaJr, true);
        }
        zzb.zzH(parcel0, v1);
    }

    public NameEntity zzfS(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        HashSet hashSet0 = new HashSet();
        int v1 = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    hashSet0.add(1);
                    break;
                }
                case 2: {
                    s5 = zza.zzo(parcel0, v2);
                    hashSet0.add(2);
                    break;
                }
                case 3: {
                    s4 = zza.zzo(parcel0, v2);
                    hashSet0.add(3);
                    break;
                }
                case 4: {
                    s3 = zza.zzo(parcel0, v2);
                    hashSet0.add(4);
                    break;
                }
                case 5: {
                    s2 = zza.zzo(parcel0, v2);
                    hashSet0.add(5);
                    break;
                }
                case 6: {
                    s1 = zza.zzo(parcel0, v2);
                    hashSet0.add(6);
                    break;
                }
                case 7: {
                    s = zza.zzo(parcel0, v2);
                    hashSet0.add(7);
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
        return new NameEntity(hashSet0, v1, s5, s4, s3, s2, s1, s);
    }

    public NameEntity[] zziI(int v) {
        return new NameEntity[v];
    }
}

