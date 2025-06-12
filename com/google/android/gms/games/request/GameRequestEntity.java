package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class GameRequestEntity implements SafeParcelable, GameRequest {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzDK;
    private final int zzSq;
    private final byte[] zzauL;
    private final GameEntity zzaud;
    private final long zzaue;
    private final PlayerEntity zzavf;
    private final ArrayList zzavg;
    private final long zzavh;
    private final Bundle zzavi;
    private final int zzwS;

    static {
        GameRequestEntity.CREATOR = new GameRequestEntityCreator();
    }

    GameRequestEntity(int versionCode, GameEntity game, PlayerEntity sender, byte[] data, String requestId, ArrayList arrayList0, int type, long creationTimestamp, long expirationTimestamp, Bundle recipientStatuses, int status) {
        this.zzCY = versionCode;
        this.zzaud = game;
        this.zzavf = sender;
        this.zzauL = data;
        this.zzDK = requestId;
        this.zzavg = arrayList0;
        this.zzSq = type;
        this.zzaue = creationTimestamp;
        this.zzavh = expirationTimestamp;
        this.zzavi = recipientStatuses;
        this.zzwS = status;
    }

    public GameRequestEntity(GameRequest request) {
        this.zzCY = 2;
        this.zzaud = new GameEntity(request.getGame());
        this.zzavf = new PlayerEntity(request.getSender());
        this.zzDK = request.getRequestId();
        this.zzSq = request.getType();
        this.zzaue = request.getCreationTimestamp();
        this.zzavh = request.getExpirationTimestamp();
        this.zzwS = request.getStatus();
        byte[] arr_b = request.getData();
        if(arr_b == null) {
            this.zzauL = null;
        }
        else {
            this.zzauL = new byte[arr_b.length];
            System.arraycopy(arr_b, 0, this.zzauL, 0, arr_b.length);
        }
        List list0 = request.getRecipients();
        int v = list0.size();
        this.zzavg = new ArrayList(v);
        this.zzavi = new Bundle();
        for(int v1 = 0; v1 < v; ++v1) {
            Player player0 = (Player)((Player)list0.get(v1)).freeze();
            String s = player0.getPlayerId();
            this.zzavg.add(((PlayerEntity)player0));
            int v2 = request.getRecipientStatus(s);
            this.zzavi.putInt(s, v2);
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return GameRequestEntity.zza(this, obj);
    }

    public GameRequest freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public long getCreationTimestamp() {
        return this.zzaue;
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public byte[] getData() {
        return this.zzauL;
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public long getExpirationTimestamp() {
        return this.zzavh;
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public Game getGame() {
        return this.zzaud;
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public int getRecipientStatus(String playerId) {
        return this.zzavi.getInt(playerId, 0);
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public List getRecipients() {
        return new ArrayList(this.zzavg);
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public String getRequestId() {
        return this.zzDK;
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public Player getSender() {
        return this.zzavf;
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public int getStatus() {
        return this.zzwS;
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public int getType() {
        return this.zzSq;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return GameRequestEntity.zza(this);
    }

    @Override  // com.google.android.gms.games.request.GameRequest
    public boolean isConsumed(String playerId) {
        return this.getRecipientStatus(playerId) == 1;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return GameRequestEntity.zzc(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        GameRequestEntityCreator.zza(this, dest, flags);
    }

    static int zza(GameRequest gameRequest0) {
        return zzt.hashCode(new Object[]{gameRequest0.getGame(), gameRequest0.getRecipients(), gameRequest0.getRequestId(), gameRequest0.getSender(), GameRequestEntity.zzb(gameRequest0), gameRequest0.getType(), gameRequest0.getCreationTimestamp(), gameRequest0.getExpirationTimestamp()});
    }

    // 去混淆评级： 中等(90)
    static boolean zza(GameRequest gameRequest0, Object object0) {
        return object0 instanceof GameRequest ? gameRequest0 == object0 || zzt.equal(((GameRequest)object0).getGame(), gameRequest0.getGame()) && zzt.equal(((GameRequest)object0).getRecipients(), gameRequest0.getRecipients()) && zzt.equal(((GameRequest)object0).getRequestId(), gameRequest0.getRequestId()) && zzt.equal(((GameRequest)object0).getSender(), gameRequest0.getSender()) && Arrays.equals(GameRequestEntity.zzb(((GameRequest)object0)), GameRequestEntity.zzb(gameRequest0)) && zzt.equal(((GameRequest)object0).getType(), gameRequest0.getType()) && zzt.equal(((GameRequest)object0).getCreationTimestamp(), gameRequest0.getCreationTimestamp()) && zzt.equal(((GameRequest)object0).getExpirationTimestamp(), gameRequest0.getExpirationTimestamp()) : false;
    }

    private static int[] zzb(GameRequest gameRequest0) {
        List list0 = gameRequest0.getRecipients();
        int v = list0.size();
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = gameRequest0.getRecipientStatus(((Player)list0.get(v1)).getPlayerId());
        }
        return arr_v;
    }

    static String zzc(GameRequest gameRequest0) {
        return zzt.zzt(gameRequest0).zzg("Game", gameRequest0.getGame()).zzg("Sender", gameRequest0.getSender()).zzg("Recipients", gameRequest0.getRecipients()).zzg("Data", gameRequest0.getData()).zzg("RequestId", gameRequest0.getRequestId()).zzg("Type", gameRequest0.getType()).zzg("CreationTimestamp", gameRequest0.getCreationTimestamp()).zzg("ExpirationTimestamp", gameRequest0.getExpirationTimestamp()).toString();
    }

    public Bundle zztP() {
        return this.zzavi;
    }
}

