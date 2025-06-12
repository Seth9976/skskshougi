package com.google.android.gms.plus;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;

public interface Moments {
    public interface LoadMomentsResult extends Releasable, Result {
        MomentBuffer getMomentBuffer();

        String getNextPageToken();

        String getUpdated();
    }

    PendingResult load(GoogleApiClient arg1);

    PendingResult load(GoogleApiClient arg1, int arg2, String arg3, Uri arg4, String arg5, String arg6);

    PendingResult remove(GoogleApiClient arg1, String arg2);

    PendingResult write(GoogleApiClient arg1, Moment arg2);
}

