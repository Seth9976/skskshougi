package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzj(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzC(x0);
    }

    public AdRequestInfoParcel[] zzC(int v) {
        return new AdRequestInfoParcel[v];
    }

    static void zza(AdRequestInfoParcel adRequestInfoParcel0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, adRequestInfoParcel0.versionCode);
        zzb.zza(parcel0, 2, adRequestInfoParcel0.zzCl, false);
        zzb.zza(parcel0, 3, adRequestInfoParcel0.zzCm, v, false);
        zzb.zza(parcel0, 4, adRequestInfoParcel0.zzpN, v, false);
        zzb.zza(parcel0, 5, adRequestInfoParcel0.zzpG, false);
        zzb.zza(parcel0, 6, adRequestInfoParcel0.applicationInfo, v, false);
        zzb.zza(parcel0, 7, adRequestInfoParcel0.zzCn, v, false);
        zzb.zza(parcel0, 8, adRequestInfoParcel0.zzCo, false);
        zzb.zza(parcel0, 9, adRequestInfoParcel0.zzCp, false);
        zzb.zza(parcel0, 10, adRequestInfoParcel0.zzCq, false);
        zzb.zza(parcel0, 11, adRequestInfoParcel0.zzpJ, v, false);
        zzb.zza(parcel0, 12, adRequestInfoParcel0.zzCr, false);
        zzb.zzc(parcel0, 13, adRequestInfoParcel0.zzCs);
        zzb.zzb(parcel0, 14, adRequestInfoParcel0.zzqd, false);
        zzb.zza(parcel0, 15, adRequestInfoParcel0.zzCt, false);
        zzb.zza(parcel0, 17, adRequestInfoParcel0.zzCv, v, false);
        zzb.zza(parcel0, 16, adRequestInfoParcel0.zzCu);
        zzb.zzc(parcel0, 19, adRequestInfoParcel0.zzCx);
        zzb.zzc(parcel0, 18, adRequestInfoParcel0.zzCw);
        zzb.zza(parcel0, 21, adRequestInfoParcel0.zzCz, false);
        zzb.zza(parcel0, 20, adRequestInfoParcel0.zzCy);
        zzb.zzc(parcel0, 23, adRequestInfoParcel0.zzCB);
        zzb.zza(parcel0, 22, adRequestInfoParcel0.zzCA);
        zzb.zza(parcel0, 25, adRequestInfoParcel0.zzCD);
        zzb.zza(parcel0, 24, adRequestInfoParcel0.zzCC, false);
        zzb.zzb(parcel0, 27, adRequestInfoParcel0.zzCF, false);
        zzb.zza(parcel0, 26, adRequestInfoParcel0.zzCE, false);
        zzb.zza(parcel0, 29, adRequestInfoParcel0.zzqb, v, false);
        zzb.zza(parcel0, 28, adRequestInfoParcel0.zzpF, false);
        zzb.zzb(parcel0, 30, adRequestInfoParcel0.zzCG, false);
        zzb.zzH(parcel0, v1);
    }

    public AdRequestInfoParcel zzj(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        Bundle bundle0 = null;
        AdRequestParcel adRequestParcel0 = null;
        AdSizeParcel adSizeParcel0 = null;
        String s = null;
        ApplicationInfo applicationInfo0 = null;
        PackageInfo packageInfo0 = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        VersionInfoParcel versionInfoParcel0 = null;
        Bundle bundle1 = null;
        int v2 = 0;
        ArrayList arrayList0 = null;
        Bundle bundle2 = null;
        boolean z = false;
        Messenger messenger0 = null;
        int v3 = 0;
        int v4 = 0;
        float f = 0.0f;
        String s4 = null;
        boolean z1 = false;
        int v5 = 0;
        String s5 = null;
        long v6 = 0L;
        String s6 = null;
        ArrayList arrayList1 = null;
        String s7 = null;
        NativeAdOptionsParcel nativeAdOptionsParcel0 = null;
        ArrayList arrayList2 = null;
        while(parcel0.dataPosition() < v) {
            int v7 = zza.zzaa(parcel0);
            switch(0xFFFF & v7) {
                case 1: {
                    v1 = zza.zzg(parcel0, v7);
                    break;
                }
                case 2: {
                    bundle0 = zza.zzq(parcel0, v7);
                    break;
                }
                case 3: {
                    adRequestParcel0 = (AdRequestParcel)zza.zza(parcel0, v7, AdRequestParcel.CREATOR);
                    break;
                }
                case 4: {
                    adSizeParcel0 = (AdSizeParcel)zza.zza(parcel0, v7, AdSizeParcel.CREATOR);
                    break;
                }
                case 5: {
                    s = zza.zzo(parcel0, v7);
                    break;
                }
                case 6: {
                    applicationInfo0 = (ApplicationInfo)zza.zza(parcel0, v7, ApplicationInfo.CREATOR);
                    break;
                }
                case 7: {
                    packageInfo0 = (PackageInfo)zza.zza(parcel0, v7, PackageInfo.CREATOR);
                    break;
                }
                case 8: {
                    s1 = zza.zzo(parcel0, v7);
                    break;
                }
                case 9: {
                    s2 = zza.zzo(parcel0, v7);
                    break;
                }
                case 10: {
                    s3 = zza.zzo(parcel0, v7);
                    break;
                }
                case 11: {
                    versionInfoParcel0 = (VersionInfoParcel)zza.zza(parcel0, v7, VersionInfoParcel.CREATOR);
                    break;
                }
                case 12: {
                    bundle1 = zza.zzq(parcel0, v7);
                    break;
                }
                case 13: {
                    v2 = zza.zzg(parcel0, v7);
                    break;
                }
                case 14: {
                    arrayList0 = zza.zzC(parcel0, v7);
                    break;
                }
                case 15: {
                    bundle2 = zza.zzq(parcel0, v7);
                    break;
                }
                case 16: {
                    z = zza.zzc(parcel0, v7);
                    break;
                }
                case 17: {
                    messenger0 = (Messenger)zza.zza(parcel0, v7, Messenger.CREATOR);
                    break;
                }
                case 18: {
                    v3 = zza.zzg(parcel0, v7);
                    break;
                }
                case 19: {
                    v4 = zza.zzg(parcel0, v7);
                    break;
                }
                case 20: {
                    f = zza.zzl(parcel0, v7);
                    break;
                }
                case 21: {
                    s4 = zza.zzo(parcel0, v7);
                    break;
                }
                case 22: {
                    z1 = zza.zzc(parcel0, v7);
                    break;
                }
                case 23: {
                    v5 = zza.zzg(parcel0, v7);
                    break;
                }
                case 24: {
                    s5 = zza.zzo(parcel0, v7);
                    break;
                }
                case 25: {
                    v6 = zza.zzi(parcel0, v7);
                    break;
                }
                case 26: {
                    s6 = zza.zzo(parcel0, v7);
                    break;
                }
                case 27: {
                    arrayList1 = zza.zzC(parcel0, v7);
                    break;
                }
                case 28: {
                    s7 = zza.zzo(parcel0, v7);
                    break;
                }
                case 29: {
                    nativeAdOptionsParcel0 = (NativeAdOptionsParcel)zza.zza(parcel0, v7, NativeAdOptionsParcel.CREATOR);
                    break;
                }
                case 30: {
                    arrayList2 = zza.zzC(parcel0, v7);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v7);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new AdRequestInfoParcel(v1, bundle0, adRequestParcel0, adSizeParcel0, s, applicationInfo0, packageInfo0, s1, s2, s3, versionInfoParcel0, bundle1, v2, arrayList0, bundle2, z, messenger0, v3, v4, f, s4, z1, v5, s5, v6, s6, arrayList1, s7, nativeAdOptionsParcel0, arrayList2);
    }
}

