package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgi(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjk(x0);
    }

    static void zza(LineItem lineItem0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, lineItem0.getVersionCode());
        zzb.zza(parcel0, 2, lineItem0.description, false);
        zzb.zza(parcel0, 3, lineItem0.zzaQI, false);
        zzb.zza(parcel0, 4, lineItem0.zzaQJ, false);
        zzb.zza(parcel0, 5, lineItem0.zzaQf, false);
        zzb.zzc(parcel0, 6, lineItem0.zzaQK);
        zzb.zza(parcel0, 7, lineItem0.zzaQg, false);
        zzb.zzH(parcel0, v1);
    }

    public LineItem zzgi(Parcel parcel0) {
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
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    s4 = zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    s3 = zza.zzo(parcel0, v3);
                    break;
                }
                case 4: {
                    s2 = zza.zzo(parcel0, v3);
                    break;
                }
                case 5: {
                    s1 = zza.zzo(parcel0, v3);
                    break;
                }
                case 6: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 7: {
                    s = zza.zzo(parcel0, v3);
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
        return new LineItem(v2, s4, s3, s2, s1, v, s);
    }

    public LineItem[] zzjk(int v) {
        return new LineItem[v];
    }
}

