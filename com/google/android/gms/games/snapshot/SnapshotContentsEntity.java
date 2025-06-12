package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.internal.zzlg;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class SnapshotContentsEntity implements SafeParcelable, SnapshotContents {
    public static final SnapshotContentsEntityCreator CREATOR;
    private final int zzCY;
    private Contents zzafa;
    private static final Object zzavj;

    static {
        SnapshotContentsEntity.zzavj = new Object();
        SnapshotContentsEntity.CREATOR = new SnapshotContentsEntityCreator();
    }

    SnapshotContentsEntity(int versionCode, Contents contents) {
        this.zzCY = versionCode;
        this.zzafa = contents;
    }

    public SnapshotContentsEntity(Contents contents) {
        this(1, contents);
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotContents
    public void close() {
        this.zzafa = null;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotContents
    public ParcelFileDescriptor getParcelFileDescriptor() {
        zzu.zza(!this.isClosed(), "Cannot mutate closed contents!");
        return this.zzafa.getParcelFileDescriptor();
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotContents
    public boolean isClosed() {
        return this.zzafa == null;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotContents
    public boolean modifyBytes(int dstOffset, byte[] content, int srcOffset, int count) {
        return this.zza(dstOffset, content, srcOffset, content.length, false);
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotContents
    public byte[] readFully() throws IOException {
        byte[] arr_b;
        zzu.zza(!this.isClosed(), "Must provide a previously opened Snapshot");
        synchronized(SnapshotContentsEntity.zzavj) {
            FileInputStream fileInputStream0 = new FileInputStream(this.zzafa.getParcelFileDescriptor().getFileDescriptor());
            BufferedInputStream bufferedInputStream0 = new BufferedInputStream(fileInputStream0);
            try {
                fileInputStream0.getChannel().position(0L);
                arr_b = zzlg.zza(bufferedInputStream0, false);
                fileInputStream0.getChannel().position(0L);
                return arr_b;
            }
            catch(IOException iOException0) {
                GamesLog.zzb("SnapshotContentsEntity", "Failed to read snapshot data", iOException0);
                throw iOException0;
            }
        }
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotContents
    public boolean writeBytes(byte[] content) {
        return this.zza(0, content, 0, content.length, true);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        SnapshotContentsEntityCreator.zza(this, out, flags);
    }

    private boolean zza(int v, byte[] arr_b, int v1, int v2, boolean z) {
        Object object0;
        boolean z1;
        z1 = this.isClosed() ? false : true;
        zzu.zza(z1, "Must provide a previously opened SnapshotContents");
        object0 = SnapshotContentsEntity.zzavj;
        synchronized(object0) {
            FileOutputStream fileOutputStream0 = new FileOutputStream(this.zzafa.getParcelFileDescriptor().getFileDescriptor());
            BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(fileOutputStream0);
            try {
                FileChannel fileChannel0 = fileOutputStream0.getChannel();
                fileChannel0.position(((long)v));
                bufferedOutputStream0.write(arr_b, v1, v2);
                if(z) {
                    fileChannel0.truncate(((long)arr_b.length));
                }
                bufferedOutputStream0.flush();
                return true;
            }
            catch(IOException iOException0) {
            }
            GamesLog.zza("SnapshotContentsEntity", "Failed to write snapshot data", iOException0);
        }
        return false;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotContents
    public Contents zzpe() {
        return this.zzafa;
    }
}

