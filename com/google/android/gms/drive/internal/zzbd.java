package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zzbd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbi(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcX(x0);
    }

    static void zza(OnMetadataResponse onMetadataResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, onMetadataResponse0.zzCY);
        zzb.zza(parcel0, 2, onMetadataResponse0.zzaeA, v, false);
        zzb.zzH(parcel0, v1);
    }

    public OnMetadataResponse zzbi(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        MetadataBundle metadataBundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    metadataBundle0 = (MetadataBundle)zza.zza(parcel0, v2, MetadataBundle.CREATOR);
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
        return new OnMetadataResponse(v1, metadataBundle0);
    }

    public OnMetadataResponse[] zzcX(int v) {
        return new OnMetadataResponse[v];
    }
}

