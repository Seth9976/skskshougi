package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzx(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzak(x0);
    }

    static void zza(RegisterSectionInfo registerSectionInfo0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, registerSectionInfo0.name, false);
        zzb.zzc(parcel0, 1000, registerSectionInfo0.zzCY);
        zzb.zza(parcel0, 2, registerSectionInfo0.zzNs, false);
        zzb.zza(parcel0, 3, registerSectionInfo0.zzNt);
        zzb.zzc(parcel0, 4, registerSectionInfo0.weight);
        zzb.zza(parcel0, 5, registerSectionInfo0.zzNu);
        zzb.zza(parcel0, 6, registerSectionInfo0.zzNv, false);
        zzb.zza(parcel0, 7, registerSectionInfo0.zzNw, v, false);
        zzb.zza(parcel0, 8, registerSectionInfo0.zzNx, false);
        zzb.zza(parcel0, 11, registerSectionInfo0.zzNy, false);
        zzb.zzH(parcel0, v1);
    }

    public RegisterSectionInfo[] zzak(int v) {
        return new RegisterSectionInfo[v];
    }

    public RegisterSectionInfo zzx(Parcel parcel0) {
        boolean z = false;
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 1;
        int[] arr_v = null;
        Feature[] arr_feature = null;
        String s1 = null;
        boolean z1 = false;
        String s2 = null;
        String s3 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    s3 = zza.zzo(parcel0, v3);
                    break;
                }
                case 2: {
                    s2 = zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    z1 = zza.zzc(parcel0, v3);
                    break;
                }
                case 4: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                case 5: {
                    z = zza.zzc(parcel0, v3);
                    break;
                }
                case 6: {
                    s1 = zza.zzo(parcel0, v3);
                    break;
                }
                case 7: {
                    arr_feature = (Feature[])zza.zzb(parcel0, v3, Feature.CREATOR);
                    break;
                }
                case 8: {
                    arr_v = zza.zzu(parcel0, v3);
                    break;
                }
                case 11: {
                    s = zza.zzo(parcel0, v3);
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
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new RegisterSectionInfo(v2, s3, s2, z1, v1, z, s1, arr_feature, arr_v, s);
    }
}

