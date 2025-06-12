package com.google.android.gms.games.request;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import java.util.ArrayList;
import java.util.List;

public final class GameRequestRef extends zzc implements GameRequest {
    private final int zzaoG;

    public GameRequestRef(DataHolder holder, int dataRow, int numChildren) {
        super(holder, dataRow);
        this.zzaoG = numChildren;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return GameRequestEntity.zza(this, obj);
    }

    public GameRequest freeze() {
        return new GameRequestEntity(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.freeze();
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public long getCreationTimestamp() {
        return this.getLong("creation_timestamp");
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public byte[] getData() {
        return this.getByteArray("data");
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public long getExpirationTimestamp() {
        return this.getLong("expiration_timestamp");
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public Game getGame() {
        return new GameRef(this.zzWu, this.zzYs);
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public int getRecipientStatus(String playerId) {
        for(int v = this.zzYs; v < this.zzYs + this.zzaoG; ++v) {
            int v1 = this.zzWu.zzbh(v);
            if(this.zzWu.zzd("recipient_external_player_id", v, v1).equals(playerId)) {
                return this.zzWu.zzc("recipient_status", v, v1);
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public List getRecipients() {
        List list0 = new ArrayList(this.zzaoG);
        for(int v = 0; v < this.zzaoG; ++v) {
            ((ArrayList)list0).add(new PlayerRef(this.zzWu, this.zzYs + v, "recipient_"));
        }
        return list0;
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public String getRequestId() {
        return this.getString("external_request_id");
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public Player getSender() {
        return new PlayerRef(this.zzWu, this.zzne(), "sender_");
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public int getStatus() {
        return this.getInteger("status");
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public int getType() {
        return this.getInteger("type");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return GameRequestEntity.zza(this);
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public boolean isConsumed(String playerId) {
        return this.getRecipientStatus(playerId) == 1;
    }

    @Override
    public String toString() {
        return GameRequestEntity.zzc(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((GameRequestEntity)this.freeze()).writeToParcel(dest, flags);
    }
}

