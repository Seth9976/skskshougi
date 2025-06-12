package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api.ApiOptions.Optional;

public final class PlacesOptions implements Optional {
    public static class Builder {
        private String zzazY;

        public PlacesOptions build() {
            return new PlacesOptions(this, null);
        }
    }

    public final String zzazX;

    private PlacesOptions(Builder builder) {
        this.zzazX = builder.zzazY;
    }

    PlacesOptions(Builder x0, com.google.android.gms.location.places.PlacesOptions.1 x1) {
        this(x0);
    }

    class com.google.android.gms.location.places.PlacesOptions.1 {
    }

}

