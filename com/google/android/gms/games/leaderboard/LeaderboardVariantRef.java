package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class LeaderboardVariantRef extends zzc implements LeaderboardVariant {
    LeaderboardVariantRef(DataHolder holder, int dataRow) {
        super(holder, dataRow);
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return LeaderboardVariantEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zztK();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public int getCollection() {
        return this.getInteger("collection");
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public String getDisplayPlayerRank() {
        return this.getString("player_display_rank");
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public String getDisplayPlayerScore() {
        return this.getString("player_display_score");
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public long getNumScores() {
        return this.zzbX("total_scores") ? -1L : this.getLong("total_scores");
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public long getPlayerRank() {
        return this.zzbX("player_rank") ? -1L : this.getLong("player_rank");
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public String getPlayerScoreTag() {
        return this.getString("player_score_tag");
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public long getRawPlayerScore() {
        return this.zzbX("player_raw_score") ? -1L : this.getLong("player_raw_score");
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public int getTimeSpan() {
        return this.getInteger("timespan");
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public boolean hasPlayerInfo() {
        return !this.zzbX("player_raw_score");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return LeaderboardVariantEntity.zza(this);
    }

    @Override
    public String toString() {
        return LeaderboardVariantEntity.zzb(this);
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public String zztH() {
        return this.getString("top_page_token_next");
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public String zztI() {
        return this.getString("window_page_token_prev");
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public String zztJ() {
        return this.getString("window_page_token_next");
    }

    public LeaderboardVariant zztK() {
        return new LeaderboardVariantEntity(this);
    }
}

