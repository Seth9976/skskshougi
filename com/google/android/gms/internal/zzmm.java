package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.request.SubscribeRequest;
import com.google.android.gms.fitness.request.UnsubscribeRequest;

public interface zzmm extends IInterface {
    public static abstract class zza extends Binder implements zzmm {
        static class com.google.android.gms.internal.zzmm.zza.zza implements zzmm {
            private IBinder zznF;

            com.google.android.gms.internal.zzmm.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzmm
            public void zza(ListSubscriptionsRequest listSubscriptionsRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                    if(listSubscriptionsRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        listSubscriptionsRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmm
            public void zza(SubscribeRequest subscribeRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                    if(subscribeRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        subscribeRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzmm
            public void zza(UnsubscribeRequest unsubscribeRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                    if(unsubscribeRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        unsubscribeRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            SubscribeRequest subscribeRequest0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                    if(data.readInt() != 0) {
                        subscribeRequest0 = (SubscribeRequest)SubscribeRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(subscribeRequest0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                    if(data.readInt() != 0) {
                        subscribeRequest0 = (UnsubscribeRequest)UnsubscribeRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((UnsubscribeRequest)subscribeRequest0));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                    if(data.readInt() != 0) {
                        subscribeRequest0 = (ListSubscriptionsRequest)ListSubscriptionsRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((ListSubscriptionsRequest)subscribeRequest0));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzmm zzbx(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
            return iInterface0 != null && iInterface0 instanceof zzmm ? ((zzmm)iInterface0) : new com.google.android.gms.internal.zzmm.zza.zza(iBinder0);
        }
    }

    void zza(ListSubscriptionsRequest arg1) throws RemoteException;

    void zza(SubscribeRequest arg1) throws RemoteException;

    void zza(UnsubscribeRequest arg1) throws RemoteException;
}

