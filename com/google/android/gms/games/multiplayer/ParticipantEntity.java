package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.zzlc;

public final class ParticipantEntity extends GamesDowngradeableSafeParcel implements Participant {
    static final class ParticipantEntityCreatorCompat extends ParticipantEntityCreator {
        @Override  // com.google.android.gms.games.multiplayer.ParticipantEntityCreator
        public Object createFromParcel(Parcel x0) {
            return this.zzdJ(x0);
        }

        @Override  // com.google.android.gms.games.multiplayer.ParticipantEntityCreator
        public ParticipantEntity zzdJ(Parcel parcel0) {
            if(ParticipantEntity.zzd(ParticipantEntity.zznE()) || ParticipantEntity.zzca(ParticipantEntity.class.getCanonicalName())) {
                return super.zzdJ(parcel0);
            }
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            String s2 = parcel0.readString();
            Uri uri0 = s2 == null ? null : Uri.parse(s2);
            String s3 = parcel0.readString();
            Uri uri1 = s3 == null ? null : Uri.parse(s3);
            int v = parcel0.readInt();
            String s4 = parcel0.readString();
            if(parcel0.readInt() > 0) {
                return parcel0.readInt() <= 0 ? new ParticipantEntity(3, s, s1, uri0, uri1, v, s4, true, null, 7, null, null, null) : new ParticipantEntity(3, s, s1, uri0, uri1, v, s4, true, ((PlayerEntity)PlayerEntity.CREATOR.createFromParcel(parcel0)), 7, null, null, null);
            }
            return parcel0.readInt() <= 0 ? new ParticipantEntity(3, s, s1, uri0, uri1, v, s4, false, null, 7, null, null, null) : new ParticipantEntity(3, s, s1, uri0, uri1, v, s4, false, ((PlayerEntity)PlayerEntity.CREATOR.createFromParcel(parcel0)), 7, null, null, null);
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final int zzQT;
    private final String zzadI;
    private final Uri zzanf;
    private final Uri zzang;
    private final String zzanq;
    private final String zzanr;
    private final String zzaoO;
    private final PlayerEntity zzaog;
    private final String zzapO;
    private final boolean zzaul;
    private final ParticipantResult zzaum;
    private final int zzwS;

    static {
        ParticipantEntity.CREATOR = new ParticipantEntityCreatorCompat();
    }

    ParticipantEntity(int versionCode, String participantId, String displayName, Uri iconImageUri, Uri hiResImageUri, int status, String clientAddress, boolean connectedToRoom, PlayerEntity player, int capabilities, ParticipantResult result, String iconImageUrl, String hiResImageUrl) {
        this.zzCY = versionCode;
        this.zzapO = participantId;
        this.zzadI = displayName;
        this.zzanf = iconImageUri;
        this.zzang = hiResImageUri;
        this.zzwS = status;
        this.zzaoO = clientAddress;
        this.zzaul = connectedToRoom;
        this.zzaog = player;
        this.zzQT = capabilities;
        this.zzaum = result;
        this.zzanq = iconImageUrl;
        this.zzanr = hiResImageUrl;
    }

    public ParticipantEntity(Participant participant) {
        this.zzCY = 3;
        this.zzapO = participant.getParticipantId();
        this.zzadI = participant.getDisplayName();
        this.zzanf = participant.getIconImageUri();
        this.zzang = participant.getHiResImageUri();
        this.zzwS = participant.getStatus();
        this.zzaoO = participant.zzsr();
        this.zzaul = participant.isConnectedToRoom();
        Player player0 = participant.getPlayer();
        this.zzaog = player0 == null ? null : new PlayerEntity(player0);
        this.zzQT = participant.getCapabilities();
        this.zzaum = participant.getResult();
        this.zzanq = participant.getIconImageUrl();
        this.zzanr = participant.getHiResImageUrl();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return ParticipantEntity.zza(this, obj);
    }

    public Participant freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public int getCapabilities() {
        return this.zzQT;
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public String getDisplayName() {
        return this.zzaog == null ? this.zzadI : this.zzaog.getDisplayName();
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public void getDisplayName(CharArrayBuffer dataOut) {
        if(this.zzaog == null) {
            zzlc.zzb(this.zzadI, dataOut);
            return;
        }
        this.zzaog.getDisplayName(dataOut);
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public Uri getHiResImageUri() {
        return this.zzaog == null ? this.zzang : this.zzaog.getHiResImageUri();
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public String getHiResImageUrl() {
        return this.zzaog == null ? this.zzanr : this.zzaog.getHiResImageUrl();
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public Uri getIconImageUri() {
        return this.zzaog == null ? this.zzanf : this.zzaog.getIconImageUri();
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public String getIconImageUrl() {
        return this.zzaog == null ? this.zzanq : this.zzaog.getIconImageUrl();
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public String getParticipantId() {
        return this.zzapO;
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public Player getPlayer() {
        return this.zzaog;
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public ParticipantResult getResult() {
        return this.zzaum;
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public int getStatus() {
        return this.zzwS;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return ParticipantEntity.zza(this);
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public boolean isConnectedToRoom() {
        return this.zzaul;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return ParticipantEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        String s = null;
        int v1 = 0;
        if(!this.zznF()) {
            ParticipantEntityCreator.zza(this, dest, flags);
            return;
        }
        dest.writeString(this.zzapO);
        dest.writeString(this.zzadI);
        dest.writeString((this.zzanf == null ? null : this.zzanf.toString()));
        if(this.zzang != null) {
            s = this.zzang.toString();
        }
        dest.writeString(s);
        dest.writeInt(this.zzwS);
        dest.writeString(this.zzaoO);
        dest.writeInt((this.zzaul ? 1 : 0));
        if(this.zzaog != null) {
            v1 = 1;
        }
        dest.writeInt(v1);
        if(this.zzaog != null) {
            this.zzaog.writeToParcel(dest, flags);
        }
    }

    static int zza(Participant participant0) {
        return zzt.hashCode(new Object[]{participant0.getPlayer(), participant0.getStatus(), participant0.zzsr(), Boolean.valueOf(participant0.isConnectedToRoom()), participant0.getDisplayName(), participant0.getIconImageUri(), participant0.getHiResImageUri(), participant0.getCapabilities(), participant0.getResult(), participant0.getParticipantId()});
    }

    // 去混淆评级： 中等(110)
    static boolean zza(Participant participant0, Object object0) {
        return object0 instanceof Participant ? participant0 == object0 || zzt.equal(((Participant)object0).getPlayer(), participant0.getPlayer()) && zzt.equal(((Participant)object0).getStatus(), participant0.getStatus()) && zzt.equal(((Participant)object0).zzsr(), participant0.zzsr()) && zzt.equal(Boolean.valueOf(((Participant)object0).isConnectedToRoom()), Boolean.valueOf(participant0.isConnectedToRoom())) && zzt.equal(((Participant)object0).getDisplayName(), participant0.getDisplayName()) && zzt.equal(((Participant)object0).getIconImageUri(), participant0.getIconImageUri()) && zzt.equal(((Participant)object0).getHiResImageUri(), participant0.getHiResImageUri()) && zzt.equal(((Participant)object0).getCapabilities(), participant0.getCapabilities()) && zzt.equal(((Participant)object0).getResult(), participant0.getResult()) && zzt.equal(((Participant)object0).getParticipantId(), participant0.getParticipantId()) : false;
    }

    static String zzb(Participant participant0) {
        return zzt.zzt(participant0).zzg("ParticipantId", participant0.getParticipantId()).zzg("Player", participant0.getPlayer()).zzg("Status", participant0.getStatus()).zzg("ClientAddress", participant0.zzsr()).zzg("ConnectedToRoom", Boolean.valueOf(participant0.isConnectedToRoom())).zzg("DisplayName", participant0.getDisplayName()).zzg("IconImage", participant0.getIconImageUri()).zzg("IconImageUrl", participant0.getIconImageUrl()).zzg("HiResImage", participant0.getHiResImageUri()).zzg("HiResImageUrl", participant0.getHiResImageUrl()).zzg("Capabilities", participant0.getCapabilities()).zzg("Result", participant0.getResult()).toString();
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public String zzsr() {
        return this.zzaoO;
    }
}

