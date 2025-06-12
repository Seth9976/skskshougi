package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfM(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziC(x0);
    }

    static void zza(PersonEntity personEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        Set set0 = personEntity0.zzaHQ;
        if(set0.contains(1)) {
            zzb.zzc(parcel0, 1, personEntity0.zzCY);
        }
        if(set0.contains(2)) {
            zzb.zza(parcel0, 2, personEntity0.zzaIO, true);
        }
        if(set0.contains(3)) {
            zzb.zza(parcel0, 3, personEntity0.zzaIP, v, true);
        }
        if(set0.contains(4)) {
            zzb.zza(parcel0, 4, personEntity0.zzaIQ, true);
        }
        if(set0.contains(5)) {
            zzb.zza(parcel0, 5, personEntity0.zzaIR, true);
        }
        if(set0.contains(6)) {
            zzb.zzc(parcel0, 6, personEntity0.zzaIS);
        }
        if(set0.contains(7)) {
            zzb.zza(parcel0, 7, personEntity0.zzaIT, v, true);
        }
        if(set0.contains(8)) {
            zzb.zza(parcel0, 8, personEntity0.zzaIU, true);
        }
        if(set0.contains(9)) {
            zzb.zza(parcel0, 9, personEntity0.zzadI, true);
        }
        if(set0.contains(12)) {
            zzb.zzc(parcel0, 12, personEntity0.zzsC);
        }
        if(set0.contains(14)) {
            zzb.zza(parcel0, 14, personEntity0.zzKI, true);
        }
        if(set0.contains(15)) {
            zzb.zza(parcel0, 15, personEntity0.zzaIV, v, true);
        }
        if(set0.contains(16)) {
            zzb.zza(parcel0, 16, personEntity0.zzaIW);
        }
        if(set0.contains(19)) {
            zzb.zza(parcel0, 19, personEntity0.zzaIX, v, true);
        }
        if(set0.contains(18)) {
            zzb.zza(parcel0, 18, personEntity0.zzRA, true);
        }
        if(set0.contains(21)) {
            zzb.zzc(parcel0, 21, personEntity0.zzaIZ);
        }
        if(set0.contains(20)) {
            zzb.zza(parcel0, 20, personEntity0.zzaIY, true);
        }
        if(set0.contains(23)) {
            zzb.zzc(parcel0, 23, personEntity0.zzaJb, true);
        }
        if(set0.contains(22)) {
            zzb.zzc(parcel0, 22, personEntity0.zzaJa, true);
        }
        if(set0.contains(25)) {
            zzb.zzc(parcel0, 25, personEntity0.zzaJd);
        }
        if(set0.contains(24)) {
            zzb.zzc(parcel0, 24, personEntity0.zzaJc);
        }
        if(set0.contains(27)) {
            zzb.zza(parcel0, 27, personEntity0.zzF, true);
        }
        if(set0.contains(26)) {
            zzb.zza(parcel0, 26, personEntity0.zzaJe, true);
        }
        if(set0.contains(29)) {
            zzb.zza(parcel0, 29, personEntity0.zzaJg);
        }
        if(set0.contains(28)) {
            zzb.zzc(parcel0, 28, personEntity0.zzaJf, true);
        }
        zzb.zzH(parcel0, v1);
    }

    public PersonEntity zzfM(Parcel parcel0) {
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        HashSet hashSet0 = new HashSet();
        int v1 = 0;
        String s = null;
        AgeRangeEntity personEntity$AgeRangeEntity0 = null;
        String s1 = null;
        String s2 = null;
        int v2 = 0;
        CoverEntity personEntity$CoverEntity0 = null;
        String s3 = null;
        String s4 = null;
        int v3 = 0;
        String s5 = null;
        ImageEntity personEntity$ImageEntity0 = null;
        boolean z = false;
        String s6 = null;
        NameEntity personEntity$NameEntity0 = null;
        String s7 = null;
        int v4 = 0;
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        int v5 = 0;
        int v6 = 0;
        String s8 = null;
        String s9 = null;
        ArrayList arrayList2 = null;
        boolean z1 = false;
        while(parcel0.dataPosition() < v) {
            int v7 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v7) {
                case 1: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v7);
                    hashSet0.add(1);
                    break;
                }
                case 2: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v7);
                    hashSet0.add(2);
                    break;
                }
                case 3: {
                    AgeRangeEntity personEntity$AgeRangeEntity1 = (AgeRangeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v7, AgeRangeEntity.CREATOR);
                    hashSet0.add(3);
                    personEntity$AgeRangeEntity0 = personEntity$AgeRangeEntity1;
                    break;
                }
                case 4: {
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v7);
                    hashSet0.add(4);
                    break;
                }
                case 5: {
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v7);
                    hashSet0.add(5);
                    break;
                }
                case 6: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v7);
                    hashSet0.add(6);
                    break;
                }
                case 7: {
                    CoverEntity personEntity$CoverEntity1 = (CoverEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v7, CoverEntity.CREATOR);
                    hashSet0.add(7);
                    personEntity$CoverEntity0 = personEntity$CoverEntity1;
                    break;
                }
                case 8: {
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v7);
                    hashSet0.add(8);
                    break;
                }
                case 9: {
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v7);
                    hashSet0.add(9);
                    break;
                }
                case 12: {
                    v3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v7);
                    hashSet0.add(12);
                    break;
                }
                case 14: {
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v7);
                    hashSet0.add(14);
                    break;
                }
                case 15: {
                    ImageEntity personEntity$ImageEntity1 = (ImageEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v7, ImageEntity.CREATOR);
                    hashSet0.add(15);
                    personEntity$ImageEntity0 = personEntity$ImageEntity1;
                    break;
                }
                case 16: {
                    z = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v7);
                    hashSet0.add(16);
                    break;
                }
                case 18: {
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v7);
                    hashSet0.add(18);
                    break;
                }
                case 19: {
                    NameEntity personEntity$NameEntity1 = (NameEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v7, NameEntity.CREATOR);
                    hashSet0.add(19);
                    personEntity$NameEntity0 = personEntity$NameEntity1;
                    break;
                }
                case 20: {
                    s7 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v7);
                    hashSet0.add(20);
                    break;
                }
                case 21: {
                    v4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v7);
                    hashSet0.add(21);
                    break;
                }
                case 22: {
                    arrayList0 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v7, OrganizationsEntity.CREATOR);
                    hashSet0.add(22);
                    break;
                }
                case 23: {
                    arrayList1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v7, PlacesLivedEntity.CREATOR);
                    hashSet0.add(23);
                    break;
                }
                case 24: {
                    v5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v7);
                    hashSet0.add(24);
                    break;
                }
                case 25: {
                    v6 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v7);
                    hashSet0.add(25);
                    break;
                }
                case 26: {
                    s8 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v7);
                    hashSet0.add(26);
                    break;
                }
                case 27: {
                    s9 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v7);
                    hashSet0.add(27);
                    break;
                }
                case 28: {
                    arrayList2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v7, UrlsEntity.CREATOR);
                    hashSet0.add(28);
                    break;
                }
                case 29: {
                    z1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v7);
                    hashSet0.add(29);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v7);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new PersonEntity(hashSet0, v1, s, personEntity$AgeRangeEntity0, s1, s2, v2, personEntity$CoverEntity0, s3, s4, v3, s5, personEntity$ImageEntity0, z, s6, personEntity$NameEntity0, s7, v4, arrayList0, arrayList1, v5, v6, s8, s9, arrayList2, z1);
    }

    public PersonEntity[] zziC(int v) {
        return new PersonEntity[v];
    }
}

