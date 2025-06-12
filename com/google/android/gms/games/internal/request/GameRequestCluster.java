package com.google.android.gms.games.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;
import java.util.List;

public final class GameRequestCluster implements SafeParcelable, GameRequest {
    public static final GameRequestClusterCreator CREATOR;
    private final int zzCY;
    private final ArrayList zzatv;

    static {
        GameRequestCluster.CREATOR = new GameRequestClusterCreator();
    }

    GameRequestCluster(int versionCode, ArrayList arrayList0) {
        this.zzCY = versionCode;
        this.zzatv = arrayList0;
        this.zztn();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof GameRequestCluster)) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        if(((GameRequestCluster)obj).zzatv.size() != this.zzatv.size()) {
            return false;
        }
        int v = this.zzatv.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((GameRequest)this.zzatv.get(v1)).equals(((GameRequest)((GameRequestCluster)obj).zzatv.get(v1)))) {
                return false;
            }
        }
        return true;
    }

    public GameRequest freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public long getCreationTimestamp() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public byte[] getData() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public long getExpirationTimestamp() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public Game getGame() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public int getRecipientStatus(String playerId) {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public List getRecipients() {
        return this.zztC();
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public String getRequestId() {
        return ((GameRequestEntity)this.zzatv.get(0)).getRequestId();
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public Player getSender() {
        return ((GameRequestEntity)this.zzatv.get(0)).getSender();
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public int getStatus() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public int getType() {
        return ((GameRequestEntity)this.zzatv.get(0)).getType();
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(this.zzatv.toArray());
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public boolean isConsumed(String playerId) {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        GameRequestClusterCreator.zza(this, dest, flags);
    }

    public ArrayList zztB() {
        return new ArrayList(this.zzatv);
    }

    public ArrayList zztC() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    private void zztn() {
        zzb.zzU(!this.zzatv.isEmpty());
        GameRequest gameRequest0 = (GameRequest)this.zzatv.get(0);
        int v = this.zzatv.size();
        for(int v1 = 1; v1 < v; ++v1) {
            GameRequest gameRequest1 = (GameRequest)this.zzatv.get(v1);
            zzb.zza(gameRequest0.getType() == gameRequest1.getType(), "All the requests must be of the same type");
            zzb.zza(gameRequest0.getSender().equals(gameRequest1.getSender()), "All the requests must be from the same sender");
        }
    }
}

