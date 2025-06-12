package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveResource.MetadataResult;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.events.ChangeListener;
import java.util.ArrayList;
import java.util.Set;

public class zzz implements DriveResource {
    static class zza extends zzd {
        private final zzb zzOs;

        public zza(zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zza(OnListParentsResponse onListParentsResponse0) throws RemoteException {
            MetadataBuffer metadataBuffer0 = new MetadataBuffer(onListParentsResponse0.zzpR());
            zzf zzq$zzf0 = new zzf(Status.zzXP, metadataBuffer0, false);
            this.zzOs.zzm(zzq$zzf0);
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zzt(Status status0) throws RemoteException {
            zzf zzq$zzf0 = new zzf(status0, null, false);
            this.zzOs.zzm(zzq$zzf0);
        }
    }

    static class com.google.android.gms.drive.internal.zzz.zzb extends zzd {
        private final zzb zzOs;

        public com.google.android.gms.drive.internal.zzz.zzb(zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zza(OnMetadataResponse onMetadataResponse0) throws RemoteException {
            zzn zzn0 = new zzn(onMetadataResponse0.zzpS());
            zzc zzz$zzc0 = new zzc(Status.zzXP, zzn0);
            this.zzOs.zzm(zzz$zzc0);
        }

        @Override  // com.google.android.gms.drive.internal.zzd
        public void zzt(Status status0) throws RemoteException {
            zzc zzz$zzc0 = new zzc(status0, null);
            this.zzOs.zzm(zzz$zzc0);
        }
    }

    static class zzc implements MetadataResult {
        private final Status zzOt;
        private final Metadata zzafA;

        public zzc(Status status0, Metadata metadata0) {
            this.zzOt = status0;
            this.zzafA = metadata0;
        }

        @Override  // com.google.android.gms.drive.DriveResource$MetadataResult
        public Metadata getMetadata() {
            return this.zzafA;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    abstract class com.google.android.gms.drive.internal.zzz.zzd extends zzr {
        final zzz zzafy;

        private com.google.android.gms.drive.internal.zzz.zzd(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        com.google.android.gms.drive.internal.zzz.zzd(GoogleApiClient googleApiClient0, com.google.android.gms.drive.internal.zzz.1 zzz$10) {
            this(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzA(x0);
        }

        public MetadataResult zzA(Status status0) {
            return new zzc(status0, null);
        }
    }

    protected final DriveId zzacT;

    protected zzz(DriveId driveId0) {
        this.zzacT = driveId0;
    }

    @Override  // com.google.android.gms.drive.DriveResource
    public PendingResult addChangeListener(GoogleApiClient apiClient, ChangeListener listener) {
        return ((zzs)apiClient.zza(Drive.zzNX)).zza(apiClient, this.zzacT, listener);
    }

    @Override  // com.google.android.gms.drive.DriveResource
    public PendingResult addChangeSubscription(GoogleApiClient apiClient) {
        return ((zzs)apiClient.zza(Drive.zzNX)).zza(apiClient, this.zzacT);
    }

    @Override  // com.google.android.gms.drive.DriveResource
    public PendingResult delete(GoogleApiClient apiClient) {
        return apiClient.zzb(new com.google.android.gms.drive.internal.zzr.zza(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new DeleteResourceRequest(zzz.this.zzacT), new zzbq(this));
            }
        });
    }

    @Override  // com.google.android.gms.drive.DriveResource
    public DriveId getDriveId() {
        return this.zzacT;
    }

    @Override  // com.google.android.gms.drive.DriveResource
    public PendingResult getMetadata(GoogleApiClient apiClient) {
        return this.zza(apiClient, false);
    }

    @Override  // com.google.android.gms.drive.DriveResource
    public PendingResult listParents(GoogleApiClient apiClient) {
        return apiClient.zza(new zzg(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new ListParentsRequest(zzz.this.zzacT), new zza(this));
            }
        });
    }

    @Override  // com.google.android.gms.drive.DriveResource
    public PendingResult removeChangeListener(GoogleApiClient apiClient, ChangeListener listener) {
        return ((zzs)apiClient.zza(Drive.zzNX)).zzb(apiClient, this.zzacT, listener);
    }

    @Override  // com.google.android.gms.drive.DriveResource
    public PendingResult removeChangeSubscription(GoogleApiClient apiClient) {
        return ((zzs)apiClient.zza(Drive.zzNX)).zzb(apiClient, this.zzacT);
    }

    @Override  // com.google.android.gms.drive.DriveResource
    public PendingResult setParents(GoogleApiClient apiClient, Set set0) {
        if(set0 == null) {
            throw new IllegalArgumentException("ParentIds must be provided.");
        }
        if(set0.isEmpty()) {
            throw new IllegalArgumentException("ParentIds must contain at least one parent.");
        }
        return apiClient.zzb(new com.google.android.gms.drive.internal.zzr.zza(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new SetResourceParentsRequest(zzz.this.zzacT, new ArrayList(set0)), new zzbq(this));
            }
        });
    }

    @Override  // com.google.android.gms.drive.DriveResource
    public PendingResult trash(GoogleApiClient apiClient) {
        return apiClient.zzb(new com.google.android.gms.drive.internal.zzr.zza(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new TrashResourceRequest(zzz.this.zzacT), new zzbq(this));
            }
        });
    }

    @Override  // com.google.android.gms.drive.DriveResource
    public PendingResult untrash(GoogleApiClient apiClient) {
        return apiClient.zzb(new com.google.android.gms.drive.internal.zzr.zza(apiClient) {
            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new UntrashResourceRequest(zzz.this.zzacT), new zzbq(this));
            }
        });
    }

    @Override  // com.google.android.gms.drive.DriveResource
    public PendingResult updateMetadata(GoogleApiClient apiClient, MetadataChangeSet changeSet) {
        if(changeSet == null) {
            throw new IllegalArgumentException("ChangeSet must be provided.");
        }
        return apiClient.zzb(new com.google.android.gms.drive.internal.zzz.zzd(apiClient, changeSet) {
            final MetadataChangeSet zzafm;
            final zzz zzafy;

            {
                zzz.this = zzz0;
                this.zzafm = metadataChangeSet0;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zzs)api$Client0));
            }

            protected void zza(zzs zzs0) throws RemoteException {
                Context context0 = zzs0.getContext();
                this.zzafm.zzpm().setContext(context0);
                zzs0.zzpB().zza(new UpdateMetadataRequest(zzz.this.zzacT, this.zzafm.zzpm()), new com.google.android.gms.drive.internal.zzz.zzb(this));
            }
        });
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, boolean z) {
        return googleApiClient0.zza(new com.google.android.gms.drive.internal.zzz.zzd(googleApiClient0, z) {
            final boolean zzafx;
            final zzz zzafy;

            {
                zzz.this = zzz0;
                this.zzafx = z;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zzs)api$Client0));
            }

            protected void zza(zzs zzs0) throws RemoteException {
                zzs0.zzpB().zza(new GetMetadataRequest(zzz.this.zzacT, this.zzafx), new com.google.android.gms.drive.internal.zzz.zzb(this));
            }
        });
    }
}

