package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

public class zzbj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzbn(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzdc(x0);
    }

    static void zza(OpenFileIntentSenderRequest openFileIntentSenderRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, openFileIntentSenderRequest0.zzCY);
        zzb.zza(parcel0, 2, openFileIntentSenderRequest0.zzadv, false);
        zzb.zza(parcel0, 3, openFileIntentSenderRequest0.zzadw, false);
        zzb.zza(parcel0, 4, openFileIntentSenderRequest0.zzady, v, false);
        zzb.zza(parcel0, 5, openFileIntentSenderRequest0.zzagt, v, false);
        zzb.zzH(parcel0, v1);
    }

    public OpenFileIntentSenderRequest zzbn(Parcel parcel0) {
        FilterHolder filterHolder0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        DriveId driveId0 = null;
        String[] arr_s = null;
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
                    arr_s = zza.zzA(parcel0, v2);
                    break;
                }
                case 4: {
                    driveId0 = (DriveId)zza.zza(parcel0, v2, DriveId.CREATOR);
                    break;
                }
                case 5: {
                    filterHolder0 = (FilterHolder)zza.zza(parcel0, v2, FilterHolder.CREATOR);
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
        return new OpenFileIntentSenderRequest(v1, s, arr_s, driveId0, filterHolder0);
    }

    public OpenFileIntentSenderRequest[] zzdc(int v) {
        return new OpenFileIntentSenderRequest[v];
    }
}

