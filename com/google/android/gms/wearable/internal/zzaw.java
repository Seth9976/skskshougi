package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzaw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzhi(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzkq(x0);
    }

    static void zza(MessageEventParcelable messageEventParcelable0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, messageEventParcelable0.zzCY);
        zzb.zzc(parcel0, 2, messageEventParcelable0.getRequestId());
        zzb.zza(parcel0, 3, messageEventParcelable0.getPath(), false);
        zzb.zza(parcel0, 4, messageEventParcelable0.getData(), false);
        zzb.zza(parcel0, 5, messageEventParcelable0.getSourceNodeId(), false);
        zzb.zzH(parcel0, v1);
    }

    public MessageEventParcelable zzhi(Parcel parcel0) {
        int v = 0;
        String s = null;
        int v1 = zza.zzab(parcel0);
        byte[] arr_b = null;
        String s1 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v3);
                    break;
                }
                case 4: {
                    arr_b = zza.zzr(parcel0, v3);
                    break;
                }
                case 5: {
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
        return new MessageEventParcelable(v2, v, s1, arr_b, s);
    }

    public MessageEventParcelable[] zzkq(int v) {
        return new MessageEventParcelable[v];
    }
}

