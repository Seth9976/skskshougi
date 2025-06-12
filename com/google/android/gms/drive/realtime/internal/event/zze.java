package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcb(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdR(x0);
    }

    static void zza(ReferenceShiftedDetails referenceShiftedDetails0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, referenceShiftedDetails0.zzCY);
        zzb.zza(parcel0, 2, referenceShiftedDetails0.zzaiT, false);
        zzb.zza(parcel0, 3, referenceShiftedDetails0.zzaiU, false);
        zzb.zzc(parcel0, 4, referenceShiftedDetails0.zzaiV);
        zzb.zzc(parcel0, 5, referenceShiftedDetails0.zzaiW);
        zzb.zzH(parcel0, v1);
    }

    public ReferenceShiftedDetails zzcb(Parcel parcel0) {
        String s = null;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        String s1 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    s1 = zza.zzo(parcel0, v4);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 4: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 5: {
                    v = zza.zzg(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new ReferenceShiftedDetails(v3, s1, s, v2, v);
    }

    public ReferenceShiftedDetails[] zzdR(int v) {
        return new ReferenceShiftedDetails[v];
    }
}

