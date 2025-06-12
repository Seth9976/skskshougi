package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeB(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhb(x0);
    }

    static void zza(PlacesParams placesParams0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, placesParams0.zzaAZ, false);
        zzb.zzc(parcel0, 1000, placesParams0.versionCode);
        zzb.zza(parcel0, 2, placesParams0.zzaBa, false);
        zzb.zza(parcel0, 3, placesParams0.zzaBb, false);
        zzb.zza(parcel0, 4, placesParams0.zzazX, false);
        zzb.zza(parcel0, 5, placesParams0.zzaBc, false);
        zzb.zzc(parcel0, 6, placesParams0.zzaBd);
        zzb.zzH(parcel0, v1);
    }

    public PlacesParams zzeB(Parcel parcel0) {
        int v = 0;
        String s = null;
        int v1 = zza.zzab(parcel0);
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    s4 = zza.zzo(parcel0, v3);
                    break;
                }
                case 2: {
                    s3 = zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    s2 = zza.zzo(parcel0, v3);
                    break;
                }
                case 4: {
                    s1 = zza.zzo(parcel0, v3);
                    break;
                }
                case 5: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 6: {
                    v = zza.zzg(parcel0, v3);
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
        return new PlacesParams(v2, s4, s3, s2, s1, s, v);
    }

    public PlacesParams[] zzhb(int v) {
        return new PlacesParams[v];
    }
}

