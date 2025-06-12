package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.firstparty.GetBuyFlowInitializationTokenRequest;
import com.google.android.gms.wallet.firstparty.GetInstrumentsRequest;

public interface zzqs extends IInterface {
    public static abstract class zza extends Binder implements zzqs {
        static class com.google.android.gms.internal.zzqs.zza.zza implements zzqs {
            private IBinder zznF;

            com.google.android.gms.internal.zzqs.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzqs
            public void zzA(Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(10, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqs
            public void zza(Bundle bundle0, zzqv zzqv0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    if(zzqv0 != null) {
                        iBinder0 = zzqv0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(5, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqs
            public void zza(CreateWalletObjectsRequest createWalletObjectsRequest0, Bundle bundle0, zzqv zzqv0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if(createWalletObjectsRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        createWalletObjectsRequest0.writeToParcel(parcel0, 0);
                    }
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    if(zzqv0 != null) {
                        iBinder0 = zzqv0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(6, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqs
            public void zza(FullWalletRequest fullWalletRequest0, Bundle bundle0, zzqv zzqv0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if(fullWalletRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        fullWalletRequest0.writeToParcel(parcel0, 0);
                    }
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    if(zzqv0 != null) {
                        iBinder0 = zzqv0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqs
            public void zza(MaskedWalletRequest maskedWalletRequest0, Bundle bundle0, zzqu zzqu0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if(maskedWalletRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        maskedWalletRequest0.writeToParcel(parcel0, 0);
                    }
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    if(zzqu0 != null) {
                        iBinder0 = zzqu0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(7, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqs
            public void zza(MaskedWalletRequest maskedWalletRequest0, Bundle bundle0, zzqv zzqv0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if(maskedWalletRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        maskedWalletRequest0.writeToParcel(parcel0, 0);
                    }
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    if(zzqv0 != null) {
                        iBinder0 = zzqv0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqs
            public void zza(NotifyTransactionStatusRequest notifyTransactionStatusRequest0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if(notifyTransactionStatusRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        notifyTransactionStatusRequest0.writeToParcel(parcel0, 0);
                    }
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqs
            public void zza(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest0, Bundle bundle0, zzqv zzqv0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if(getBuyFlowInitializationTokenRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getBuyFlowInitializationTokenRequest0.writeToParcel(parcel0, 0);
                    }
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    if(zzqv0 != null) {
                        iBinder0 = zzqv0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(12, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqs
            public void zza(GetInstrumentsRequest getInstrumentsRequest0, Bundle bundle0, zzqv zzqv0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if(getInstrumentsRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getInstrumentsRequest0.writeToParcel(parcel0, 0);
                    }
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    if(zzqv0 != null) {
                        iBinder0 = zzqv0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(8, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqs
            public void zza(String s, String s1, Bundle bundle0, zzqv zzqv0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    if(zzqv0 != null) {
                        iBinder0 = zzqv0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqs
            public void zzb(Bundle bundle0, zzqv zzqv0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    if(zzqv0 != null) {
                        iBinder0 = zzqv0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(11, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqs
            public void zzz(Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(9, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    this.zza((data.readInt() == 0 ? null : ((MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))), com.google.android.gms.internal.zzqv.zza.zzdK(data.readStrongBinder()));
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    this.zza((data.readInt() == 0 ? null : ((FullWalletRequest)FullWalletRequest.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))), com.google.android.gms.internal.zzqv.zza.zzdK(data.readStrongBinder()));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    this.zza(data.readString(), data.readString(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))), com.google.android.gms.internal.zzqv.zza.zzdK(data.readStrongBinder()));
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    this.zza((data.readInt() == 0 ? null : ((NotifyTransactionStatusRequest)NotifyTransactionStatusRequest.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    this.zza((data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))), com.google.android.gms.internal.zzqv.zza.zzdK(data.readStrongBinder()));
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    this.zza((data.readInt() == 0 ? null : ((CreateWalletObjectsRequest)CreateWalletObjectsRequest.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))), com.google.android.gms.internal.zzqv.zza.zzdK(data.readStrongBinder()));
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    this.zza((data.readInt() == 0 ? null : ((MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))), com.google.android.gms.internal.zzqu.zza.zzdJ(data.readStrongBinder()));
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    this.zza((data.readInt() == 0 ? null : ((GetInstrumentsRequest)GetInstrumentsRequest.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))), com.google.android.gms.internal.zzqv.zza.zzdK(data.readStrongBinder()));
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    this.zzz((data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    this.zzA((data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    this.zzb((data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))), com.google.android.gms.internal.zzqv.zza.zzdK(data.readStrongBinder()));
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
                    this.zza((data.readInt() == 0 ? null : ((GetBuyFlowInitializationTokenRequest)GetBuyFlowInitializationTokenRequest.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))), com.google.android.gms.internal.zzqv.zza.zzdK(data.readStrongBinder()));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.wallet.internal.IOwService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzqs zzdH(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
            return iInterface0 != null && iInterface0 instanceof zzqs ? ((zzqs)iInterface0) : new com.google.android.gms.internal.zzqs.zza.zza(iBinder0);
        }
    }

    void zzA(Bundle arg1) throws RemoteException;

    void zza(Bundle arg1, zzqv arg2) throws RemoteException;

    void zza(CreateWalletObjectsRequest arg1, Bundle arg2, zzqv arg3) throws RemoteException;

    void zza(FullWalletRequest arg1, Bundle arg2, zzqv arg3) throws RemoteException;

    void zza(MaskedWalletRequest arg1, Bundle arg2, zzqu arg3) throws RemoteException;

    void zza(MaskedWalletRequest arg1, Bundle arg2, zzqv arg3) throws RemoteException;

    void zza(NotifyTransactionStatusRequest arg1, Bundle arg2) throws RemoteException;

    void zza(GetBuyFlowInitializationTokenRequest arg1, Bundle arg2, zzqv arg3) throws RemoteException;

    void zza(GetInstrumentsRequest arg1, Bundle arg2, zzqv arg3) throws RemoteException;

    void zza(String arg1, String arg2, Bundle arg3, zzqv arg4) throws RemoteException;

    void zzb(Bundle arg1, zzqv arg2) throws RemoteException;

    void zzz(Bundle arg1) throws RemoteException;
}

