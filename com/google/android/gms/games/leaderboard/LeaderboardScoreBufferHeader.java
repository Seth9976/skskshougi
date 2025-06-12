package com.google.android.gms.games.leaderboard;

import android.os.Bundle;

public final class LeaderboardScoreBufferHeader {
    public static final class Builder {
    }

    private final Bundle zzNW;

    public LeaderboardScoreBufferHeader(Bundle bundle) {
        if(bundle == null) {
            bundle = new Bundle();
        }
        this.zzNW = bundle;
    }

    public Bundle asBundle() {
        return this.zzNW;
    }

    class com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader.1 {
    }

}

