package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;

public interface IMapViewDelegate extends IInterface {
    public static abstract class zza extends Binder implements IMapViewDelegate {
        static class com.google.android.gms.maps.internal.IMapViewDelegate.zza.zza implements IMapViewDelegate {
            private IBinder zznF;

            com.google.android.gms.maps.internal.IMapViewDelegate.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.IMapViewDelegate
            public IGoogleMapDelegate getMap() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.internal.IGoogleMapDelegate.zza.zzch(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IMapViewDelegate
            public void getMapAsync(zzm callback) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    parcel0.writeStrongBinder((callback == null ? null : callback.asBinder()));
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IMapViewDelegate
            public zzd getView() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onCreate(Bundle savedInstanceState) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    if(savedInstanceState == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        savedInstanceState.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onDestroy() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onLowMemory() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onPause() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onResume() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IMapViewDelegate
            public void onSaveInstanceState(Bundle outState) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IMapViewDelegate");
                    if(outState == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        outState.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        outState.readFromParcel(parcel1);
                    }
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder iBinder0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    IGoogleMapDelegate iGoogleMapDelegate0 = this.getMap();
                    reply.writeNoException();
                    if(iGoogleMapDelegate0 != null) {
                        iBinder0 = iGoogleMapDelegate0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    if(data.readInt() != 0) {
                        iBinder0 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                    }
                    this.onCreate(((Bundle)iBinder0));
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.onResume();
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.onPause();
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.onDestroy();
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.onLowMemory();
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    if(data.readInt() != 0) {
                        iBinder0 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                    }
                    this.onSaveInstanceState(((Bundle)iBinder0));
                    reply.writeNoException();
                    if(iBinder0 != null) {
                        reply.writeInt(1);
                        ((Bundle)iBinder0).writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    zzd zzd0 = this.getView();
                    reply.writeNoException();
                    if(zzd0 != null) {
                        iBinder0 = zzd0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
                    this.getMapAsync(com.google.android.gms.maps.internal.zzm.zza.zzcu(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IMapViewDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static IMapViewDelegate zzcm(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            return iInterface0 != null && iInterface0 instanceof IMapViewDelegate ? ((IMapViewDelegate)iInterface0) : new com.google.android.gms.maps.internal.IMapViewDelegate.zza.zza(iBinder0);
        }
    }

    IGoogleMapDelegate getMap() throws RemoteException;

    void getMapAsync(zzm arg1) throws RemoteException;

    zzd getView() throws RemoteException;

    void onCreate(Bundle arg1) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(Bundle arg1) throws RemoteException;
}

