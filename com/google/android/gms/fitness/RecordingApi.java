package com.google.android.gms.fitness;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;

public interface RecordingApi {
    PendingResult listSubscriptions(GoogleApiClient arg1);

    PendingResult listSubscriptions(GoogleApiClient arg1, DataType arg2);

    PendingResult subscribe(GoogleApiClient arg1, DataSource arg2);

    PendingResult subscribe(GoogleApiClient arg1, DataType arg2);

    PendingResult unsubscribe(GoogleApiClient arg1, DataSource arg2);

    PendingResult unsubscribe(GoogleApiClient arg1, DataType arg2);

    PendingResult unsubscribe(GoogleApiClient arg1, Subscription arg2);
}

