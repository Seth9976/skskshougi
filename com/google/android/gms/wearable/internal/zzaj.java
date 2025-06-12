package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzaj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzhb(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzkj(x0);
    }

    static void zza(GetCloudSyncSettingResponse getCloudSyncSettingResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, getCloudSyncSettingResponse0.versionCode);
        zzb.zzc(parcel0, 2, getCloudSyncSettingResponse0.statusCode);
        zzb.zza(parcel0, 3, getCloudSyncSettingResponse0.enabled);
        zzb.zzH(parcel0, v1);
    }

    public GetCloudSyncSettingResponse zzhb(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                case 3: {
                    z = zza.zzc(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new GetCloudSyncSettingResponse(v2, v1, z);
    }

    public GetCloudSyncSettingResponse[] zzkj(int v) {
        return new GetCloudSyncSettingResponse[v];
    }
}

