package com.google.android.gms.games.internal;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zzb;
import com.google.android.gms.common.api.zzc;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult;
import com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult;
import com.google.android.gms.games.GamesMetadata.LoadGamesResult;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.Notifications.ContactSettingLoadResult;
import com.google.android.gms.games.Notifications.GameMuteStatusChangeResult;
import com.google.android.gms.games.Notifications.GameMuteStatusLoadResult;
import com.google.android.gms.games.Notifications.InboxCountResult;
import com.google.android.gms.games.OnNearbyPlayerDetectedListener;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.Players.LoadPlayersResult;
import com.google.android.gms.games.Players.LoadProfileSettingsResult;
import com.google.android.gms.games.Players.LoadXpForGameCategoriesResult;
import com.google.android.gms.games.Players.LoadXpStreamResult;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;
import com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult;
import com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events.LoadEventsResult;
import com.google.android.gms.games.internal.constants.RequestType;
import com.google.android.gms.games.internal.events.EventIncrementCache;
import com.google.android.gms.games.internal.events.EventIncrementManager;
import com.google.android.gms.games.internal.experience.ExperienceEventBuffer;
import com.google.android.gms.games.internal.game.Acls.LoadAclResult;
import com.google.android.gms.games.internal.game.GameInstanceBuffer;
import com.google.android.gms.games.internal.game.GameSearchSuggestionBuffer;
import com.google.android.gms.games.internal.request.RequestUpdateOutcomes;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardEntity;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreEntity;
import com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestEntity;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests.AcceptQuestResult;
import com.google.android.gms.games.quest.Quests.ClaimMilestoneResult;
import com.google.android.gms.games.quest.Quests.LoadQuestsResult;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.request.Requests.LoadRequestSummariesResult;
import com.google.android.gms.games.request.Requests.LoadRequestsResult;
import com.google.android.gms.games.request.Requests.SendRequestResult;
import com.google.android.gms.games.request.Requests.UpdateRequestsResult;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;
import com.google.android.gms.signin.internal.zzh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import jeb.synthetic.TWR;

public final class GamesClientImpl extends zzi {
    static abstract class AbstractPeerStatusNotifier extends AbstractRoomStatusNotifier {
        private final ArrayList zzapa;

        AbstractPeerStatusNotifier(DataHolder dataHolder, String[] participantIds) {
            super(dataHolder);
            this.zzapa = new ArrayList();
            for(int v = 0; v < participantIds.length; ++v) {
                this.zzapa.add(participantIds[v]);
            }
        }

        @Override  // com.google.android.gms.games.internal.GamesClientImpl$AbstractRoomStatusNotifier
        protected void zza(RoomStatusUpdateListener roomStatusUpdateListener0, Room room0) {
            this.zza(roomStatusUpdateListener0, room0, this.zzapa);
        }

        protected abstract void zza(RoomStatusUpdateListener arg1, Room arg2, ArrayList arg3);
    }

    static abstract class AbstractRoomNotifier extends zzb {
        AbstractRoomNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        protected void zza(RoomUpdateListener roomUpdateListener0, DataHolder dataHolder0) {
            this.zza(roomUpdateListener0, GamesClientImpl.zzU(dataHolder0), dataHolder0.getStatusCode());
        }

        protected abstract void zza(RoomUpdateListener arg1, Room arg2, int arg3);

        @Override  // com.google.android.gms.common.api.zzb
        protected void zza(Object object0, DataHolder dataHolder0) {
            this.zza(((RoomUpdateListener)object0), dataHolder0);
        }
    }

    static abstract class AbstractRoomStatusNotifier extends zzb {
        AbstractRoomStatusNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        protected void zza(RoomStatusUpdateListener roomStatusUpdateListener0, DataHolder dataHolder0) {
            this.zza(roomStatusUpdateListener0, GamesClientImpl.zzU(dataHolder0));
        }

        protected abstract void zza(RoomStatusUpdateListener arg1, Room arg2);

        @Override  // com.google.android.gms.common.api.zzb
        protected void zza(Object object0, DataHolder dataHolder0) {
            this.zza(((RoomStatusUpdateListener)object0), dataHolder0);
        }
    }

    static final class AcceptQuestResultImpl extends GamesDataHolderResult implements AcceptQuestResult {
        private final Quest zzapb;

        AcceptQuestResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            QuestBuffer questBuffer0 = new QuestBuffer(dataHolder);
            try {
                this.zzapb = questBuffer0.getCount() > 0 ? new QuestEntity(((Quest)questBuffer0.get(0))) : null;
            }
            finally {
                questBuffer0.release();
            }
        }

        @Override  // com.google.android.gms.games.quest.Quests$AcceptQuestResult
        public Quest getQuest() {
            return this.zzapb;
        }
    }

    static final class AchievementUpdatedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        AchievementUpdatedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzf(int v, String s) {
            UpdateAchievementResultImpl gamesClientImpl$UpdateAchievementResultImpl0 = new UpdateAchievementResultImpl(v, s);
            this.zzOs.zzm(gamesClientImpl$UpdateAchievementResultImpl0);
        }
    }

    static final class AchievementsLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        AchievementsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzf(DataHolder dataHolder0) {
            LoadAchievementsResultImpl gamesClientImpl$LoadAchievementsResultImpl0 = new LoadAchievementsResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$LoadAchievementsResultImpl0);
        }
    }

    static final class AppContentLoadedBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzapc;

        public AppContentLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzapc = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zza(DataHolder[] arr_dataHolder) {
            LoadAppContentsResultImpl gamesClientImpl$LoadAppContentsResultImpl0 = new LoadAppContentsResultImpl(arr_dataHolder);
            this.zzapc.zzm(gamesClientImpl$LoadAppContentsResultImpl0);
        }
    }

    static final class CancelMatchResultImpl implements CancelMatchResult {
        private final Status zzOt;
        private final String zzapd;

        CancelMatchResultImpl(Status status, String externalMatchId) {
            this.zzOt = status;
            this.zzapd = externalMatchId;
        }

        @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer$CancelMatchResult
        public String getMatchId() {
            return this.zzapd;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static final class ClaimMilestoneResultImpl extends GamesDataHolderResult implements ClaimMilestoneResult {
        private final Quest zzapb;
        private final Milestone zzape;

        ClaimMilestoneResultImpl(DataHolder dataHolder, String milestoneId) {
            super(dataHolder);
            QuestBuffer questBuffer0 = new QuestBuffer(dataHolder);
            try {
                if(questBuffer0.getCount() > 0) {
                    this.zzapb = new QuestEntity(((Quest)questBuffer0.get(0)));
                    List list0 = this.zzapb.zztN();
                    int v2 = list0.size();
                    for(int v = 0; v < v2; ++v) {
                        if(((Milestone)list0.get(v)).getMilestoneId().equals(milestoneId)) {
                            this.zzape = (Milestone)list0.get(v);
                            return;
                        }
                    }
                    this.zzape = null;
                }
                else {
                    this.zzape = null;
                    this.zzapb = null;
                }
            }
            finally {
                questBuffer0.release();
            }
        }

        @Override  // com.google.android.gms.games.quest.Quests$ClaimMilestoneResult
        public Milestone getMilestone() {
            return this.zzape;
        }

        @Override  // com.google.android.gms.games.quest.Quests$ClaimMilestoneResult
        public Quest getQuest() {
            return this.zzapb;
        }
    }

    static final class CommitSnapshotResultImpl extends GamesDataHolderResult implements CommitSnapshotResult {
        private final SnapshotMetadata zzapf;

        CommitSnapshotResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            SnapshotMetadataBuffer snapshotMetadataBuffer0 = new SnapshotMetadataBuffer(dataHolder);
            try {
                this.zzapf = snapshotMetadataBuffer0.getCount() > 0 ? new SnapshotMetadataEntity(snapshotMetadataBuffer0.get(0)) : null;
            }
            finally {
                snapshotMetadataBuffer0.release();
            }
        }

        @Override  // com.google.android.gms.games.snapshot.Snapshots$CommitSnapshotResult
        public SnapshotMetadata getSnapshotMetadata() {
            return this.zzapf;
        }
    }

    static final class ConnectedToRoomNotifier extends AbstractRoomStatusNotifier {
        ConnectedToRoomNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override  // com.google.android.gms.games.internal.GamesClientImpl$AbstractRoomStatusNotifier
        public void zza(RoomStatusUpdateListener roomStatusUpdateListener0, Room room0) {
            roomStatusUpdateListener0.onConnectedToRoom(room0);
        }
    }

    static final class ContactSettingLoadResultImpl extends GamesDataHolderResult implements ContactSettingLoadResult {
        ContactSettingLoadResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    static final class ContactSettingsLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        ContactSettingsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzG(DataHolder dataHolder0) {
            ContactSettingLoadResultImpl gamesClientImpl$ContactSettingLoadResultImpl0 = new ContactSettingLoadResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$ContactSettingLoadResultImpl0);
        }
    }

    static final class ContactSettingsUpdatedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        ContactSettingsUpdatedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzfz(int v) {
            Status status0 = GamesStatusCodes.zzfn(v);
            this.zzOs.zzm(status0);
        }
    }

    static final class DeleteSnapshotResultImpl implements DeleteSnapshotResult {
        private final Status zzOt;
        private final String zzapg;

        DeleteSnapshotResultImpl(int statusCode, String snapshotId) {
            this.zzOt = GamesStatusCodes.zzfn(statusCode);
            this.zzapg = snapshotId;
        }

        @Override  // com.google.android.gms.games.snapshot.Snapshots$DeleteSnapshotResult
        public String getSnapshotId() {
            return this.zzapg;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static final class DisconnectedFromRoomNotifier extends AbstractRoomStatusNotifier {
        DisconnectedFromRoomNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override  // com.google.android.gms.games.internal.GamesClientImpl$AbstractRoomStatusNotifier
        public void zza(RoomStatusUpdateListener roomStatusUpdateListener0, Room room0) {
            roomStatusUpdateListener0.onDisconnectedFromRoom(room0);
        }
    }

    static final class EventsLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        EventsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzg(DataHolder dataHolder0) {
            LoadEventResultImpl gamesClientImpl$LoadEventResultImpl0 = new LoadEventResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$LoadEventResultImpl0);
        }
    }

    class GameClientEventIncrementCache extends EventIncrementCache {
        final GamesClientImpl zzaoZ;

        public GameClientEventIncrementCache() {
            super(gamesClientImpl0.getContext().getMainLooper(), 1000);
        }

        @Override  // com.google.android.gms.games.internal.events.EventIncrementCache
        protected void zzs(String s, int v) {
            try {
                if(GamesClientImpl.this.isConnected()) {
                    ((IGamesService)GamesClientImpl.this.zznM()).zzp(s, v);
                    return;
                }
                GamesLog.zzv("GamesClientImpl", "Unable to increment event " + s + " by " + v + " because the games client is no longer connected");
            }
            catch(RemoteException remoteException0) {
                GamesClientImpl.this.zzb(remoteException0);
            }
        }
    }

    static final class GameInstancesLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        GameInstancesLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzn(DataHolder dataHolder0) {
            LoadGameInstancesResultImpl gamesClientImpl$LoadGameInstancesResultImpl0 = new LoadGameInstancesResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$LoadGameInstancesResultImpl0);
        }
    }

    static final class GameMuteStatusChangeResultImpl implements GameMuteStatusChangeResult {
        private final Status zzOt;
        private final String zzaph;
        private final boolean zzapi;

        public GameMuteStatusChangeResultImpl(int statusCode, String externalGameId, boolean isMuted) {
            this.zzOt = GamesStatusCodes.zzfn(statusCode);
            this.zzaph = externalGameId;
            this.zzapi = isMuted;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static final class GameMuteStatusChangedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        GameMuteStatusChangedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zza(int v, String s, boolean z) {
            GameMuteStatusChangeResultImpl gamesClientImpl$GameMuteStatusChangeResultImpl0 = new GameMuteStatusChangeResultImpl(v, s, z);
            this.zzOs.zzm(gamesClientImpl$GameMuteStatusChangeResultImpl0);
        }
    }

    static final class GameMuteStatusLoadResultImpl implements GameMuteStatusLoadResult {
        private final Status zzOt;
        private final String zzaph;
        private final boolean zzapi;

        public GameMuteStatusLoadResultImpl(DataHolder dataHolder) {
            try(dataHolder) {
                this.zzOt = GamesStatusCodes.zzfn(dataHolder.getStatusCode());
                if(dataHolder.getCount() > 0) {
                    this.zzaph = dataHolder.zzd("external_game_id", 0, 0);
                    this.zzapi = dataHolder.zze("muted", 0, 0);
                    return;
                }
            }
            this.zzaph = null;
            this.zzapi = false;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static final class GameMuteStatusLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        GameMuteStatusLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzE(DataHolder dataHolder0) {
            GameMuteStatusLoadResultImpl gamesClientImpl$GameMuteStatusLoadResultImpl0 = new GameMuteStatusLoadResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$GameMuteStatusLoadResultImpl0);
        }
    }

    static final class GameSearchSuggestionsLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        GameSearchSuggestionsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzo(DataHolder dataHolder0) {
            LoadGameSearchSuggestionsResultImpl gamesClientImpl$LoadGameSearchSuggestionsResultImpl0 = new LoadGameSearchSuggestionsResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$LoadGameSearchSuggestionsResultImpl0);
        }
    }

    static abstract class GamesDataHolderResult extends zzc {
        protected GamesDataHolderResult(DataHolder dataHolder) {
            super(dataHolder, GamesStatusCodes.zzfn(dataHolder.getStatusCode()));
        }
    }

    static final class GamesLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        GamesLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzl(DataHolder dataHolder0) {
            LoadGamesResultImpl gamesClientImpl$LoadGamesResultImpl0 = new LoadGamesResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$LoadGamesResultImpl0);
        }
    }

    static final class InboxCountResultImpl implements InboxCountResult {
        private final Status zzOt;
        private final Bundle zzapj;

        InboxCountResultImpl(Status status, Bundle inboxCounts) {
            this.zzOt = status;
            this.zzapj = inboxCounts;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static final class InboxCountsLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        InboxCountsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzg(int v, Bundle bundle0) {
            bundle0.setClassLoader(this.getClass().getClassLoader());
            InboxCountResultImpl gamesClientImpl$InboxCountResultImpl0 = new InboxCountResultImpl(GamesStatusCodes.zzfn(v), bundle0);
            this.zzOs.zzm(gamesClientImpl$InboxCountResultImpl0);
        }
    }

    static final class InitiateMatchResultImpl extends TurnBasedMatchResult implements InitiateMatchResult {
        InitiateMatchResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    static final class InvitationReceivedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zzi zzafi;

        InvitationReceivedBinderCallback(com.google.android.gms.common.api.zzi zzi0) {
            this.zzafi = zzi0;
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void onInvitationRemoved(String invitationId) {
            InvitationRemovedNotifier gamesClientImpl$InvitationRemovedNotifier0 = new InvitationRemovedNotifier(invitationId);
            this.zzafi.zza(gamesClientImpl$InvitationRemovedNotifier0);
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzq(DataHolder dataHolder0) {
            InvitationBuffer invitationBuffer0 = new InvitationBuffer(dataHolder0);
            Invitation invitation0 = null;
            try {
                if(invitationBuffer0.getCount() > 0) {
                    invitation0 = (Invitation)((Invitation)invitationBuffer0.get(0)).freeze();
                }
            }
            finally {
                invitationBuffer0.release();
            }
            if(invitation0 != null) {
                InvitationReceivedNotifier gamesClientImpl$InvitationReceivedNotifier0 = new InvitationReceivedNotifier(invitation0);
                this.zzafi.zza(gamesClientImpl$InvitationReceivedNotifier0);
            }
        }
    }

    static final class InvitationReceivedNotifier implements com.google.android.gms.common.api.zzi.zzb {
        private final Invitation zzapk;

        InvitationReceivedNotifier(Invitation invitation) {
            this.zzapk = invitation;
        }

        public void zza(OnInvitationReceivedListener onInvitationReceivedListener0) {
            onInvitationReceivedListener0.onInvitationReceived(this.zzapk);
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzmw() {
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzn(Object object0) {
            this.zza(((OnInvitationReceivedListener)object0));
        }
    }

    static final class InvitationRemovedNotifier implements com.google.android.gms.common.api.zzi.zzb {
        private final String zzapl;

        InvitationRemovedNotifier(String invitationId) {
            this.zzapl = invitationId;
        }

        public void zza(OnInvitationReceivedListener onInvitationReceivedListener0) {
            onInvitationReceivedListener0.onInvitationRemoved(this.zzapl);
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzmw() {
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzn(Object object0) {
            this.zza(((OnInvitationReceivedListener)object0));
        }
    }

    static final class InvitationsLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        InvitationsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzp(DataHolder dataHolder0) {
            LoadInvitationsResultImpl gamesClientImpl$LoadInvitationsResultImpl0 = new LoadInvitationsResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$LoadInvitationsResultImpl0);
        }
    }

    static final class JoinedRoomNotifier extends AbstractRoomNotifier {
        public JoinedRoomNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override  // com.google.android.gms.games.internal.GamesClientImpl$AbstractRoomNotifier
        public void zza(RoomUpdateListener roomUpdateListener0, Room room0, int v) {
            roomUpdateListener0.onJoinedRoom(v, room0);
        }
    }

    static final class LeaderboardMetadataResultImpl extends GamesDataHolderResult implements LeaderboardMetadataResult {
        private final LeaderboardBuffer zzapm;

        LeaderboardMetadataResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.zzapm = new LeaderboardBuffer(dataHolder);
        }

        @Override  // com.google.android.gms.games.leaderboard.Leaderboards$LeaderboardMetadataResult
        public LeaderboardBuffer getLeaderboards() {
            return this.zzapm;
        }
    }

    static final class LeaderboardScoresLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        LeaderboardScoresLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zza(DataHolder dataHolder0, DataHolder dataHolder1) {
            LoadScoresResultImpl gamesClientImpl$LoadScoresResultImpl0 = new LoadScoresResultImpl(dataHolder0, dataHolder1);
            this.zzOs.zzm(gamesClientImpl$LoadScoresResultImpl0);
        }
    }

    static final class LeaderboardsLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        LeaderboardsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzh(DataHolder dataHolder0) {
            LeaderboardMetadataResultImpl gamesClientImpl$LeaderboardMetadataResultImpl0 = new LeaderboardMetadataResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$LeaderboardMetadataResultImpl0);
        }
    }

    static final class LeaveMatchResultImpl extends TurnBasedMatchResult implements LeaveMatchResult {
        LeaveMatchResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    static final class LeftRoomNotifier implements com.google.android.gms.common.api.zzi.zzb {
        private final int zzTS;
        private final String zzapn;

        LeftRoomNotifier(int statusCode, String roomId) {
            this.zzTS = statusCode;
            this.zzapn = roomId;
        }

        public void zza(RoomUpdateListener roomUpdateListener0) {
            roomUpdateListener0.onLeftRoom(this.zzTS, this.zzapn);
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzmw() {
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzn(Object object0) {
            this.zza(((RoomUpdateListener)object0));
        }
    }

    static final class LoadAchievementsResultImpl extends GamesDataHolderResult implements LoadAchievementsResult {
        private final AchievementBuffer zzapo;

        LoadAchievementsResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.zzapo = new AchievementBuffer(dataHolder);
        }

        @Override  // com.google.android.gms.games.achievement.Achievements$LoadAchievementsResult
        public AchievementBuffer getAchievements() {
            return this.zzapo;
        }
    }

    static final class LoadAclResultImpl extends GamesDataHolderResult implements LoadAclResult {
        LoadAclResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    static final class LoadAppContentsResultImpl extends GamesDataHolderResult implements LoadAppContentResult {
        private final ArrayList zzapp;

        LoadAppContentsResultImpl(DataHolder[] appContentData) {
            super(appContentData[0]);
            this.zzapp = new ArrayList(Arrays.asList(appContentData));
        }
    }

    static final class LoadEventResultImpl extends GamesDataHolderResult implements LoadEventsResult {
        private final EventBuffer zzapq;

        LoadEventResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.zzapq = new EventBuffer(dataHolder);
        }

        @Override  // com.google.android.gms.games.event.Events$LoadEventsResult
        public EventBuffer getEvents() {
            return this.zzapq;
        }
    }

    static final class LoadGameInstancesResultImpl extends GamesDataHolderResult implements LoadGameInstancesResult {
        private final GameInstanceBuffer zzapr;

        LoadGameInstancesResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.zzapr = new GameInstanceBuffer(dataHolder);
        }
    }

    static final class LoadGameSearchSuggestionsResultImpl extends GamesDataHolderResult implements LoadGameSearchSuggestionsResult {
        private final GameSearchSuggestionBuffer zzaps;

        LoadGameSearchSuggestionsResultImpl(DataHolder data) {
            super(data);
            this.zzaps = new GameSearchSuggestionBuffer(data);
        }
    }

    static final class LoadGamesResultImpl extends GamesDataHolderResult implements LoadGamesResult {
        private final GameBuffer zzapt;

        LoadGamesResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.zzapt = new GameBuffer(dataHolder);
        }

        @Override  // com.google.android.gms.games.GamesMetadata$LoadGamesResult
        public GameBuffer getGames() {
            return this.zzapt;
        }
    }

    static final class LoadInvitationsResultImpl extends GamesDataHolderResult implements LoadInvitationsResult {
        private final InvitationBuffer zzapu;

        LoadInvitationsResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.zzapu = new InvitationBuffer(dataHolder);
        }

        @Override  // com.google.android.gms.games.multiplayer.Invitations$LoadInvitationsResult
        public InvitationBuffer getInvitations() {
            return this.zzapu;
        }
    }

    static final class LoadMatchResultImpl extends TurnBasedMatchResult implements LoadMatchResult {
        LoadMatchResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    static final class LoadMatchesResultImpl implements LoadMatchesResult {
        private final Status zzOt;
        private final LoadMatchesResponse zzapv;

        LoadMatchesResultImpl(Status status, Bundle matchData) {
            this.zzOt = status;
            this.zzapv = new LoadMatchesResponse(matchData);
        }

        @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer$LoadMatchesResult
        public LoadMatchesResponse getMatches() {
            return this.zzapv;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }

        @Override  // com.google.android.gms.common.api.Releasable
        public void release() {
            this.zzapv.release();
        }
    }

    static final class LoadPlayerScoreResultImpl extends GamesDataHolderResult implements LoadPlayerScoreResult {
        private final LeaderboardScoreEntity zzapw;

        LoadPlayerScoreResultImpl(DataHolder scoreHolder) {
            super(scoreHolder);
            LeaderboardScoreBuffer leaderboardScoreBuffer0 = new LeaderboardScoreBuffer(scoreHolder);
            try {
                this.zzapw = leaderboardScoreBuffer0.getCount() > 0 ? ((LeaderboardScoreEntity)leaderboardScoreBuffer0.get(0).freeze()) : null;
            }
            finally {
                leaderboardScoreBuffer0.release();
            }
        }

        @Override  // com.google.android.gms.games.leaderboard.Leaderboards$LoadPlayerScoreResult
        public LeaderboardScore getScore() {
            return this.zzapw;
        }
    }

    static final class LoadPlayersResultImpl extends GamesDataHolderResult implements LoadPlayersResult {
        private final PlayerBuffer zzapx;

        LoadPlayersResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.zzapx = new PlayerBuffer(dataHolder);
        }

        @Override  // com.google.android.gms.games.Players$LoadPlayersResult
        public PlayerBuffer getPlayers() {
            return this.zzapx;
        }
    }

    static final class LoadProfileSettingsResultImpl extends GamesDataHolderResult implements LoadProfileSettingsResult {
        private final boolean zzaoN;
        private final boolean zzapy;

        LoadProfileSettingsResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            try {
                if(dataHolder.getCount() > 0) {
                    int v = dataHolder.zzbh(0);
                    this.zzaoN = dataHolder.zze("profile_visible", 0, v);
                    this.zzapy = dataHolder.zze("profile_visibility_explicitly_set", 0, v);
                }
                else {
                    this.zzaoN = true;
                    this.zzapy = false;
                }
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(dataHolder, throwable0);
                throw throwable0;
            }
            dataHolder.close();
        }

        @Override  // com.google.android.gms.common.api.zzc, com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }

        @Override  // com.google.android.gms.games.Players$LoadProfileSettingsResult
        public boolean isProfileVisible() {
            return this.zzaoN;
        }

        @Override  // com.google.android.gms.games.Players$LoadProfileSettingsResult
        public boolean isVisibilityExplicitlySet() {
            return this.zzapy;
        }
    }

    static final class LoadQuestsResultImpl extends GamesDataHolderResult implements LoadQuestsResult {
        private final DataHolder zzWu;

        LoadQuestsResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.zzWu = dataHolder;
        }

        @Override  // com.google.android.gms.games.quest.Quests$LoadQuestsResult
        public QuestBuffer getQuests() {
            return new QuestBuffer(this.zzWu);
        }
    }

    static final class LoadRequestSummariesResultImpl extends GamesDataHolderResult implements LoadRequestSummariesResult {
        LoadRequestSummariesResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    static final class LoadRequestsResultImpl implements LoadRequestsResult {
        private final Status zzOt;
        private final Bundle zzapz;

        LoadRequestsResultImpl(Status status, Bundle requestData) {
            this.zzOt = status;
            this.zzapz = requestData;
        }

        @Override  // com.google.android.gms.games.request.Requests$LoadRequestsResult
        public GameRequestBuffer getRequests(int requestType) {
            String s = RequestType.zzfG(requestType);
            return this.zzapz.containsKey(s) ? new GameRequestBuffer(((DataHolder)this.zzapz.get(s))) : null;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }

        @Override  // com.google.android.gms.common.api.Releasable
        public void release() {
            for(Object object0: this.zzapz.keySet()) {
                DataHolder dataHolder0 = (DataHolder)this.zzapz.getParcelable(((String)object0));
                if(dataHolder0 != null) {
                    dataHolder0.close();
                }
            }
        }
    }

    static final class LoadScoresResultImpl extends GamesDataHolderResult implements LoadScoresResult {
        private final LeaderboardEntity zzapA;
        private final LeaderboardScoreBuffer zzapB;

        LoadScoresResultImpl(DataHolder leaderboard, DataHolder scores) {
            super(scores);
            LeaderboardBuffer leaderboardBuffer0 = new LeaderboardBuffer(leaderboard);
            try {
                this.zzapA = leaderboardBuffer0.getCount() > 0 ? ((LeaderboardEntity)((Leaderboard)leaderboardBuffer0.get(0)).freeze()) : null;
            }
            finally {
                leaderboardBuffer0.release();
            }
            this.zzapB = new LeaderboardScoreBuffer(scores);
        }

        @Override  // com.google.android.gms.games.leaderboard.Leaderboards$LoadScoresResult
        public Leaderboard getLeaderboard() {
            return this.zzapA;
        }

        @Override  // com.google.android.gms.games.leaderboard.Leaderboards$LoadScoresResult
        public LeaderboardScoreBuffer getScores() {
            return this.zzapB;
        }
    }

    static final class LoadSnapshotsResultImpl extends GamesDataHolderResult implements LoadSnapshotsResult {
        LoadSnapshotsResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override  // com.google.android.gms.games.snapshot.Snapshots$LoadSnapshotsResult
        public SnapshotMetadataBuffer getSnapshots() {
            return new SnapshotMetadataBuffer(this.zzWu);
        }
    }

    static final class LoadXpForGameCategoriesResultImpl implements LoadXpForGameCategoriesResult {
        private final Status zzOt;
        private final List zzapC;
        private final Bundle zzapD;

        LoadXpForGameCategoriesResultImpl(Status status, Bundle xpData) {
            this.zzOt = status;
            this.zzapC = xpData.getStringArrayList("game_category_list");
            this.zzapD = xpData;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static final class LoadXpStreamResultImpl extends GamesDataHolderResult implements LoadXpStreamResult {
        private final ExperienceEventBuffer zzapE;

        LoadXpStreamResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.zzapE = new ExperienceEventBuffer(dataHolder);
        }
    }

    static final class MatchRemovedNotifier implements com.google.android.gms.common.api.zzi.zzb {
        private final String zzapF;

        MatchRemovedNotifier(String matchId) {
            this.zzapF = matchId;
        }

        public void zza(OnTurnBasedMatchUpdateReceivedListener onTurnBasedMatchUpdateReceivedListener0) {
            onTurnBasedMatchUpdateReceivedListener0.onTurnBasedMatchRemoved(this.zzapF);
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzmw() {
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzn(Object object0) {
            this.zza(((OnTurnBasedMatchUpdateReceivedListener)object0));
        }
    }

    static final class MatchUpdateReceivedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zzi zzafi;

        MatchUpdateReceivedBinderCallback(com.google.android.gms.common.api.zzi zzi0) {
            this.zzafi = zzi0;
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void onTurnBasedMatchRemoved(String matchId) {
            MatchRemovedNotifier gamesClientImpl$MatchRemovedNotifier0 = new MatchRemovedNotifier(matchId);
            this.zzafi.zza(gamesClientImpl$MatchRemovedNotifier0);
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzw(DataHolder dataHolder0) {
            TurnBasedMatchBuffer turnBasedMatchBuffer0 = new TurnBasedMatchBuffer(dataHolder0);
            TurnBasedMatch turnBasedMatch0 = null;
            try {
                if(turnBasedMatchBuffer0.getCount() > 0) {
                    turnBasedMatch0 = (TurnBasedMatch)((TurnBasedMatch)turnBasedMatchBuffer0.get(0)).freeze();
                }
            }
            finally {
                turnBasedMatchBuffer0.release();
            }
            if(turnBasedMatch0 != null) {
                MatchUpdateReceivedNotifier gamesClientImpl$MatchUpdateReceivedNotifier0 = new MatchUpdateReceivedNotifier(turnBasedMatch0);
                this.zzafi.zza(gamesClientImpl$MatchUpdateReceivedNotifier0);
            }
        }
    }

    static final class MatchUpdateReceivedNotifier implements com.google.android.gms.common.api.zzi.zzb {
        private final TurnBasedMatch zzapG;

        MatchUpdateReceivedNotifier(TurnBasedMatch match) {
            this.zzapG = match;
        }

        public void zza(OnTurnBasedMatchUpdateReceivedListener onTurnBasedMatchUpdateReceivedListener0) {
            onTurnBasedMatchUpdateReceivedListener0.onTurnBasedMatchReceived(this.zzapG);
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzmw() {
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzn(Object object0) {
            this.zza(((OnTurnBasedMatchUpdateReceivedListener)object0));
        }
    }

    static final class MessageReceivedNotifier implements com.google.android.gms.common.api.zzi.zzb {
        private final RealTimeMessage zzapH;

        MessageReceivedNotifier(RealTimeMessage message) {
            this.zzapH = message;
        }

        public void zza(RealTimeMessageReceivedListener realTimeMessageReceivedListener0) {
            realTimeMessageReceivedListener0.onRealTimeMessageReceived(this.zzapH);
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzmw() {
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzn(Object object0) {
            this.zza(((RealTimeMessageReceivedListener)object0));
        }
    }

    static final class NearbyPlayerDetectedNotifier implements com.google.android.gms.common.api.zzi.zzb {
        private final Player zzapI;

        public void zza(OnNearbyPlayerDetectedListener onNearbyPlayerDetectedListener0) {
            onNearbyPlayerDetectedListener0.zza(this.zzapI);
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzmw() {
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzn(Object object0) {
            this.zza(((OnNearbyPlayerDetectedListener)object0));
        }
    }

    static final class NotifyAclLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        NotifyAclLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzF(DataHolder dataHolder0) {
            LoadAclResultImpl gamesClientImpl$LoadAclResultImpl0 = new LoadAclResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$LoadAclResultImpl0);
        }
    }

    static final class NotifyAclUpdatedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        NotifyAclUpdatedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzfy(int v) {
            Status status0 = GamesStatusCodes.zzfn(v);
            this.zzOs.zzm(status0);
        }
    }

    static final class OpenSnapshotResultImpl extends GamesDataHolderResult implements OpenSnapshotResult {
        private final Snapshot zzapJ;
        private final String zzapK;
        private final Snapshot zzapL;
        private final Contents zzapM;
        private final SnapshotContents zzapN;

        OpenSnapshotResultImpl(DataHolder dataHolder, Contents currentContents) {
            this(dataHolder, null, currentContents, null, null);
        }

        OpenSnapshotResultImpl(DataHolder metadataHolder, String conflictId, Contents currentContents, Contents conflictContents, Contents resolutionContents) {
            boolean z = true;
            super(metadataHolder);
            SnapshotMetadataBuffer snapshotMetadataBuffer0 = new SnapshotMetadataBuffer(metadataHolder);
            try {
                switch(snapshotMetadataBuffer0.getCount()) {
                    case 0: {
                        this.zzapJ = null;
                        this.zzapL = null;
                        break;
                    }
                    case 1: {
                        if(metadataHolder.getStatusCode() == 4004) {
                            z = false;
                        }
                        com.google.android.gms.common.internal.zzb.zzU(z);
                        this.zzapJ = new SnapshotEntity(new SnapshotMetadataEntity(snapshotMetadataBuffer0.get(0)), new SnapshotContentsEntity(currentContents));
                        this.zzapL = null;
                        break;
                    }
                    default: {
                        this.zzapJ = new SnapshotEntity(new SnapshotMetadataEntity(snapshotMetadataBuffer0.get(0)), new SnapshotContentsEntity(currentContents));
                        this.zzapL = new SnapshotEntity(new SnapshotMetadataEntity(snapshotMetadataBuffer0.get(1)), new SnapshotContentsEntity(conflictContents));
                    }
                }
            }
            finally {
                snapshotMetadataBuffer0.release();
            }
            this.zzapK = conflictId;
            this.zzapM = resolutionContents;
            this.zzapN = new SnapshotContentsEntity(resolutionContents);
        }

        @Override  // com.google.android.gms.games.snapshot.Snapshots$OpenSnapshotResult
        public String getConflictId() {
            return this.zzapK;
        }

        @Override  // com.google.android.gms.games.snapshot.Snapshots$OpenSnapshotResult
        public Snapshot getConflictingSnapshot() {
            return this.zzapL;
        }

        @Override  // com.google.android.gms.games.snapshot.Snapshots$OpenSnapshotResult
        public SnapshotContents getResolutionSnapshotContents() {
            return this.zzapN;
        }

        @Override  // com.google.android.gms.games.snapshot.Snapshots$OpenSnapshotResult
        public Snapshot getSnapshot() {
            return this.zzapJ;
        }
    }

    static final class P2PConnectedNotifier implements com.google.android.gms.common.api.zzi.zzb {
        private final String zzapO;

        P2PConnectedNotifier(String participantId) {
            this.zzapO = participantId;
        }

        public void zza(RoomStatusUpdateListener roomStatusUpdateListener0) {
            roomStatusUpdateListener0.onP2PConnected(this.zzapO);
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzmw() {
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzn(Object object0) {
            this.zza(((RoomStatusUpdateListener)object0));
        }
    }

    static final class P2PDisconnectedNotifier implements com.google.android.gms.common.api.zzi.zzb {
        private final String zzapO;

        P2PDisconnectedNotifier(String participantId) {
            this.zzapO = participantId;
        }

        public void zza(RoomStatusUpdateListener roomStatusUpdateListener0) {
            roomStatusUpdateListener0.onP2PDisconnected(this.zzapO);
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzmw() {
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzn(Object object0) {
            this.zza(((RoomStatusUpdateListener)object0));
        }
    }

    static final class PeerConnectedNotifier extends AbstractPeerStatusNotifier {
        PeerConnectedNotifier(DataHolder dataHolder, String[] participantIds) {
            super(dataHolder, participantIds);
        }

        @Override  // com.google.android.gms.games.internal.GamesClientImpl$AbstractPeerStatusNotifier
        protected void zza(RoomStatusUpdateListener roomStatusUpdateListener0, Room room0, ArrayList arrayList0) {
            roomStatusUpdateListener0.onPeersConnected(room0, arrayList0);
        }
    }

    static final class PeerDeclinedNotifier extends AbstractPeerStatusNotifier {
        PeerDeclinedNotifier(DataHolder dataHolder, String[] participantIds) {
            super(dataHolder, participantIds);
        }

        @Override  // com.google.android.gms.games.internal.GamesClientImpl$AbstractPeerStatusNotifier
        protected void zza(RoomStatusUpdateListener roomStatusUpdateListener0, Room room0, ArrayList arrayList0) {
            roomStatusUpdateListener0.onPeerDeclined(room0, arrayList0);
        }
    }

    static final class PeerDisconnectedNotifier extends AbstractPeerStatusNotifier {
        PeerDisconnectedNotifier(DataHolder dataHolder, String[] participantIds) {
            super(dataHolder, participantIds);
        }

        @Override  // com.google.android.gms.games.internal.GamesClientImpl$AbstractPeerStatusNotifier
        protected void zza(RoomStatusUpdateListener roomStatusUpdateListener0, Room room0, ArrayList arrayList0) {
            roomStatusUpdateListener0.onPeersDisconnected(room0, arrayList0);
        }
    }

    static final class PeerInvitedToRoomNotifier extends AbstractPeerStatusNotifier {
        PeerInvitedToRoomNotifier(DataHolder dataHolder, String[] participantIds) {
            super(dataHolder, participantIds);
        }

        @Override  // com.google.android.gms.games.internal.GamesClientImpl$AbstractPeerStatusNotifier
        protected void zza(RoomStatusUpdateListener roomStatusUpdateListener0, Room room0, ArrayList arrayList0) {
            roomStatusUpdateListener0.onPeerInvitedToRoom(room0, arrayList0);
        }
    }

    static final class PeerJoinedRoomNotifier extends AbstractPeerStatusNotifier {
        PeerJoinedRoomNotifier(DataHolder dataHolder, String[] participantIds) {
            super(dataHolder, participantIds);
        }

        @Override  // com.google.android.gms.games.internal.GamesClientImpl$AbstractPeerStatusNotifier
        protected void zza(RoomStatusUpdateListener roomStatusUpdateListener0, Room room0, ArrayList arrayList0) {
            roomStatusUpdateListener0.onPeerJoined(room0, arrayList0);
        }
    }

    static final class PeerLeftRoomNotifier extends AbstractPeerStatusNotifier {
        PeerLeftRoomNotifier(DataHolder dataHolder, String[] participantIds) {
            super(dataHolder, participantIds);
        }

        @Override  // com.google.android.gms.games.internal.GamesClientImpl$AbstractPeerStatusNotifier
        protected void zza(RoomStatusUpdateListener roomStatusUpdateListener0, Room room0, ArrayList arrayList0) {
            roomStatusUpdateListener0.onPeerLeft(room0, arrayList0);
        }
    }

    static final class PlayerLeaderboardScoreLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        PlayerLeaderboardScoreLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzH(DataHolder dataHolder0) {
            LoadPlayerScoreResultImpl gamesClientImpl$LoadPlayerScoreResultImpl0 = new LoadPlayerScoreResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$LoadPlayerScoreResultImpl0);
        }
    }

    static final class PlayerXpForGameCategoriesLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        PlayerXpForGameCategoriesLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzf(int v, Bundle bundle0) {
            bundle0.setClassLoader(this.getClass().getClassLoader());
            LoadXpForGameCategoriesResultImpl gamesClientImpl$LoadXpForGameCategoriesResultImpl0 = new LoadXpForGameCategoriesResultImpl(GamesStatusCodes.zzfn(v), bundle0);
            this.zzOs.zzm(gamesClientImpl$LoadXpForGameCategoriesResultImpl0);
        }
    }

    static final class PlayerXpStreamLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        PlayerXpStreamLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzS(DataHolder dataHolder0) {
            LoadXpStreamResultImpl gamesClientImpl$LoadXpStreamResultImpl0 = new LoadXpStreamResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$LoadXpStreamResultImpl0);
        }
    }

    static final class PlayersLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        PlayersLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzj(DataHolder dataHolder0) {
            LoadPlayersResultImpl gamesClientImpl$LoadPlayersResultImpl0 = new LoadPlayersResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$LoadPlayersResultImpl0);
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzk(DataHolder dataHolder0) {
            LoadPlayersResultImpl gamesClientImpl$LoadPlayersResultImpl0 = new LoadPlayersResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$LoadPlayersResultImpl0);
        }
    }

    static final class PopupLocationInfoBinderCallbacks extends AbstractGamesClient {
        private final PopupManager zzaoU;

        public PopupLocationInfoBinderCallbacks(PopupManager popupManager) {
            this.zzaoU = popupManager;
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesClient
        public PopupLocationInfoParcelable zzsq() {
            return new PopupLocationInfoParcelable(this.zzaoU.zztg());
        }
    }

    static final class ProfileSettingsLoadedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        ProfileSettingsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzT(DataHolder dataHolder0) {
            LoadProfileSettingsResultImpl gamesClientImpl$LoadProfileSettingsResultImpl0 = new LoadProfileSettingsResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$LoadProfileSettingsResultImpl0);
        }
    }

    static final class ProfileSettingsUpdatedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        ProfileSettingsUpdatedBinderCallback(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzfA(int v) {
            Status status0 = GamesStatusCodes.zzfn(v);
            this.zzOs.zzm(status0);
        }
    }

    static final class QuestAcceptedBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzapP;

        public QuestAcceptedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzapP = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzO(DataHolder dataHolder0) {
            AcceptQuestResultImpl gamesClientImpl$AcceptQuestResultImpl0 = new AcceptQuestResultImpl(dataHolder0);
            this.zzapP.zzm(gamesClientImpl$AcceptQuestResultImpl0);
        }
    }

    static final class QuestCompletedNotifier implements com.google.android.gms.common.api.zzi.zzb {
        private final Quest zzapb;

        QuestCompletedNotifier(Quest quest) {
            this.zzapb = quest;
        }

        public void zza(QuestUpdateListener questUpdateListener0) {
            questUpdateListener0.onQuestCompleted(this.zzapb);
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzmw() {
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzn(Object object0) {
            this.zza(((QuestUpdateListener)object0));
        }
    }

    static final class QuestMilestoneClaimBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzapQ;
        private final String zzapR;

        public QuestMilestoneClaimBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0, String milestoneId) {
            this.zzapQ = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
            this.zzapR = (String)zzu.zzb(milestoneId, "MilestoneId must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzN(DataHolder dataHolder0) {
            ClaimMilestoneResultImpl gamesClientImpl$ClaimMilestoneResultImpl0 = new ClaimMilestoneResultImpl(dataHolder0, this.zzapR);
            this.zzapQ.zzm(gamesClientImpl$ClaimMilestoneResultImpl0);
        }
    }

    static final class QuestUpdateBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zzi zzafi;

        QuestUpdateBinderCallback(com.google.android.gms.common.api.zzi zzi0) {
            this.zzafi = zzi0;
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzP(DataHolder dataHolder0) {
            Quest quest0 = this.zzW(dataHolder0);
            if(quest0 != null) {
                QuestCompletedNotifier gamesClientImpl$QuestCompletedNotifier0 = new QuestCompletedNotifier(quest0);
                this.zzafi.zza(gamesClientImpl$QuestCompletedNotifier0);
            }
        }

        private Quest zzW(DataHolder dataHolder0) {
            QuestBuffer questBuffer0 = new QuestBuffer(dataHolder0);
            Quest quest0 = null;
            try {
                if(questBuffer0.getCount() > 0) {
                    quest0 = (Quest)((Quest)questBuffer0.get(0)).freeze();
                }
                return quest0;
            }
            finally {
                questBuffer0.release();
            }
        }
    }

    static final class QuestsLoadedBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzapS;

        public QuestsLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzapS = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzR(DataHolder dataHolder0) {
            LoadQuestsResultImpl gamesClientImpl$LoadQuestsResultImpl0 = new LoadQuestsResultImpl(dataHolder0);
            this.zzapS.zzm(gamesClientImpl$LoadQuestsResultImpl0);
        }
    }

    static final class RealTimeMessageSentNotifier implements com.google.android.gms.common.api.zzi.zzb {
        private final int zzTS;
        private final String zzapT;
        private final int zzapU;

        RealTimeMessageSentNotifier(int statusCode, int token, String recipientParticipantId) {
            this.zzTS = statusCode;
            this.zzapU = token;
            this.zzapT = recipientParticipantId;
        }

        public void zza(ReliableMessageSentCallback realTimeMultiplayer$ReliableMessageSentCallback0) {
            if(realTimeMultiplayer$ReliableMessageSentCallback0 != null) {
                realTimeMultiplayer$ReliableMessageSentCallback0.onRealTimeMessageSent(this.zzTS, this.zzapU, this.zzapT);
            }
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzmw() {
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzn(Object object0) {
            this.zza(((ReliableMessageSentCallback)object0));
        }
    }

    static final class RealTimeReliableMessageBinderCallbacks extends AbstractGamesCallbacks {
        final com.google.android.gms.common.api.zzi zzapV;

        public RealTimeReliableMessageBinderCallbacks(com.google.android.gms.common.api.zzi zzi0) {
            this.zzapV = zzi0;
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzb(int v, int v1, String s) {
            if(this.zzapV != null) {
                RealTimeMessageSentNotifier gamesClientImpl$RealTimeMessageSentNotifier0 = new RealTimeMessageSentNotifier(v, v1, s);
                this.zzapV.zza(gamesClientImpl$RealTimeMessageSentNotifier0);
            }
        }
    }

    static final class RequestReceivedBinderCallback extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zzi zzafi;

        RequestReceivedBinderCallback(com.google.android.gms.common.api.zzi zzi0) {
            this.zzafi = zzi0;
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void onRequestRemoved(String requestId) {
            RequestRemovedNotifier gamesClientImpl$RequestRemovedNotifier0 = new RequestRemovedNotifier(requestId);
            this.zzafi.zza(gamesClientImpl$RequestRemovedNotifier0);
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzr(DataHolder dataHolder0) {
            GameRequestBuffer gameRequestBuffer0 = new GameRequestBuffer(dataHolder0);
            GameRequest gameRequest0 = null;
            try {
                if(gameRequestBuffer0.getCount() > 0) {
                    gameRequest0 = (GameRequest)((GameRequest)gameRequestBuffer0.get(0)).freeze();
                }
            }
            finally {
                gameRequestBuffer0.release();
            }
            if(gameRequest0 != null) {
                RequestReceivedNotifier gamesClientImpl$RequestReceivedNotifier0 = new RequestReceivedNotifier(gameRequest0);
                this.zzafi.zza(gamesClientImpl$RequestReceivedNotifier0);
            }
        }
    }

    static final class RequestReceivedNotifier implements com.google.android.gms.common.api.zzi.zzb {
        private final GameRequest zzapW;

        RequestReceivedNotifier(GameRequest request) {
            this.zzapW = request;
        }

        public void zza(OnRequestReceivedListener onRequestReceivedListener0) {
            onRequestReceivedListener0.onRequestReceived(this.zzapW);
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzmw() {
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzn(Object object0) {
            this.zza(((OnRequestReceivedListener)object0));
        }
    }

    static final class RequestRemovedNotifier implements com.google.android.gms.common.api.zzi.zzb {
        private final String zzDK;

        RequestRemovedNotifier(String requestId) {
            this.zzDK = requestId;
        }

        public void zza(OnRequestReceivedListener onRequestReceivedListener0) {
            onRequestReceivedListener0.onRequestRemoved(this.zzDK);
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzmw() {
        }

        @Override  // com.google.android.gms.common.api.zzi$zzb
        public void zzn(Object object0) {
            this.zza(((OnRequestReceivedListener)object0));
        }
    }

    static final class RequestSentBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzapX;

        public RequestSentBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzapX = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzJ(DataHolder dataHolder0) {
            SendRequestResultImpl gamesClientImpl$SendRequestResultImpl0 = new SendRequestResultImpl(dataHolder0);
            this.zzapX.zzm(gamesClientImpl$SendRequestResultImpl0);
        }
    }

    static final class RequestSummariesLoadedBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzapY;

        public RequestSummariesLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzapY = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzK(DataHolder dataHolder0) {
            LoadRequestSummariesResultImpl gamesClientImpl$LoadRequestSummariesResultImpl0 = new LoadRequestSummariesResultImpl(dataHolder0);
            this.zzapY.zzm(gamesClientImpl$LoadRequestSummariesResultImpl0);
        }
    }

    static final class RequestsLoadedBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzapZ;

        public RequestsLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzapZ = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzd(int v, Bundle bundle0) {
            bundle0.setClassLoader(this.getClass().getClassLoader());
            LoadRequestsResultImpl gamesClientImpl$LoadRequestsResultImpl0 = new LoadRequestsResultImpl(GamesStatusCodes.zzfn(v), bundle0);
            this.zzapZ.zzm(gamesClientImpl$LoadRequestsResultImpl0);
        }
    }

    static final class RequestsUpdatedBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzaqa;

        public RequestsUpdatedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzaqa = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzI(DataHolder dataHolder0) {
            UpdateRequestsResultImpl gamesClientImpl$UpdateRequestsResultImpl0 = new UpdateRequestsResultImpl(dataHolder0);
            this.zzaqa.zzm(gamesClientImpl$UpdateRequestsResultImpl0);
        }
    }

    static final class RoomAutoMatchingNotifier extends AbstractRoomStatusNotifier {
        RoomAutoMatchingNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override  // com.google.android.gms.games.internal.GamesClientImpl$AbstractRoomStatusNotifier
        public void zza(RoomStatusUpdateListener roomStatusUpdateListener0, Room room0) {
            roomStatusUpdateListener0.onRoomAutoMatching(room0);
        }
    }

    static final class RoomBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zzi zzaqb;
        private final com.google.android.gms.common.api.zzi zzaqc;
        private final com.google.android.gms.common.api.zzi zzaqd;

        public RoomBinderCallbacks(com.google.android.gms.common.api.zzi zzi0) {
            this.zzaqb = (com.google.android.gms.common.api.zzi)zzu.zzb(zzi0, "Callbacks must not be null");
            this.zzaqc = null;
            this.zzaqd = null;
        }

        public RoomBinderCallbacks(com.google.android.gms.common.api.zzi zzi0, com.google.android.gms.common.api.zzi zzi1, com.google.android.gms.common.api.zzi zzi2) {
            this.zzaqb = (com.google.android.gms.common.api.zzi)zzu.zzb(zzi0, "Callbacks must not be null");
            this.zzaqc = zzi1;
            this.zzaqd = zzi2;
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void onLeftRoom(int statusCode, String externalRoomId) {
            LeftRoomNotifier gamesClientImpl$LeftRoomNotifier0 = new LeftRoomNotifier(statusCode, externalRoomId);
            this.zzaqb.zza(gamesClientImpl$LeftRoomNotifier0);
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void onP2PConnected(String participantId) {
            if(this.zzaqc != null) {
                P2PConnectedNotifier gamesClientImpl$P2PConnectedNotifier0 = new P2PConnectedNotifier(participantId);
                this.zzaqc.zza(gamesClientImpl$P2PConnectedNotifier0);
            }
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void onP2PDisconnected(String participantId) {
            if(this.zzaqc != null) {
                P2PDisconnectedNotifier gamesClientImpl$P2PDisconnectedNotifier0 = new P2PDisconnectedNotifier(participantId);
                this.zzaqc.zza(gamesClientImpl$P2PDisconnectedNotifier0);
            }
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void onRealTimeMessageReceived(RealTimeMessage message) {
            if(this.zzaqd != null) {
                MessageReceivedNotifier gamesClientImpl$MessageReceivedNotifier0 = new MessageReceivedNotifier(message);
                this.zzaqd.zza(gamesClientImpl$MessageReceivedNotifier0);
            }
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzA(DataHolder dataHolder0) {
            if(this.zzaqc != null) {
                RoomAutoMatchingNotifier gamesClientImpl$RoomAutoMatchingNotifier0 = new RoomAutoMatchingNotifier(dataHolder0);
                this.zzaqc.zza(gamesClientImpl$RoomAutoMatchingNotifier0);
            }
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzB(DataHolder dataHolder0) {
            RoomConnectedNotifier gamesClientImpl$RoomConnectedNotifier0 = new RoomConnectedNotifier(dataHolder0);
            this.zzaqb.zza(gamesClientImpl$RoomConnectedNotifier0);
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzC(DataHolder dataHolder0) {
            if(this.zzaqc != null) {
                ConnectedToRoomNotifier gamesClientImpl$ConnectedToRoomNotifier0 = new ConnectedToRoomNotifier(dataHolder0);
                this.zzaqc.zza(gamesClientImpl$ConnectedToRoomNotifier0);
            }
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzD(DataHolder dataHolder0) {
            if(this.zzaqc != null) {
                DisconnectedFromRoomNotifier gamesClientImpl$DisconnectedFromRoomNotifier0 = new DisconnectedFromRoomNotifier(dataHolder0);
                this.zzaqc.zza(gamesClientImpl$DisconnectedFromRoomNotifier0);
            }
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zza(DataHolder dataHolder0, String[] arr_s) {
            if(this.zzaqc != null) {
                PeerInvitedToRoomNotifier gamesClientImpl$PeerInvitedToRoomNotifier0 = new PeerInvitedToRoomNotifier(dataHolder0, arr_s);
                this.zzaqc.zza(gamesClientImpl$PeerInvitedToRoomNotifier0);
            }
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzb(DataHolder dataHolder0, String[] arr_s) {
            if(this.zzaqc != null) {
                PeerJoinedRoomNotifier gamesClientImpl$PeerJoinedRoomNotifier0 = new PeerJoinedRoomNotifier(dataHolder0, arr_s);
                this.zzaqc.zza(gamesClientImpl$PeerJoinedRoomNotifier0);
            }
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzc(DataHolder dataHolder0, String[] arr_s) {
            if(this.zzaqc != null) {
                PeerLeftRoomNotifier gamesClientImpl$PeerLeftRoomNotifier0 = new PeerLeftRoomNotifier(dataHolder0, arr_s);
                this.zzaqc.zza(gamesClientImpl$PeerLeftRoomNotifier0);
            }
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzd(DataHolder dataHolder0, String[] arr_s) {
            if(this.zzaqc != null) {
                PeerDeclinedNotifier gamesClientImpl$PeerDeclinedNotifier0 = new PeerDeclinedNotifier(dataHolder0, arr_s);
                this.zzaqc.zza(gamesClientImpl$PeerDeclinedNotifier0);
            }
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zze(DataHolder dataHolder0, String[] arr_s) {
            if(this.zzaqc != null) {
                PeerConnectedNotifier gamesClientImpl$PeerConnectedNotifier0 = new PeerConnectedNotifier(dataHolder0, arr_s);
                this.zzaqc.zza(gamesClientImpl$PeerConnectedNotifier0);
            }
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzf(DataHolder dataHolder0, String[] arr_s) {
            if(this.zzaqc != null) {
                PeerDisconnectedNotifier gamesClientImpl$PeerDisconnectedNotifier0 = new PeerDisconnectedNotifier(dataHolder0, arr_s);
                this.zzaqc.zza(gamesClientImpl$PeerDisconnectedNotifier0);
            }
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzx(DataHolder dataHolder0) {
            RoomCreatedNotifier gamesClientImpl$RoomCreatedNotifier0 = new RoomCreatedNotifier(dataHolder0);
            this.zzaqb.zza(gamesClientImpl$RoomCreatedNotifier0);
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzy(DataHolder dataHolder0) {
            JoinedRoomNotifier gamesClientImpl$JoinedRoomNotifier0 = new JoinedRoomNotifier(dataHolder0);
            this.zzaqb.zza(gamesClientImpl$JoinedRoomNotifier0);
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzz(DataHolder dataHolder0) {
            if(this.zzaqc != null) {
                RoomConnectingNotifier gamesClientImpl$RoomConnectingNotifier0 = new RoomConnectingNotifier(dataHolder0);
                this.zzaqc.zza(gamesClientImpl$RoomConnectingNotifier0);
            }
        }
    }

    static final class RoomConnectedNotifier extends AbstractRoomNotifier {
        RoomConnectedNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override  // com.google.android.gms.games.internal.GamesClientImpl$AbstractRoomNotifier
        public void zza(RoomUpdateListener roomUpdateListener0, Room room0, int v) {
            roomUpdateListener0.onRoomConnected(v, room0);
        }
    }

    static final class RoomConnectingNotifier extends AbstractRoomStatusNotifier {
        RoomConnectingNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override  // com.google.android.gms.games.internal.GamesClientImpl$AbstractRoomStatusNotifier
        public void zza(RoomStatusUpdateListener roomStatusUpdateListener0, Room room0) {
            roomStatusUpdateListener0.onRoomConnecting(room0);
        }
    }

    static final class RoomCreatedNotifier extends AbstractRoomNotifier {
        public RoomCreatedNotifier(DataHolder dataHolder) {
            super(dataHolder);
        }

        @Override  // com.google.android.gms.games.internal.GamesClientImpl$AbstractRoomNotifier
        public void zza(RoomUpdateListener roomUpdateListener0, Room room0, int v) {
            roomUpdateListener0.onRoomCreated(v, room0);
        }
    }

    static final class SendRequestResultImpl extends GamesDataHolderResult implements SendRequestResult {
        private final GameRequest zzapW;

        SendRequestResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            GameRequestBuffer gameRequestBuffer0 = new GameRequestBuffer(dataHolder);
            try {
                this.zzapW = gameRequestBuffer0.getCount() > 0 ? ((GameRequest)((GameRequest)gameRequestBuffer0.get(0)).freeze()) : null;
            }
            finally {
                gameRequestBuffer0.release();
            }
        }
    }

    static final class SignOutCompleteBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public SignOutCompleteBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzkU() {
            Status status0 = GamesStatusCodes.zzfn(0);
            this.zzOs.zzm(status0);
        }
    }

    static final class SnapshotCommittedBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzaqe;

        public SnapshotCommittedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzaqe = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzM(DataHolder dataHolder0) {
            CommitSnapshotResultImpl gamesClientImpl$CommitSnapshotResultImpl0 = new CommitSnapshotResultImpl(dataHolder0);
            this.zzaqe.zzm(gamesClientImpl$CommitSnapshotResultImpl0);
        }
    }

    static final class SnapshotDeletedBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public SnapshotDeletedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzh(int v, String s) {
            DeleteSnapshotResultImpl gamesClientImpl$DeleteSnapshotResultImpl0 = new DeleteSnapshotResultImpl(v, s);
            this.zzOs.zzm(gamesClientImpl$DeleteSnapshotResultImpl0);
        }
    }

    static final class SnapshotOpenedBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzaqf;

        public SnapshotOpenedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzaqf = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zza(DataHolder dataHolder0, Contents contents0) {
            OpenSnapshotResultImpl gamesClientImpl$OpenSnapshotResultImpl0 = new OpenSnapshotResultImpl(dataHolder0, contents0);
            this.zzaqf.zzm(gamesClientImpl$OpenSnapshotResultImpl0);
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zza(DataHolder dataHolder0, String s, Contents contents0, Contents contents1, Contents contents2) {
            OpenSnapshotResultImpl gamesClientImpl$OpenSnapshotResultImpl0 = new OpenSnapshotResultImpl(dataHolder0, s, contents0, contents1, contents2);
            this.zzaqf.zzm(gamesClientImpl$OpenSnapshotResultImpl0);
        }
    }

    static final class SnapshotsLoadedBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzaqg;

        public SnapshotsLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzaqg = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzL(DataHolder dataHolder0) {
            LoadSnapshotsResultImpl gamesClientImpl$LoadSnapshotsResultImpl0 = new LoadSnapshotsResultImpl(dataHolder0);
            this.zzaqg.zzm(gamesClientImpl$LoadSnapshotsResultImpl0);
        }
    }

    static final class SubmitScoreBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public SubmitScoreBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzi(DataHolder dataHolder0) {
            SubmitScoreResultImpl gamesClientImpl$SubmitScoreResultImpl0 = new SubmitScoreResultImpl(dataHolder0);
            this.zzOs.zzm(gamesClientImpl$SubmitScoreResultImpl0);
        }
    }

    static final class SubmitScoreResultImpl extends GamesDataHolderResult implements SubmitScoreResult {
        private final ScoreSubmissionData zzaqh;

        public SubmitScoreResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            try {
                this.zzaqh = new ScoreSubmissionData(dataHolder);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(dataHolder, throwable0);
                throw throwable0;
            }
            dataHolder.close();
        }

        @Override  // com.google.android.gms.games.leaderboard.Leaderboards$SubmitScoreResult
        public ScoreSubmissionData getScoreData() {
            return this.zzaqh;
        }
    }

    static final class TurnBasedMatchCanceledBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzaqi;

        public TurnBasedMatchCanceledBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzaqi = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzg(int v, String s) {
            CancelMatchResultImpl gamesClientImpl$CancelMatchResultImpl0 = new CancelMatchResultImpl(GamesStatusCodes.zzfn(v), s);
            this.zzaqi.zzm(gamesClientImpl$CancelMatchResultImpl0);
        }
    }

    static final class TurnBasedMatchInitiatedBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzaqj;

        public TurnBasedMatchInitiatedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzaqj = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzt(DataHolder dataHolder0) {
            InitiateMatchResultImpl gamesClientImpl$InitiateMatchResultImpl0 = new InitiateMatchResultImpl(dataHolder0);
            this.zzaqj.zzm(gamesClientImpl$InitiateMatchResultImpl0);
        }
    }

    static final class TurnBasedMatchLeftBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzaqk;

        public TurnBasedMatchLeftBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzaqk = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzv(DataHolder dataHolder0) {
            LeaveMatchResultImpl gamesClientImpl$LeaveMatchResultImpl0 = new LeaveMatchResultImpl(dataHolder0);
            this.zzaqk.zzm(gamesClientImpl$LeaveMatchResultImpl0);
        }
    }

    static final class TurnBasedMatchLoadedBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzaql;

        public TurnBasedMatchLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzaql = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzs(DataHolder dataHolder0) {
            LoadMatchResultImpl gamesClientImpl$LoadMatchResultImpl0 = new LoadMatchResultImpl(dataHolder0);
            this.zzaql.zzm(gamesClientImpl$LoadMatchResultImpl0);
        }
    }

    static abstract class TurnBasedMatchResult extends GamesDataHolderResult {
        final TurnBasedMatch zzapG;

        TurnBasedMatchResult(DataHolder dataHolder) {
            super(dataHolder);
            TurnBasedMatchBuffer turnBasedMatchBuffer0 = new TurnBasedMatchBuffer(dataHolder);
            try {
                this.zzapG = turnBasedMatchBuffer0.getCount() > 0 ? ((TurnBasedMatch)((TurnBasedMatch)turnBasedMatchBuffer0.get(0)).freeze()) : null;
            }
            finally {
                turnBasedMatchBuffer0.release();
            }
        }

        public TurnBasedMatch getMatch() {
            return this.zzapG;
        }
    }

    static final class TurnBasedMatchUpdatedBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzaqm;

        public TurnBasedMatchUpdatedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzaqm = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzu(DataHolder dataHolder0) {
            UpdateMatchResultImpl gamesClientImpl$UpdateMatchResultImpl0 = new UpdateMatchResultImpl(dataHolder0);
            this.zzaqm.zzm(gamesClientImpl$UpdateMatchResultImpl0);
        }
    }

    static final class TurnBasedMatchesLoadedBinderCallbacks extends AbstractGamesCallbacks {
        private final com.google.android.gms.common.api.zza.zzb zzaqn;

        public TurnBasedMatchesLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzaqn = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zza$zzb0, "Holder must not be null");
        }

        @Override  // com.google.android.gms.games.internal.AbstractGamesCallbacks
        public void zzc(int v, Bundle bundle0) {
            bundle0.setClassLoader(this.getClass().getClassLoader());
            LoadMatchesResultImpl gamesClientImpl$LoadMatchesResultImpl0 = new LoadMatchesResultImpl(GamesStatusCodes.zzfn(v), bundle0);
            this.zzaqn.zzm(gamesClientImpl$LoadMatchesResultImpl0);
        }
    }

    static final class UpdateAchievementResultImpl implements UpdateAchievementResult {
        private final Status zzOt;
        private final String zzanZ;

        UpdateAchievementResultImpl(int statusCode, String achievementId) {
            this.zzOt = GamesStatusCodes.zzfn(statusCode);
            this.zzanZ = achievementId;
        }

        @Override  // com.google.android.gms.games.achievement.Achievements$UpdateAchievementResult
        public String getAchievementId() {
            return this.zzanZ;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static final class UpdateMatchResultImpl extends TurnBasedMatchResult implements UpdateMatchResult {
        UpdateMatchResultImpl(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    static final class UpdateRequestsResultImpl extends GamesDataHolderResult implements UpdateRequestsResult {
        private final RequestUpdateOutcomes zzaqo;

        UpdateRequestsResultImpl(DataHolder dataHolder) {
            super(dataHolder);
            this.zzaqo = RequestUpdateOutcomes.zzX(dataHolder);
        }

        @Override  // com.google.android.gms.games.request.Requests$UpdateRequestsResult
        public Set getRequestIds() {
            return this.zzaqo.getRequestIds();
        }

        @Override  // com.google.android.gms.games.request.Requests$UpdateRequestsResult
        public int getRequestOutcome(String requestId) {
            return this.zzaqo.getRequestOutcome(requestId);
        }
    }

    EventIncrementManager zzaoQ;
    private final String zzaoR;
    private PlayerEntity zzaoS;
    private GameEntity zzaoT;
    private final PopupManager zzaoU;
    private boolean zzaoV;
    private final Binder zzaoW;
    private final long zzaoX;
    private final GamesOptions zzaoY;

    public GamesClientImpl(Context context, Looper looper, zze clientSettings, GamesOptions options, ConnectionCallbacks connectedListener, OnConnectionFailedListener connectionFailedListener) {
        super(context, looper, 1, connectedListener, connectionFailedListener, clientSettings);
        this.zzaoQ = new EventIncrementManager() {
            @Override  // com.google.android.gms.games.internal.events.EventIncrementManager
            public EventIncrementCache zzsS() {
                return new GameClientEventIncrementCache(GamesClientImpl.this);
            }
        };
        this.zzaoV = false;
        this.zzaoR = clientSettings.zzny();
        this.zzaoW = new Binder();
        this.zzaoU = PopupManager.zza(this, clientSettings.zznu());
        this.zzn(clientSettings.zznA());
        this.zzaoX = (long)this.hashCode();
        this.zzaoY = options;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public void connect(ConnectionProgressReportCallbacks callbacks) {
        this.zzst();
        super.connect(callbacks);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public void disconnect() {
        this.zzaoV = false;
        if(this.isConnected()) {
            try {
                IGamesService iGamesService0 = (IGamesService)this.zznM();
                iGamesService0.zzsR();
                this.zzaoQ.flush();
                iGamesService0.zzE(this.zzaoX);
            }
            catch(RemoteException unused_ex) {
                GamesLog.zzu("GamesClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.disconnect();
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.games.service.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public void onConnectionFailed(ConnectionResult result) {
        super.onConnectionFailed(result);
        this.zzaoV = false;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public boolean requiresSignIn() {
        return true;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzbJ(iBinder0);
    }

    private static Room zzU(DataHolder dataHolder0) {
        RoomBuffer roomBuffer0 = new RoomBuffer(dataHolder0);
        Room room0 = null;
        try {
            if(roomBuffer0.getCount() > 0) {
                room0 = (Room)((Room)roomBuffer0.get(0)).freeze();
            }
            return room0;
        }
        finally {
            roomBuffer0.release();
        }
    }

    public int zza(com.google.android.gms.common.api.zzi zzi0, byte[] arr_b, String s, String s1) {
        try {
            return ((IGamesService)this.zznM()).zza(new RealTimeReliableMessageBinderCallbacks(zzi0), arr_b, s, s1);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return -1;
        }
    }

    public int zza(byte[] arr_b, String s, String[] arr_s) {
        zzu.zzb(arr_s, "Participant IDs must not be null");
        try {
            return ((IGamesService)this.zznM()).zzb(arr_b, s, arr_s);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return -1;
        }
    }

    public Intent zza(int v, byte[] arr_b, int v1, Bitmap bitmap0, String s) {
        try {
            Intent intent0 = ((IGamesService)this.zznM()).zza(v, arr_b, v1, s);
            zzu.zzb(bitmap0, "Must provide a non null icon");
            intent0.putExtra("com.google.android.gms.games.REQUEST_ITEM_ICON", bitmap0);
            return intent0;
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public Intent zza(PlayerEntity playerEntity0) {
        try {
            return ((IGamesService)this.zznM()).zza(playerEntity0);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public Intent zza(Room room0, int v) {
        try {
            return ((IGamesService)this.zznM()).zza(((RoomEntity)room0.freeze()), v);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public Intent zza(String s, boolean z, boolean z1, int v) {
        try {
            return ((IGamesService)this.zznM()).zza(s, z, z1, v);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected Set zza(Set set0) {
        boolean z1;
        int v1;
        Scope scope0 = new Scope("https://www.googleapis.com/auth/games");
        Scope scope1 = new Scope("https://www.googleapis.com/auth/games.firstparty");
        int v = 0;
        boolean z = false;
        for(Object object0: set0) {
            Scope scope2 = (Scope)object0;
            if(scope2.equals(scope0)) {
                v1 = v;
                z1 = true;
            }
            else {
                v1 = scope2.equals(scope1) ? 1 : v;
                z1 = z;
            }
            z = z1;
            v = v1;
        }
        if(v != 0) {
            zzu.zza(!z, "Cannot have both %s and %s!", new Object[]{"https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty"});
            return set0;
        }
        zzu.zza(z, "Games APIs requires %s to function.", new Object[]{"https://www.googleapis.com/auth/games"});
        return set0;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected void zza(int v, IBinder iBinder0, Bundle bundle0, int v1) {
        if(v == 0 && bundle0 != null) {
            bundle0.setClassLoader(GamesClientImpl.class.getClassLoader());
            this.zzaoV = bundle0.getBoolean("show_welcome_popup");
            this.zzaoS = (PlayerEntity)bundle0.getParcelable("com.google.android.gms.games.current_player");
            this.zzaoT = (GameEntity)bundle0.getParcelable("com.google.android.gms.games.current_game");
        }
        super.zza(v, iBinder0, bundle0, v1);
    }

    public void zza(IBinder iBinder0, Bundle bundle0) {
        if(this.isConnected()) {
            try {
                ((IGamesService)this.zznM()).zza(iBinder0, bundle0);
            }
            catch(RemoteException remoteException0) {
                this.zzb(remoteException0);
            }
        }
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, int v, int v1, int v2) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new RequestsLoadedBinderCallbacks(zza$zzb0), v, v1, v2);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, int v, String s, String[] arr_s, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new AppContentLoadedBinderCallbacks(zza$zzb0), v, s, arr_s, z);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, int v, boolean z, boolean z1) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new PlayersLoadedBinderCallback(zza$zzb0), v, z, z1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, int v, int[] arr_v) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new TurnBasedMatchesLoadedBinderCallbacks(zza$zzb0), v, arr_v);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, LeaderboardScoreBuffer leaderboardScoreBuffer0, int v, int v1) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new LeaderboardScoresLoadedBinderCallback(zza$zzb0), leaderboardScoreBuffer0.zztF().asBundle(), v, v1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, TurnBasedMatchConfig turnBasedMatchConfig0) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new TurnBasedMatchInitiatedBinderCallbacks(zza$zzb0), turnBasedMatchConfig0.getVariant(), turnBasedMatchConfig0.zztL(), turnBasedMatchConfig0.getInvitedPlayerIds(), turnBasedMatchConfig0.getAutoMatchCriteria());
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, Snapshot snapshot0, SnapshotMetadataChange snapshotMetadataChange0) throws RemoteException {
        SnapshotContents snapshotContents0 = snapshot0.getSnapshotContents();
        zzu.zza(!snapshotContents0.isClosed(), "Snapshot already closed");
        BitmapTeleporter bitmapTeleporter0 = snapshotMetadataChange0.zztQ();
        if(bitmapTeleporter0 != null) {
            bitmapTeleporter0.zzc(this.getContext().getCacheDir());
        }
        Contents contents0 = snapshotContents0.zzpe();
        snapshotContents0.close();
        ((IGamesService)this.zznM()).zza(new SnapshotCommittedBinderCallbacks(zza$zzb0), snapshot0.getMetadata().getSnapshotId(), ((SnapshotMetadataChangeEntity)snapshotMetadataChange0), contents0);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        AchievementUpdatedBinderCallback gamesClientImpl$AchievementUpdatedBinderCallback0 = zza$zzb0 == null ? null : new AchievementUpdatedBinderCallback(zza$zzb0);
        ((IGamesService)this.zznM()).zza(gamesClientImpl$AchievementUpdatedBinderCallback0, s, this.zzaoU.zztf(), this.zzaoU.zzte());
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, int v) throws RemoteException {
        AchievementUpdatedBinderCallback gamesClientImpl$AchievementUpdatedBinderCallback0 = zza$zzb0 == null ? null : new AchievementUpdatedBinderCallback(zza$zzb0);
        IGamesService iGamesService0 = (IGamesService)this.zznM();
        Bundle bundle0 = this.zzaoU.zzte();
        iGamesService0.zza(gamesClientImpl$AchievementUpdatedBinderCallback0, s, v, this.zzaoU.zztf(), bundle0);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, int v, int v1, int v2, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new LeaderboardScoresLoadedBinderCallback(zza$zzb0), s, v, v1, v2, z);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, int v, boolean z, boolean z1) throws RemoteException {
        if(s.hashCode() != 156408498 || !s.equals("played_with")) {
            throw new IllegalArgumentException("Invalid player collection: " + s);
        }
        ((IGamesService)this.zznM()).zzd(new PlayersLoadedBinderCallback(zza$zzb0), s, v, z, z1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, int v, int[] arr_v) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new TurnBasedMatchesLoadedBinderCallbacks(zza$zzb0), s, v, arr_v);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, long v, String s1) throws RemoteException {
        SubmitScoreBinderCallbacks gamesClientImpl$SubmitScoreBinderCallbacks0 = zza$zzb0 == null ? null : new SubmitScoreBinderCallbacks(zza$zzb0);
        ((IGamesService)this.zznM()).zza(gamesClientImpl$SubmitScoreBinderCallbacks0, s, v, s1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1) throws RemoteException {
        ((IGamesService)this.zznM()).zzc(new TurnBasedMatchLeftBinderCallbacks(zza$zzb0), s, s1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1, int v, int v1) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new PlayerLeaderboardScoreLoadedBinderCallback(zza$zzb0), s, s1, v, v1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1, int v, int v1, int v2) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new RequestsLoadedBinderCallbacks(zza$zzb0), s, s1, v, v1, v2);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1, int v, int v1, int v2, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new LeaderboardScoresLoadedBinderCallback(zza$zzb0), s, s1, v, v1, v2, z);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1, int v, boolean z, boolean z1) throws RemoteException {
        int v1 = -1;
        switch(s) {
            case "circled": {
                v1 = 0;
                break;
            }
            case "nearby": {
                v1 = 2;
                break;
            }
            case "played_with": {
                v1 = 1;
            }
        }
        if(v1 != 0 && v1 != 1 && v1 != 2) {
            throw new IllegalArgumentException("Invalid player collection: " + s);
        }
        ((IGamesService)this.zznM()).zza(new PlayersLoadedBinderCallback(zza$zzb0), s, s1, v, z, z1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1, SnapshotMetadataChange snapshotMetadataChange0, SnapshotContents snapshotContents0) throws RemoteException {
        zzu.zza(!snapshotContents0.isClosed(), "SnapshotContents already closed");
        BitmapTeleporter bitmapTeleporter0 = snapshotMetadataChange0.zztQ();
        if(bitmapTeleporter0 != null) {
            bitmapTeleporter0.zzc(this.getContext().getCacheDir());
        }
        Contents contents0 = snapshotContents0.zzpe();
        snapshotContents0.close();
        ((IGamesService)this.zznM()).zza(new SnapshotOpenedBinderCallbacks(zza$zzb0), s, s1, ((SnapshotMetadataChangeEntity)snapshotMetadataChange0), contents0);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zzb(new LeaderboardsLoadedBinderCallback(zza$zzb0), s, s1, z);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1, boolean z, String[] arr_s) throws RemoteException {
        this.zzaoQ.flush();
        ((IGamesService)this.zznM()).zza(new QuestsLoadedBinderCallbacks(zza$zzb0), s, s1, arr_s, z);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1, int[] arr_v, int v, boolean z) throws RemoteException {
        this.zzaoQ.flush();
        ((IGamesService)this.zznM()).zza(new QuestsLoadedBinderCallbacks(zza$zzb0), s, s1, arr_v, v, z);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1, String[] arr_s) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new RequestsUpdatedBinderCallbacks(zza$zzb0), s, s1, arr_s);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zzf(new PlayersLoadedBinderCallback(zza$zzb0), s, z);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, boolean z, int v) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new SnapshotOpenedBinderCallbacks(zza$zzb0), s, z, v);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, byte[] arr_b, String s1, ParticipantResult[] arr_participantResult) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new TurnBasedMatchUpdatedBinderCallbacks(zza$zzb0), s, arr_b, s1, arr_participantResult);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, byte[] arr_b, ParticipantResult[] arr_participantResult) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new TurnBasedMatchUpdatedBinderCallbacks(zza$zzb0), s, arr_b, arr_participantResult);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String[] arr_s, int v, byte[] arr_b, int v1) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new RequestSentBinderCallbacks(zza$zzb0), s, arr_s, v, arr_b, v1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zzc(new PlayersLoadedBinderCallback(zza$zzb0), z);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, boolean z, Bundle bundle0) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new ContactSettingsUpdatedBinderCallback(zza$zzb0), z, bundle0);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, boolean z, String[] arr_s) throws RemoteException {
        this.zzaoQ.flush();
        ((IGamesService)this.zznM()).zza(new EventsLoadedBinderCallback(zza$zzb0), z, arr_s);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, int[] arr_v, int v, boolean z) throws RemoteException {
        this.zzaoQ.flush();
        ((IGamesService)this.zznM()).zza(new QuestsLoadedBinderCallbacks(zza$zzb0), arr_v, v, z);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, String[] arr_s) throws RemoteException {
        ((IGamesService)this.zznM()).zzc(new PlayersLoadedBinderCallback(zza$zzb0), arr_s);
    }

    public void zza(com.google.android.gms.common.api.zzi zzi0) {
        try {
            InvitationReceivedBinderCallback gamesClientImpl$InvitationReceivedBinderCallback0 = new InvitationReceivedBinderCallback(zzi0);
            ((IGamesService)this.zznM()).zza(gamesClientImpl$InvitationReceivedBinderCallback0, this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public void zza(com.google.android.gms.common.api.zzi zzi0, com.google.android.gms.common.api.zzi zzi1, com.google.android.gms.common.api.zzi zzi2, RoomConfig roomConfig0) {
        try {
            RoomBinderCallbacks gamesClientImpl$RoomBinderCallbacks0 = new RoomBinderCallbacks(zzi0, zzi1, zzi2);
            IGamesService iGamesService0 = (IGamesService)this.zznM();
            int v = roomConfig0.getVariant();
            String[] arr_s = roomConfig0.getInvitedPlayerIds();
            Bundle bundle0 = roomConfig0.getAutoMatchCriteria();
            iGamesService0.zza(gamesClientImpl$RoomBinderCallbacks0, this.zzaoW, v, arr_s, bundle0, false, this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public void zza(com.google.android.gms.common.api.zzi zzi0, String s) {
        try {
            ((IGamesService)this.zznM()).zzc(new RoomBinderCallbacks(zzi0), s);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public void zza(Snapshot snapshot0) {
        SnapshotContents snapshotContents0 = snapshot0.getSnapshotContents();
        zzu.zza(!snapshotContents0.isClosed(), "Snapshot already closed");
        Contents contents0 = snapshotContents0.zzpe();
        snapshotContents0.close();
        try {
            ((IGamesService)this.zznM()).zza(contents0);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    private void zzb(RemoteException remoteException0) {
        GamesLog.zzb("GamesClientImpl", "service died", remoteException0);
    }

    public Intent zzb(int v, int v1, boolean z) {
        try {
            return ((IGamesService)this.zznM()).zzb(v, v1, z);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public Intent zzb(int[] arr_v) {
        try {
            return ((IGamesService)this.zznM()).zzb(arr_v);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0) throws RemoteException {
        this.zzaoQ.flush();
        ((IGamesService)this.zznM()).zza(new SignOutCompleteBinderCallbacks(zza$zzb0));
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0, int v, boolean z, boolean z1) throws RemoteException {
        ((IGamesService)this.zznM()).zzb(new PlayersLoadedBinderCallback(zza$zzb0), v, z, z1);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        AchievementUpdatedBinderCallback gamesClientImpl$AchievementUpdatedBinderCallback0 = zza$zzb0 == null ? null : new AchievementUpdatedBinderCallback(zza$zzb0);
        IGamesService iGamesService0 = (IGamesService)this.zznM();
        Bundle bundle0 = this.zzaoU.zzte();
        iGamesService0.zzb(gamesClientImpl$AchievementUpdatedBinderCallback0, s, this.zzaoU.zztf(), bundle0);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, int v) throws RemoteException {
        AchievementUpdatedBinderCallback gamesClientImpl$AchievementUpdatedBinderCallback0 = zza$zzb0 == null ? null : new AchievementUpdatedBinderCallback(zza$zzb0);
        IGamesService iGamesService0 = (IGamesService)this.zznM();
        Bundle bundle0 = this.zzaoU.zzte();
        iGamesService0.zzb(gamesClientImpl$AchievementUpdatedBinderCallback0, s, v, this.zzaoU.zztf(), bundle0);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, int v, int v1, int v2, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zzb(new LeaderboardScoresLoadedBinderCallback(zza$zzb0), s, v, v1, v2, z);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, int v, boolean z, boolean z1) throws RemoteException {
        ((IGamesService)this.zznM()).zzb(new PlayersLoadedBinderCallback(zza$zzb0), s, v, z, z1);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1) throws RemoteException {
        this.zzaoQ.flush();
        ((IGamesService)this.zznM()).zzf(new QuestMilestoneClaimBinderCallbacks(zza$zzb0, s1), s, s1);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1, int v, int v1, int v2, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zzb(new LeaderboardScoresLoadedBinderCallback(zza$zzb0), s, s1, v, v1, v2, z);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1, int v, boolean z, boolean z1) throws RemoteException {
        ((IGamesService)this.zznM()).zzb(new PlayersLoadedBinderCallback(zza$zzb0), s, s1, v, z, z1);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new AchievementsLoadedBinderCallback(zza$zzb0), s, s1, z);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zzc(new LeaderboardsLoadedBinderCallback(zza$zzb0), s, z);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zzb(new LeaderboardsLoadedBinderCallback(zza$zzb0), z);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0, boolean z, String[] arr_s) throws RemoteException {
        this.zzaoQ.flush();
        ((IGamesService)this.zznM()).zza(new QuestsLoadedBinderCallbacks(zza$zzb0), arr_s, z);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zza$zzb0, String[] arr_s) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new RequestsUpdatedBinderCallbacks(zza$zzb0), arr_s);
    }

    public void zzb(com.google.android.gms.common.api.zzi zzi0) {
        try {
            MatchUpdateReceivedBinderCallback gamesClientImpl$MatchUpdateReceivedBinderCallback0 = new MatchUpdateReceivedBinderCallback(zzi0);
            ((IGamesService)this.zznM()).zzb(gamesClientImpl$MatchUpdateReceivedBinderCallback0, this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public void zzb(com.google.android.gms.common.api.zzi zzi0, com.google.android.gms.common.api.zzi zzi1, com.google.android.gms.common.api.zzi zzi2, RoomConfig roomConfig0) {
        try {
            RoomBinderCallbacks gamesClientImpl$RoomBinderCallbacks0 = new RoomBinderCallbacks(zzi0, zzi1, zzi2);
            IGamesService iGamesService0 = (IGamesService)this.zznM();
            String s = roomConfig0.getInvitationId();
            iGamesService0.zza(gamesClientImpl$RoomBinderCallbacks0, this.zzaoW, s, false, this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    protected IGamesService zzbJ(IBinder iBinder0) {
        return Stub.zzbM(iBinder0);
    }

    public Intent zzc(int v, int v1, boolean z) {
        try {
            return ((IGamesService)this.zznM()).zzc(v, v1, z);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0, int v) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new InvitationsLoadedBinderCallback(zza$zzb0), v);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0, int v, boolean z, boolean z1) throws RemoteException {
        ((IGamesService)this.zznM()).zzc(new PlayersLoadedBinderCallback(zza$zzb0), v, z, z1);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        ((IGamesService)this.zznM()).zzl(new TurnBasedMatchInitiatedBinderCallbacks(zza$zzb0), s);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, int v) throws RemoteException {
        ((IGamesService)this.zznM()).zzb(new PlayerXpStreamLoadedBinderCallback(zza$zzb0), s, v);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1) throws RemoteException {
        ((IGamesService)this.zznM()).zzd(new TurnBasedMatchInitiatedBinderCallbacks(zza$zzb0), s, s1);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zzc(new SnapshotsLoadedBinderCallbacks(zza$zzb0), s, s1, z);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zzd(new LeaderboardsLoadedBinderCallback(zza$zzb0), s, z);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new AchievementsLoadedBinderCallback(zza$zzb0), z);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0, String[] arr_s) throws RemoteException {
        ((IGamesService)this.zznM()).zzb(new RequestsUpdatedBinderCallbacks(zza$zzb0), arr_s);
    }

    public void zzc(com.google.android.gms.common.api.zzi zzi0) {
        try {
            QuestUpdateBinderCallback gamesClientImpl$QuestUpdateBinderCallback0 = new QuestUpdateBinderCallback(zzi0);
            ((IGamesService)this.zznM()).zzd(gamesClientImpl$QuestUpdateBinderCallback0, this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public void zzcN(String s) {
        try {
            ((IGamesService)this.zznM()).zzcV(s);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public Intent zzcO(String s) {
        try {
            return ((IGamesService)this.zznM()).zzcO(s);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public void zzcP(String s) {
        try {
            IGamesService iGamesService0 = (IGamesService)this.zznM();
            Bundle bundle0 = this.zzaoU.zzte();
            iGamesService0.zza(s, this.zzaoU.zztf(), bundle0);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public int zzd(byte[] arr_b, String s) {
        try {
            return ((IGamesService)this.zznM()).zzb(arr_b, s, null);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return -1;
        }
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zza$zzb0, int v, boolean z, boolean z1) throws RemoteException {
        ((IGamesService)this.zznM()).zze(new PlayersLoadedBinderCallback(zza$zzb0), v, z, z1);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        ((IGamesService)this.zznM()).zzm(new TurnBasedMatchInitiatedBinderCallbacks(zza$zzb0), s);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, int v) throws RemoteException {
        ((IGamesService)this.zznM()).zzc(new PlayerXpStreamLoadedBinderCallback(zza$zzb0), s, v);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, String s1) throws RemoteException {
        ((IGamesService)this.zznM()).zze(new TurnBasedMatchInitiatedBinderCallbacks(zza$zzb0), s, s1);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new GameMuteStatusChangedBinderCallback(zza$zzb0), s, z);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zza$zzb0, boolean z) throws RemoteException {
        this.zzaoQ.flush();
        ((IGamesService)this.zznM()).zzf(new EventsLoadedBinderCallback(zza$zzb0), z);
    }

    public void zzd(com.google.android.gms.common.api.zzi zzi0) {
        try {
            RequestReceivedBinderCallback gamesClientImpl$RequestReceivedBinderCallback0 = new RequestReceivedBinderCallback(zzi0);
            ((IGamesService)this.zznM()).zzc(gamesClientImpl$RequestReceivedBinderCallback0, this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public void zze(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        ((IGamesService)this.zznM()).zzo(new TurnBasedMatchLeftBinderCallbacks(zza$zzb0), s);
    }

    public void zze(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, int v) throws RemoteException {
        ((IGamesService)this.zznM()).zzb(new InvitationsLoadedBinderCallback(zza$zzb0), s, v, false);
    }

    public void zze(com.google.android.gms.common.api.zza.zzb zza$zzb0, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zzd(new SnapshotsLoadedBinderCallbacks(zza$zzb0), z);
    }

    public void zzf(com.google.android.gms.common.api.zza.zzb zza$zzb0) throws RemoteException {
        ((IGamesService)this.zznM()).zzd(new GamesLoadedBinderCallback(zza$zzb0));
    }

    public void zzf(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        ((IGamesService)this.zznM()).zzn(new TurnBasedMatchCanceledBinderCallbacks(zza$zzb0), s);
    }

    public void zzf(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s, int v) throws RemoteException {
        ((IGamesService)this.zznM()).zza(new RequestSummariesLoadedBinderCallbacks(zza$zzb0), s, v);
    }

    public void zzf(com.google.android.gms.common.api.zza.zzb zza$zzb0, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zzg(new ProfileSettingsLoadedBinderCallback(zza$zzb0), z);
    }

    public void zzfC(int v) {
        this.zzaoU.setGravity(v);
    }

    public void zzfD(int v) {
        try {
            ((IGamesService)this.zznM()).zzfD(v);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public void zzg(com.google.android.gms.common.api.zza.zzb zza$zzb0) throws RemoteException {
        ((IGamesService)this.zznM()).zzh(new NotifyAclLoadedBinderCallback(zza$zzb0));
    }

    public void zzg(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        ((IGamesService)this.zznM()).zzp(new TurnBasedMatchLoadedBinderCallbacks(zza$zzb0), s);
    }

    public void zzg(com.google.android.gms.common.api.zza.zzb zza$zzb0, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zzh(new ProfileSettingsUpdatedBinderCallback(zza$zzb0), z);
    }

    public void zzh(com.google.android.gms.common.api.zza.zzb zza$zzb0) throws RemoteException {
        ((IGamesService)this.zznM()).zzt(new InboxCountsLoadedBinderCallback(zza$zzb0), null);
    }

    public void zzh(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        this.zzaoQ.flush();
        ((IGamesService)this.zznM()).zzu(new QuestAcceptedBinderCallbacks(zza$zzb0), s);
    }

    public void zzh(com.google.android.gms.common.api.zza.zzb zza$zzb0, boolean z) throws RemoteException {
        ((IGamesService)this.zznM()).zze(new ContactSettingsLoadedBinderCallback(zza$zzb0), z);
    }

    public void zzi(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        ((IGamesService)this.zznM()).zzr(new SnapshotDeletedBinderCallbacks(zza$zzb0), s);
    }

    public void zzj(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        ((IGamesService)this.zznM()).zzf(new GameInstancesLoadedBinderCallback(zza$zzb0), s);
    }

    public void zzk(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        ((IGamesService)this.zznM()).zzq(new GameSearchSuggestionsLoadedBinderCallback(zza$zzb0), s);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected Bundle zzkR() {
        String s = this.getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle0 = this.zzaoY.zzrI();
        bundle0.putString("com.google.android.gms.games.key.gamePackageName", this.zzaoR);
        bundle0.putString("com.google.android.gms.games.key.desiredLocale", s);
        bundle0.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.zzaoU.zztf()));
        bundle0.putInt("com.google.android.gms.games.key.API_VERSION", 0);
        zze zze0 = this.zznK();
        if(zze0.zznB() != null) {
            bundle0.putBundle("com.google.android.gms.games.key.signInOptions", zzh.zza(zze0.zznB(), zze0.zznC(), Executors.newSingleThreadExecutor()));
        }
        return bundle0;
    }

    public void zzl(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        ((IGamesService)this.zznM()).zzs(new PlayerXpForGameCategoriesLoadedBinderCallback(zza$zzb0), s);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public Bundle zzlM() {
        try {
            Bundle bundle0 = ((IGamesService)this.zznM()).zzlM();
            if(bundle0 != null) {
                bundle0.setClassLoader(GamesClientImpl.class.getClassLoader());
            }
            return bundle0;
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public void zzm(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        ((IGamesService)this.zznM()).zzk(new InvitationsLoadedBinderCallback(zza$zzb0), s);
    }

    public void zzn(View view0) {
        this.zzaoU.zzo(view0);
    }

    public void zzn(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        ((IGamesService)this.zznM()).zzj(new NotifyAclUpdatedBinderCallback(zza$zzb0), s);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public void zznG() {
        super.zznG();
        if(this.zzaoV) {
            this.zzaoU.zztd();
            this.zzaoV = false;
        }
        if(!this.zzaoY.zzanC) {
            this.zzsu();
        }
    }

    public Intent zzo(String s, int v) {
        try {
            return ((IGamesService)this.zznM()).zzv(s, v);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public void zzo(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) throws RemoteException {
        ((IGamesService)this.zznM()).zzi(new GameMuteStatusLoadedBinderCallback(zza$zzb0), s);
    }

    public void zzp(String s, int v) {
        this.zzaoQ.zzp(s, v);
    }

    public void zzq(String s, int v) {
        try {
            ((IGamesService)this.zznM()).zzq(s, v);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public void zzr(String s, int v) {
        try {
            ((IGamesService)this.zznM()).zzr(s, v);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public Intent zzsA() {
        try {
            return ((IGamesService)this.zznM()).zzsA();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public Intent zzsB() {
        try {
            return ((IGamesService)this.zznM()).zzsB();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public Intent zzsC() {
        try {
            return ((IGamesService)this.zznM()).zzsC();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public void zzsD() {
        try {
            ((IGamesService)this.zznM()).zzF(this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public void zzsE() {
        try {
            ((IGamesService)this.zznM()).zzG(this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public void zzsF() {
        try {
            ((IGamesService)this.zznM()).zzI(this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public void zzsG() {
        try {
            ((IGamesService)this.zznM()).zzH(this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public Intent zzsH() {
        try {
            return ((IGamesService)this.zznM()).zzsH();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public Intent zzsI() {
        try {
            return ((IGamesService)this.zznM()).zzsI();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public int zzsJ() {
        try {
            return ((IGamesService)this.zznM()).zzsJ();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return 0x1110;
        }
    }

    public String zzsK() {
        try {
            return ((IGamesService)this.zznM()).zzsK();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public int zzsL() {
        try {
            return ((IGamesService)this.zznM()).zzsL();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return -1;
        }
    }

    public Intent zzsM() {
        try {
            return ((IGamesService)this.zznM()).zzsM();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public int zzsN() {
        try {
            return ((IGamesService)this.zznM()).zzsN();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return -1;
        }
    }

    public int zzsO() {
        try {
            return ((IGamesService)this.zznM()).zzsO();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return -1;
        }
    }

    public int zzsP() {
        try {
            return ((IGamesService)this.zznM()).zzsP();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return -1;
        }
    }

    public int zzsQ() {
        try {
            return ((IGamesService)this.zznM()).zzsQ();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return -1;
        }
    }

    public void zzsR() {
        if(this.isConnected()) {
            try {
                ((IGamesService)this.zznM()).zzsR();
            }
            catch(RemoteException remoteException0) {
                this.zzb(remoteException0);
            }
        }
    }

    private void zzst() {
        this.zzaoS = null;
        this.zzaoT = null;
    }

    public void zzsu() {
        try {
            PopupLocationInfoBinderCallbacks gamesClientImpl$PopupLocationInfoBinderCallbacks0 = new PopupLocationInfoBinderCallbacks(this.zzaoU);
            ((IGamesService)this.zznM()).zza(gamesClientImpl$PopupLocationInfoBinderCallbacks0, this.zzaoX);
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
        }
    }

    public String zzsv() {
        try {
            return ((IGamesService)this.zznM()).zzsv();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public String zzsw() {
        if(this.zzaoS != null) {
            return this.zzaoS.getPlayerId();
        }
        try {
            return ((IGamesService)this.zznM()).zzsw();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }

    public Player zzsx() {
        this.zznL();
        synchronized(this) {
            if(this.zzaoS == null) {
                try {
                    PlayerBuffer playerBuffer0 = new PlayerBuffer(((IGamesService)this.zznM()).zzsT());
                    try {
                        if(playerBuffer0.getCount() > 0) {
                            this.zzaoS = (PlayerEntity)playerBuffer0.get(0).freeze();
                        }
                    }
                    finally {
                        playerBuffer0.release();
                    }
                }
                catch(RemoteException remoteException0) {
                    this.zzb(remoteException0);
                }
            }
            return this.zzaoS;
        }
    }

    public Game zzsy() {
        this.zznL();
        synchronized(this) {
            if(this.zzaoT == null) {
                try {
                    GameBuffer gameBuffer0 = new GameBuffer(((IGamesService)this.zznM()).zzsV());
                    try {
                        if(gameBuffer0.getCount() > 0) {
                            this.zzaoT = (GameEntity)gameBuffer0.get(0).freeze();
                        }
                    }
                    finally {
                        gameBuffer0.release();
                    }
                }
                catch(RemoteException remoteException0) {
                    this.zzb(remoteException0);
                }
            }
            return this.zzaoT;
        }
    }

    public Intent zzsz() {
        try {
            return ((IGamesService)this.zznM()).zzsz();
        }
        catch(RemoteException remoteException0) {
            this.zzb(remoteException0);
            return null;
        }
    }
}

