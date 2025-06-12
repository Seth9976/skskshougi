package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class AppContentAnnotationEntityCreator implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzdx(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzft(x0);
    }

    static void zza(AppContentAnnotationEntity appContentAnnotationEntity0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, appContentAnnotationEntity0.getDescription(), false);
        zzb.zzc(parcel0, 1000, appContentAnnotationEntity0.getVersionCode());
        zzb.zza(parcel0, 2, appContentAnnotationEntity0.zzrU(), v, false);
        zzb.zza(parcel0, 3, appContentAnnotationEntity0.getTitle(), false);
        zzb.zza(parcel0, 5, appContentAnnotationEntity0.getId(), false);
        zzb.zza(parcel0, 6, appContentAnnotationEntity0.zzrX(), false);
        zzb.zza(parcel0, 7, appContentAnnotationEntity0.zzrS(), false);
        zzb.zzc(parcel0, 8, appContentAnnotationEntity0.zzrT());
        zzb.zzc(parcel0, 9, appContentAnnotationEntity0.zzrW());
        zzb.zza(parcel0, 10, appContentAnnotationEntity0.zzrV(), false);
        zzb.zzH(parcel0, v1);
    }

    public AppContentAnnotationEntity zzdx(Parcel parcel0) {
        int v = 0;
        Bundle bundle0 = null;
        int v1 = zza.zzab(parcel0);
        int v2 = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Uri uri0 = null;
        String s4 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    s4 = zza.zzo(parcel0, v4);
                    break;
                }
                case 2: {
                    uri0 = (Uri)zza.zza(parcel0, v4, Uri.CREATOR);
                    break;
                }
                case 3: {
                    s3 = zza.zzo(parcel0, v4);
                    break;
                }
                case 5: {
                    s2 = zza.zzo(parcel0, v4);
                    break;
                }
                case 6: {
                    s1 = zza.zzo(parcel0, v4);
                    break;
                }
                case 7: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 8: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 9: {
                    v = zza.zzg(parcel0, v4);
                    break;
                }
                case 10: {
                    bundle0 = zza.zzq(parcel0, v4);
                    break;
                }
                case 1000: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new AppContentAnnotationEntity(v3, s4, uri0, s3, s2, s1, s, v2, v, bundle0);
    }

    public AppContentAnnotationEntity[] zzft(int v) {
        return new AppContentAnnotationEntity[v];
    }
}

