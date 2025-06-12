package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class MostRecentGameInfoEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdG(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzfO(x0);
    }

    static void zza(MostRecentGameInfoEntity mostRecentGameInfoEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, mostRecentGameInfoEntity0.zztu(), false);
        zzb.zzc(parcel0, 1000, mostRecentGameInfoEntity0.getVersionCode());
        zzb.zza(parcel0, 2, mostRecentGameInfoEntity0.zztv(), false);
        zzb.zza(parcel0, 3, mostRecentGameInfoEntity0.zztw());
        zzb.zza(parcel0, 4, mostRecentGameInfoEntity0.zztx(), v, false);
        zzb.zza(parcel0, 5, mostRecentGameInfoEntity0.zzty(), v, false);
        zzb.zza(parcel0, 6, mostRecentGameInfoEntity0.zztz(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public MostRecentGameInfoEntity zzdG(Parcel parcel0) {
        Uri uri0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        long v2 = 0L;
        Uri uri1 = null;
        Uri uri2 = null;
        String s = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
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
                    v2 = zza.zzi(parcel0, v3);
                    break;
                }
                case 4: {
                    uri2 = (Uri)zza.zza(parcel0, v3, Uri.CREATOR);
                    break;
                }
                case 5: {
                    uri1 = (Uri)zza.zza(parcel0, v3, Uri.CREATOR);
                    break;
                }
                case 6: {
                    uri0 = (Uri)zza.zza(parcel0, v3, Uri.CREATOR);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v3);
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
        return new MostRecentGameInfoEntity(v1, s1, s, v2, uri2, uri1, uri0);
    }

    public MostRecentGameInfoEntity[] zzfO(int v) {
        return new MostRecentGameInfoEntity[v];
    }
}

