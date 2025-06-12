package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzT(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzbn(x0);
    }

    public WebImage zzT(Parcel parcel0) {
        int v7;
        Uri uri1;
        int v6;
        int v5;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        Uri uri0 = null;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v6 = v2;
                    uri1 = uri0;
                    v7 = zza.zzg(parcel0, v4);
                    v5 = v;
                    break;
                }
                case 2: {
                    v7 = v3;
                    uri1 = (Uri)zza.zza(parcel0, v4, Uri.CREATOR);
                    v5 = v;
                    v6 = v2;
                    break;
                }
                case 3: {
                    uri1 = uri0;
                    v7 = v3;
                    v6 = zza.zzg(parcel0, v4);
                    v5 = v;
                    break;
                }
                case 4: {
                    v5 = zza.zzg(parcel0, v4);
                    v6 = v2;
                    uri1 = uri0;
                    v7 = v3;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                    v5 = v;
                    v6 = v2;
                    uri1 = uri0;
                    v7 = v3;
                }
            }
            v3 = v7;
            uri0 = uri1;
            v2 = v6;
            v = v5;
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new WebImage(v3, uri0, v2, v);
    }

    static void zza(WebImage webImage0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1, webImage0.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, webImage0.getUrl(), v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 3, webImage0.getWidth());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 4, webImage0.getHeight());
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public WebImage[] zzbn(int v) {
        return new WebImage[v];
    }
}

