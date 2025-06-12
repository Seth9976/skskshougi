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
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

public final class InvitationsImpl implements Invitations {
    static abstract class LoadInvitationsImpl extends BaseGamesApiMethodImpl {
        private LoadInvitationsImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        LoadInvitationsImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.InvitationsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzaa(x0);
        }

        public LoadInvitationsResult zzaa(Status status0) {
            return new LoadInvitationsResult() {
                @Override  // com.google.android.gms.games.multiplayer.Invitations$LoadInvitationsResult
                public InvitationBuffer getInvitations() {
                    return new InvitationBuffer(DataHolder.zzbi(14));
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

    @Override  // com.google.android.gms.games.multiplayer.Invitations
    public Intent getInvitationInboxIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsC();
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitations
    public PendingResult loadInvitations(GoogleApiClient apiClient) {
        return this.loadInvitations(apiClient, 0);
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitations
    public PendingResult loadInvitations(GoogleApiClient apiClient, int sortOrder) {
        return apiClient.zza(new LoadInvitationsImpl(apiClient, sortOrder) {
            final int zzaqV;
            final InvitationsImpl zzaqW;

            {
                InvitationsImpl.this = invitationsImpl0;
                this.zzaqV = v;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzc(this, this.zzaqV);
            }
        });
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitations
    public void registerInvitationListener(GoogleApiClient apiClient, OnInvitationReceivedListener listener) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zza(apiClient.zzo(listener));
        }
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitations
    public void unregisterInvitationListener(GoogleApiClient apiClient) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzsD();
        }
    }

    class com.google.android.gms.games.internal.api.InvitationsImpl.2 extends LoadInvitationsImpl {
        final String zzaqA;
        final int zzaqV;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zze(this, this.zzaqA, this.zzaqV);
        }
    }


    class com.google.android.gms.games.internal.api.InvitationsImpl.3 extends LoadInvitationsImpl {
        final String zzaqX;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzm(this, this.zzaqX);
        }
    }

}

