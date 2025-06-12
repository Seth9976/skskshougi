package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public interface IStreetViewPanoramaFragmentDelegate extends IInterface {
    public static abstract class zza extends Binder implements IStreetViewPanoramaFragmentDelegate {
        static class com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate.zza.zza implements IStreetViewPanoramaFragmentDelegate {
            private IBinder zznF;

            com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public IStreetViewPanoramaDelegate getStreetViewPanorama() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate.zza.zzcG(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void getStreetViewPanoramaAsync(zzv callback) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    parcel0.writeStrongBinder((callback == null ? null : callback.asBinder()));
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public boolean isReady() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        z = true;
                    }
                    return z;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onCreate(Bundle savedInstanceState) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    if(savedInstanceState == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        savedInstanceState.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public zzd onCreateView(zzd inflaterWrapper, zzd containerWrapper, Bundle savedInstanceState) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    parcel0.writeStrongBinder((inflaterWrapper == null ? null : inflaterWrapper.asBinder()));
                    if(containerWrapper != null) {
                        iBinder0 = containerWrapper.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    if(savedInstanceState == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        savedInstanceState.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onDestroy() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onDestroyView() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onInflate(zzd activityWrapper, StreetViewPanoramaOptions options, Bundle savedInstanceState) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    parcel0.writeStrongBinder((activityWrapper == null ? null : activityWrapper.asBinder()));
                    if(options == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        options.writeToParcel(parcel0, 0);
                    }
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

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onLowMemory() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onPause() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onResume() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
            public void onSaveInstanceState(Bundle outState) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    if(outState == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        outState.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(10, parcel0, parcel1, 0);
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
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate0 = this.getStreetViewPanorama();
                    reply.writeNoException();
                    reply.writeStrongBinder((iStreetViewPanoramaDelegate0 == null ? null : iStreetViewPanoramaDelegate0.asBinder()));
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.onInflate(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), (data.readInt() == 0 ? null : StreetViewPanoramaOptions.CREATOR.zzeJ(data)), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.onCreate((data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    zzd zzd0 = this.onCreateView(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    if(zzd0 != null) {
                        iBinder0 = zzd0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.onResume();
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.onPause();
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.onDestroyView();
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.onDestroy();
                    reply.writeNoException();
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.onLowMemory();
                    reply.writeNoException();
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    Bundle bundle0 = data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data));
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
                case 11: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    boolean z = this.isReady();
                    reply.writeNoException();
                    reply.writeInt((z ? 1 : 0));
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    this.getStreetViewPanoramaAsync(com.google.android.gms.maps.internal.zzv.zza.zzcD(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static IStreetViewPanoramaFragmentDelegate zzcH(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            return iInterface0 != null && iInterface0 instanceof IStreetViewPanoramaFragmentDelegate ? ((IStreetViewPanoramaFragmentDelegate)iInterface0) : new com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate.zza.zza(iBinder0);
        }
    }

    IStreetViewPanoramaDelegate getStreetViewPanorama() throws RemoteException;

    void getStreetViewPanoramaAsync(zzv arg1) throws RemoteException;

    boolean isReady() throws RemoteException;

    void onCreate(Bundle arg1) throws RemoteException;

    zzd onCreateView(zzd arg1, zzd arg2, Bundle arg3) throws RemoteException;

    void onDestroy() throws RemoteException;

    void onDestroyView() throws RemoteException;

    void onInflate(zzd arg1, StreetViewPanoramaOptions arg2, Bundle arg3) throws RemoteException;

    void onLowMemory() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(Bundle arg1) throws RemoteException;
}

