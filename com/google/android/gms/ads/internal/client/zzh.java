package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzc(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzl(x0);
    }

    static void zza(AdSizeParcel adSizeParcel0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, adSizeParcel0.versionCode);
        zzb.zza(parcel0, 2, adSizeParcel0.zzsm, false);
        zzb.zzc(parcel0, 3, adSizeParcel0.height);
        zzb.zzc(parcel0, 4, adSizeParcel0.heightPixels);
        zzb.zza(parcel0, 5, adSizeParcel0.zzsn);
        zzb.zzc(parcel0, 6, adSizeParcel0.width);
        zzb.zzc(parcel0, 7, adSizeParcel0.widthPixels);
        zzb.zza(parcel0, 8, adSizeParcel0.zzso, v, false);
        zzb.zza(parcel0, 9, adSizeParcel0.zzsp);
        zzb.zzH(parcel0, v1);
    }

    public AdSizeParcel zzc(Parcel parcel0) {
        AdSizeParcel[] arr_adSizeParcel = null;
        boolean z = false;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        int v2 = 0;
        boolean z1 = false;
        int v3 = 0;
        int v4 = 0;
        String s = null;
        int v5 = 0;
        while(parcel0.dataPosition() < v) {
            int v6 = zza.zzaa(parcel0);
            switch(0xFFFF & v6) {
                case 1: {
                    v5 = zza.zzg(parcel0, v6);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v6);
                    break;
                }
                case 3: {
                    v4 = zza.zzg(parcel0, v6);
                    break;
                }
                case 4: {
                    v3 = zza.zzg(parcel0, v6);
                    break;
                }
                case 5: {
                    z1 = zza.zzc(parcel0, v6);
                    break;
                }
                case 6: {
                    v2 = zza.zzg(parcel0, v6);
                    break;
                }
                case 7: {
                    v1 = zza.zzg(parcel0, v6);
                    break;
                }
                case 8: {
                    arr_adSizeParcel = (AdSizeParcel[])zza.zzb(parcel0, v6, AdSizeParcel.CREATOR);
                    break;
                }
                case 9: {
                    z = zza.zzc(parcel0, v6);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v6);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new AdSizeParcel(v5, s, v4, v3, z1, v2, v1, arr_adSizeParcel, z);
    }

    public AdSizeParcel[] zzl(int v) {
        return new AdSizeParcel[v];
    }
}

