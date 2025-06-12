package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.wearable.Channel.GetInputStreamResult;
import com.google.android.gms.wearable.Channel.GetOutputStreamResult;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ChannelImpl implements SafeParcelable, Channel {
    static final class zza implements GetInputStreamResult {
        private final Status zzOt;
        private final InputStream zzaTV;

        zza(Status status0, InputStream inputStream0) {
            this.zzOt = (Status)zzu.zzu(status0);
            this.zzaTV = inputStream0;
        }

        @Override  // com.google.android.gms.wearable.Channel$GetInputStreamResult
        public InputStream getInputStream() {
            return this.zzaTV;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }

        @Override  // com.google.android.gms.common.api.Releasable
        public void release() {
            if(this.zzaTV != null) {
                try {
                    this.zzaTV.close();
                }
                catch(IOException unused_ex) {
                }
            }
        }
    }

    static final class zzb implements GetOutputStreamResult {
        private final Status zzOt;
        private final OutputStream zzaTW;

        zzb(Status status0, OutputStream outputStream0) {
            this.zzOt = (Status)zzu.zzu(status0);
            this.zzaTW = outputStream0;
        }

        @Override  // com.google.android.gms.wearable.Channel$GetOutputStreamResult
        public OutputStream getOutputStream() {
            return this.zzaTW;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }

        @Override  // com.google.android.gms.common.api.Releasable
        public void release() {
            if(this.zzaTW != null) {
                try {
                    this.zzaTW.close();
                }
                catch(IOException unused_ex) {
                }
            }
        }
    }

    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    private final String zzaST;
    private final String zzaTK;
    private final String zzaTQ;

    static {
        ChannelImpl.CREATOR = new zzl();
    }

    ChannelImpl(int versionCode, String token, String nodeId, String path) {
        this.zzCY = versionCode;
        this.zzaTK = (String)zzu.zzu(token);
        this.zzaST = (String)zzu.zzu(nodeId);
        this.zzaTQ = (String)zzu.zzu(path);
    }

    @Override  // com.google.android.gms.wearable.Channel
    public PendingResult addListener(GoogleApiClient client, ChannelListener listener) {
        zzu.zzb(client, "client is null");
        zzu.zzb(listener, "listener is null");
        return client.zza(new com.google.android.gms.wearable.internal.zzi.zza(client, listener, this.zzaTK));
    }

    @Override  // com.google.android.gms.wearable.Channel
    public PendingResult close(GoogleApiClient client) {
        return client.zzb(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zzt(this, ChannelImpl.this.zzaTK);
            }

            protected Status zzb(Status status0) [...] // Inlined contents
        });
    }

    @Override  // com.google.android.gms.wearable.Channel
    public PendingResult close(GoogleApiClient client, int errorCode) {
        return client.zzb(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zzh(this, ChannelImpl.this.zzaTK, errorCode);
            }

            protected Status zzb(Status status0) [...] // Inlined contents
        });
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        if(other == this) {
            return true;
        }
        return other instanceof ChannelImpl ? this.zzaTK.equals(((ChannelImpl)other).zzaTK) && zzt.equal(((ChannelImpl)other).zzaST, this.zzaST) && zzt.equal(((ChannelImpl)other).zzaTQ, this.zzaTQ) && ((ChannelImpl)other).zzCY == this.zzCY : false;
    }

    @Override  // com.google.android.gms.wearable.Channel
    public PendingResult getInputStream(GoogleApiClient client) {
        return client.zzb(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zzu(this, ChannelImpl.this.zzaTK);
            }

            public GetInputStreamResult zzbb(Status status0) {
                return new zza(status0, null);
            }
        });
    }

    @Override  // com.google.android.gms.wearable.Channel
    public String getNodeId() {
        return this.zzaST;
    }

    @Override  // com.google.android.gms.wearable.Channel
    public PendingResult getOutputStream(GoogleApiClient client) {
        return client.zzb(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zzv(this, ChannelImpl.this.zzaTK);
            }

            public GetOutputStreamResult zzbc(Status status0) {
                return new zzb(status0, null);
            }
        });
    }

    @Override  // com.google.android.gms.wearable.Channel
    public String getPath() {
        return this.zzaTQ;
    }

    public String getToken() {
        return this.zzaTK;
    }

    @Override
    public int hashCode() {
        return this.zzaTK.hashCode();
    }

    @Override  // com.google.android.gms.wearable.Channel
    public PendingResult receiveFile(GoogleApiClient client, Uri uri, boolean append) {
        zzu.zzb(client, "client is null");
        zzu.zzb(uri, "uri is null");
        return client.zzb(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zza(this, ChannelImpl.this.zzaTK, uri, append);
            }

            public Status zzb(Status status0) [...] // Inlined contents
        });
    }

    @Override  // com.google.android.gms.wearable.Channel
    public PendingResult removeListener(GoogleApiClient client, ChannelListener listener) {
        zzu.zzb(client, "client is null");
        zzu.zzb(listener, "listener is null");
        return client.zza(new zzc(client, listener, this.zzaTK));
    }

    @Override  // com.google.android.gms.wearable.Channel
    public PendingResult sendFile(GoogleApiClient client, Uri uri) {
        return this.sendFile(client, uri, 0L, -1L);
    }

    @Override  // com.google.android.gms.wearable.Channel
    public PendingResult sendFile(GoogleApiClient client, Uri uri, long startOffset, long length) {
        zzu.zzb(client, "client is null");
        zzu.zzb(this.zzaTK, "token is null");
        zzu.zzb(uri, "uri is null");
        zzu.zzb(startOffset >= 0L, "startOffset is negative: %s", new Object[]{startOffset});
        zzu.zzb(length >= 0L || length == -1L, "invalid length: %s", new Object[]{length});
        return client.zzb(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zza(this, ChannelImpl.this.zzaTK, uri, startOffset, length);
            }

            public Status zzb(Status status0) [...] // Inlined contents
        });
    }

    @Override
    public String toString() {
        return "ChannelImpl{versionCode=" + this.zzCY + ", token=\'" + this.zzaTK + '\'' + ", nodeId=\'" + this.zzaST + '\'' + ", path=\'" + this.zzaTQ + '\'' + "}";
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzl.zza(this, dest, flags);
    }
}

