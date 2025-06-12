package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzc extends IInterface {
    public static abstract class zza extends Binder implements zzc {
        static class com.google.android.gms.nearby.messages.internal.zzc.zza.zza implements zzc {
            private IBinder zznF;

            com.google.android.gms.nearby.messages.internal.zzc.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.nearby.messages.internal.zzc
            public void zza(PublishRequest publishRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if(publishRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        publishRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.nearby.messages.internal.zzc
            public void zza(SubscribeRequest subscribeRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if(subscribeRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        subscribeRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.nearby.messages.internal.zzc
            public void zza(UnpublishRequest unpublishRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if(unpublishRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        unpublishRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.nearby.messages.internal.zzc
            public void zza(UnsubscribeRequest unsubscribeRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if(unsubscribeRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        unsubscribeRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.nearby.messages.internal.zzc
            public void zzdS(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    parcel0.writeString(s);
                    this.zznF.transact(6, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            PublishRequest publishRequest0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if(data.readInt() != 0) {
                        publishRequest0 = (PublishRequest)PublishRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(publishRequest0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if(data.readInt() != 0) {
                        publishRequest0 = (UnpublishRequest)UnpublishRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((UnpublishRequest)publishRequest0));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if(data.readInt() != 0) {
                        publishRequest0 = (SubscribeRequest)SubscribeRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((SubscribeRequest)publishRequest0));
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    if(data.readInt() != 0) {
                        publishRequest0 = (UnsubscribeRequest)UnsubscribeRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((UnsubscribeRequest)publishRequest0));
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    this.zzdS(data.readString());
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzc zzdf(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            return iInterface0 != null && iInterface0 instanceof zzc ? ((zzc)iInterface0) : new com.google.android.gms.nearby.messages.internal.zzc.zza.zza(iBinder0);
        }
    }

    void zza(PublishRequest arg1) throws RemoteException;

    void zza(SubscribeRequest arg1) throws RemoteException;

    void zza(UnpublishRequest arg1) throws RemoteException;

    void zza(UnsubscribeRequest arg1) throws RemoteException;

    void zzdS(String arg1) throws RemoteException;
}

