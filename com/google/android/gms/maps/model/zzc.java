package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzeN(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzhn(x0);
    }

    static void zza(GroundOverlayOptions groundOverlayOptions0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, groundOverlayOptions0.getVersionCode());
        zzb.zza(parcel0, 2, groundOverlayOptions0.zzvI(), false);
        zzb.zza(parcel0, 3, groundOverlayOptions0.getLocation(), v, false);
        zzb.zza(parcel0, 4, groundOverlayOptions0.getWidth());
        zzb.zza(parcel0, 5, groundOverlayOptions0.getHeight());
        zzb.zza(parcel0, 6, groundOverlayOptions0.getBounds(), v, false);
        zzb.zza(parcel0, 7, groundOverlayOptions0.getBearing());
        zzb.zza(parcel0, 8, groundOverlayOptions0.getZIndex());
        zzb.zza(parcel0, 9, groundOverlayOptions0.isVisible());
        zzb.zza(parcel0, 10, groundOverlayOptions0.getTransparency());
        zzb.zza(parcel0, 11, groundOverlayOptions0.getAnchorU());
        zzb.zza(parcel0, 12, groundOverlayOptions0.getAnchorV());
        zzb.zzH(parcel0, v1);
    }

    public GroundOverlayOptions zzeN(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        IBinder iBinder0 = null;
        LatLng latLng0 = null;
        float f = 0.0f;
        float f1 = 0.0f;
        LatLngBounds latLngBounds0 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z = false;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        while(parcel0.dataPosition() < v) {
            int v2 = zza.zzaa(parcel0);
            switch(0xFFFF & v2) {
                case 1: {
                    v1 = zza.zzg(parcel0, v2);
                    break;
                }
                case 2: {
                    iBinder0 = zza.zzp(parcel0, v2);
                    break;
                }
                case 3: {
                    latLng0 = (LatLng)zza.zza(parcel0, v2, LatLng.CREATOR);
                    break;
                }
                case 4: {
                    f = zza.zzl(parcel0, v2);
                    break;
                }
                case 5: {
                    f1 = zza.zzl(parcel0, v2);
                    break;
                }
                case 6: {
                    latLngBounds0 = (LatLngBounds)zza.zza(parcel0, v2, LatLngBounds.CREATOR);
                    break;
                }
                case 7: {
                    f2 = zza.zzl(parcel0, v2);
                    break;
                }
                case 8: {
                    f3 = zza.zzl(parcel0, v2);
                    break;
                }
                case 9: {
                    z = zza.zzc(parcel0, v2);
                    break;
                }
                case 10: {
                    f4 = zza.zzl(parcel0, v2);
                    break;
                }
                case 11: {
                    f5 = zza.zzl(parcel0, v2);
                    break;
                }
                case 12: {
                    f6 = zza.zzl(parcel0, v2);
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
        return new GroundOverlayOptions(v1, iBinder0, latLng0, f, f1, latLngBounds0, f2, f3, z, f4, f5, f6);
    }

    public GroundOverlayOptions[] zzhn(int v) {
        return new GroundOverlayOptions[v];
    }
}

