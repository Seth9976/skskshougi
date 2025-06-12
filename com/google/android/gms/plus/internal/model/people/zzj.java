package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfV(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zziL(x0);
    }

    static void zza(UrlsEntity personEntity$UrlsEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        Set set0 = personEntity$UrlsEntity0.zzaHQ;
        if(set0.contains(1)) {
            zzb.zzc(parcel0, 1, personEntity$UrlsEntity0.zzCY);
        }
        if(set0.contains(3)) {
            zzb.zzc(parcel0, 3, 4);
        }
        if(set0.contains(4)) {
            zzb.zza(parcel0, 4, personEntity$UrlsEntity0.mValue, true);
        }
        if(set0.contains(5)) {
            zzb.zza(parcel0, 5, personEntity$UrlsEntity0.zzaEH, true);
        }
        if(set0.contains(6)) {
            zzb.zzc(parcel0, 6, personEntity$UrlsEntity0.zzSq);
        }
        zzb.zzH(parcel0, v1);
    }

    public UrlsEntity zzfV(Parcel parcel0) {
        String s = null;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        HashSet hashSet0 = new HashSet();
        int v2 = 0;
        String s1 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    hashSet0.add(1);
                    break;
                }
                case 3: {
                    v = zza.zzg(parcel0, v4);
                    hashSet0.add(3);
                    break;
                }
                case 4: {
                    s = zza.zzo(parcel0, v4);
                    hashSet0.add(4);
                    break;
                }
                case 5: {
                    s1 = zza.zzo(parcel0, v4);
                    hashSet0.add(5);
                    break;
                }
                case 6: {
                    v2 = zza.zzg(parcel0, v4);
                    hashSet0.add(6);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new UrlsEntity(hashSet0, v3, s1, v2, s, v);
    }

    public UrlsEntity[] zziL(int v) {
        return new UrlsEntity[v];
    }
}

