package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.zzlc;
import java.util.ArrayList;

public final class RoomEntity extends GamesDowngradeableSafeParcel implements Room {
    static final class RoomEntityCreatorCompat extends RoomEntityCreator {
        @Override  // com.google.android.gms.games.multiplayer.realtime.RoomEntityCreator
        public Object createFromParcel(Parcel x0) {
            return this.zzdM(x0);
        }

        @Override  // com.google.android.gms.games.multiplayer.realtime.RoomEntityCreator
        public RoomEntity zzdM(Parcel parcel0) {
            if(RoomEntity.zzd(RoomEntity.zznE()) || RoomEntity.zzca(RoomEntity.class.getCanonicalName())) {
                return super.zzdM(parcel0);
            }
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            long v = parcel0.readLong();
            int v1 = parcel0.readInt();
            String s2 = parcel0.readString();
            int v2 = parcel0.readInt();
            Bundle bundle0 = parcel0.readBundle();
            int v3 = parcel0.readInt();
            ArrayList arrayList0 = new ArrayList(v3);
            for(int v4 = 0; v4 < v3; ++v4) {
                arrayList0.add(ParticipantEntity.CREATOR.createFromParcel(parcel0));
            }
            return new RoomEntity(2, s, s1, v, v1, s2, v2, bundle0, arrayList0, -1);
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzakM;
    private final String zzapn;
    private final String zzauA;
    private final int zzauB;
    private final int zzauC;
    private final long zzaue;
    private final ArrayList zzauh;
    private final int zzaui;
    private final Bundle zzauy;

    static {
        RoomEntity.CREATOR = new RoomEntityCreatorCompat();
    }

    RoomEntity(int versionCode, String roomId, String creatorId, long creationTimestamp, int roomStatus, String description, int variant, Bundle autoMatchCriteria, ArrayList arrayList0, int autoMatchWaitEstimateSeconds) {
        this.zzCY = versionCode;
        this.zzapn = roomId;
        this.zzauA = creatorId;
        this.zzaue = creationTimestamp;
        this.zzauB = roomStatus;
        this.zzakM = description;
        this.zzaui = variant;
        this.zzauy = autoMatchCriteria;
        this.zzauh = arrayList0;
        this.zzauC = autoMatchWaitEstimateSeconds;
    }

    public RoomEntity(Room room) {
        this.zzCY = 2;
        this.zzapn = room.getRoomId();
        this.zzauA = room.getCreatorId();
        this.zzaue = room.getCreationTimestamp();
        this.zzauB = room.getStatus();
        this.zzakM = room.getDescription();
        this.zzaui = room.getVariant();
        this.zzauy = room.getAutoMatchCriteria();
        ArrayList arrayList0 = room.getParticipants();
        int v = arrayList0.size();
        this.zzauh = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            ParticipantEntity participantEntity0 = (ParticipantEntity)((Participant)arrayList0.get(v1)).freeze();
            this.zzauh.add(participantEntity0);
        }
        this.zzauC = room.getAutoMatchWaitEstimateSeconds();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return RoomEntity.zza(this, obj);
    }

    public Room freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public Bundle getAutoMatchCriteria() {
        return this.zzauy;
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public int getAutoMatchWaitEstimateSeconds() {
        return this.zzauC;
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public long getCreationTimestamp() {
        return this.zzaue;
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public String getCreatorId() {
        return this.zzauA;
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public String getDescription() {
        return this.zzakM;
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public void getDescription(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzakM, dataOut);
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
        return new ArrayList(this.zzauh);
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public String getRoomId() {
        return this.zzapn;
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public int getStatus() {
        return this.zzauB;
    }

    @Override  // com.google.android.gms.games.multiplayer.realtime.Room
    public int getVariant() {
        return this.zzaui;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return RoomEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return RoomEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        if(!this.zznF()) {
            RoomEntityCreator.zza(this, dest, flags);
            return;
        }
        dest.writeString(this.zzapn);
        dest.writeString(this.zzauA);
        dest.writeLong(this.zzaue);
        dest.writeInt(this.zzauB);
        dest.writeString(this.zzakM);
        dest.writeInt(this.zzaui);
        dest.writeBundle(this.zzauy);
        int v1 = this.zzauh.size();
        dest.writeInt(v1);
        for(int v2 = 0; v2 < v1; ++v2) {
            ((ParticipantEntity)this.zzauh.get(v2)).writeToParcel(dest, flags);
        }
    }

    static int zza(Room room0) {
        return zzt.hashCode(new Object[]{room0.getRoomId(), room0.getCreatorId(), room0.getCreationTimestamp(), room0.getStatus(), room0.getDescription(), room0.getVariant(), room0.getAutoMatchCriteria(), room0.getParticipants(), room0.getAutoMatchWaitEstimateSeconds()});
    }

    static int zza(Room room0, String s) {
        ArrayList arrayList0 = room0.getParticipants();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Participant participant0 = (Participant)arrayList0.get(v1);
            if(participant0.getParticipantId().equals(s)) {
                return participant0.getStatus();
            }
        }
        throw new IllegalStateException("Participant " + s + " is not in room " + room0.getRoomId());
    }

    // 去混淆评级： 中等(100)
    static boolean zza(Room room0, Object object0) {
        return object0 instanceof Room ? room0 == object0 || zzt.equal(((Room)object0).getRoomId(), room0.getRoomId()) && zzt.equal(((Room)object0).getCreatorId(), room0.getCreatorId()) && zzt.equal(((Room)object0).getCreationTimestamp(), room0.getCreationTimestamp()) && zzt.equal(((Room)object0).getStatus(), room0.getStatus()) && zzt.equal(((Room)object0).getDescription(), room0.getDescription()) && zzt.equal(((Room)object0).getVariant(), room0.getVariant()) && zzt.equal(((Room)object0).getAutoMatchCriteria(), room0.getAutoMatchCriteria()) && zzt.equal(((Room)object0).getParticipants(), room0.getParticipants()) && zzt.equal(((Room)object0).getAutoMatchWaitEstimateSeconds(), room0.getAutoMatchWaitEstimateSeconds()) : false;
    }

    static String zzb(Room room0) {
        return zzt.zzt(room0).zzg("RoomId", room0.getRoomId()).zzg("CreatorId", room0.getCreatorId()).zzg("CreationTimestamp", room0.getCreationTimestamp()).zzg("RoomStatus", room0.getStatus()).zzg("Description", room0.getDescription()).zzg("Variant", room0.getVariant()).zzg("AutoMatchCriteria", room0.getAutoMatchCriteria()).zzg("Participants", room0.getParticipants()).zzg("AutoMatchWaitEstimateSeconds", room0.getAutoMatchWaitEstimateSeconds()).toString();
    }

    static String zzb(Room room0, String s) {
        ArrayList arrayList0 = room0.getParticipants();
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

    static Participant zzc(Room room0, String s) {
        ArrayList arrayList0 = room0.getParticipants();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Participant participant0 = (Participant)arrayList0.get(v1);
            if(participant0.getParticipantId().equals(s)) {
                return participant0;
            }
        }
        throw new IllegalStateException("Participant " + s + " is not in match " + room0.getRoomId());
    }

    static ArrayList zzc(Room room0) {
        ArrayList arrayList0 = room0.getParticipants();
        int v = arrayList0.size();
        ArrayList arrayList1 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList1.add(((Participant)arrayList0.get(v1)).getParticipantId());
        }
        return arrayList1;
    }
}

