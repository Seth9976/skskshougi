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
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

public final class LeaderboardsImpl implements Leaderboards {
    static abstract class LoadMetadataImpl extends BaseGamesApiMethodImpl {
        private LoadMetadataImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        LoadMetadataImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.LeaderboardsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzab(x0);
        }

        public LeaderboardMetadataResult zzab(Status status0) {
            return new LeaderboardMetadataResult() {
                @Override  // com.google.android.gms.games.leaderboard.Leaderboards$LeaderboardMetadataResult
                public LeaderboardBuffer getLeaderboards() {
                    return new LeaderboardBuffer(DataHolder.zzbi(14));
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

    static abstract class LoadPlayerScoreImpl extends BaseGamesApiMethodImpl {
        private LoadPlayerScoreImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        LoadPlayerScoreImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.LeaderboardsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzac(x0);
        }

        public LoadPlayerScoreResult zzac(Status status0) {
            return new LoadPlayerScoreResult() {
                @Override  // com.google.android.gms.games.leaderboard.Leaderboards$LoadPlayerScoreResult
                public LeaderboardScore getScore() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class LoadScoresImpl extends BaseGamesApiMethodImpl {
        private LoadScoresImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        LoadScoresImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.LeaderboardsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzad(x0);
        }

        public LoadScoresResult zzad(Status status0) {
            return new LoadScoresResult() {
                @Override  // com.google.android.gms.games.leaderboard.Leaderboards$LoadScoresResult
                public Leaderboard getLeaderboard() {
                    return null;
                }

                @Override  // com.google.android.gms.games.leaderboard.Leaderboards$LoadScoresResult
                public LeaderboardScoreBuffer getScores() {
                    return new LeaderboardScoreBuffer(DataHolder.zzbi(14));
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

    public static abstract class SubmitScoreImpl extends BaseGamesApiMethodImpl {
        protected SubmitScoreImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzae(x0);
        }

        public SubmitScoreResult zzae(Status status0) {
            return new SubmitScoreResult() {
                @Override  // com.google.android.gms.games.leaderboard.Leaderboards$SubmitScoreResult
                public ScoreSubmissionData getScoreData() {
                    return new ScoreSubmissionData(DataHolder.zzbi(14));
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

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public Intent getAllLeaderboardsIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsz();
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public Intent getLeaderboardIntent(GoogleApiClient apiClient, String leaderboardId) {
        return this.getLeaderboardIntent(apiClient, leaderboardId, -1);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public Intent getLeaderboardIntent(GoogleApiClient apiClient, String leaderboardId, int timeSpan) {
        return Games.zzd(apiClient).zzo(leaderboardId, timeSpan);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public PendingResult loadCurrentPlayerLeaderboardScore(GoogleApiClient apiClient, String leaderboardId, int span, int leaderboardCollection) {
        return apiClient.zza(new LoadPlayerScoreImpl(apiClient, leaderboardId, span, leaderboardCollection) {
            final LeaderboardsImpl zzaqZ;
            final String zzara;
            final int zzarb;
            final int zzarc;

            {
                LeaderboardsImpl.this = leaderboardsImpl0;
                this.zzara = s;
                this.zzarb = v;
                this.zzarc = v1;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, null, this.zzara, this.zzarb, this.zzarc);
            }
        });
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public PendingResult loadLeaderboardMetadata(GoogleApiClient apiClient, String leaderboardId, boolean forceReload) {
        return apiClient.zza(new LoadMetadataImpl(apiClient, leaderboardId, forceReload) {
            final LeaderboardsImpl zzaqZ;
            final boolean zzaqy;
            final String zzara;

            {
                LeaderboardsImpl.this = leaderboardsImpl0;
                this.zzara = s;
                this.zzaqy = z;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzb(this, this.zzara, this.zzaqy);
            }
        });
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public PendingResult loadLeaderboardMetadata(GoogleApiClient apiClient, boolean forceReload) {
        return apiClient.zza(new LoadMetadataImpl(apiClient, forceReload) {
            final LeaderboardsImpl zzaqZ;
            final boolean zzaqy;

            {
                LeaderboardsImpl.this = leaderboardsImpl0;
                this.zzaqy = z;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzb(this, this.zzaqy);
            }
        });
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public PendingResult loadMoreScores(GoogleApiClient apiClient, LeaderboardScoreBuffer buffer, int maxResults, int pageDirection) {
        return apiClient.zza(new LoadScoresImpl(apiClient, buffer, maxResults, pageDirection) {
            final LeaderboardsImpl zzaqZ;
            final int zzard;
            final LeaderboardScoreBuffer zzare;
            final int zzarf;

            {
                LeaderboardsImpl.this = leaderboardsImpl0;
                this.zzare = leaderboardScoreBuffer0;
                this.zzard = v;
                this.zzarf = v1;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzare, this.zzard, this.zzarf);
            }
        });
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public PendingResult loadPlayerCenteredScores(GoogleApiClient apiClient, String leaderboardId, int span, int leaderboardCollection, int maxResults) {
        return this.loadPlayerCenteredScores(apiClient, leaderboardId, span, leaderboardCollection, maxResults, false);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public PendingResult loadPlayerCenteredScores(GoogleApiClient apiClient, String leaderboardId, int span, int leaderboardCollection, int maxResults, boolean forceReload) {
        return apiClient.zza(new LoadScoresImpl(apiClient, leaderboardId, span, leaderboardCollection, maxResults, forceReload) {
            final LeaderboardsImpl zzaqZ;
            final boolean zzaqy;
            final String zzara;
            final int zzarb;
            final int zzarc;
            final int zzard;

            {
                LeaderboardsImpl.this = leaderboardsImpl0;
                this.zzara = s;
                this.zzarb = v;
                this.zzarc = v1;
                this.zzard = v2;
                this.zzaqy = z;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzb(this, this.zzara, this.zzarb, this.zzarc, this.zzard, this.zzaqy);
            }
        });
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public PendingResult loadTopScores(GoogleApiClient apiClient, String leaderboardId, int span, int leaderboardCollection, int maxResults) {
        return this.loadTopScores(apiClient, leaderboardId, span, leaderboardCollection, maxResults, false);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public PendingResult loadTopScores(GoogleApiClient apiClient, String leaderboardId, int span, int leaderboardCollection, int maxResults, boolean forceReload) {
        return apiClient.zza(new LoadScoresImpl(apiClient, leaderboardId, span, leaderboardCollection, maxResults, forceReload) {
            final LeaderboardsImpl zzaqZ;
            final boolean zzaqy;
            final String zzara;
            final int zzarb;
            final int zzarc;
            final int zzard;

            {
                LeaderboardsImpl.this = leaderboardsImpl0;
                this.zzara = s;
                this.zzarb = v;
                this.zzarc = v1;
                this.zzard = v2;
                this.zzaqy = z;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzara, this.zzarb, this.zzarc, this.zzard, this.zzaqy);
            }
        });
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public void submitScore(GoogleApiClient apiClient, String leaderboardId, long score) {
        this.submitScore(apiClient, leaderboardId, score, null);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public void submitScore(GoogleApiClient apiClient, String leaderboardId, long score, String scoreTag) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            try {
                gamesClientImpl0.zza(null, leaderboardId, score, scoreTag);
            }
            catch(RemoteException unused_ex) {
                GamesLog.zzu("LeaderboardsImpl", "service died");
            }
        }
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public PendingResult submitScoreImmediate(GoogleApiClient apiClient, String leaderboardId, long score) {
        return this.submitScoreImmediate(apiClient, leaderboardId, score, null);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboards
    public PendingResult submitScoreImmediate(GoogleApiClient apiClient, String leaderboardId, long score, String scoreTag) {
        return apiClient.zzb(new SubmitScoreImpl(apiClient) {
            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, leaderboardId, score, scoreTag);
            }
        });
    }

    class com.google.android.gms.games.internal.api.LeaderboardsImpl.10 extends LoadScoresImpl {
        final String zzaqA;
        final boolean zzaqy;
        final String zzara;
        final int zzarb;
        final int zzarc;
        final int zzard;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, this.zzaqA, this.zzara, this.zzarb, this.zzarc, this.zzard, this.zzaqy);
        }
    }


    class com.google.android.gms.games.internal.api.LeaderboardsImpl.11 extends LoadScoresImpl {
        final String zzaqA;
        final boolean zzaqy;
        final String zzara;
        final int zzarb;
        final int zzarc;
        final int zzard;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzb(this, this.zzaqA, this.zzara, this.zzarb, this.zzarc, this.zzard, this.zzaqy);
        }
    }


    class com.google.android.gms.games.internal.api.LeaderboardsImpl.8 extends LoadMetadataImpl {
        final String zzaqA;
        final boolean zzaqy;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzc(this, this.zzaqA, this.zzaqy);
        }
    }


    class com.google.android.gms.games.internal.api.LeaderboardsImpl.9 extends LoadMetadataImpl {
        final String zzaqA;
        final boolean zzaqy;
        final String zzara;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, this.zzaqA, this.zzara, this.zzaqy);
        }
    }

}

