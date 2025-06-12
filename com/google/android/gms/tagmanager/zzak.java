package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class zzak {
    private final Set zzaLI;
    private final String zzaLJ;

    public zzak(String s, String[] arr_s) {
        this.zzaLJ = s;
        this.zzaLI = new HashSet(arr_s.length);
        for(int v = 0; v < arr_s.length; ++v) {
            this.zzaLI.add(arr_s[v]);
        }
    }

    public abstract zza zzE(Map arg1);

    boolean zzg(Set set0) {
        return set0.containsAll(this.zzaLI);
    }

    public String zzyM() {
        return this.zzaLJ;
    }

    public Set zzyN() {
        return this.zzaLI;
    }

    public abstract boolean zzyh();
}

