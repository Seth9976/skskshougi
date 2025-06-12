package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.HashSet;
import java.util.Set;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfL(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziB(x0);
    }

    static void zza(MomentEntity momentEntity0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        Set set0 = momentEntity0.zzaHQ;
        if(set0.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, momentEntity0.zzCY);
        }
        if(set0.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, momentEntity0.zzKI, true);
        }
        if(set0.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, momentEntity0.zzaIL, v, true);
        }
        if(set0.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 5, momentEntity0.zzaID, true);
        }
        if(set0.contains(6)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 6, momentEntity0.zzaIM, v, true);
        }
        if(set0.contains(7)) {
            com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 7, momentEntity0.zzEl, true);
        }
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public MomentEntity zzfL(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        HashSet hashSet0 = new HashSet();
        int v1 = 0;
        ItemScopeEntity itemScopeEntity0 = null;
        String s1 = null;
        ItemScopeEntity itemScopeEntity1 = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    hashSet0.add(1);
                    break;
                }
                case 2: {
                    s2 = zza.zzo(parcel0, v2);
                    hashSet0.add(2);
                    break;
                }
                case 4: {
                    ItemScopeEntity itemScopeEntity2 = (ItemScopeEntity)zza.zza(parcel0, v2, ItemScopeEntity.CREATOR);
                    hashSet0.add(4);
                    itemScopeEntity1 = itemScopeEntity2;
                    break;
                }
                case 5: {
                    s1 = zza.zzo(parcel0, v2);
                    hashSet0.add(5);
                    break;
                }
                case 6: {
                    ItemScopeEntity itemScopeEntity3 = (ItemScopeEntity)zza.zza(parcel0, v2, ItemScopeEntity.CREATOR);
                    hashSet0.add(6);
                    itemScopeEntity0 = itemScopeEntity3;
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
        return new MomentEntity(hashSet0, v1, s2, itemScopeEntity1, s1, itemScopeEntity0, s);
    }

    public MomentEntity[] zziB(int v) {
        return new MomentEntity[v];
    }
}

