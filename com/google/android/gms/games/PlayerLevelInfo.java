package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

public final class PlayerLevelInfo implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final long zzanT;
    private final long zzanU;
    private final PlayerLevel zzanV;
    private final PlayerLevel zzanW;

    static {
        PlayerLevelInfo.CREATOR = new PlayerLevelInfoCreator();
    }

    PlayerLevelInfo(int versionCode, long currentXpTotal, long lastLevelUpTimestamp, PlayerLevel currentLevel, PlayerLevel nextLevel) {
        zzu.zzU(currentXpTotal != -1L);
        zzu.zzu(currentLevel);
        zzu.zzu(nextLevel);
        this.zzCY = versionCode;
        this.zzanT = currentXpTotal;
        this.zzanU = lastLevelUpTimestamp;
        this.zzanV = currentLevel;
        this.zzanW = nextLevel;
    }

    public PlayerLevelInfo(long currentXpTotal, long lastLevelUpTimestamp, PlayerLevel currentLevel, PlayerLevel nextLevel) {
        this(1, currentXpTotal, lastLevelUpTimestamp, currentLevel, nextLevel);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(Object obj) {
        return obj instanceof PlayerLevelInfo ? obj == this || zzt.equal(this.zzanT, ((PlayerLevelInfo)obj).zzanT) && zzt.equal(this.zzanU, ((PlayerLevelInfo)obj).zzanU) && zzt.equal(this.zzanV, ((PlayerLevelInfo)obj).zzanV) && zzt.equal(this.zzanW, ((PlayerLevelInfo)obj).zzanW) : false;
    }

    public PlayerLevel getCurrentLevel() {
        return this.zzanV;
    }

    public long getCurrentXpTotal() {
        return this.zzanT;
    }

    public long getLastLevelUpTimestamp() {
        return this.zzanU;
    }

    public PlayerLevel getNextLevel() {
        return this.zzanW;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzanT, this.zzanU, this.zzanV, this.zzanW});
    }

    public boolean isMaxLevel() {
        return this.zzanV.equals(this.zzanW);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        PlayerLevelInfoCreator.zza(this, out, flags);
    }
}

