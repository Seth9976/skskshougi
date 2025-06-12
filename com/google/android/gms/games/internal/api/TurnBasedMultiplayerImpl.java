package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import java.util.List;

public final class TurnBasedMultiplayerImpl implements TurnBasedMultiplayer {
    static abstract class CancelMatchImpl extends BaseGamesApiMethodImpl {
        private final String zzKI;

        public CancelMatchImpl(String id, GoogleApiClient googleApiClient) {
            super(googleApiClient);
            this.zzKI = id;
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzay(x0);
        }

        public CancelMatchResult zzay(Status status0) {
            return new CancelMatchResult() {
                @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer$CancelMatchResult
                public String getMatchId() {
                    return CancelMatchImpl.this.zzKI;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class InitiateMatchImpl extends BaseGamesApiMethodImpl {
        private InitiateMatchImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        InitiateMatchImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzaz(x0);
        }

        public InitiateMatchResult zzaz(Status status0) {
            return new InitiateMatchResult() {
                @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer$InitiateMatchResult
                public TurnBasedMatch getMatch() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class LeaveMatchImpl extends BaseGamesApiMethodImpl {
        private LeaveMatchImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        LeaveMatchImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzaA(x0);
        }

        public LeaveMatchResult zzaA(Status status0) {
            return new LeaveMatchResult() {
                @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer$LeaveMatchResult
                public TurnBasedMatch getMatch() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class LoadMatchImpl extends BaseGamesApiMethodImpl {
        private LoadMatchImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        LoadMatchImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzaB(x0);
        }

        public LoadMatchResult zzaB(Status status0) {
            return new LoadMatchResult() {
                @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer$LoadMatchResult
                public TurnBasedMatch getMatch() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class LoadMatchesImpl extends BaseGamesApiMethodImpl {
        private LoadMatchesImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        LoadMatchesImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzaC(x0);
        }

        public LoadMatchesResult zzaC(Status status0) {
            return new LoadMatchesResult() {
                @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer$LoadMatchesResult
                public LoadMatchesResponse getMatches() {
                    return new LoadMatchesResponse(new Bundle());
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

    static abstract class UpdateMatchImpl extends BaseGamesApiMethodImpl {
        private UpdateMatchImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        UpdateMatchImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzaD(x0);
        }

        public UpdateMatchResult zzaD(Status status0) {
            return new UpdateMatchResult() {
                @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer$UpdateMatchResult
                public TurnBasedMatch getMatch() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult acceptInvitation(GoogleApiClient apiClient, String invitationId) {
        return apiClient.zzb(new InitiateMatchImpl(apiClient, invitationId) {
            final String zzaqX;
            final TurnBasedMultiplayerImpl zzasp;

            {
                TurnBasedMultiplayerImpl.this = turnBasedMultiplayerImpl0;
                this.zzaqX = s;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzd(this, this.zzaqX);
            }
        });
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult cancelMatch(GoogleApiClient apiClient, String matchId) {
        return apiClient.zzb(new CancelMatchImpl(matchId, apiClient) {
            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzf(this, matchId);
            }
        });
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult createMatch(GoogleApiClient apiClient, TurnBasedMatchConfig config) {
        return apiClient.zzb(new InitiateMatchImpl(apiClient, config) {
            final TurnBasedMatchConfig zzaso;
            final TurnBasedMultiplayerImpl zzasp;

            {
                TurnBasedMultiplayerImpl.this = turnBasedMultiplayerImpl0;
                this.zzaso = turnBasedMatchConfig0;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzaso);
            }
        });
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public void declineInvitation(GoogleApiClient apiClient, String invitationId) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzr(invitationId, 1);
        }
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public void dismissInvitation(GoogleApiClient apiClient, String invitationId) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzq(invitationId, 1);
        }
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public void dismissMatch(GoogleApiClient apiClient, String matchId) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzcN(matchId);
        }
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult finishMatch(GoogleApiClient apiClient, String matchId) {
        return this.finishMatch(apiClient, matchId, null, null);
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult finishMatch(GoogleApiClient apiClient, String matchId, byte[] matchData, List list0) {
        return list0 == null ? this.finishMatch(apiClient, matchId, matchData, null) : this.finishMatch(apiClient, matchId, matchData, ((ParticipantResult[])list0.toArray(new ParticipantResult[list0.size()])));
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult finishMatch(GoogleApiClient apiClient, String matchId, byte[] matchData, ParticipantResult[] results) {
        return apiClient.zzb(new UpdateMatchImpl(apiClient, matchId, matchData, results) {
            final TurnBasedMultiplayerImpl zzasp;
            final String zzasq;
            final byte[] zzast;
            final ParticipantResult[] zzasv;

            {
                TurnBasedMultiplayerImpl.this = turnBasedMultiplayerImpl0;
                this.zzasq = s;
                this.zzast = arr_b;
                this.zzasv = arr_participantResult;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzasq, this.zzast, this.zzasv);
            }
        });
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public Intent getInboxIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsB();
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public int getMaxMatchDataSize(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsL();
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public Intent getSelectOpponentsIntent(GoogleApiClient apiClient, int minPlayers, int maxPlayers) {
        return Games.zzd(apiClient).zzb(minPlayers, maxPlayers, true);
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public Intent getSelectOpponentsIntent(GoogleApiClient apiClient, int minPlayers, int maxPlayers, boolean allowAutomatch) {
        return Games.zzd(apiClient).zzb(minPlayers, maxPlayers, allowAutomatch);
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult leaveMatch(GoogleApiClient apiClient, String matchId) {
        return apiClient.zzb(new LeaveMatchImpl(apiClient, matchId) {
            final TurnBasedMultiplayerImpl zzasp;
            final String zzasq;

            {
                TurnBasedMultiplayerImpl.this = turnBasedMultiplayerImpl0;
                this.zzasq = s;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zze(this, this.zzasq);
            }
        });
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult leaveMatchDuringTurn(GoogleApiClient apiClient, String matchId, String pendingParticipantId) {
        return apiClient.zzb(new LeaveMatchImpl(apiClient, matchId, pendingParticipantId) {
            final TurnBasedMultiplayerImpl zzasp;
            final String zzasq;
            final String zzasu;

            {
                TurnBasedMultiplayerImpl.this = turnBasedMultiplayerImpl0;
                this.zzasq = s;
                this.zzasu = s1;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzasq, this.zzasu);
            }
        });
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult loadMatch(GoogleApiClient apiClient, String matchId) {
        return apiClient.zza(new LoadMatchImpl(apiClient, matchId) {
            final TurnBasedMultiplayerImpl zzasp;
            final String zzasq;

            {
                TurnBasedMultiplayerImpl.this = turnBasedMultiplayerImpl0;
                this.zzasq = s;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzg(this, this.zzasq);
            }
        });
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult loadMatchesByStatus(GoogleApiClient apiClient, int invitationSortOrder, int[] matchTurnStatuses) {
        return apiClient.zza(new LoadMatchesImpl(apiClient, invitationSortOrder, matchTurnStatuses) {
            final TurnBasedMultiplayerImpl zzasp;
            final int zzasr;
            final int[] zzass;

            {
                TurnBasedMultiplayerImpl.this = turnBasedMultiplayerImpl0;
                this.zzasr = v;
                this.zzass = arr_v;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzasr, this.zzass);
            }
        });
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult loadMatchesByStatus(GoogleApiClient apiClient, int[] matchTurnStatuses) {
        return this.loadMatchesByStatus(apiClient, 0, matchTurnStatuses);
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public void registerMatchUpdateListener(GoogleApiClient apiClient, OnTurnBasedMatchUpdateReceivedListener listener) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzb(apiClient.zzo(listener));
        }
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult rematch(GoogleApiClient apiClient, String matchId) {
        return apiClient.zzb(new InitiateMatchImpl(apiClient, matchId) {
            final TurnBasedMultiplayerImpl zzasp;
            final String zzasq;

            {
                TurnBasedMultiplayerImpl.this = turnBasedMultiplayerImpl0;
                this.zzasq = s;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzc(this, this.zzasq);
            }
        });
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult takeTurn(GoogleApiClient apiClient, String matchId, byte[] matchData, String pendingParticipantId) {
        return this.takeTurn(apiClient, matchId, matchData, pendingParticipantId, null);
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult takeTurn(GoogleApiClient apiClient, String matchId, byte[] matchData, String pendingParticipantId, List list0) {
        return list0 == null ? this.takeTurn(apiClient, matchId, matchData, pendingParticipantId, null) : this.takeTurn(apiClient, matchId, matchData, pendingParticipantId, ((ParticipantResult[])list0.toArray(new ParticipantResult[list0.size()])));
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public PendingResult takeTurn(GoogleApiClient apiClient, String matchId, byte[] matchData, String pendingParticipantId, ParticipantResult[] results) {
        return apiClient.zzb(new UpdateMatchImpl(apiClient, matchId, matchData, pendingParticipantId, results) {
            final TurnBasedMultiplayerImpl zzasp;
            final String zzasq;
            final byte[] zzast;
            final String zzasu;
            final ParticipantResult[] zzasv;

            {
                TurnBasedMultiplayerImpl.this = turnBasedMultiplayerImpl0;
                this.zzasq = s;
                this.zzast = arr_b;
                this.zzasu = s1;
                this.zzasv = arr_participantResult;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzasq, this.zzast, this.zzasu, this.zzasv);
            }
        });
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer
    public void unregisterMatchUpdateListener(GoogleApiClient apiClient) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzsE();
        }
    }

    class com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.11 extends InitiateMatchImpl {
        final String zzaqA;
        final String zzasq;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzc(this, this.zzaqA, this.zzasq);
        }
    }


    class com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.12 extends InitiateMatchImpl {
        final String zzaqA;
        final String zzasq;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzd(this, this.zzaqA, this.zzasq);
        }
    }


    class com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl.13 extends LoadMatchesImpl {
        final String zzaqA;
        final int zzasr;
        final int[] zzass;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, this.zzaqA, this.zzasr, this.zzass);
        }
    }

}

