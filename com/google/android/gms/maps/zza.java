package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.maps.model.CameraPosition;

public class zza implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeI(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhi(x0);
    }

    static void zza(GoogleMapOptions googleMapOptions0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, googleMapOptions0.getVersionCode());
        zzb.zza(parcel0, 2, googleMapOptions0.zzvj());
        zzb.zza(parcel0, 3, googleMapOptions0.zzvk());
        zzb.zzc(parcel0, 4, googleMapOptions0.getMapType());
        zzb.zza(parcel0, 5, googleMapOptions0.getCamera(), v, false);
        zzb.zza(parcel0, 6, googleMapOptions0.zzvl());
        zzb.zza(parcel0, 7, googleMapOptions0.zzvm());
        zzb.zza(parcel0, 8, googleMapOptions0.zzvn());
        zzb.zza(parcel0, 9, googleMapOptions0.zzvo());
        zzb.zza(parcel0, 10, googleMapOptions0.zzvp());
        zzb.zza(parcel0, 11, googleMapOptions0.zzvq());
        zzb.zza(parcel0, 12, googleMapOptions0.zzvr());
        zzb.zza(parcel0, 14, googleMapOptions0.zzvs());
        zzb.zzH(parcel0, v1);
    }

    public GoogleMapOptions zzeI(Parcel parcel0) {
        int v = com.google.android.gms.common.internal.safeparcel.zza.zzab(parcel0);
        int v1 = 0;
        int v2 = -1;
        int v3 = -1;
        int v4 = 0;
        CameraPosition cameraPosition0 = null;
        int v5 = -1;
        int v6 = -1;
        int v7 = -1;
        int v8 = -1;
        int v9 = -1;
        int v10 = -1;
        int v11 = -1;
        int v12 = -1;
        while(parcel0.dataPosition() < v) {
            int v13 = com.google.android.gms.common.internal.safeparcel.zza.zzaa(parcel0);
            switch(0xFFFF & v13) {
                case 1: {
                    v1 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v13);
                    break;
                }
                case 2: {
                    v2 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel0, v13);
                    break;
                }
                case 3: {
                    v3 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel0, v13);
                    break;
                }
                case 4: {
                    v4 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel0, v13);
                    break;
                }
                case 5: {
                    cameraPosition0 = (CameraPosition)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel0, v13, CameraPosition.CREATOR);
                    break;
                }
                case 6: {
                    v5 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel0, v13);
                    break;
                }
                case 7: {
                    v6 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel0, v13);
                    break;
                }
                case 8: {
                    v7 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel0, v13);
                    break;
                }
                case 9: {
                    v8 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel0, v13);
                    break;
                }
                case 10: {
                    v9 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel0, v13);
                    break;
                }
                case 11: {
                    v10 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel0, v13);
                    break;
                }
                case 12: {
                    v11 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel0, v13);
                    break;
                }
                case 14: {
                    v12 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel0, v13);
                    break;
                }
                default: {
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel0, v13);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new GoogleMapOptions(v1, ((byte)v2), ((byte)v3), v4, cameraPosition0, ((byte)v5), ((byte)v6), ((byte)v7), ((byte)v8), ((byte)v9), ((byte)v10), ((byte)v11), ((byte)v12));
    }

    public GoogleMapOptions[] zzhi(int v) {
        return new GoogleMapOptions[v];
    }
}

