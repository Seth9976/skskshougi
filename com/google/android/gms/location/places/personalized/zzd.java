package com.google.android.gms.location.places.personalized;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.PlacesStatusCodes;

public final class zzd extends com.google.android.gms.common.data.zzd implements Result {
    private final Status zzOt;

    public zzd(DataHolder dataHolder0) {
        this(dataHolder0, PlacesStatusCodes.zzgU(dataHolder0.getStatusCode()));
    }

    private zzd(DataHolder dataHolder0, Status status0) {
        super(dataHolder0, PlaceUserData.CREATOR);
        zzu.zzV(dataHolder0 == null || dataHolder0.getStatusCode() == status0.getStatusCode());
        this.zzOt = status0;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    public static zzd zzaK(Status status0) {
        return new zzd(null, status0);
    }
}

