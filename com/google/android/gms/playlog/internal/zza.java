package com.google.android.gms.playlog.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public interface zza extends IInterface {
    public static abstract class com.google.android.gms.playlog.internal.zza.zza extends Binder implements zza {
        static class com.google.android.gms.playlog.internal.zza.zza.zza implements zza {
            private IBinder zznF;

            com.google.android.gms.playlog.internal.zza.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.playlog.internal.zza
            public void zza(String s, PlayLoggerContext playLoggerContext0, LogEvent logEvent0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
                    parcel0.writeString(s);
                    if(playLoggerContext0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        playLoggerContext0.writeToParcel(parcel0, 0);
                    }
                    if(logEvent0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        logEvent0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.playlog.internal.zza
            public void zza(String s, PlayLoggerContext playLoggerContext0, List list0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
                    parcel0.writeString(s);
                    if(playLoggerContext0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        playLoggerContext0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeTypedList(list0);
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.playlog.internal.zza
            public void zza(String s, PlayLoggerContext playLoggerContext0, byte[] arr_b) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
                    parcel0.writeString(s);
                    if(playLoggerContext0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        playLoggerContext0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeByteArray(arr_b);
                    this.zznF.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            PlayLoggerContext playLoggerContext0 = null;
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
                    String s = data.readString();
                    PlayLoggerContext playLoggerContext1 = data.readInt() == 0 ? null : PlayLoggerContext.CREATOR.zzfH(data);
                    if(data.readInt() != 0) {
                        playLoggerContext0 = LogEvent.CREATOR.zzfG(data);
                    }
                    this.zza(s, playLoggerContext1, ((LogEvent)playLoggerContext0));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
                    String s1 = data.readString();
                    if(data.readInt() != 0) {
                        playLoggerContext0 = PlayLoggerContext.CREATOR.zzfH(data);
                    }
                    this.zza(s1, playLoggerContext0, data.createTypedArrayList(LogEvent.CREATOR));
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
                    String s2 = data.readString();
                    if(data.readInt() != 0) {
                        playLoggerContext0 = PlayLoggerContext.CREATOR.zzfH(data);
                    }
                    this.zza(s2, playLoggerContext0, data.createByteArray());
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.playlog.internal.IPlayLogService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zza zzdp(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.playlog.internal.IPlayLogService");
            return iInterface0 != null && iInterface0 instanceof zza ? ((zza)iInterface0) : new com.google.android.gms.playlog.internal.zza.zza.zza(iBinder0);
        }
    }

    void zza(String arg1, PlayLoggerContext arg2, LogEvent arg3) throws RemoteException;

    void zza(String arg1, PlayLoggerContext arg2, List arg3) throws RemoteException;

    void zza(String arg1, PlayLoggerContext arg2, byte[] arg3) throws RemoteException;
}

