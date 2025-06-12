package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.internal.zzt.zza;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;

public final class LeaderboardVariantEntity implements LeaderboardVariant {
    private final int zzatQ;
    private final int zzatR;
    private final boolean zzatS;
    private final long zzatT;
    private final String zzatU;
    private final long zzatV;
    private final String zzatW;
    private final String zzatX;
    private final long zzatY;
    private final String zzatZ;
    private final String zzaua;
    private final String zzaub;

    public LeaderboardVariantEntity(LeaderboardVariant variant) {
        this.zzatQ = variant.getTimeSpan();
        this.zzatR = variant.getCollection();
        this.zzatS = variant.hasPlayerInfo();
        this.zzatT = variant.getRawPlayerScore();
        this.zzatU = variant.getDisplayPlayerScore();
        this.zzatV = variant.getPlayerRank();
        this.zzatW = variant.getDisplayPlayerRank();
        this.zzatX = variant.getPlayerScoreTag();
        this.zzatY = variant.getNumScores();
        this.zzatZ = variant.zztH();
        this.zzaua = variant.zztI();
        this.zzaub = variant.zztJ();
    }

    @Override
    public boolean equals(Object obj) {
        return LeaderboardVariantEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public int getCollection() {
        return this.zzatR;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public String getDisplayPlayerRank() {
        return this.zzatW;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public String getDisplayPlayerScore() {
        return this.zzatU;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public long getNumScores() {
        return this.zzatY;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public long getPlayerRank() {
        return this.zzatV;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public String getPlayerScoreTag() {
        return this.zzatX;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public long getRawPlayerScore() {
        return this.zzatT;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public int getTimeSpan() {
        return this.zzatQ;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public boolean hasPlayerInfo() {
        return this.zzatS;
    }

    @Override
    public int hashCode() {
        return LeaderboardVariantEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return LeaderboardVariantEntity.zzb(this);
    }

    static int zza(LeaderboardVariant leaderboardVariant0) {
        return zzt.hashCode(new Object[]{leaderboardVariant0.getTimeSpan(), leaderboardVariant0.getCollection(), Boolean.valueOf(leaderboardVariant0.hasPlayerInfo()), leaderboardVariant0.getRawPlayerScore(), leaderboardVariant0.getDisplayPlayerScore(), leaderboardVariant0.getPlayerRank(), leaderboardVariant0.getDisplayPlayerRank(), leaderboardVariant0.getNumScores(), leaderboardVariant0.zztH(), leaderboardVariant0.zztJ(), leaderboardVariant0.zztI()});
    }

    // 去混淆评级： 中等(120)
    static boolean zza(LeaderboardVariant leaderboardVariant0, Object object0) {
        return object0 instanceof LeaderboardVariant ? leaderboardVariant0 == object0 || zzt.equal(((LeaderboardVariant)object0).getTimeSpan(), leaderboardVariant0.getTimeSpan()) && zzt.equal(((LeaderboardVariant)object0).getCollection(), leaderboardVariant0.getCollection()) && zzt.equal(Boolean.valueOf(((LeaderboardVariant)object0).hasPlayerInfo()), Boolean.valueOf(leaderboardVariant0.hasPlayerInfo())) && zzt.equal(((LeaderboardVariant)object0).getRawPlayerScore(), leaderboardVariant0.getRawPlayerScore()) && zzt.equal(((LeaderboardVariant)object0).getDisplayPlayerScore(), leaderboardVariant0.getDisplayPlayerScore()) && zzt.equal(((LeaderboardVariant)object0).getPlayerRank(), leaderboardVariant0.getPlayerRank()) && zzt.equal(((LeaderboardVariant)object0).getDisplayPlayerRank(), leaderboardVariant0.getDisplayPlayerRank()) && zzt.equal(((LeaderboardVariant)object0).getNumScores(), leaderboardVariant0.getNumScores()) && zzt.equal(((LeaderboardVariant)object0).zztH(), leaderboardVariant0.zztH()) && zzt.equal(((LeaderboardVariant)object0).zztJ(), leaderboardVariant0.zztJ()) && zzt.equal(((LeaderboardVariant)object0).zztI(), leaderboardVariant0.zztI()) : false;
    }

    static String zzb(LeaderboardVariant leaderboardVariant0) {
        zza zzt$zza0 = zzt.zzt(leaderboardVariant0).zzg("TimeSpan", TimeSpan.zzfG(leaderboardVariant0.getTimeSpan())).zzg("Collection", LeaderboardCollection.zzfG(leaderboardVariant0.getCollection()));
        Long long0 = leaderboardVariant0.hasPlayerInfo() ? leaderboardVariant0.getRawPlayerScore() : "none";
        zza zzt$zza1 = zzt$zza0.zzg("RawPlayerScore", long0).zzg("DisplayPlayerScore", (leaderboardVariant0.hasPlayerInfo() ? leaderboardVariant0.getDisplayPlayerScore() : "none"));
        Long long1 = leaderboardVariant0.hasPlayerInfo() ? leaderboardVariant0.getPlayerRank() : "none";
        zza zzt$zza2 = zzt$zza1.zzg("PlayerRank", long1);
        return leaderboardVariant0.hasPlayerInfo() ? zzt$zza2.zzg("DisplayPlayerRank", leaderboardVariant0.getDisplayPlayerRank()).zzg("NumScores", leaderboardVariant0.getNumScores()).zzg("TopPageNextToken", leaderboardVariant0.zztH()).zzg("WindowPageNextToken", leaderboardVariant0.zztJ()).zzg("WindowPagePrevToken", leaderboardVariant0.zztI()).toString() : zzt$zza2.zzg("DisplayPlayerRank", "none").zzg("NumScores", leaderboardVariant0.getNumScores()).zzg("TopPageNextToken", leaderboardVariant0.zztH()).zzg("WindowPageNextToken", leaderboardVariant0.zztJ()).zzg("WindowPagePrevToken", leaderboardVariant0.zztI()).toString();
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public String zztH() {
        return this.zzatZ;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public String zztI() {
        return this.zzaua;
    }

    @Override  // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public String zztJ() {
        return this.zzaub;
    }

    public LeaderboardVariant zztK() [...] // Inlined contents
}

