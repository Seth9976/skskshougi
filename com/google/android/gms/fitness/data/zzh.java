package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcp(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzei(x0);
    }

    static void zza(Device device0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, device0.getManufacturer(), false);
        zzb.zzc(parcel0, 1000, device0.getVersionCode());
        zzb.zza(parcel0, 2, device0.getModel(), false);
        zzb.zza(parcel0, 3, device0.getVersion(), false);
        zzb.zza(parcel0, 4, device0.zzqG(), false);
        zzb.zzc(parcel0, 5, device0.getType());
        zzb.zzc(parcel0, 6, device0.zzqE());
        zzb.zzH(parcel0, v1);
    }

    public Device zzcp(Parcel parcel0) {
        int v = 0;
        String s = null;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    s3 = zza.zzo(parcel0, v4);
                    break;
                }
                case 2: {
                    s2 = zza.zzo(parcel0, v4);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v4);
                    break;
                }
                case 4: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 5: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 6: {
                    v = zza.zzg(parcel0, v4);
                    break;
                }
                case 1000: {
                    v3 = zza.zzg(parcel0, v4);
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
        return new Device(v3, s3, s2, s1, s, v2, v);
    }

    public Device[] zzei(int v) {
        return new Device[v];
    }
}

