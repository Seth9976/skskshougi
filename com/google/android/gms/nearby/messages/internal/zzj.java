package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

public class zzj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfv(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzik(x0);
    }

    static void zza(SubscribeRequest subscribeRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, subscribeRequest0.zzCY);
        zzb.zza(parcel0, 2, subscribeRequest0.zzxb(), false);
        zzb.zza(parcel0, 3, subscribeRequest0.zzaGc, v, false);
        zzb.zza(parcel0, 4, subscribeRequest0.zzxa(), false);
        zzb.zza(parcel0, 5, subscribeRequest0.zzaGg, v, false);
        zzb.zza(parcel0, 6, subscribeRequest0.zzaGh, v, false);
        zzb.zzc(parcel0, 7, subscribeRequest0.zzaGi);
        zzb.zza(parcel0, 8, subscribeRequest0.zzayp, false);
        zzb.zza(parcel0, 9, subscribeRequest0.zzaGe, false);
        zzb.zzH(parcel0, v1);
    }

    public SubscribeRequest zzfv(Parcel parcel0) {
        int v = 0;
        String s = null;
        int v1 = zza.zzab(parcel0);
        String s1 = null;
        PendingIntent pendingIntent0 = null;
        MessageFilter messageFilter0 = null;
        IBinder iBinder0 = null;
        Strategy strategy0 = null;
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
                    strategy0 = (Strategy)zza.zza(parcel0, v3, Strategy.CREATOR);
                    break;
                }
                case 4: {
                    iBinder0 = zza.zzp(parcel0, v3);
                    break;
                }
                case 5: {
                    messageFilter0 = (MessageFilter)zza.zza(parcel0, v3, MessageFilter.CREATOR);
                    break;
                }
                case 6: {
                    pendingIntent0 = (PendingIntent)zza.zza(parcel0, v3, PendingIntent.CREATOR);
                    break;
                }
                case 7: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 8: {
                    s1 = zza.zzo(parcel0, v3);
                    break;
                }
                case 9: {
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
        return new SubscribeRequest(v2, iBinder1, strategy0, iBinder0, messageFilter0, pendingIntent0, v, s1, s);
    }

    public SubscribeRequest[] zzik(int v) {
        return new SubscribeRequest[v];
    }
}

