package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfj(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhR(x0);
    }

    static void zza(EnableTargetRequest enableTargetRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, enableTargetRequest0.getName(), false);
        zzb.zzc(parcel0, 1000, enableTargetRequest0.versionCode);
        zzb.zza(parcel0, 2, enableTargetRequest0.getDescription(), false);
        zzb.zza(parcel0, 3, enableTargetRequest0.zzwO(), false);
        zzb.zza(parcel0, 4, enableTargetRequest0.zzwP(), false);
        zzb.zza(parcel0, 5, enableTargetRequest0.zzqU(), false);
        zzb.zza(parcel0, 6, enableTargetRequest0.zzwK());
        zzb.zzH(parcel0, v1);
    }

    public EnableTargetRequest zzfj(Parcel parcel0) {
        int v = 0;
        IBinder iBinder0 = null;
        int v1 = zza.zzab(parcel0);
        IBinder iBinder1 = null;
        IBinder iBinder2 = null;
        String s = null;
        String s1 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    s1 = zza.zzo(parcel0, v3);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    iBinder2 = zza.zzp(parcel0, v3);
                    break;
                }
                case 4: {
                    iBinder1 = zza.zzp(parcel0, v3);
                    break;
                }
                case 5: {
                    iBinder0 = zza.zzp(parcel0, v3);
                    break;
                }
                case 6: {
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
        return new EnableTargetRequest(v2, s1, s, ((byte)v), iBinder2, iBinder1, iBinder0);
    }

    public EnableTargetRequest[] zzhR(int v) {
        return new EnableTargetRequest[v];
    }
}

