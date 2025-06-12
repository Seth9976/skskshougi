package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzI(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzay(x0);
    }

    public ProxyResponse zzI(Parcel parcel0) {
        byte[] arr_b = null;
        int v = 0;
        int v1 = zza.zzab(parcel0);
        Bundle bundle0 = null;
        PendingIntent pendingIntent0 = null;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v1) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v2 = zza.zzg(parcel0, v4);
                    break;
                }
                case 2: {
                    pendingIntent0 = (PendingIntent)zza.zza(parcel0, v4, PendingIntent.CREATOR);
                    break;
                }
                case 3: {
                    v = zza.zzg(parcel0, v4);
                    break;
                }
                case 4: {
                    bundle0 = zza.zzq(parcel0, v4);
                    break;
                }
                case 5: {
                    arr_b = zza.zzr(parcel0, v4);
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
        return new ProxyResponse(v3, v2, pendingIntent0, v, bundle0, arr_b);
    }

    static void zza(ProxyResponse proxyResponse0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, proxyResponse0.zzPu);
        zzb.zzc(parcel0, 1000, proxyResponse0.versionCode);
        zzb.zza(parcel0, 2, proxyResponse0.zzPv, v, false);
        zzb.zzc(parcel0, 3, proxyResponse0.zzPw);
        zzb.zza(parcel0, 4, proxyResponse0.zzPt, false);
        zzb.zza(parcel0, 5, proxyResponse0.zzPs, false);
        zzb.zzH(parcel0, v1);
    }

    public ProxyResponse[] zzay(int v) {
        return new ProxyResponse[v];
    }
}

