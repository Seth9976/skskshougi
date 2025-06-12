package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class AchievementRef extends zzc implements Achievement {
    AchievementRef(DataHolder holder, int dataRow) {
        super(holder, dataRow);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Achievement freeze() {
        return new AchievementEntity(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.freeze();
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public String getAchievementId() {
        return this.getString("external_achievement_id");
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public int getCurrentSteps() {
        zzb.zzU(this.getType() == 1);
        return this.getInteger("current_steps");
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public String getDescription() {
        return this.getString("description");
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public void getDescription(CharArrayBuffer dataOut) {
        this.zza("description", dataOut);
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public String getFormattedCurrentSteps() {
        zzb.zzU(this.getType() == 1);
        return this.getString("formatted_current_steps");
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public void getFormattedCurrentSteps(CharArrayBuffer dataOut) {
        zzb.zzU(this.getType() == 1);
        this.zza("formatted_current_steps", dataOut);
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public String getFormattedTotalSteps() {
        zzb.zzU(this.getType() == 1);
        return this.getString("formatted_total_steps");
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public void getFormattedTotalSteps(CharArrayBuffer dataOut) {
        zzb.zzU(this.getType() == 1);
        this.zza("formatted_total_steps", dataOut);
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public long getLastUpdatedTimestamp() {
        return this.getLong("last_updated_timestamp");
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public String getName() {
        return this.getString("name");
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public void getName(CharArrayBuffer dataOut) {
        this.zza("name", dataOut);
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public Player getPlayer() {
        return new PlayerRef(this.zzWu, this.zzYs);
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public Uri getRevealedImageUri() {
        return this.zzbW("revealed_icon_image_uri");
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public String getRevealedImageUrl() {
        return this.getString("revealed_icon_image_url");
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public int getState() {
        return this.getInteger("state");
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public int getTotalSteps() {
        zzb.zzU(this.getType() == 1);
        return this.getInteger("total_steps");
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public int getType() {
        return this.getInteger("type");
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public Uri getUnlockedImageUri() {
        return this.zzbW("unlocked_icon_image_uri");
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public String getUnlockedImageUrl() {
        return this.getString("unlocked_icon_image_url");
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.achievement.Achievement
    public long getXpValue() {
        return this.zzbV("instance_xp_value") && !this.zzbX("instance_xp_value") ? this.getLong("instance_xp_value") : this.getLong("definition_xp_value");
    }

    @Override
    public String toString() {
        return AchievementEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((AchievementEntity)this.freeze()).writeToParcel(dest, flags);
    }
}

