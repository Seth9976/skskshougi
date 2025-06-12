package com.google.android.gms.plus.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import java.util.List;

public interface zzd extends IInterface {
    public static abstract class zza extends Binder implements zzd {
        static class com.google.android.gms.plus.internal.zzd.zza.zza implements zzd {
            private IBinder zznF;

            com.google.android.gms.plus.internal.zzd.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public String getAccountName() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public String getAuthCode() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    this.zznF.transact(41, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public ICancelToken zza(zzb zzb0, int v, int v1, int v2, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeStrongBinder((zzb0 == null ? null : zzb0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeInt(v2);
                    parcel0.writeString(s);
                    this.zznF.transact(16, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.common.internal.ICancelToken.zza.zzaE(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zza(SafeParcelResponse safeParcelResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    if(safeParcelResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        safeParcelResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zza(zzb zzb0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeStrongBinder((zzb0 == null ? null : zzb0.asBinder()));
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zza(zzb zzb0, int v, String s, Uri uri0, String s1, String s2) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeStrongBinder((zzb0 == null ? null : zzb0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeString(s);
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s1);
                    parcel0.writeString(s2);
                    this.zznF.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zza(zzb zzb0, Uri uri0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeStrongBinder((zzb0 == null ? null : zzb0.asBinder()));
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zza(zzb zzb0, SafeParcelResponse safeParcelResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeStrongBinder((zzb0 == null ? null : zzb0.asBinder()));
                    if(safeParcelResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        safeParcelResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(45, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zza(zzb zzb0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeStrongBinder((zzb0 == null ? null : zzb0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zza(zzb zzb0, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeStrongBinder((zzb0 == null ? null : zzb0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zza(zzb zzb0, List list0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeStrongBinder((zzb0 == null ? null : zzb0.asBinder()));
                    parcel0.writeStringList(list0);
                    this.zznF.transact(34, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zza(String s, FavaDiagnosticsEntity favaDiagnosticsEntity0, FavaDiagnosticsEntity favaDiagnosticsEntity1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeString(s);
                    if(favaDiagnosticsEntity0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        favaDiagnosticsEntity0.writeToParcel(parcel0, 0);
                    }
                    if(favaDiagnosticsEntity1 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        favaDiagnosticsEntity1.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(46, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zzb(zzb zzb0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeStrongBinder((zzb0 == null ? null : zzb0.asBinder()));
                    this.zznF.transact(19, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zzb(zzb zzb0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeStrongBinder((zzb0 == null ? null : zzb0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zzc(zzb zzb0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeStrongBinder((zzb0 == null ? null : zzb0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(18, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zzd(zzb zzb0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeStrongBinder((zzb0 == null ? null : zzb0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(40, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zzdX(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeString(s);
                    this.zznF.transact(17, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zze(zzb zzb0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    parcel0.writeStrongBinder((zzb0 == null ? null : zzb0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(44, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public void zzxr() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.plus.internal.zzd
            public boolean zzxs() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    this.zznF.transact(42, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.plus.internal.zzd
            public String zzxt() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.plus.internal.IPlusService");
                    this.zznF.transact(43, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
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
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    this.zza(com.google.android.gms.plus.internal.zzb.zza.zzdr(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    this.zza(com.google.android.gms.plus.internal.zzb.zza.zzdr(data.readStrongBinder()), data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    this.zzb(com.google.android.gms.plus.internal.zzb.zza.zzdr(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    this.zza((data.readInt() == 0 ? null : SafeParcelResponse.CREATOR.zzal(data)));
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    String s = this.getAccountName();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    this.zzxr();
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    this.zza(com.google.android.gms.plus.internal.zzb.zza.zzdr(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    this.zza(com.google.android.gms.plus.internal.zzb.zza.zzdr(data.readStrongBinder()), (data.readInt() == 0 ? null : ((Uri)Uri.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    this.zza(com.google.android.gms.plus.internal.zzb.zza.zzdr(data.readStrongBinder()), data.readInt(), data.readString(), (data.readInt() == 0 ? null : ((Uri)Uri.CREATOR.createFromParcel(data))), data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 16: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    ICancelToken iCancelToken0 = this.zza(com.google.android.gms.plus.internal.zzb.zza.zzdr(data.readStrongBinder()), data.readInt(), data.readInt(), data.readInt(), data.readString());
                    reply.writeNoException();
                    if(iCancelToken0 != null) {
                        iBinder0 = iCancelToken0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 17: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    this.zzdX(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    this.zzc(com.google.android.gms.plus.internal.zzb.zza.zzdr(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 19: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    this.zzb(com.google.android.gms.plus.internal.zzb.zza.zzdr(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 34: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    this.zza(com.google.android.gms.plus.internal.zzb.zza.zzdr(data.readStrongBinder()), data.createStringArrayList());
                    reply.writeNoException();
                    return true;
                }
                case 40: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    this.zzd(com.google.android.gms.plus.internal.zzb.zza.zzdr(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 41: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    String s1 = this.getAuthCode();
                    reply.writeNoException();
                    reply.writeString(s1);
                    return true;
                }
                case 42: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    boolean z = this.zzxs();
                    reply.writeNoException();
                    reply.writeInt((z ? 1 : 0));
                    return true;
                }
                case 43: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    String s2 = this.zzxt();
                    reply.writeNoException();
                    reply.writeString(s2);
                    return true;
                }
                case 44: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    this.zze(com.google.android.gms.plus.internal.zzb.zza.zzdr(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 45: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    zzb zzb0 = com.google.android.gms.plus.internal.zzb.zza.zzdr(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        iBinder0 = SafeParcelResponse.CREATOR.zzal(data);
                    }
                    this.zza(zzb0, ((SafeParcelResponse)iBinder0));
                    reply.writeNoException();
                    return true;
                }
                case 46: {
                    data.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
                    String s3 = data.readString();
                    FavaDiagnosticsEntity favaDiagnosticsEntity0 = data.readInt() == 0 ? null : FavaDiagnosticsEntity.CREATOR.zzad(data);
                    if(data.readInt() != 0) {
                        iBinder0 = FavaDiagnosticsEntity.CREATOR.zzad(data);
                    }
                    this.zza(s3, favaDiagnosticsEntity0, ((FavaDiagnosticsEntity)iBinder0));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.plus.internal.IPlusService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzd zzdt(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
            return iInterface0 != null && iInterface0 instanceof zzd ? ((zzd)iInterface0) : new com.google.android.gms.plus.internal.zzd.zza.zza(iBinder0);
        }
    }

    String getAccountName() throws RemoteException;

    String getAuthCode() throws RemoteException;

    ICancelToken zza(zzb arg1, int arg2, int arg3, int arg4, String arg5) throws RemoteException;

    void zza(SafeParcelResponse arg1) throws RemoteException;

    void zza(zzb arg1) throws RemoteException;

    void zza(zzb arg1, int arg2, String arg3, Uri arg4, String arg5, String arg6) throws RemoteException;

    void zza(zzb arg1, Uri arg2, Bundle arg3) throws RemoteException;

    void zza(zzb arg1, SafeParcelResponse arg2) throws RemoteException;

    void zza(zzb arg1, String arg2) throws RemoteException;

    void zza(zzb arg1, String arg2, String arg3) throws RemoteException;

    void zza(zzb arg1, List arg2) throws RemoteException;

    void zza(String arg1, FavaDiagnosticsEntity arg2, FavaDiagnosticsEntity arg3) throws RemoteException;

    void zzb(zzb arg1) throws RemoteException;

    void zzb(zzb arg1, String arg2) throws RemoteException;

    void zzc(zzb arg1, String arg2) throws RemoteException;

    void zzd(zzb arg1, String arg2) throws RemoteException;

    void zzdX(String arg1) throws RemoteException;

    void zze(zzb arg1, String arg2) throws RemoteException;

    void zzxr() throws RemoteException;

    boolean zzxs() throws RemoteException;

    String zzxt() throws RemoteException;
}

