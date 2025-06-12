package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzH(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzax(x0);
    }

    public ProxyRequest zzH(Parcel parcel0) {
        int v = 0;
        Bundle bundle0 = null;
        int v1 = zza.zzab(parcel0);
        long v2 = 0L;
        byte[] arr_b = null;
        String s = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 2: {
                    v = zza.zzg(parcel0, v4);
                    break;
                }
                case 3: {
                    v2 = zza.zzi(parcel0, v4);
                    break;
                }
                case 4: {
                    arr_b = zza.zzr(parcel0, v4);
                    break;
                }
                case 5: {
                    bundle0 = zza.zzq(parcel0, v4);
                    break;
                }
                case 1000: {
                    v3 = zza.zzg(parcel0, v4);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v4);
                }
            }
        }
        if(parcel0.dataPosition() != v1) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v1, parcel0);
        }
        return new ProxyRequest(v3, s, v, v2, arr_b, bundle0);
    }

    static void zza(ProxyRequest proxyRequest0, Parcel parcel0, int v) {
        int v1 = com.google.android.gms.common.internal.safeparcel.zzb.zzac(parcel0);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 1, proxyRequest0.zzzf, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 1000, proxyRequest0.versionCode);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel0, 2, proxyRequest0.zzPq);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 3, proxyRequest0.zzPr);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 4, proxyRequest0.zzPs, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel0, 5, proxyRequest0.zzPt, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel0, v1);
    }

    public ProxyRequest[] zzax(int v) {
        return new ProxyRequest[v];
    }
}

