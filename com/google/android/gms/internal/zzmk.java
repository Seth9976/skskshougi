package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.GetSyncInfoRequest;
import com.google.android.gms.fitness.request.ReadRawRequest;
import com.google.android.gms.fitness.request.ReadStatsRequest;

public interface zzmk extends IInterface {
    public static abstract class zza extends Binder implements zzmk {
        static class com.google.android.gms.internal.zzmk.zza.zza implements zzmk {
            private IBinder zznF;

            com.google.android.gms.internal.zzmk.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzmk
            public void zza(DailyTotalRequest dailyTotalRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if(dailyTotalRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dailyTotalRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(7, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmk
            public void zza(DataDeleteRequest dataDeleteRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if(dataDeleteRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataDeleteRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmk
            public void zza(DataInsertRequest dataInsertRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if(dataInsertRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataInsertRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmk
            public void zza(DataReadRequest dataReadRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if(dataReadRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataReadRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmk
            public void zza(GetSyncInfoRequest getSyncInfoRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if(getSyncInfoRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getSyncInfoRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmk
            public void zza(ReadRawRequest readRawRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if(readRawRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        readRawRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(6, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmk
            public void zza(ReadStatsRequest readStatsRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if(readStatsRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        readStatsRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            DataReadRequest dataReadRequest0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if(data.readInt() != 0) {
                        dataReadRequest0 = (DataReadRequest)DataReadRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(dataReadRequest0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if(data.readInt() != 0) {
                        dataReadRequest0 = (DataInsertRequest)DataInsertRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((DataInsertRequest)dataReadRequest0));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if(data.readInt() != 0) {
                        dataReadRequest0 = (DataDeleteRequest)DataDeleteRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((DataDeleteRequest)dataReadRequest0));
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if(data.readInt() != 0) {
                        dataReadRequest0 = (GetSyncInfoRequest)GetSyncInfoRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetSyncInfoRequest)dataReadRequest0));
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if(data.readInt() != 0) {
                        dataReadRequest0 = (ReadStatsRequest)ReadStatsRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((ReadStatsRequest)dataReadRequest0));
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if(data.readInt() != 0) {
                        dataReadRequest0 = (ReadRawRequest)ReadRawRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((ReadRawRequest)dataReadRequest0));
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    if(data.readInt() != 0) {
                        dataReadRequest0 = (DailyTotalRequest)DailyTotalRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((DailyTotalRequest)dataReadRequest0));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzmk zzbv(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
            return iInterface0 != null && iInterface0 instanceof zzmk ? ((zzmk)iInterface0) : new com.google.android.gms.internal.zzmk.zza.zza(iBinder0);
        }
    }

    void zza(DailyTotalRequest arg1) throws RemoteException;

    void zza(DataDeleteRequest arg1) throws RemoteException;

    void zza(DataInsertRequest arg1) throws RemoteException;

    void zza(DataReadRequest arg1) throws RemoteException;

    void zza(GetSyncInfoRequest arg1) throws RemoteException;

    void zza(ReadRawRequest arg1) throws RemoteException;

    void zza(ReadStatsRequest arg1) throws RemoteException;
}

