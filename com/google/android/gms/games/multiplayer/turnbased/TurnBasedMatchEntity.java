package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.zzlc;
import java.util.ArrayList;

public final class TurnBasedMatchEntity implements SafeParcelable, TurnBasedMatch {
    public static final Parcelable.Creator CREATOR;
    private final int mVersion;
    private final int zzCY;
    private final String zzakM;
    private final long zzaoj;
    private final String zzapF;
    private final String zzauA;
    private final String zzauI;
    private final String zzauJ;
    private final int zzauK;
    private final byte[] zzauL;
    private final String zzauM;
    private final byte[] zzauN;
    private final int zzauO;
    private final int zzauP;
    private final boolean zzauQ;
    private final String zzauR;
    private final GameEntity zzaud;
    private final long zzaue;
    private final ArrayList zzauh;
    private final int zzaui;
    private final Bundle zzauy;

    static {
        TurnBasedMatchEntity.CREATOR = new TurnBasedMatchEntityCreator();
    }

    TurnBasedMatchEntity(int versionCode, GameEntity game, String matchId, String creatorId, long creationTimestamp, String lastUpdaterId, long lastUpdatedTimestamp, String pendingParticipantId, int matchStatus, int variant, int version, byte[] data, ArrayList arrayList0, String rematchId, byte[] previousData, int matchNumber, Bundle autoMatchCriteria, int turnStatus, boolean isLocallyModified, String description, String descriptionParticipantId) {
        this.zzCY = versionCode;
        this.zzaud = game;
        this.zzapF = matchId;
        this.zzauA = creatorId;
        this.zzaue = creationTimestamp;
        this.zzauI = lastUpdaterId;
        this.zzaoj = lastUpdatedTimestamp;
        this.zzauJ = pendingParticipantId;
        this.zzauK = matchStatus;
        this.zzauP = turnStatus;
        this.zzaui = variant;
        this.mVersion = version;
        this.zzauL = data;
        this.zzauh = arrayList0;
        this.zzauM = rematchId;
        this.zzauN = previousData;
        this.zzauO = matchNumber;
        this.zzauy = autoMatchCriteria;
        this.zzauQ = isLocallyModified;
        this.zzakM = description;
        this.zzauR = descriptionParticipantId;
    }

    public TurnBasedMatchEntity(TurnBasedMatch match) {
        this.zzCY = 2;
        this.zzaud = new GameEntity(match.getGame());
        this.zzapF = match.getMatchId();
        this.zzauA = match.getCreatorId();
        this.zzaue = match.getCreationTimestamp();
        this.zzauI = match.getLastUpdaterId();
        this.zzaoj = match.getLastUpdatedTimestamp();
        this.zzauJ = match.getPendingParticipantId();
        this.zzauK = match.getStatus();
        this.zzauP = match.getTurnStatus();
        this.zzaui = match.getVariant();
        this.mVersion = match.getVersion();
        this.zzauM = match.getRematchId();
        this.zzauO = match.getMatchNumber();
        this.zzauy = match.getAutoMatchCriteria();
        this.zzauQ = match.isLocallyModified();
        this.zzakM = match.getDescription();
        this.zzauR = match.getDescriptionParticipantId();
        byte[] arr_b = match.getData();
        if(arr_b == null) {
            this.zzauL = null;
        }
        else {
            this.zzauL = new byte[arr_b.length];
            System.arraycopy(arr_b, 0, this.zzauL, 0, arr_b.length);
        }
        byte[] arr_b1 = match.getPreviousMatchData();
        if(arr_b1 == null) {
            this.zzauN = null;
        }
        else {
            this.zzauN = new byte[arr_b1.length];
            System.arraycopy(arr_b1, 0, this.zzauN, 0, arr_b1.length);
        }
        ArrayList arrayList0 = match.getParticipants();
        int v = arrayList0.size();
        this.zzauh = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ParticipantEntity participantEntity0 = (ParticipantEntity)((Participant)arrayList0.get(v1)).freeze();
            this.zzauh.add(participantEntity0);
        }
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public boolean canRematch() {
        return this.zzauK == 2 && this.zzauM == null;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return TurnBasedMatchEntity.zza(this, obj);
    }

    public TurnBasedMatch freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public Bundle getAutoMatchCriteria() {
        return this.zzauy;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int getAvailableAutoMatchSlots() {
        return this.zzauy == null ? 0 : this.zzauy.getInt("max_automatch_players");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public long getCreationTimestamp() {
        return this.zzaue;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getCreatorId() {
        return this.zzauA;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public byte[] getData() {
        return this.zzauL;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getDescription() {
        return this.zzakM;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public void getDescription(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzakM, dataOut);
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public Participant getDescriptionParticipant() {
        String s = this.getDescriptionParticipantId();
        return s == null ? null : this.getParticipant(s);
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getDescriptionParticipantId() {
        return this.zzauR;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public Game getGame() {
        return this.zzaud;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public long getLastUpdatedTimestamp() {
        return this.zzaoj;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getLastUpdaterId() {
        return this.zzauI;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getMatchId() {
        return this.zzapF;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int getMatchNumber() {
        return this.zzauO;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public Participant getParticipant(String participantId) {
        return TurnBasedMatchEntity.zzc(this, participantId);
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getParticipantId(String playerId) {
        return TurnBasedMatchEntity.zzb(this, playerId);
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public ArrayList getParticipantIds() {
        return TurnBasedMatchEntity.zzc(this);
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int getParticipantStatus(String participantId) {
        return TurnBasedMatchEntity.zza(this, participantId);
    }

    @Override  // com.google.android.gms.games.multiplayer.Participatable
    public ArrayList getParticipants() {
        return new ArrayList(this.zzauh);
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getPendingParticipantId() {
        return this.zzauJ;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public byte[] getPreviousMatchData() {
        return this.zzauN;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getRematchId() {
        return this.zzauM;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int getStatus() {
        return this.zzauK;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int getTurnStatus() {
        return this.zzauP;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int getVariant() {
        return this.zzaui;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int getVersion() {
        return this.mVersion;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return TurnBasedMatchEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public boolean isLocallyModified() {
        return this.zzauQ;
    }

    @Override
    public String toString() {
        return TurnBasedMatchEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        TurnBasedMatchEntityCreator.zza(this, out, flags);
    }

    static int zza(TurnBasedMatch turnBasedMatch0) {
        return zzt.hashCode(new Object[]{turnBasedMatch0.getGame(), turnBasedMatch0.getMatchId(), turnBasedMatch0.getCreatorId(), turnBasedMatch0.getCreationTimestamp(), turnBasedMatch0.getLastUpdaterId(), turnBasedMatch0.getLastUpdatedTimestamp(), turnBasedMatch0.getPendingParticipantId(), turnBasedMatch0.getStatus(), turnBasedMatch0.getTurnStatus(), turnBasedMatch0.getDescription(), turnBasedMatch0.getVariant(), turnBasedMatch0.getVersion(), turnBasedMatch0.getParticipants(), turnBasedMatch0.getRematchId(), turnBasedMatch0.getMatchNumber(), turnBasedMatch0.getAutoMatchCriteria(), turnBasedMatch0.getAvailableAutoMatchSlots(), Boolean.valueOf(turnBasedMatch0.isLocallyModified())});
    }

    static int zza(TurnBasedMatch turnBasedMatch0, String s) {
        ArrayList arrayList0 = turnBasedMatch0.getParticipants();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Participant participant0 = (Participant)arrayList0.get(v1);
            if(participant0.getParticipantId().equals(s)) {
                return participant0.getStatus();
            }
        }
        throw new IllegalStateException("Participant " + s + " is not in match " + turnBasedMatch0.getMatchId());
    }

    // 去混淆评级： 中等(190)
    static boolean zza(TurnBasedMatch turnBasedMatch0, Object object0) {
        return object0 instanceof TurnBasedMatch ? turnBasedMatch0 == object0 || zzt.equal(((TurnBasedMatch)object0).getGame(), turnBasedMatch0.getGame()) && zzt.equal(((TurnBasedMatch)object0).getMatchId(), turnBasedMatch0.getMatchId()) && zzt.equal(((TurnBasedMatch)object0).getCreatorId(), turnBasedMatch0.getCreatorId()) && zzt.equal(((TurnBasedMatch)object0).getCreationTimestamp(), turnBasedMatch0.getCreationTimestamp()) && zzt.equal(((TurnBasedMatch)object0).getLastUpdaterId(), turnBasedMatch0.getLastUpdaterId()) && zzt.equal(((TurnBasedMatch)object0).getLastUpdatedTimestamp(), turnBasedMatch0.getLastUpdatedTimestamp()) && zzt.equal(((TurnBasedMatch)object0).getPendingParticipantId(), turnBasedMatch0.getPendingParticipantId()) && zzt.equal(((TurnBasedMatch)object0).getStatus(), turnBasedMatch0.getStatus()) && zzt.equal(((TurnBasedMatch)object0).getTurnStatus(), turnBasedMatch0.getTurnStatus()) && zzt.equal(((TurnBasedMatch)object0).getDescription(), turnBasedMatch0.getDescription()) && zzt.equal(((TurnBasedMatch)object0).getVariant(), turnBasedMatch0.getVariant()) && zzt.equal(((TurnBasedMatch)object0).getVersion(), turnBasedMatch0.getVersion()) && zzt.equal(((TurnBasedMatch)object0).getParticipants(), turnBasedMatch0.getParticipants()) && zzt.equal(((TurnBasedMatch)object0).getRematchId(), turnBasedMatch0.getRematchId()) && zzt.equal(((TurnBasedMatch)object0).getMatchNumber(), turnBasedMatch0.getMatchNumber()) && zzt.equal(((TurnBasedMatch)object0).getAutoMatchCriteria(), turnBasedMatch0.getAutoMatchCriteria()) && zzt.equal(((TurnBasedMatch)object0).getAvailableAutoMatchSlots(), turnBasedMatch0.getAvailableAutoMatchSlots()) && zzt.equal(Boolean.valueOf(((TurnBasedMatch)object0).isLocallyModified()), Boolean.valueOf(turnBasedMatch0.isLocallyModified())) : false;
    }

    static String zzb(TurnBasedMatch turnBasedMatch0) {
        return zzt.zzt(turnBasedMatch0).zzg("Game", turnBasedMatch0.getGame()).zzg("MatchId", turnBasedMatch0.getMatchId()).zzg("CreatorId", turnBasedMatch0.getCreatorId()).zzg("CreationTimestamp", turnBasedMatch0.getCreationTimestamp()).zzg("LastUpdaterId", turnBasedMatch0.getLastUpdaterId()).zzg("LastUpdatedTimestamp", turnBasedMatch0.getLastUpdatedTimestamp()).zzg("PendingParticipantId", turnBasedMatch0.getPendingParticipantId()).zzg("MatchStatus", turnBasedMatch0.getStatus()).zzg("TurnStatus", turnBasedMatch0.getTurnStatus()).zzg("Description", turnBasedMatch0.getDescription()).zzg("Variant", turnBasedMatch0.getVariant()).zzg("Data", turnBasedMatch0.getData()).zzg("Version", turnBasedMatch0.getVersion()).zzg("Participants", turnBasedMatch0.getParticipants()).zzg("RematchId", turnBasedMatch0.getRematchId()).zzg("PreviousData", turnBasedMatch0.getPreviousMatchData()).zzg("MatchNumber", turnBasedMatch0.getMatchNumber()).zzg("AutoMatchCriteria", turnBasedMatch0.getAutoMatchCriteria()).zzg("AvailableAutoMatchSlots", turnBasedMatch0.getAvailableAutoMatchSlots()).zzg("LocallyModified", Boolean.valueOf(turnBasedMatch0.isLocallyModified())).zzg("DescriptionParticipantId", turnBasedMatch0.getDescriptionParticipantId()).toString();
    }

    static String zzb(TurnBasedMatch turnBasedMatch0, String s) {
        ArrayList arrayList0 = turnBasedMatch0.getParticipants();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Participant participant0 = (Participant)arrayList0.get(v1);
            Player player0 = participant0.getPlayer();
            if(player0 != null && player0.getPlayerId().equals(s)) {
                return participant0.getParticipantId();
            }
        }
        return null;
    }

    static Participant zzc(TurnBasedMatch turnBasedMatch0, String s) {
        ArrayList arrayList0 = turnBasedMatch0.getParticipants();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Participant participant0 = (Participant)arrayList0.get(v1);
            if(participant0.getParticipantId().equals(s)) {
                return participant0;
            }
        }
        throw new IllegalStateException("Participant " + s + " is not in match " + turnBasedMatch0.getMatchId());
    }

    static ArrayList zzc(TurnBasedMatch turnBasedMatch0) {
        ArrayList arrayList0 = turnBasedMatch0.getParticipants();
        int v = arrayList0.size();
        ArrayList arrayList1 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList1.add(((Participant)arrayList0.get(v1)).getParticipantId());
        }
        return arrayList1;
    }
}

