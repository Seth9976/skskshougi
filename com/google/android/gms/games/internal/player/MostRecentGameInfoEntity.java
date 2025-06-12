package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public final class MostRecentGameInfoEntity implements SafeParcelable, MostRecentGameInfo {
    public static final MostRecentGameInfoEntityCreator CREATOR;
    private final int zzCY;
    private final String zzasP;
    private final String zzasQ;
    private final long zzasR;
    private final Uri zzasS;
    private final Uri zzasT;
    private final Uri zzasU;

    static {
        MostRecentGameInfoEntity.CREATOR = new MostRecentGameInfoEntityCreator();
    }

    MostRecentGameInfoEntity(int versionCode, String gameId, String gameName, long activityTimestampMillis, Uri gameIconImageUri, Uri gameHiResIconImageUri, Uri gameFeaturedImageUri) {
        this.zzCY = versionCode;
        this.zzasP = gameId;
        this.zzasQ = gameName;
        this.zzasR = activityTimestampMillis;
        this.zzasS = gameIconImageUri;
        this.zzasT = gameHiResIconImageUri;
        this.zzasU = gameFeaturedImageUri;
    }

    public MostRecentGameInfoEntity(MostRecentGameInfo info) {
        this.zzCY = 2;
        this.zzasP = info.zztu();
        this.zzasQ = info.zztv();
        this.zzasR = info.zztw();
        this.zzasS = info.zztx();
        this.zzasT = info.zzty();
        this.zzasU = info.zztz();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return MostRecentGameInfoEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return MostRecentGameInfoEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return MostRecentGameInfoEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        MostRecentGameInfoEntityCreator.zza(this, out, flags);
    }

    static int zza(MostRecentGameInfo mostRecentGameInfo0) {
        return zzt.hashCode(new Object[]{mostRecentGameInfo0.zztu(), mostRecentGameInfo0.zztv(), mostRecentGameInfo0.zztw(), mostRecentGameInfo0.zztx(), mostRecentGameInfo0.zzty(), mostRecentGameInfo0.zztz()});
    }

    // 去混淆评级： 中等(70)
    static boolean zza(MostRecentGameInfo mostRecentGameInfo0, Object object0) {
        return object0 instanceof MostRecentGameInfo ? mostRecentGameInfo0 == object0 || zzt.equal(((MostRecentGameInfo)object0).zztu(), mostRecentGameInfo0.zztu()) && zzt.equal(((MostRecentGameInfo)object0).zztv(), mostRecentGameInfo0.zztv()) && zzt.equal(((MostRecentGameInfo)object0).zztw(), mostRecentGameInfo0.zztw()) && zzt.equal(((MostRecentGameInfo)object0).zztx(), mostRecentGameInfo0.zztx()) && zzt.equal(((MostRecentGameInfo)object0).zzty(), mostRecentGameInfo0.zzty()) && zzt.equal(((MostRecentGameInfo)object0).zztz(), mostRecentGameInfo0.zztz()) : false;
    }

    static String zzb(MostRecentGameInfo mostRecentGameInfo0) {
        return zzt.zzt(mostRecentGameInfo0).zzg("GameId", mostRecentGameInfo0.zztu()).zzg("GameName", mostRecentGameInfo0.zztv()).zzg("ActivityTimestampMillis", mostRecentGameInfo0.zztw()).zzg("GameIconUri", mostRecentGameInfo0.zztx()).zzg("GameHiResUri", mostRecentGameInfo0.zzty()).zzg("GameFeaturedUri", mostRecentGameInfo0.zztz()).toString();
    }

    public MostRecentGameInfo zztA() [...] // Inlined contents

    @Override  // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public String zztu() {
        return this.zzasP;
    }

    @Override  // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public String zztv() {
        return this.zzasQ;
    }

    @Override  // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public long zztw() {
        return this.zzasR;
    }

    @Override  // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public Uri zztx() {
        return this.zzasS;
    }

    @Override  // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public Uri zzty() {
        return this.zzasT;
    }

    @Override  // com.google.android.gms.games.internal.player.MostRecentGameInfo
    public Uri zztz() {
        return this.zzasU;
    }
}

