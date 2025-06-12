package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzay(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzch(x0);
    }

    static void zza(CompletionEvent completionEvent0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, completionEvent0.zzCY);
        zzb.zza(parcel0, 2, completionEvent0.zzacT, v, false);
        zzb.zza(parcel0, 3, completionEvent0.zzOx, false);
        zzb.zza(parcel0, 4, completionEvent0.zzadT, v, false);
        zzb.zza(parcel0, 5, completionEvent0.zzadU, v, false);
        zzb.zza(parcel0, 6, completionEvent0.zzadV, v, false);
        zzb.zzb(parcel0, 7, completionEvent0.zzadW, false);
        zzb.zzc(parcel0, 8, completionEvent0.zzwS);
        zzb.zza(parcel0, 9, completionEvent0.zzadX, false);
        zzb.zzH(parcel0, v1);
    }

    public CompletionEvent zzay(Parcel parcel0) {
        int v = 0;
        IBinder iBinder0 = null;
        int v1 = zza.zzab(parcel0);
        ArrayList arrayList0 = null;
        MetadataBundle metadataBundle0 = null;
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        ParcelFileDescriptor parcelFileDescriptor1 = null;
        String s = null;
        DriveId driveId0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v2 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    driveId0 = (DriveId)zza.zza(parcel0, v3, DriveId.CREATOR);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v3);
                    break;
                }
                case 4: {
                    parcelFileDescriptor1 = (ParcelFileDescriptor)zza.zza(parcel0, v3, ParcelFileDescriptor.CREATOR);
                    break;
                }
                case 5: {
                    parcelFileDescriptor0 = (ParcelFileDescriptor)zza.zza(parcel0, v3, ParcelFileDescriptor.CREATOR);
                    break;
                }
                case 6: {
                    metadataBundle0 = (MetadataBundle)zza.zza(parcel0, v3, MetadataBundle.CREATOR);
                    break;
                }
                case 7: {
                    arrayList0 = zza.zzC(parcel0, v3);
                    break;
                }
                case 8: {
                    v = zza.zzg(parcel0, v3);
                    break;
                }
                case 9: {
                    iBinder0 = zza.zzp(parcel0, v3);
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
        return new CompletionEvent(v2, driveId0, s, parcelFileDescriptor1, parcelFileDescriptor0, metadataBundle0, arrayList0, v, iBinder0);
    }

    public CompletionEvent[] zzch(int v) {
        return new CompletionEvent[v];
    }
}

