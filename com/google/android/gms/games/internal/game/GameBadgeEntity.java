package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements GameBadge {
    static final class GameBadgeEntityCreatorCompat extends GameBadgeEntityCreator {
        @Override  // com.google.android.gms.games.internal.game.GameBadgeEntityCreator
        public Object createFromParcel(Parcel x0) {
            return this.zzdE(x0);
        }

        @Override  // com.google.android.gms.games.internal.game.GameBadgeEntityCreator
        public GameBadgeEntity zzdE(Parcel parcel0) {
            if(GameBadgeEntity.zzd(GameBadgeEntity.zznE()) || GameBadgeEntity.zzca(GameBadgeEntity.class.getCanonicalName())) {
                return super.zzdE(parcel0);
            }
            int v = parcel0.readInt();
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            String s2 = parcel0.readString();
            return s2 == null ? new GameBadgeEntity(1, v, s, s1, null) : new GameBadgeEntity(1, v, s, s1, Uri.parse(s2));
        }
    }

    public static final GameBadgeEntityCreator CREATOR;
    private final int zzCY;
    private int zzSq;
    private String zzadv;
    private String zzakM;
    private Uri zzanf;

    static {
        GameBadgeEntity.CREATOR = new GameBadgeEntityCreatorCompat();
    }

    GameBadgeEntity(int versionCode, int type, String title, String description, Uri iconImageUri) {
        this.zzCY = versionCode;
        this.zzSq = type;
        this.zzadv = title;
        this.zzakM = description;
        this.zzanf = iconImageUri;
    }

    public GameBadgeEntity(GameBadge gameBadge) {
        this.zzCY = 1;
        this.zzSq = gameBadge.getType();
        this.zzadv = gameBadge.getTitle();
        this.zzakM = gameBadge.getDescription();
        this.zzanf = gameBadge.getIconImageUri();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return GameBadgeEntity.zza(this, obj);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.internal.game.GameBadge
    public String getDescription() {
        return this.zzakM;
    }

    @Override  // com.google.android.gms.games.internal.game.GameBadge
    public Uri getIconImageUri() {
        return this.zzanf;
    }

    @Override  // com.google.android.gms.games.internal.game.GameBadge
    public String getTitle() {
        return this.zzadv;
    }

    @Override  // com.google.android.gms.games.internal.game.GameBadge
    public int getType() {
        return this.zzSq;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return GameBadgeEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return GameBadgeEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        if(!this.zznF()) {
            GameBadgeEntityCreator.zza(this, dest, flags);
            return;
        }
        dest.writeInt(this.zzSq);
        dest.writeString(this.zzadv);
        dest.writeString(this.zzakM);
        dest.writeString((this.zzanf == null ? null : this.zzanf.toString()));
    }

    static int zza(GameBadge gameBadge0) {
        return zzt.hashCode(new Object[]{gameBadge0.getType(), gameBadge0.getTitle(), gameBadge0.getDescription(), gameBadge0.getIconImageUri()});
    }

    // 去混淆评级： 低(30)
    static boolean zza(GameBadge gameBadge0, Object object0) {
        return object0 instanceof GameBadge ? gameBadge0 == object0 || zzt.equal(((GameBadge)object0).getType(), gameBadge0.getTitle()) && zzt.equal(((GameBadge)object0).getDescription(), gameBadge0.getIconImageUri()) : false;
    }

    static String zzb(GameBadge gameBadge0) {
        return zzt.zzt(gameBadge0).zzg("Type", gameBadge0.getType()).zzg("Title", gameBadge0.getTitle()).zzg("Description", gameBadge0.getDescription()).zzg("IconImageUri", gameBadge0.getIconImageUri()).toString();
    }

    public GameBadge zzti() [...] // Inlined contents
}

