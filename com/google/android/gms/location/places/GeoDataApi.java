package com.google.android.gms.location.places;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.maps.model.LatLngBounds;

public interface GeoDataApi {
    PendingResult addPlace(GoogleApiClient arg1, AddPlaceRequest arg2);

    PendingResult getAutocompletePredictions(GoogleApiClient arg1, String arg2, LatLngBounds arg3, AutocompleteFilter arg4);

    PendingResult getPlaceById(GoogleApiClient arg1, String[] arg2);
}

