package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzb(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzk(x0);
    }

    static void zza(AdRequestParcel adRequestParcel0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, adRequestParcel0.versionCode);
        zzb.zza(parcel0, 2, adRequestParcel0.zzrX);
        zzb.zza(parcel0, 3, adRequestParcel0.extras, false);
        zzb.zzc(parcel0, 4, adRequestParcel0.zzrY);
        zzb.zzb(parcel0, 5, adRequestParcel0.zzrZ, false);
        zzb.zza(parcel0, 6, adRequestParcel0.zzsa);
        zzb.zzc(parcel0, 7, adRequestParcel0.zzsb);
        zzb.zza(parcel0, 8, adRequestParcel0.zzsc);
        zzb.zza(parcel0, 9, adRequestParcel0.zzsd, false);
        zzb.zza(parcel0, 10, adRequestParcel0.zzse, v, false);
        zzb.zza(parcel0, 11, adRequestParcel0.zzsf, v, false);
        zzb.zza(parcel0, 12, adRequestParcel0.zzsg, false);
        zzb.zza(parcel0, 13, adRequestParcel0.zzsh, false);
        zzb.zza(parcel0, 14, adRequestParcel0.zzsi, false);
        zzb.zzb(parcel0, 15, adRequestParcel0.zzsj, false);
        zzb.zza(parcel0, 16, adRequestParcel0.zzsk, false);
        zzb.zzH(parcel0, v1);
    }

    public AdRequestParcel zzb(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        long v2 = 0L;
        Bundle bundle0 = null;
        int v3 = 0;
        ArrayList arrayList0 = null;
        boolean z = false;
        int v4 = 0;
        boolean z1 = false;
        String s = null;
        SearchAdRequestParcel searchAdRequestParcel0 = null;
        Location location0 = null;
        String s1 = null;
        Bundle bundle1 = null;
        Bundle bundle2 = null;
        ArrayList arrayList1 = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v5 = zza.zzaa(parcel0);
            switch(0xFFFF & v5) {
                case 1: {
                    v1 = zza.zzg(parcel0, v5);
                    break;
                }
                case 2: {
                    v2 = zza.zzi(parcel0, v5);
                    break;
                }
                case 3: {
                    bundle0 = zza.zzq(parcel0, v5);
                    break;
                }
                case 4: {
                    v3 = zza.zzg(parcel0, v5);
                    break;
                }
                case 5: {
                    arrayList0 = zza.zzC(parcel0, v5);
                    break;
                }
                case 6: {
                    z = zza.zzc(parcel0, v5);
                    break;
                }
                case 7: {
                    v4 = zza.zzg(parcel0, v5);
                    break;
                }
                case 8: {
                    z1 = zza.zzc(parcel0, v5);
                    break;
                }
                case 9: {
                    s = zza.zzo(parcel0, v5);
                    break;
                }
                case 10: {
                    searchAdRequestParcel0 = (SearchAdRequestParcel)zza.zza(parcel0, v5, SearchAdRequestParcel.CREATOR);
                    break;
                }
                case 11: {
                    location0 = (Location)zza.zza(parcel0, v5, Location.CREATOR);
                    break;
                }
                case 12: {
                    s1 = zza.zzo(parcel0, v5);
                    break;
                }
                case 13: {
                    bundle1 = zza.zzq(parcel0, v5);
                    break;
                }
                case 14: {
                    bundle2 = zza.zzq(parcel0, v5);
                    break;
                }
                case 15: {
                    arrayList1 = zza.zzC(parcel0, v5);
                    break;
                }
                case 16: {
                    s2 = zza.zzo(parcel0, v5);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new AdRequestParcel(v1, v2, bundle0, v3, arrayList0, z, v4, z1, s, searchAdRequestParcel0, location0, s1, bundle1, bundle2, arrayList1, s2);
    }

    public AdRequestParcel[] zzk(int v) {
        return new AdRequestParcel[v];
    }
}

