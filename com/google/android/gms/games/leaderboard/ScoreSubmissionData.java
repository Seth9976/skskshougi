package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzt.zza;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.internal.constants.TimeSpan;
import java.util.HashMap;

public final class ScoreSubmissionData {
    public static final class Result {
        public final String formattedScore;
        public final boolean newBest;
        public final long rawScore;
        public final String scoreTag;

        public Result(long rawScore, String formattedScore, String scoreTag, boolean newBest) {
            this.rawScore = rawScore;
            this.formattedScore = formattedScore;
            this.scoreTag = scoreTag;
            this.newBest = newBest;
        }

        @Override
        public String toString() {
            return zzt.zzt(this).zzg("RawScore", this.rawScore).zzg("FormattedScore", this.formattedScore).zzg("ScoreTag", this.scoreTag).zzg("NewBest", Boolean.valueOf(this.newBest)).toString();
        }
    }

    private String zzTL;
    private int zzTS;
    private static final String[] zzatw;
    private String zzaty;
    private HashMap zzauc;

    static {
        ScoreSubmissionData.zzatw = new String[]{"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"};
    }

    public ScoreSubmissionData(DataHolder dataHolder) {
        this.zzTS = dataHolder.getStatusCode();
        this.zzauc = new HashMap();
        int v = dataHolder.getCount();
        zzu.zzV(v == 3);
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = dataHolder.zzbh(v1);
            if(v1 == 0) {
                this.zzaty = dataHolder.zzd("leaderboardId", 0, v2);
                this.zzTL = dataHolder.zzd("playerId", 0, v2);
            }
            if(dataHolder.zze("hasResult", v1, v2)) {
                this.zza(new Result(dataHolder.zzb("rawScore", v1, v2), dataHolder.zzd("formattedScore", v1, v2), dataHolder.zzd("scoreTag", v1, v2), dataHolder.zze("newBest", v1, v2)), dataHolder.zzc("timeSpan", v1, v2));
            }
        }
    }

    public String getLeaderboardId() {
        return this.zzaty;
    }

    public String getPlayerId() {
        return this.zzTL;
    }

    public Result getScoreResult(int timeSpan) {
        return (Result)this.zzauc.get(timeSpan);
    }

    @Override
    public String toString() {
        zza zzt$zza0 = zzt.zzt(this).zzg("PlayerId", this.zzTL).zzg("StatusCode", this.zzTS);
        for(int v = 0; v < 3; ++v) {
            Result scoreSubmissionData$Result0 = (Result)this.zzauc.get(v);
            zzt$zza0.zzg("TimesSpan", TimeSpan.zzfG(v));
            zzt$zza0.zzg("Result", (scoreSubmissionData$Result0 == null ? "null" : scoreSubmissionData$Result0.toString()));
        }
        return zzt$zza0.toString();
    }

    private void zza(Result scoreSubmissionData$Result0, int v) {
        this.zzauc.put(v, scoreSubmissionData$Result0);
    }
}

