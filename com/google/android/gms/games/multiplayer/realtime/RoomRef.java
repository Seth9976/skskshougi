package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantRef;
import java.util.ArrayList;

public final class RoomRef extends zzc implements Room {
    private final int zzaoG;

    RoomRef(DataHolder holder, int dataRow, int numChildren) {
        super(holder, dataRow);
        this.zzaoG = numChildren;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return RoomEntity.zza(this, obj);
    }

    public Room freeze() {
        return new RoomEntity(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.freeze();
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public Bundle getAutoMatchCriteria() {
        return this.getBoolean("has_automatch_criteria") ? RoomConfig.createAutoMatchCriteria(this.getInteger("automatch_min_players"), this.getInteger("automatch_max_players"), this.getLong("automatch_bit_mask")) : null;
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public int getAutoMatchWaitEstimateSeconds() {
        return this.getInteger("automatch_wait_estimate_sec");
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public long getCreationTimestamp() {
        return this.getLong("creation_timestamp");
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public String getCreatorId() {
        return this.getString("creator_external");
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public String getDescription() {
        return this.getString("description");
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public void getDescription(CharArrayBuffer dataOut) {
        this.zza("description", dataOut);
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public Participant getParticipant(String participantId) {
        return RoomEntity.zzc(this, participantId);
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public String getParticipantId(String playerId) {
        return RoomEntity.zzb(this, playerId);
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public ArrayList getParticipantIds() {
        return RoomEntity.zzc(this);
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public int getParticipantStatus(String participantId) {
        return RoomEntity.zza(this, participantId);
    }

    @Override  // com.google.android.gms.games.multiplayer.Participatable
    public ArrayList getParticipants() {
        ArrayList arrayList0 = new ArrayList(this.zzaoG);
        for(int v = 0; v < this.zzaoG; ++v) {
            arrayList0.add(new ParticipantRef(this.zzWu, this.zzYs + v));
        }
        return arrayList0;
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public String getRoomId() {
        return this.getString("external_match_id");
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public int getStatus() {
        return this.getInteger("status");
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public int getVariant() {
        return this.getInteger("variant");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return RoomEntity.zza(this);
    }

    @Override
    public String toString() {
        return RoomEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((RoomEntity)this.freeze()).writeToParcel(dest, flags);
    }
}

