package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfT(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziJ(x0);
    }

    static void zza(OrganizationsEntity personEntity$OrganizationsEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        Set set0 = personEntity$OrganizationsEntity0.zzaHQ;
        if(set0.contains(1)) {
            zzb.zzc(parcel0, 1, personEntity$OrganizationsEntity0.zzCY);
        }
        if(set0.contains(2)) {
            zzb.zza(parcel0, 2, personEntity$OrganizationsEntity0.zzaJs, true);
        }
        if(set0.contains(3)) {
            zzb.zza(parcel0, 3, personEntity$OrganizationsEntity0.zzakM, true);
        }
        if(set0.contains(4)) {
            zzb.zza(parcel0, 4, personEntity$OrganizationsEntity0.zzaIn, true);
        }
        if(set0.contains(5)) {
            zzb.zza(parcel0, 5, personEntity$OrganizationsEntity0.zzaJt, true);
        }
        if(set0.contains(6)) {
            zzb.zza(parcel0, 6, personEntity$OrganizationsEntity0.mName, true);
        }
        if(set0.contains(7)) {
            zzb.zza(parcel0, 7, personEntity$OrganizationsEntity0.zzaJu);
        }
        if(set0.contains(8)) {
            zzb.zza(parcel0, 8, personEntity$OrganizationsEntity0.zzaID, true);
        }
        if(set0.contains(9)) {
            zzb.zza(parcel0, 9, personEntity$OrganizationsEntity0.zzadv, true);
        }
        if(set0.contains(10)) {
            zzb.zzc(parcel0, 10, personEntity$OrganizationsEntity0.zzSq);
        }
        zzb.zzH(parcel0, v1);
    }

    public OrganizationsEntity zzfT(Parcel parcel0) {
        int v = 0;
        String s = null;
        int v1 = zza.zzab(parcel0);
        HashSet hashSet0 = new HashSet();
        String s1 = null;
        boolean z = false;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
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
                    s6 = zza.zzo(parcel0, v3);
                    hashSet0.add(2);
                    break;
                }
                case 3: {
                    s5 = zza.zzo(parcel0, v3);
                    hashSet0.add(3);
                    break;
                }
                case 4: {
                    s4 = zza.zzo(parcel0, v3);
                    hashSet0.add(4);
                    break;
                }
                case 5: {
                    s3 = zza.zzo(parcel0, v3);
                    hashSet0.add(5);
                    break;
                }
                case 6: {
                    s2 = zza.zzo(parcel0, v3);
                    hashSet0.add(6);
                    break;
                }
                case 7: {
                    z = zza.zzc(parcel0, v3);
                    hashSet0.add(7);
                    break;
                }
                case 8: {
                    s1 = zza.zzo(parcel0, v3);
                    hashSet0.add(8);
                    break;
                }
                case 9: {
                    s = zza.zzo(parcel0, v3);
                    hashSet0.add(9);
                    break;
                }
                case 10: {
                    v = zza.zzg(parcel0, v3);
                    hashSet0.add(10);
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
        return new OrganizationsEntity(hashSet0, v2, s6, s5, s4, s3, s2, z, s1, s, v);
    }

    public OrganizationsEntity[] zziJ(int v) {
        return new OrganizationsEntity[v];
    }
}

