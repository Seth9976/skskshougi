package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbO(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdD(x0);
    }

    static void zza(LogicalFilter logicalFilter0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1000, logicalFilter0.zzCY);
        zzb.zza(parcel0, 1, logicalFilter0.zzahQ, v, false);
        zzb.zzc(parcel0, 2, logicalFilter0.zzaif, false);
        zzb.zzH(parcel0, v1);
    }

    public LogicalFilter zzbO(Parcel parcel0) {
        int v3;
        Operator operator1;
        List list0;
        ArrayList arrayList0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Operator operator0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v3 = v1;
                    list0 = arrayList0;
                    operator1 = (Operator)zza.zza(parcel0, v2, Operator.CREATOR);
                    break;
                }
                case 2: {
                    list0 = zza.zzc(parcel0, v2, FilterHolder.CREATOR);
                    operator1 = operator0;
                    v3 = v1;
                    break;
                }
                case 1000: {
                    operator1 = operator0;
                    v3 = zza.zzg(parcel0, v2);
                    list0 = arrayList0;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    list0 = arrayList0;
                    operator1 = operator0;
                    v3 = v1;
                }
            }
            v1 = v3;
            operator0 = operator1;
            arrayList0 = list0;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new LogicalFilter(v1, operator0, arrayList0);
    }

    public LogicalFilter[] zzdD(int v) {
        return new LogicalFilter[v];
    }
}

