package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.internal.zzan.zza;
import com.google.android.gms.drive.internal.zzx;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zzlg;
import com.google.android.gms.internal.zzlo;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class CompletionEvent implements SafeParcelable, ResourceEvent {
    public static final Parcelable.Creator CREATOR = null;
    public static final int STATUS_CANCELED = 3;
    public static final int STATUS_CONFLICT = 2;
    public static final int STATUS_FAILURE = 1;
    public static final int STATUS_SUCCESS;
    final int zzCY;
    final String zzOx;
    final DriveId zzacT;
    final ParcelFileDescriptor zzadT;
    final ParcelFileDescriptor zzadU;
    final MetadataBundle zzadV;
    final List zzadW;
    final IBinder zzadX;
    private boolean zzadY;
    private boolean zzadZ;
    private boolean zzaea;
    final int zzwS;

    static {
        CompletionEvent.CREATOR = new zze();
    }

    CompletionEvent(int versionCode, DriveId driveId, String accountName, ParcelFileDescriptor baseParcelFileDescriptor, ParcelFileDescriptor modifiedParcelFileDescriptor, MetadataBundle modifiedMetadataBundle, List list0, int status, IBinder releaseCallback) {
        this.zzadY = false;
        this.zzadZ = false;
        this.zzaea = false;
        this.zzCY = versionCode;
        this.zzacT = driveId;
        this.zzOx = accountName;
        this.zzadT = baseParcelFileDescriptor;
        this.zzadU = modifiedParcelFileDescriptor;
        this.zzadV = modifiedMetadataBundle;
        this.zzadW = list0;
        this.zzwS = status;
        this.zzadX = releaseCallback;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void dismiss() {
        this.zzv(false);
    }

    public String getAccountName() {
        this.zzpu();
        return this.zzOx;
    }

    public InputStream getBaseContentsInputStream() {
        this.zzpu();
        if(this.zzadT == null) {
            return null;
        }
        if(this.zzadY) {
            throw new IllegalStateException("getBaseInputStream() can only be called once per CompletionEvent instance.");
        }
        this.zzadY = true;
        return new FileInputStream(this.zzadT.getFileDescriptor());
    }

    @Override  // com.google.android.gms.drive.events.ResourceEvent
    public DriveId getDriveId() {
        this.zzpu();
        return this.zzacT;
    }

    public InputStream getModifiedContentsInputStream() {
        this.zzpu();
        if(this.zzadU == null) {
            return null;
        }
        if(this.zzadZ) {
            throw new IllegalStateException("getModifiedInputStream() can only be called once per CompletionEvent instance.");
        }
        this.zzadZ = true;
        return new FileInputStream(this.zzadU.getFileDescriptor());
    }

    public MetadataChangeSet getModifiedMetadataChangeSet() {
        this.zzpu();
        return this.zzadV == null ? null : new MetadataChangeSet(this.zzadV);
    }

    public int getStatus() {
        this.zzpu();
        return this.zzwS;
    }

    public List getTrackingTags() {
        this.zzpu();
        return new ArrayList(this.zzadW);
    }

    @Override  // com.google.android.gms.drive.events.DriveEvent
    public int getType() {
        return 2;
    }

    public void snooze() {
        this.zzv(true);
    }

    @Override
    public String toString() {
        if(this.zzadW == null) {
            return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", this.zzacT, this.zzwS, "<null>");
        }
        String s = "\'" + TextUtils.join("\',\'", this.zzadW) + "\'";
        return String.format(Locale.US, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", this.zzacT, this.zzwS, s);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zze.zza(this, dest, flags | 1);
    }

    private void zzpu() {
        if(this.zzaea) {
            throw new IllegalStateException("Event has already been dismissed or snoozed.");
        }
    }

    private void zzv(boolean z) {
        this.zzpu();
        this.zzaea = true;
        zzlg.zza(this.zzadT);
        zzlg.zza(this.zzadU);
        if(this.zzadV != null && this.zzadV.zzc(zzlo.zzaho)) {
            ((BitmapTeleporter)this.zzadV.zza(zzlo.zzaho)).release();
        }
        if(this.zzadX == null) {
            zzx.zzv("CompletionEvent", "No callback on " + (z ? "snooze" : "dismiss"));
            return;
        }
        try {
            zza.zzaR(this.zzadX).zzv(z);
        }
        catch(RemoteException remoteException0) {
            zzx.zzv("CompletionEvent", "RemoteException on " + (z ? "snooze" : "dismiss") + ": " + remoteException0);
        }
    }
}

