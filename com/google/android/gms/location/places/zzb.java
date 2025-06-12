package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzen(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgJ(x0);
    }

    static void zza(AddPlaceRequest addPlaceRequest0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 1, addPlaceRequest0.getName(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1000, addPlaceRequest0.zzCY);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 2, addPlaceRequest0.getLatLng(), v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, addPlaceRequest0.getAddress(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, addPlaceRequest0.getPlaceTypes(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 5, addPlaceRequest0.getPhoneNumber(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 6, addPlaceRequest0.getWebsiteUri(), v, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public AddPlaceRequest zzen(Parcel parcel0) {
        Uri uri0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        ArrayList arrayList0 = null;
        String s1 = null;
        LatLng latLng0 = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    s2 = zza.zzo(parcel0, v2);
                    break;
                }
                case 2: {
                    latLng0 = (LatLng)zza.zza(parcel0, v2, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    arrayList0 = zza.zzB(parcel0, v2);
                    break;
                }
                case 5: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 6: {
                    uri0 = (Uri)zza.zza(parcel0, v2, Uri.CREATOR);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v2);
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
        return new AddPlaceRequest(v1, s2, latLng0, s1, arrayList0, s, uri0);
    }

    public AddPlaceRequest[] zzgJ(int v) {
        return new AddPlaceRequest[v];
    }
}

