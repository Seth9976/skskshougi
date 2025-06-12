package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

public class zzs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel x0) {
        return this.zzcR(x0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int x0) {
        return this.zzeL(x0);
    }

    static void zza(SensorRegistrationRequest sensorRegistrationRequest0, Parcel parcel0, int v) {
        int v1 = zzb.zzac(parcel0);
        zzb.zza(parcel0, 1, sensorRegistrationRequest0.getDataSource(), v, false);
        zzb.zzc(parcel0, 1000, sensorRegistrationRequest0.getVersionCode());
        zzb.zza(parcel0, 2, sensorRegistrationRequest0.getDataType(), v, false);
        zzb.zza(parcel0, 3, sensorRegistrationRequest0.zzrl(), false);
        zzb.zzc(parcel0, 4, sensorRegistrationRequest0.zzams);
        zzb.zzc(parcel0, 5, sensorRegistrationRequest0.zzamt);
        zzb.zza(parcel0, 6, sensorRegistrationRequest0.zzqL());
        zzb.zza(parcel0, 7, sensorRegistrationRequest0.zzri());
        zzb.zza(parcel0, 8, sensorRegistrationRequest0.zzrg(), v, false);
        zzb.zza(parcel0, 9, sensorRegistrationRequest0.zzrh());
        zzb.zzc(parcel0, 10, sensorRegistrationRequest0.getAccuracyMode());
        zzb.zzc(parcel0, 11, sensorRegistrationRequest0.zzrj(), false);
        zzb.zza(parcel0, 12, sensorRegistrationRequest0.zzrk());
        zzb.zza(parcel0, 13, sensorRegistrationRequest0.zzqU(), false);
        zzb.zza(parcel0, 14, sensorRegistrationRequest0.getPackageName(), false);
        zzb.zzH(parcel0, v1);
    }

    public SensorRegistrationRequest zzcR(Parcel parcel0) {
        int v = zza.zzab(parcel0);
        int v1 = 0;
        DataSource dataSource0 = null;
        DataType dataType0 = null;
        IBinder iBinder0 = null;
        int v2 = 0;
        int v3 = 0;
        long v4 = 0L;
        long v5 = 0L;
        PendingIntent pendingIntent0 = null;
        long v6 = 0L;
        int v7 = 0;
        ArrayList arrayList0 = null;
        long v8 = 0L;
        IBinder iBinder1 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v9 = zza.zzaa(parcel0);
            switch(0xFFFF & v9) {
                case 1: {
                    dataSource0 = (DataSource)zza.zza(parcel0, v9, DataSource.CREATOR);
                    break;
                }
                case 2: {
                    dataType0 = (DataType)zza.zza(parcel0, v9, DataType.CREATOR);
                    break;
                }
                case 3: {
                    iBinder0 = zza.zzp(parcel0, v9);
                    break;
                }
                case 4: {
                    v2 = zza.zzg(parcel0, v9);
                    break;
                }
                case 5: {
                    v3 = zza.zzg(parcel0, v9);
                    break;
                }
                case 6: {
                    v4 = zza.zzi(parcel0, v9);
                    break;
                }
                case 7: {
                    v5 = zza.zzi(parcel0, v9);
                    break;
                }
                case 8: {
                    pendingIntent0 = (PendingIntent)zza.zza(parcel0, v9, PendingIntent.CREATOR);
                    break;
                }
                case 9: {
                    v6 = zza.zzi(parcel0, v9);
                    break;
                }
                case 10: {
                    v7 = zza.zzg(parcel0, v9);
                    break;
                }
                case 11: {
                    arrayList0 = zza.zzc(parcel0, v9, LocationRequest.CREATOR);
                    break;
                }
                case 12: {
                    v8 = zza.zzi(parcel0, v9);
                    break;
                }
                case 13: {
                    iBinder1 = zza.zzp(parcel0, v9);
                    break;
                }
                case 14: {
                    s = zza.zzo(parcel0, v9);
                    break;
                }
                case 1000: {
                    v1 = zza.zzg(parcel0, v9);
                    break;
                }
                default: {
                    zza.zzb(parcel0, v9);
                }
            }
        }
        if(parcel0.dataPosition() != v) {
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + v, parcel0);
        }
        return new SensorRegistrationRequest(v1, dataSource0, dataType0, iBinder0, v2, v3, v4, v5, pendingIntent0, v6, v7, arrayList0, v8, iBinder1, s);
    }

    public SensorRegistrationRequest[] zzeL(int v) {
        return new SensorRegistrationRequest[v];
    }
}

