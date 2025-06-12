package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

public final class InvitationRef extends zzc implements Invitation {
    private final Game zzatB;
    private final ArrayList zzauh;
    private final ParticipantRef zzauk;

    InvitationRef(DataHolder holder, int dataRow, int numChildren) {
        super(holder, dataRow);
        this.zzatB = new GameRef(holder, dataRow);
        this.zzauh = new ArrayList(numChildren);
        String s = this.getString("external_inviter_id");
        ParticipantRef participantRef0 = null;
        for(int v2 = 0; v2 < numChildren; ++v2) {
            ParticipantRef participantRef1 = new ParticipantRef(this.zzWu, this.zzYs + v2);
            if(participantRef1.getParticipantId().equals(s)) {
                participantRef0 = participantRef1;
            }
            this.zzauh.add(participantRef1);
        }
        this.zzauk = (ParticipantRef)zzu.zzb(participantRef0, "Must have a valid inviter!");
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return InvitationEntity.zza(this, obj);
    }

    public Invitation freeze() {
        return new InvitationEntity(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.freeze();
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public int getAvailableAutoMatchSlots() {
        return this.getBoolean("has_automatch_criteria") ? this.getInteger("automatch_max_players") : 0;
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public long getCreationTimestamp() {
        return Math.max(this.getLong("creation_timestamp"), this.getLong("last_modified_timestamp"));
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public Game getGame() {
        return this.zzatB;
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public String getInvitationId() {
        return this.getString("external_invitation_id");
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public int getInvitationType() {
        return this.getInteger("type");
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public Participant getInviter() {
        return this.zzauk;
    }

    @Override  // com.google.android.gms.games.multiplayer.Participatable
    public ArrayList getParticipants() {
        return this.zzauh;
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public int getVariant() {
        return this.getInteger("variant");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return InvitationEntity.zza(this);
    }

    @Override
    public String toString() {
        return InvitationEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((InvitationEntity)this.freeze()).writeToParcel(dest, flags);
    }
}

