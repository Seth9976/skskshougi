package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

public class zzv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcU(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeP(x0);
    }

    static void zza(SessionReadRequest sessionReadRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, sessionReadRequest0.getSessionName(), false);
        zzb.zzc(parcel0, 1000, sessionReadRequest0.getVersionCode());
        zzb.zza(parcel0, 2, sessionReadRequest0.getSessionId(), false);
        zzb.zza(parcel0, 3, sessionReadRequest0.zzkt());
        zzb.zza(parcel0, 4, sessionReadRequest0.zzqs());
        zzb.zzc(parcel0, 5, sessionReadRequest0.getDataTypes(), false);
        zzb.zzc(parcel0, 6, sessionReadRequest0.getDataSources(), false);
        zzb.zza(parcel0, 7, sessionReadRequest0.zzro());
        zzb.zza(parcel0, 8, sessionReadRequest0.zzqZ());
        zzb.zzb(parcel0, 9, sessionReadRequest0.getExcludedPackages(), false);
        zzb.zza(parcel0, 10, sessionReadRequest0.zzqU(), false);
        zzb.zza(parcel0, 11, sessionReadRequest0.getPackageName(), false);
        zzb.zzH(parcel0, v1);
    }

    public SessionReadRequest zzcU(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        long v2 = 0L;
        long v3 = 0L;
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        boolean z = false;
        boolean z1 = false;
        ArrayList arrayList2 = null;
        IBinder iBinder0 = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    s = zza.zzo(parcel0, v4);
                    break;
                }
                case 2: {
                    s1 = zza.zzo(parcel0, v4);
                    break;
                }
                case 3: {
                    v2 = zza.zzi(parcel0, v4);
                    break;
                }
                case 4: {
                    v3 = zza.zzi(parcel0, v4);
                    break;
                }
                case 5: {
                    arrayList0 = zza.zzc(parcel0, v4, DataType.CREATOR);
                    break;
                }
                case 6: {
                    arrayList1 = zza.zzc(parcel0, v4, DataSource.CREATOR);
                    break;
                }
                case 7: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                case 8: {
                    z1 = zza.zzc(parcel0, v4);
                    break;
                }
                case 9: {
                    arrayList2 = zza.zzC(parcel0, v4);
                    break;
                }
                case 10: {
                    iBinder0 = zza.zzp(parcel0, v4);
                    break;
                }
                case 11: {
                    s2 = zza.zzo(parcel0, v4);
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
        return new SessionReadRequest(v1, s, s1, v2, v3, arrayList0, arrayList1, z, z1, arrayList2, iBinder0, s2);
    }

    public SessionReadRequest[] zzeP(int v) {
        return new SessionReadRequest[v];
    }
}

