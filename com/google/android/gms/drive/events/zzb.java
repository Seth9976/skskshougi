package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaw(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcf(x0);
    }

    static void zza(ChangesAvailableEvent changesAvailableEvent0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, changesAvailableEvent0.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, changesAvailableEvent0.zzOx, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, changesAvailableEvent0.zzadO, v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public ChangesAvailableEvent zzaw(Parcel parcel0) {
        ChangesAvailableOptions changesAvailableOptions0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    changesAvailableOptions0 = (ChangesAvailableOptions)zza.zza(parcel0, v2, ChangesAvailableOptions.CREATOR);
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
        return new ChangesAvailableEvent(v1, s, changesAvailableOptions0);
    }

    public ChangesAvailableEvent[] zzcf(int v) {
        return new ChangesAvailableEvent[v];
    }
}

