package com.google.android.gms.fitness;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRequest;

public interface SensorsApi {
    PendingResult add(GoogleApiClient arg1, SensorRequest arg2, PendingIntent arg3);

    PendingResult add(GoogleApiClient arg1, SensorRequest arg2, OnDataPointListener arg3);

    PendingResult findDataSources(GoogleApiClient arg1, DataSourcesRequest arg2);

    PendingResult remove(GoogleApiClient arg1, PendingIntent arg2);

    PendingResult remove(GoogleApiClient arg1, OnDataPointListener arg2);
}

