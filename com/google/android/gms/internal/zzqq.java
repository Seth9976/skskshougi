package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public interface zzqq extends IInterface {
    public static abstract class zza extends Binder implements zzqq {
        static class com.google.android.gms.internal.zzqq.zza.zza implements zzqq {
            private IBinder zznF;

            com.google.android.gms.internal.zzqq.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzqq
            public int getState() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.zznF.transact(13, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqq
            public void initialize(WalletFragmentInitParams initParams) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    if(initParams == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        initParams.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqq
            public void onActivityResult(int requestCode, int resultCode, Intent data) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    parcel0.writeInt(requestCode);
                    parcel0.writeInt(resultCode);
                    if(data == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        data.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqq
            public void onCreate(Bundle savedInstanceState) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
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

            @Override  // com.google.android.gms.internal.zzqq
            public zzd onCreateView(zzd inflaterWrapper, zzd containerWrapper, Bundle savedInstanceState) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
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
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqq
            public void onPause() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqq
            public void onResume() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqq
            public void onSaveInstanceState(Bundle outState) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    if(outState == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        outState.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(8, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.internal.zzqq
            public void onStart() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqq
            public void onStop() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqq
            public void setEnabled(boolean enabled) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    if(enabled) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqq
            public void updateMaskedWallet(MaskedWallet maskedWallet) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    if(maskedWallet == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        maskedWallet.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqq
            public void updateMaskedWalletRequest(MaskedWalletRequest request) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    if(request == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        request.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.internal.zzqq
            public void zza(zzd zzd0, WalletFragmentOptions walletFragmentOptions0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    if(walletFragmentOptions0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        walletFragmentOptions0.writeToParcel(parcel0, 0);
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
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder iBinder0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.zza(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), (data.readInt() == 0 ? null : ((WalletFragmentOptions)WalletFragmentOptions.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.onCreate((data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    zzd zzd0 = this.onCreateView(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    if(zzd0 != null) {
                        iBinder0 = zzd0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.onStart();
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.onResume();
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.onPause();
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.onStop();
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
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
                case 9: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.onActivityResult(data.readInt(), data.readInt(), (data.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.initialize((data.readInt() == 0 ? null : ((WalletFragmentInitParams)WalletFragmentInitParams.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.updateMaskedWalletRequest((data.readInt() == 0 ? null : ((MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.setEnabled(data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    int v2 = this.getState();
                    reply.writeNoException();
                    reply.writeInt(v2);
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    this.updateMaskedWallet((data.readInt() == 0 ? null : ((MaskedWallet)MaskedWallet.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzqq zzdF(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            return iInterface0 != null && iInterface0 instanceof zzqq ? ((zzqq)iInterface0) : new com.google.android.gms.internal.zzqq.zza.zza(iBinder0);
        }
    }

    int getState() throws RemoteException;

    void initialize(WalletFragmentInitParams arg1) throws RemoteException;

    void onActivityResult(int arg1, int arg2, Intent arg3) throws RemoteException;

    void onCreate(Bundle arg1) throws RemoteException;

    zzd onCreateView(zzd arg1, zzd arg2, Bundle arg3) throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void onSaveInstanceState(Bundle arg1) throws RemoteException;

    void onStart() throws RemoteException;

    void onStop() throws RemoteException;

    void setEnabled(boolean arg1) throws RemoteException;

    void updateMaskedWallet(MaskedWallet arg1) throws RemoteException;

    void updateMaskedWalletRequest(MaskedWalletRequest arg1) throws RemoteException;

    void zza(zzd arg1, WalletFragmentOptions arg2, Bundle arg3) throws RemoteException;
}

