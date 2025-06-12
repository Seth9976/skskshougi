package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public interface zzar extends IInterface {
    public static abstract class zza extends Binder implements zzar {
        static class com.google.android.gms.wearable.internal.zzar.zza.zza implements zzar {
            private IBinder zznF;

            com.google.android.gms.wearable.internal.zzar.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(Status status0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(AddLocalCapabilityResponse addLocalCapabilityResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(addLocalCapabilityResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        addLocalCapabilityResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(26, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(ChannelReceiveFileResponse channelReceiveFileResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(channelReceiveFileResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        channelReceiveFileResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(19, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(ChannelSendFileResponse channelSendFileResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(channelSendFileResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        channelSendFileResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(20, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(CloseChannelResponse closeChannelResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(closeChannelResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        closeChannelResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(15, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(DeleteDataItemsResponse deleteDataItemsResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(deleteDataItemsResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        deleteDataItemsResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(GetAllCapabilitiesResponse getAllCapabilitiesResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(getAllCapabilitiesResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getAllCapabilitiesResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(23, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(GetCapabilityResponse getCapabilityResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(getCapabilityResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getCapabilityResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(22, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(GetChannelInputStreamResponse getChannelInputStreamResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(getChannelInputStreamResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getChannelInputStreamResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(17, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(GetChannelOutputStreamResponse getChannelOutputStreamResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(getChannelOutputStreamResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getChannelOutputStreamResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(18, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(GetCloudSyncOptInOutDoneResponse getCloudSyncOptInOutDoneResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(getCloudSyncOptInOutDoneResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getCloudSyncOptInOutDoneResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(28, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(GetCloudSyncSettingResponse getCloudSyncSettingResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(getCloudSyncSettingResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getCloudSyncSettingResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(29, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(GetConfigResponse getConfigResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(getConfigResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getConfigResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(GetConfigsResponse getConfigsResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(getConfigsResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getConfigsResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(13, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(GetConnectedNodesResponse getConnectedNodesResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(getConnectedNodesResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getConnectedNodesResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(GetDataItemResponse getDataItemResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(getDataItemResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getDataItemResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(GetFdForAssetResponse getFdForAssetResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(getFdForAssetResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getFdForAssetResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(GetLocalNodeResponse getLocalNodeResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(getLocalNodeResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getLocalNodeResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(OpenChannelResponse openChannelResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(openChannelResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        openChannelResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(PutDataResponse putDataResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(putDataResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        putDataResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(RemoveLocalCapabilityResponse removeLocalCapabilityResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(removeLocalCapabilityResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        removeLocalCapabilityResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(27, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(SendMessageResponse sendMessageResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(sendMessageResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        sendMessageResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zza(StorageInfoResponse storageInfoResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(storageInfoResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        storageInfoResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zzad(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.wearable.internal.zzar
            public void zzb(CloseChannelResponse closeChannelResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(closeChannelResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        closeChannelResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(16, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            GetConfigResponse getConfigResponse0 = null;
            switch(code) {
                case 2: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (GetConfigResponse)GetConfigResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(getConfigResponse0);
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (PutDataResponse)PutDataResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((PutDataResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (GetDataItemResponse)GetDataItemResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetDataItemResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzad(((DataHolder)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (DeleteDataItemsResponse)DeleteDataItemsResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((DeleteDataItemsResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (SendMessageResponse)SendMessageResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((SendMessageResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (GetFdForAssetResponse)GetFdForAssetResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetFdForAssetResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (GetLocalNodeResponse)GetLocalNodeResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetLocalNodeResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (GetConnectedNodesResponse)GetConnectedNodesResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetConnectedNodesResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (Status)Status.CREATOR.createFromParcel(data);
                    }
                    this.zza(((Status)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (StorageInfoResponse)StorageInfoResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((StorageInfoResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (GetConfigsResponse)GetConfigsResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetConfigsResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (OpenChannelResponse)OpenChannelResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((OpenChannelResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 15: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (CloseChannelResponse)CloseChannelResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((CloseChannelResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 16: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (CloseChannelResponse)CloseChannelResponse.CREATOR.createFromParcel(data);
                    }
                    this.zzb(((CloseChannelResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 17: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (GetChannelInputStreamResponse)GetChannelInputStreamResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetChannelInputStreamResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (GetChannelOutputStreamResponse)GetChannelOutputStreamResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetChannelOutputStreamResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 19: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (ChannelReceiveFileResponse)ChannelReceiveFileResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((ChannelReceiveFileResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 20: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (ChannelSendFileResponse)ChannelSendFileResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((ChannelSendFileResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 22: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (GetCapabilityResponse)GetCapabilityResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetCapabilityResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 23: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (GetAllCapabilitiesResponse)GetAllCapabilitiesResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetAllCapabilitiesResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 26: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (AddLocalCapabilityResponse)AddLocalCapabilityResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((AddLocalCapabilityResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 27: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (RemoveLocalCapabilityResponse)RemoveLocalCapabilityResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((RemoveLocalCapabilityResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 28: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (GetCloudSyncOptInOutDoneResponse)GetCloudSyncOptInOutDoneResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetCloudSyncOptInOutDoneResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 29: {
                    data.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    if(data.readInt() != 0) {
                        getConfigResponse0 = (GetCloudSyncSettingResponse)GetCloudSyncSettingResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetCloudSyncSettingResponse)getConfigResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzar zzdO(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzar ? ((zzar)iInterface0) : new com.google.android.gms.wearable.internal.zzar.zza.zza(iBinder0);
        }
    }

    void zza(Status arg1) throws RemoteException;

    void zza(AddLocalCapabilityResponse arg1) throws RemoteException;

    void zza(ChannelReceiveFileResponse arg1) throws RemoteException;

    void zza(ChannelSendFileResponse arg1) throws RemoteException;

    void zza(CloseChannelResponse arg1) throws RemoteException;

    void zza(DeleteDataItemsResponse arg1) throws RemoteException;

    void zza(GetAllCapabilitiesResponse arg1) throws RemoteException;

    void zza(GetCapabilityResponse arg1) throws RemoteException;

    void zza(GetChannelInputStreamResponse arg1) throws RemoteException;

    void zza(GetChannelOutputStreamResponse arg1) throws RemoteException;

    void zza(GetCloudSyncOptInOutDoneResponse arg1) throws RemoteException;

    void zza(GetCloudSyncSettingResponse arg1) throws RemoteException;

    void zza(GetConfigResponse arg1) throws RemoteException;

    void zza(GetConfigsResponse arg1) throws RemoteException;

    void zza(GetConnectedNodesResponse arg1) throws RemoteException;

    void zza(GetDataItemResponse arg1) throws RemoteException;

    void zza(GetFdForAssetResponse arg1) throws RemoteException;

    void zza(GetLocalNodeResponse arg1) throws RemoteException;

    void zza(OpenChannelResponse arg1) throws RemoteException;

    void zza(PutDataResponse arg1) throws RemoteException;

    void zza(RemoveLocalCapabilityResponse arg1) throws RemoteException;

    void zza(SendMessageResponse arg1) throws RemoteException;

    void zza(StorageInfoResponse arg1) throws RemoteException;

    void zzad(DataHolder arg1) throws RemoteException;

    void zzb(CloseChannelResponse arg1) throws RemoteException;
}

