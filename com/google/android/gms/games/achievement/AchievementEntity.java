package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzt.zza;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzlc;

public final class AchievementEntity implements SafeParcelable, Achievement {
    public static final Parcelable.Creator CREATOR;
    private final String mName;
    private final int mState;
    private final int zzCY;
    private final int zzSq;
    private final String zzakM;
    private final String zzanZ;
    private final Uri zzaoa;
    private final String zzaob;
    private final Uri zzaoc;
    private final String zzaod;
    private final int zzaoe;
    private final String zzaof;
    private final PlayerEntity zzaog;
    private final int zzaoh;
    private final String zzaoi;
    private final long zzaoj;
    private final long zzaok;

    static {
        AchievementEntity.CREATOR = new AchievementEntityCreator();
    }

    AchievementEntity(int versionCode, String achievementId, int type, String name, String description, Uri unlockedImageUri, String unlockedImageUrl, Uri revealedImageUri, String revealedImageUrl, int totalSteps, String formattedTotalSteps, PlayerEntity player, int state, int currentSteps, String formattedCurrentSteps, long lastUpdatedTimestamp, long xpValue) {
        this.zzCY = versionCode;
        this.zzanZ = achievementId;
        this.zzSq = type;
        this.mName = name;
        this.zzakM = description;
        this.zzaoa = unlockedImageUri;
        this.zzaob = unlockedImageUrl;
        this.zzaoc = revealedImageUri;
        this.zzaod = revealedImageUrl;
        this.zzaoe = totalSteps;
        this.zzaof = formattedTotalSteps;
        this.zzaog = player;
        this.mState = state;
        this.zzaoh = currentSteps;
        this.zzaoi = formattedCurrentSteps;
        this.zzaoj = lastUpdatedTimestamp;
        this.zzaok = xpValue;
    }

    public AchievementEntity(Achievement achievement) {
        this.zzCY = 1;
        this.zzanZ = achievement.getAchievementId();
        this.zzSq = achievement.getType();
        this.mName = achievement.getName();
        this.zzakM = achievement.getDescription();
        this.zzaoa = achievement.getUnlockedImageUri();
        this.zzaob = achievement.getUnlockedImageUrl();
        this.zzaoc = achievement.getRevealedImageUri();
        this.zzaod = achievement.getRevealedImageUrl();
        this.zzaog = (PlayerEntity)achievement.getPlayer().freeze();
        this.mState = achievement.getState();
        this.zzaoj = achievement.getLastUpdatedTimestamp();
        this.zzaok = achievement.getXpValue();
        if(achievement.getType() == 1) {
            this.zzaoe = achievement.getTotalSteps();
            this.zzaof = achievement.getFormattedTotalSteps();
            this.zzaoh = achievement.getCurrentSteps();
            this.zzaoi = achievement.getFormattedCurrentSteps();
        }
        else {
            this.zzaoe = 0;
            this.zzaof = null;
            this.zzaoh = 0;
            this.zzaoi = null;
        }
        zzb.zzq(this.zzanZ);
        zzb.zzq(this.zzakM);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return AchievementEntity.zza(this, obj);
    }

    public Achievement freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public String getAchievementId() {
        return this.zzanZ;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public int getCurrentSteps() {
        return this.zzaoh;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public String getDescription() {
        return this.zzakM;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public void getDescription(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzakM, dataOut);
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public String getFormattedCurrentSteps() {
        return this.zzaoi;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public void getFormattedCurrentSteps(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzaoi, dataOut);
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public String getFormattedTotalSteps() {
        return this.zzaof;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public void getFormattedTotalSteps(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzaof, dataOut);
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public long getLastUpdatedTimestamp() {
        return this.zzaoj;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public String getName() {
        return this.mName;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public void getName(CharArrayBuffer dataOut) {
        zzlc.zzb(this.mName, dataOut);
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public Player getPlayer() {
        return this.zzaog;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public Uri getRevealedImageUri() {
        return this.zzaoc;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public String getRevealedImageUrl() {
        return this.zzaod;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public int getState() {
        return this.mState;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public int getTotalSteps() {
        return this.zzaoe;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public int getType() {
        return this.zzSq;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public Uri getUnlockedImageUri() {
        return this.zzaoa;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public String getUnlockedImageUrl() {
        return this.zzaob;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public long getXpValue() {
        return this.zzaok;
    }

    @Override
    public int hashCode() {
        return AchievementEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return AchievementEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        AchievementEntityCreator.zza(this, dest, flags);
    }

    static int zza(Achievement achievement0) {
        if(achievement0.getType() == 1) {
            int v = achievement0.getCurrentSteps();
            int v1 = achievement0.getTotalSteps();
            return zzt.hashCode(new Object[]{achievement0.getAchievementId(), achievement0.getName(), achievement0.getType(), achievement0.getDescription(), achievement0.getXpValue(), achievement0.getState(), achievement0.getLastUpdatedTimestamp(), achievement0.getPlayer(), v, v1});
        }
        return zzt.hashCode(new Object[]{achievement0.getAchievementId(), achievement0.getName(), achievement0.getType(), achievement0.getDescription(), achievement0.getXpValue(), achievement0.getState(), achievement0.getLastUpdatedTimestamp(), achievement0.getPlayer(), 0, 0});
    }

    static boolean zza(Achievement achievement0, Object object0) {
        if(!(object0 instanceof Achievement)) {
            return false;
        }
        if(achievement0 != object0) {
            if(achievement0.getType() == 1) {
                boolean z = zzt.equal(((Achievement)object0).getCurrentSteps(), achievement0.getCurrentSteps());
                boolean z1 = zzt.equal(((Achievement)object0).getTotalSteps(), achievement0.getTotalSteps());
                return zzt.equal(((Achievement)object0).getAchievementId(), achievement0.getAchievementId()) && zzt.equal(((Achievement)object0).getName(), achievement0.getName()) && zzt.equal(((Achievement)object0).getType(), achievement0.getType()) && zzt.equal(((Achievement)object0).getDescription(), achievement0.getDescription()) && zzt.equal(((Achievement)object0).getXpValue(), achievement0.getXpValue()) && zzt.equal(((Achievement)object0).getState(), achievement0.getState()) && zzt.equal(((Achievement)object0).getLastUpdatedTimestamp(), achievement0.getLastUpdatedTimestamp()) && zzt.equal(((Achievement)object0).getPlayer(), achievement0.getPlayer()) && z && z1;
            }
            return zzt.equal(((Achievement)object0).getAchievementId(), achievement0.getAchievementId()) && zzt.equal(((Achievement)object0).getName(), achievement0.getName()) && zzt.equal(((Achievement)object0).getType(), achievement0.getType()) && zzt.equal(((Achievement)object0).getDescription(), achievement0.getDescription()) && zzt.equal(((Achievement)object0).getXpValue(), achievement0.getXpValue()) && zzt.equal(((Achievement)object0).getState(), achievement0.getState()) && zzt.equal(((Achievement)object0).getLastUpdatedTimestamp(), achievement0.getLastUpdatedTimestamp()) && zzt.equal(((Achievement)object0).getPlayer(), achievement0.getPlayer());
        }
        return true;
    }

    static String zzb(Achievement achievement0) {
        zza zzt$zza0 = zzt.zzt(achievement0).zzg("Id", achievement0.getAchievementId()).zzg("Type", achievement0.getType()).zzg("Name", achievement0.getName()).zzg("Description", achievement0.getDescription()).zzg("Player", achievement0.getPlayer()).zzg("State", achievement0.getState());
        if(achievement0.getType() == 1) {
            zzt$zza0.zzg("CurrentSteps", achievement0.getCurrentSteps());
            zzt$zza0.zzg("TotalSteps", achievement0.getTotalSteps());
        }
        return zzt$zza0.toString();
    }
}

