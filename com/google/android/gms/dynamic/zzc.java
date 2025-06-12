package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface zzc extends IInterface {
    public static abstract class zza extends Binder implements zzc {
        static class com.google.android.gms.dynamic.zzc.zza.zza implements zzc {
            private IBinder zznF;

            com.google.android.gms.dynamic.zzc.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public Bundle getArguments() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public int getId() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public boolean getRetainInstance() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(7, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.dynamic.zzc
            public String getTag() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public int getTargetRequestCode() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public boolean getUserVisibleHint() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
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

            @Override  // com.google.android.gms.dynamic.zzc
            public zzd getView() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public boolean isAdded() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(13, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.dynamic.zzc
            public boolean isDetached() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(14, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.dynamic.zzc
            public boolean isHidden() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(15, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.dynamic.zzc
            public boolean isInLayout() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(16, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.dynamic.zzc
            public boolean isRemoving() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(17, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.dynamic.zzc
            public boolean isResumed() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(18, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.dynamic.zzc
            public boolean isVisible() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(19, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.dynamic.zzc
            public void setHasOptionsMenu(boolean hasMenu) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    if(hasMenu) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(21, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public void setMenuVisibility(boolean menuVisible) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    if(menuVisible) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(22, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public void setRetainInstance(boolean retain) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    if(retain) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(23, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public void setUserVisibleHint(boolean isVisibleToUser) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    if(isVisibleToUser) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(24, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public void startActivity(Intent intent) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    if(intent == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        intent.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(25, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public void startActivityForResult(Intent intent, int requestCode) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    if(intent == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        intent.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeInt(requestCode);
                    this.zznF.transact(26, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public void zzl(zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    this.zznF.transact(20, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public void zzm(zzd zzd0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    parcel0.writeStrongBinder((zzd0 == null ? null : zzd0.asBinder()));
                    this.zznF.transact(27, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public zzd zzqk() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public zzc zzql() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                    return zza.zzbf(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public zzd zzqm() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                    return com.google.android.gms.dynamic.zzd.zza.zzbg(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.dynamic.zzc
            public zzc zzqn() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                    return zza.zzbf(parcel1.readStrongBinder());
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            IBinder iBinder0 = null;
            int v2 = 0;
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    zzd zzd0 = this.zzqk();
                    reply.writeNoException();
                    if(zzd0 != null) {
                        iBinder0 = zzd0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    Bundle bundle0 = this.getArguments();
                    reply.writeNoException();
                    if(bundle0 != null) {
                        reply.writeInt(1);
                        bundle0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    int v3 = this.getId();
                    reply.writeNoException();
                    reply.writeInt(v3);
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    zzc zzc0 = this.zzql();
                    reply.writeNoException();
                    if(zzc0 != null) {
                        iBinder0 = zzc0.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    zzd zzd1 = this.zzqm();
                    reply.writeNoException();
                    if(zzd1 != null) {
                        iBinder0 = zzd1.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z = this.getRetainInstance();
                    reply.writeNoException();
                    reply.writeInt((z ? 1 : 0));
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    String s = this.getTag();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    zzc zzc1 = this.zzqn();
                    reply.writeNoException();
                    if(zzc1 != null) {
                        iBinder0 = zzc1.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    int v4 = this.getTargetRequestCode();
                    reply.writeNoException();
                    reply.writeInt(v4);
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z1 = this.getUserVisibleHint();
                    reply.writeNoException();
                    if(z1) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    zzd zzd2 = this.getView();
                    reply.writeNoException();
                    if(zzd2 != null) {
                        iBinder0 = zzd2.asBinder();
                    }
                    reply.writeStrongBinder(iBinder0);
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z2 = this.isAdded();
                    reply.writeNoException();
                    if(z2) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z3 = this.isDetached();
                    reply.writeNoException();
                    if(z3) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 15: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z4 = this.isHidden();
                    reply.writeNoException();
                    if(z4) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 16: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z5 = this.isInLayout();
                    reply.writeNoException();
                    if(z5) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 17: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z6 = this.isRemoving();
                    reply.writeNoException();
                    if(z6) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z7 = this.isResumed();
                    reply.writeNoException();
                    if(z7) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 19: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    boolean z8 = this.isVisible();
                    reply.writeNoException();
                    if(z8) {
                        v2 = 1;
                    }
                    reply.writeInt(v2);
                    return true;
                }
                case 20: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zzl(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 21: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    if(data.readInt() != 0) {
                        v2 = 1;
                    }
                    this.setHasOptionsMenu(((boolean)v2));
                    reply.writeNoException();
                    return true;
                }
                case 22: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    if(data.readInt() != 0) {
                        v2 = 1;
                    }
                    this.setMenuVisibility(((boolean)v2));
                    reply.writeNoException();
                    return true;
                }
                case 23: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    if(data.readInt() != 0) {
                        v2 = 1;
                    }
                    this.setRetainInstance(((boolean)v2));
                    reply.writeNoException();
                    return true;
                }
                case 24: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    if(data.readInt() != 0) {
                        v2 = 1;
                    }
                    this.setUserVisibleHint(((boolean)v2));
                    reply.writeNoException();
                    return true;
                }
                case 25: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    if(data.readInt() != 0) {
                        iBinder0 = (Intent)Intent.CREATOR.createFromParcel(data);
                    }
                    this.startActivity(((Intent)iBinder0));
                    reply.writeNoException();
                    return true;
                }
                case 26: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    if(data.readInt() != 0) {
                        iBinder0 = (Intent)Intent.CREATOR.createFromParcel(data);
                    }
                    this.startActivityForResult(((Intent)iBinder0), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 27: {
                    data.enforceInterface("com.google.android.gms.dynamic.IFragmentWrapper");
                    this.zzm(com.google.android.gms.dynamic.zzd.zza.zzbg(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.dynamic.IFragmentWrapper");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzc zzbf(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return iInterface0 != null && iInterface0 instanceof zzc ? ((zzc)iInterface0) : new com.google.android.gms.dynamic.zzc.zza.zza(iBinder0);
        }
    }

    Bundle getArguments() throws RemoteException;

    int getId() throws RemoteException;

    boolean getRetainInstance() throws RemoteException;

    String getTag() throws RemoteException;

    int getTargetRequestCode() throws RemoteException;

    boolean getUserVisibleHint() throws RemoteException;

    zzd getView() throws RemoteException;

    boolean isAdded() throws RemoteException;

    boolean isDetached() throws RemoteException;

    boolean isHidden() throws RemoteException;

    boolean isInLayout() throws RemoteException;

    boolean isRemoving() throws RemoteException;

    boolean isResumed() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void setHasOptionsMenu(boolean arg1) throws RemoteException;

    void setMenuVisibility(boolean arg1) throws RemoteException;

    void setRetainInstance(boolean arg1) throws RemoteException;

    void setUserVisibleHint(boolean arg1) throws RemoteException;

    void startActivity(Intent arg1) throws RemoteException;

    void startActivityForResult(Intent arg1, int arg2) throws RemoteException;

    void zzl(zzd arg1) throws RemoteException;

    void zzm(zzd arg1) throws RemoteException;

    zzd zzqk() throws RemoteException;

    zzc zzql() throws RemoteException;

    zzd zzqm() throws RemoteException;

    zzc zzqn() throws RemoteException;
}

