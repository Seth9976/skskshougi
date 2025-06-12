package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class GameRef extends zzc implements Game {
    public GameRef(DataHolder holder, int dataRow) {
        super(holder, dataRow);
    }

    @Override  // com.google.android.gms.games.Game
    public boolean areSnapshotsEnabled() {
        return this.getInteger("snapshots_enabled") > 0;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return GameEntity.zza(this, obj);
    }

    public Game freeze() {
        return new GameEntity(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.freeze();
    }

    @Override  // com.google.android.gms.games.Game
    public int getAchievementTotalCount() {
        return this.getInteger("achievement_total_count");
    }

    @Override  // com.google.android.gms.games.Game
    public String getApplicationId() {
        return this.getString("external_game_id");
    }

    @Override  // com.google.android.gms.games.Game
    public String getDescription() {
        return this.getString("game_description");
    }

    @Override  // com.google.android.gms.games.Game
    public void getDescription(CharArrayBuffer dataOut) {
        this.zza("game_description", dataOut);
    }

    @Override  // com.google.android.gms.games.Game
    public String getDeveloperName() {
        return this.getString("developer_name");
    }

    @Override  // com.google.android.gms.games.Game
    public void getDeveloperName(CharArrayBuffer dataOut) {
        this.zza("developer_name", dataOut);
    }

    @Override  // com.google.android.gms.games.Game
    public String getDisplayName() {
        return this.getString("display_name");
    }

    @Override  // com.google.android.gms.games.Game
    public void getDisplayName(CharArrayBuffer dataOut) {
        this.zza("display_name", dataOut);
    }

    @Override  // com.google.android.gms.games.Game
    public Uri getFeaturedImageUri() {
        return this.zzbW("featured_image_uri");
    }

    @Override  // com.google.android.gms.games.Game
    public String getFeaturedImageUrl() {
        return this.getString("featured_image_url");
    }

    @Override  // com.google.android.gms.games.Game
    public Uri getHiResImageUri() {
        return this.zzbW("game_hi_res_image_uri");
    }

    @Override  // com.google.android.gms.games.Game
    public String getHiResImageUrl() {
        return this.getString("game_hi_res_image_url");
    }

    @Override  // com.google.android.gms.games.Game
    public Uri getIconImageUri() {
        return this.zzbW("game_icon_image_uri");
    }

    @Override  // com.google.android.gms.games.Game
    public String getIconImageUrl() {
        return this.getString("game_icon_image_url");
    }

    @Override  // com.google.android.gms.games.Game
    public int getLeaderboardCount() {
        return this.getInteger("leaderboard_count");
    }

    @Override  // com.google.android.gms.games.Game
    public String getPrimaryCategory() {
        return this.getString("primary_category");
    }

    @Override  // com.google.android.gms.games.Game
    public String getSecondaryCategory() {
        return this.getString("secondary_category");
    }

    @Override  // com.google.android.gms.games.Game
    public String getThemeColor() {
        return this.getString("theme_color");
    }

    @Override  // com.google.android.gms.games.Game
    public boolean hasGamepadSupport() {
        return this.getInteger("gamepad_support") > 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return GameEntity.zza(this);
    }

    @Override  // com.google.android.gms.games.Game
    public boolean isMuted() {
        return this.getBoolean("muted");
    }

    @Override  // com.google.android.gms.games.Game
    public boolean isRealTimeMultiplayerEnabled() {
        return this.getInteger("real_time_support") > 0;
    }

    @Override  // com.google.android.gms.games.Game
    public boolean isTurnBasedMultiplayerEnabled() {
        return this.getInteger("turn_based_support") > 0;
    }

    @Override
    public String toString() {
        return GameEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((GameEntity)this.freeze()).writeToParcel(dest, flags);
    }

    @Override  // com.google.android.gms.games.Game
    public boolean zzrC() {
        return this.getBoolean("play_enabled_game");
    }

    @Override  // com.google.android.gms.games.Game
    public boolean zzrD() {
        return this.getBoolean("identity_sharing_confirmed");
    }

    @Override  // com.google.android.gms.games.Game
    public boolean zzrE() {
        return this.getInteger("installed") > 0;
    }

    @Override  // com.google.android.gms.games.Game
    public String zzrF() {
        return this.getString("package_name");
    }

    @Override  // com.google.android.gms.games.Game
    public int zzrG() {
        return this.getInteger("gameplay_acl_status");
    }
}

