package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzF(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzav(x0);
    }

    public DeleteRequest zzF(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Credential credential0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    credential0 = (Credential)zza.zza(parcel0, v2, Credential.CREATOR);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v2);
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
        return new DeleteRequest(v1, credential0);
    }

    static void zza(DeleteRequest deleteRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, deleteRequest0.getCredential(), v, false);
        zzb.zzc(parcel0, 1000, deleteRequest0.zzCY);
        zzb.zzH(parcel0, v1);
    }

    public DeleteRequest[] zzav(int v) {
        return new DeleteRequest[v];
    }
}

