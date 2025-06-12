package com.google.android.gms.appstate;

import com.google.android.gms.common.internal.zzt;

public final class zza implements AppState {
    private final int zzOf;
    private final String zzOg;
    private final byte[] zzOh;
    private final boolean zzOi;
    private final String zzOj;
    private final byte[] zzOk;

    public zza(AppState appState0) {
        this.zzOf = appState0.getKey();
        this.zzOg = appState0.getLocalVersion();
        this.zzOh = appState0.getLocalData();
        this.zzOi = appState0.hasConflict();
        this.zzOj = appState0.getConflictVersion();
        this.zzOk = appState0.getConflictData();
    }

    @Override
    public boolean equals(Object obj) {
        return zza.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.appstate.AppState
    public byte[] getConflictData() {
        return this.zzOk;
    }

    @Override  // com.google.android.gms.appstate.AppState
    public String getConflictVersion() {
        return this.zzOj;
    }

    @Override  // com.google.android.gms.appstate.AppState
    public int getKey() {
        return this.zzOf;
    }

    @Override  // com.google.android.gms.appstate.AppState
    public byte[] getLocalData() {
        return this.zzOh;
    }

    @Override  // com.google.android.gms.appstate.AppState
    public String getLocalVersion() {
        return this.zzOg;
    }

    @Override  // com.google.android.gms.appstate.AppState
    public boolean hasConflict() {
        return this.zzOi;
    }

    @Override
    public int hashCode() {
        return zza.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return zza.zzb(this);
    }

    static int zza(AppState appState0) {
        return zzt.hashCode(new Object[]{appState0.getKey(), appState0.getLocalVersion(), appState0.getLocalData(), Boolean.valueOf(appState0.hasConflict()), appState0.getConflictVersion(), appState0.getConflictData()});
    }

    // 去混淆评级： 中等(70)
    static boolean zza(AppState appState0, Object object0) {
        return object0 instanceof AppState ? appState0 == object0 || zzt.equal(((AppState)object0).getKey(), appState0.getKey()) && zzt.equal(((AppState)object0).getLocalVersion(), appState0.getLocalVersion()) && zzt.equal(((AppState)object0).getLocalData(), appState0.getLocalData()) && zzt.equal(Boolean.valueOf(((AppState)object0).hasConflict()), Boolean.valueOf(appState0.hasConflict())) && zzt.equal(((AppState)object0).getConflictVersion(), appState0.getConflictVersion()) && zzt.equal(((AppState)object0).getConflictData(), appState0.getConflictData()) : false;
    }

    static String zzb(AppState appState0) {
        return zzt.zzt(appState0).zzg("Key", appState0.getKey()).zzg("LocalVersion", appState0.getLocalVersion()).zzg("LocalData", appState0.getLocalData()).zzg("HasConflict", Boolean.valueOf(appState0.hasConflict())).zzg("ConflictVersion", appState0.getConflictVersion()).zzg("ConflictData", appState0.getConflictData()).toString();
    }

    public AppState zzkT() [...] // Inlined contents
}

