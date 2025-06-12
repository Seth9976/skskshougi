package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzw(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzah(x0);
    }

    static void zza(Response getRecentContextCall$Response0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1000, getRecentContextCall$Response0.zzCY);
        zzb.zza(parcel0, 1, getRecentContextCall$Response0.zzNn, v, false);
        zzb.zzc(parcel0, 2, getRecentContextCall$Response0.zzNo, false);
        zzb.zza(parcel0, 3, getRecentContextCall$Response0.zzNp, false);
        zzb.zzH(parcel0, v1);
    }

    public Response[] zzah(int v) {
        return new Response[v];
    }

    public Response zzw(Parcel parcel0) {
        int v3;
        Status status1;
        ArrayList arrayList1;
        String[] arr_s1;
        String[] arr_s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList0 = null;
        Status status0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v3 = v1;
                    status1 = (Status)zza.zza(parcel0, v2, Status.CREATOR);
                    arr_s1 = arr_s;
                    arrayList1 = arrayList0;
                    break;
                }
                case 2: {
                    status1 = status0;
                    v3 = v1;
                    arrayList1 = zza.zzc(parcel0, v2, UsageInfo.CREATOR);
                    arr_s1 = arr_s;
                    break;
                }
                case 3: {
                    arr_s1 = zza.zzA(parcel0, v2);
                    arrayList1 = arrayList0;
                    status1 = status0;
                    v3 = v1;
                    break;
                }
                case 1000: {
                    arrayList1 = arrayList0;
                    status1 = status0;
                    v3 = zza.zzg(parcel0, v2);
                    arr_s1 = arr_s;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    arr_s1 = arr_s;
                    arrayList1 = arrayList0;
                    status1 = status0;
                    v3 = v1;
                }
            }
            v1 = v3;
            status0 = status1;
            arrayList0 = arrayList1;
            arr_s = arr_s1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new Response(v1, status0, arrayList0, arr_s);
    }
}

