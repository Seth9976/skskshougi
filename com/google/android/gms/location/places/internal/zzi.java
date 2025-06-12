package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.places.PlaceDetectionApi;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.zzm.zzd;
import com.google.android.gms.location.places.zzm.zzf;
import com.google.android.gms.location.places.zzm;

public class zzi implements PlaceDetectionApi {
    @Override  // com.google.android.gms.location.places.PlaceDetectionApi
    public PendingResult getCurrentPlace(GoogleApiClient client, PlaceFilter filter) {
        return client.zza(new zzd(Places.zzazR, client) {
            protected void zza(zzj zzj0) throws RemoteException {
                zzj0.zza(new zzm(this, zzj0.getContext()), filter);
            }
        });
    }

    @Override  // com.google.android.gms.location.places.PlaceDetectionApi
    public PendingResult reportDeviceAtPlace(GoogleApiClient client, PlaceReport report) {
        return client.zzb(new zzf(Places.zzazR, client) {
            protected void zza(zzj zzj0) throws RemoteException {
                zzj0.zza(new zzm(this), report);
            }
        });
    }
}

