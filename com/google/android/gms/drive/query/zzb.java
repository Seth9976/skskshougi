package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.ArrayList;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbG(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdv(x0);
    }

    static void zza(SortOrder sortOrder0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1000, sortOrder0.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, sortOrder0.zzahO, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, sortOrder0.zzahP);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public SortOrder zzbG(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        ArrayList arrayList0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    arrayList0 = zza.zzc(parcel0, v2, FieldWithSortOrder.CREATOR);
                    break;
                }
                case 2: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v2);
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
        return new SortOrder(v1, arrayList0, z);
    }

    public SortOrder[] zzdv(int v) {
        return new SortOrder[v];
    }
}

