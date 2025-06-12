package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzay implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzhj(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzkr(x0);
    }

    static void zza(NodeParcelable nodeParcelable0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, nodeParcelable0.zzCY);
        zzb.zza(parcel0, 2, nodeParcelable0.getId(), false);
        zzb.zza(parcel0, 3, nodeParcelable0.getDisplayName(), false);
        zzb.zzc(parcel0, 4, nodeParcelable0.getHopCount());
        zzb.zza(parcel0, 5, nodeParcelable0.isNearby());
        zzb.zzH(parcel0, v1);
    }

    public NodeParcelable zzhj(Parcel parcel0) {
        String s = null;
        boolean z = false;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s1 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    s1 = zza.zzo(parcel0, v3);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v3);
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
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new NodeParcelable(v2, s1, s, v1, z);
    }

    public NodeParcelable[] zzkr(int v) {
        return new NodeParcelable[v];
    }
}

