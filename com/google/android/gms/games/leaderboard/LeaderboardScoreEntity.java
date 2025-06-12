package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzt.zza;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzlc;

public final class LeaderboardScoreEntity implements LeaderboardScore {
    private final long zzatD;
    private final String zzatE;
    private final String zzatF;
    private final long zzatG;
    private final long zzatH;
    private final String zzatI;
    private final Uri zzatJ;
    private final Uri zzatK;
    private final PlayerEntity zzatL;
    private final String zzatM;
    private final String zzatN;
    private final String zzatO;

    public LeaderboardScoreEntity(LeaderboardScore score) {
        this.zzatD = score.getRank();
        this.zzatE = (String)zzu.zzu(score.getDisplayRank());
        this.zzatF = (String)zzu.zzu(score.getDisplayScore());
        this.zzatG = score.getRawScore();
        this.zzatH = score.getTimestampMillis();
        this.zzatI = score.getScoreHolderDisplayName();
        this.zzatJ = score.getScoreHolderIconImageUri();
        this.zzatK = score.getScoreHolderHiResImageUri();
        Player player0 = score.getScoreHolder();
        this.zzatL = player0 == null ? null : ((PlayerEntity)player0.freeze());
        this.zzatM = score.getScoreTag();
        this.zzatN = score.getScoreHolderIconImageUrl();
        this.zzatO = score.getScoreHolderHiResImageUrl();
    }

    @Override
    public boolean equals(Object obj) {
        return LeaderboardScoreEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public String getDisplayRank() {
        return this.zzatE;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public void getDisplayRank(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzatE, dataOut);
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public String getDisplayScore() {
        return this.zzatF;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public void getDisplayScore(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzatF, dataOut);
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public long getRank() {
        return this.zzatD;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public long getRawScore() {
        return this.zzatG;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public Player getScoreHolder() {
        return this.zzatL;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public String getScoreHolderDisplayName() {
        return this.zzatL == null ? this.zzatI : this.zzatL.getDisplayName();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public void getScoreHolderDisplayName(CharArrayBuffer dataOut) {
        if(this.zzatL == null) {
            zzlc.zzb(this.zzatI, dataOut);
            return;
        }
        this.zzatL.getDisplayName(dataOut);
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public Uri getScoreHolderHiResImageUri() {
        return this.zzatL == null ? this.zzatK : this.zzatL.getHiResImageUri();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public String getScoreHolderHiResImageUrl() {
        return this.zzatL == null ? this.zzatO : this.zzatL.getHiResImageUrl();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public Uri getScoreHolderIconImageUri() {
        return this.zzatL == null ? this.zzatJ : this.zzatL.getIconImageUri();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public String getScoreHolderIconImageUrl() {
        return this.zzatL == null ? this.zzatN : this.zzatL.getIconImageUrl();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public String getScoreTag() {
        return this.zzatM;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardScore
    public long getTimestampMillis() {
        return this.zzatH;
    }

    @Override
    public int hashCode() {
        return LeaderboardScoreEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return LeaderboardScoreEntity.zzb(this);
    }

    static int zza(LeaderboardScore leaderboardScore0) {
        return zzt.hashCode(new Object[]{leaderboardScore0.getRank(), leaderboardScore0.getDisplayRank(), leaderboardScore0.getRawScore(), leaderboardScore0.getDisplayScore(), leaderboardScore0.getTimestampMillis(), leaderboardScore0.getScoreHolderDisplayName(), leaderboardScore0.getScoreHolderIconImageUri(), leaderboardScore0.getScoreHolderHiResImageUri(), leaderboardScore0.getScoreHolder()});
    }

    // 去混淆评级： 中等(110)
    static boolean zza(LeaderboardScore leaderboardScore0, Object object0) {
        return object0 instanceof LeaderboardScore ? leaderboardScore0 == object0 || zzt.equal(((LeaderboardScore)object0).getRank(), leaderboardScore0.getRank()) && zzt.equal(((LeaderboardScore)object0).getDisplayRank(), leaderboardScore0.getDisplayRank()) && zzt.equal(((LeaderboardScore)object0).getRawScore(), leaderboardScore0.getRawScore()) && zzt.equal(((LeaderboardScore)object0).getDisplayScore(), leaderboardScore0.getDisplayScore()) && zzt.equal(((LeaderboardScore)object0).getTimestampMillis(), leaderboardScore0.getTimestampMillis()) && zzt.equal(((LeaderboardScore)object0).getScoreHolderDisplayName(), leaderboardScore0.getScoreHolderDisplayName()) && zzt.equal(((LeaderboardScore)object0).getScoreHolderIconImageUri(), leaderboardScore0.getScoreHolderIconImageUri()) && zzt.equal(((LeaderboardScore)object0).getScoreHolderHiResImageUri(), leaderboardScore0.getScoreHolderHiResImageUri()) && zzt.equal(((LeaderboardScore)object0).getScoreHolder(), leaderboardScore0.getScoreHolder()) && zzt.equal(((LeaderboardScore)object0).getScoreTag(), leaderboardScore0.getScoreTag()) : false;
    }

    static String zzb(LeaderboardScore leaderboardScore0) {
        zza zzt$zza0 = zzt.zzt(leaderboardScore0).zzg("Rank", leaderboardScore0.getRank()).zzg("DisplayRank", leaderboardScore0.getDisplayRank()).zzg("Score", leaderboardScore0.getRawScore()).zzg("DisplayScore", leaderboardScore0.getDisplayScore()).zzg("Timestamp", leaderboardScore0.getTimestampMillis()).zzg("DisplayName", leaderboardScore0.getScoreHolderDisplayName()).zzg("IconImageUri", leaderboardScore0.getScoreHolderIconImageUri()).zzg("IconImageUrl", leaderboardScore0.getScoreHolderIconImageUrl()).zzg("HiResImageUri", leaderboardScore0.getScoreHolderHiResImageUri()).zzg("HiResImageUrl", leaderboardScore0.getScoreHolderHiResImageUrl());
        return leaderboardScore0.getScoreHolder() == null ? zzt$zza0.zzg("Player", null).zzg("ScoreTag", leaderboardScore0.getScoreTag()).toString() : zzt$zza0.zzg("Player", leaderboardScore0.getScoreHolder()).zzg("ScoreTag", leaderboardScore0.getScoreTag()).toString();
    }

    public LeaderboardScore zztG() [...] // Inlined contents
}

