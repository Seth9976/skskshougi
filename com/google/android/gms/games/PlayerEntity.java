package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import com.google.android.gms.internal.zzlc;

public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
    static final class PlayerEntityCreatorCompat extends PlayerEntityCreator {
        @Override  // com.google.android.gms.games.PlayerEntityCreator
        public Object createFromParcel(Parcel x0) {
            return this.zzds(x0);
        }

        @Override  // com.google.android.gms.games.PlayerEntityCreator
        public PlayerEntity zzds(Parcel parcel0) {
            if(PlayerEntity.zzd(PlayerEntity.zznE()) || PlayerEntity.zzca(PlayerEntity.class.getCanonicalName())) {
                return super.zzds(parcel0);
            }
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            String s2 = parcel0.readString();
            String s3 = parcel0.readString();
            if(s2 == null) {
                return s3 == null ? new PlayerEntity(12, s, s1, null, null, parcel0.readLong(), -1, -1L, null, null, null, null, null, true, false) : new PlayerEntity(12, s, s1, null, Uri.parse(s3), parcel0.readLong(), -1, -1L, null, null, null, null, null, true, false);
            }
            Uri uri0 = Uri.parse(s2);
            return s3 == null ? new PlayerEntity(12, s, s1, uri0, null, parcel0.readLong(), -1, -1L, null, null, null, null, null, true, false) : new PlayerEntity(12, s, s1, uri0, Uri.parse(s3), parcel0.readLong(), -1, -1L, null, null, null, null, null, true, false);
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzTL;
    private final String zzadI;
    private final String zzadv;
    private final long zzanJ;
    private final int zzanK;
    private final long zzanL;
    private final MostRecentGameInfoEntity zzanM;
    private final PlayerLevelInfo zzanN;
    private final boolean zzanO;
    private final boolean zzanP;
    private final Uri zzanf;
    private final Uri zzang;
    private final String zzanq;
    private final String zzanr;

    static {
        PlayerEntity.CREATOR = new PlayerEntityCreatorCompat();
    }

    PlayerEntity(int versionCode, String playerId, String displayName, Uri iconImageUri, Uri hiResImageUri, long retrievedTimestamp, int isInCircles, long lastPlayedWithTimestamp, String iconImageUrl, String hiResImageUrl, String title, MostRecentGameInfoEntity mostRecentGameInfo, PlayerLevelInfo playerLevelInfo, boolean isProfileVisible, boolean hasDebugAccess) {
        this.zzCY = versionCode;
        this.zzTL = playerId;
        this.zzadI = displayName;
        this.zzanf = iconImageUri;
        this.zzanq = iconImageUrl;
        this.zzang = hiResImageUri;
        this.zzanr = hiResImageUrl;
        this.zzanJ = retrievedTimestamp;
        this.zzanK = isInCircles;
        this.zzanL = lastPlayedWithTimestamp;
        this.zzadv = title;
        this.zzanO = isProfileVisible;
        this.zzanM = mostRecentGameInfo;
        this.zzanN = playerLevelInfo;
        this.zzanP = hasDebugAccess;
    }

    public PlayerEntity(Player player) {
        this(player, true);
    }

    public PlayerEntity(Player player, boolean isPlusEnabled) {
        MostRecentGameInfoEntity mostRecentGameInfoEntity0 = null;
        super();
        this.zzCY = 12;
        this.zzTL = isPlusEnabled ? player.getPlayerId() : null;
        this.zzadI = player.getDisplayName();
        this.zzanf = player.getIconImageUri();
        this.zzanq = player.getIconImageUrl();
        this.zzang = player.getHiResImageUri();
        this.zzanr = player.getHiResImageUrl();
        this.zzanJ = player.getRetrievedTimestamp();
        this.zzanK = player.zzrK();
        this.zzanL = player.getLastPlayedWithTimestamp();
        this.zzadv = player.getTitle();
        this.zzanO = player.isProfileVisible();
        MostRecentGameInfo mostRecentGameInfo0 = player.zzrL();
        if(mostRecentGameInfo0 != null) {
            mostRecentGameInfoEntity0 = new MostRecentGameInfoEntity(mostRecentGameInfo0);
        }
        this.zzanM = mostRecentGameInfoEntity0;
        this.zzanN = player.getLevelInfo();
        this.zzanP = player.zzrJ();
        if(isPlusEnabled) {
            zzb.zzq(this.zzTL);
        }
        zzb.zzq(this.zzadI);
        zzb.zzU(this.zzanJ > 0L);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return PlayerEntity.zza(this, obj);
    }

    public Player freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.Player
    public String getDisplayName() {
        return this.zzadI;
    }

    @Override  // com.google.android.gms.games.Player
    public void getDisplayName(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzadI, dataOut);
    }

    @Override  // com.google.android.gms.games.Player
    public Uri getHiResImageUri() {
        return this.zzang;
    }

    @Override  // com.google.android.gms.games.Player
    public String getHiResImageUrl() {
        return this.zzanr;
    }

    @Override  // com.google.android.gms.games.Player
    public Uri getIconImageUri() {
        return this.zzanf;
    }

    @Override  // com.google.android.gms.games.Player
    public String getIconImageUrl() {
        return this.zzanq;
    }

    @Override  // com.google.android.gms.games.Player
    public long getLastPlayedWithTimestamp() {
        return this.zzanL;
    }

    @Override  // com.google.android.gms.games.Player
    public PlayerLevelInfo getLevelInfo() {
        return this.zzanN;
    }

    @Override  // com.google.android.gms.games.Player
    public String getPlayerId() {
        return this.zzTL;
    }

    @Override  // com.google.android.gms.games.Player
    public long getRetrievedTimestamp() {
        return this.zzanJ;
    }

    @Override  // com.google.android.gms.games.Player
    public String getTitle() {
        return this.zzadv;
    }

    @Override  // com.google.android.gms.games.Player
    public void getTitle(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzadv, dataOut);
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override  // com.google.android.gms.games.Player
    public boolean hasHiResImage() {
        return this.getHiResImageUri() != null;
    }

    @Override  // com.google.android.gms.games.Player
    public boolean hasIconImage() {
        return this.getIconImageUri() != null;
    }

    @Override
    public int hashCode() {
        return PlayerEntity.zzb(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override  // com.google.android.gms.games.Player
    public boolean isProfileVisible() {
        return this.zzanO;
    }

    @Override
    public String toString() {
        return PlayerEntity.zzc(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        String s = null;
        if(!this.zznF()) {
            PlayerEntityCreator.zza(this, dest, flags);
            return;
        }
        dest.writeString(this.zzTL);
        dest.writeString(this.zzadI);
        dest.writeString((this.zzanf == null ? null : this.zzanf.toString()));
        if(this.zzang != null) {
            s = this.zzang.toString();
        }
        dest.writeString(s);
        dest.writeLong(this.zzanJ);
    }

    // 去混淆评级： 中等(90)
    static boolean zza(Player player0, Object object0) {
        return object0 instanceof Player ? player0 == object0 || zzt.equal(((Player)object0).getPlayerId(), player0.getPlayerId()) && zzt.equal(((Player)object0).getDisplayName(), player0.getDisplayName()) && zzt.equal(Boolean.valueOf(((Player)object0).zzrJ()), Boolean.valueOf(player0.zzrJ())) && zzt.equal(((Player)object0).getIconImageUri(), player0.getIconImageUri()) && zzt.equal(((Player)object0).getHiResImageUri(), player0.getHiResImageUri()) && zzt.equal(((Player)object0).getRetrievedTimestamp(), player0.getRetrievedTimestamp()) && zzt.equal(((Player)object0).getTitle(), player0.getTitle()) && zzt.equal(((Player)object0).getLevelInfo(), player0.getLevelInfo()) : false;
    }

    static int zzb(Player player0) {
        return zzt.hashCode(new Object[]{player0.getPlayerId(), player0.getDisplayName(), Boolean.valueOf(player0.zzrJ()), player0.getIconImageUri(), player0.getHiResImageUri(), player0.getRetrievedTimestamp(), player0.getTitle(), player0.getLevelInfo()});
    }

    static String zzc(Player player0) {
        return zzt.zzt(player0).zzg("PlayerId", player0.getPlayerId()).zzg("DisplayName", player0.getDisplayName()).zzg("HasDebugAccess", Boolean.valueOf(player0.zzrJ())).zzg("IconImageUri", player0.getIconImageUri()).zzg("IconImageUrl", player0.getIconImageUrl()).zzg("HiResImageUri", player0.getHiResImageUri()).zzg("HiResImageUrl", player0.getHiResImageUrl()).zzg("RetrievedTimestamp", player0.getRetrievedTimestamp()).zzg("Title", player0.getTitle()).zzg("LevelInfo", player0.getLevelInfo()).toString();
    }

    @Override  // com.google.android.gms.games.Player
    public boolean zzrJ() {
        return this.zzanP;
    }

    @Override  // com.google.android.gms.games.Player
    public int zzrK() {
        return this.zzanK;
    }

    @Override  // com.google.android.gms.games.Player
    public MostRecentGameInfo zzrL() {
        return this.zzanM;
    }
}

