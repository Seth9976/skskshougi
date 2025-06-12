package com.google.android.gms.games.internal.constants;

import com.google.android.gms.games.internal.GamesLog;

public final class RequestType {
    public static String zzfG(int v) {
        switch(v) {
            case 1: {
                return "GIFT";
            }
            case 2: {
                return "WISH";
            }
            default: {
                GamesLog.zzv("RequestType", "Unknown request type: " + v);
                return "UNKNOWN_TYPE";
            }
        }
    }
}

