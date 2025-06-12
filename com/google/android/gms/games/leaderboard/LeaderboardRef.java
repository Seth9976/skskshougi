package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;

public final class LeaderboardRef extends zzc implements Leaderboard {
    private final int zzaoG;
    private final Game zzatB;

    LeaderboardRef(DataHolder holder, int dataRow, int numChildren) {
        super(holder, dataRow);
        this.zzaoG = numChildren;
        this.zzatB = new GameRef(holder, dataRow);
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return LeaderboardEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zztE();
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public String getDisplayName() {
        return this.getString("name");
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public void getDisplayName(CharArrayBuffer dataOut) {
        this.zza("name", dataOut);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public Game getGame() {
        return this.zzatB;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public Uri getIconImageUri() {
        return this.zzbW("board_icon_image_uri");
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public String getIconImageUrl() {
        return this.getString("board_icon_image_url");
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public String getLeaderboardId() {
        return this.getString("external_leaderboard_id");
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public int getScoreOrder() {
        return this.getInteger("score_order");
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public ArrayList getVariants() {
        ArrayList arrayList0 = new ArrayList(this.zzaoG);
        for(int v = 0; v < this.zzaoG; ++v) {
            arrayList0.add(new LeaderboardVariantRef(this.zzWu, this.zzYs + v));
        }
        return arrayList0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return LeaderboardEntity.zza(this);
    }

    @Override
    public String toString() {
        return LeaderboardEntity.zzb(this);
    }

    public Leaderboard zztE() {
        return new LeaderboardEntity(this);
    }
}

