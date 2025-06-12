package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzca(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdQ(x0);
    }

    static void zza(ParcelableEventList parcelableEventList0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, parcelableEventList0.zzCY);
        zzb.zzc(parcel0, 2, parcelableEventList0.zzoB, false);
        zzb.zza(parcel0, 3, parcelableEventList0.zzaiQ, v, false);
        zzb.zza(parcel0, 4, parcelableEventList0.zzaiR);
        zzb.zzb(parcel0, 5, parcelableEventList0.zzaiS, false);
        zzb.zzH(parcel0, v1);
    }

    public ParcelableEventList zzca(Parcel parcel0) {
        boolean z = false;
        ArrayList arrayList0 = null;
        int v = zza.zzab(parcel0);
        DataHolder dataHolder0 = null;
        ArrayList arrayList1 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    arrayList1 = zza.zzc(parcel0, v2, ParcelableEvent.CREATOR);
                    break;
                }
                case 3: {
                    dataHolder0 = (DataHolder)zza.zza(parcel0, v2, DataHolder.CREATOR);
                    break;
                }
                case 4: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 5: {
                    arrayList0 = zza.zzC(parcel0, v2);
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
        return new ParcelableEventList(v1, arrayList1, dataHolder0, z, arrayList0);
    }

    public ParcelableEventList[] zzdQ(int v) {
        return new ParcelableEventList[v];
    }
}

