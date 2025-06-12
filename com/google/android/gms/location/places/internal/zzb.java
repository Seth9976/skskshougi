package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.Collections;
import java.util.List;

public class zzb extends zzt implements AutocompletePrediction {
    public zzb(DataHolder dataHolder0, int v) {
        super(dataHolder0, v);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzuL();
    }

    @Override  // com.google.android.gms.location.places.AutocompletePrediction
    public String getDescription() {
        return this.zzB("ap_description", "");
    }

    @Override  // com.google.android.gms.location.places.AutocompletePrediction
    public List getMatchedSubstrings() {
        List list0 = Collections.emptyList();
        return this.zza("ap_matched_subscriptions", SubstringEntity.CREATOR, list0);
    }

    @Override  // com.google.android.gms.location.places.AutocompletePrediction
    public String getPlaceId() {
        return this.zzB("ap_place_id", null);
    }

    @Override  // com.google.android.gms.location.places.AutocompletePrediction
    public List getPlaceTypes() {
        return this.zza("ap_place_types", Collections.emptyList());
    }

    public AutocompletePrediction zzuL() {
        return AutocompletePredictionEntity.zza(this.getDescription(), this.getPlaceId(), this.getPlaceTypes(), this.getMatchedSubstrings(), this.zzuM());
    }

    public int zzuM() {
        return this.zzz("ap_personalization_type", 6);
    }
}

