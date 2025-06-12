package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzan(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbS(x0);
    }

    static void zza(ChangeSequenceNumber changeSequenceNumber0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, changeSequenceNumber0.zzCY);
        zzb.zza(parcel0, 2, changeSequenceNumber0.zzacN);
        zzb.zza(parcel0, 3, changeSequenceNumber0.zzacO);
        zzb.zza(parcel0, 4, changeSequenceNumber0.zzacP);
        zzb.zzH(parcel0, v1);
    }

    public ChangeSequenceNumber zzan(Parcel parcel0) {
        long v = 0L;
        int v1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v2 = 0;
        long v3 = 0L;
        long v4 = 0L;
        while(parcel0.dataPosition() < v1) {
            int v5 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v5);
                    break;
                }
                case 2: {
                    v4 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel0, v5);
                    break;
                }
                case 3: {
                    v3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel0, v5);
                    break;
                }
                case 4: {
                    v = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel0, v5);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new ChangeSequenceNumber(v2, v4, v3, v);
    }

    public ChangeSequenceNumber[] zzbS(int v) {
        return new ChangeSequenceNumber[v];
    }
}

