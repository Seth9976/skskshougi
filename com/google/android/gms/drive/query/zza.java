package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.ArrayList;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbF(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdu(x0);
    }

    static void zza(Query query0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1000, query0.zzCY);
        zzb.zza(parcel0, 1, query0.zzahG, v, false);
        zzb.zza(parcel0, 3, query0.zzahH, false);
        zzb.zza(parcel0, 4, query0.zzahI, v, false);
        zzb.zzb(parcel0, 5, query0.zzahJ, false);
        zzb.zza(parcel0, 6, query0.zzahK);
        zzb.zzc(parcel0, 7, query0.zzadR, false);
        zzb.zzH(parcel0, v1);
    }

    public Query zzbF(Parcel parcel0) {
        boolean z = false;
        ArrayList arrayList0 = null;
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        ArrayList arrayList1 = null;
        SortOrder sortOrder0 = null;
        String s = null;
        LogicalFilter logicalFilter0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    logicalFilter0 = (LogicalFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v2, LogicalFilter.CREATOR);
                    break;
                }
                case 3: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    sortOrder0 = (SortOrder)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v2, SortOrder.CREATOR);
                    break;
                }
                case 5: {
                    arrayList1 = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel0, v2);
                    break;
                }
                case 6: {
                    z = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v2);
                    break;
                }
                case 7: {
                    arrayList0 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v2, DriveSpace.CREATOR);
                    break;
                }
                case 1000: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v2);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new Query(v1, logicalFilter0, s, sortOrder0, arrayList1, z, arrayList0);
    }

    public Query[] zzdu(int v) {
        return new Query[v];
    }
}

