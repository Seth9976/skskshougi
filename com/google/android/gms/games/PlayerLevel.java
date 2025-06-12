package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

public final class PlayerLevel implements SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final int zzanQ;
    private final long zzanR;
    private final long zzanS;

    static {
        PlayerLevel.CREATOR = new PlayerLevelCreator();
    }

    PlayerLevel(int versionCode, int levelNumber, long minXp, long maxXp) {
        boolean z = true;
        super();
        zzu.zza(minXp >= 0L, "Min XP must be positive!");
        if(maxXp <= minXp) {
            z = false;
        }
        zzu.zza(z, "Max XP must be more than min XP!");
        this.zzCY = versionCode;
        this.zzanQ = levelNumber;
        this.zzanR = minXp;
        this.zzanS = maxXp;
    }

    public PlayerLevel(int value, long minXp, long maxXp) {
        this(1, value, minXp, maxXp);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(Object obj) {
        return obj instanceof PlayerLevel ? this == obj || zzt.equal(((PlayerLevel)obj).getLevelNumber(), this.getLevelNumber()) && zzt.equal(((PlayerLevel)obj).getMinXp(), this.getMinXp()) && zzt.equal(((PlayerLevel)obj).getMaxXp(), this.getMaxXp()) : false;
    }

    public int getLevelNumber() {
        return this.zzanQ;
    }

    public long getMaxXp() {
        return this.zzanS;
    }

    public long getMinXp() {
        return this.zzanR;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzanQ, this.zzanR, this.zzanS});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("LevelNumber", this.getLevelNumber()).zzg("MinXp", this.getMinXp()).zzg("MaxXp", this.getMaxXp()).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        PlayerLevelCreator.zza(this, out, flags);
    }
}

