package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.PlayerEntity;

public class EventEntityCreator implements Parcelable.Creator {
    public static final int CONTENT_DESCRIPTION;

    public EventEntity createFromParcel(Parcel parcel) {
        boolean z = false;
        String s = null;
        int v = zza.zzab(parcel);
        long v1 = 0L;
        PlayerEntity playerEntity0 = null;
        String s1 = null;
        Uri uri0 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        int v2 = 0;
        while(parcel.dataPosition() < v) {
            int v3 = zza.zzaa(parcel);
            switch(0xFFFF & v3) {
                case 1: {
                    s4 = zza.zzo(parcel, v3);
                    break;
                }
                case 2: {
                    s3 = zza.zzo(parcel, v3);
                    break;
                }
                case 3: {
                    s2 = zza.zzo(parcel, v3);
                    break;
                }
                case 4: {
                    uri0 = (Uri)zza.zza(parcel, v3, Uri.CREATOR);
                    break;
                }
                case 5: {
                    s1 = zza.zzo(parcel, v3);
                    break;
                }
                case 6: {
                    playerEntity0 = (PlayerEntity)zza.zza(parcel, v3, PlayerEntity.CREATOR);
                    break;
                }
                case 7: {
                    v1 = zza.zzi(parcel, v3);
                    break;
                }
                case 8: {
                    s = zza.zzo(parcel, v3);
                    break;
                }
                case 9: {
                    z = zza.zzc(parcel, v3);
                    break;
                }
                case 1000: {
                    v2 = zza.zzg(parcel, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel, v3);
                }
            }
        }
        if(parcel.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel);
        }
        return new EventEntity(v2, s4, s3, s2, uri0, s1, playerEntity0, v1, s, z);
    }

    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.createFromParcel(x0);
    }

    public EventEntity[] newArray(int size) {
        return new EventEntity[size];
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.newArray(x0);
    }

    static void zza(EventEntity eventEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, eventEntity0.getEventId(), false);
        zzb.zzc(parcel0, 1000, eventEntity0.getVersionCode());
        zzb.zza(parcel0, 2, eventEntity0.getName(), false);
        zzb.zza(parcel0, 3, eventEntity0.getDescription(), false);
        zzb.zza(parcel0, 4, eventEntity0.getIconImageUri(), v, false);
        zzb.zza(parcel0, 5, eventEntity0.getIconImageUrl(), false);
        zzb.zza(parcel0, 6, eventEntity0.getPlayer(), v, false);
        zzb.zza(parcel0, 7, eventEntity0.getValue());
        zzb.zza(parcel0, 8, eventEntity0.getFormattedValue(), false);
        zzb.zza(parcel0, 9, eventEntity0.isVisible());
        zzb.zzH(parcel0, v1);
    }
}

