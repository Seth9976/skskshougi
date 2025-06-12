package com.google.android.gms.location.places;

import com.google.android.gms.common.data.Freezable;
import java.util.List;

public interface AutocompletePrediction extends Freezable {
    public interface Substring {
        int getLength();

        int getOffset();
    }

    String getDescription();

    List getMatchedSubstrings();

    String getPlaceId();

    List getPlaceTypes();
}

