package com.google.android.gms.fitness;

import com.google.android.gms.common.api.Scope;
import java.util.HashSet;
import java.util.Set;

public final class zza {
    public static Scope zzb(Scope scope0) {
        if(scope0.equals(new Scope("https://www.googleapis.com/auth/fitness.activity.read"))) {
            return new Scope("https://www.googleapis.com/auth/fitness.activity.write");
        }
        if(scope0.equals(new Scope("https://www.googleapis.com/auth/fitness.location.read"))) {
            return new Scope("https://www.googleapis.com/auth/fitness.location.write");
        }
        if(scope0.equals(new Scope("https://www.googleapis.com/auth/fitness.body.read"))) {
            return new Scope("https://www.googleapis.com/auth/fitness.body.write");
        }
        return scope0.equals(new Scope("https://www.googleapis.com/auth/fitness.nutrition.read")) ? new Scope("https://www.googleapis.com/auth/fitness.nutrition.write") : scope0;
    }

    public static Set zzd(Set set0) {
        Set set1 = new HashSet(set0.size());
        for(Object object0: set0) {
            Scope scope0 = (Scope)object0;
            Scope scope1 = zza.zzb(scope0);
            if(scope1.equals(scope0) || !set0.contains(scope1)) {
                set1.add(scope0);
            }
        }
        return set1;
    }
}

