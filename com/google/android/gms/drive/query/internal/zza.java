package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbH(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdw(x0);
    }

    static void zza(ComparisonFilter comparisonFilter0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1000, comparisonFilter0.zzCY);
        zzb.zza(parcel0, 1, comparisonFilter0.zzahQ, v, false);
        zzb.zza(parcel0, 2, comparisonFilter0.zzahR, v, false);
        zzb.zzH(parcel0, v1);
    }

    public ComparisonFilter zzbH(Parcel parcel0) {
        int v3;
        Operator operator1;
        MetadataBundle metadataBundle1;
        MetadataBundle metadataBundle0 = null;
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        Operator operator0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v3 = v1;
                    metadataBundle1 = metadataBundle0;
                    operator1 = (Operator)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v2, Operator.CREATOR);
                    break;
                }
                case 2: {
                    metadataBundle1 = (MetadataBundle)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v2, MetadataBundle.CREATOR);
                    operator1 = operator0;
                    v3 = v1;
                    break;
                }
                case 1000: {
                    operator1 = operator0;
                    v3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v2);
                    metadataBundle1 = metadataBundle0;
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v2);
                    metadataBundle1 = metadataBundle0;
                    operator1 = operator0;
                    v3 = v1;
                }
            }
            v1 = v3;
            operator0 = operator1;
            metadataBundle0 = metadataBundle1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new ComparisonFilter(v1, operator0, metadataBundle0);
    }

    public ComparisonFilter[] zzdw(int v) {
        return new ComparisonFilter[v];
    }
}

