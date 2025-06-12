package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.realtime.internal.zzm;

public interface zzal extends IInterface {
    public static abstract class zza extends Binder implements zzal {
        static class com.google.android.gms.drive.internal.zzal.zza.zza implements zzal {
            private IBinder zznF;

            com.google.android.gms.drive.internal.zzal.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void onSuccess() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zzW(boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(15, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(ChangeSequenceNumber changeSequenceNumber0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(changeSequenceNumber0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        changeSequenceNumber0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(17, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(GetPermissionsResponse getPermissionsResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(getPermissionsResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getPermissionsResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(20, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(OnChangesResponse onChangesResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(onChangesResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        onChangesResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(18, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(OnContentsResponse onContentsResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(onContentsResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        onContentsResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(onDeviceUsagePreferenceResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        onDeviceUsagePreferenceResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(OnDownloadProgressResponse onDownloadProgressResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(onDownloadProgressResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        onDownloadProgressResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(OnDriveIdResponse onDriveIdResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(onDriveIdResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        onDriveIdResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(OnDrivePreferencesResponse onDrivePreferencesResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(onDrivePreferencesResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        onDrivePreferencesResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(13, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(OnFetchThumbnailResponse onFetchThumbnailResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(onFetchThumbnailResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        onFetchThumbnailResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(16, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(OnListEntriesResponse onListEntriesResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(onListEntriesResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        onListEntriesResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(OnListParentsResponse onListParentsResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(onListParentsResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        onListParentsResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(OnLoadRealtimeResponse onLoadRealtimeResponse0, zzm zzm0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(onLoadRealtimeResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        onLoadRealtimeResponse0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzm0 == null ? null : zzm0.asBinder()));
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(OnMetadataResponse onMetadataResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(onMetadataResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        onMetadataResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(OnResourceIdSetResponse onResourceIdSetResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(onResourceIdSetResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        onResourceIdSetResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zza(OnSyncMoreResponse onSyncMoreResponse0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(onSyncMoreResponse0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        onSyncMoreResponse0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzal
            public void zzt(Status status0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(status0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        status0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public zza() {
            this.attachInterface(this, "com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            OnDownloadProgressResponse onDownloadProgressResponse0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (OnDownloadProgressResponse)OnDownloadProgressResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(onDownloadProgressResponse0);
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (OnListEntriesResponse)OnListEntriesResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((OnListEntriesResponse)onDownloadProgressResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (OnDriveIdResponse)OnDriveIdResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((OnDriveIdResponse)onDownloadProgressResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (OnMetadataResponse)OnMetadataResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((OnMetadataResponse)onDownloadProgressResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (OnContentsResponse)OnContentsResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((OnContentsResponse)onDownloadProgressResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (Status)Status.CREATOR.createFromParcel(data);
                    }
                    this.zzt(((Status)onDownloadProgressResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    this.onSuccess();
                    reply.writeNoException();
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (OnListParentsResponse)OnListParentsResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((OnListParentsResponse)onDownloadProgressResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (OnSyncMoreResponse)OnSyncMoreResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((OnSyncMoreResponse)onDownloadProgressResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (OnLoadRealtimeResponse)OnLoadRealtimeResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((OnLoadRealtimeResponse)onDownloadProgressResponse0), com.google.android.gms.drive.realtime.internal.zzm.zza.zzbc(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (OnResourceIdSetResponse)OnResourceIdSetResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((OnResourceIdSetResponse)onDownloadProgressResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (OnDrivePreferencesResponse)OnDrivePreferencesResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((OnDrivePreferencesResponse)onDownloadProgressResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (OnDeviceUsagePreferenceResponse)OnDeviceUsagePreferenceResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((OnDeviceUsagePreferenceResponse)onDownloadProgressResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 15: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    this.zzW(data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 16: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (OnFetchThumbnailResponse)OnFetchThumbnailResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((OnFetchThumbnailResponse)onDownloadProgressResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 17: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (ChangeSequenceNumber)ChangeSequenceNumber.CREATOR.createFromParcel(data);
                    }
                    this.zza(((ChangeSequenceNumber)onDownloadProgressResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (OnChangesResponse)OnChangesResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((OnChangesResponse)onDownloadProgressResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 20: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    if(data.readInt() != 0) {
                        onDownloadProgressResponse0 = (GetPermissionsResponse)GetPermissionsResponse.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetPermissionsResponse)onDownloadProgressResponse0));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzal zzaP(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            return iInterface0 != null && iInterface0 instanceof zzal ? ((zzal)iInterface0) : new com.google.android.gms.drive.internal.zzal.zza.zza(iBinder0);
        }
    }

    void onSuccess() throws RemoteException;

    void zzW(boolean arg1) throws RemoteException;

    void zza(ChangeSequenceNumber arg1) throws RemoteException;

    void zza(GetPermissionsResponse arg1) throws RemoteException;

    void zza(OnChangesResponse arg1) throws RemoteException;

    void zza(OnContentsResponse arg1) throws RemoteException;

    void zza(OnDeviceUsagePreferenceResponse arg1) throws RemoteException;

    void zza(OnDownloadProgressResponse arg1) throws RemoteException;

    void zza(OnDriveIdResponse arg1) throws RemoteException;

    void zza(OnDrivePreferencesResponse arg1) throws RemoteException;

    void zza(OnFetchThumbnailResponse arg1) throws RemoteException;

    void zza(OnListEntriesResponse arg1) throws RemoteException;

    void zza(OnListParentsResponse arg1) throws RemoteException;

    void zza(OnLoadRealtimeResponse arg1, zzm arg2) throws RemoteException;

    void zza(OnMetadataResponse arg1) throws RemoteException;

    void zza(OnResourceIdSetResponse arg1) throws RemoteException;

    void zza(OnSyncMoreResponse arg1) throws RemoteException;

    void zzt(Status arg1) throws RemoteException;
}

