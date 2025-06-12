package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzae implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zze(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzo(x0);
    }

    static void zza(SearchAdRequestParcel searchAdRequestParcel0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, searchAdRequestParcel0.versionCode);
        zzb.zzc(parcel0, 2, searchAdRequestParcel0.zzth);
        zzb.zzc(parcel0, 3, searchAdRequestParcel0.backgroundColor);
        zzb.zzc(parcel0, 4, searchAdRequestParcel0.zzti);
        zzb.zzc(parcel0, 5, searchAdRequestParcel0.zztj);
        zzb.zzc(parcel0, 6, searchAdRequestParcel0.zztk);
        zzb.zzc(parcel0, 7, searchAdRequestParcel0.zztl);
        zzb.zzc(parcel0, 8, searchAdRequestParcel0.zztm);
        zzb.zzc(parcel0, 9, searchAdRequestParcel0.zztn);
        zzb.zza(parcel0, 10, searchAdRequestParcel0.zzto, false);
        zzb.zzc(parcel0, 11, searchAdRequestParcel0.zztp);
        zzb.zza(parcel0, 12, searchAdRequestParcel0.zztq, false);
        zzb.zzc(parcel0, 13, searchAdRequestParcel0.zztr);
        zzb.zzc(parcel0, 14, searchAdRequestParcel0.zzts);
        zzb.zza(parcel0, 15, searchAdRequestParcel0.zztt, false);
        zzb.zzH(parcel0, v1);
    }

    public SearchAdRequestParcel zze(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        String s = null;
        int v10 = 0;
        String s1 = null;
        int v11 = 0;
        int v12 = 0;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v13 = zza.zzaa(parcel0);
            switch(0xFFFF & v13) {
                case 1: {
                    v1 = zza.zzg(parcel0, v13);
                    break;
                }
                case 2: {
                    v2 = zza.zzg(parcel0, v13);
                    break;
                }
                case 3: {
                    v3 = zza.zzg(parcel0, v13);
                    break;
                }
                case 4: {
                    v4 = zza.zzg(parcel0, v13);
                    break;
                }
                case 5: {
                    v5 = zza.zzg(parcel0, v13);
                    break;
                }
                case 6: {
                    v6 = zza.zzg(parcel0, v13);
                    break;
                }
                case 7: {
                    v7 = zza.zzg(parcel0, v13);
                    break;
                }
                case 8: {
                    v8 = zza.zzg(parcel0, v13);
                    break;
                }
                case 9: {
                    v9 = zza.zzg(parcel0, v13);
                    break;
                }
                case 10: {
                    s = zza.zzo(parcel0, v13);
                    break;
                }
                case 11: {
                    v10 = zza.zzg(parcel0, v13);
                    break;
                }
                case 12: {
                    s1 = zza.zzo(parcel0, v13);
                    break;
                }
                case 13: {
                    v11 = zza.zzg(parcel0, v13);
                    break;
                }
                case 14: {
                    v12 = zza.zzg(parcel0, v13);
                    break;
                }
                case 15: {
                    s2 = zza.zzo(parcel0, v13);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v13);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new SearchAdRequestParcel(v1, v2, v3, v4, v5, v6, v7, v8, v9, s, v10, s1, v11, v12, s2);
    }

    public SearchAdRequestParcel[] zzo(int v) {
        return new SearchAdRequestParcel[v];
    }
}

