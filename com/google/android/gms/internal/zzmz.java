package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;
import com.google.android.gms.fitness.result.BleDevicesResult;

public class zzmz implements BleApi {
    static class zza extends com.google.android.gms.internal.zzni.zza {
        private final zzb zzOs;

        private zza(zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        zza(zzb zza$zzb0, com.google.android.gms.internal.zzmz.1 zzmz$10) {
            this(zza$zzb0);
        }

        @Override  // com.google.android.gms.internal.zzni
        public void zza(BleDevicesResult bleDevicesResult0) {
            this.zzOs.zzm(bleDevicesResult0);
        }
    }

    @Override  // com.google.android.gms.fitness.BleApi
    public PendingResult claimBleDevice(GoogleApiClient client, BleDevice bleDevice) {
        return client.zzb(new zzc(client) {
            protected void zza(zzlx zzlx0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmi)zzlx0.zznM()).zza(new ClaimBleDeviceRequest(bleDevice.getAddress(), bleDevice, zzng0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.BleApi
    public PendingResult claimBleDevice(GoogleApiClient client, String deviceAddress) {
        return client.zzb(new zzc(client) {
            protected void zza(zzlx zzlx0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmi)zzlx0.zznM()).zza(new ClaimBleDeviceRequest(deviceAddress, null, zzng0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.BleApi
    public PendingResult listClaimedBleDevices(GoogleApiClient client) {
        return client.zza(new com.google.android.gms.internal.zzlx.zza(client) {
            protected BleDevicesResult zzB(Status status0) {
                return BleDevicesResult.zzJ(status0);
            }

            protected void zza(zzlx zzlx0) throws RemoteException {
                zza zzmz$zza0 = new zza(this, null);
                ((zzmi)zzlx0.zznM()).zza(new ListClaimedBleDevicesRequest(zzmz$zza0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.BleApi
    public PendingResult startBleScan(GoogleApiClient client, StartBleScanRequest request) {
        return client.zza(new zzc(client) {
            protected void zza(zzlx zzlx0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmi)zzlx0.zznM()).zza(new StartBleScanRequest(request, zzng0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.BleApi
    public PendingResult stopBleScan(GoogleApiClient client, BleScanCallback requestCallback) {
        return client.zza(new zzc(client) {
            protected void zza(zzlx zzlx0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmi)zzlx0.zznM()).zza(new StopBleScanRequest(requestCallback, zzng0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.BleApi
    public PendingResult unclaimBleDevice(GoogleApiClient client, BleDevice bleDevice) {
        return this.unclaimBleDevice(client, bleDevice.getAddress());
    }

    @Override  // com.google.android.gms.fitness.BleApi
    public PendingResult unclaimBleDevice(GoogleApiClient client, String deviceAddress) {
        return client.zzb(new zzc(client) {
            protected void zza(zzlx zzlx0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmi)zzlx0.zznM()).zza(new UnclaimBleDeviceRequest(deviceAddress, zzng0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }
}

