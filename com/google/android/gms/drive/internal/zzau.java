package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;

public class zzau implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaZ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcO(x0);
    }

    static void zza(OnContentsResponse onContentsResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, onContentsResponse0.zzCY);
        zzb.zza(parcel0, 2, onContentsResponse0.zzafa, v, false);
        zzb.zza(parcel0, 3, onContentsResponse0.zzage);
        zzb.zzH(parcel0, v1);
    }

    public OnContentsResponse zzaZ(Parcel parcel0) {
        int v3;
        Contents contents1;
        boolean z1;
        boolean z = false;
        int v = zza.zzab(parcel0);
        Contents contents0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    contents1 = contents0;
                    v3 = zza.zzg(parcel0, v2);
                    z1 = z;
                    break;
                }
                case 2: {
                    v3 = v1;
                    z1 = z;
                    contents1 = (Contents)zza.zza(parcel0, v2, Contents.CREATOR);
                    break;
                }
                case 3: {
                    z1 = zza.zzc(parcel0, v2);
                    contents1 = contents0;
                    v3 = v1;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v2);
                    z1 = z;
                    contents1 = contents0;
                    v3 = v1;
                }
            }
            v1 = v3;
            contents0 = contents1;
            z = z1;
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new OnContentsResponse(v1, contents0, z);
    }

    public OnContentsResponse[] zzcO(int v) {
        return new OnContentsResponse[v];
    }
}

