package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

public interface IGamesCallbacks extends IInterface {
    public static abstract class Stub extends Binder implements IGamesCallbacks {
        static class Proxy implements IGamesCallbacks {
            private IBinder zznF;

            Proxy(IBinder remote) {
                this.zznF = remote;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.zznF;
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void onInvitationRemoved(String invitationId) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeString(invitationId);
                    this.zznF.transact(8010, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void onLeftRoom(int statusCode, String roomId) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(statusCode);
                    parcel0.writeString(roomId);
                    this.zznF.transact(5020, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void onP2PConnected(String participantId) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeString(participantId);
                    this.zznF.transact(6001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void onP2PDisconnected(String participantId) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeString(participantId);
                    this.zznF.transact(6002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void onRealTimeMessageReceived(RealTimeMessage message) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(message == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        message.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5032, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void onRequestRemoved(String requestId) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeString(requestId);
                    this.zznF.transact(10002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void onTurnBasedMatchRemoved(String matchId) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeString(matchId);
                    this.zznF.transact(8009, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzA(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5022, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzB(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5023, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzC(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5024, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzD(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5025, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzE(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5038, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzF(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5035, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzG(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5039, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzH(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(8001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzI(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(10003, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzJ(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(10004, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzK(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(10006, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzL(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzM(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12005, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzN(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12006, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzO(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12007, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzP(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12014, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzQ(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(0x2EF0, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzR(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12008, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzS(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12013, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzT(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(13001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zza(int v, String s, boolean z) throws RemoteException {
                int v1 = 0;
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(v);
                    parcel0.writeString(s);
                    if(z) {
                        v1 = 1;
                    }
                    parcel0.writeInt(v1);
                    this.zznF.transact(5034, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zza(DataHolder dataHolder0, DataHolder dataHolder1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    if(dataHolder1 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder1.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5005, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zza(DataHolder dataHolder0, Contents contents0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    if(contents0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        contents0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12004, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zza(DataHolder dataHolder0, String s, Contents contents0, Contents contents1, Contents contents2) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeString(s);
                    if(contents0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        contents0.writeToParcel(parcel0, 0);
                    }
                    if(contents1 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        contents1.writeToParcel(parcel0, 0);
                    }
                    if(contents2 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        contents2.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(0x2EF1, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zza(DataHolder dataHolder0, String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStringArray(arr_s);
                    this.zznF.transact(5026, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zza(DataHolder[] arr_dataHolder) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeTypedArray(arr_dataHolder, 0);
                    this.zznF.transact(14001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzb(int v, int v1, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(v);
                    parcel0.writeInt(v1);
                    parcel0.writeString(s);
                    this.zznF.transact(5033, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzb(DataHolder dataHolder0, String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStringArray(arr_s);
                    this.zznF.transact(5027, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzc(int v, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(v);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(8002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzc(DataHolder dataHolder0, String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStringArray(arr_s);
                    this.zznF.transact(5028, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzd(int v, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(v);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(10005, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzd(DataHolder dataHolder0, String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStringArray(arr_s);
                    this.zznF.transact(5029, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zze(int v, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(v);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(11001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zze(int v, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(v);
                    parcel0.writeString(s);
                    this.zznF.transact(5001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zze(DataHolder dataHolder0, String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStringArray(arr_s);
                    this.zznF.transact(5030, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzf(int v, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(v);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12003, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzf(int v, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(v);
                    parcel0.writeString(s);
                    this.zznF.transact(5003, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzf(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzf(DataHolder dataHolder0, String[] arr_s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    parcel0.writeStringArray(arr_s);
                    this.zznF.transact(5031, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzfA(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(v);
                    this.zznF.transact(13002, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzfy(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(v);
                    this.zznF.transact(5036, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzfz(int v) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(v);
                    this.zznF.transact(5040, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzg(int v, Bundle bundle0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(v);
                    if(bundle0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        bundle0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(0x2EEF, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzg(int v, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(v);
                    parcel0.writeString(s);
                    this.zznF.transact(8007, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzg(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(12011, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzh(int v, String s) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    parcel0.writeInt(v);
                    parcel0.writeString(s);
                    this.zznF.transact(12012, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzh(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5004, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzi(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5006, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzj(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5007, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzk(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5008, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzkU() throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zznF.transact(5016, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzl(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5009, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzm(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5010, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzn(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5011, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzo(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(9001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzp(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5017, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzq(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5037, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzr(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(10001, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzs(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(8003, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzt(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(8004, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzu(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(8005, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzv(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(8006, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzw(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(8008, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzx(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5018, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzy(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5019, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }

            @Override  // com.google.android.gms.games.internal.IGamesCallbacks
            public void zzz(DataHolder dataHolder0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                Parcel parcel1 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(dataHolder0 == null) {
                        parcel0.writeInt(0);
                    }
                    else {
                        parcel0.writeInt(1);
                        dataHolder0.writeToParcel(parcel0, 0);
                    }
                    this.zznF.transact(5021, parcel0, parcel1, 0);
                    parcel1.readException();
                }
                finally {
                    parcel1.recycle();
                    parcel0.recycle();
                }
            }
        }

        public Stub() {
            this.attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
            DataHolder dataHolder0 = null;
            switch(code) {
                case 5001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zze(data.readInt(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zzf((data.readInt() == 0 ? null : DataHolder.CREATOR.zzS(data)));
                    reply.writeNoException();
                    return true;
                }
                case 5003: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zzf(data.readInt(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5004: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzh(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5005: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    DataHolder dataHolder1 = data.readInt() == 0 ? null : DataHolder.CREATOR.zzS(data);
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zza(dataHolder1, dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5006: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzi(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5007: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzj(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5008: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzk(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5009: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzl(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5010: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzm(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5011: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzn(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5016: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zzkU();
                    reply.writeNoException();
                    return true;
                }
                case 5017: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzp(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5018: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzx(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5019: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzy(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5020: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.onLeftRoom(data.readInt(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5021: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzz(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5022: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzA(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5023: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzB(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5024: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzC(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5025: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzD(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5026: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zza(dataHolder0, data.createStringArray());
                    reply.writeNoException();
                    return true;
                }
                case 5027: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzb(dataHolder0, data.createStringArray());
                    reply.writeNoException();
                    return true;
                }
                case 5028: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzc(dataHolder0, data.createStringArray());
                    reply.writeNoException();
                    return true;
                }
                case 5029: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzd(dataHolder0, data.createStringArray());
                    reply.writeNoException();
                    return true;
                }
                case 5030: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zze(dataHolder0, data.createStringArray());
                    reply.writeNoException();
                    return true;
                }
                case 5031: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzf(dataHolder0, data.createStringArray());
                    reply.writeNoException();
                    return true;
                }
                case 5032: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.onRealTimeMessageReceived((data.readInt() == 0 ? null : ((RealTimeMessage)RealTimeMessage.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 5033: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zzb(data.readInt(), data.readInt(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 5034: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zza(data.readInt(), data.readString(), data.readInt() != 0);
                    reply.writeNoException();
                    return true;
                }
                case 5035: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzF(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5036: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zzfy(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 5037: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzq(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5038: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzE(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5039: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzG(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 5040: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zzfz(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 6001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.onP2PConnected(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 6002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.onP2PDisconnected(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzH(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 8002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zzc(data.readInt(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 8003: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzs(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 8004: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzt(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 8005: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzu(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 8006: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzv(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 8007: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zzg(data.readInt(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8008: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzw(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 8009: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.onTurnBasedMatchRemoved(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 8010: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.onInvitationRemoved(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 9001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzo(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 10001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzr(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 10002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.onRequestRemoved(data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 10003: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzI(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 10004: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzJ(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 10005: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zzd(data.readInt(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 10006: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzK(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 11001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zze(data.readInt(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 12001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzL(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 12003: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zzf(data.readInt(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 12004: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zza((data.readInt() == 0 ? null : DataHolder.CREATOR.zzS(data)), (data.readInt() == 0 ? null : ((Contents)Contents.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 12005: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzM(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 12006: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzN(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 12007: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzO(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 12008: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzR(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 12011: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzg(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 12012: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zzh(data.readInt(), data.readString());
                    reply.writeNoException();
                    return true;
                }
                case 12013: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzS(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 12014: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzP(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 0x2EEF: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zzg(data.readInt(), (data.readInt() == 0 ? null : ((Bundle)Bundle.CREATOR.createFromParcel(data))));
                    reply.writeNoException();
                    return true;
                }
                case 0x2EF0: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzQ(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 0x2EF1: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    DataHolder dataHolder2 = data.readInt() == 0 ? null : DataHolder.CREATOR.zzS(data);
                    String s = data.readString();
                    Contents contents0 = data.readInt() == 0 ? null : ((Contents)Contents.CREATOR.createFromParcel(data));
                    Contents contents1 = data.readInt() == 0 ? null : ((Contents)Contents.CREATOR.createFromParcel(data));
                    if(data.readInt() != 0) {
                        dataHolder0 = (Contents)Contents.CREATOR.createFromParcel(data);
                    }
                    this.zza(dataHolder2, s, contents0, contents1, ((Contents)dataHolder0));
                    reply.writeNoException();
                    return true;
                }
                case 13001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    if(data.readInt() != 0) {
                        dataHolder0 = DataHolder.CREATOR.zzS(data);
                    }
                    this.zzT(dataHolder0);
                    reply.writeNoException();
                    return true;
                }
                case 13002: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zzfA(data.readInt());
                    reply.writeNoException();
                    return true;
                }
                case 14001: {
                    data.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                    this.zza(((DataHolder[])data.createTypedArray(DataHolder.CREATOR)));
                    reply.writeNoException();
                    return true;
                }
                case 0x5F4E5446: {
                    reply.writeString("com.google.android.gms.games.internal.IGamesCallbacks");
                    return true;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
        }

        public static IGamesCallbacks zzbK(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            return iInterface0 != null && iInterface0 instanceof IGamesCallbacks ? ((IGamesCallbacks)iInterface0) : new Proxy(iBinder0);
        }
    }

    void onInvitationRemoved(String arg1) throws RemoteException;

    void onLeftRoom(int arg1, String arg2) throws RemoteException;

    void onP2PConnected(String arg1) throws RemoteException;

    void onP2PDisconnected(String arg1) throws RemoteException;

    void onRealTimeMessageReceived(RealTimeMessage arg1) throws RemoteException;

    void onRequestRemoved(String arg1) throws RemoteException;

    void onTurnBasedMatchRemoved(String arg1) throws RemoteException;

    void zzA(DataHolder arg1) throws RemoteException;

    void zzB(DataHolder arg1) throws RemoteException;

    void zzC(DataHolder arg1) throws RemoteException;

    void zzD(DataHolder arg1) throws RemoteException;

    void zzE(DataHolder arg1) throws RemoteException;

    void zzF(DataHolder arg1) throws RemoteException;

    void zzG(DataHolder arg1) throws RemoteException;

    void zzH(DataHolder arg1) throws RemoteException;

    void zzI(DataHolder arg1) throws RemoteException;

    void zzJ(DataHolder arg1) throws RemoteException;

    void zzK(DataHolder arg1) throws RemoteException;

    void zzL(DataHolder arg1) throws RemoteException;

    void zzM(DataHolder arg1) throws RemoteException;

    void zzN(DataHolder arg1) throws RemoteException;

    void zzO(DataHolder arg1) throws RemoteException;

    void zzP(DataHolder arg1) throws RemoteException;

    void zzQ(DataHolder arg1) throws RemoteException;

    void zzR(DataHolder arg1) throws RemoteException;

    void zzS(DataHolder arg1) throws RemoteException;

    void zzT(DataHolder arg1) throws RemoteException;

    void zza(int arg1, String arg2, boolean arg3) throws RemoteException;

    void zza(DataHolder arg1, DataHolder arg2) throws RemoteException;

    void zza(DataHolder arg1, Contents arg2) throws RemoteException;

    void zza(DataHolder arg1, String arg2, Contents arg3, Contents arg4, Contents arg5) throws RemoteException;

    void zza(DataHolder arg1, String[] arg2) throws RemoteException;

    void zza(DataHolder[] arg1) throws RemoteException;

    void zzb(int arg1, int arg2, String arg3) throws RemoteException;

    void zzb(DataHolder arg1, String[] arg2) throws RemoteException;

    void zzc(int arg1, Bundle arg2) throws RemoteException;

    void zzc(DataHolder arg1, String[] arg2) throws RemoteException;

    void zzd(int arg1, Bundle arg2) throws RemoteException;

    void zzd(DataHolder arg1, String[] arg2) throws RemoteException;

    void zze(int arg1, Bundle arg2) throws RemoteException;

    void zze(int arg1, String arg2) throws RemoteException;

    void zze(DataHolder arg1, String[] arg2) throws RemoteException;

    void zzf(int arg1, Bundle arg2) throws RemoteException;

    void zzf(int arg1, String arg2) throws RemoteException;

    void zzf(DataHolder arg1) throws RemoteException;

    void zzf(DataHolder arg1, String[] arg2) throws RemoteException;

    void zzfA(int arg1) throws RemoteException;

    void zzfy(int arg1) throws RemoteException;

    void zzfz(int arg1) throws RemoteException;

    void zzg(int arg1, Bundle arg2) throws RemoteException;

    void zzg(int arg1, String arg2) throws RemoteException;

    void zzg(DataHolder arg1) throws RemoteException;

    void zzh(int arg1, String arg2) throws RemoteException;

    void zzh(DataHolder arg1) throws RemoteException;

    void zzi(DataHolder arg1) throws RemoteException;

    void zzj(DataHolder arg1) throws RemoteException;

    void zzk(DataHolder arg1) throws RemoteException;

    void zzkU() throws RemoteException;

    void zzl(DataHolder arg1) throws RemoteException;

    void zzm(DataHolder arg1) throws RemoteException;

    void zzn(DataHolder arg1) throws RemoteException;

    void zzo(DataHolder arg1) throws RemoteException;

    void zzp(DataHolder arg1) throws RemoteException;

    void zzq(DataHolder arg1) throws RemoteException;

    void zzr(DataHolder arg1) throws RemoteException;

    void zzs(DataHolder arg1) throws RemoteException;

    void zzt(DataHolder arg1) throws RemoteException;

    void zzu(DataHolder arg1) throws RemoteException;

    void zzv(DataHolder arg1) throws RemoteException;

    void zzw(DataHolder arg1) throws RemoteException;

    void zzx(DataHolder arg1) throws RemoteException;

    void zzy(DataHolder arg1) throws RemoteException;

    void zzz(DataHolder arg1) throws RemoteException;
}

