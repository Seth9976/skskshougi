package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;

public interface zzak extends IInterface {
    public static abstract class zza extends Binder implements zzak {
        static class com.google.android.gms.drive.internal.zzak.zza.zza implements zzak {
            private IBinder zznF;

            com.google.android.gms.drive.internal.zzak.zza.zza(IBinder iBinder0) {
                this.zznF = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public IntentSender zza(CreateFileIntentSenderRequest createFileIntentSenderRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(createFileIntentSenderRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        createFileIntentSenderRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(11, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((IntentSender)IntentSender.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public IntentSender zza(OpenFileIntentSenderRequest openFileIntentSenderRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(openFileIntentSenderRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        openFileIntentSenderRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(10, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((IntentSender)IntentSender.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public DriveServiceResponse zza(OpenContentsRequest openContentsRequest0, zzal zzal0) throws RemoteException {
                DriveServiceResponse driveServiceResponse0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(openContentsRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        openContentsRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(7, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        driveServiceResponse0 = (DriveServiceResponse)DriveServiceResponse.CREATOR.createFromParcel(parcel1);
                    }
                    return driveServiceResponse0;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(RealtimeDocumentSyncRequest realtimeDocumentSyncRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(realtimeDocumentSyncRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        realtimeDocumentSyncRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(34, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(AddEventListenerRequest addEventListenerRequest0, zzam zzam0, String s, zzal zzal0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(addEventListenerRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        addEventListenerRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzam0 == null ? null : zzam0.asBinder()));
                    parcel0.writeString(s);
                    if(zzal0 != null) {
                        iBinder0 = zzal0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(14, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(AddPermissionRequest addPermissionRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(addPermissionRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        addPermissionRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(0x30, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(AuthorizeAccessRequest authorizeAccessRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(authorizeAccessRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        authorizeAccessRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(12, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(CancelPendingActionsRequest cancelPendingActionsRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(cancelPendingActionsRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        cancelPendingActionsRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(37, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(CheckResourceIdsExistRequest checkResourceIdsExistRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(checkResourceIdsExistRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        checkResourceIdsExistRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(30, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(closeContentsAndUpdateMetadataRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        closeContentsAndUpdateMetadataRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(18, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(CloseContentsRequest closeContentsRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(closeContentsRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        closeContentsRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(CreateContentsRequest createContentsRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(createContentsRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        createContentsRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(4, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(CreateFileRequest createFileRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(createFileRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        createFileRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(CreateFolderRequest createFolderRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(createFolderRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        createFolderRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(DeleteResourceRequest deleteResourceRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(deleteResourceRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        deleteResourceRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(24, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(DisconnectRequest disconnectRequest0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(disconnectRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        disconnectRequest0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(16, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(FetchThumbnailRequest fetchThumbnailRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(fetchThumbnailRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        fetchThumbnailRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(42, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(GetChangesRequest getChangesRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(getChangesRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getChangesRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(44, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(GetDriveIdFromUniqueIdentifierRequest getDriveIdFromUniqueIdentifierRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(getDriveIdFromUniqueIdentifierRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getDriveIdFromUniqueIdentifierRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(29, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(GetMetadataRequest getMetadataRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(getMetadataRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getMetadataRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(GetPermissionsRequest getPermissionsRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(getPermissionsRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        getPermissionsRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(0x2F, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(ListParentsRequest listParentsRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(listParentsRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        listParentsRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(13, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(LoadRealtimeRequest loadRealtimeRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(loadRealtimeRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        loadRealtimeRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(27, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(QueryRequest queryRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(queryRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        queryRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(QueryRequest queryRequest0, zzam zzam0, zzal zzal0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(queryRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        queryRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzam0 == null ? null : zzam0.asBinder()));
                    if(zzal0 != null) {
                        iBinder0 = zzal0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(51, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(RemoveEventListenerRequest removeEventListenerRequest0, zzam zzam0, String s, zzal zzal0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(removeEventListenerRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        removeEventListenerRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzam0 == null ? null : zzam0.asBinder()));
                    parcel0.writeString(s);
                    if(zzal0 != null) {
                        iBinder0 = zzal0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(15, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(RemovePermissionRequest removePermissionRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(removePermissionRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        removePermissionRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(50, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(SetDrivePreferencesRequest setDrivePreferencesRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(setDrivePreferencesRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        setDrivePreferencesRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(33, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(SetFileUploadPreferencesRequest setFileUploadPreferencesRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(setFileUploadPreferencesRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        setFileUploadPreferencesRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(36, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(SetResourceParentsRequest setResourceParentsRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(setResourceParentsRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        setResourceParentsRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(28, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(TrashResourceRequest trashResourceRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(trashResourceRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        trashResourceRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(17, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(UnsubscribeResourceRequest unsubscribeResourceRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(unsubscribeResourceRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        unsubscribeResourceRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(46, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(UntrashResourceRequest untrashResourceRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(untrashResourceRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        untrashResourceRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(38, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(UpdateMetadataRequest updateMetadataRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(updateMetadataRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        updateMetadataRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(UpdatePermissionRequest updatePermissionRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(updatePermissionRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        updatePermissionRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(49, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(9, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zza(zzam zzam0, zzal zzal0) throws RemoteException {
                IBinder iBinder0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    parcel0.writeStrongBinder((zzam0 == null ? null : zzam0.asBinder()));
                    if(zzal0 != null) {
                        iBinder0 = zzal0.asBinder();
                    }
                    parcel0.writeStrongBinder(iBinder0);
                    this.zznF.transact(52, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zzb(QueryRequest queryRequest0, zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    if(queryRequest0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        queryRequest0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(19, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zzb(zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(0x1F, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zzc(zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(0x20, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zzd(zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(35, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zze(zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(41, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.drive.internal.zzak
            public void zzf(zzal zzal0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
                    parcel0.writeStrongBinder((zzal0 == null ? null : zzal0.asBinder()));
                    this.zznF.transact(43, parcel0, parcel1, 0);
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
            GetMetadataRequest getMetadataRequest0 = null;
            switch(code) {
                case 1: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (GetMetadataRequest)GetMetadataRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(getMetadataRequest0, com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 2: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (QueryRequest)QueryRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((QueryRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 3: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (UpdateMetadataRequest)UpdateMetadataRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((UpdateMetadataRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 4: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (CreateContentsRequest)CreateContentsRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((CreateContentsRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (CreateFileRequest)CreateFileRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((CreateFileRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 6: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (CreateFolderRequest)CreateFolderRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((CreateFolderRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 7: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (OpenContentsRequest)OpenContentsRequest.CREATOR.createFromParcel(data);
                    }
                    DriveServiceResponse driveServiceResponse0 = this.zza(((OpenContentsRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    if(driveServiceResponse0 != null) {
                        reply.writeInt(1);
                        driveServiceResponse0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 8: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (CloseContentsRequest)CloseContentsRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((CloseContentsRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 9: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    this.zza(com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 10: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (OpenFileIntentSenderRequest)OpenFileIntentSenderRequest.CREATOR.createFromParcel(data);
                    }
                    IntentSender intentSender0 = this.zza(((OpenFileIntentSenderRequest)getMetadataRequest0));
                    reply.writeNoException();
                    if(intentSender0 != null) {
                        reply.writeInt(1);
                        intentSender0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 11: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (CreateFileIntentSenderRequest)CreateFileIntentSenderRequest.CREATOR.createFromParcel(data);
                    }
                    IntentSender intentSender1 = this.zza(((CreateFileIntentSenderRequest)getMetadataRequest0));
                    reply.writeNoException();
                    if(intentSender1 != null) {
                        reply.writeInt(1);
                        intentSender1.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 12: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (AuthorizeAccessRequest)AuthorizeAccessRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((AuthorizeAccessRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 13: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (ListParentsRequest)ListParentsRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((ListParentsRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 14: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (AddEventListenerRequest)AddEventListenerRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((AddEventListenerRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzam.zza.zzaQ(data.readStrongBinder()), data.readString(), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 15: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (RemoveEventListenerRequest)RemoveEventListenerRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((RemoveEventListenerRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzam.zza.zzaQ(data.readStrongBinder()), data.readString(), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 16: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (DisconnectRequest)DisconnectRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((DisconnectRequest)getMetadataRequest0));
                    reply.writeNoException();
                    return true;
                }
                case 17: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (TrashResourceRequest)TrashResourceRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((TrashResourceRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 18: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (CloseContentsAndUpdateMetadataRequest)CloseContentsAndUpdateMetadataRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((CloseContentsAndUpdateMetadataRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 19: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (QueryRequest)QueryRequest.CREATOR.createFromParcel(data);
                    }
                    this.zzb(((QueryRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 24: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (DeleteResourceRequest)DeleteResourceRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((DeleteResourceRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 27: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (LoadRealtimeRequest)LoadRealtimeRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((LoadRealtimeRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 28: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (SetResourceParentsRequest)SetResourceParentsRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((SetResourceParentsRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 29: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (GetDriveIdFromUniqueIdentifierRequest)GetDriveIdFromUniqueIdentifierRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetDriveIdFromUniqueIdentifierRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 30: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (CheckResourceIdsExistRequest)CheckResourceIdsExistRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((CheckResourceIdsExistRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x1F: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    this.zzb(com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x20: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    this.zzc(com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 33: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (SetDrivePreferencesRequest)SetDrivePreferencesRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((SetDrivePreferencesRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 34: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (RealtimeDocumentSyncRequest)RealtimeDocumentSyncRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((RealtimeDocumentSyncRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 35: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    this.zzd(com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 36: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (SetFileUploadPreferencesRequest)SetFileUploadPreferencesRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((SetFileUploadPreferencesRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 37: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (CancelPendingActionsRequest)CancelPendingActionsRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((CancelPendingActionsRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 38: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (UntrashResourceRequest)UntrashResourceRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((UntrashResourceRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 41: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    this.zze(com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 42: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (FetchThumbnailRequest)FetchThumbnailRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((FetchThumbnailRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 43: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    this.zzf(com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 44: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (GetChangesRequest)GetChangesRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetChangesRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 46: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (UnsubscribeResourceRequest)UnsubscribeResourceRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((UnsubscribeResourceRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x2F: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (GetPermissionsRequest)GetPermissionsRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((GetPermissionsRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x30: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (AddPermissionRequest)AddPermissionRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((AddPermissionRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 49: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (UpdatePermissionRequest)UpdatePermissionRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((UpdatePermissionRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 50: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (RemovePermissionRequest)RemovePermissionRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((RemovePermissionRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 51: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    if(data.readInt() != 0) {
                        getMetadataRequest0 = (QueryRequest)QueryRequest.CREATOR.createFromParcel(data);
                    }
                    this.zza(((QueryRequest)getMetadataRequest0), com.google.android.gms.drive.internal.zzam.zza.zzaQ(data.readStrongBinder()), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 52: {
                    data.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                    this.zza(com.google.android.gms.drive.internal.zzam.zza.zzaQ(data.readStrongBinder()), com.google.android.gms.drive.internal.zzal.zza.zzaP(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.drive.internal.IDriveService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static zzak zzaO(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
            return iInterface0 != null && iInterface0 instanceof zzak ? ((zzak)iInterface0) : new com.google.android.gms.drive.internal.zzak.zza.zza(iBinder0);
        }
    }

    IntentSender zza(CreateFileIntentSenderRequest arg1) throws RemoteException;

    IntentSender zza(OpenFileIntentSenderRequest arg1) throws RemoteException;

    DriveServiceResponse zza(OpenContentsRequest arg1, zzal arg2) throws RemoteException;

    void zza(RealtimeDocumentSyncRequest arg1, zzal arg2) throws RemoteException;

    void zza(AddEventListenerRequest arg1, zzam arg2, String arg3, zzal arg4) throws RemoteException;

    void zza(AddPermissionRequest arg1, zzal arg2) throws RemoteException;

    void zza(AuthorizeAccessRequest arg1, zzal arg2) throws RemoteException;

    void zza(CancelPendingActionsRequest arg1, zzal arg2) throws RemoteException;

    void zza(CheckResourceIdsExistRequest arg1, zzal arg2) throws RemoteException;

    void zza(CloseContentsAndUpdateMetadataRequest arg1, zzal arg2) throws RemoteException;

    void zza(CloseContentsRequest arg1, zzal arg2) throws RemoteException;

    void zza(CreateContentsRequest arg1, zzal arg2) throws RemoteException;

    void zza(CreateFileRequest arg1, zzal arg2) throws RemoteException;

    void zza(CreateFolderRequest arg1, zzal arg2) throws RemoteException;

    void zza(DeleteResourceRequest arg1, zzal arg2) throws RemoteException;

    void zza(DisconnectRequest arg1) throws RemoteException;

    void zza(FetchThumbnailRequest arg1, zzal arg2) throws RemoteException;

    void zza(GetChangesRequest arg1, zzal arg2) throws RemoteException;

    void zza(GetDriveIdFromUniqueIdentifierRequest arg1, zzal arg2) throws RemoteException;

    void zza(GetMetadataRequest arg1, zzal arg2) throws RemoteException;

    void zza(GetPermissionsRequest arg1, zzal arg2) throws RemoteException;

    void zza(ListParentsRequest arg1, zzal arg2) throws RemoteException;

    void zza(LoadRealtimeRequest arg1, zzal arg2) throws RemoteException;

    void zza(QueryRequest arg1, zzal arg2) throws RemoteException;

    void zza(QueryRequest arg1, zzam arg2, zzal arg3) throws RemoteException;

    void zza(RemoveEventListenerRequest arg1, zzam arg2, String arg3, zzal arg4) throws RemoteException;

    void zza(RemovePermissionRequest arg1, zzal arg2) throws RemoteException;

    void zza(SetDrivePreferencesRequest arg1, zzal arg2) throws RemoteException;

    void zza(SetFileUploadPreferencesRequest arg1, zzal arg2) throws RemoteException;

    void zza(SetResourceParentsRequest arg1, zzal arg2) throws RemoteException;

    void zza(TrashResourceRequest arg1, zzal arg2) throws RemoteException;

    void zza(UnsubscribeResourceRequest arg1, zzal arg2) throws RemoteException;

    void zza(UntrashResourceRequest arg1, zzal arg2) throws RemoteException;

    void zza(UpdateMetadataRequest arg1, zzal arg2) throws RemoteException;

    void zza(UpdatePermissionRequest arg1, zzal arg2) throws RemoteException;

    void zza(zzal arg1) throws RemoteException;

    void zza(zzam arg1, zzal arg2) throws RemoteException;

    void zzb(QueryRequest arg1, zzal arg2) throws RemoteException;

    void zzb(zzal arg1) throws RemoteException;

    void zzc(zzal arg1) throws RemoteException;

    void zzd(zzal arg1) throws RemoteException;

    void zze(zzal arg1) throws RemoteException;

    void zzf(zzal arg1) throws RemoteException;
}

