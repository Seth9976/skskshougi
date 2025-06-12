package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoRef;
import com.google.android.gms.games.internal.player.PlayerColumnNames;

public final class PlayerRef extends zzc implements Player {
    private final PlayerLevelInfo zzanN;
    private final PlayerColumnNames zzanX;
    private final MostRecentGameInfoRef zzanY;

    public PlayerRef(DataHolder holder, int dataRow) {
        this(holder, dataRow, null);
    }

    public PlayerRef(DataHolder holder, int dataRow, String prefix) {
        super(holder, dataRow);
        this.zzanX = new PlayerColumnNames(prefix);
        this.zzanY = new MostRecentGameInfoRef(holder, dataRow, this.zzanX);
        if(this.zzrM()) {
            int v1 = this.getInteger(this.zzanX.zzatf);
            int v2 = this.getInteger(this.zzanX.zzati);
            PlayerLevel playerLevel0 = new PlayerLevel(v1, this.getLong(this.zzanX.zzatg), this.getLong(this.zzanX.zzath));
            PlayerLevel playerLevel1 = v1 == v2 ? playerLevel0 : new PlayerLevel(v2, this.getLong(this.zzanX.zzath), this.getLong(this.zzanX.zzatj));
            this.zzanN = new PlayerLevelInfo(this.getLong(this.zzanX.zzate), this.getLong(this.zzanX.zzatk), playerLevel0, playerLevel1);
            return;
        }
        this.zzanN = null;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return PlayerEntity.zza(this, obj);
    }

    public Player freeze() {
        return new PlayerEntity(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.freeze();
    }

    @Override  // com.google.android.gms.games.Player
    public String getDisplayName() {
        return this.getString(this.zzanX.zzasW);
    }

    @Override  // com.google.android.gms.games.Player
    public void getDisplayName(CharArrayBuffer dataOut) {
        this.zza(this.zzanX.zzasW, dataOut);
    }

    @Override  // com.google.android.gms.games.Player
    public Uri getHiResImageUri() {
        return this.zzbW(this.zzanX.zzasZ);
    }

    @Override  // com.google.android.gms.games.Player
    public String getHiResImageUrl() {
        return this.getString(this.zzanX.zzata);
    }

    @Override  // com.google.android.gms.games.Player
    public Uri getIconImageUri() {
        return this.zzbW(this.zzanX.zzasX);
    }

    @Override  // com.google.android.gms.games.Player
    public String getIconImageUrl() {
        return this.getString(this.zzanX.zzasY);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.Player
    public long getLastPlayedWithTimestamp() {
        return this.zzbV(this.zzanX.zzatd) && !this.zzbX(this.zzanX.zzatd) ? this.getLong(this.zzanX.zzatd) : -1L;
    }

    @Override  // com.google.android.gms.games.Player
    public PlayerLevelInfo getLevelInfo() {
        return this.zzanN;
    }

    @Override  // com.google.android.gms.games.Player
    public String getPlayerId() {
        return this.getString(this.zzanX.zzasV);
    }

    @Override  // com.google.android.gms.games.Player
    public long getRetrievedTimestamp() {
        return this.getLong(this.zzanX.zzatb);
    }

    @Override  // com.google.android.gms.games.Player
    public String getTitle() {
        return this.getString(this.zzanX.zzatl);
    }

    @Override  // com.google.android.gms.games.Player
    public void getTitle(CharArrayBuffer dataOut) {
        this.zza(this.zzanX.zzatl, dataOut);
    }

    @Override  // com.google.android.gms.games.Player
    public boolean hasHiResImage() {
        return this.getHiResImageUri() != null;
    }

    @Override  // com.google.android.gms.games.Player
    public boolean hasIconImage() {
        return this.getIconImageUri() != null;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return PlayerEntity.zzb(this);
    }

    @Override  // com.google.android.gms.games.Player
    public boolean isProfileVisible() {
        return this.getBoolean(this.zzanX.zzatn);
    }

    @Override
    public String toString() {
        return PlayerEntity.zzc(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((PlayerEntity)this.freeze()).writeToParcel(dest, flags);
    }

    @Override  // com.google.android.gms.games.Player
    public boolean zzrJ() {
        return this.getBoolean(this.zzanX.zzatu);
    }

    @Override  // com.google.android.gms.games.Player
    public int zzrK() {
        return this.getInteger(this.zzanX.zzatc);
    }

    @Override  // com.google.android.gms.games.Player
    public MostRecentGameInfo zzrL() {
        return this.zzbX(this.zzanX.zzato) ? null : this.zzanY;
    }

    // 去混淆评级： 低(20)
    private boolean zzrM() {
        return this.zzbX(this.zzanX.zzate) ? false : this.getLong(this.zzanX.zzate) != -1L;
    }
}

