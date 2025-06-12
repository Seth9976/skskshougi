package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;

public final class InvitationEntity extends GamesDowngradeableSafeParcel implements Invitation {
    static final class InvitationEntityCreatorCompat extends InvitationEntityCreator {
        @Override  // com.google.android.gms.games.multiplayer.InvitationEntityCreator
        public Object createFromParcel(Parcel x0) {
            return this.zzdI(x0);
        }

        @Override  // com.google.android.gms.games.multiplayer.InvitationEntityCreator
        public InvitationEntity zzdI(Parcel parcel0) {
            if(InvitationEntity.zzd(InvitationEntity.zznE()) || InvitationEntity.zzca(InvitationEntity.class.getCanonicalName())) {
                return super.zzdI(parcel0);
            }
            GameEntity gameEntity0 = (GameEntity)GameEntity.CREATOR.createFromParcel(parcel0);
            String s = parcel0.readString();
            long v = parcel0.readLong();
            int v1 = parcel0.readInt();
            ParticipantEntity participantEntity0 = (ParticipantEntity)ParticipantEntity.CREATOR.createFromParcel(parcel0);
            int v2 = parcel0.readInt();
            ArrayList arrayList0 = new ArrayList(v2);
            for(int v3 = 0; v3 < v2; ++v3) {
                arrayList0.add(ParticipantEntity.CREATOR.createFromParcel(parcel0));
            }
            return new InvitationEntity(2, gameEntity0, s, v, v1, participantEntity0, arrayList0, -1, 0);
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzapl;
    private final GameEntity zzaud;
    private final long zzaue;
    private final int zzauf;
    private final ParticipantEntity zzaug;
    private final ArrayList zzauh;
    private final int zzaui;
    private final int zzauj;

    static {
        InvitationEntity.CREATOR = new InvitationEntityCreatorCompat();
    }

    InvitationEntity(int versionCode, GameEntity game, String invitationId, long creationTimestamp, int invitationType, ParticipantEntity inviter, ArrayList arrayList0, int variant, int availableAutoMatchSlots) {
        this.zzCY = versionCode;
        this.zzaud = game;
        this.zzapl = invitationId;
        this.zzaue = creationTimestamp;
        this.zzauf = invitationType;
        this.zzaug = inviter;
        this.zzauh = arrayList0;
        this.zzaui = variant;
        this.zzauj = availableAutoMatchSlots;
    }

    InvitationEntity(Invitation invitation) {
        this.zzCY = 2;
        this.zzaud = new GameEntity(invitation.getGame());
        this.zzapl = invitation.getInvitationId();
        this.zzaue = invitation.getCreationTimestamp();
        this.zzauf = invitation.getInvitationType();
        this.zzaui = invitation.getVariant();
        this.zzauj = invitation.getAvailableAutoMatchSlots();
        String s = invitation.getInviter().getParticipantId();
        Participant participant0 = null;
        ArrayList arrayList0 = invitation.getParticipants();
        int v = arrayList0.size();
        this.zzauh = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            Participant participant1 = (Participant)arrayList0.get(v1);
            if(participant1.getParticipantId().equals(s)) {
                participant0 = participant1;
            }
            ParticipantEntity participantEntity0 = (ParticipantEntity)participant1.freeze();
            this.zzauh.add(participantEntity0);
        }
        zzu.zzb(participant0, "Must have a valid inviter!");
        this.zzaug = (ParticipantEntity)participant0.freeze();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return InvitationEntity.zza(this, obj);
    }

    public Invitation freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public int getAvailableAutoMatchSlots() {
        return this.zzauj;
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public long getCreationTimestamp() {
        return this.zzaue;
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public Game getGame() {
        return this.zzaud;
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public String getInvitationId() {
        return this.zzapl;
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public int getInvitationType() {
        return this.zzauf;
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public Participant getInviter() {
        return this.zzaug;
    }

    @Override  // com.google.android.gms.games.multiplayer.Participatable
    public ArrayList getParticipants() {
        return new ArrayList(this.zzauh);
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public int getVariant() {
        return this.zzaui;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return InvitationEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return InvitationEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        if(!this.zznF()) {
            InvitationEntityCreator.zza(this, dest, flags);
            return;
        }
        this.zzaud.writeToParcel(dest, flags);
        dest.writeString(this.zzapl);
        dest.writeLong(this.zzaue);
        dest.writeInt(this.zzauf);
        this.zzaug.writeToParcel(dest, flags);
        int v1 = this.zzauh.size();
        dest.writeInt(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            ((ParticipantEntity)this.zzauh.get(v2)).writeToParcel(dest, flags);
        }
    }

    static int zza(Invitation invitation0) {
        return zzt.hashCode(new Object[]{invitation0.getGame(), invitation0.getInvitationId(), invitation0.getCreationTimestamp(), invitation0.getInvitationType(), invitation0.getInviter(), invitation0.getParticipants(), invitation0.getVariant(), invitation0.getAvailableAutoMatchSlots()});
    }

    // 去混淆评级： 中等(90)
    static boolean zza(Invitation invitation0, Object object0) {
        return object0 instanceof Invitation ? invitation0 == object0 || zzt.equal(((Invitation)object0).getGame(), invitation0.getGame()) && zzt.equal(((Invitation)object0).getInvitationId(), invitation0.getInvitationId()) && zzt.equal(((Invitation)object0).getCreationTimestamp(), invitation0.getCreationTimestamp()) && zzt.equal(((Invitation)object0).getInvitationType(), invitation0.getInvitationType()) && zzt.equal(((Invitation)object0).getInviter(), invitation0.getInviter()) && zzt.equal(((Invitation)object0).getParticipants(), invitation0.getParticipants()) && zzt.equal(((Invitation)object0).getVariant(), invitation0.getVariant()) && zzt.equal(((Invitation)object0).getAvailableAutoMatchSlots(), invitation0.getAvailableAutoMatchSlots()) : false;
    }

    static String zzb(Invitation invitation0) {
        return zzt.zzt(invitation0).zzg("Game", invitation0.getGame()).zzg("InvitationId", invitation0.getInvitationId()).zzg("CreationTimestamp", invitation0.getCreationTimestamp()).zzg("InvitationType", invitation0.getInvitationType()).zzg("Inviter", invitation0.getInviter()).zzg("Participants", invitation0.getParticipants()).zzg("Variant", invitation0.getVariant()).zzg("AvailableAutoMatchSlots", invitation0.getAvailableAutoMatchSlots()).toString();
    }
}

