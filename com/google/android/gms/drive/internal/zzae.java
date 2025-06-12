package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzae implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzaQ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzcF(x0);
    }

    static void zza(FileUploadPreferencesImpl fileUploadPreferencesImpl0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, fileUploadPreferencesImpl0.zzCY);
        zzb.zzc(parcel0, 2, fileUploadPreferencesImpl0.zzafG);
        zzb.zzc(parcel0, 3, fileUploadPreferencesImpl0.zzafH);
        zzb.zza(parcel0, 4, fileUploadPreferencesImpl0.zzafI);
        zzb.zzH(parcel0, v1);
    }

    public FileUploadPreferencesImpl zzaQ(Parcel parcel0) {
        boolean z = false;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 3: {
                    v1 = zza.zzg(parcel0, v4);
                    break;
                }
                case 4: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new FileUploadPreferencesImpl(v3, v2, v1, z);
    }

    public FileUploadPreferencesImpl[] zzcF(int v) {
        return new FileUploadPreferencesImpl[v];
    }
}

