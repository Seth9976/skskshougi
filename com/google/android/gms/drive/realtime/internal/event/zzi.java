package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcf(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdV(x0);
    }

    static void zza(ValuesAddedDetails valuesAddedDetails0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, valuesAddedDetails0.zzCY);
        zzb.zzc(parcel0, 2, valuesAddedDetails0.mIndex);
        zzb.zzc(parcel0, 3, valuesAddedDetails0.zzaiA);
        zzb.zzc(parcel0, 4, valuesAddedDetails0.zzaiB);
        zzb.zza(parcel0, 5, valuesAddedDetails0.zzaiY, false);
        zzb.zzc(parcel0, 6, valuesAddedDetails0.zzaiZ);
        zzb.zzH(parcel0, v1);
    }

    public ValuesAddedDetails zzcf(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        String s = null;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        while(parcel0.dataPosition() < v1) {
            int v6 = zza.zzaa(parcel0);
            switch(0xFFFF & v6) {
                case 1: {
                    v5 = zza.zzg(parcel0, v6);
                    break;
                }
                case 2: {
                    v4 = zza.zzg(parcel0, v6);
                    break;
                }
                case 3: {
                    v3 = zza.zzg(parcel0, v6);
                    break;
                }
                case 4: {
                    v2 = zza.zzg(parcel0, v6);
                    break;
                }
                case 5: {
                    s = zza.zzo(parcel0, v6);
                    break;
                }
                case 6: {
                    v = zza.zzg(parcel0, v6);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v6);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new ValuesAddedDetails(v5, v4, v3, v2, s, v);
    }

    public ValuesAddedDetails[] zzdV(int v) {
        return new ValuesAddedDetails[v];
    }
}

