package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzal(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbL(x0);
    }

    static void zza(SafeParcelResponse safeParcelResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, safeParcelResponse0.getVersionCode());
        zzb.zza(parcel0, 2, safeParcelResponse0.zzoE(), false);
        zzb.zza(parcel0, 3, safeParcelResponse0.zzoF(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public SafeParcelResponse zzal(Parcel parcel0) {
        FieldMappingDictionary fieldMappingDictionary0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Parcel parcel1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    parcel1 = zza.zzD(parcel0, v2);
                    break;
                }
                case 3: {
                    fieldMappingDictionary0 = (FieldMappingDictionary)zza.zza(parcel0, v2, FieldMappingDictionary.CREATOR);
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
        return new SafeParcelResponse(v1, parcel1, fieldMappingDictionary0);
    }

    public SafeParcelResponse[] zzbL(int v) {
        return new SafeParcelResponse[v];
    }
}

