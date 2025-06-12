package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeQ(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhq(x0);
    }

    static void zza(MarkerOptions markerOptions0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, markerOptions0.getVersionCode());
        zzb.zza(parcel0, 2, markerOptions0.getPosition(), v, false);
        zzb.zza(parcel0, 3, markerOptions0.getTitle(), false);
        zzb.zza(parcel0, 4, markerOptions0.getSnippet(), false);
        zzb.zza(parcel0, 5, markerOptions0.zzvJ(), false);
        zzb.zza(parcel0, 6, markerOptions0.getAnchorU());
        zzb.zza(parcel0, 7, markerOptions0.getAnchorV());
        zzb.zza(parcel0, 8, markerOptions0.isDraggable());
        zzb.zza(parcel0, 9, markerOptions0.isVisible());
        zzb.zza(parcel0, 10, markerOptions0.isFlat());
        zzb.zza(parcel0, 11, markerOptions0.getRotation());
        zzb.zza(parcel0, 12, markerOptions0.getInfoWindowAnchorU());
        zzb.zza(parcel0, 13, markerOptions0.getInfoWindowAnchorV());
        zzb.zza(parcel0, 14, markerOptions0.getAlpha());
        zzb.zzH(parcel0, v1);
    }

    public MarkerOptions zzeQ(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        LatLng latLng0 = null;
        String s = null;
        String s1 = null;
        IBinder iBinder0 = null;
        float f = 0.0f;
        float f1 = 0.0f;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        float f2 = 0.0f;
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = 1.0f;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    latLng0 = (LatLng)zza.zza(parcel0, v2, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    s = zza.zzo(parcel0, v2);
                    break;
                }
                case 4: {
                    s1 = zza.zzo(parcel0, v2);
                    break;
                }
                case 5: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 6: {
                    f = zza.zzl(parcel0, v2);
                    break;
                }
                case 7: {
                    f1 = zza.zzl(parcel0, v2);
                    break;
                }
                case 8: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 9: {
                    z1 = zza.zzc(parcel0, v2);
                    break;
                }
                case 10: {
                    z2 = zza.zzc(parcel0, v2);
                    break;
                }
                case 11: {
                    f2 = zza.zzl(parcel0, v2);
                    break;
                }
                case 12: {
                    f3 = zza.zzl(parcel0, v2);
                    break;
                }
                case 13: {
                    f4 = zza.zzl(parcel0, v2);
                    break;
                }
                case 14: {
                    f5 = zza.zzl(parcel0, v2);
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
        return new MarkerOptions(v1, latLng0, s, s1, iBinder0, f, f1, z, z1, z2, f2, f3, f4, f5);
    }

    public MarkerOptions[] zzhq(int v) {
        return new MarkerOptions[v];
    }
}

