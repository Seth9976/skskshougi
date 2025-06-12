package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbW(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdM(x0);
    }

    static void zza(ParcelableIndexReference parcelableIndexReference0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, parcelableIndexReference0.zzCY);
        zzb.zza(parcel0, 2, parcelableIndexReference0.zzaiw, false);
        zzb.zzc(parcel0, 3, parcelableIndexReference0.mIndex);
        zzb.zza(parcel0, 4, parcelableIndexReference0.zzaix);
        zzb.zzc(parcel0, 5, parcelableIndexReference0.zzaiy);
        zzb.zzH(parcel0, v1);
    }

    public ParcelableIndexReference zzbW(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        String s = null;
        int v1 = -1;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 3: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 4: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                case 5: {
                    v1 = zza.zzg(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new ParcelableIndexReference(v3, s, v2, z, v1);
    }

    public ParcelableIndexReference[] zzdM(int v) {
        return new ParcelableIndexReference[v];
    }
}

