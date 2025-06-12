package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzJ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzaz(x0);
    }

    public ApplicationMetadata zzJ(Parcel parcel0) {
        Uri uri0 = null;
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        String s1 = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    arrayList1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v2, WebImage.CREATOR);
                    break;
                }
                case 5: {
                    arrayList0 = com.google.android.gms.common.internal.safeparcel.zza.zzC(parcel0, v2);
                    break;
                }
                case 6: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 7: {
                    uri0 = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v2, Uri.CREATOR);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new ApplicationMetadata(v1, s2, s1, arrayList1, arrayList0, s, uri0);
    }

    static void zza(ApplicationMetadata applicationMetadata0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, applicationMetadata0.getVersionCode());
        zzb.zza(parcel0, 2, applicationMetadata0.getApplicationId(), false);
        zzb.zza(parcel0, 3, applicationMetadata0.getName(), false);
        zzb.zzc(parcel0, 4, applicationMetadata0.getImages(), false);
        zzb.zzb(parcel0, 5, applicationMetadata0.zzQw, false);
        zzb.zza(parcel0, 6, applicationMetadata0.getSenderAppIdentifier(), false);
        zzb.zza(parcel0, 7, applicationMetadata0.zzle(), v, false);
        zzb.zzH(parcel0, v1);
    }

    public ApplicationMetadata[] zzaz(int v) {
        return new ApplicationMetadata[v];
    }
}

