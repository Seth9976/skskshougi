package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public interface zzc extends IInterface {
    public static abstract class zza extends Binder implements zzc {
        static class com.google.android.gms.maps.internal.zzc.zza.zza implements zzc {
            private IBinder zznF;

            com.google.android.gms.maps.internal.zzc.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.maps.internal.zzc
            public IMapViewDelegate zza(zzd zzd0, GoogleMapOptions googleMapOptions0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    if(googleMapOptions0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        googleMapOptions0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.internal.IMapViewDelegate.zza.zzcm(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.zzc
            public IStreetViewPanoramaViewDelegate zza(zzd zzd0, StreetViewPanoramaOptions streetViewPanoramaOptions0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    if(streetViewPanoramaOptions0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        streetViewPanoramaOptions0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate.zza.zzcI(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.zzc
            public void zzd(zzd zzd0, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    parcel0.writeInt(v);
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.zzc
            public void zzq(zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.zzc
            public IMapFragmentDelegate zzr(zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.internal.IMapFragmentDelegate.zza.zzcl(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.zzc
            public IStreetViewPanoramaFragmentDelegate zzs(zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate.zza.zzcH(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.zzc
            public ICameraUpdateFactoryDelegate zzvC() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate.zza.zzce(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.maps.internal.zzc
            public com.google.android.gms.maps.model.internal.zzd zzvD() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.maps.model.internal.zzd.zza.zzcK(parcel1.readStrongBinder());
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
                    data.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    this.zzq(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    IMapFragmentDelegate iMapFragmentDelegate0 = this.zzr(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    if(iMapFragmentDelegate0 != null) {
                        iBinder0 = iMapFragmentDelegate0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    IMapViewDelegate iMapViewDelegate0 = this.zza(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), (data.readInt() == 0 ? null : GoogleMapOptions.CREATOR.zzeI(data)));
                    reply.writeNoException();
                    if(iMapViewDelegate0 != null) {
                        iBinder0 = iMapViewDelegate0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate0 = this.zzvC();
                    reply.writeNoException();
                    if(iCameraUpdateFactoryDelegate0 != null) {
                        iBinder0 = iCameraUpdateFactoryDelegate0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    com.google.android.gms.maps.model.internal.zzd zzd0 = this.zzvD();
                    reply.writeNoException();
                    if(zzd0 != null) {
                        iBinder0 = zzd0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    this.zzd(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate0 = this.zza(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), (data.readInt() == 0 ? null : StreetViewPanoramaOptions.CREATOR.zzeJ(data)));
                    reply.writeNoException();
                    if(iStreetViewPanoramaViewDelegate0 != null) {
                        iBinder0 = iStreetViewPanoramaViewDelegate0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                    IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate0 = this.zzs(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    if(iStreetViewPanoramaFragmentDelegate0 != null) {
                        iBinder0 = iStreetViewPanoramaFragmentDelegate0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.maps.internal.ICreator");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzc zzcg(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            return iInterface0 != null && iInterface0 instanceof zzc ? ((zzc)iInterface0) : new com.google.android.gms.maps.internal.zzc.zza.zza(iBinder0);
        }
    }

    IMapViewDelegate zza(zzd arg1, GoogleMapOptions arg2) throws RemoteException;

    IStreetViewPanoramaViewDelegate zza(zzd arg1, StreetViewPanoramaOptions arg2) throws RemoteException;

    void zzd(zzd arg1, int arg2) throws RemoteException;

    void zzq(zzd arg1) throws RemoteException;

    IMapFragmentDelegate zzr(zzd arg1) throws RemoteException;

    IStreetViewPanoramaFragmentDelegate zzs(zzd arg1) throws RemoteException;

    ICameraUpdateFactoryDelegate zzvC() throws RemoteException;

    com.google.android.gms.maps.model.internal.zzd zzvD() throws RemoteException;
}

