package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzc;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public interface zzqt extends IInterface {
    public static abstract class zza extends Binder implements zzqt {
        static class com.google.android.gms.internal.zzqt.zza.zza implements zzqt {
            private IBinder zznF;

            com.google.android.gms.internal.zzqt.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.internal.zzqt
            public zzqq zza(zzd zzd0, zzc zzc0, WalletFragmentOptions walletFragmentOptions0, zzqr zzqr0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    parcel0.writeStrongBinder((zzc0 == null ? null : zzc0.asBinder()));
                    if(walletFragmentOptions0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        walletFragmentOptions0.writeToParcel(parcel0, 0);
                    }
                    if(zzqr0 != null) {
                        iBinder0 = zzqr0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.internal.zzqq.zza.zzdF(parcel1.readStrongBinder());
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
                    data.enforceInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                    zzqq zzqq0 = this.zza(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()), com.google.android.gms.dynamic.zzc.zza.zzbf(data.readStrongBinder()), (data.readInt() == 0 ? null : ((WalletFragmentOptions)WalletFragmentOptions.CREATOR.createFromParcel(data))), com.google.android.gms.internal.zzqr.zza.zzdG(data.readStrongBinder()));
                    reply.writeNoException();
                    if(zzqq0 != null) {
                        iBinder0 = zzqq0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzqt zzdI(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            return iInterface0 != null && iInterface0 instanceof zzqt ? ((zzqt)iInterface0) : new com.google.android.gms.internal.zzqt.zza.zza(iBinder0);
        }
    }

    zzqq zza(zzd arg1, zzc arg2, WalletFragmentOptions arg3, zzqr arg4) throws RemoteException;
}

