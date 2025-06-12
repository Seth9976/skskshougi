package com.google.android.gms.fitness;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;

public interface BleApi {
    PendingResult claimBleDevice(GoogleApiClient arg1, BleDevice arg2);

    PendingResult claimBleDevice(GoogleApiClient arg1, String arg2);

    PendingResult listClaimedBleDevices(GoogleApiClient arg1);

    PendingResult startBleScan(GoogleApiClient arg1, StartBleScanRequest arg2);

    PendingResult stopBleScan(GoogleApiClient arg1, BleScanCallback arg2);

    PendingResult unclaimBleDevice(GoogleApiClient arg1, BleDevice arg2);

    PendingResult unclaimBleDevice(GoogleApiClient arg1, String arg2);
}

