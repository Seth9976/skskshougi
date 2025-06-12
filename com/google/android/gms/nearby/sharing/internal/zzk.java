package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfF(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziu(x0);
    }

    static void zza(TrustedDevicesRequest trustedDevicesRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, trustedDevicesRequest0.versionCode);
        zzb.zza(parcel0, 2, trustedDevicesRequest0.zzaGv, false);
        zzb.zza(parcel0, 3, trustedDevicesRequest0.zzaGw, false);
        zzb.zza(parcel0, 4, trustedDevicesRequest0.zzxa(), false);
        zzb.zzH(parcel0, v1);
    }

    public TrustedDevicesRequest zzfF(Parcel parcel0) {
        IBinder iBinder0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        byte[] arr_b = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    arr_b = zza.zzr(parcel0, v2);
                    break;
                }
                case 4: {
                    iBinder0 = zza.zzp(parcel0, v2);
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
        return new TrustedDevicesRequest(v1, s, arr_b, iBinder0);
    }

    public TrustedDevicesRequest[] zziu(int v) {
        return new TrustedDevicesRequest[v];
    }
}

