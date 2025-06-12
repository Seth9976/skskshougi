package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzy(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzan(x0);
    }

    static void zza(UsageInfo usageInfo0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, usageInfo0.zzNH, v, false);
        zzb.zzc(parcel0, 1000, usageInfo0.zzCY);
        zzb.zza(parcel0, 2, usageInfo0.zzNI);
        zzb.zzc(parcel0, 3, usageInfo0.zzNJ);
        zzb.zza(parcel0, 4, usageInfo0.zztt, false);
        zzb.zza(parcel0, 5, usageInfo0.zzNK, v, false);
        zzb.zza(parcel0, 6, usageInfo0.zzNL);
        zzb.zzc(parcel0, 7, usageInfo0.zzNM);
        zzb.zzc(parcel0, 8, usageInfo0.zzNN);
        zzb.zzH(parcel0, v1);
    }

    public UsageInfo[] zzan(int v) {
        return new UsageInfo[v];
    }

    public UsageInfo zzy(Parcel parcel0) {
        DocumentContents documentContents0 = null;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        long v2 = 0L;
        int v3 = -1;
        boolean z = false;
        String s = null;
        int v4 = 0;
        DocumentId documentId0 = null;
        int v5 = 0;
        while(parcel0.dataPosition() < v1) {
            int v6 = zza.zzaa(parcel0);
            switch(0xFFFF & v6) {
                case 1: {
                    documentId0 = (DocumentId)zza.zza(parcel0, v6, DocumentId.CREATOR);
                    break;
                }
                case 2: {
                    v2 = zza.zzi(parcel0, v6);
                    break;
                }
                case 3: {
                    v4 = zza.zzg(parcel0, v6);
                    break;
                }
                case 4: {
                    s = zza.zzo(parcel0, v6);
                    break;
                }
                case 5: {
                    documentContents0 = (DocumentContents)zza.zza(parcel0, v6, DocumentContents.CREATOR);
                    break;
                }
                case 6: {
                    z = zza.zzc(parcel0, v6);
                    break;
                }
                case 7: {
                    v3 = zza.zzg(parcel0, v6);
                    break;
                }
                case 8: {
                    v = zza.zzg(parcel0, v6);
                    break;
                }
                case 1000: {
                    v5 = zza.zzg(parcel0, v6);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v6);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new UsageInfo(v5, documentId0, v2, v4, s, documentContents0, z, v3, v);
    }
}

