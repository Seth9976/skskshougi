package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenResponse;
import com.google.android.gms.wallet.firstparty.GetInstrumentsResponse;

public interface zzqv extends IInterface {
    public static abstract class zza extends Binder implements zzqv {
        static class com.google.android.gms.internal.zzqv.zza.zza implements zzqv {
            private IBinder zznF;

            com.google.android.gms.internal.zzqv.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzqv
            public void zza(int v, FullWallet fullWallet0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    parcel0.writeInt(v);
                    if(fullWallet0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        fullWallet0.writeToParcel(parcel0, 0);
                    }
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqv
            public void zza(int v, MaskedWallet maskedWallet0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    parcel0.writeInt(v);
                    if(maskedWallet0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        maskedWallet0.writeToParcel(parcel0, 0);
                    }
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqv
            public void zza(int v, boolean z, Bundle bundle0) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    parcel0.writeInt(v);
                    if(!z) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqv
            public void zza(Status status0, GetBuyFlowInitializationTokenResponse getBuyFlowInitializationTokenResponse0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
                    }
                    if(getBuyFlowInitializationTokenResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getBuyFlowInitializationTokenResponse0.writeToParcel(parcel0, 0);
                    }
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqv
            public void zza(Status status0, GetInstrumentsResponse getInstrumentsResponse0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
                    }
                    if(getInstrumentsResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getInstrumentsResponse0.writeToParcel(parcel0, 0);
                    }
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqv
            public void zzb(int v, boolean z, Bundle bundle0) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    parcel0.writeInt(v);
                    if(!z) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqv
            public void zzj(int v, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    parcel0.writeInt(v);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    this.zza(data.readInt(), (data.readInt() == 0 ? null : ((MaskedWallet)MaskedWallet.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    this.zza(data.readInt(), (data.readInt() == 0 ? null : ((FullWallet)FullWallet.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    this.zza(data.readInt(), data.readInt() != 0, (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    this.zzj(data.readInt(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    this.zza((data.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((GetInstrumentsResponse)GetInstrumentsResponse.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    this.zzb(data.readInt(), data.readInt() != 0, (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    this.zza((data.readInt() == 0 ? null : ((Status)Status.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((GetBuyFlowInitializationTokenResponse)GetBuyFlowInitializationTokenResponse.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzqv zzdK(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzqv ? ((zzqv)iInterface0) : new com.google.android.gms.internal.zzqv.zza.zza(iBinder0);
        }
    }

    void zza(int arg1, FullWallet arg2, Bundle arg3) throws RemoteException;

    void zza(int arg1, MaskedWallet arg2, Bundle arg3) throws RemoteException;

    void zza(int arg1, boolean arg2, Bundle arg3) throws RemoteException;

    void zza(Status arg1, GetBuyFlowInitializationTokenResponse arg2, Bundle arg3) throws RemoteException;

    void zza(Status arg1, GetInstrumentsResponse arg2, Bundle arg3) throws RemoteException;

    void zzb(int arg1, boolean arg2, Bundle arg3) throws RemoteException;

    void zzj(int arg1, Bundle arg2) throws RemoteException;
}

