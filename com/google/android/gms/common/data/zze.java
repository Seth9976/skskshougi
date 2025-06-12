package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzS(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbj(x0);
    }

    public DataHolder zzS(Parcel parcel0) {
        int v = 0;
        Bundle bundle0 = null;
        int v1 = zza.zzab(parcel0);
        CursorWindow[] arr_cursorWindow = null;
        String[] arr_s = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    arr_s = zza.zzA(parcel0, v3);
                    break;
                }
                case 2: {
                    arr_cursorWindow = (CursorWindow[])zza.zzb(parcel0, v3, CursorWindow.CREATOR);
                    break;
                }
                case 3: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 4: {
                    bundle0 = zza.zzq(parcel0, v3);
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
        DataHolder dataHolder0 = new DataHolder(v2, arr_s, arr_cursorWindow, v, bundle0);
        dataHolder0.zznf();
        return dataHolder0;
    }

    static void zza(DataHolder dataHolder0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, dataHolder0.zzng(), false);
        zzb.zzc(parcel0, 1000, dataHolder0.getVersionCode());
        zzb.zza(parcel0, 2, dataHolder0.zznh(), v, false);
        zzb.zzc(parcel0, 3, dataHolder0.getStatusCode());
        zzb.zza(parcel0, 4, dataHolder0.zznb(), false);
        zzb.zzH(parcel0, v1);
    }

    public DataHolder[] zzbj(int v) {
        return new DataHolder[v];
    }
}

