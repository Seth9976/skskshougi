package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeA(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzha(x0);
    }

    static void zza(PlaceLocalization placeLocalization0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, placeLocalization0.name, false);
        zzb.zzc(parcel0, 1000, placeLocalization0.versionCode);
        zzb.zza(parcel0, 2, placeLocalization0.zzaAM, false);
        zzb.zza(parcel0, 3, placeLocalization0.zzaAN, false);
        zzb.zza(parcel0, 4, placeLocalization0.zzaAO, false);
        zzb.zzb(parcel0, 5, placeLocalization0.zzaAP, false);
        zzb.zzH(parcel0, v1);
    }

    public PlaceLocalization zzeA(Parcel parcel0) {
        ArrayList arrayList0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    s3 = zza.zzo(parcel0, v2);
                    break;
                }
                case 2: {
                    s2 = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 5: {
                    arrayList0 = zza.zzC(parcel0, v2);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v2);
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
        return new PlaceLocalization(v1, s3, s2, s1, s, arrayList0);
    }

    public PlaceLocalization[] zzha(int v) {
        return new PlaceLocalization[v];
    }
}

