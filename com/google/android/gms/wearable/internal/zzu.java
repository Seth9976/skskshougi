package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.IOException;
import java.io.InputStream;

public final class zzu implements DataApi {
    static final class zza extends zzf {
        private DataListener zzaUj;
        private IntentFilter[] zzaUk;

        private zza(GoogleApiClient googleApiClient0, DataListener dataApi$DataListener0, IntentFilter[] arr_intentFilter) {
            super(googleApiClient0);
            this.zzaUj = dataApi$DataListener0;
            this.zzaUk = arr_intentFilter;
        }

        zza(GoogleApiClient googleApiClient0, DataListener dataApi$DataListener0, IntentFilter[] arr_intentFilter, com.google.android.gms.wearable.internal.zzu.1 zzu$10) {
            this(googleApiClient0, dataApi$DataListener0, arr_intentFilter);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzb(x0);
        }

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((zzbk)api$Client0));
        }

        protected void zza(zzbk zzbk0) throws RemoteException {
            zzbk0.zza(this, this.zzaUj, this.zzaUk);
            this.zzaUj = null;
            this.zzaUk = null;
        }

        public Status zzb(Status status0) {
            this.zzaUj = null;
            this.zzaUk = null;
            return status0;
        }
    }

    public static class zzb implements DataItemResult {
        private final Status zzOt;
        private final DataItem zzaUl;

        public zzb(Status status0, DataItem dataItem0) {
            this.zzOt = status0;
            this.zzaUl = dataItem0;
        }

        @Override  // com.google.android.gms.wearable.DataApi$DataItemResult
        public DataItem getDataItem() {
            return this.zzaUl;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    public static class zzc implements DeleteDataItemsResult {
        private final Status zzOt;
        private final int zzaUm;

        public zzc(Status status0, int v) {
            this.zzOt = status0;
            this.zzaUm = v;
        }

        @Override  // com.google.android.gms.wearable.DataApi$DeleteDataItemsResult
        public int getNumDeleted() {
            return this.zzaUm;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    public static class zzd implements GetFdForAssetResult {
        private volatile boolean mClosed;
        private final Status zzOt;
        private volatile InputStream zzaTV;
        private volatile ParcelFileDescriptor zzaUn;

        public zzd(Status status0, ParcelFileDescriptor parcelFileDescriptor0) {
            this.mClosed = false;
            this.zzOt = status0;
            this.zzaUn = parcelFileDescriptor0;
        }

        @Override  // com.google.android.gms.wearable.DataApi$GetFdForAssetResult
        public ParcelFileDescriptor getFd() {
            if(this.mClosed) {
                throw new IllegalStateException("Cannot access the file descriptor after release().");
            }
            return this.zzaUn;
        }

        @Override  // com.google.android.gms.wearable.DataApi$GetFdForAssetResult
        public InputStream getInputStream() {
            if(this.mClosed) {
                throw new IllegalStateException("Cannot access the input stream after release().");
            }
            if(this.zzaUn == null) {
                return null;
            }
            if(this.zzaTV == null) {
                this.zzaTV = new ParcelFileDescriptor.AutoCloseInputStream(this.zzaUn);
            }
            return this.zzaTV;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }

        @Override  // com.google.android.gms.common.api.Releasable
        public void release() {
            if(this.zzaUn == null) {
                return;
            }
            if(this.mClosed) {
                throw new IllegalStateException("releasing an already released result.");
            }
            try {
                if(this.zzaTV == null) {
                    this.zzaUn.close();
                }
                else {
                    this.zzaTV.close();
                }
                this.mClosed = true;
                this.zzaUn = null;
                this.zzaTV = null;
            }
            catch(IOException unused_ex) {
            }
        }
    }

    @Override  // com.google.android.gms.wearable.DataApi
    public PendingResult addListener(GoogleApiClient client, DataListener listener) {
        return this.zza(client, listener, null);
    }

    @Override  // com.google.android.gms.wearable.DataApi
    public PendingResult deleteDataItems(GoogleApiClient client, Uri uri) {
        return this.deleteDataItems(client, uri, 0);
    }

    @Override  // com.google.android.gms.wearable.DataApi
    public PendingResult deleteDataItems(GoogleApiClient client, Uri uri, int filterType) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zzb(this, uri, filterType);
            }

            protected DeleteDataItemsResult zzbf(Status status0) {
                return new zzc(status0, 0);
            }
        });
    }

    @Override  // com.google.android.gms.wearable.DataApi
    public PendingResult getDataItem(GoogleApiClient client, Uri uri) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zza(this, uri);
            }

            protected DataItemResult zzbd(Status status0) {
                return new zzb(status0, null);
            }
        });
    }

    @Override  // com.google.android.gms.wearable.DataApi
    public PendingResult getDataItems(GoogleApiClient client) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zzl(this);
            }

            protected DataItemBuffer zzbe(Status status0) {
                return new DataItemBuffer(DataHolder.zzbi(status0.getStatusCode()));
            }
        });
    }

    @Override  // com.google.android.gms.wearable.DataApi
    public PendingResult getDataItems(GoogleApiClient client, Uri uri) {
        return this.getDataItems(client, uri, 0);
    }

    @Override  // com.google.android.gms.wearable.DataApi
    public PendingResult getDataItems(GoogleApiClient client, Uri uri, int filterType) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zza(this, uri, filterType);
            }

            protected DataItemBuffer zzbe(Status status0) {
                return new DataItemBuffer(DataHolder.zzbi(status0.getStatusCode()));
            }
        });
    }

    @Override  // com.google.android.gms.wearable.DataApi
    public PendingResult getFdForAsset(GoogleApiClient client, Asset asset) {
        this.zza(asset);
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zza(this, asset);
            }

            protected GetFdForAssetResult zzbg(Status status0) {
                return new zzd(status0, null);
            }
        });
    }

    @Override  // com.google.android.gms.wearable.DataApi
    public PendingResult getFdForAsset(GoogleApiClient client, DataItemAsset asset) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zza(this, asset);
            }

            protected GetFdForAssetResult zzbg(Status status0) {
                return new zzd(status0, null);
            }
        });
    }

    @Override  // com.google.android.gms.wearable.DataApi
    public PendingResult putDataItem(GoogleApiClient client, PutDataRequest request) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zza(this, request);
            }

            public DataItemResult zzbd(Status status0) {
                return new zzb(status0, null);
            }
        });
    }

    @Override  // com.google.android.gms.wearable.DataApi
    public PendingResult removeListener(GoogleApiClient client, DataListener listener) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zza(this, listener);
            }

            public Status zzb(Status status0) [...] // Inlined contents
        });
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, DataListener dataApi$DataListener0, IntentFilter[] arr_intentFilter) {
        return googleApiClient0.zza(new zza(googleApiClient0, dataApi$DataListener0, arr_intentFilter, null));
    }

    private void zza(Asset asset0) {
        if(asset0 == null) {
            throw new IllegalArgumentException("asset is null");
        }
        if(asset0.getDigest() == null) {
            throw new IllegalArgumentException("invalid asset");
        }
        if(asset0.getData() != null) {
            throw new IllegalArgumentException("invalid asset");
        }
    }
}

