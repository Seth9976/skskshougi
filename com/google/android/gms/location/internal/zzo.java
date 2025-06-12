package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationServices.zza;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.SettingsApi;

public class zzo implements SettingsApi {
    @Override  // com.google.android.gms.location.SettingsApi
    public PendingResult checkLocationSettings(GoogleApiClient client, LocationSettingsRequest request) {
        return this.zza(client, request, null);
    }

    public PendingResult zza(GoogleApiClient googleApiClient0, LocationSettingsRequest locationSettingsRequest0, String s) {
        return googleApiClient0.zza(new zza(googleApiClient0, locationSettingsRequest0, s) {
            final LocationSettingsRequest zzazk;
            final String zzazl;
            final zzo zzazm;

            @Override  // com.google.android.gms.common.api.AbstractPendingResult
            public Result createFailedResult(Status x0) {
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
            }

            protected void zza(zzj zzj0) throws RemoteException {
            }

            public LocationSettingsResult zzaE(Status status0) {
            }
        });
    }
}

