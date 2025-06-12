package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzh(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzw(x0);
    }

    static void zza(AdOverlayInfoParcel adOverlayInfoParcel0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, adOverlayInfoParcel0.versionCode);
        zzb.zza(parcel0, 2, adOverlayInfoParcel0.zzzB, v, false);
        zzb.zza(parcel0, 3, adOverlayInfoParcel0.zzex(), false);
        zzb.zza(parcel0, 4, adOverlayInfoParcel0.zzey(), false);
        zzb.zza(parcel0, 5, adOverlayInfoParcel0.zzez(), false);
        zzb.zza(parcel0, 6, adOverlayInfoParcel0.zzeA(), false);
        zzb.zza(parcel0, 7, adOverlayInfoParcel0.zzzG, false);
        zzb.zza(parcel0, 8, adOverlayInfoParcel0.zzzH);
        zzb.zza(parcel0, 9, adOverlayInfoParcel0.zzzI, false);
        zzb.zza(parcel0, 10, adOverlayInfoParcel0.zzeC(), false);
        zzb.zzc(parcel0, 11, adOverlayInfoParcel0.orientation);
        zzb.zzc(parcel0, 12, adOverlayInfoParcel0.zzzK);
        zzb.zza(parcel0, 13, adOverlayInfoParcel0.zzzf, false);
        zzb.zza(parcel0, 14, adOverlayInfoParcel0.zzpJ, v, false);
        zzb.zza(parcel0, 15, adOverlayInfoParcel0.zzeB(), false);
        zzb.zza(parcel0, 17, adOverlayInfoParcel0.zzzN, v, false);
        zzb.zza(parcel0, 16, adOverlayInfoParcel0.zzzM, false);
        zzb.zzH(parcel0, v1);
    }

    public AdOverlayInfoParcel zzh(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        AdLauncherIntentInfoParcel adLauncherIntentInfoParcel0 = null;
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        String s = null;
        boolean z = false;
        String s1 = null;
        IBinder iBinder4 = null;
        int v2 = 0;
        int v3 = 0;
        String s2 = null;
        VersionInfoParcel versionInfoParcel0 = null;
        IBinder iBinder5 = null;
        String s3 = null;
        InterstitialAdParameterParcel interstitialAdParameterParcel0 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v1 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    adLauncherIntentInfoParcel0 = (AdLauncherIntentInfoParcel)zza.zza(parcel0, v4, AdLauncherIntentInfoParcel.CREATOR);
                    break;
                }
                case 3: {
                    iBinder0 = zza.zzp(parcel0, v4);
                    break;
                }
                case 4: {
                    iBinder1 = zza.zzp(parcel0, v4);
                    break;
                }
                case 5: {
                    iBinder2 = zza.zzp(parcel0, v4);
                    break;
                }
                case 6: {
                    iBinder3 = zza.zzp(parcel0, v4);
                    break;
                }
                case 7: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 8: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                case 9: {
                    s1 = zza.zzo(parcel0, v4);
                    break;
                }
                case 10: {
                    iBinder4 = zza.zzp(parcel0, v4);
                    break;
                }
                case 11: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 12: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                case 13: {
                    s2 = zza.zzo(parcel0, v4);
                    break;
                }
                case 14: {
                    versionInfoParcel0 = (VersionInfoParcel)zza.zza(parcel0, v4, VersionInfoParcel.CREATOR);
                    break;
                }
                case 15: {
                    iBinder5 = zza.zzp(parcel0, v4);
                    break;
                }
                case 16: {
                    s3 = zza.zzo(parcel0, v4);
                    break;
                }
                case 17: {
                    interstitialAdParameterParcel0 = (InterstitialAdParameterParcel)zza.zza(parcel0, v4, InterstitialAdParameterParcel.CREATOR);
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
        return new AdOverlayInfoParcel(v1, adLauncherIntentInfoParcel0, iBinder0, iBinder1, iBinder2, iBinder3, s, z, s1, iBinder4, v2, v3, s2, versionInfoParcel0, iBinder5, s3, interstitialAdParameterParcel0);
    }

    public AdOverlayInfoParcel[] zzw(int v) {
        return new AdOverlayInfoParcel[v];
    }
}

