package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbI(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdx(x0);
    }

    static void zza(FieldOnlyFilter fieldOnlyFilter0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1000, fieldOnlyFilter0.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 1, fieldOnlyFilter0.zzahR, v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public FieldOnlyFilter zzbI(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        MetadataBundle metadataBundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    metadataBundle0 = (MetadataBundle)zza.zza(parcel0, v2, MetadataBundle.CREATOR);
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
        return new FieldOnlyFilter(v1, metadataBundle0);
    }

    public FieldOnlyFilter[] zzdx(int v) {
        return new FieldOnlyFilter[v];
    }
}

