package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcV(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeQ(x0);
    }

    static void zza(SessionRegistrationRequest sessionRegistrationRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, sessionRegistrationRequest0.zzrg(), v, false);
        zzb.zzc(parcel0, 1000, sessionRegistrationRequest0.getVersionCode());
        zzb.zza(parcel0, 2, sessionRegistrationRequest0.zzqU(), false);
        zzb.zza(parcel0, 3, sessionRegistrationRequest0.getPackageName(), false);
        zzb.zzc(parcel0, 4, sessionRegistrationRequest0.zzrp());
        zzb.zzH(parcel0, v1);
    }

    public SessionRegistrationRequest zzcV(Parcel parcel0) {
        int v = 0;
        String s = null;
        int v1 = zza.zzab(parcel0);
        IBinder iBinder0 = null;
        PendingIntent pendingIntent0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    pendingIntent0 = (PendingIntent)zza.zza(parcel0, v3, PendingIntent.CREATOR);
                    break;
                }
                case 2: {
                    iBinder0 = zza.zzp(parcel0, v3);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 4: {
                    v = zza.zzg(parcel0, v3);
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
        return new SessionRegistrationRequest(v2, pendingIntent0, iBinder0, s, v);
    }

    public SessionRegistrationRequest[] zzeQ(int v) {
        return new SessionRegistrationRequest[v];
    }
}

