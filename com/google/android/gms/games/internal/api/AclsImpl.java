package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.game.Acls.LoadAclResult;
import com.google.android.gms.games.internal.game.Acls;

public final class AclsImpl implements Acls {
    static abstract class LoadNotifyAclImpl extends BaseGamesApiMethodImpl {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzU(x0);
        }

        public LoadAclResult zzU(Status status0) {
            return AclsImpl.zzS(status0);
        }
    }

    static abstract class UpdateNotifyAclImpl extends BaseGamesApiMethodImpl {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return x0;
        }

        public Status zzb(Status status0) [...] // Inlined contents
    }

    private static LoadAclResult zzS(Status status0) {
        return new LoadAclResult() {
            @Override  // com.google.android.gms.common.api.Result
            public Status getStatus() {
                return status0;
            }

            @Override  // com.google.android.gms.common.api.Releasable
            public void release() {
            }
        };
    }

    class com.google.android.gms.games.internal.api.AclsImpl.2 extends LoadNotifyAclImpl {
        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzg(this);
        }
    }


    class com.google.android.gms.games.internal.api.AclsImpl.3 extends UpdateNotifyAclImpl {
        final String zzaqF;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzn(this, this.zzaqF);
        }
    }

}

