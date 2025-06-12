package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzC(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzas(x0);
    }

    public Credential zzC(Parcel parcel0) {
        String s = null;
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        String s1 = null;
        ArrayList arrayList0 = null;
        Uri uri0 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 2: {
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 3: {
                    uri0 = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v2, Uri.CREATOR);
                    break;
                }
                case 4: {
                    arrayList0 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel0, v2, IdToken.CREATOR);
                    break;
                }
                case 5: {
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 6: {
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 1000: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v2);
                    break;
                }
                case 1001: {
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
                    break;
                }
                case 1002: {
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel0, v2);
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
        return new Credential(v1, s5, s4, s3, s2, uri0, arrayList0, s1, s);
    }

    static void zza(Credential credential0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1001, credential0.zzkZ(), false);
        zzb.zza(parcel0, 1, credential0.getId(), false);
        zzb.zzc(parcel0, 1000, credential0.zzCY);
        zzb.zza(parcel0, 2, credential0.getName(), false);
        zzb.zza(parcel0, 3, credential0.getProfilePictureUri(), v, false);
        zzb.zza(parcel0, 1002, credential0.zzla(), false);
        zzb.zzc(parcel0, 4, credential0.zzlb(), false);
        zzb.zza(parcel0, 5, credential0.getPassword(), false);
        zzb.zza(parcel0, 6, credential0.getAccountType(), false);
        zzb.zzH(parcel0, v1);
    }

    public Credential[] zzas(int v) {
        return new Credential[v];
    }
}

