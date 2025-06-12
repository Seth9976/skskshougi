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
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests.AcceptQuestResult;
import com.google.android.gms.games.quest.Quests.ClaimMilestoneResult;
import com.google.android.gms.games.quest.Quests.LoadQuestsResult;
import com.google.android.gms.games.quest.Quests;

public final class QuestsImpl implements Quests {
    static abstract class AcceptImpl extends BaseGamesApiMethodImpl {
        private AcceptImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        AcceptImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.QuestsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzan(x0);
        }

        public AcceptQuestResult zzan(Status status0) {
            return new AcceptQuestResult() {
                @Override  // com.google.android.gms.games.quest.Quests$AcceptQuestResult
                public Quest getQuest() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class ClaimImpl extends BaseGamesApiMethodImpl {
        private ClaimImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        ClaimImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.QuestsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzao(x0);
        }

        public ClaimMilestoneResult zzao(Status status0) {
            return new ClaimMilestoneResult() {
                @Override  // com.google.android.gms.games.quest.Quests$ClaimMilestoneResult
                public Milestone getMilestone() {
                    return null;
                }

                @Override  // com.google.android.gms.games.quest.Quests$ClaimMilestoneResult
                public Quest getQuest() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class LoadsImpl extends BaseGamesApiMethodImpl {
        private LoadsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        LoadsImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.QuestsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzap(x0);
        }

        public LoadQuestsResult zzap(Status status0) {
            return new LoadQuestsResult() {
                @Override  // com.google.android.gms.games.quest.Quests$LoadQuestsResult
                public QuestBuffer getQuests() {
                    return new QuestBuffer(DataHolder.zzbi(status0.getStatusCode()));
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

    @Override  // com.google.android.gms.games.quest.Quests
    public PendingResult accept(GoogleApiClient apiClient, String questId) {
        return apiClient.zzb(new AcceptImpl(apiClient, questId) {
            final String zzarF;
            final QuestsImpl zzarG;

            {
                QuestsImpl.this = questsImpl0;
                this.zzarF = s;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzh(this, this.zzarF);
            }
        });
    }

    @Override  // com.google.android.gms.games.quest.Quests
    public PendingResult claim(GoogleApiClient apiClient, String questId, String milestoneId) {
        return apiClient.zzb(new ClaimImpl(apiClient, questId, milestoneId) {
            final String zzarF;
            final QuestsImpl zzarG;
            final String zzarH;

            {
                QuestsImpl.this = questsImpl0;
                this.zzarF = s;
                this.zzarH = s1;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzb(this, this.zzarF, this.zzarH);
            }
        });
    }

    @Override  // com.google.android.gms.games.quest.Quests
    public Intent getQuestIntent(GoogleApiClient apiClient, String questId) {
        return Games.zzd(apiClient).zzcO(questId);
    }

    @Override  // com.google.android.gms.games.quest.Quests
    public Intent getQuestsIntent(GoogleApiClient apiClient, int[] questSelectors) {
        return Games.zzd(apiClient).zzb(questSelectors);
    }

    @Override  // com.google.android.gms.games.quest.Quests
    public PendingResult load(GoogleApiClient apiClient, int[] questSelectors, int sortOrder, boolean forceReload) {
        return apiClient.zza(new LoadsImpl(apiClient, questSelectors, sortOrder, forceReload) {
            final int zzaqV;
            final boolean zzaqy;
            final QuestsImpl zzarG;
            final int[] zzarI;

            {
                QuestsImpl.this = questsImpl0;
                this.zzarI = arr_v;
                this.zzaqV = v;
                this.zzaqy = z;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzarI, this.zzaqV, this.zzaqy);
            }
        });
    }

    @Override  // com.google.android.gms.games.quest.Quests
    public PendingResult loadByIds(GoogleApiClient apiClient, boolean forceReload, String[] questIds) {
        return apiClient.zza(new LoadsImpl(apiClient, forceReload, questIds) {
            final boolean zzaqy;
            final QuestsImpl zzarG;
            final String[] zzarJ;

            {
                QuestsImpl.this = questsImpl0;
                this.zzaqy = z;
                this.zzarJ = arr_s;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzb(this, this.zzaqy, this.zzarJ);
            }
        });
    }

    @Override  // com.google.android.gms.games.quest.Quests
    public void registerQuestUpdateListener(GoogleApiClient apiClient, QuestUpdateListener listener) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzc(apiClient.zzo(listener));
        }
    }

    @Override  // com.google.android.gms.games.quest.Quests
    public void showStateChangedPopup(GoogleApiClient apiClient, String questId) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzcP(questId);
        }
    }

    @Override  // com.google.android.gms.games.quest.Quests
    public void unregisterQuestUpdateListener(GoogleApiClient apiClient) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzsF();
        }
    }

    class com.google.android.gms.games.internal.api.QuestsImpl.5 extends LoadsImpl {
        final String zzaqA;
        final int zzaqV;
        final boolean zzaqy;
        final int[] zzarI;
        final String zzarK;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, this.zzaqA, this.zzarK, this.zzarI, this.zzaqV, this.zzaqy);
        }
    }


    class com.google.android.gms.games.internal.api.QuestsImpl.6 extends LoadsImpl {
        final String zzaqA;
        final boolean zzaqy;
        final String[] zzarJ;
        final String zzarK;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, this.zzaqA, this.zzarK, this.zzaqy, this.zzarJ);
        }
    }

}

