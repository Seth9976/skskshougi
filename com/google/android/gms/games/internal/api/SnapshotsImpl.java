package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots;

public final class SnapshotsImpl implements Snapshots {
    static abstract class CommitImpl extends BaseGamesApiMethodImpl {
        private CommitImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        CommitImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.SnapshotsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzau(x0);
        }

        public CommitSnapshotResult zzau(Status status0) {
            return new CommitSnapshotResult() {
                @Override  // com.google.android.gms.games.snapshot.Snapshots$CommitSnapshotResult
                public SnapshotMetadata getSnapshotMetadata() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class DeleteImpl extends BaseGamesApiMethodImpl {
        private DeleteImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        DeleteImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.SnapshotsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzav(x0);
        }

        public DeleteSnapshotResult zzav(Status status0) {
            return new DeleteSnapshotResult() {
                @Override  // com.google.android.gms.games.snapshot.Snapshots$DeleteSnapshotResult
                public String getSnapshotId() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class LoadImpl extends BaseGamesApiMethodImpl {
        private LoadImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        LoadImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.SnapshotsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzaw(x0);
        }

        public LoadSnapshotsResult zzaw(Status status0) {
            return new LoadSnapshotsResult() {
                @Override  // com.google.android.gms.games.snapshot.Snapshots$LoadSnapshotsResult
                public SnapshotMetadataBuffer getSnapshots() {
                    return new SnapshotMetadataBuffer(DataHolder.zzbi(14));
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }

                @Override  // com.google.android.gms.common.api.Releasable
                public void release() {
                }
            };
        }
    }

    static abstract class OpenImpl extends BaseGamesApiMethodImpl {
        private OpenImpl(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        OpenImpl(GoogleApiClient x0, com.google.android.gms.games.internal.api.SnapshotsImpl.1 x1) {
            this(x0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzax(x0);
        }

        public OpenSnapshotResult zzax(Status status0) {
            return new OpenSnapshotResult() {
                @Override  // com.google.android.gms.games.snapshot.Snapshots$OpenSnapshotResult
                public String getConflictId() {
                    return null;
                }

                @Override  // com.google.android.gms.games.snapshot.Snapshots$OpenSnapshotResult
                public Snapshot getConflictingSnapshot() {
                    return null;
                }

                @Override  // com.google.android.gms.games.snapshot.Snapshots$OpenSnapshotResult
                public SnapshotContents getResolutionSnapshotContents() {
                    return null;
                }

                @Override  // com.google.android.gms.games.snapshot.Snapshots$OpenSnapshotResult
                public Snapshot getSnapshot() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult commitAndClose(GoogleApiClient apiClient, Snapshot snapshot, SnapshotMetadataChange metadataChange) {
        return apiClient.zzb(new CommitImpl(apiClient, snapshot, metadataChange) {
            final SnapshotsImpl zzasa;
            final Snapshot zzase;
            final SnapshotMetadataChange zzasf;

            {
                SnapshotsImpl.this = snapshotsImpl0;
                this.zzase = snapshot0;
                this.zzasf = snapshotMetadataChange0;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzase, this.zzasf);
            }
        });
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult delete(GoogleApiClient apiClient, SnapshotMetadata metadata) {
        return apiClient.zzb(new DeleteImpl(apiClient, metadata) {
            final SnapshotsImpl zzasa;
            final SnapshotMetadata zzasg;

            {
                SnapshotsImpl.this = snapshotsImpl0;
                this.zzasg = snapshotMetadata0;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zzi(this, this.zzasg.getSnapshotId());
            }
        });
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots
    public void discardAndClose(GoogleApiClient apiClient, Snapshot snapshot) {
        Games.zzd(apiClient).zza(snapshot);
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots
    public int getMaxCoverImageSize(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsQ();
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots
    public int getMaxDataSize(GoogleApiClient apiClient) {
        return Games.zzd(apiClient).zzsP();
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots
    public Intent getSelectSnapshotIntent(GoogleApiClient apiClient, String title, boolean allowAddButton, boolean allowDelete, int maxSnapshots) {
        return Games.zzd(apiClient).zza(title, allowAddButton, allowDelete, maxSnapshots);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.snapshot.Snapshots
    public SnapshotMetadata getSnapshotFromBundle(Bundle extras) {
        return extras != null && extras.containsKey("com.google.android.gms.games.SNAPSHOT_METADATA") ? ((SnapshotMetadata)extras.getParcelable("com.google.android.gms.games.SNAPSHOT_METADATA")) : null;
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult load(GoogleApiClient apiClient, boolean forceReload) {
        return apiClient.zza(new LoadImpl(apiClient, forceReload) {
            final boolean zzaqy;
            final SnapshotsImpl zzasa;

            {
                SnapshotsImpl.this = snapshotsImpl0;
                this.zzaqy = z;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zze(this, this.zzaqy);
            }
        });
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult open(GoogleApiClient apiClient, SnapshotMetadata metadata) {
        return this.open(apiClient, metadata.getUniqueName(), false);
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult open(GoogleApiClient apiClient, SnapshotMetadata metadata, int conflictPolicy) {
        return this.open(apiClient, metadata.getUniqueName(), false, conflictPolicy);
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult open(GoogleApiClient apiClient, String fileName, boolean createIfNotFound) {
        return this.open(apiClient, fileName, createIfNotFound, -1);
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult open(GoogleApiClient apiClient, String fileName, boolean createIfNotFound, int conflictPolicy) {
        return apiClient.zzb(new OpenImpl(apiClient, fileName, createIfNotFound, conflictPolicy) {
            final SnapshotsImpl zzasa;
            final String zzasb;
            final boolean zzasc;
            final int zzasd;

            {
                SnapshotsImpl.this = snapshotsImpl0;
                this.zzasb = s;
                this.zzasc = z;
                this.zzasd = v;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzasb, this.zzasc, this.zzasd);
            }
        });
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult resolveConflict(GoogleApiClient apiClient, String conflictId, Snapshot snapshot) {
        SnapshotMetadata snapshotMetadata0 = snapshot.getMetadata();
        SnapshotMetadataChange snapshotMetadataChange0 = new Builder().fromMetadata(snapshotMetadata0).build();
        return this.resolveConflict(apiClient, conflictId, snapshotMetadata0.getSnapshotId(), snapshotMetadataChange0, snapshot.getSnapshotContents());
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshots
    public PendingResult resolveConflict(GoogleApiClient apiClient, String conflictId, String snapshotId, SnapshotMetadataChange metadataChange, SnapshotContents snapshotContents) {
        return apiClient.zzb(new OpenImpl(apiClient, conflictId, snapshotId, metadataChange, snapshotContents) {
            final SnapshotsImpl zzasa;
            final SnapshotMetadataChange zzasf;
            final String zzash;
            final String zzasi;
            final SnapshotContents zzasj;

            {
                SnapshotsImpl.this = snapshotsImpl0;
                this.zzash = s;
                this.zzasi = s1;
                this.zzasf = snapshotMetadataChange0;
                this.zzasj = snapshotContents0;
                super(x0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((GamesClientImpl)api$Client0));
            }

            protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
                gamesClientImpl0.zza(this, this.zzash, this.zzasi, this.zzasf, this.zzasj);
            }
        });
    }

    class com.google.android.gms.games.internal.api.SnapshotsImpl.6 extends LoadImpl {
        final String zzTE;
        final String zzaqA;
        final boolean zzaqy;

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((GamesClientImpl)api$Client0));
        }

        protected void zza(GamesClientImpl gamesClientImpl0) throws RemoteException {
            gamesClientImpl0.zzc(this, this.zzTE, this.zzaqA, this.zzaqy);
        }
    }

}

