package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.location.places.internal.zzc;
import com.google.android.gms.location.places.internal.zzd.zza;
import com.google.android.gms.location.places.internal.zzi;

public class Places {
    public static final Api GEO_DATA_API;
    public static final GeoDataApi GeoDataApi;
    public static final Api PLACE_DETECTION_API;
    public static final PlaceDetectionApi PlaceDetectionApi;
    public static final ClientKey zzazQ;
    public static final ClientKey zzazR;

    static {
        Places.zzazQ = new ClientKey();
        Places.zzazR = new ClientKey();
        Places.GEO_DATA_API = new Api("Places.GEO_DATA_API", new zza(null, null), Places.zzazQ, new Scope[0]);
        Places.PLACE_DETECTION_API = new Api("Places.PLACE_DETECTION_API", new com.google.android.gms.location.places.internal.zzj.zza(null, null), Places.zzazR, new Scope[0]);
        Places.GeoDataApi = new zzc();
        Places.PlaceDetectionApi = new zzi();
    }
}

