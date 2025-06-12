package com.google.android.gms.games.request;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public interface Requests {
    public interface LoadRequestSummariesResult extends Releasable, Result {
    }

    public interface LoadRequestsResult extends Releasable, Result {
        GameRequestBuffer getRequests(int arg1);
    }

    public interface SendRequestResult extends Result {
    }

    public interface UpdateRequestsResult extends Releasable, Result {
        Set getRequestIds();

        int getRequestOutcome(String arg1);
    }

    public static final String EXTRA_REQUESTS = "requests";
    public static final int MAX_REQUEST_RECIPIENTS = 8;
    public static final int REQUEST_DEFAULT_LIFETIME_DAYS = -1;
    public static final int REQUEST_DIRECTION_INBOUND = 0;
    public static final int REQUEST_DIRECTION_OUTBOUND = 1;
    public static final int REQUEST_UPDATE_OUTCOME_FAIL = 1;
    public static final int REQUEST_UPDATE_OUTCOME_RETRY = 2;
    public static final int REQUEST_UPDATE_OUTCOME_SUCCESS = 0;
    public static final int REQUEST_UPDATE_TYPE_ACCEPT = 0;
    public static final int REQUEST_UPDATE_TYPE_DISMISS = 1;
    public static final int SORT_ORDER_EXPIRING_SOON_FIRST = 0;
    public static final int SORT_ORDER_SOCIAL_AGGREGATION = 1;

    PendingResult acceptRequest(GoogleApiClient arg1, String arg2);

    PendingResult acceptRequests(GoogleApiClient arg1, List arg2);

    PendingResult dismissRequest(GoogleApiClient arg1, String arg2);

    PendingResult dismissRequests(GoogleApiClient arg1, List arg2);

    ArrayList getGameRequestsFromBundle(Bundle arg1);

    ArrayList getGameRequestsFromInboxResponse(Intent arg1);

    Intent getInboxIntent(GoogleApiClient arg1);

    int getMaxLifetimeDays(GoogleApiClient arg1);

    int getMaxPayloadSize(GoogleApiClient arg1);

    Intent getSendIntent(GoogleApiClient arg1, int arg2, byte[] arg3, int arg4, Bitmap arg5, String arg6);

    PendingResult loadRequests(GoogleApiClient arg1, int arg2, int arg3, int arg4);

    void registerRequestListener(GoogleApiClient arg1, OnRequestReceivedListener arg2);

    void unregisterRequestListener(GoogleApiClient arg1);
}

