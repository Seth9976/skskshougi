package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events.LoadEventsResult;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class EventsImpl implements Events {
    static abstract class LoadImpl extends BaseGamesApiMethodImpl {
        private LoadImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        LoadImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.EventsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzW(x0);
        }

        public LoadEventsResult zzW(Status status0) {
            return new LoadEventsResult() {
                @Override  // com.google.android.gms.games.event.Events$LoadEventsResult
                public EventBuffer getEvents() {
                    return new EventBuffer(DataHolder.zzbi(14));
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
        private UpdateImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        UpdateImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.EventsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status status) {
            return new Result() {
                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    @Override  // com.google.android.gms.games.event.Events
    public void increment(GoogleApiClient apiClient, String eventId, int incrementAmount) {
        GamesClientImpl gamesClientImpl0 = Games.zzc(apiClient, false);
        if(gamesClientImpl0 == null) {
            return;
        }
        if(gamesClientImpl0.isConnected()) {
            gamesClientImpl0.zzp(eventId, incrementAmount);
            return;
        }
        apiClient.zzb(new UpdateImpl(apiClient, eventId, incrementAmount) {
            final EventsImpl zzaqL;
            final String zzaqM;
            final int zzaqN;

            {
                EventsImpl.this = eventsImpl0;
                this.zzaqM = s;
                this.zzaqN = v;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            public void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            public void zza(GamesClientImpl gamesClientImpl0) {
                gamesClientImpl0.zzp(this.zzaqM, this.zzaqN);
            }
        });
    }

    @Override  // com.google.android.gms.games.event.Events
    public PendingResult load(GoogleApiClient apiClient, boolean forceReload) {
        return apiClient.zza(new LoadImpl(apiClient, forceReload) {
            final EventsImpl zzaqL;
            final boolean zzaqy;

            {
                EventsImpl.this = eventsImpl0;
                this.zzaqy = z;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            public void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            public void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzd(this, this.zzaqy);
            }
        });
    }

    @Override  // com.google.android.gms.games.event.Events
    public PendingResult loadByIds(GoogleApiClient apiClient, boolean forceReload, String[] eventIds) {
        return apiClient.zza(new LoadImpl(apiClient, forceReload, eventIds) {
            final String[] zzaqK;
            final EventsImpl zzaqL;
            final boolean zzaqy;

            {
                EventsImpl.this = eventsImpl0;
                this.zzaqy = z;
                this.zzaqK = arr_s;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            public void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            public void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzaqy, this.zzaqK);
            }
        });
    }
}

