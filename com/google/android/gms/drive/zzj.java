package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzau(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcd(x0);
    }

    static void zza(UserMetadata userMetadata0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, userMetadata0.zzCY);
        zzb.zza(parcel0, 2, userMetadata0.zzadH, false);
        zzb.zza(parcel0, 3, userMetadata0.zzadI, false);
        zzb.zza(parcel0, 4, userMetadata0.zzadJ, false);
        zzb.zza(parcel0, 5, userMetadata0.zzadK);
        zzb.zza(parcel0, 6, userMetadata0.zzadL, false);
        zzb.zzH(parcel0, v1);
    }

    public UserMetadata zzau(Parcel parcel0) {
        boolean z = false;
        String s = null;
        int v = zza.zzab(parcel0);
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    s3 = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    s2 = zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 5: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 6: {
                    s = zza.zzo(parcel0, v2);
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
        return new UserMetadata(v1, s3, s2, s1, z, s);
    }

    public UserMetadata[] zzcd(int v) {
        return new UserMetadata[v];
    }
}

