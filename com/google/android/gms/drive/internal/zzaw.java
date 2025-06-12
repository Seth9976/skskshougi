package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzaw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbb(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcQ(x0);
    }

    static void zza(OnDownloadProgressResponse onDownloadProgressResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, onDownloadProgressResponse0.zzCY);
        zzb.zza(parcel0, 2, onDownloadProgressResponse0.zzagg);
        zzb.zza(parcel0, 3, onDownloadProgressResponse0.zzagh);
        zzb.zzH(parcel0, v1);
    }

    public OnDownloadProgressResponse zzbb(Parcel parcel0) {
        long v = 0L;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        long v3 = 0L;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    v3 = zza.zzi(parcel0, v4);
                    break;
                }
                case 3: {
                    v = zza.zzi(parcel0, v4);
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
        return new OnDownloadProgressResponse(v2, v3, v);
    }

    public OnDownloadProgressResponse[] zzcQ(int v) {
        return new OnDownloadProgressResponse[v];
    }
}

