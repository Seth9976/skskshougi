package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzex extends IInterface {
    public static abstract class zza extends Binder implements zzex {
        static class com.google.android.gms.internal.zzex.zza.zza implements zzex {
            private IBinder zznF;

            com.google.android.gms.internal.zzex.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzex
            public void onBackPressed() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzex
            public void onCreate(Bundle savedInstanceState) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    if(savedInstanceState == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        savedInstanceState.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzex
            public void onDestroy() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzex
            public void onPause() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzex
            public void onRestart() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzex
            public void onResume() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzex
            public void onSaveInstanceState(Bundle outState) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    if(outState == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        outState.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(6, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.internal.zzex
            public void onStart() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzex
            public void onStop() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzex
            public void zzaE() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            Bundle bundle0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    if(data.readInt() != 0) {
                        bundle0 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                    }
                    this.onCreate(bundle0);
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.onRestart();
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.onStart();
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.onResume();
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.onPause();
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    if(data.readInt() != 0) {
                        bundle0 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                    }
                    this.onSaveInstanceState(bundle0);
                    reply.writeNoException();
                    if(bundle0 != null) {
                        reply.writeInt(1);
                        bundle0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.onStop();
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.onDestroy();
                    reply.writeNoException();
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.zzaE();
                    reply.writeNoException();
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    this.onBackPressed();
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzex zzI(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterface0 != null && iInterface0 instanceof zzex ? ((zzex)iInterface0) : new com.google.android.gms.internal.zzex.zza.zza(iBinder0);
        }
    }

    void onBackPressed() throws RemoteException;

    void onCreate(Bundle arg1) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onPause() throws RemoteException;

    void onRestart() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(Bundle arg1) throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;

    void zzaE() throws RemoteException;
}

