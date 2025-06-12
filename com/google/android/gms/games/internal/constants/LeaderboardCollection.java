package com.google.android.gms.games.internal.constants;

public final class LeaderboardCollection {
    public static String zzfG(int v) {
        switch(v) {
            case 0: {
                return "PUBLIC";
            }
            case 1: {
                return "SOCIAL";
            }
            default: {
                throw new IllegalArgumentException("Unknown leaderboard collection: " + v);
            }
        }
    }
}

