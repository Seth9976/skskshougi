package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.bootstrap.Device;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzff(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhN(x0);
    }

    static void zza(ConnectRequest connectRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, connectRequest0.zzwM(), v, false);
        zzb.zzc(parcel0, 1000, connectRequest0.versionCode);
        zzb.zza(parcel0, 2, connectRequest0.getName(), false);
        zzb.zza(parcel0, 3, connectRequest0.getDescription(), false);
        zzb.zza(parcel0, 4, connectRequest0.zzwO(), false);
        zzb.zza(parcel0, 5, connectRequest0.zzwP(), false);
        zzb.zza(parcel0, 6, connectRequest0.zzqU(), false);
        zzb.zza(parcel0, 7, connectRequest0.zzwK());
        zzb.zza(parcel0, 8, connectRequest0.zzwN());
        zzb.zza(parcel0, 9, connectRequest0.getToken(), false);
        zzb.zzH(parcel0, v1);
    }

    public ConnectRequest zzff(Parcel parcel0) {
        int v = 0;
        IBinder iBinder0 = null;
        int v1 = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        long v2 = 0L;
        IBinder iBinder1 = null;
        IBinder iBinder2 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        Device device0 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    device0 = (Device)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v4, Device.CREATOR);
                    break;
                }
                case 2: {
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v4);
                    break;
                }
                case 3: {
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v4);
                    break;
                }
                case 4: {
                    iBinder2 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel0, v4);
                    break;
                }
                case 5: {
                    iBinder1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel0, v4);
                    break;
                }
                case 6: {
                    iBinder0 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel0, v4);
                    break;
                }
                case 7: {
                    v = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel0, v4);
                    break;
                }
                case 8: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel0, v4);
                    break;
                }
                case 9: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v4);
                    break;
                }
                case 1000: {
                    v3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v4);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new ConnectRequest(v3, device0, s2, s1, ((byte)v), v2, s, iBinder2, iBinder1, iBinder0);
    }

    public ConnectRequest[] zzhN(int v) {
        return new ConnectRequest[v];
    }
}

