package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveSpace;
import java.util.ArrayList;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzax(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcg(x0);
    }

    static void zza(ChangesAvailableOptions changesAvailableOptions0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, changesAvailableOptions0.zzCY);
        zzb.zzc(parcel0, 2, changesAvailableOptions0.zzadP);
        zzb.zza(parcel0, 3, changesAvailableOptions0.zzadQ);
        zzb.zzc(parcel0, 4, changesAvailableOptions0.zzadR, false);
        zzb.zzH(parcel0, v1);
    }

    public ChangesAvailableOptions zzax(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        ArrayList arrayList0 = null;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                case 3: {
                    z = zza.zzc(parcel0, v3);
                    break;
                }
                case 4: {
                    arrayList0 = zza.zzc(parcel0, v3, DriveSpace.CREATOR);
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
        return new ChangesAvailableOptions(v2, v1, z, arrayList0);
    }

    public ChangesAvailableOptions[] zzcg(int v) {
        return new ChangesAvailableOptions[v];
    }
}

