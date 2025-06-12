package com.enhance.gameservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IGameTuningService extends IInterface {
    public static abstract class Stub extends Binder implements IGameTuningService {
        static class Proxy implements IGameTuningService {
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override  // com.enhance.gameservice.IGameTuningService
            public int boostUp(int seconds) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    parcel0.writeInt(seconds);
                    this.mRemote.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.enhance.gameservice.IGameTuningService
            public int getAbstractTemperature() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    this.mRemote.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return "com.enhance.gameservice.IGameTuningService";
            }

            @Override  // com.enhance.gameservice.IGameTuningService
            public int setFramePerSecond(int fps) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    parcel0.writeInt(fps);
                    this.mRemote.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.enhance.gameservice.IGameTuningService
            public int setGamePowerSaving(boolean enable) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    if(enable) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.mRemote.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.enhance.gameservice.IGameTuningService
            public int setPreferredResolution(int resolution) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.enhance.gameservice.IGameTuningService");
                    parcel0.writeInt(resolution);
                    this.mRemote.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        private static final String DESCRIPTOR = "com.enhance.gameservice.IGameTuningService";
        static final int TRANSACTION_boostUp = 3;
        static final int TRANSACTION_getAbstractTemperature = 4;
        static final int TRANSACTION_setFramePerSecond = 2;
        static final int TRANSACTION_setGamePowerSaving = 5;
        static final int TRANSACTION_setPreferredResolution = 1;

        public Stub() {
            this.attachInterface(this, "com.enhance.gameservice.IGameTuningService");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static IGameTuningService asInterface(IBinder obj) {
            if(obj == null) {
                return null;
            }
            IInterface iInterface0 = obj.queryLocalInterface("com.enhance.gameservice.IGameTuningService");
            return iInterface0 != null && iInterface0 instanceof IGameTuningService ? ((IGameTuningService)iInterface0) : new Proxy(obj);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.enhance.gameservice.IGameTuningService");
                    int v2 = this.setPreferredResolution(data.readInt());
                    reply.writeNoException();
                    reply.writeInt(v2);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.enhance.gameservice.IGameTuningService");
                    int v3 = this.setFramePerSecond(data.readInt());
                    reply.writeNoException();
                    reply.writeInt(v3);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.enhance.gameservice.IGameTuningService");
                    int v4 = this.boostUp(data.readInt());
                    reply.writeNoException();
                    reply.writeInt(v4);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.enhance.gameservice.IGameTuningService");
                    int v5 = this.getAbstractTemperature();
                    reply.writeNoException();
                    reply.writeInt(v5);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.enhance.gameservice.IGameTuningService");
                    int v6 = this.setGamePowerSaving(data.readInt() != 0);
                    reply.writeNoException();
                    reply.writeInt(v6);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.enhance.gameservice.IGameTuningService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }
    }

    int boostUp(int arg1) throws RemoteException;

    int getAbstractTemperature() throws RemoteException;

    int setFramePerSecond(int arg1) throws RemoteException;

    int setGamePowerSaving(boolean arg1) throws RemoteException;

    int setPreferredResolution(int arg1) throws RemoteException;
}

