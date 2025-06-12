package com.google.android.gms.games.multiplayer.turnbased;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

public final class TurnBasedMatchRef extends zzc implements TurnBasedMatch {
    private final int zzaoG;
    private final Game zzatB;

    TurnBasedMatchRef(DataHolder holder, int dataRow, int numChildren) {
        super(holder, dataRow);
        this.zzatB = new GameRef(holder, dataRow);
        this.zzaoG = numChildren;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public boolean canRematch() {
        return this.getTurnStatus() == 3 && this.getRematchId() == null && this.getParticipants().size() > 1;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return TurnBasedMatchEntity.zza(this, obj);
    }

    public TurnBasedMatch freeze() {
        return new TurnBasedMatchEntity(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.freeze();
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public Bundle getAutoMatchCriteria() {
        return this.getBoolean("has_automatch_criteria") ? TurnBasedMatchConfig.createAutoMatchCriteria(this.getInteger("automatch_min_players"), this.getInteger("automatch_max_players"), this.getLong("automatch_bit_mask")) : null;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int getAvailableAutoMatchSlots() {
        return this.getBoolean("has_automatch_criteria") ? this.getInteger("automatch_max_players") : 0;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public long getCreationTimestamp() {
        return this.getLong("creation_timestamp");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getCreatorId() {
        return this.getString("creator_external");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public byte[] getData() {
        return this.getByteArray("data");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getDescription() {
        return this.getString("description");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public void getDescription(CharArrayBuffer dataOut) {
        this.zza("description", dataOut);
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public Participant getDescriptionParticipant() {
        String s = this.getDescriptionParticipantId();
        return s == null ? null : this.getParticipant(s);
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getDescriptionParticipantId() {
        return this.getString("description_participant_id");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public Game getGame() {
        return this.zzatB;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public long getLastUpdatedTimestamp() {
        return this.getLong("last_updated_timestamp");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getLastUpdaterId() {
        return this.getString("last_updater_external");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getMatchId() {
        return this.getString("external_match_id");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int getMatchNumber() {
        return this.getInteger("match_number");
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
        ArrayList arrayList0 = new ArrayList(this.zzaoG);
        for(int v = 0; v < this.zzaoG; ++v) {
            arrayList0.add(new ParticipantRef(this.zzWu, this.zzYs + v));
        }
        return arrayList0;
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getPendingParticipantId() {
        return this.getString("pending_participant_external");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public byte[] getPreviousMatchData() {
        return this.getByteArray("previous_match_data");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public String getRematchId() {
        return this.getString("rematch_id");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int getStatus() {
        return this.getInteger("status");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int getTurnStatus() {
        return this.getInteger("user_match_status");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int getVariant() {
        return this.getInteger("variant");
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public int getVersion() {
        return this.getInteger("version");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return TurnBasedMatchEntity.zza(this);
    }

    @Override  // com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch
    public boolean isLocallyModified() {
        return this.getBoolean("upsync_required");
    }

    @Override
    public String toString() {
        return TurnBasedMatchEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((TurnBasedMatchEntity)this.freeze()).writeToParcel(dest, flags);
    }
}

