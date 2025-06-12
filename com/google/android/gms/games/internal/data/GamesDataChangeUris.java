package com.google.android.gms.games.internal.data;

import android.net.Uri;

public final class GamesDataChangeUris {
    private static final Uri zzasD;
    public static final Uri zzasE;
    public static final Uri zzasF;

    static {
        GamesDataChangeUris.zzasD = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
        GamesDataChangeUris.zzasE = GamesDataChangeUris.zzasD.buildUpon().appendPath("invitations").build();
        GamesDataChangeUris.zzasF = GamesDataChangeUris.zzasD.buildUpon().appendEncodedPath("players").build();
    }
}

