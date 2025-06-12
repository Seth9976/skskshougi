package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class ParticipantRef extends zzc implements Participant {
    private final PlayerRef zzaun;

    public ParticipantRef(DataHolder holder, int dataRow) {
        super(holder, dataRow);
        this.zzaun = new PlayerRef(holder, dataRow);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return ParticipantEntity.zza(this, obj);
    }

    public Participant freeze() {
        return new ParticipantEntity(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.freeze();
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public int getCapabilities() {
        return this.getInteger("capabilities");
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.multiplayer.Participant
    public String getDisplayName() {
        return this.zzbX("external_player_id") ? this.getString("default_display_name") : this.zzaun.getDisplayName();
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public void getDisplayName(CharArrayBuffer dataOut) {
        if(this.zzbX("external_player_id")) {
            this.zza("default_display_name", dataOut);
            return;
        }
        this.zzaun.getDisplayName(dataOut);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.multiplayer.Participant
    public Uri getHiResImageUri() {
        return this.zzbX("external_player_id") ? this.zzbW("default_display_hi_res_image_uri") : this.zzaun.getHiResImageUri();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.multiplayer.Participant
    public String getHiResImageUrl() {
        return this.zzbX("external_player_id") ? this.getString("default_display_hi_res_image_url") : this.zzaun.getHiResImageUrl();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.multiplayer.Participant
    public Uri getIconImageUri() {
        return this.zzbX("external_player_id") ? this.zzbW("default_display_image_uri") : this.zzaun.getIconImageUri();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.multiplayer.Participant
    public String getIconImageUrl() {
        return this.zzbX("external_player_id") ? this.getString("default_display_image_url") : this.zzaun.getIconImageUrl();
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public String getParticipantId() {
        return this.getString("external_participant_id");
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public Player getPlayer() {
        return this.zzbX("external_player_id") ? null : this.zzaun;
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public ParticipantResult getResult() {
        if(this.zzbX("result_type")) {
            return null;
        }
        int v = this.getInteger("result_type");
        int v1 = this.getInteger("placing");
        return new ParticipantResult(this.getParticipantId(), v, v1);
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public int getStatus() {
        return this.getInteger("player_status");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return ParticipantEntity.zza(this);
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public boolean isConnectedToRoom() {
        return this.getInteger("connected") > 0;
    }

    @Override
    public String toString() {
        return ParticipantEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((ParticipantEntity)this.freeze()).writeToParcel(dest, flags);
    }

    @Override  // com.google.android.gms.games.multiplayer.Participant
    public String zzsr() {
        return this.getString("client_address");
    }
}

