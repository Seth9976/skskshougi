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
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;
import com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class AchievementsImpl implements Achievements {
    static abstract class LoadImpl extends BaseGamesApiMethodImpl {
        private LoadImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        LoadImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.AchievementsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzQ(x0);
        }

        public LoadAchievementsResult zzQ(Status status0) {
            return new LoadAchievementsResult() {
                @Override  // com.google.android.gms.games.achievement.Achievements$LoadAchievementsResult
                public AchievementBuffer getAchievements() {
                    return new AchievementBuffer(DataHolder.zzbi(14));
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

    static abstract class UpdateImpl extends BaseGamesApiMethodImpl {
        private final String zzKI;

        public UpdateImpl(String id, GoogleApiClient googleApiClient) {
            super(googleApiClient);
            this.zzKI = id;
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzR(x0);
        }

        public UpdateAchievementResult zzR(Status status0) {
            return new UpdateAchievementResult() {
                @Override  // com.google.android.gms.games.achievement.Achievements$UpdateAchievementResult
                public String getAchievementId() {
                    return UpdateImpl.this.zzKI;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    @Override  // com.google.android.gms.games.achievement.Achievements
    public Intent getAchievementsIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsA();
    }

    @Override  // com.google.android.gms.games.achievement.Achievements
    public void increment(GoogleApiClient apiClient, String id, int numSteps) {
        apiClient.zzb(new UpdateImpl(id, apiClient) {
            public void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(null, id, numSteps);
            }
        });
    }

    @Override  // com.google.android.gms.games.achievement.Achievements
    public PendingResult incrementImmediate(GoogleApiClient apiClient, String id, int numSteps) {
        return apiClient.zzb(new UpdateImpl(id, apiClient) {
            public void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, id, numSteps);
            }
        });
    }

    @Override  // com.google.android.gms.games.achievement.Achievements
    public PendingResult load(GoogleApiClient apiClient, boolean forceReload) {
        return apiClient.zza(new LoadImpl(apiClient, forceReload) {
            final boolean zzaqy;
            final AchievementsImpl zzaqz;

            {
                AchievementsImpl.this = achievementsImpl0;
                this.zzaqy = z;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            public void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            public void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzc(this, this.zzaqy);
            }
        });
    }

    @Override  // com.google.android.gms.games.achievement.Achievements
    public void reveal(GoogleApiClient apiClient, String id) {
        apiClient.zzb(new UpdateImpl(id, apiClient) {
            public void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(null, id);
            }
        });
    }

    @Override  // com.google.android.gms.games.achievement.Achievements
    public PendingResult revealImmediate(GoogleApiClient apiClient, String id) {
        return apiClient.zzb(new UpdateImpl(id, apiClient) {
            public void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, id);
            }
        });
    }

    @Override  // com.google.android.gms.games.achievement.Achievements
    public void setSteps(GoogleApiClient apiClient, String id, int numSteps) {
        apiClient.zzb(new UpdateImpl(id, apiClient) {
            public void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzb(null, id, numSteps);
            }
        });
    }

    @Override  // com.google.android.gms.games.achievement.Achievements
    public PendingResult setStepsImmediate(GoogleApiClient apiClient, String id, int numSteps) {
        return apiClient.zzb(new UpdateImpl(id, apiClient) {
            public void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzb(this, id, numSteps);
            }
        });
    }

    @Override  // com.google.android.gms.games.achievement.Achievements
    public void unlock(GoogleApiClient apiClient, String id) {
        apiClient.zzb(new UpdateImpl(id, apiClient) {
            public void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzb(null, id);
            }
        });
    }

    @Override  // com.google.android.gms.games.achievement.Achievements
    public PendingResult unlockImmediate(GoogleApiClient apiClient, String id) {
        return apiClient.zzb(new UpdateImpl(id, apiClient) {
            public void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzb(this, id);
            }
        });
    }

    class com.google.android.gms.games.internal.api.AchievementsImpl.10 extends LoadImpl {
        final String zzTE;
        final String zzaqA;
        final boolean zzaqy;

        @Override  // com.google.android.gms.common.api.zza$zza
        public void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        public void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzb(this, this.zzTE, this.zzaqA, this.zzaqy);
        }
    }

}

