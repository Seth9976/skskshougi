package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzlc;

public final class SnapshotMetadataEntity implements SafeParcelable, SnapshotMetadata {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final String zzadv;
    private final String zzakM;
    private final String zzapg;
    private final GameEntity zzaud;
    private final Uri zzavp;
    private final PlayerEntity zzavs;
    private final String zzavt;
    private final long zzavu;
    private final long zzavv;
    private final float zzavw;
    private final String zzavx;
    private final boolean zzavy;
    private final long zzavz;

    static {
        SnapshotMetadataEntity.CREATOR = new SnapshotMetadataEntityCreator();
    }

    SnapshotMetadataEntity(int versionCode, GameEntity game, PlayerEntity owner, String snapshotId, Uri coverImageUri, String coverImageUrl, String title, String description, long lastModifiedTimestamp, long playedTime, float coverImageAspectRatio, String uniqueName, boolean changePending, long progressValue) {
        this.zzCY = versionCode;
        this.zzaud = game;
        this.zzavs = owner;
        this.zzapg = snapshotId;
        this.zzavp = coverImageUri;
        this.zzavt = coverImageUrl;
        this.zzavw = coverImageAspectRatio;
        this.zzadv = title;
        this.zzakM = description;
        this.zzavu = lastModifiedTimestamp;
        this.zzavv = playedTime;
        this.zzavx = uniqueName;
        this.zzavy = changePending;
        this.zzavz = progressValue;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotMetadata) {
        this.zzCY = 5;
        this.zzaud = new GameEntity(snapshotMetadata.getGame());
        this.zzavs = new PlayerEntity(snapshotMetadata.getOwner());
        this.zzapg = snapshotMetadata.getSnapshotId();
        this.zzavp = snapshotMetadata.getCoverImageUri();
        this.zzavt = snapshotMetadata.getCoverImageUrl();
        this.zzavw = snapshotMetadata.getCoverImageAspectRatio();
        this.zzadv = snapshotMetadata.getTitle();
        this.zzakM = snapshotMetadata.getDescription();
        this.zzavu = snapshotMetadata.getLastModifiedTimestamp();
        this.zzavv = snapshotMetadata.getPlayedTime();
        this.zzavx = snapshotMetadata.getUniqueName();
        this.zzavy = snapshotMetadata.hasChangePending();
        this.zzavz = snapshotMetadata.getProgressValue();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return SnapshotMetadataEntity.zza(this, obj);
    }

    public SnapshotMetadata freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public float getCoverImageAspectRatio() {
        return this.zzavw;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public Uri getCoverImageUri() {
        return this.zzavp;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getCoverImageUrl() {
        return this.zzavt;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getDescription() {
        return this.zzakM;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public void getDescription(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzakM, dataOut);
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public Game getGame() {
        return this.zzaud;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long getLastModifiedTimestamp() {
        return this.zzavu;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public Player getOwner() {
        return this.zzavs;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long getPlayedTime() {
        return this.zzavv;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long getProgressValue() {
        return this.zzavz;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getSnapshotId() {
        return this.zzapg;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getTitle() {
        return this.zzadv;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getUniqueName() {
        return this.zzavx;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public boolean hasChangePending() {
        return this.zzavy;
    }

    @Override
    public int hashCode() {
        return SnapshotMetadataEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return SnapshotMetadataEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        SnapshotMetadataEntityCreator.zza(this, out, flags);
    }

    static int zza(SnapshotMetadata snapshotMetadata0) {
        return zzt.hashCode(new Object[]{snapshotMetadata0.getGame(), snapshotMetadata0.getOwner(), snapshotMetadata0.getSnapshotId(), snapshotMetadata0.getCoverImageUri(), snapshotMetadata0.getCoverImageAspectRatio(), snapshotMetadata0.getTitle(), snapshotMetadata0.getDescription(), snapshotMetadata0.getLastModifiedTimestamp(), snapshotMetadata0.getPlayedTime(), snapshotMetadata0.getUniqueName(), Boolean.valueOf(snapshotMetadata0.hasChangePending()), snapshotMetadata0.getProgressValue()});
    }

    // 去混淆评级： 中等(130)
    static boolean zza(SnapshotMetadata snapshotMetadata0, Object object0) {
        return object0 instanceof SnapshotMetadata ? snapshotMetadata0 == object0 || zzt.equal(((SnapshotMetadata)object0).getGame(), snapshotMetadata0.getGame()) && zzt.equal(((SnapshotMetadata)object0).getOwner(), snapshotMetadata0.getOwner()) && zzt.equal(((SnapshotMetadata)object0).getSnapshotId(), snapshotMetadata0.getSnapshotId()) && zzt.equal(((SnapshotMetadata)object0).getCoverImageUri(), snapshotMetadata0.getCoverImageUri()) && zzt.equal(((SnapshotMetadata)object0).getCoverImageAspectRatio(), snapshotMetadata0.getCoverImageAspectRatio()) && zzt.equal(((SnapshotMetadata)object0).getTitle(), snapshotMetadata0.getTitle()) && zzt.equal(((SnapshotMetadata)object0).getDescription(), snapshotMetadata0.getDescription()) && zzt.equal(((SnapshotMetadata)object0).getLastModifiedTimestamp(), snapshotMetadata0.getLastModifiedTimestamp()) && zzt.equal(((SnapshotMetadata)object0).getPlayedTime(), snapshotMetadata0.getPlayedTime()) && zzt.equal(((SnapshotMetadata)object0).getUniqueName(), snapshotMetadata0.getUniqueName()) && zzt.equal(Boolean.valueOf(((SnapshotMetadata)object0).hasChangePending()), Boolean.valueOf(snapshotMetadata0.hasChangePending())) && zzt.equal(((SnapshotMetadata)object0).getProgressValue(), snapshotMetadata0.getProgressValue()) : false;
    }

    static String zzb(SnapshotMetadata snapshotMetadata0) {
        return zzt.zzt(snapshotMetadata0).zzg("Game", snapshotMetadata0.getGame()).zzg("Owner", snapshotMetadata0.getOwner()).zzg("SnapshotId", snapshotMetadata0.getSnapshotId()).zzg("CoverImageUri", snapshotMetadata0.getCoverImageUri()).zzg("CoverImageUrl", snapshotMetadata0.getCoverImageUrl()).zzg("CoverImageAspectRatio", snapshotMetadata0.getCoverImageAspectRatio()).zzg("Description", snapshotMetadata0.getDescription()).zzg("LastModifiedTimestamp", snapshotMetadata0.getLastModifiedTimestamp()).zzg("PlayedTime", snapshotMetadata0.getPlayedTime()).zzg("UniqueName", snapshotMetadata0.getUniqueName()).zzg("ChangePending", Boolean.valueOf(snapshotMetadata0.hasChangePending())).zzg("ProgressValue", snapshotMetadata0.getProgressValue()).toString();
    }
}

