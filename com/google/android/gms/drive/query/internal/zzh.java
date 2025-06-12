package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbL(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdA(x0);
    }

    static void zza(FullTextSearchFilter fullTextSearchFilter0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1000, fullTextSearchFilter0.zzCY);
        zzb.zza(parcel0, 1, fullTextSearchFilter0.mValue, false);
        zzb.zzH(parcel0, v1);
    }

    public FullTextSearchFilter zzbL(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v2);
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
        return new FullTextSearchFilter(v1, s);
    }

    public FullTextSearchFilter[] zzdA(int v) {
        return new FullTextSearchFilter[v];
    }
}

