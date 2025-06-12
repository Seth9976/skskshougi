package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfx(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzim(x0);
    }

    static void zza(UnsubscribeRequest unsubscribeRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, unsubscribeRequest0.zzCY);
        zzb.zza(parcel0, 2, unsubscribeRequest0.zzxb(), false);
        zzb.zza(parcel0, 3, unsubscribeRequest0.zzxa(), false);
        zzb.zza(parcel0, 4, unsubscribeRequest0.zzaGh, v, false);
        zzb.zzc(parcel0, 5, unsubscribeRequest0.zzaGi);
        zzb.zza(parcel0, 6, unsubscribeRequest0.zzayp, false);
        zzb.zza(parcel0, 7, unsubscribeRequest0.zzaGe, false);
        zzb.zzH(parcel0, v1);
    }

    public UnsubscribeRequest zzfx(Parcel parcel0) {
        int v = 0;
        String s = null;
        int v1 = zza.zzab(parcel0);
        String s1 = null;
        PendingIntent pendingIntent0 = null;
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    iBinder1 = zza.zzp(parcel0, v3);
                    break;
                }
                case 3: {
                    iBinder0 = zza.zzp(parcel0, v3);
                    break;
                }
                case 4: {
                    pendingIntent0 = (PendingIntent)zza.zza(parcel0, v3, PendingIntent.CREATOR);
                    break;
                }
                case 5: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 6: {
                    s1 = zza.zzo(parcel0, v3);
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
        return new UnsubscribeRequest(v2, iBinder1, iBinder0, pendingIntent0, v, s1, s);
    }

    public UnsubscribeRequest[] zzim(int v) {
        return new UnsubscribeRequest[v];
    }
}

