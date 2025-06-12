package com.google.android.gms.games.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;

public interface IGamesService extends IInterface {
    public static abstract class Stub extends Binder implements IGamesService {
        static class Proxy implements IGamesService {
            private IBinder zznF;

            Proxy(IBinder remote) {
                this.zznF = remote;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzE(long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeLong(v);
                    this.zznF.transact(5001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzF(long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeLong(v);
                    this.zznF.transact(5059, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzG(long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeLong(v);
                    this.zznF.transact(8013, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzH(long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeLong(v);
                    this.zznF.transact(10002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzI(long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeLong(v);
                    this.zznF.transact(12012, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzJ(long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeLong(v);
                    this.zznF.transact(15502, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzY(boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(5068, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzZ(boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(0x2EFA, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public int zza(IGamesCallbacks iGamesCallbacks0, byte[] arr_b, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(5033, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zza(int v, byte[] arr_b, int v1, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeInt(v);
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeInt(v1);
                    parcel0.writeString(s);
                    this.zznF.transact(10012, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zza(PlayerEntity playerEntity0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if(playerEntity0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        playerEntity0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(0x3C8F, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zza(AchievementEntity achievementEntity0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if(achievementEntity0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        achievementEntity0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(13005, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zza(ZInvitationCluster zInvitationCluster0, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if(zInvitationCluster0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        zInvitationCluster0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(10021, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zza(GameRequestCluster gameRequestCluster0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if(gameRequestCluster0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        gameRequestCluster0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    this.zznF.transact(10022, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zza(RoomEntity roomEntity0, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if(roomEntity0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        roomEntity0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(9011, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zza(String s, boolean z, boolean z1, int v) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    parcel0.writeInt(v);
                    this.zznF.transact(12001, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zza(ParticipantEntity[] arr_participantEntity, String s, String s1, Uri uri0, Uri uri1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeTypedArray(arr_participantEntity, 0);
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    if(uri1 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri1.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(9031, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zza(ParticipantEntity[] arr_participantEntity, String s, String s1, Uri uri0, Uri uri1, String s2) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeTypedArray(arr_participantEntity, 0);
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    if(uri1 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri1.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s2);
                    this.zznF.transact(14003, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IBinder iBinder0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder(iBinder0);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5005, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(Contents contents0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if(contents0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        contents0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(0x2EF3, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    this.zznF.transact(5002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeInt(v);
                    this.zznF.transact(10016, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, int v, int v1, int v2) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeInt(v2);
                    this.zznF.transact(10009, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, int v, int v1, boolean z, boolean z1) throws RemoteException {
                int v2 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v2 = 0;
                    }
                    parcel0.writeInt(v2);
                    this.zznF.transact(5044, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, int v, int v1, String[] arr_s, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeStringArray(arr_s);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(8004, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, int v, String s, String[] arr_s, boolean z) throws RemoteException {
                int v1 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeString(s);
                    parcel0.writeStringArray(arr_s);
                    if(z) {
                        v1 = 1;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(14002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, int v, boolean z, boolean z1) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(5015, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, int v, int[] arr_v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeIntArray(arr_v);
                    this.zznF.transact(10018, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeLong(v);
                    this.zznF.transact(5058, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, long v, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeLong(v);
                    parcel0.writeString(s);
                    this.zznF.transact(8018, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, Bundle bundle0, int v, int v1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    this.zznF.transact(5021, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, IBinder iBinder0, int v, String[] arr_s, Bundle bundle0, boolean z, long v1) throws RemoteException {
                int v2 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeStrongBinder(iBinder0);
                    parcel0.writeInt(v);
                    parcel0.writeStringArray(arr_s);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    if(!z) {
                        v2 = 0;
                    }
                    parcel0.writeInt(v2);
                    parcel0.writeLong(v1);
                    this.zznF.transact(5030, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, IBinder iBinder0, String s, boolean z, long v) throws RemoteException {
                int v1 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeStrongBinder(iBinder0);
                    parcel0.writeString(s);
                    if(z) {
                        v1 = 1;
                    }
                    parcel0.writeInt(v1);
                    parcel0.writeLong(v);
                    this.zznF.transact(5031, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(5014, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    this.zznF.transact(10011, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, int v, int v1, int v2, boolean z) throws RemoteException {
                int v3 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeInt(v2);
                    if(z) {
                        v3 = 1;
                    }
                    parcel0.writeInt(v3);
                    this.zznF.transact(5019, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, int v, IBinder iBinder0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeStrongBinder(iBinder0);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5025, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, int v, boolean z) throws RemoteException {
                int v1 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    if(z) {
                        v1 = 1;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(8023, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, int v, boolean z, boolean z1) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(5045, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, int v, boolean z, boolean z1, boolean z2, boolean z3) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeInt((z ? 1 : 0));
                    parcel0.writeInt((z1 ? 1 : 0));
                    parcel0.writeInt((z2 ? 1 : 0));
                    if(!z3) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(6501, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, int v, int[] arr_v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeIntArray(arr_v);
                    this.zznF.transact(10019, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeLong(v);
                    this.zznF.transact(5016, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, long v, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeLong(v);
                    parcel0.writeString(s1);
                    this.zznF.transact(7002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, IBinder iBinder0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeStrongBinder(iBinder0);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5023, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity0, Contents contents0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    if(snapshotMetadataChangeEntity0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        snapshotMetadataChangeEntity0.writeToParcel(parcel0, 0);
                    }
                    if(contents0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        contents0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12007, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(5038, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, String s1, int v, int v1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    this.zznF.transact(8001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, String s1, int v, int v1, int v2) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeInt(v2);
                    this.zznF.transact(10010, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, String s1, int v, int v1, int v2, boolean z) throws RemoteException {
                int v3 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeInt(v2);
                    if(z) {
                        v3 = 1;
                    }
                    parcel0.writeInt(v3);
                    this.zznF.transact(5039, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, String s1, int v, boolean z, boolean z1) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeInt(v);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(9028, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, String s1, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity0, Contents contents0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(snapshotMetadataChangeEntity0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        snapshotMetadataChangeEntity0.writeToParcel(parcel0, 0);
                    }
                    if(contents0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        contents0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(0x2F01, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, String s1, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(6002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, String s1, int[] arr_v, int v, boolean z) throws RemoteException {
                int v1 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeIntArray(arr_v);
                    parcel0.writeInt(v);
                    if(z) {
                        v1 = 1;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(0x2EEF, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, String s1, String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeStringArray(arr_s);
                    this.zznF.transact(10008, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, String s1, String[] arr_s, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeStringArray(arr_s);
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(0x2EFC, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(5054, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, boolean z, int v) throws RemoteException {
                int v1 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    if(z) {
                        v1 = 1;
                    }
                    parcel0.writeInt(v1);
                    parcel0.writeInt(v);
                    this.zznF.transact(15001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, byte[] arr_b, String s1, ParticipantResult[] arr_participantResult) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeString(s1);
                    parcel0.writeTypedArray(arr_participantResult, 0);
                    this.zznF.transact(8007, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, byte[] arr_b, ParticipantResult[] arr_participantResult) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeTypedArray(arr_participantResult, 0);
                    this.zznF.transact(8008, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, int[] arr_v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeIntArray(arr_v);
                    this.zznF.transact(8017, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String s, String[] arr_s, int v, byte[] arr_b, int v1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeStringArray(arr_s);
                    parcel0.writeInt(v);
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeInt(v1);
                    this.zznF.transact(10005, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(6001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, boolean z, Bundle bundle0) throws RemoteException {
                int v = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    if(!z) {
                        v = 0;
                    }
                    parcel0.writeInt(v);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5063, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, boolean z, String[] arr_s) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    parcel0.writeStringArray(arr_s);
                    this.zznF.transact(0x2EFF, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, int[] arr_v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeIntArray(arr_v);
                    this.zznF.transact(8003, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, int[] arr_v, int v, boolean z) throws RemoteException {
                int v1 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeIntArray(arr_v);
                    parcel0.writeInt(v);
                    if(z) {
                        v1 = 1;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(12010, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeStringArray(arr_s);
                    this.zznF.transact(10006, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesCallbacks iGamesCallbacks0, String[] arr_s, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeStringArray(arr_s);
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(0x2EFD, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(IGamesClient iGamesClient0, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesClient0 == null ? null : iGamesClient0.asBinder()));
                    parcel0.writeLong(v);
                    this.zznF.transact(15501, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zza(String s, IBinder iBinder0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    parcel0.writeStrongBinder(iBinder0);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(13002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzaa(boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(13001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public int zzb(byte[] arr_b, String s, String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeByteArray(arr_b);
                    parcel0.writeString(s);
                    parcel0.writeStringArray(arr_s);
                    this.zznF.transact(5034, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zzb(int v, int v1, boolean z) throws RemoteException {
                int v2 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    if(z) {
                        v2 = 1;
                    }
                    parcel0.writeInt(v2);
                    this.zznF.transact(9008, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zzb(int[] arr_v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeIntArray(arr_v);
                    this.zznF.transact(12030, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(long v, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeLong(v);
                    parcel0.writeString(s);
                    this.zznF.transact(8019, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    this.zznF.transact(5017, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, int v, boolean z, boolean z1) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(5046, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeLong(v);
                    this.zznF.transact(8012, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, long v, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeLong(v);
                    parcel0.writeString(s);
                    this.zznF.transact(8020, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(5018, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, String s, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    this.zznF.transact(0x2EF7, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, String s, int v, int v1, int v2, boolean z) throws RemoteException {
                int v3 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeInt(v2);
                    if(z) {
                        v3 = 1;
                    }
                    parcel0.writeInt(v3);
                    this.zznF.transact(5020, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, String s, int v, IBinder iBinder0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeStrongBinder(iBinder0);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(7003, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, String s, int v, boolean z) throws RemoteException {
                int v1 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    if(z) {
                        v1 = 1;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(10017, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, String s, int v, boolean z, boolean z1) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(5501, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, String s, IBinder iBinder0, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeStrongBinder(iBinder0);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5024, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(5041, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, String s, String s1, int v, int v1, int v2, boolean z) throws RemoteException {
                int v3 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeInt(v2);
                    if(z) {
                        v3 = 1;
                    }
                    parcel0.writeInt(v3);
                    this.zznF.transact(5040, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, String s, String s1, int v, boolean z, boolean z1) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeInt(v);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(0x2EF2, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, String s, String s1, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(6506, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, String s, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(6502, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(6503, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(IGamesCallbacks iGamesCallbacks0, String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeStringArray(arr_s);
                    this.zznF.transact(10007, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzb(String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStringArray(arr_s);
                    this.zznF.transact(15002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zzc(int v, int v1, boolean z) throws RemoteException {
                int v2 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    if(z) {
                        v2 = 1;
                    }
                    parcel0.writeInt(v2);
                    this.zznF.transact(9009, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzc(long v, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeLong(v);
                    parcel0.writeString(s);
                    this.zznF.transact(8021, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzc(IGamesCallbacks iGamesCallbacks0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    this.zznF.transact(5022, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzc(IGamesCallbacks iGamesCallbacks0, int v, boolean z, boolean z1) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(5048, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzc(IGamesCallbacks iGamesCallbacks0, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeLong(v);
                    this.zznF.transact(10001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzc(IGamesCallbacks iGamesCallbacks0, long v, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeLong(v);
                    parcel0.writeString(s);
                    this.zznF.transact(10003, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzc(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(5032, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzc(IGamesCallbacks iGamesCallbacks0, String s, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    this.zznF.transact(0x2EF8, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzc(IGamesCallbacks iGamesCallbacks0, String s, int v, boolean z, boolean z1) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(9001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzc(IGamesCallbacks iGamesCallbacks0, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(8011, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzc(IGamesCallbacks iGamesCallbacks0, String s, String s1, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(12003, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzc(IGamesCallbacks iGamesCallbacks0, String s, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(6504, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzc(IGamesCallbacks iGamesCallbacks0, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(8027, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzc(IGamesCallbacks iGamesCallbacks0, String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeStringArray(arr_s);
                    this.zznF.transact(10020, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzc(String s, String s1, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeInt(v);
                    this.zznF.transact(5051, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zzcO(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    this.zznF.transact(0x2F02, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public String zzcQ(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    this.zznF.transact(5064, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public String zzcR(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    this.zznF.transact(5035, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzcS(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    this.zznF.transact(5050, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public int zzcT(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    this.zznF.transact(5060, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Uri zzcU(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    this.zznF.transact(5066, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Uri)Uri.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzcV(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    this.zznF.transact(8002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zzcW(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    this.zznF.transact(9004, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public ParcelFileDescriptor zzcX(String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    this.zznF.transact(9030, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzd(long v, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeLong(v);
                    parcel0.writeString(s);
                    this.zznF.transact(10004, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzd(IGamesCallbacks iGamesCallbacks0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    this.zznF.transact(5026, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzd(IGamesCallbacks iGamesCallbacks0, int v, boolean z, boolean z1) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(6003, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzd(IGamesCallbacks iGamesCallbacks0, long v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeLong(v);
                    this.zznF.transact(12011, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzd(IGamesCallbacks iGamesCallbacks0, long v, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeLong(v);
                    parcel0.writeString(s);
                    this.zznF.transact(12013, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzd(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(5037, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzd(IGamesCallbacks iGamesCallbacks0, String s, int v, boolean z, boolean z1) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(9020, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzd(IGamesCallbacks iGamesCallbacks0, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(0x1F4F, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzd(IGamesCallbacks iGamesCallbacks0, String s, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(6505, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzd(IGamesCallbacks iGamesCallbacks0, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(12002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzd(String s, String s1, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    parcel0.writeInt(v);
                    this.zznF.transact(8026, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zze(long v, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeLong(v);
                    parcel0.writeString(s);
                    this.zznF.transact(12014, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zze(IGamesCallbacks iGamesCallbacks0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    this.zznF.transact(5027, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zze(IGamesCallbacks iGamesCallbacks0, int v, boolean z, boolean z1) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeInt(v);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(6004, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zze(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(5042, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zze(IGamesCallbacks iGamesCallbacks0, String s, int v, boolean z, boolean z1) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(0x2EF5, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zze(IGamesCallbacks iGamesCallbacks0, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(0x1F50, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zze(IGamesCallbacks iGamesCallbacks0, String s, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(12006, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zze(IGamesCallbacks iGamesCallbacks0, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(0x2F00, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzf(IGamesCallbacks iGamesCallbacks0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    this.zznF.transact(5047, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzf(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(5043, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzf(IGamesCallbacks iGamesCallbacks0, String s, int v, boolean z, boolean z1) throws RemoteException {
                int v1 = 1;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    parcel0.writeInt((z ? 1 : 0));
                    if(!z1) {
                        v1 = 0;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(0x2EF6, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzf(IGamesCallbacks iGamesCallbacks0, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(12009, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzf(IGamesCallbacks iGamesCallbacks0, String s, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(13006, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzf(IGamesCallbacks iGamesCallbacks0, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(0x2EF0, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzfD(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeInt(v);
                    this.zznF.transact(5036, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzg(IGamesCallbacks iGamesCallbacks0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    this.zznF.transact(5049, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzg(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(5052, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzg(IGamesCallbacks iGamesCallbacks0, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(13003, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public RoomEntity zzh(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                RoomEntity roomEntity0 = null;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(5053, parcel0, parcel1, 0);
                    parcel1.readException();
                    if(parcel1.readInt() != 0) {
                        roomEntity0 = (RoomEntity)RoomEntity.CREATOR.createFromParcel(parcel1);
                    }
                    return roomEntity0;
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzh(IGamesCallbacks iGamesCallbacks0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    this.zznF.transact(5056, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzh(IGamesCallbacks iGamesCallbacks0, boolean z) throws RemoteException {
                int v = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    if(z) {
                        v = 1;
                    }
                    parcel0.writeInt(v);
                    this.zznF.transact(13004, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzi(IGamesCallbacks iGamesCallbacks0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    this.zznF.transact(5062, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzi(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(5061, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public ParcelFileDescriptor zzj(Uri uri0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    if(uri0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        uri0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(6507, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzj(IGamesCallbacks iGamesCallbacks0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    this.zznF.transact(11001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzj(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(5057, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzk(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(7001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzl(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(8005, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Bundle zzlM() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(5004, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzm(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(8006, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzn(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(8009, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzo(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(8010, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzp(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(8014, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzp(String s, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    this.zznF.transact(0x2EF1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzq(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(9002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzq(String s, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    this.zznF.transact(5029, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzr(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(12020, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzr(String s, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    this.zznF.transact(5028, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzs(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(12005, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zzsA() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(9005, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zzsB() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(9006, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zzsC() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(9007, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zzsH() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(9010, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zzsI() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(9012, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public int zzsJ() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(9019, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public String zzsK() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(5003, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public int zzsL() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(8024, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zzsM() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(10015, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public int zzsN() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(10013, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public int zzsO() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(10023, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public int zzsP() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(0x2F03, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public int zzsQ() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(0x2F04, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzsR() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(5006, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public DataHolder zzsT() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(5013, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : DataHolder.CREATOR.zzS(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public boolean zzsU() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(5067, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.games.internal.IGamesService
            public DataHolder zzsV() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(5502, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : DataHolder.CREATOR.zzS(parcel1);
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzsW() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(8022, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zzsX() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(9013, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzsY() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(11002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public boolean zzsZ() throws RemoteException {
                boolean z = false;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(0x2EF9, parcel0, parcel1, 0);
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

            @Override  // com.google.android.gms.games.internal.IGamesService
            public String zzsv() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(5007, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public String zzsw() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(5012, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readString();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zzsz() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(9003, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzt(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(0x2EFB, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzt(String s, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    this.zznF.transact(5055, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzta() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(0x3C90, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zztb() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    this.zznF.transact(16001, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzu(IGamesCallbacks iGamesCallbacks0, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeStrongBinder((iGamesCallbacks0 == null ? null : iGamesCallbacks0.asBinder()));
                    parcel0.writeString(s);
                    this.zznF.transact(12008, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzu(String s, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    this.zznF.transact(10014, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public Intent zzv(String s, int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    parcel0.writeInt(v);
                    this.zznF.transact(14001, parcel0, parcel1, 0);
                    parcel1.readException();
                    return parcel1.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel1));
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzy(String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(5065, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesService
            public void zzz(String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.zznF.transact(8025, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public Stub() {
            this.attachInterface(this, "com.google.android.gms.games.internal.IGamesService");
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            Bundle bundle0 = null;
            boolean z = false;
            switch(code) {
                case 5001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzE(data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 5002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5003: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    String s = this.zzsK();
                    reply.writeNoException();
                    reply.writeString(s);
                    return true;
                }
                case 5004: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Bundle bundle1 = this.zzlM();
                    reply.writeNoException();
                    if(bundle1 != null) {
                        reply.writeInt(1);
                        bundle1.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 5005: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(data.readStrongBinder(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 5006: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzsR();
                    reply.writeNoException();
                    return true;
                }
                case 5007: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    String s1 = this.zzsv();
                    reply.writeNoException();
                    reply.writeString(s1);
                    return true;
                }
                case 5012: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    String s2 = this.zzsw();
                    reply.writeNoException();
                    reply.writeString(s2);
                    return true;
                }
                case 5013: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    DataHolder dataHolder0 = this.zzsT();
                    reply.writeNoException();
                    if(dataHolder0 != null) {
                        reply.writeInt(1);
                        dataHolder0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 5014: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5015: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks0 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    int v2 = data.readInt();
                    boolean z1 = data.readInt() != 0;
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(iGamesCallbacks0, v2, z1, z);
                    reply.writeNoException();
                    return true;
                }
                case 5016: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 5017: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzb(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5018: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzb(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5019: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readInt(), data.readInt(), data.readInt(), data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 5020: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzb(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readInt(), data.readInt(), data.readInt(), data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 5021: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))), data.readInt(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 5022: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzc(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5023: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readStrongBinder(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 5024: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzb(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readStrongBinder(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 5025: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readInt(), data.readStrongBinder(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 5026: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzd(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5027: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zze(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5028: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzr(data.readString(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 5029: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzq(data.readString(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 5030: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks1 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    IBinder iBinder0 = data.readStrongBinder();
                    int v3 = data.readInt();
                    String[] arr_s = data.createStringArray();
                    if(data.readInt() != 0) {
                        bundle0 = (Bundle)Bundle.CREATOR.createFromParcel(data);
                    }
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(iGamesCallbacks1, iBinder0, v3, arr_s, bundle0, z, data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 5031: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readStrongBinder(), data.readString(), data.readInt() != 0, data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 5032: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzc(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5033: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int v4 = this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.createByteArray(), data.readString(), data.readString());
                    reply.writeNoException();
                    reply.writeInt(v4);
                    return true;
                }
                case 5034: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int v5 = this.zzb(data.createByteArray(), data.readString(), data.createStringArray());
                    reply.writeNoException();
                    reply.writeInt(v5);
                    return true;
                }
                case 5035: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    String s3 = this.zzcR(data.readString());
                    reply.writeNoException();
                    reply.writeString(s3);
                    return true;
                }
                case 5036: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzfD(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 5037: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzd(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5038: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5039: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks2 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s4 = data.readString();
                    String s5 = data.readString();
                    int v6 = data.readInt();
                    int v7 = data.readInt();
                    int v8 = data.readInt();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(iGamesCallbacks2, s4, s5, v6, v7, v8, z);
                    reply.writeNoException();
                    return true;
                }
                case 5040: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks3 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s6 = data.readString();
                    String s7 = data.readString();
                    int v9 = data.readInt();
                    int v10 = data.readInt();
                    int v11 = data.readInt();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzb(iGamesCallbacks3, s6, s7, v9, v10, v11, z);
                    reply.writeNoException();
                    return true;
                }
                case 5041: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzb(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5042: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zze(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5043: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzf(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5044: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readInt(), data.readInt(), data.readInt() != 0, data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 5045: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readInt(), data.readInt() != 0, data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 5046: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks4 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    int v12 = data.readInt();
                    boolean z2 = data.readInt() != 0;
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzb(iGamesCallbacks4, v12, z2, z);
                    reply.writeNoException();
                    return true;
                }
                case 5047: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzf(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5048: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks5 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    int v13 = data.readInt();
                    boolean z3 = data.readInt() != 0;
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzc(iGamesCallbacks5, v13, z3, z);
                    reply.writeNoException();
                    return true;
                }
                case 5049: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzg(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5050: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzcS(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5051: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzc(data.readString(), data.readString(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 5052: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzg(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5053: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    RoomEntity roomEntity0 = this.zzh(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    if(roomEntity0 != null) {
                        reply.writeInt(1);
                        roomEntity0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 5054: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks6 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s8 = data.readString();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(iGamesCallbacks6, s8, z);
                    reply.writeNoException();
                    return true;
                }
                case 5055: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzt(data.readString(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 5056: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzh(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5057: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzj(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5058: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 5059: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzF(data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 5060: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int v14 = this.zzcT(data.readString());
                    reply.writeNoException();
                    reply.writeInt(v14);
                    return true;
                }
                case 5061: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzi(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5062: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzi(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 5063: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks7 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(iGamesCallbacks7, z, (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 5064: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    String s9 = this.zzcQ(data.readString());
                    reply.writeNoException();
                    reply.writeString(s9);
                    return true;
                }
                case 5065: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzy(data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5066: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Uri uri0 = this.zzcU(data.readString());
                    reply.writeNoException();
                    if(uri0 != null) {
                        reply.writeInt(1);
                        uri0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 5067: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    boolean z4 = this.zzsU();
                    reply.writeNoException();
                    if(z4) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 5068: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzY(z);
                    reply.writeNoException();
                    return true;
                }
                case 5501: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzb(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readInt(), data.readInt() != 0, data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 5502: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    DataHolder dataHolder1 = this.zzsV();
                    reply.writeNoException();
                    if(dataHolder1 != null) {
                        reply.writeInt(1);
                        dataHolder1.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 6001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks8 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(iGamesCallbacks8, z);
                    reply.writeNoException();
                    return true;
                }
                case 6002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks9 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s10 = data.readString();
                    String s11 = data.readString();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(iGamesCallbacks9, s10, s11, z);
                    reply.writeNoException();
                    return true;
                }
                case 6003: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks10 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    int v15 = data.readInt();
                    boolean z5 = data.readInt() != 0;
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzd(iGamesCallbacks10, v15, z5, z);
                    reply.writeNoException();
                    return true;
                }
                case 6004: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks11 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    int v16 = data.readInt();
                    boolean z6 = data.readInt() != 0;
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zze(iGamesCallbacks11, v16, z6, z);
                    reply.writeNoException();
                    return true;
                }
                case 6501: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks12 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s12 = data.readString();
                    int v17 = data.readInt();
                    boolean z7 = data.readInt() != 0;
                    boolean z8 = data.readInt() != 0;
                    boolean z9 = data.readInt() != 0;
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(iGamesCallbacks12, s12, v17, z7, z8, z9, z);
                    reply.writeNoException();
                    return true;
                }
                case 6502: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks13 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s13 = data.readString();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzb(iGamesCallbacks13, s13, z);
                    reply.writeNoException();
                    return true;
                }
                case 6503: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks14 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzb(iGamesCallbacks14, z);
                    reply.writeNoException();
                    return true;
                }
                case 6504: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks15 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s14 = data.readString();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzc(iGamesCallbacks15, s14, z);
                    reply.writeNoException();
                    return true;
                }
                case 6505: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks16 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s15 = data.readString();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzd(iGamesCallbacks16, s15, z);
                    reply.writeNoException();
                    return true;
                }
                case 6506: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks17 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s16 = data.readString();
                    String s17 = data.readString();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzb(iGamesCallbacks17, s16, s17, z);
                    reply.writeNoException();
                    return true;
                }
                case 6507: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    ParcelFileDescriptor parcelFileDescriptor0 = this.zzj((data.readInt() == 0 ? null : ((Uri)Uri.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    if(parcelFileDescriptor0 != null) {
                        reply.writeInt(1);
                        parcelFileDescriptor0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 7001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzk(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 7002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readLong(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 7003: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzb(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readInt(), data.readStrongBinder(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 8001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readString(), data.readInt(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 8002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzcV(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8003: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.createIntArray());
                    reply.writeNoException();
                    return true;
                }
                case 8004: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readInt(), data.readInt(), data.createStringArray(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 8005: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzl(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8006: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzm(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8007: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.createByteArray(), data.readString(), ((ParticipantResult[])data.createTypedArray(ParticipantResult.CREATOR)));
                    reply.writeNoException();
                    return true;
                }
                case 8008: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.createByteArray(), ((ParticipantResult[])data.createTypedArray(ParticipantResult.CREATOR)));
                    reply.writeNoException();
                    return true;
                }
                case 8009: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzn(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8010: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzo(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8011: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzc(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8012: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzb(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 8013: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzG(data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 8014: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzp(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 0x1F4F: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzd(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 0x1F50: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zze(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8017: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.createIntArray());
                    reply.writeNoException();
                    return true;
                }
                case 8018: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readLong(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8019: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzb(data.readLong(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8020: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzb(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readLong(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8021: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzc(data.readLong(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8022: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzsW();
                    reply.writeNoException();
                    return true;
                }
                case 8023: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks18 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s18 = data.readString();
                    int v18 = data.readInt();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(iGamesCallbacks18, s18, v18, z);
                    reply.writeNoException();
                    return true;
                }
                case 8024: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int v19 = this.zzsL();
                    reply.writeNoException();
                    reply.writeInt(v19);
                    return true;
                }
                case 8025: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzz(data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8026: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzd(data.readString(), data.readString(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 8027: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks19 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzc(iGamesCallbacks19, z);
                    reply.writeNoException();
                    return true;
                }
                case 9001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzc(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readInt(), data.readInt() != 0, data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 9002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzq(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 9003: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent0 = this.zzsz();
                    reply.writeNoException();
                    if(intent0 != null) {
                        reply.writeInt(1);
                        intent0.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 9004: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent1 = this.zzcW(data.readString());
                    reply.writeNoException();
                    if(intent1 != null) {
                        reply.writeInt(1);
                        intent1.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 9005: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent2 = this.zzsA();
                    reply.writeNoException();
                    if(intent2 != null) {
                        reply.writeInt(1);
                        intent2.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 9006: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent3 = this.zzsB();
                    reply.writeNoException();
                    if(intent3 != null) {
                        reply.writeInt(1);
                        intent3.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 9007: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent4 = this.zzsC();
                    reply.writeNoException();
                    if(intent4 != null) {
                        reply.writeInt(1);
                        intent4.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 9008: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent5 = this.zzb(data.readInt(), data.readInt(), data.readInt() != 0);
                    reply.writeNoException();
                    if(intent5 != null) {
                        reply.writeInt(1);
                        intent5.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 9009: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent6 = this.zzc(data.readInt(), data.readInt(), data.readInt() != 0);
                    reply.writeNoException();
                    if(intent6 != null) {
                        reply.writeInt(1);
                        intent6.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 9010: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent7 = this.zzsH();
                    reply.writeNoException();
                    if(intent7 != null) {
                        reply.writeInt(1);
                        intent7.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 9011: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent8 = this.zza((data.readInt() == 0 ? null : ((RoomEntity)RoomEntity.CREATOR.createFromParcel(data))), data.readInt());
                    reply.writeNoException();
                    if(intent8 != null) {
                        reply.writeInt(1);
                        intent8.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 9012: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent9 = this.zzsI();
                    reply.writeNoException();
                    if(intent9 != null) {
                        reply.writeInt(1);
                        intent9.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 9013: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent10 = this.zzsX();
                    reply.writeNoException();
                    if(intent10 != null) {
                        reply.writeInt(1);
                        intent10.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 9019: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int v20 = this.zzsJ();
                    reply.writeNoException();
                    reply.writeInt(v20);
                    return true;
                }
                case 9020: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzd(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readInt(), data.readInt() != 0, data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 9028: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readString(), data.readInt(), data.readInt() != 0, data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 9030: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    ParcelFileDescriptor parcelFileDescriptor1 = this.zzcX(data.readString());
                    reply.writeNoException();
                    if(parcelFileDescriptor1 != null) {
                        reply.writeInt(1);
                        parcelFileDescriptor1.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 9031: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent11 = this.zza(((ParticipantEntity[])data.createTypedArray(ParticipantEntity.CREATOR)), data.readString(), data.readString(), (data.readInt() == 0 ? null : ((Uri)Uri.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Uri)Uri.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    if(intent11 != null) {
                        reply.writeInt(1);
                        intent11.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 10001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzc(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 10002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzH(data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 10003: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzc(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readLong(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 10004: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzd(data.readLong(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 10005: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.createStringArray(), data.readInt(), data.createByteArray(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 10006: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.createStringArray());
                    reply.writeNoException();
                    return true;
                }
                case 10007: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzb(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.createStringArray());
                    reply.writeNoException();
                    return true;
                }
                case 10008: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readString(), data.createStringArray());
                    reply.writeNoException();
                    return true;
                }
                case 10009: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readInt(), data.readInt(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 10010: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readString(), data.readInt(), data.readInt(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 10011: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 10012: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent12 = this.zza(data.readInt(), data.createByteArray(), data.readInt(), data.readString());
                    reply.writeNoException();
                    if(intent12 != null) {
                        reply.writeInt(1);
                        intent12.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 10013: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int v21 = this.zzsN();
                    reply.writeNoException();
                    reply.writeInt(v21);
                    return true;
                }
                case 10014: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzu(data.readString(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 10015: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent13 = this.zzsM();
                    reply.writeNoException();
                    if(intent13 != null) {
                        reply.writeInt(1);
                        intent13.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 10016: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 10017: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks20 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s19 = data.readString();
                    int v22 = data.readInt();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzb(iGamesCallbacks20, s19, v22, z);
                    reply.writeNoException();
                    return true;
                }
                case 10018: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readInt(), data.createIntArray());
                    reply.writeNoException();
                    return true;
                }
                case 10019: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readInt(), data.createIntArray());
                    reply.writeNoException();
                    return true;
                }
                case 10020: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzc(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.createStringArray());
                    reply.writeNoException();
                    return true;
                }
                case 10021: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    if(data.readInt() != 0) {
                        bundle0 = ZInvitationCluster.CREATOR.zzdF(data);
                    }
                    Intent intent14 = this.zza(((ZInvitationCluster)bundle0), data.readString(), data.readString());
                    reply.writeNoException();
                    if(intent14 != null) {
                        reply.writeInt(1);
                        intent14.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 10022: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    if(data.readInt() != 0) {
                        bundle0 = GameRequestCluster.CREATOR.zzdH(data);
                    }
                    Intent intent15 = this.zza(((GameRequestCluster)bundle0), data.readString());
                    reply.writeNoException();
                    if(intent15 != null) {
                        reply.writeInt(1);
                        intent15.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 10023: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int v23 = this.zzsO();
                    reply.writeNoException();
                    reply.writeInt(v23);
                    return true;
                }
                case 11001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzj(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()));
                    reply.writeNoException();
                    return true;
                }
                case 11002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzsY();
                    reply.writeNoException();
                    return true;
                }
                case 12001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent16 = this.zza(data.readString(), data.readInt() != 0, data.readInt() != 0, data.readInt());
                    reply.writeNoException();
                    if(intent16 != null) {
                        reply.writeInt(1);
                        intent16.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 12002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks21 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzd(iGamesCallbacks21, z);
                    reply.writeNoException();
                    return true;
                }
                case 12003: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks22 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s20 = data.readString();
                    String s21 = data.readString();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzc(iGamesCallbacks22, s20, s21, z);
                    reply.writeNoException();
                    return true;
                }
                case 12005: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzs(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 12006: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks23 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s22 = data.readString();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zze(iGamesCallbacks23, s22, z);
                    reply.writeNoException();
                    return true;
                }
                case 12007: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), (data.readInt() == 0 ? null : SnapshotMetadataChangeEntity.CREATOR.zzdT(data)), (data.readInt() == 0 ? null : ((Contents)Contents.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 12008: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzu(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 12009: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzf(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 12010: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks24 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    int[] arr_v = data.createIntArray();
                    int v24 = data.readInt();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(iGamesCallbacks24, arr_v, v24, z);
                    reply.writeNoException();
                    return true;
                }
                case 12011: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzd(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 12012: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzI(data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 12013: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzd(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readLong(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 12014: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zze(data.readLong(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 0x2EEF: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readString(), data.createIntArray(), data.readInt(), data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 0x2EF0: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks25 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzf(iGamesCallbacks25, z);
                    reply.writeNoException();
                    return true;
                }
                case 0x2EF1: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzp(data.readString(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x2EF2: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzb(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readString(), data.readInt(), data.readInt() != 0, data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 0x2EF3: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza((data.readInt() == 0 ? null : ((Contents)Contents.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 12020: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzr(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 0x2EF5: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zze(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readInt(), data.readInt() != 0, data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 0x2EF6: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzf(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readInt(), data.readInt() != 0, data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 0x2EF7: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzb(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x2EF8: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzc(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 0x2EF9: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    boolean z10 = this.zzsZ();
                    reply.writeNoException();
                    if(z10) {
                        z = true;
                    }
                    reply.writeInt(((int)z));
                    return true;
                }
                case 0x2EFA: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzZ(z);
                    reply.writeNoException();
                    return true;
                }
                case 0x2EFB: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzt(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 0x2EFC: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readString(), data.createStringArray(), data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 0x2EFD: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks26 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String[] arr_s1 = data.createStringArray();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(iGamesCallbacks26, arr_s1, z);
                    reply.writeNoException();
                    return true;
                }
                case 12030: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent17 = this.zzb(data.createIntArray());
                    reply.writeNoException();
                    if(intent17 != null) {
                        reply.writeInt(1);
                        intent17.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 0x2EFF: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks27 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(iGamesCallbacks27, z, data.createStringArray());
                    reply.writeNoException();
                    return true;
                }
                case 0x2F00: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks28 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zze(iGamesCallbacks28, z);
                    reply.writeNoException();
                    return true;
                }
                case 0x2F01: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readString(), data.readString(), (data.readInt() == 0 ? null : SnapshotMetadataChangeEntity.CREATOR.zzdT(data)), (data.readInt() == 0 ? null : ((Contents)Contents.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x2F02: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent18 = this.zzcO(data.readString());
                    reply.writeNoException();
                    if(intent18 != null) {
                        reply.writeInt(1);
                        intent18.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 0x2F03: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int v25 = this.zzsP();
                    reply.writeNoException();
                    reply.writeInt(v25);
                    return true;
                }
                case 0x2F04: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    int v26 = this.zzsQ();
                    reply.writeNoException();
                    reply.writeInt(v26);
                    return true;
                }
                case 13001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzaa(z);
                    reply.writeNoException();
                    return true;
                }
                case 13002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(data.readString(), data.readStrongBinder(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 13003: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks29 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzg(iGamesCallbacks29, z);
                    reply.writeNoException();
                    return true;
                }
                case 13004: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks30 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzh(iGamesCallbacks30, z);
                    reply.writeNoException();
                    return true;
                }
                case 13005: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent19 = this.zza((data.readInt() == 0 ? null : ((AchievementEntity)AchievementEntity.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    if(intent19 != null) {
                        reply.writeInt(1);
                        intent19.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 13006: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks31 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s23 = data.readString();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zzf(iGamesCallbacks31, s23, z);
                    reply.writeNoException();
                    return true;
                }
                case 14001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent20 = this.zzv(data.readString(), data.readInt());
                    reply.writeNoException();
                    if(intent20 != null) {
                        reply.writeInt(1);
                        intent20.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 14002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder()), data.readInt(), data.readString(), data.createStringArray(), data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 14003: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent21 = this.zza(((ParticipantEntity[])data.createTypedArray(ParticipantEntity.CREATOR)), data.readString(), data.readString(), (data.readInt() == 0 ? null : ((Uri)Uri.CREATOR.createFromParcel(data))), (data.readInt() == 0 ? null : ((Uri)Uri.CREATOR.createFromParcel(data))), data.readString());
                    reply.writeNoException();
                    if(intent21 != null) {
                        reply.writeInt(1);
                        intent21.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 15001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    IGamesCallbacks iGamesCallbacks32 = com.google.android.gms.games.internal.IGamesCallbacks.Stub.zzbK(data.readStrongBinder());
                    String s24 = data.readString();
                    if(data.readInt() != 0) {
                        z = true;
                    }
                    this.zza(iGamesCallbacks32, s24, z, data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 15002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzb(data.createStringArray());
                    reply.writeNoException();
                    return true;
                }
                case 15501: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zza(com.google.android.gms.games.internal.IGamesClient.Stub.zzbL(data.readStrongBinder()), data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 15502: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzJ(data.readLong());
                    reply.writeNoException();
                    return true;
                }
                case 0x3C8F: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent22 = this.zza((data.readInt() == 0 ? null : ((PlayerEntity)PlayerEntity.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    if(intent22 != null) {
                        reply.writeInt(1);
                        intent22.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 0x3C90: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    this.zzta();
                    reply.writeNoException();
                    return true;
                }
                case 16001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesService");
                    Intent intent23 = this.zztb();
                    reply.writeNoException();
                    if(intent23 != null) {
                        reply.writeInt(1);
                        intent23.writeToParcel(reply, 1);
                        return true;
                    }
                    reply.writeInt(0);
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.games.internal.IGamesService");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static IGamesService zzbM(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
            return iInterface0 != null && iInterface0 instanceof IGamesService ? ((IGamesService)iInterface0) : new Proxy(iBinder0);
        }
    }

    void zzE(long arg1) throws RemoteException;

    void zzF(long arg1) throws RemoteException;

    void zzG(long arg1) throws RemoteException;

    void zzH(long arg1) throws RemoteException;

    void zzI(long arg1) throws RemoteException;

    void zzJ(long arg1) throws RemoteException;

    void zzY(boolean arg1) throws RemoteException;

    void zzZ(boolean arg1) throws RemoteException;

    int zza(IGamesCallbacks arg1, byte[] arg2, String arg3, String arg4) throws RemoteException;

    Intent zza(int arg1, byte[] arg2, int arg3, String arg4) throws RemoteException;

    Intent zza(PlayerEntity arg1) throws RemoteException;

    Intent zza(AchievementEntity arg1) throws RemoteException;

    Intent zza(ZInvitationCluster arg1, String arg2, String arg3) throws RemoteException;

    Intent zza(GameRequestCluster arg1, String arg2) throws RemoteException;

    Intent zza(RoomEntity arg1, int arg2) throws RemoteException;

    Intent zza(String arg1, boolean arg2, boolean arg3, int arg4) throws RemoteException;

    Intent zza(ParticipantEntity[] arg1, String arg2, String arg3, Uri arg4, Uri arg5) throws RemoteException;

    Intent zza(ParticipantEntity[] arg1, String arg2, String arg3, Uri arg4, Uri arg5, String arg6) throws RemoteException;

    void zza(IBinder arg1, Bundle arg2) throws RemoteException;

    void zza(Contents arg1) throws RemoteException;

    void zza(IGamesCallbacks arg1) throws RemoteException;

    void zza(IGamesCallbacks arg1, int arg2) throws RemoteException;

    void zza(IGamesCallbacks arg1, int arg2, int arg3, int arg4) throws RemoteException;

    void zza(IGamesCallbacks arg1, int arg2, int arg3, boolean arg4, boolean arg5) throws RemoteException;

    void zza(IGamesCallbacks arg1, int arg2, int arg3, String[] arg4, Bundle arg5) throws RemoteException;

    void zza(IGamesCallbacks arg1, int arg2, String arg3, String[] arg4, boolean arg5) throws RemoteException;

    void zza(IGamesCallbacks arg1, int arg2, boolean arg3, boolean arg4) throws RemoteException;

    void zza(IGamesCallbacks arg1, int arg2, int[] arg3) throws RemoteException;

    void zza(IGamesCallbacks arg1, long arg2) throws RemoteException;

    void zza(IGamesCallbacks arg1, long arg2, String arg3) throws RemoteException;

    void zza(IGamesCallbacks arg1, Bundle arg2, int arg3, int arg4) throws RemoteException;

    void zza(IGamesCallbacks arg1, IBinder arg2, int arg3, String[] arg4, Bundle arg5, boolean arg6, long arg7) throws RemoteException;

    void zza(IGamesCallbacks arg1, IBinder arg2, String arg3, boolean arg4, long arg5) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, int arg3) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, int arg3, int arg4, int arg5, boolean arg6) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, int arg3, IBinder arg4, Bundle arg5) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, int arg3, boolean arg4) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, int arg3, boolean arg4, boolean arg5) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, int arg3, int[] arg4) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, long arg3) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, long arg3, String arg4) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, IBinder arg3, Bundle arg4) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, SnapshotMetadataChangeEntity arg3, Contents arg4) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, String arg3) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, String arg3, int arg4, int arg5) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, String arg3, int arg4, int arg5, int arg6) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, String arg3, int arg4, int arg5, int arg6, boolean arg7) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, String arg3, int arg4, boolean arg5, boolean arg6) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, String arg3, SnapshotMetadataChangeEntity arg4, Contents arg5) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, String arg3, boolean arg4) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, String arg3, int[] arg4, int arg5, boolean arg6) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, String arg3, String[] arg4) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, String arg3, String[] arg4, boolean arg5) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, boolean arg3) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, boolean arg3, int arg4) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, byte[] arg3, String arg4, ParticipantResult[] arg5) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, byte[] arg3, ParticipantResult[] arg4) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, int[] arg3) throws RemoteException;

    void zza(IGamesCallbacks arg1, String arg2, String[] arg3, int arg4, byte[] arg5, int arg6) throws RemoteException;

    void zza(IGamesCallbacks arg1, boolean arg2) throws RemoteException;

    void zza(IGamesCallbacks arg1, boolean arg2, Bundle arg3) throws RemoteException;

    void zza(IGamesCallbacks arg1, boolean arg2, String[] arg3) throws RemoteException;

    void zza(IGamesCallbacks arg1, int[] arg2) throws RemoteException;

    void zza(IGamesCallbacks arg1, int[] arg2, int arg3, boolean arg4) throws RemoteException;

    void zza(IGamesCallbacks arg1, String[] arg2) throws RemoteException;

    void zza(IGamesCallbacks arg1, String[] arg2, boolean arg3) throws RemoteException;

    void zza(IGamesClient arg1, long arg2) throws RemoteException;

    void zza(String arg1, IBinder arg2, Bundle arg3) throws RemoteException;

    void zzaa(boolean arg1) throws RemoteException;

    int zzb(byte[] arg1, String arg2, String[] arg3) throws RemoteException;

    Intent zzb(int arg1, int arg2, boolean arg3) throws RemoteException;

    Intent zzb(int[] arg1) throws RemoteException;

    void zzb(long arg1, String arg2) throws RemoteException;

    void zzb(IGamesCallbacks arg1) throws RemoteException;

    void zzb(IGamesCallbacks arg1, int arg2, boolean arg3, boolean arg4) throws RemoteException;

    void zzb(IGamesCallbacks arg1, long arg2) throws RemoteException;

    void zzb(IGamesCallbacks arg1, long arg2, String arg3) throws RemoteException;

    void zzb(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzb(IGamesCallbacks arg1, String arg2, int arg3) throws RemoteException;

    void zzb(IGamesCallbacks arg1, String arg2, int arg3, int arg4, int arg5, boolean arg6) throws RemoteException;

    void zzb(IGamesCallbacks arg1, String arg2, int arg3, IBinder arg4, Bundle arg5) throws RemoteException;

    void zzb(IGamesCallbacks arg1, String arg2, int arg3, boolean arg4) throws RemoteException;

    void zzb(IGamesCallbacks arg1, String arg2, int arg3, boolean arg4, boolean arg5) throws RemoteException;

    void zzb(IGamesCallbacks arg1, String arg2, IBinder arg3, Bundle arg4) throws RemoteException;

    void zzb(IGamesCallbacks arg1, String arg2, String arg3) throws RemoteException;

    void zzb(IGamesCallbacks arg1, String arg2, String arg3, int arg4, int arg5, int arg6, boolean arg7) throws RemoteException;

    void zzb(IGamesCallbacks arg1, String arg2, String arg3, int arg4, boolean arg5, boolean arg6) throws RemoteException;

    void zzb(IGamesCallbacks arg1, String arg2, String arg3, boolean arg4) throws RemoteException;

    void zzb(IGamesCallbacks arg1, String arg2, boolean arg3) throws RemoteException;

    void zzb(IGamesCallbacks arg1, boolean arg2) throws RemoteException;

    void zzb(IGamesCallbacks arg1, String[] arg2) throws RemoteException;

    void zzb(String[] arg1) throws RemoteException;

    Intent zzc(int arg1, int arg2, boolean arg3) throws RemoteException;

    void zzc(long arg1, String arg2) throws RemoteException;

    void zzc(IGamesCallbacks arg1) throws RemoteException;

    void zzc(IGamesCallbacks arg1, int arg2, boolean arg3, boolean arg4) throws RemoteException;

    void zzc(IGamesCallbacks arg1, long arg2) throws RemoteException;

    void zzc(IGamesCallbacks arg1, long arg2, String arg3) throws RemoteException;

    void zzc(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzc(IGamesCallbacks arg1, String arg2, int arg3) throws RemoteException;

    void zzc(IGamesCallbacks arg1, String arg2, int arg3, boolean arg4, boolean arg5) throws RemoteException;

    void zzc(IGamesCallbacks arg1, String arg2, String arg3) throws RemoteException;

    void zzc(IGamesCallbacks arg1, String arg2, String arg3, boolean arg4) throws RemoteException;

    void zzc(IGamesCallbacks arg1, String arg2, boolean arg3) throws RemoteException;

    void zzc(IGamesCallbacks arg1, boolean arg2) throws RemoteException;

    void zzc(IGamesCallbacks arg1, String[] arg2) throws RemoteException;

    void zzc(String arg1, String arg2, int arg3) throws RemoteException;

    Intent zzcO(String arg1) throws RemoteException;

    String zzcQ(String arg1) throws RemoteException;

    String zzcR(String arg1) throws RemoteException;

    void zzcS(String arg1) throws RemoteException;

    int zzcT(String arg1) throws RemoteException;

    Uri zzcU(String arg1) throws RemoteException;

    void zzcV(String arg1) throws RemoteException;

    Intent zzcW(String arg1) throws RemoteException;

    ParcelFileDescriptor zzcX(String arg1) throws RemoteException;

    void zzd(long arg1, String arg2) throws RemoteException;

    void zzd(IGamesCallbacks arg1) throws RemoteException;

    void zzd(IGamesCallbacks arg1, int arg2, boolean arg3, boolean arg4) throws RemoteException;

    void zzd(IGamesCallbacks arg1, long arg2) throws RemoteException;

    void zzd(IGamesCallbacks arg1, long arg2, String arg3) throws RemoteException;

    void zzd(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzd(IGamesCallbacks arg1, String arg2, int arg3, boolean arg4, boolean arg5) throws RemoteException;

    void zzd(IGamesCallbacks arg1, String arg2, String arg3) throws RemoteException;

    void zzd(IGamesCallbacks arg1, String arg2, boolean arg3) throws RemoteException;

    void zzd(IGamesCallbacks arg1, boolean arg2) throws RemoteException;

    void zzd(String arg1, String arg2, int arg3) throws RemoteException;

    void zze(long arg1, String arg2) throws RemoteException;

    void zze(IGamesCallbacks arg1) throws RemoteException;

    void zze(IGamesCallbacks arg1, int arg2, boolean arg3, boolean arg4) throws RemoteException;

    void zze(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zze(IGamesCallbacks arg1, String arg2, int arg3, boolean arg4, boolean arg5) throws RemoteException;

    void zze(IGamesCallbacks arg1, String arg2, String arg3) throws RemoteException;

    void zze(IGamesCallbacks arg1, String arg2, boolean arg3) throws RemoteException;

    void zze(IGamesCallbacks arg1, boolean arg2) throws RemoteException;

    void zzf(IGamesCallbacks arg1) throws RemoteException;

    void zzf(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzf(IGamesCallbacks arg1, String arg2, int arg3, boolean arg4, boolean arg5) throws RemoteException;

    void zzf(IGamesCallbacks arg1, String arg2, String arg3) throws RemoteException;

    void zzf(IGamesCallbacks arg1, String arg2, boolean arg3) throws RemoteException;

    void zzf(IGamesCallbacks arg1, boolean arg2) throws RemoteException;

    void zzfD(int arg1) throws RemoteException;

    void zzg(IGamesCallbacks arg1) throws RemoteException;

    void zzg(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzg(IGamesCallbacks arg1, boolean arg2) throws RemoteException;

    RoomEntity zzh(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzh(IGamesCallbacks arg1) throws RemoteException;

    void zzh(IGamesCallbacks arg1, boolean arg2) throws RemoteException;

    void zzi(IGamesCallbacks arg1) throws RemoteException;

    void zzi(IGamesCallbacks arg1, String arg2) throws RemoteException;

    ParcelFileDescriptor zzj(Uri arg1) throws RemoteException;

    void zzj(IGamesCallbacks arg1) throws RemoteException;

    void zzj(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzk(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzl(IGamesCallbacks arg1, String arg2) throws RemoteException;

    Bundle zzlM() throws RemoteException;

    void zzm(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzn(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzo(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzp(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzp(String arg1, int arg2) throws RemoteException;

    void zzq(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzq(String arg1, int arg2) throws RemoteException;

    void zzr(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzr(String arg1, int arg2) throws RemoteException;

    void zzs(IGamesCallbacks arg1, String arg2) throws RemoteException;

    Intent zzsA() throws RemoteException;

    Intent zzsB() throws RemoteException;

    Intent zzsC() throws RemoteException;

    Intent zzsH() throws RemoteException;

    Intent zzsI() throws RemoteException;

    int zzsJ() throws RemoteException;

    String zzsK() throws RemoteException;

    int zzsL() throws RemoteException;

    Intent zzsM() throws RemoteException;

    int zzsN() throws RemoteException;

    int zzsO() throws RemoteException;

    int zzsP() throws RemoteException;

    int zzsQ() throws RemoteException;

    void zzsR() throws RemoteException;

    DataHolder zzsT() throws RemoteException;

    boolean zzsU() throws RemoteException;

    DataHolder zzsV() throws RemoteException;

    void zzsW() throws RemoteException;

    Intent zzsX() throws RemoteException;

    void zzsY() throws RemoteException;

    boolean zzsZ() throws RemoteException;

    String zzsv() throws RemoteException;

    String zzsw() throws RemoteException;

    Intent zzsz() throws RemoteException;

    void zzt(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzt(String arg1, int arg2) throws RemoteException;

    void zzta() throws RemoteException;

    Intent zztb() throws RemoteException;

    void zzu(IGamesCallbacks arg1, String arg2) throws RemoteException;

    void zzu(String arg1, int arg2) throws RemoteException;

    Intent zzv(String arg1, int arg2) throws RemoteException;

    void zzy(String arg1, String arg2) throws RemoteException;

    void zzz(String arg1, String arg2) throws RemoteException;
}

