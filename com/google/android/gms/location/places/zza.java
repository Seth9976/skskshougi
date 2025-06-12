package com.google.android.gms.location.places;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class zza {
    public abstract Set getPlaceIds();

    public boolean isRestrictedToPlacesOpenNow() {
        return false;
    }

    static List zzc(Collection collection0) {
        return collection0 == null || collection0.isEmpty() ? Collections.emptyList() : new ArrayList(collection0);
    }

    // 去混淆评级： 低(20)
    static Set zzl(List list0) {
        return list0 != null && !list0.isEmpty() ? Collections.unmodifiableSet(new HashSet(list0)) : Collections.emptySet();
    }
}

