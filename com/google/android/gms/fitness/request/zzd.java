package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;

public class zzd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcD(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzex(x0);
    }

    static void zza(DataDeleteRequest dataDeleteRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, dataDeleteRequest0.zzkt());
        zzb.zzc(parcel0, 1000, dataDeleteRequest0.getVersionCode());
        zzb.zza(parcel0, 2, dataDeleteRequest0.zzqs());
        zzb.zzc(parcel0, 3, dataDeleteRequest0.getDataSources(), false);
        zzb.zzc(parcel0, 4, dataDeleteRequest0.getDataTypes(), false);
        zzb.zzc(parcel0, 5, dataDeleteRequest0.getSessions(), false);
        zzb.zza(parcel0, 6, dataDeleteRequest0.zzqV());
        zzb.zza(parcel0, 7, dataDeleteRequest0.zzqW());
        zzb.zza(parcel0, 8, dataDeleteRequest0.zzqU(), false);
        zzb.zza(parcel0, 9, dataDeleteRequest0.getPackageName(), false);
        zzb.zzH(parcel0, v1);
    }

    public DataDeleteRequest zzcD(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        long v2 = 0L;
        long v3 = 0L;
        ArrayList arrayList0 = null;
        ArrayList arrayList1 = null;
        ArrayList arrayList2 = null;
        boolean z = false;
        boolean z1 = false;
        IBinder iBinder0 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v4 = zza.zzaa(parcel0);
            switch(0xFFFF & v4) {
                case 1: {
                    v2 = zza.zzi(parcel0, v4);
                    break;
                }
                case 2: {
                    v3 = zza.zzi(parcel0, v4);
                    break;
                }
                case 3: {
                    arrayList0 = zza.zzc(parcel0, v4, DataSource.CREATOR);
                    break;
                }
                case 4: {
                    arrayList1 = zza.zzc(parcel0, v4, DataType.CREATOR);
                    break;
                }
                case 5: {
                    arrayList2 = zza.zzc(parcel0, v4, Session.CREATOR);
                    break;
                }
                case 6: {
                    z = zza.zzc(parcel0, v4);
                    break;
                }
                case 7: {
                    z1 = zza.zzc(parcel0, v4);
                    break;
                }
                case 8: {
                    iBinder0 = zza.zzp(parcel0, v4);
                    break;
                }
                case 9: {
                    s = zza.zzo(parcel0, v4);
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
        return new DataDeleteRequest(v1, v2, v3, arrayList0, arrayList1, arrayList2, z, z1, iBinder0, s);
    }

    public DataDeleteRequest[] zzex(int v) {
        return new DataDeleteRequest[v];
    }
}

