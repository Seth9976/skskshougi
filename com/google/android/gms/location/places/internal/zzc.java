package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.GeoDataApi;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.location.places.zzm.zza;
import com.google.android.gms.location.places.zzm;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.List;

public class zzc implements GeoDataApi {
    @Override  // com.google.android.gms.location.places.GeoDataApi
    public PendingResult addPlace(GoogleApiClient client, AddPlaceRequest addPlaceRequest) {
        return client.zzb(new com.google.android.gms.location.places.zzm.zzc(Places.zzazQ, client) {
            protected void zza(zzd zzd0) throws RemoteException {
                zzd0.zza(new zzm(this, zzd0.getContext()), addPlaceRequest);
            }
        });
    }

    @Override  // com.google.android.gms.location.places.GeoDataApi
    public PendingResult getAutocompletePredictions(GoogleApiClient client, String query, LatLngBounds bounds, AutocompleteFilter filter) {
        return client.zza(new zza(Places.zzazQ, client) {
            protected void zza(zzd zzd0) throws RemoteException {
                zzd0.zza(new zzm(this), query, bounds, filter);
            }
        });
    }

    @Override  // com.google.android.gms.location.places.GeoDataApi
    public PendingResult getPlaceById(GoogleApiClient client, String[] placeIds) {
        zzu.zzV(placeIds != null && placeIds.length >= 1);
        return client.zza(new com.google.android.gms.location.places.zzm.zzc(Places.zzazQ, client) {
            protected void zza(zzd zzd0) throws RemoteException {
                List list0 = Arrays.asList(placeIds);
                zzd0.zza(new zzm(this, zzd0.getContext()), list0);
            }
        });
    }
}

