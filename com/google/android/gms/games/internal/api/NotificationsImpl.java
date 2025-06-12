package com.google.android.gms.games.internal.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications.ContactSettingLoadResult;
import com.google.android.gms.games.Notifications.GameMuteStatusChangeResult;
import com.google.android.gms.games.Notifications.GameMuteStatusLoadResult;
import com.google.android.gms.games.Notifications.InboxCountResult;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class NotificationsImpl implements Notifications {
    static abstract class ContactSettingLoadImpl extends BaseGamesApiMethodImpl {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzah(x0);
        }

        public ContactSettingLoadResult zzah(Status status0) {
            return new ContactSettingLoadResult() {
                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class ContactSettingUpdateImpl extends BaseGamesApiMethodImpl {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return x0;
        }

        public Status zzb(Status status0) [...] // Inlined contents
    }

    static abstract class InboxCountImpl extends BaseGamesApiMethodImpl {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzai(x0);
        }

        public InboxCountResult zzai(Status status0) {
            return new InboxCountResult() {
                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    @Override  // com.google.android.gms.games.Notifications
    public void clear(GoogleApiClient apiClient, int notificationTypes) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzfD(notificationTypes);
        }
    }

    @Override  // com.google.android.gms.games.Notifications
    public void clearAll(GoogleApiClient apiClient) {
        this.clear(apiClient, 0x1F);
    }

    class com.google.android.gms.games.internal.api.NotificationsImpl.1 extends BaseGamesApiMethodImpl {
        final String zzarm;

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzaf(x0);
        }

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzd(this, this.zzarm, true);
        }

        public GameMuteStatusChangeResult zzaf(Status status0) {
            return new GameMuteStatusChangeResult() {
                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }


    class com.google.android.gms.games.internal.api.NotificationsImpl.2 extends BaseGamesApiMethodImpl {
        final String zzarm;

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzaf(x0);
        }

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzd(this, this.zzarm, false);
        }

        public GameMuteStatusChangeResult zzaf(Status status0) {
            return new GameMuteStatusChangeResult() {
                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }


    class com.google.android.gms.games.internal.api.NotificationsImpl.3 extends BaseGamesApiMethodImpl {
        final String zzarm;

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzag(x0);
        }

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzo(this, this.zzarm);
        }

        public GameMuteStatusLoadResult zzag(Status status0) {
            return new GameMuteStatusLoadResult() {
                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }


    class com.google.android.gms.games.internal.api.NotificationsImpl.4 extends ContactSettingLoadImpl {
        final boolean zzaqy;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzh(this, this.zzaqy);
        }
    }


    class com.google.android.gms.games.internal.api.NotificationsImpl.5 extends ContactSettingUpdateImpl {
        final boolean zzarq;
        final Bundle zzarr;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, this.zzarq, this.zzarr);
        }
    }


    class com.google.android.gms.games.internal.api.NotificationsImpl.6 extends InboxCountImpl {
        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzh(this);
        }
    }

}

