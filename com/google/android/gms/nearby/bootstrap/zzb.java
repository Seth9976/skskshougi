package com.google.android.gms.nearby.bootstrap;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfe(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhM(x0);
    }

    static void zza(Device device0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 1, device0.getName(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1000, device0.versionCode);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, device0.getDescription(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, device0.getDeviceId(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, device0.zzwK());
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public Device zzfe(Parcel parcel0) {
        int v = 0;
        String s = null;
        int v1 = zza.zzab(parcel0);
        String s1 = null;
        String s2 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    s2 = zza.zzo(parcel0, v3);
                    break;
                }
                case 2: {
                    s1 = zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 4: {
                    v = zza.zze(parcel0, v3);
                    break;
                }
                case 1000: {
                    v2 = zza.zzg(parcel0, v3);
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
        return new Device(v2, s2, s1, s, ((byte)v));
    }

    public Device[] zzhM(int v) {
        return new Device[v];
    }
}

