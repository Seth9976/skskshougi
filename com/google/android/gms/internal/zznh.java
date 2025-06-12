package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;

public class zznh implements BleApi {
    private static final Status zzalH;

    static {
        zznh.zzalH = new Status(5007);
    }

    @Override  // com.google.android.gms.fitness.BleApi
    public PendingResult claimBleDevice(GoogleApiClient client, BleDevice bleDevice) {
        return new zzmw(zznh.zzalH);
    }

    @Override  // com.google.android.gms.fitness.BleApi
    public PendingResult claimBleDevice(GoogleApiClient client, String deviceAddress) {
        return new zzmw(zznh.zzalH);
    }

    @Override  // com.google.android.gms.fitness.BleApi
    public PendingResult listClaimedBleDevices(GoogleApiClient client) {
        return new zzmw(BleDevicesResult.zzJ(zznh.zzalH));
    }

    @Override  // com.google.android.gms.fitness.BleApi
    public PendingResult startBleScan(GoogleApiClient client, StartBleScanRequest request) {
        return new zzmw(zznh.zzalH);
    }

    @Override  // com.google.android.gms.fitness.BleApi
    public PendingResult stopBleScan(GoogleApiClient client, BleScanCallback callback) {
        return new zzmw(zznh.zzalH);
    }

    @Override  // com.google.android.gms.fitness.BleApi
    public PendingResult unclaimBleDevice(GoogleApiClient client, BleDevice bleDevice) {
        return new zzmw(zznh.zzalH);
    }

    @Override  // com.google.android.gms.fitness.BleApi
    public PendingResult unclaimBleDevice(GoogleApiClient client, String deviceAddress) {
        return new zzmw(zznh.zzalH);
    }
}

