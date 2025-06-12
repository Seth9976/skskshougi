package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.internal.zzkx;
import java.util.ArrayList;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgA(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjF(x0);
    }

    static void zza(LabelValueRow labelValueRow0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, labelValueRow0.getVersionCode());
        zzb.zza(parcel0, 2, labelValueRow0.zzaSx, false);
        zzb.zza(parcel0, 3, labelValueRow0.zzaSy, false);
        zzb.zzc(parcel0, 4, labelValueRow0.zzaSz, false);
        zzb.zzH(parcel0, v1);
    }

    public LabelValueRow zzgA(Parcel parcel0) {
        String s = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        ArrayList arrayList0 = zzkx.zzoP();
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    arrayList0 = zza.zzc(parcel0, v2, LabelValue.CREATOR);
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
        return new LabelValueRow(v1, s1, s, arrayList0);
    }

    public LabelValueRow[] zzjF(int v) {
        return new LabelValueRow[v];
    }
}

