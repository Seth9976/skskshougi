package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbT(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdI(x0);
    }

    static void zza(BeginCompoundOperationRequest beginCompoundOperationRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, beginCompoundOperationRequest0.zzCY);
        zzb.zza(parcel0, 2, beginCompoundOperationRequest0.zzaiq);
        zzb.zza(parcel0, 3, beginCompoundOperationRequest0.mName, false);
        zzb.zza(parcel0, 4, beginCompoundOperationRequest0.zzair);
        zzb.zzH(parcel0, v1);
    }

    public BeginCompoundOperationRequest zzbT(Parcel parcel0) {
        boolean z = false;
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        String s = null;
        boolean z1 = true;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    z = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v2);
                    break;
                }
                case 3: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    z1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v2);
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
        return new BeginCompoundOperationRequest(v1, z, s, z1);
    }

    public BeginCompoundOperationRequest[] zzdI(int v) {
        return new BeginCompoundOperationRequest[v];
    }
}

