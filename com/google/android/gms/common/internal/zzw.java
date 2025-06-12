package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzY(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzby(x0);
    }

    public ResolveAccountResponse zzY(Parcel parcel0) {
        ConnectionResult connectionResult0 = null;
        boolean z = false;
        int v = zza.zzab(parcel0);
        boolean z1 = false;
        IBinder iBinder0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 3: {
                    connectionResult0 = (ConnectionResult)zza.zza(parcel0, v2, ConnectionResult.CREATOR);
                    break;
                }
                case 4: {
                    z1 = zza.zzc(parcel0, v2);
                    break;
                }
                case 5: {
                    z = zza.zzc(parcel0, v2);
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
        return new ResolveAccountResponse(v1, iBinder0, connectionResult0, z1, z);
    }

    static void zza(ResolveAccountResponse resolveAccountResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, resolveAccountResponse0.zzCY);
        zzb.zza(parcel0, 2, resolveAccountResponse0.zzZO, false);
        zzb.zza(parcel0, 3, resolveAccountResponse0.zzoa(), v, false);
        zzb.zza(parcel0, 4, resolveAccountResponse0.zzob());
        zzb.zza(parcel0, 5, resolveAccountResponse0.zzoc());
        zzb.zzH(parcel0, v1);
    }

    public ResolveAccountResponse[] zzby(int v) {
        return new ResolveAccountResponse[v];
    }
}

