package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.Players.LoadPlayersResult;
import com.google.android.gms.games.Players.LoadProfileSettingsResult;
import com.google.android.gms.games.Players.LoadXpForGameCategoriesResult;
import com.google.android.gms.games.Players.LoadXpStreamResult;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class PlayersImpl implements Players {
    static abstract class LoadPlayersImpl extends BaseGamesApiMethodImpl {
        private LoadPlayersImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        LoadPlayersImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.PlayersImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzaj(x0);
        }

        public LoadPlayersResult zzaj(Status status0) {
            return new LoadPlayersResult() {
                @Override  // com.google.android.gms.games.Players$LoadPlayersResult
                public PlayerBuffer getPlayers() {
                    return new PlayerBuffer(DataHolder.zzbi(14));
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

    static abstract class LoadProfileSettingsResultImpl extends BaseGamesApiMethodImpl {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return this.zzak(x0);
        }

        protected LoadProfileSettingsResult zzak(Status status0) {
            return new LoadProfileSettingsResult() {
                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }

                @Override  // com.google.android.gms.games.Players$LoadProfileSettingsResult
                public boolean isProfileVisible() {
                    return true;
                }

                @Override  // com.google.android.gms.games.Players$LoadProfileSettingsResult
                public boolean isVisibilityExplicitlySet() {
                    return false;
                }
            };
        }
    }

    static abstract class LoadXpForGameCategoriesResultImpl extends BaseGamesApiMethodImpl {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzal(x0);
        }

        public LoadXpForGameCategoriesResult zzal(Status status0) {
            return new LoadXpForGameCategoriesResult() {
                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class LoadXpStreamResultImpl extends BaseGamesApiMethodImpl {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzam(x0);
        }

        public LoadXpStreamResult zzam(Status status0) {
            return new LoadXpStreamResult() {
                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class UpdateProfileSettingsResultImpl extends BaseGamesApiMethodImpl {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return x0;
        }

        protected Status zzb(Status status0) [...] // Inlined contents
    }

    @Override  // com.google.android.gms.games.Players
    public Intent getCompareProfileIntent(GoogleApiClient apiClient, Player player) {
        return Games.zzd(apiClient).zza(new PlayerEntity(player));
    }

    @Override  // com.google.android.gms.games.Players
    public Player getCurrentPlayer(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsx();
    }

    @Override  // com.google.android.gms.games.Players
    public String getCurrentPlayerId(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsw();
    }

    @Override  // com.google.android.gms.games.Players
    public Intent getPlayerSearchIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsH();
    }

    @Override  // com.google.android.gms.games.Players
    public PendingResult loadConnectedPlayers(GoogleApiClient apiClient, boolean forceReload) {
        return apiClient.zza(new LoadPlayersImpl(apiClient, forceReload) {
            final boolean zzaqy;
            final PlayersImpl zzaru;

            {
                PlayersImpl.this = playersImpl0;
                this.zzaqy = z;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzaqy);
            }
        });
    }

    @Override  // com.google.android.gms.games.Players
    public PendingResult loadInvitablePlayers(GoogleApiClient apiClient, int pageSize, boolean forceReload) {
        return apiClient.zza(new LoadPlayersImpl(apiClient, pageSize, forceReload) {
            final boolean zzaqy;
            final PlayersImpl zzaru;
            final int zzarv;

            {
                PlayersImpl.this = playersImpl0;
                this.zzarv = v;
                this.zzaqy = z;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzarv, false, this.zzaqy);
            }
        });
    }

    @Override  // com.google.android.gms.games.Players
    public PendingResult loadMoreInvitablePlayers(GoogleApiClient apiClient, int pageSize) {
        return apiClient.zza(new LoadPlayersImpl(apiClient, pageSize) {
            final PlayersImpl zzaru;
            final int zzarv;

            {
                PlayersImpl.this = playersImpl0;
                this.zzarv = v;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzarv, true, false);
            }
        });
    }

    @Override  // com.google.android.gms.games.Players
    public PendingResult loadMoreRecentlyPlayedWithPlayers(GoogleApiClient apiClient, int pageSize) {
        return apiClient.zza(new LoadPlayersImpl(apiClient, pageSize) {
            final PlayersImpl zzaru;
            final int zzarv;

            {
                PlayersImpl.this = playersImpl0;
                this.zzarv = v;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, "played_with", this.zzarv, true, false);
            }
        });
    }

    @Override  // com.google.android.gms.games.Players
    public PendingResult loadPlayer(GoogleApiClient apiClient, String playerId) {
        return apiClient.zza(new LoadPlayersImpl(apiClient, playerId) {
            final String zzTE;
            final PlayersImpl zzaru;

            {
                PlayersImpl.this = playersImpl0;
                this.zzTE = s;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzTE, false);
            }
        });
    }

    @Override  // com.google.android.gms.games.Players
    public PendingResult loadPlayer(GoogleApiClient apiClient, String playerId, boolean forceReload) {
        return apiClient.zza(new LoadPlayersImpl(apiClient, playerId, forceReload) {
            final String zzTE;
            final boolean zzaqy;
            final PlayersImpl zzaru;

            {
                PlayersImpl.this = playersImpl0;
                this.zzTE = s;
                this.zzaqy = z;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzTE, this.zzaqy);
            }
        });
    }

    @Override  // com.google.android.gms.games.Players
    public PendingResult loadRecentlyPlayedWithPlayers(GoogleApiClient apiClient, int pageSize, boolean forceReload) {
        return apiClient.zza(new LoadPlayersImpl(apiClient, pageSize, forceReload) {
            final boolean zzaqy;
            final PlayersImpl zzaru;
            final int zzarv;

            {
                PlayersImpl.this = playersImpl0;
                this.zzarv = v;
                this.zzaqy = z;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, "played_with", this.zzarv, false, this.zzaqy);
            }
        });
    }

    class com.google.android.gms.games.internal.api.PlayersImpl.10 extends LoadPlayersImpl {
        final String zzaqA;
        final int zzarv;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, "nearby", this.zzaqA, this.zzarv, true, false);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.11 extends LoadPlayersImpl {
        final String zzaqA;
        final boolean zzaqy;
        final int zzarv;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, "played_with", this.zzaqA, this.zzarv, false, this.zzaqy);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.12 extends LoadPlayersImpl {
        final String zzaqA;
        final int zzarv;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, "played_with", this.zzaqA, this.zzarv, true, false);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.13 extends LoadPlayersImpl {
        final boolean zzaqy;
        final int zzarv;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzb(this, this.zzarv, false, this.zzaqy);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.14 extends LoadPlayersImpl {
        final int zzarv;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzb(this, this.zzarv, true, false);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.15 extends LoadPlayersImpl {
        final boolean zzaqy;
        final int zzarv;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzc(this, this.zzarv, false, this.zzaqy);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.16 extends LoadPlayersImpl {
        final int zzarv;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzc(this, this.zzarv, true, false);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.17 extends LoadPlayersImpl {
        final boolean zzaqy;
        final int zzarv;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzd(this, this.zzarv, false, this.zzaqy);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.18 extends LoadPlayersImpl {
        final int zzarv;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzd(this, this.zzarv, true, false);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.19 extends LoadPlayersImpl {
        final String zzaqR;
        final boolean zzaqy;
        final int zzarv;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzb(this, this.zzaqR, this.zzarv, false, this.zzaqy);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.20 extends LoadPlayersImpl {
        final String zzaqR;
        final int zzarv;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzb(this, this.zzaqR, this.zzarv, true, false);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.21 extends LoadPlayersImpl {
        final boolean zzaqy;
        final String zzarm;
        final int zzarv;
        final String zzarw;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzb(this, this.zzarw, this.zzarm, this.zzarv, false, this.zzaqy);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.22 extends LoadPlayersImpl {
        final String zzarm;
        final int zzarv;
        final String zzarw;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzb(this, this.zzarw, this.zzarm, this.zzarv, true, false);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.23 extends LoadXpForGameCategoriesResultImpl {
        final String zzarx;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzl(this, this.zzarx);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.24 extends LoadXpStreamResultImpl {
        final String zzarx;
        final int zzary;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzc(this, this.zzarx, this.zzary);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.25 extends LoadXpStreamResultImpl {
        final String zzarx;
        final int zzary;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzd(this, this.zzarx, this.zzary);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.26 extends LoadProfileSettingsResultImpl {
        final boolean zzaqy;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzf(this, this.zzaqy);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.27 extends UpdateProfileSettingsResultImpl {
        final boolean zzarz;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzg(this, this.zzarz);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.3 extends LoadPlayersImpl {
        final String[] zzarA;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, this.zzarA);
        }
    }


    class com.google.android.gms.games.internal.api.PlayersImpl.9 extends LoadPlayersImpl {
        final String zzaqA;
        final int zzarv;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, "nearby", this.zzaqA, this.zzarv, false, false);
        }
    }

}

