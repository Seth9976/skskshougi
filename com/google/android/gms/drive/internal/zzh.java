package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;

public class zzh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaH(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcr(x0);
    }

    static void zza(CloseContentsRequest closeContentsRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, closeContentsRequest0.zzCY);
        zzb.zza(parcel0, 2, closeContentsRequest0.zzaes, v, false);
        zzb.zza(parcel0, 3, closeContentsRequest0.zzaew, false);
        zzb.zzc(parcel0, 4, closeContentsRequest0.zzaeu);
        zzb.zzH(parcel0, v1);
    }

    public CloseContentsRequest zzaH(Parcel parcel0) {
        int v5;
        Contents contents1;
        Boolean boolean1;
        int v4;
        Boolean boolean0 = null;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        Contents contents0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v1) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    boolean1 = boolean0;
                    contents1 = contents0;
                    v5 = zza.zzg(parcel0, v3);
                    v4 = v;
                    break;
                }
                case 2: {
                    v5 = v2;
                    contents1 = (Contents)zza.zza(parcel0, v3, Contents.CREATOR);
                    v4 = v;
                    boolean1 = boolean0;
                    break;
                }
                case 3: {
                    contents1 = contents0;
                    v5 = v2;
                    boolean1 = zza.zzd(parcel0, v3);
                    v4 = v;
                    break;
                }
                case 4: {
                    v4 = zza.zzg(parcel0, v3);
                    boolean1 = boolean0;
                    contents1 = contents0;
                    v5 = v2;
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                    v4 = v;
                    boolean1 = boolean0;
                    contents1 = contents0;
                    v5 = v2;
                }
            }
            v2 = v5;
            contents0 = contents1;
            boolean0 = boolean1;
            v = v4;
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new CloseContentsRequest(v2, contents0, boolean0, v);
    }

    public CloseContentsRequest[] zzcr(int v) {
        return new CloseContentsRequest[v];
    }
}

