package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zza;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.api.AchievementsImpl;
import com.google.android.gms.games.internal.api.AclsImpl;
import com.google.android.gms.games.internal.api.AppContentsImpl;
import com.google.android.gms.games.internal.api.EventsImpl;
import com.google.android.gms.games.internal.api.GamesMetadataImpl;
import com.google.android.gms.games.internal.api.InvitationsImpl;
import com.google.android.gms.games.internal.api.LeaderboardsImpl;
import com.google.android.gms.games.internal.api.MultiplayerImpl;
import com.google.android.gms.games.internal.api.NotificationsImpl;
import com.google.android.gms.games.internal.api.PlayersImpl;
import com.google.android.gms.games.internal.api.QuestsImpl;
import com.google.android.gms.games.internal.api.RealTimeMultiplayerImpl;
import com.google.android.gms.games.internal.api.RequestsImpl;
import com.google.android.gms.games.internal.api.SnapshotsImpl;
import com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl;
import com.google.android.gms.games.internal.game.Acls;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.snapshot.Snapshots;
import java.util.ArrayList;

public final class Games {
    public static abstract class BaseGamesApiMethodImpl extends zza {
        public BaseGamesApiMethodImpl(GoogleApiClient googleApiClient) {
            super(Games.zzNX, googleApiClient);
        }
    }

    public static final class GamesOptions implements Optional {
        public static final class Builder {
            boolean zzanC;
            boolean zzanD;
            int zzanE;
            boolean zzanF;
            int zzanG;
            String zzanH;
            ArrayList zzanI;

            private Builder() {
                this.zzanC = false;
                this.zzanD = true;
                this.zzanE = 17;
                this.zzanF = false;
                this.zzanG = 0x1110;
                this.zzanH = null;
                this.zzanI = new ArrayList();
            }

            Builder(com.google.android.gms.games.Games.1 x0) {
            }

            public GamesOptions build() {
                return new GamesOptions(this, null);
            }

            public Builder setSdkVariant(int variant) {
                this.zzanG = variant;
                return this;
            }

            public Builder setShowConnectingPopup(boolean showConnectingPopup) {
                this.zzanD = showConnectingPopup;
                this.zzanE = 17;
                return this;
            }

            public Builder setShowConnectingPopup(boolean showConnectingPopup, int gravity) {
                this.zzanD = showConnectingPopup;
                this.zzanE = gravity;
                return this;
            }
        }

        public final boolean zzanC;
        public final boolean zzanD;
        public final int zzanE;
        public final boolean zzanF;
        public final int zzanG;
        public final String zzanH;
        public final ArrayList zzanI;

        private GamesOptions() {
            this.zzanC = false;
            this.zzanD = true;
            this.zzanE = 17;
            this.zzanF = false;
            this.zzanG = 0x1110;
            this.zzanH = null;
            this.zzanI = new ArrayList();
        }

        GamesOptions(com.google.android.gms.games.Games.1 x0) {
        }

        private GamesOptions(Builder builder) {
            this.zzanC = builder.zzanC;
            this.zzanD = builder.zzanD;
            this.zzanE = builder.zzanE;
            this.zzanF = builder.zzanF;
            this.zzanG = builder.zzanG;
            this.zzanH = builder.zzanH;
            this.zzanI = builder.zzanI;
        }

        GamesOptions(Builder x0, com.google.android.gms.games.Games.1 x1) {
            this(x0);
        }

        public static Builder builder() {
            return new Builder(null);
        }

        public Bundle zzrI() {
            Bundle bundle0 = new Bundle();
            bundle0.putBoolean("com.google.android.gms.games.key.isHeadless", this.zzanC);
            bundle0.putBoolean("com.google.android.gms.games.key.showConnectingPopup", this.zzanD);
            bundle0.putInt("com.google.android.gms.games.key.connectingPopupGravity", this.zzanE);
            bundle0.putBoolean("com.google.android.gms.games.key.retryingSignIn", this.zzanF);
            bundle0.putInt("com.google.android.gms.games.key.sdkVariant", this.zzanG);
            bundle0.putString("com.google.android.gms.games.key.forceResolveAccountKey", this.zzanH);
            bundle0.putStringArrayList("com.google.android.gms.games.key.proxyApis", this.zzanI);
            return bundle0;
        }
    }

    static abstract class SignOutImpl extends BaseGamesApiMethodImpl {
        private SignOutImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        SignOutImpl(GoogleApiClient x0, com.google.android.gms.games.Games.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return x0;
        }

        public Status zzb(Status status0) [...] // Inlined contents
    }

    public static final Api API = null;
    public static final Achievements Achievements = null;
    public static final String EXTRA_PLAYER_IDS = "players";
    public static final String EXTRA_STATUS = "status";
    public static final Events Events;
    public static final GamesMetadata GamesMetadata;
    public static final Invitations Invitations;
    public static final Leaderboards Leaderboards;
    public static final Notifications Notifications;
    public static final Players Players;
    public static final Quests Quests;
    public static final RealTimeMultiplayer RealTimeMultiplayer;
    public static final Requests Requests;
    public static final Scope SCOPE_GAMES;
    public static final Snapshots Snapshots;
    public static final TurnBasedMultiplayer TurnBasedMultiplayer;
    static final ClientKey zzNX;
    private static final com.google.android.gms.common.api.Api.zza zzNY;
    public static final Multiplayer zzanA;
    public static final Acls zzanB;
    public static final Scope zzanx;
    public static final Api zzany;
    public static final AppContents zzanz;

    static {
        Games.zzNX = new ClientKey();
        Games.zzNY = new com.google.android.gms.common.api.Api.zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 1;
            }

            public GamesClientImpl zza(Context context0, Looper looper0, zze zze0, GamesOptions games$GamesOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return games$GamesOptions0 == null ? new GamesClientImpl(context0, looper0, zze0, new GamesOptions(null), googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0) : new GamesClientImpl(context0, looper0, zze0, games$GamesOptions0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
            }
        };
        Games.SCOPE_GAMES = new Scope("https://www.googleapis.com/auth/games");
        Games.API = new Api("Games.API", Games.zzNY, Games.zzNX, new Scope[]{Games.SCOPE_GAMES});
        Games.zzanx = new Scope("https://www.googleapis.com/auth/games.firstparty");
        Games.zzany = new Api("Games.API_1P", Games.zzNY, Games.zzNX, new Scope[]{Games.zzanx});
        Games.GamesMetadata = new GamesMetadataImpl();
        Games.Achievements = new AchievementsImpl();
        Games.zzanz = new AppContentsImpl();
        Games.Events = new EventsImpl();
        Games.Leaderboards = new LeaderboardsImpl();
        Games.Invitations = new InvitationsImpl();
        Games.TurnBasedMultiplayer = new TurnBasedMultiplayerImpl();
        Games.RealTimeMultiplayer = new RealTimeMultiplayerImpl();
        Games.zzanA = new MultiplayerImpl();
        Games.Players = new PlayersImpl();
        Games.Notifications = new NotificationsImpl();
        Games.Quests = new QuestsImpl();
        Games.Requests = new RequestsImpl();
        Games.Snapshots = new SnapshotsImpl();
        Games.zzanB = new AclsImpl();
    }

    public static String getAppId(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsK();
    }

    public static String getCurrentAccountName(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsv();
    }

    public static int getSdkVariant(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsJ();
    }

    public static Intent getSettingsIntent(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsI();
    }

    public static void setGravityForPopups(GoogleApiClient apiClient, int gravity) {
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzfC(gravity);
        }
    }

    public static void setViewForPopups(GoogleApiClient apiClient, View gamesContentView) {
        zzu.zzu(gamesContentView);
        GamesClientImpl gamesClientImpl0 = Games.zzb(apiClient, false);
        if(gamesClientImpl0 != null) {
            gamesClientImpl0.zzn(gamesContentView);
        }
    }

    public static PendingResult signOut(GoogleApiClient apiClient) {
        return apiClient.zzb(new SignOutImpl(apiClient) {
            {
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzb(this);
            }
        });
    }

    public static GamesClientImpl zzb(GoogleApiClient googleApiClient0, boolean z) {
        zzu.zzb(googleApiClient0 != null, "GoogleApiClient parameter is required.");
        zzu.zza(googleApiClient0.isConnected(), "GoogleApiClient must be connected.");
        return Games.zzc(googleApiClient0, z);
    }

    public static GamesClientImpl zzc(GoogleApiClient googleApiClient0, boolean z) {
        zzu.zza(googleApiClient0.zza(Games.API), "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean z1 = googleApiClient0.hasConnectedApi(Games.API);
        if(z && !z1) {
            throw new IllegalStateException("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
        }
        return z1 ? ((GamesClientImpl)googleApiClient0.zza(Games.zzNX)) : null;
    }

    public static GamesClientImpl zzd(GoogleApiClient googleApiClient0) {
        return Games.zzb(googleApiClient0, true);
    }
}

