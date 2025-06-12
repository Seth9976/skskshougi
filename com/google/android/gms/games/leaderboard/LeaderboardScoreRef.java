package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class LeaderboardScoreRef extends zzc implements LeaderboardScore {
    private final PlayerRef zzatP;

    LeaderboardScoreRef(DataHolder holder, int dataRow) {
        super(holder, dataRow);
        this.zzatP = new PlayerRef(holder, dataRow);
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return LeaderboardScoreEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zztG();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public String getDisplayRank() {
        return this.getString("display_rank");
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public void getDisplayRank(CharArrayBuffer dataOut) {
        this.zza("display_rank", dataOut);
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public String getDisplayScore() {
        return this.getString("display_score");
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public void getDisplayScore(CharArrayBuffer dataOut) {
        this.zza("display_score", dataOut);
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public long getRank() {
        return this.getLong("rank");
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public long getRawScore() {
        return this.getLong("raw_score");
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public Player getScoreHolder() {
        return this.zzbX("external_player_id") ? null : this.zzatP;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public String getScoreHolderDisplayName() {
        return this.zzbX("external_player_id") ? this.getString("default_display_name") : this.zzatP.getDisplayName();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public void getScoreHolderDisplayName(CharArrayBuffer dataOut) {
        if(this.zzbX("external_player_id")) {
            this.zza("default_display_name", dataOut);
            return;
        }
        this.zzatP.getDisplayName(dataOut);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public Uri getScoreHolderHiResImageUri() {
        return this.zzbX("external_player_id") ? null : this.zzatP.getHiResImageUri();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public String getScoreHolderHiResImageUrl() {
        return this.zzbX("external_player_id") ? null : this.zzatP.getHiResImageUrl();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public Uri getScoreHolderIconImageUri() {
        return this.zzbX("external_player_id") ? this.zzbW("default_display_image_uri") : this.zzatP.getIconImageUri();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public String getScoreHolderIconImageUrl() {
        return this.zzbX("external_player_id") ? this.getString("default_display_image_url") : this.zzatP.getIconImageUrl();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public String getScoreTag() {
        return this.getString("score_tag");
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public long getTimestampMillis() {
        return this.getLong("achieved_timestamp");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return LeaderboardScoreEntity.zza(this);
    }

    @Override
    public String toString() {
        return LeaderboardScoreEntity.zzb(this);
    }

    public LeaderboardScore zztG() {
        return new LeaderboardScoreEntity(this);
    }
}

