package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfK(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziA(x0);
    }

    static void zza(ItemScopeEntity itemScopeEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        Set set0 = itemScopeEntity0.zzaHQ;
        if(set0.contains(1)) {
            zzb.zzc(parcel0, 1, itemScopeEntity0.zzCY);
        }
        if(set0.contains(2)) {
            zzb.zza(parcel0, 2, itemScopeEntity0.zzaHR, v, true);
        }
        if(set0.contains(3)) {
            zzb.zzb(parcel0, 3, itemScopeEntity0.zzaHS, true);
        }
        if(set0.contains(4)) {
            zzb.zza(parcel0, 4, itemScopeEntity0.zzaHT, v, true);
        }
        if(set0.contains(5)) {
            zzb.zza(parcel0, 5, itemScopeEntity0.zzaHU, true);
        }
        if(set0.contains(6)) {
            zzb.zza(parcel0, 6, itemScopeEntity0.zzaHV, true);
        }
        if(set0.contains(7)) {
            zzb.zza(parcel0, 7, itemScopeEntity0.zzaHW, true);
        }
        if(set0.contains(8)) {
            zzb.zzc(parcel0, 8, itemScopeEntity0.zzaHX, true);
        }
        if(set0.contains(9)) {
            zzb.zzc(parcel0, 9, itemScopeEntity0.zzaHY);
        }
        if(set0.contains(10)) {
            zzb.zzc(parcel0, 10, itemScopeEntity0.zzaHZ, true);
        }
        if(set0.contains(11)) {
            zzb.zza(parcel0, 11, itemScopeEntity0.zzaIa, v, true);
        }
        if(set0.contains(12)) {
            zzb.zzc(parcel0, 12, itemScopeEntity0.zzaIb, true);
        }
        if(set0.contains(13)) {
            zzb.zza(parcel0, 13, itemScopeEntity0.zzaIc, true);
        }
        if(set0.contains(14)) {
            zzb.zza(parcel0, 14, itemScopeEntity0.zzaId, true);
        }
        if(set0.contains(15)) {
            zzb.zza(parcel0, 15, itemScopeEntity0.zzaIe, v, true);
        }
        if(set0.contains(17)) {
            zzb.zza(parcel0, 17, itemScopeEntity0.zzaIg, true);
        }
        if(set0.contains(16)) {
            zzb.zza(parcel0, 16, itemScopeEntity0.zzaIf, true);
        }
        if(set0.contains(19)) {
            zzb.zzc(parcel0, 19, itemScopeEntity0.zzaIh, true);
        }
        if(set0.contains(18)) {
            zzb.zza(parcel0, 18, itemScopeEntity0.zzsB, true);
        }
        if(set0.contains(21)) {
            zzb.zza(parcel0, 21, itemScopeEntity0.zzaIj, true);
        }
        if(set0.contains(20)) {
            zzb.zza(parcel0, 20, itemScopeEntity0.zzaIi, true);
        }
        if(set0.contains(23)) {
            zzb.zza(parcel0, 23, itemScopeEntity0.zzakM, true);
        }
        if(set0.contains(22)) {
            zzb.zza(parcel0, 22, itemScopeEntity0.zzaIk, true);
        }
        if(set0.contains(25)) {
            zzb.zza(parcel0, 25, itemScopeEntity0.zzaIm, true);
        }
        if(set0.contains(24)) {
            zzb.zza(parcel0, 24, itemScopeEntity0.zzaIl, true);
        }
        if(set0.contains(27)) {
            zzb.zza(parcel0, 27, itemScopeEntity0.zzaIo, true);
        }
        if(set0.contains(26)) {
            zzb.zza(parcel0, 26, itemScopeEntity0.zzaIn, true);
        }
        if(set0.contains(29)) {
            zzb.zza(parcel0, 29, itemScopeEntity0.zzaIq, v, true);
        }
        if(set0.contains(28)) {
            zzb.zza(parcel0, 28, itemScopeEntity0.zzaIp, true);
        }
        if(set0.contains(0x1F)) {
            zzb.zza(parcel0, 0x1F, itemScopeEntity0.zzaIs, true);
        }
        if(set0.contains(30)) {
            zzb.zza(parcel0, 30, itemScopeEntity0.zzaIr, true);
        }
        if(set0.contains(34)) {
            zzb.zza(parcel0, 34, itemScopeEntity0.zzaIu, v, true);
        }
        if(set0.contains(0x20)) {
            zzb.zza(parcel0, 0x20, itemScopeEntity0.zzKI, true);
        }
        if(set0.contains(33)) {
            zzb.zza(parcel0, 33, itemScopeEntity0.zzaIt, true);
        }
        if(set0.contains(38)) {
            zzb.zza(parcel0, 38, itemScopeEntity0.zzaxC);
        }
        if(set0.contains(39)) {
            zzb.zza(parcel0, 39, itemScopeEntity0.mName, true);
        }
        if(set0.contains(36)) {
            zzb.zza(parcel0, 36, itemScopeEntity0.zzaxB);
        }
        if(set0.contains(37)) {
            zzb.zza(parcel0, 37, itemScopeEntity0.zzaIv, v, true);
        }
        if(set0.contains(42)) {
            zzb.zza(parcel0, 42, itemScopeEntity0.zzaIy, true);
        }
        if(set0.contains(43)) {
            zzb.zza(parcel0, 43, itemScopeEntity0.zzaIz, true);
        }
        if(set0.contains(40)) {
            zzb.zza(parcel0, 40, itemScopeEntity0.zzaIw, v, true);
        }
        if(set0.contains(41)) {
            zzb.zzc(parcel0, 41, itemScopeEntity0.zzaIx, true);
        }
        if(set0.contains(46)) {
            zzb.zza(parcel0, 46, itemScopeEntity0.zzaIC, v, true);
        }
        if(set0.contains(0x2F)) {
            zzb.zza(parcel0, 0x2F, itemScopeEntity0.zzaID, true);
        }
        if(set0.contains(44)) {
            zzb.zza(parcel0, 44, itemScopeEntity0.zzaIA, true);
        }
        if(set0.contains(45)) {
            zzb.zza(parcel0, 45, itemScopeEntity0.zzaIB, true);
        }
        if(set0.contains(51)) {
            zzb.zza(parcel0, 51, itemScopeEntity0.zzaIH, true);
        }
        if(set0.contains(50)) {
            zzb.zza(parcel0, 50, itemScopeEntity0.zzaIG, v, true);
        }
        if(set0.contains(49)) {
            zzb.zza(parcel0, 49, itemScopeEntity0.zzaIF, true);
        }
        if(set0.contains(0x30)) {
            zzb.zza(parcel0, 0x30, itemScopeEntity0.zzaIE, true);
        }
        if(set0.contains(55)) {
            zzb.zza(parcel0, 55, itemScopeEntity0.zzaIJ, true);
        }
        if(set0.contains(54)) {
            zzb.zza(parcel0, 54, itemScopeEntity0.zzF, true);
        }
        if(set0.contains(53)) {
            zzb.zza(parcel0, 53, itemScopeEntity0.zzEl, true);
        }
        if(set0.contains(52)) {
            zzb.zza(parcel0, 52, itemScopeEntity0.zzaII, true);
        }
        if(set0.contains(56)) {
            zzb.zza(parcel0, 56, itemScopeEntity0.zzaIK, true);
        }
        zzb.zzH(parcel0, v1);
    }

    public ItemScopeEntity zzfK(Parcel parcel0) {
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        HashSet hashSet0 = new HashSet();
        int v1 = 0;
        ItemScopeEntity itemScopeEntity0 = null;
        ArrayList arrayList0 = null;
        ItemScopeEntity itemScopeEntity1 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        ArrayList arrayList1 = null;
        int v2 = 0;
        ArrayList arrayList2 = null;
        ItemScopeEntity itemScopeEntity2 = null;
        ArrayList arrayList3 = null;
        String s3 = null;
        String s4 = null;
        ItemScopeEntity itemScopeEntity3 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        ArrayList arrayList4 = null;
        String s8 = null;
        String s9 = null;
        String s10 = null;
        String s11 = null;
        String s12 = null;
        String s13 = null;
        String s14 = null;
        String s15 = null;
        String s16 = null;
        ItemScopeEntity itemScopeEntity4 = null;
        String s17 = null;
        String s18 = null;
        String s19 = null;
        String s20 = null;
        ItemScopeEntity itemScopeEntity5 = null;
        double f = 0.0;
        ItemScopeEntity itemScopeEntity6 = null;
        double f1 = 0.0;
        String s21 = null;
        ItemScopeEntity itemScopeEntity7 = null;
        ArrayList arrayList5 = null;
        String s22 = null;
        String s23 = null;
        String s24 = null;
        String s25 = null;
        ItemScopeEntity itemScopeEntity8 = null;
        String s26 = null;
        String s27 = null;
        String s28 = null;
        ItemScopeEntity itemScopeEntity9 = null;
        String s29 = null;
        String s30 = null;
        String s31 = null;
        String s32 = null;
        String s33 = null;
        String s34 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    hashSet0.add(1);
                    break;
                }
                case 2: {
                    ItemScopeEntity itemScopeEntity10 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(2);
                    itemScopeEntity0 = itemScopeEntity10;
                    break;
                }
                case 3: {
                    arrayList0 = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel0, v3);
                    hashSet0.add(3);
                    break;
                }
                case 4: {
                    ItemScopeEntity itemScopeEntity11 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(4);
                    itemScopeEntity1 = itemScopeEntity11;
                    break;
                }
                case 5: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(5);
                    break;
                }
                case 6: {
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(6);
                    break;
                }
                case 7: {
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(7);
                    break;
                }
                case 8: {
                    arrayList1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(8);
                    break;
                }
                case 9: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    hashSet0.add(9);
                    break;
                }
                case 10: {
                    arrayList2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(10);
                    break;
                }
                case 11: {
                    ItemScopeEntity itemScopeEntity12 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(11);
                    itemScopeEntity2 = itemScopeEntity12;
                    break;
                }
                case 12: {
                    arrayList3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(12);
                    break;
                }
                case 13: {
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(13);
                    break;
                }
                case 14: {
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(14);
                    break;
                }
                case 15: {
                    ItemScopeEntity itemScopeEntity13 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(15);
                    itemScopeEntity3 = itemScopeEntity13;
                    break;
                }
                case 16: {
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(16);
                    break;
                }
                case 17: {
                    s6 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(17);
                    break;
                }
                case 18: {
                    s7 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(18);
                    break;
                }
                case 19: {
                    arrayList4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(19);
                    break;
                }
                case 20: {
                    s8 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(20);
                    break;
                }
                case 21: {
                    s9 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(21);
                    break;
                }
                case 22: {
                    s10 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(22);
                    break;
                }
                case 23: {
                    s11 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(23);
                    break;
                }
                case 24: {
                    s12 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(24);
                    break;
                }
                case 25: {
                    s13 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(25);
                    break;
                }
                case 26: {
                    s14 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(26);
                    break;
                }
                case 27: {
                    s15 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(27);
                    break;
                }
                case 28: {
                    s16 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(28);
                    break;
                }
                case 29: {
                    ItemScopeEntity itemScopeEntity14 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(29);
                    itemScopeEntity4 = itemScopeEntity14;
                    break;
                }
                case 30: {
                    s17 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(30);
                    break;
                }
                case 0x1F: {
                    s18 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(0x1F);
                    break;
                }
                case 0x20: {
                    s19 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(0x20);
                    break;
                }
                case 33: {
                    s20 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(33);
                    break;
                }
                case 34: {
                    ItemScopeEntity itemScopeEntity15 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(34);
                    itemScopeEntity5 = itemScopeEntity15;
                    break;
                }
                case 36: {
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel0, v3);
                    hashSet0.add(36);
                    break;
                }
                case 37: {
                    ItemScopeEntity itemScopeEntity16 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(37);
                    itemScopeEntity6 = itemScopeEntity16;
                    break;
                }
                case 38: {
                    f1 = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel0, v3);
                    hashSet0.add(38);
                    break;
                }
                case 39: {
                    s21 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(39);
                    break;
                }
                case 40: {
                    ItemScopeEntity itemScopeEntity17 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(40);
                    itemScopeEntity7 = itemScopeEntity17;
                    break;
                }
                case 41: {
                    arrayList5 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(41);
                    break;
                }
                case 42: {
                    s22 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(42);
                    break;
                }
                case 43: {
                    s23 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(43);
                    break;
                }
                case 44: {
                    s24 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(44);
                    break;
                }
                case 45: {
                    s25 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(45);
                    break;
                }
                case 46: {
                    ItemScopeEntity itemScopeEntity18 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(46);
                    itemScopeEntity8 = itemScopeEntity18;
                    break;
                }
                case 0x2F: {
                    s26 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(0x2F);
                    break;
                }
                case 0x30: {
                    s27 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(0x30);
                    break;
                }
                case 49: {
                    s28 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(49);
                    break;
                }
                case 50: {
                    ItemScopeEntity itemScopeEntity19 = (ItemScopeEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, ItemScopeEntity.CREATOR);
                    hashSet0.add(50);
                    itemScopeEntity9 = itemScopeEntity19;
                    break;
                }
                case 51: {
                    s29 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(51);
                    break;
                }
                case 52: {
                    s30 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(52);
                    break;
                }
                case 53: {
                    s31 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(53);
                    break;
                }
                case 54: {
                    s32 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(54);
                    break;
                }
                case 55: {
                    s33 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(55);
                    break;
                }
                case 56: {
                    s34 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v3);
                    hashSet0.add(56);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new ItemScopeEntity(hashSet0, v1, itemScopeEntity0, arrayList0, itemScopeEntity1, s, s1, s2, arrayList1, v2, arrayList2, itemScopeEntity2, arrayList3, s3, s4, itemScopeEntity3, s5, s6, s7, arrayList4, s8, s9, s10, s11, s12, s13, s14, s15, s16, itemScopeEntity4, s17, s18, s19, s20, itemScopeEntity5, f, itemScopeEntity6, f1, s21, itemScopeEntity7, arrayList5, s22, s23, s24, s25, itemScopeEntity8, s26, s27, s28, itemScopeEntity9, s29, s30, s31, s32, s33, s34);
    }

    public ItemScopeEntity[] zziA(int v) {
        return new ItemScopeEntity[v];
    }
}

