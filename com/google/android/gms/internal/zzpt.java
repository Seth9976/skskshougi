package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks;
import com.google.android.gms.common.internal.zzu;

public final class zzpt implements Optional {
    public static final class zza {
        private String zzaHb;
        private boolean zzaJV;
        private boolean zzaJW;
        private ServerAuthCodeCallbacks zzaJX;

        public zza zza(String s, ServerAuthCodeCallbacks googleApiClient$ServerAuthCodeCallbacks0) {
            this.zzaJV = true;
            this.zzaJW = true;
            this.zzaHb = this.zzea(s);
            this.zzaJX = (ServerAuthCodeCallbacks)zzu.zzu(googleApiClient$ServerAuthCodeCallbacks0);
            return this;
        }

        private String zzea(String s) {
            zzu.zzu(s);
            zzu.zzb(this.zzaHb == null || this.zzaHb.equals(s), "two different server client ids provided");
            return s;
        }

        public zzpt zzyc() {
            return new zzpt(this.zzaJV, this.zzaJW, this.zzaHb, this.zzaJX, null);
        }
    }

    public static final zzpt zzaJQ;
    private final boolean zzaJR;
    private final boolean zzaJS;
    private final String zzaJT;
    private final ServerAuthCodeCallbacks zzaJU;

    static {
        zzpt.zzaJQ = new zza().zzyc();
    }

    private zzpt(boolean z, boolean z1, String s, ServerAuthCodeCallbacks googleApiClient$ServerAuthCodeCallbacks0) {
        this.zzaJR = z;
        this.zzaJS = z1;
        this.zzaJT = s;
        this.zzaJU = googleApiClient$ServerAuthCodeCallbacks0;
    }

    zzpt(boolean z, boolean z1, String s, ServerAuthCodeCallbacks googleApiClient$ServerAuthCodeCallbacks0, com.google.android.gms.internal.zzpt.1 zzpt$10) {
        this(z, z1, s, googleApiClient$ServerAuthCodeCallbacks0);
    }

    public boolean zzxZ() {
        return this.zzaJR;
    }

    public String zzxt() {
        return this.zzaJT;
    }

    public boolean zzya() {
        return this.zzaJS;
    }

    public ServerAuthCodeCallbacks zzyb() {
        return this.zzaJU;
    }

    class com.google.android.gms.internal.zzpt.1 {
    }

}

