package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzgM(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzjR(x0);
    }

    static void zza(AncsNotificationParcelable ancsNotificationParcelable0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, ancsNotificationParcelable0.zzCY);
        zzb.zzc(parcel0, 2, ancsNotificationParcelable0.getId());
        zzb.zza(parcel0, 3, ancsNotificationParcelable0.zzsK(), false);
        zzb.zza(parcel0, 4, ancsNotificationParcelable0.zzAU(), false);
        zzb.zza(parcel0, 5, ancsNotificationParcelable0.zzAV(), false);
        zzb.zza(parcel0, 6, ancsNotificationParcelable0.getTitle(), false);
        zzb.zza(parcel0, 7, ancsNotificationParcelable0.zzsb(), false);
        zzb.zza(parcel0, 8, ancsNotificationParcelable0.getDisplayName(), false);
        zzb.zza(parcel0, 9, ancsNotificationParcelable0.zzAW());
        zzb.zza(parcel0, 10, ancsNotificationParcelable0.zzAX());
        zzb.zza(parcel0, 11, ancsNotificationParcelable0.zzAY());
        zzb.zza(parcel0, 12, ancsNotificationParcelable0.zzAZ());
        zzb.zzH(parcel0, v1);
    }

    public AncsNotificationParcelable zzgM(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        int v2 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        while(parcel0.dataPosition() < v) {
            int v7 = zza.zzaa(parcel0);
            switch(0xFFFF & v7) {
                case 1: {
                    v1 = zza.zzg(parcel0, v7);
                    break;
                }
                case 2: {
                    v2 = zza.zzg(parcel0, v7);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v7);
                    break;
                }
                case 4: {
                    s1 = zza.zzo(parcel0, v7);
                    break;
                }
                case 5: {
                    s2 = zza.zzo(parcel0, v7);
                    break;
                }
                case 6: {
                    s3 = zza.zzo(parcel0, v7);
                    break;
                }
                case 7: {
                    s4 = zza.zzo(parcel0, v7);
                    break;
                }
                case 8: {
                    s5 = zza.zzo(parcel0, v7);
                    break;
                }
                case 9: {
                    v3 = zza.zze(parcel0, v7);
                    break;
                }
                case 10: {
                    v4 = zza.zze(parcel0, v7);
                    break;
                }
                case 11: {
                    v5 = zza.zze(parcel0, v7);
                    break;
                }
                case 12: {
                    v6 = zza.zze(parcel0, v7);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v7);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new AncsNotificationParcelable(v1, v2, s, s1, s2, s3, s4, s5, ((byte)v3), ((byte)v4), ((byte)v5), ((byte)v6));
    }

    public AncsNotificationParcelable[] zzjR(int v) {
        return new AncsNotificationParcelable[v];
    }
}

