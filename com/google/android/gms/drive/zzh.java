package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzas(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcb(x0);
    }

    static void zza(Permission permission0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, permission0.zzCY);
        zzb.zza(parcel0, 2, permission0.zzpo(), false);
        zzb.zzc(parcel0, 3, permission0.zzpp());
        zzb.zza(parcel0, 4, permission0.zzpq(), false);
        zzb.zza(parcel0, 5, permission0.zzpr(), false);
        zzb.zzc(parcel0, 6, permission0.getRole());
        zzb.zza(parcel0, 7, permission0.zzps());
        zzb.zzH(parcel0, v1);
    }

    public Permission zzas(Parcel parcel0) {
        String s = null;
        boolean z = false;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s1 = null;
        int v2 = 0;
        String s2 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    s2 = zza.zzo(parcel0, v4);
                    break;
                }
                case 3: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 4: {
                    s1 = zza.zzo(parcel0, v4);
                    break;
                }
                case 5: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 6: {
                    v1 = zza.zzg(parcel0, v4);
                    break;
                }
                case 7: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new Permission(v3, s2, v2, s1, s, v1, z);
    }

    public Permission[] zzcb(int v) {
        return new Permission[v];
    }
}

