package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class MostRecentGameInfoRef extends zzc implements MostRecentGameInfo {
    private final PlayerColumnNames zzanX;

    public MostRecentGameInfoRef(DataHolder holder, int dataRow, PlayerColumnNames columnNames) {
        super(holder, dataRow);
        this.zzanX = columnNames;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return MostRecentGameInfoEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zztA();
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return MostRecentGameInfoEntity.zza(this);
    }

    @Override
    public String toString() {
        return MostRecentGameInfoEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((MostRecentGameInfoEntity)this.zztA()).writeToParcel(dest, flags);
    }

    public MostRecentGameInfo zztA() {
        return new MostRecentGameInfoEntity(this);
    }

    @Override  // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public String zztu() {
        return this.getString(this.zzanX.zzato);
    }

    @Override  // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public String zztv() {
        return this.getString(this.zzanX.zzatp);
    }

    @Override  // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public long zztw() {
        return this.getLong(this.zzanX.zzatq);
    }

    @Override  // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public Uri zztx() {
        return this.zzbW(this.zzanX.zzatr);
    }

    @Override  // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public Uri zzty() {
        return this.zzbW(this.zzanX.zzats);
    }

    @Override  // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public Uri zztz() {
        return this.zzbW(this.zzanX.zzatt);
    }
}

