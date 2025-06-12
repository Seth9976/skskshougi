package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import java.util.List;

public interface zzas extends IInterface {
    public static abstract class zza extends Binder implements zzas {
        static class com.google.android.gms.wearable.internal.zzas.zza.zza implements zzas {
            private IBinder zznF;

            com.google.android.gms.wearable.internal.zzas.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.wearable.internal.zzas
            public void onConnectedNodes(List list0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    parcel0.writeTypedList(list0);
                    this.zznF.transact(5, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzas
            public void zza(AncsNotificationParcelable ancsNotificationParcelable0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if(ancsNotificationParcelable0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        ancsNotificationParcelable0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(6, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzas
            public void zza(CapabilityInfoParcelable capabilityInfoParcelable0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if(capabilityInfoParcelable0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        capabilityInfoParcelable0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(8, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzas
            public void zza(ChannelEventParcelable channelEventParcelable0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if(channelEventParcelable0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        channelEventParcelable0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(7, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzas
            public void zza(MessageEventParcelable messageEventParcelable0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if(messageEventParcelable0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        messageEventParcelable0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzas
            public void zza(NodeParcelable nodeParcelable0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if(nodeParcelable0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        nodeParcelable0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzas
            public void zzac(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzas
            public void zzb(NodeParcelable nodeParcelable0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
                    if(nodeParcelable0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        nodeParcelable0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            DataHolder dataHolder0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzac(dataHolder0);
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if(data.readInt() != 0) {
                        dataHolder0 = (MessageEventParcelable)MessageEventParcelable.CREATOR.createFromParcel(data);
                    }
                    this.zza(((MessageEventParcelable)dataHolder0));
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if(data.readInt() != 0) {
                        dataHolder0 = (NodeParcelable)NodeParcelable.CREATOR.createFromParcel(data);
                    }
                    this.zza(((NodeParcelable)dataHolder0));
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if(data.readInt() != 0) {
                        dataHolder0 = (NodeParcelable)NodeParcelable.CREATOR.createFromParcel(data);
                    }
                    this.zzb(((NodeParcelable)dataHolder0));
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    this.onConnectedNodes(data.createTypedArrayList(NodeParcelable.CREATOR));
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if(data.readInt() != 0) {
                        dataHolder0 = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.createFromParcel(data);
                    }
                    this.zza(((AncsNotificationParcelable)dataHolder0));
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if(data.readInt() != 0) {
                        dataHolder0 = (ChannelEventParcelable)ChannelEventParcelable.CREATOR.createFromParcel(data);
                    }
                    this.zza(((ChannelEventParcelable)dataHolder0));
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                    if(data.readInt() != 0) {
                        dataHolder0 = (CapabilityInfoParcelable)CapabilityInfoParcelable.CREATOR.createFromParcel(data);
                    }
                    this.zza(((CapabilityInfoParcelable)dataHolder0));
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.wearable.internal.IWearableListener");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzas zzdP(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            return iInterface0 != null && iInterface0 instanceof zzas ? ((zzas)iInterface0) : new com.google.android.gms.wearable.internal.zzas.zza.zza(iBinder0);
        }
    }

    void onConnectedNodes(List arg1) throws RemoteException;

    void zza(AncsNotificationParcelable arg1) throws RemoteException;

    void zza(CapabilityInfoParcelable arg1) throws RemoteException;

    void zza(ChannelEventParcelable arg1) throws RemoteException;

    void zza(MessageEventParcelable arg1) throws RemoteException;

    void zza(NodeParcelable arg1) throws RemoteException;

    void zzac(DataHolder arg1) throws RemoteException;

    void zzb(NodeParcelable arg1) throws RemoteException;
}

