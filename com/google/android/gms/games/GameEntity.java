package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.internal.zzlc;

public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {
    static final class GameEntityCreatorCompat extends GameEntityCreator {
        @Override  // com.google.android.gms.games.GameEntityCreator
        public Object createFromParcel(Parcel x0) {
            return this.zzdr(x0);
        }

        @Override  // com.google.android.gms.games.GameEntityCreator
        public GameEntity zzdr(Parcel parcel0) {
            if(GameEntity.zzd(GameEntity.zznE()) || GameEntity.zzca(GameEntity.class.getCanonicalName())) {
                return super.zzdr(parcel0);
            }
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            String s2 = parcel0.readString();
            String s3 = parcel0.readString();
            String s4 = parcel0.readString();
            String s5 = parcel0.readString();
            String s6 = parcel0.readString();
            Uri uri0 = s6 == null ? null : Uri.parse(s6);
            String s7 = parcel0.readString();
            Uri uri1 = s7 == null ? null : Uri.parse(s7);
            String s8 = parcel0.readString();
            Uri uri2 = s8 == null ? null : Uri.parse(s8);
            if(parcel0.readInt() > 0) {
                return parcel0.readInt() <= 0 ? new GameEntity(7, s, s1, s2, s3, s4, s5, uri0, uri1, uri2, true, false, parcel0.readString(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), false, false, null, null, null, false, false, false, null, false) : new GameEntity(7, s, s1, s2, s3, s4, s5, uri0, uri1, uri2, true, true, parcel0.readString(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), false, false, null, null, null, false, false, false, null, false);
            }
            return parcel0.readInt() <= 0 ? new GameEntity(7, s, s1, s2, s3, s4, s5, uri0, uri1, uri2, false, false, parcel0.readString(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), false, false, null, null, null, false, false, false, null, false) : new GameEntity(7, s, s1, s2, s3, s4, s5, uri0, uri1, uri2, false, true, parcel0.readString(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), false, false, null, null, null, false, false, false, null, false);
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final boolean zzAg;
    private final int zzCY;
    private final String zzQv;
    private final String zzadI;
    private final String zzakM;
    private final String zzanc;
    private final String zzand;
    private final String zzane;
    private final Uri zzanf;
    private final Uri zzang;
    private final Uri zzanh;
    private final boolean zzani;
    private final boolean zzanj;
    private final String zzank;
    private final int zzanl;
    private final int zzanm;
    private final int zzann;
    private final boolean zzano;
    private final boolean zzanp;
    private final String zzanq;
    private final String zzanr;
    private final String zzans;
    private final boolean zzant;
    private final boolean zzanu;
    private final String zzanv;
    private final boolean zzanw;

    static {
        GameEntity.CREATOR = new GameEntityCreatorCompat();
    }

    GameEntity(int versionCode, String applicationId, String displayName, String primaryCategory, String secondaryCategory, String description, String developerName, Uri iconImageUri, Uri hiResImageUri, Uri featuredImageUri, boolean playEnabledGame, boolean instanceInstalled, String instancePackageName, int gameplayAclStatus, int achievementTotalCount, int leaderboardCount, boolean realTimeEnabled, boolean turnBasedEnabled, String iconImageUrl, String hiResImageUrl, String featuredImageUrl, boolean muted, boolean identitySharingConfirmed, boolean snapshotsEnabled, String themeColor, boolean hasGamepadSupport) {
        this.zzCY = versionCode;
        this.zzQv = applicationId;
        this.zzadI = displayName;
        this.zzanc = primaryCategory;
        this.zzand = secondaryCategory;
        this.zzakM = description;
        this.zzane = developerName;
        this.zzanf = iconImageUri;
        this.zzanq = iconImageUrl;
        this.zzang = hiResImageUri;
        this.zzanr = hiResImageUrl;
        this.zzanh = featuredImageUri;
        this.zzans = featuredImageUrl;
        this.zzani = playEnabledGame;
        this.zzanj = instanceInstalled;
        this.zzank = instancePackageName;
        this.zzanl = gameplayAclStatus;
        this.zzanm = achievementTotalCount;
        this.zzann = leaderboardCount;
        this.zzano = realTimeEnabled;
        this.zzanp = turnBasedEnabled;
        this.zzAg = muted;
        this.zzant = identitySharingConfirmed;
        this.zzanu = snapshotsEnabled;
        this.zzanv = themeColor;
        this.zzanw = hasGamepadSupport;
    }

    public GameEntity(Game game) {
        this.zzCY = 7;
        this.zzQv = game.getApplicationId();
        this.zzanc = game.getPrimaryCategory();
        this.zzand = game.getSecondaryCategory();
        this.zzakM = game.getDescription();
        this.zzane = game.getDeveloperName();
        this.zzadI = game.getDisplayName();
        this.zzanf = game.getIconImageUri();
        this.zzanq = game.getIconImageUrl();
        this.zzang = game.getHiResImageUri();
        this.zzanr = game.getHiResImageUrl();
        this.zzanh = game.getFeaturedImageUri();
        this.zzans = game.getFeaturedImageUrl();
        this.zzani = game.zzrC();
        this.zzanj = game.zzrE();
        this.zzank = game.zzrF();
        this.zzanl = game.zzrG();
        this.zzanm = game.getAchievementTotalCount();
        this.zzann = game.getLeaderboardCount();
        this.zzano = game.isRealTimeMultiplayerEnabled();
        this.zzanp = game.isTurnBasedMultiplayerEnabled();
        this.zzAg = game.isMuted();
        this.zzant = game.zzrD();
        this.zzanu = game.areSnapshotsEnabled();
        this.zzanv = game.getThemeColor();
        this.zzanw = game.hasGamepadSupport();
    }

    @Override  // com.google.android.gms.games.Game
    public boolean areSnapshotsEnabled() {
        return this.zzanu;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return GameEntity.zza(this, obj);
    }

    public Game freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.Game
    public int getAchievementTotalCount() {
        return this.zzanm;
    }

    @Override  // com.google.android.gms.games.Game
    public String getApplicationId() {
        return this.zzQv;
    }

    @Override  // com.google.android.gms.games.Game
    public String getDescription() {
        return this.zzakM;
    }

    @Override  // com.google.android.gms.games.Game
    public void getDescription(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzakM, dataOut);
    }

    @Override  // com.google.android.gms.games.Game
    public String getDeveloperName() {
        return this.zzane;
    }

    @Override  // com.google.android.gms.games.Game
    public void getDeveloperName(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzane, dataOut);
    }

    @Override  // com.google.android.gms.games.Game
    public String getDisplayName() {
        return this.zzadI;
    }

    @Override  // com.google.android.gms.games.Game
    public void getDisplayName(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzadI, dataOut);
    }

    @Override  // com.google.android.gms.games.Game
    public Uri getFeaturedImageUri() {
        return this.zzanh;
    }

    @Override  // com.google.android.gms.games.Game
    public String getFeaturedImageUrl() {
        return this.zzans;
    }

    @Override  // com.google.android.gms.games.Game
    public Uri getHiResImageUri() {
        return this.zzang;
    }

    @Override  // com.google.android.gms.games.Game
    public String getHiResImageUrl() {
        return this.zzanr;
    }

    @Override  // com.google.android.gms.games.Game
    public Uri getIconImageUri() {
        return this.zzanf;
    }

    @Override  // com.google.android.gms.games.Game
    public String getIconImageUrl() {
        return this.zzanq;
    }

    @Override  // com.google.android.gms.games.Game
    public int getLeaderboardCount() {
        return this.zzann;
    }

    @Override  // com.google.android.gms.games.Game
    public String getPrimaryCategory() {
        return this.zzanc;
    }

    @Override  // com.google.android.gms.games.Game
    public String getSecondaryCategory() {
        return this.zzand;
    }

    @Override  // com.google.android.gms.games.Game
    public String getThemeColor() {
        return this.zzanv;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override  // com.google.android.gms.games.Game
    public boolean hasGamepadSupport() {
        return this.zzanw;
    }

    @Override
    public int hashCode() {
        return GameEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override  // com.google.android.gms.games.Game
    public boolean isMuted() {
        return this.zzAg;
    }

    @Override  // com.google.android.gms.games.Game
    public boolean isRealTimeMultiplayerEnabled() {
        return this.zzano;
    }

    @Override  // com.google.android.gms.games.Game
    public boolean isTurnBasedMultiplayerEnabled() {
        return this.zzanp;
    }

    @Override
    public String toString() {
        return GameEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        int v1 = 1;
        String s = null;
        if(!this.zznF()) {
            GameEntityCreator.zza(this, dest, flags);
            return;
        }
        dest.writeString(this.zzQv);
        dest.writeString(this.zzadI);
        dest.writeString(this.zzanc);
        dest.writeString(this.zzand);
        dest.writeString(this.zzakM);
        dest.writeString(this.zzane);
        dest.writeString((this.zzanf == null ? null : this.zzanf.toString()));
        dest.writeString((this.zzang == null ? null : this.zzang.toString()));
        if(this.zzanh != null) {
            s = this.zzanh.toString();
        }
        dest.writeString(s);
        dest.writeInt((this.zzani ? 1 : 0));
        if(!this.zzanj) {
            v1 = 0;
        }
        dest.writeInt(v1);
        dest.writeString(this.zzank);
        dest.writeInt(this.zzanl);
        dest.writeInt(this.zzanm);
        dest.writeInt(this.zzann);
    }

    static int zza(Game game0) {
        return zzt.hashCode(new Object[]{game0.getApplicationId(), game0.getDisplayName(), game0.getPrimaryCategory(), game0.getSecondaryCategory(), game0.getDescription(), game0.getDeveloperName(), game0.getIconImageUri(), game0.getHiResImageUri(), game0.getFeaturedImageUri(), Boolean.valueOf(game0.zzrC()), Boolean.valueOf(game0.zzrE()), game0.zzrF(), game0.zzrG(), game0.getAchievementTotalCount(), game0.getLeaderboardCount(), Boolean.valueOf(game0.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game0.isTurnBasedMultiplayerEnabled()), Boolean.valueOf(game0.isMuted()), Boolean.valueOf(game0.zzrD()), Boolean.valueOf(game0.areSnapshotsEnabled()), game0.getThemeColor(), Boolean.valueOf(game0.hasGamepadSupport())});
    }

    // 去混淆评级： 低(26)
    static boolean zza(Game game0, Object object0) {
        if(!(object0 instanceof Game)) {
            return false;
        }
        if(game0 != object0) {
            Game game1 = (Game)object0;
            if(zzt.equal(game1.getApplicationId(), game0.getApplicationId()) && zzt.equal(game1.getDisplayName(), game0.getDisplayName()) && zzt.equal(game1.getPrimaryCategory(), game0.getPrimaryCategory()) && zzt.equal(game1.getSecondaryCategory(), game0.getSecondaryCategory()) && zzt.equal(game1.getDescription(), game0.getDescription()) && zzt.equal(game1.getDeveloperName(), game0.getDeveloperName()) && zzt.equal(game1.getIconImageUri(), game0.getIconImageUri()) && zzt.equal(game1.getHiResImageUri(), game0.getHiResImageUri()) && zzt.equal(game1.getFeaturedImageUri(), game0.getFeaturedImageUri()) && zzt.equal(Boolean.valueOf(game1.zzrC()), Boolean.valueOf(game0.zzrC())) && zzt.equal(Boolean.valueOf(game1.zzrE()), Boolean.valueOf(game0.zzrE())) && zzt.equal(game1.zzrF(), game0.zzrF()) && zzt.equal(game1.zzrG(), game0.zzrG()) && zzt.equal(game1.getAchievementTotalCount(), game0.getAchievementTotalCount()) && zzt.equal(game1.getLeaderboardCount(), game0.getLeaderboardCount()) && zzt.equal(Boolean.valueOf(game1.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game0.isRealTimeMultiplayerEnabled()))) {
                Boolean boolean0 = Boolean.valueOf(game1.isTurnBasedMultiplayerEnabled());
                return !game0.isTurnBasedMultiplayerEnabled() || !zzt.equal(Boolean.valueOf(game1.isMuted()), Boolean.valueOf(game0.isMuted())) || !zzt.equal(Boolean.valueOf(game1.zzrD()), Boolean.valueOf(game0.zzrD())) ? zzt.equal(boolean0, Boolean.FALSE) && zzt.equal(Boolean.valueOf(game1.areSnapshotsEnabled()), Boolean.valueOf(game0.areSnapshotsEnabled())) && zzt.equal(game1.getThemeColor(), game0.getThemeColor()) && zzt.equal(Boolean.valueOf(game1.hasGamepadSupport()), Boolean.valueOf(game0.hasGamepadSupport())) : zzt.equal(boolean0, Boolean.TRUE) && zzt.equal(Boolean.valueOf(game1.areSnapshotsEnabled()), Boolean.valueOf(game0.areSnapshotsEnabled())) && zzt.equal(game1.getThemeColor(), game0.getThemeColor()) && zzt.equal(Boolean.valueOf(game1.hasGamepadSupport()), Boolean.valueOf(game0.hasGamepadSupport()));
            }
            return false;
        }
        return true;
    }

    static String zzb(Game game0) {
        return zzt.zzt(game0).zzg("ApplicationId", game0.getApplicationId()).zzg("DisplayName", game0.getDisplayName()).zzg("PrimaryCategory", game0.getPrimaryCategory()).zzg("SecondaryCategory", game0.getSecondaryCategory()).zzg("Description", game0.getDescription()).zzg("DeveloperName", game0.getDeveloperName()).zzg("IconImageUri", game0.getIconImageUri()).zzg("IconImageUrl", game0.getIconImageUrl()).zzg("HiResImageUri", game0.getHiResImageUri()).zzg("HiResImageUrl", game0.getHiResImageUrl()).zzg("FeaturedImageUri", game0.getFeaturedImageUri()).zzg("FeaturedImageUrl", game0.getFeaturedImageUrl()).zzg("PlayEnabledGame", Boolean.valueOf(game0.zzrC())).zzg("InstanceInstalled", Boolean.valueOf(game0.zzrE())).zzg("InstancePackageName", game0.zzrF()).zzg("AchievementTotalCount", game0.getAchievementTotalCount()).zzg("LeaderboardCount", game0.getLeaderboardCount()).zzg("RealTimeMultiplayerEnabled", Boolean.valueOf(game0.isRealTimeMultiplayerEnabled())).zzg("TurnBasedMultiplayerEnabled", Boolean.valueOf(game0.isTurnBasedMultiplayerEnabled())).zzg("AreSnapshotsEnabled", Boolean.valueOf(game0.areSnapshotsEnabled())).zzg("ThemeColor", game0.getThemeColor()).zzg("HasGamepadSupport", Boolean.valueOf(game0.hasGamepadSupport())).toString();
    }

    @Override  // com.google.android.gms.games.Game
    public boolean zzrC() {
        return this.zzani;
    }

    @Override  // com.google.android.gms.games.Game
    public boolean zzrD() {
        return this.zzant;
    }

    @Override  // com.google.android.gms.games.Game
    public boolean zzrE() {
        return this.zzanj;
    }

    @Override  // com.google.android.gms.games.Game
    public String zzrF() {
        return this.zzank;
    }

    @Override  // com.google.android.gms.games.Game
    public int zzrG() {
        return this.zzanl;
    }
}

