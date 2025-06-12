package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zza extends IInterface {
    public static abstract class com.google.android.gms.nearby.messages.internal.zza.zza extends Binder implements zza {
        static class com.google.android.gms.nearby.messages.internal.zza.zza.zza implements zza {
            private IBinder zznF;

            com.google.android.gms.nearby.messages.internal.zza.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.nearby.messages.internal.zza
            public void zza(MessageWrapper messageWrapper0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IMessageListener");
                    if(messageWrapper0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        messageWrapper0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.nearby.messages.internal.zza
            public void zza(MessageWrapper messageWrapper0, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IMessageListener");
                    if(messageWrapper0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        messageWrapper0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.nearby.messages.internal.zza
            public void zzb(MessageWrapper messageWrapper0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.IMessageListener");
                    if(messageWrapper0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        messageWrapper0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            MessageWrapper messageWrapper0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
                    if(data.readInt() != 0) {
                        messageWrapper0 = MessageWrapper.CREATOR.zzft(data);
                    }
                    this.zza(messageWrapper0);
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
                    if(data.readInt() != 0) {
                        messageWrapper0 = MessageWrapper.CREATOR.zzft(data);
                    }
                    this.zzb(messageWrapper0);
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
                    if(data.readInt() != 0) {
                        messageWrapper0 = MessageWrapper.CREATOR.zzft(data);
                    }
                    this.zza(messageWrapper0, data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.nearby.messages.internal.IMessageListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zza zzdd(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.messages.internal.IMessageListener");
            return iInterface0 != null && iInterface0 instanceof zza ? ((zza)iInterface0) : new com.google.android.gms.nearby.messages.internal.zza.zza.zza(iBinder0);
        }
    }

    void zza(MessageWrapper arg1) throws RemoteException;

    void zza(MessageWrapper arg1, int arg2) throws RemoteException;

    void zzb(MessageWrapper arg1) throws RemoteException;
}

