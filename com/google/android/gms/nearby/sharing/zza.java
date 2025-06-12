package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfy(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzin(x0);
    }

    static void zza(AppContentReceivedResult appContentReceivedResult0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, appContentReceivedResult0.getVersionCode());
        zzb.zza(parcel0, 2, appContentReceivedResult0.zzxc(), v, false);
        zzb.zzc(parcel0, 3, appContentReceivedResult0.getStatusCode());
        zzb.zzH(parcel0, v1);
    }

    public AppContentReceivedResult zzfy(Parcel parcel0) {
        int v5;
        Uri uri1;
        int v4;
        int v = 0;
        int v1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        Uri uri0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    uri1 = uri0;
                    v5 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    v4 = v;
                    break;
                }
                case 2: {
                    v5 = v2;
                    v4 = v;
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v3, Uri.CREATOR);
                    break;
                }
                case 3: {
                    v4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v3);
                    uri1 = uri0;
                    v5 = v2;
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v3);
                    v4 = v;
                    uri1 = uri0;
                    v5 = v2;
                }
            }
            v2 = v5;
            uri0 = uri1;
            v = v4;
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new AppContentReceivedResult(v2, uri0, v);
    }

    public AppContentReceivedResult[] zzin(int v) {
        return new AppContentReceivedResult[v];
    }
}

