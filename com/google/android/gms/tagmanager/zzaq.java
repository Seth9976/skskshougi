package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class zzaq {
    private final long zzMb;
    private final long zzaLL;
    private final long zzaLM;
    private String zzaLN;

    zzaq(long v, long v1, long v2) {
        this.zzaLL = v;
        this.zzMb = v1;
        this.zzaLM = v2;
    }

    void zzev(String s) {
        if(s == null || TextUtils.isEmpty(s.trim())) {
            return;
        }
        this.zzaLN = s;
    }

    long zzyO() {
        return this.zzaLL;
    }

    long zzyP() {
        return this.zzaLM;
    }

    String zzyQ() {
        return this.zzaLN;
    }
}

