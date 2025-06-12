package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Permission;
import java.util.ArrayList;

public class zzaj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaV(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcK(x0);
    }

    static void zza(GetPermissionsResponse getPermissionsResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, getPermissionsResponse0.zzCY);
        zzb.zzc(parcel0, 2, getPermissionsResponse0.zzafO, false);
        zzb.zzc(parcel0, 3, getPermissionsResponse0.zzws);
        zzb.zzH(parcel0, v1);
    }

    public GetPermissionsResponse zzaV(Parcel parcel0) {
        int v = 0;
        int v1 = zza.zzab(parcel0);
        ArrayList arrayList0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    arrayList0 = zza.zzc(parcel0, v3, Permission.CREATOR);
                    break;
                }
                case 3: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new GetPermissionsResponse(v2, arrayList0, v);
    }

    public GetPermissionsResponse[] zzcK(int v) {
        return new GetPermissionsResponse[v];
    }
}

