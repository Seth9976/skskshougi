package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
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
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.request.Requests.LoadRequestSummariesResult;
import com.google.android.gms.games.request.Requests.LoadRequestsResult;
import com.google.android.gms.games.request.Requests.SendRequestResult;
import com.google.android.gms.games.request.Requests.UpdateRequestsResult;
import com.google.android.gms.games.request.Requests;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class RequestsImpl implements Requests {
    static abstract class LoadRequestSummariesImpl extends BaseGamesApiMethodImpl {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzaq(x0);
        }

        public LoadRequestSummariesResult zzaq(Status status0) {
            return new LoadRequestSummariesResult() {
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

    static abstract class LoadRequestsImpl extends BaseGamesApiMethodImpl {
        private LoadRequestsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        LoadRequestsImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.RequestsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzar(x0);
        }

        public LoadRequestsResult zzar(Status status0) {
            return new LoadRequestsResult() {
                @Override  // com.google.android.gms.games.request.Requests$LoadRequestsResult
                public GameRequestBuffer getRequests(int type) {
                    return new GameRequestBuffer(DataHolder.zzbi(status0.getStatusCode()));
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

    static abstract class SendRequestImpl extends BaseGamesApiMethodImpl {
        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzas(x0);
        }

        public SendRequestResult zzas(Status status0) {
            return new SendRequestResult() {
                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class UpdateRequestsImpl extends BaseGamesApiMethodImpl {
        private UpdateRequestsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        UpdateRequestsImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.RequestsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzat(x0);
        }

        public UpdateRequestsResult zzat(Status status0) {
            return new UpdateRequestsResult() {
                @Override  // com.google.android.gms.games.request.Requests$UpdateRequestsResult
                public Set getRequestIds() {
                    return null;
                }

                @Override  // com.google.android.gms.games.request.Requests$UpdateRequestsResult
                public int getRequestOutcome(String requestId) {
                    throw new IllegalArgumentException("Unknown request ID " + requestId);
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

    @Override  // com.google.android.gms.games.request.Requests
    public PendingResult acceptRequest(GoogleApiClient apiClient, String requestId) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(requestId);
        return this.acceptRequests(apiClient, arrayList0);
    }

    @Override  // com.google.android.gms.games.request.Requests
    public PendingResult acceptRequests(GoogleApiClient apiClient, List list0) {
        return list0 == null ? apiClient.zzb(new UpdateRequestsImpl(apiClient, null) {
            final String[] zzarO;
            final RequestsImpl zzarP;

            {
                RequestsImpl.this = requestsImpl0;
                this.zzarO = arr_s;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzb(this, this.zzarO);
            }
        }) : apiClient.zzb(new UpdateRequestsImpl(apiClient, ((String[])list0.toArray(new String[list0.size()]))) {
            final String[] zzarO;
            final RequestsImpl zzarP;

            {
                RequestsImpl.this = requestsImpl0;
                this.zzarO = arr_s;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzb(this, this.zzarO);
            }
        });
    }

    @Override  // com.google.android.gms.games.request.Requests
    public PendingResult dismissRequest(GoogleApiClient apiClient, String requestId) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(requestId);
        return this.dismissRequests(apiClient, arrayList0);
    }

    @Override  // com.google.android.gms.games.request.Requests
    public PendingResult dismissRequests(GoogleApiClient apiClient, List list0) {
        return list0 == null ? apiClient.zzb(new UpdateRequestsImpl(apiClient, null) {
            final String[] zzarO;
            final RequestsImpl zzarP;

            {
                RequestsImpl.this = requestsImpl0;
                this.zzarO = arr_s;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzc(this, this.zzarO);
            }
        }) : apiClient.zzb(new UpdateRequestsImpl(apiClient, ((String[])list0.toArray(new String[list0.size()]))) {
            final String[] zzarO;
            final RequestsImpl zzarP;

            {
                RequestsImpl.this = requestsImpl0;
                this.zzarO = arr_s;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzc(this, this.zzarO);
            }
        });
    }

    @Override  // com.google.android.gms.games.request.Requests
    public ArrayList getGameRequestsFromBundle(Bundle extras) {
        if(extras == null || !extras.containsKey("requests")) {
            return new ArrayList();
        }
        ArrayList arrayList0 = (ArrayList)extras.get("requests");
        ArrayList arrayList1 = new ArrayList();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList1.add(((GameRequest)arrayList0.get(v1)));
        }
        return arrayList1;
    }

    @Override  // com.google.android.gms.games.request.Requests
    public ArrayList getGameRequestsFromInboxResponse(Intent response) {
        return response == null ? new ArrayList() : this.getGameRequestsFromBundle(response.getExtras());
    }

    @Override  // com.google.android.gms.games.request.Requests
    public Intent getInboxIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsM();
    }

    @Override  // com.google.android.gms.games.request.Requests
    public int getMaxLifetimeDays(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsO();
    }

    @Override  // com.google.android.gms.games.request.Requests
    public int getMaxPayloadSize(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsN();
    }

    @Override  // com.google.android.gms.games.request.Requests
    public Intent getSendIntent(GoogleApiClient apiClient, int type, byte[] payload, int requestLifetimeDays, Bitmap icon, String description) {
        return Games.zzd(apiClient).zza(type, payload, requestLifetimeDays, icon, description);
    }

    @Override  // com.google.android.gms.games.request.Requests
    public PendingResult loadRequests(GoogleApiClient apiClient, int requestDirection, int types, int sortOrder) {
        return apiClient.zza(new LoadRequestsImpl(apiClient, requestDirection, types, sortOrder) {
            final int zzaqV;
            final RequestsImpl zzarP;
            final int zzarQ;
            final int zzarR;

            {
                RequestsImpl.this = requestsImpl0;
                this.zzarQ = v;
                this.zzarR = v1;
                this.zzaqV = v2;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzarQ, this.zzarR, this.zzaqV);
            }
        });
    }

    @Override  // com.google.android.gms.games.request.Requests
    public void registerRequestListener(GoogleApiClient apiClient, OnRequestReceivedListener listener) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzd(apiClient.zzo(listener));
        }
    }

    @Override  // com.google.android.gms.games.request.Requests
    public void unregisterRequestListener(GoogleApiClient apiClient) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzsG();
        }
    }

    class com.google.android.gms.games.internal.api.RequestsImpl.4 extends SendRequestImpl {
        final String zzaqA;
        final String[] zzarS;
        final int zzarT;
        final byte[] zzarU;
        final int zzarV;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, this.zzaqA, this.zzarS, this.zzarT, this.zzarU, this.zzarV);
        }
    }


    class com.google.android.gms.games.internal.api.RequestsImpl.5 extends SendRequestImpl {
        final String zzaqA;
        final String[] zzarS;
        final int zzarT;
        final byte[] zzarU;
        final int zzarV;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, this.zzaqA, this.zzarS, this.zzarT, this.zzarU, this.zzarV);
        }
    }


    class com.google.android.gms.games.internal.api.RequestsImpl.6 extends UpdateRequestsImpl {
        final String zzaqA;
        final String zzarK;
        final String[] zzarO;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, this.zzaqA, this.zzarK, this.zzarO);
        }
    }


    class com.google.android.gms.games.internal.api.RequestsImpl.7 extends LoadRequestsImpl {
        final String zzaqA;
        final int zzaqV;
        final String zzarK;
        final int zzarQ;
        final int zzarR;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zza(this, this.zzaqA, this.zzarK, this.zzarQ, this.zzarR, this.zzaqV);
        }
    }


    class com.google.android.gms.games.internal.api.RequestsImpl.8 extends LoadRequestSummariesImpl {
        final String zzarK;
        final int zzarR;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzf(this, this.zzarK, this.zzarR);
        }
    }

}

