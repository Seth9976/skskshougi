package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.zzlc;
import java.util.ArrayList;

public final class LeaderboardEntity implements Leaderboard {
    private final String zzadI;
    private final Uri zzanf;
    private final String zzanq;
    private final ArrayList zzatA;
    private final Game zzatB;
    private final String zzaty;
    private final int zzatz;

    public LeaderboardEntity(Leaderboard leaderboard) {
        this.zzaty = leaderboard.getLeaderboardId();
        this.zzadI = leaderboard.getDisplayName();
        this.zzanf = leaderboard.getIconImageUri();
        this.zzanq = leaderboard.getIconImageUrl();
        this.zzatz = leaderboard.getScoreOrder();
        Game game0 = leaderboard.getGame();
        this.zzatB = game0 == null ? null : new GameEntity(game0);
        ArrayList arrayList0 = leaderboard.getVariants();
        int v = arrayList0.size();
        this.zzatA = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            LeaderboardVariantEntity leaderboardVariantEntity0 = (LeaderboardVariantEntity)((LeaderboardVariant)arrayList0.get(v1)).freeze();
            this.zzatA.add(leaderboardVariantEntity0);
        }
    }

    @Override
    public boolean equals(Object obj) {
        return LeaderboardEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public String getDisplayName() {
        return this.zzadI;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public void getDisplayName(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzadI, dataOut);
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public Game getGame() {
        return this.zzatB;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public Uri getIconImageUri() {
        return this.zzanf;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public String getIconImageUrl() {
        return this.zzanq;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public String getLeaderboardId() {
        return this.zzaty;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public int getScoreOrder() {
        return this.zzatz;
    }

    @Override  // com.google.android.gms.games.leaderboard.Leaderboard
    public ArrayList getVariants() {
        return new ArrayList(this.zzatA);
    }

    @Override
    public int hashCode() {
        return LeaderboardEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return LeaderboardEntity.zzb(this);
    }

    static int zza(Leaderboard leaderboard0) {
        return zzt.hashCode(new Object[]{leaderboard0.getLeaderboardId(), leaderboard0.getDisplayName(), leaderboard0.getIconImageUri(), leaderboard0.getScoreOrder(), leaderboard0.getVariants()});
    }

    // 去混淆评级： 中等(60)
    static boolean zza(Leaderboard leaderboard0, Object object0) {
        return object0 instanceof Leaderboard ? leaderboard0 == object0 || zzt.equal(((Leaderboard)object0).getLeaderboardId(), leaderboard0.getLeaderboardId()) && zzt.equal(((Leaderboard)object0).getDisplayName(), leaderboard0.getDisplayName()) && zzt.equal(((Leaderboard)object0).getIconImageUri(), leaderboard0.getIconImageUri()) && zzt.equal(((Leaderboard)object0).getScoreOrder(), leaderboard0.getScoreOrder()) && zzt.equal(((Leaderboard)object0).getVariants(), leaderboard0.getVariants()) : false;
    }

    static String zzb(Leaderboard leaderboard0) {
        return zzt.zzt(leaderboard0).zzg("LeaderboardId", leaderboard0.getLeaderboardId()).zzg("DisplayName", leaderboard0.getDisplayName()).zzg("IconImageUri", leaderboard0.getIconImageUri()).zzg("IconImageUrl", leaderboard0.getIconImageUrl()).zzg("ScoreOrder", leaderboard0.getScoreOrder()).zzg("Variants", leaderboard0.getVariants()).toString();
    }

    public Leaderboard zztE() [...] // Inlined contents
}

