package com.google.android.gms.games.internal.constants;

public final class RequestUpdateResultOutcome {
    public static boolean isValid(int outcome) {
        return outcome == 0 || outcome == 1 || outcome == 2 || outcome == 3;
    }
}

