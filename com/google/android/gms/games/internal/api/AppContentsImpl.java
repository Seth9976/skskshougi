package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class AppContentsImpl implements AppContents {
    static abstract class LoadsImpl extends BaseGamesApiMethodImpl {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzV(x0);
        }

        public LoadAppContentResult zzV(Status status0) {
            return new LoadAppContentResult() {
                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }

                @Override  // com.google.android.gms.common.api.Releasable
                public void release() {
                }
            };
        }
    }


    class com.google.android.gms.games.internal.api.AppContentsImpl.1 extends LoadsImpl {
        final int zzaqG;
        final String zzaqH;
        final String[] zzaqI;
        final boolean zzaqy;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, this.zzaqG, this.zzaqH, this.zzaqI, this.zzaqy);
        }
    }

}

