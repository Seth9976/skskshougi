package com.google.android.gms.iid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzb extends IInterface {
    public static abstract class zza extends Binder implements zzb {
        static class com.google.android.gms.iid.zzb.zza.zza implements zzb {
            private IBinder zznF;

            com.google.android.gms.iid.zzb.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.iid.zzb
            public void send(Message msg) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
                    if(msg == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        msg.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.iid.IMessengerCompat");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.iid.IMessengerCompat");
                    this.send((data.readInt() == 0 ? null : ((Message)Message.CREATOR.createFromParcel(data))));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.iid.IMessengerCompat");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzb zzbR(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            return iInterface0 != null && iInterface0 instanceof zzb ? ((zzb)iInterface0) : new com.google.android.gms.iid.zzb.zza.zza(iBinder0);
        }
    }

    void send(Message arg1) throws RemoteException;
}

