package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public interface zzcs extends IInterface {
    public static abstract class zza extends Binder implements zzcs {
        static class com.google.android.gms.internal.zzcs.zza.zza implements zzcs {
            private IBinder zznF;

            com.google.android.gms.internal.zzcs.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzcs
            public List getAvailableAssetNames() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.createStringArrayList();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzcs
            public String getCustomTemplateId() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzcs
            public void performClick(String assetName) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    parcel0.writeString(assetName);
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzcs
            public void recordImpression() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzcs
            public String zzQ(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    parcel0.writeString(s);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzcs
            public zzck zzR(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    parcel0.writeString(s);
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.internal.zzck.zza.zzt(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    String s = this.zzQ(data.readString());
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    zzck zzck0 = this.zzR(data.readString());
                    reply.writeNoException();
                    reply.writeStrongBinder((zzck0 == null ? null : zzck0.asBinder()));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    List list0 = this.getAvailableAssetNames();
                    reply.writeNoException();
                    reply.writeStringList(list0);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    String s1 = this.getCustomTemplateId();
                    reply.writeNoException();
                    reply.writeString(s1);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    this.performClick(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    this.recordImpression();
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzcs zzy(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            return iInterface0 != null && iInterface0 instanceof zzcs ? ((zzcs)iInterface0) : new com.google.android.gms.internal.zzcs.zza.zza(iBinder0);
        }
    }

    List getAvailableAssetNames() throws RemoteException;

    String getCustomTemplateId() throws RemoteException;

    void performClick(String arg1) throws RemoteException;

    void recordImpression() throws RemoteException;

    String zzQ(String arg1) throws RemoteException;

    zzck zzR(String arg1) throws RemoteException;
}

