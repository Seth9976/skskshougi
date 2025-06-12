package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt.zza;
import com.google.android.gms.common.internal.zzt;

public final class SnapshotEntity implements SafeParcelable, Snapshot {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final SnapshotMetadataEntity zzavk;
    private final SnapshotContentsEntity zzavl;

    static {
        SnapshotEntity.CREATOR = new SnapshotEntityCreator();
    }

    SnapshotEntity(int versionCode, SnapshotMetadata metadata, SnapshotContentsEntity contents) {
        this.zzCY = versionCode;
        this.zzavk = new SnapshotMetadataEntity(metadata);
        this.zzavl = contents;
    }

    public SnapshotEntity(SnapshotMetadata metadata, SnapshotContentsEntity contents) {
        this(2, metadata, contents);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return SnapshotEntity.zza(this, obj);
    }

    public Snapshot freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshot
    public SnapshotMetadata getMetadata() {
        return this.zzavk;
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshot
    public SnapshotContents getSnapshotContents() {
        return this.isClosed() ? null : this.zzavl;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return SnapshotEntity.zzb(this);
    }

    private boolean isClosed() {
        return this.zzavl.isClosed();
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return SnapshotEntity.zzc(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        SnapshotEntityCreator.zza(this, out, flags);
    }

    // 去混淆评级： 低(30)
    static boolean zza(Snapshot snapshot0, Object object0) {
        return object0 instanceof Snapshot ? snapshot0 == object0 || zzt.equal(((Snapshot)object0).getMetadata(), snapshot0.getMetadata()) && zzt.equal(((Snapshot)object0).getSnapshotContents(), snapshot0.getSnapshotContents()) : false;
    }

    static int zzb(Snapshot snapshot0) {
        return zzt.hashCode(new Object[]{snapshot0.getMetadata(), snapshot0.getSnapshotContents()});
    }

    static String zzc(Snapshot snapshot0) {
        zza zzt$zza0 = zzt.zzt(snapshot0).zzg("Metadata", snapshot0.getMetadata());
        return snapshot0.getSnapshotContents() == null ? zzt$zza0.zzg("HasContents", Boolean.FALSE).toString() : zzt$zza0.zzg("HasContents", Boolean.TRUE).toString();
    }
}

