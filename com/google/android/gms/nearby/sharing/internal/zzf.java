package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.sharing.SharedContent;
import java.util.ArrayList;

public class zzf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzfC(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzir(x0);
    }

    static void zza(ProvideContentRequest provideContentRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zzc(parcel0, 1, provideContentRequest0.versionCode);
        zzb.zza(parcel0, 2, provideContentRequest0.zzaGp, false);
        zzb.zza(parcel0, 3, provideContentRequest0.zzxi(), false);
        zzb.zzc(parcel0, 4, provideContentRequest0.zzaGr, false);
        zzb.zza(parcel0, 5, provideContentRequest0.zzaGs);
        zzb.zza(parcel0, 6, provideContentRequest0.zzxa(), false);
        zzb.zzH(parcel0, v1);
    }

    public ProvideContentRequest zzfC(Parcel parcel0) {
        IBinder iBinder0 = null;
        int v = zza.zzab(parcel0);
        int v1 = 0;
        long v2 = 0L;
        ArrayList arrayList0 = null;
        IBinder iBinder1 = null;
        IBinder iBinder2 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = zza.zzaa(parcel0);
            switch(0xFFFF & v3) {
                case 1: {
                    v1 = zza.zzg(parcel0, v3);
                    break;
                }
                case 2: {
                    iBinder2 = zza.zzp(parcel0, v3);
                    break;
                }
                case 3: {
                    iBinder1 = zza.zzp(parcel0, v3);
                    break;
                }
                case 4: {
                    arrayList0 = zza.zzc(parcel0, v3, SharedContent.CREATOR);
                    break;
                }
                case 5: {
                    v2 = zza.zzi(parcel0, v3);
                    break;
                }
                case 6: {
                    iBinder0 = zza.zzp(parcel0, v3);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new ProvideContentRequest(v1, iBinder2, iBinder1, arrayList0, v2, iBinder0);
    }

    public ProvideContentRequest[] zzir(int v) {
        return new ProvideContentRequest[v];
    }
}

