package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult;
import com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult;
import com.google.android.gms.games.GamesMetadata.LoadGamesResult;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class GamesMetadataImpl implements GamesMetadata {
    static abstract class LoadGameInstancesImpl extends BaseGamesApiMethodImpl {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzX(x0);
        }

        public LoadGameInstancesResult zzX(Status status0) {
            return new LoadGameInstancesResult() {
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

    static abstract class LoadGameSearchSuggestionsImpl extends BaseGamesApiMethodImpl {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzY(x0);
        }

        public LoadGameSearchSuggestionsResult zzY(Status status0) {
            return new LoadGameSearchSuggestionsResult() {
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

    static abstract class LoadGamesImpl extends BaseGamesApiMethodImpl {
        private LoadGamesImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        LoadGamesImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.GamesMetadataImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzZ(x0);
        }

        public LoadGamesResult zzZ(Status status0) {
            return new LoadGamesResult() {
                @Override  // com.google.android.gms.games.GamesMetadata$LoadGamesResult
                public GameBuffer getGames() {
                    return new GameBuffer(DataHolder.zzbi(14));
                }

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

    @Override  // com.google.android.gms.games.GamesMetadata
    public Game getCurrentGame(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsy();
    }

    @Override  // com.google.android.gms.games.GamesMetadata
    public PendingResult loadGame(GoogleApiClient apiClient) {
        return apiClient.zza(new LoadGamesImpl(apiClient) {
            final GamesMetadataImpl zzaqQ;

            {
                GamesMetadataImpl.this = gamesMetadataImpl0;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzf(this);
            }
        });
    }

    class com.google.android.gms.games.internal.api.GamesMetadataImpl.2 extends LoadGameInstancesImpl {
        final String zzaqA;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzj(this, this.zzaqA);
        }
    }


    class com.google.android.gms.games.internal.api.GamesMetadataImpl.3 extends LoadGameSearchSuggestionsImpl {
        final String zzaqR;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzk(this, this.zzaqR);
        }
    }

}

