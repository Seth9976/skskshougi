package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class SnapshotMetadataRef extends zzc implements SnapshotMetadata {
    private final Game zzatB;
    private final Player zzavA;

    public SnapshotMetadataRef(DataHolder holder, int dataRow) {
        super(holder, dataRow);
        this.zzatB = new GameRef(holder, dataRow);
        this.zzavA = new PlayerRef(holder, dataRow);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return SnapshotMetadataEntity.zza(this, obj);
    }

    public SnapshotMetadata freeze() {
        return new SnapshotMetadataEntity(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.freeze();
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public float getCoverImageAspectRatio() {
        float f = this.getFloat("cover_icon_image_height");
        return f == 0.0f ? 0.0f : this.getFloat("cover_icon_image_width") / f;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public Uri getCoverImageUri() {
        return this.zzbW("cover_icon_image_uri");
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getCoverImageUrl() {
        return this.getString("cover_icon_image_url");
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getDescription() {
        return this.getString("description");
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public void getDescription(CharArrayBuffer dataOut) {
        this.zza("description", dataOut);
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public Game getGame() {
        return this.zzatB;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long getLastModifiedTimestamp() {
        return this.getLong("last_modified_timestamp");
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public Player getOwner() {
        return this.zzavA;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long getPlayedTime() {
        return this.getLong("duration");
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public long getProgressValue() {
        return this.getLong("progress_value");
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getSnapshotId() {
        return this.getString("external_snapshot_id");
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getTitle() {
        return this.getString("title");
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public String getUniqueName() {
        return this.getString("unique_name");
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public boolean hasChangePending() {
        return this.getInteger("pending_change_count") > 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return SnapshotMetadataEntity.zza(this);
    }

    @Override
    public String toString() {
        return SnapshotMetadataEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((SnapshotMetadataEntity)this.freeze()).writeToParcel(dest, flags);
    }
}

