package com.google.android.gms.fitness;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;

public interface ConfigApi {
    PendingResult createCustomDataType(GoogleApiClient arg1, DataTypeCreateRequest arg2);

    PendingResult disableFit(GoogleApiClient arg1);

    PendingResult readDataType(GoogleApiClient arg1, String arg2);
}

