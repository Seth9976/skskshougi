package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;

public class zzk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzey(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzgY(x0);
    }

    static void zza(PlaceImpl placeImpl0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, placeImpl0.getId(), false);
        zzb.zza(parcel0, 2, placeImpl0.zzuT(), false);
        zzb.zza(parcel0, 3, placeImpl0.zzuV(), v, false);
        zzb.zza(parcel0, 4, placeImpl0.getLatLng(), v, false);
        zzb.zza(parcel0, 5, placeImpl0.zzuO());
        zzb.zza(parcel0, 6, placeImpl0.getViewport(), v, false);
        zzb.zza(parcel0, 7, placeImpl0.zzuU(), false);
        zzb.zza(parcel0, 8, placeImpl0.getWebsiteUri(), v, false);
        zzb.zza(parcel0, 9, placeImpl0.zzuR());
        zzb.zza(parcel0, 10, placeImpl0.getRating());
        zzb.zzc(parcel0, 11, placeImpl0.getPriceLevel());
        zzb.zza(parcel0, 12, placeImpl0.zzuS());
        zzb.zza(parcel0, 13, placeImpl0.zzuN(), false);
        zzb.zza(parcel0, 14, placeImpl0.getAddress(), false);
        zzb.zza(parcel0, 15, placeImpl0.getPhoneNumber(), false);
        zzb.zzb(parcel0, 17, placeImpl0.zzuQ(), false);
        zzb.zza(parcel0, 16, placeImpl0.zzuP(), false);
        zzb.zzc(parcel0, 1000, placeImpl0.zzCY);
        zzb.zza(parcel0, 19, placeImpl0.getName(), false);
        zzb.zza(parcel0, 18, placeImpl0.zzaAE);
        zzb.zza(parcel0, 20, placeImpl0.getPlaceTypes(), false);
        zzb.zzH(parcel0, v1);
    }

    public PlaceImpl zzey(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        Bundle bundle0 = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        ArrayList arrayList2 = null;
        LatLng latLng0 = null;
        float f = 0.0f;
        LatLngBounds latLngBounds0 = null;
        String s5 = null;
        Uri uri0 = null;
        boolean z = false;
        float f1 = 0.0f;
        int v2 = 0;
        long v3 = 0L;
        boolean z1 = false;
        PlaceLocalization placeLocalization0 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 2: {
                    bundle0 = zza.zzq(parcel0, v4);
                    break;
                }
                case 3: {
                    placeLocalization0 = (PlaceLocalization)zza.zza(parcel0, v4, PlaceLocalization.CREATOR);
                    break;
                }
                case 4: {
                    latLng0 = (LatLng)zza.zza(parcel0, v4, LatLng.CREATOR);
                    break;
                }
                case 5: {
                    f = zza.zzl(parcel0, v4);
                    break;
                }
                case 6: {
                    latLngBounds0 = (LatLngBounds)zza.zza(parcel0, v4, LatLngBounds.CREATOR);
                    break;
                }
                case 7: {
                    s5 = zza.zzo(parcel0, v4);
                    break;
                }
                case 8: {
                    uri0 = (Uri)zza.zza(parcel0, v4, Uri.CREATOR);
                    break;
                }
                case 9: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                case 10: {
                    f1 = zza.zzl(parcel0, v4);
                    break;
                }
                case 11: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 12: {
                    v3 = zza.zzi(parcel0, v4);
                    break;
                }
                case 13: {
                    arrayList1 = zza.zzB(parcel0, v4);
                    break;
                }
                case 14: {
                    s2 = zza.zzo(parcel0, v4);
                    break;
                }
                case 15: {
                    s3 = zza.zzo(parcel0, v4);
                    break;
                }
                case 16: {
                    s4 = zza.zzo(parcel0, v4);
                    break;
                }
                case 17: {
                    arrayList2 = zza.zzC(parcel0, v4);
                    break;
                }
                case 18: {
                    z1 = zza.zzc(parcel0, v4);
                    break;
                }
                case 19: {
                    s1 = zza.zzo(parcel0, v4);
                    break;
                }
                case 20: {
                    arrayList0 = zza.zzB(parcel0, v4);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v4);
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
        return new PlaceImpl(v1, s, arrayList0, arrayList1, bundle0, s1, s2, s3, s4, arrayList2, latLng0, f, latLngBounds0, s5, uri0, z, f1, v2, v3, z1, placeLocalization0);
    }

    public PlaceImpl[] zzgY(int v) {
        return new PlaceImpl[v];
    }
}

