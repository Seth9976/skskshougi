package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzK(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzaA(x0);
    }

    public CastDevice zzK(Parcel parcel0) {
        int v = 0;
        ArrayList arrayList0 = null;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        int v3 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        int v4 = 0;
        while(parcel0.dataPosition() < v1) {
            int v5 = zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    v4 = zza.zzg(parcel0, v5);
                    break;
                }
                case 2: {
                    s4 = zza.zzo(parcel0, v5);
                    break;
                }
                case 3: {
                    s3 = zza.zzo(parcel0, v5);
                    break;
                }
                case 4: {
                    s2 = zza.zzo(parcel0, v5);
                    break;
                }
                case 5: {
                    s1 = zza.zzo(parcel0, v5);
                    break;
                }
                case 6: {
                    s = zza.zzo(parcel0, v5);
                    break;
                }
                case 7: {
                    v3 = zza.zzg(parcel0, v5);
                    break;
                }
                case 8: {
                    arrayList0 = zza.zzc(parcel0, v5, WebImage.CREATOR);
                    break;
                }
                case 9: {
                    v2 = zza.zzg(parcel0, v5);
                    break;
                }
                case 10: {
                    v = zza.zzg(parcel0, v5);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new CastDevice(v4, s4, s3, s2, s1, s, v3, arrayList0, v2, v);
    }

    static void zza(CastDevice castDevice0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, castDevice0.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, castDevice0.getDeviceId(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, castDevice0.zzQM, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, castDevice0.getFriendlyName(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 5, castDevice0.getModelName(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 6, castDevice0.getDeviceVersion(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 7, castDevice0.getServicePort());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 8, castDevice0.getIcons(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 9, castDevice0.getCapabilities());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 10, castDevice0.getStatus());
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public CastDevice[] zzaA(int v) {
        return new CastDevice[v];
    }
}

