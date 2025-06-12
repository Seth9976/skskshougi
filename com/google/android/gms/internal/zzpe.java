package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.zze;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

public final class zzpe implements People {
    static abstract class zza extends com.google.android.gms.plus.Plus.zza {
        private zza(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        zza(GoogleApiClient googleApiClient0, com.google.android.gms.internal.zzpe.1 zzpe$10) {
            this(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzaQ(x0);
        }

        public LoadPeopleResult zzaQ(Status status0) {
            return new LoadPeopleResult() {
                @Override  // com.google.android.gms.plus.People$LoadPeopleResult
                public String getNextPageToken() {
                    return null;
                }

                @Override  // com.google.android.gms.plus.People$LoadPeopleResult
                public PersonBuffer getPersonBuffer() {
                    return null;
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

    @Override  // com.google.android.gms.plus.People
    public Person getCurrentPerson(GoogleApiClient googleApiClient) {
        return Plus.zzf(googleApiClient, true).zzxu();
    }

    @Override  // com.google.android.gms.plus.People
    public PendingResult load(GoogleApiClient googleApiClient, Collection collection0) {
        return googleApiClient.zza(new zza(googleApiClient, collection0) {
            final zzpe zzaHL;
            final Collection zzaHM;

            {
                zzpe.this = zzpe0;
                this.zzaHM = collection0;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zze)api$Client0));
            }

            protected void zza(zze zze0) {
                zze0.zza(this, this.zzaHM);
            }
        });
    }

    @Override  // com.google.android.gms.plus.People
    public PendingResult load(GoogleApiClient googleApiClient, String[] personIds) {
        return googleApiClient.zza(new zza(googleApiClient, personIds) {
            final zzpe zzaHL;
            final String[] zzaHN;

            {
                zzpe.this = zzpe0;
                this.zzaHN = arr_s;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zze)api$Client0));
            }

            protected void zza(zze zze0) {
                zze0.zzd(this, this.zzaHN);
            }
        });
    }

    @Override  // com.google.android.gms.plus.People
    public PendingResult loadConnected(GoogleApiClient googleApiClient) {
        return googleApiClient.zza(new zza(googleApiClient) {
            final zzpe zzaHL;

            {
                zzpe.this = zzpe0;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zze)api$Client0));
            }

            protected void zza(zze zze0) {
                zze0.zzj(this);
            }
        });
    }

    @Override  // com.google.android.gms.plus.People
    public PendingResult loadVisible(GoogleApiClient googleApiClient, int orderBy, String pageToken) {
        return googleApiClient.zza(new zza(googleApiClient, orderBy, pageToken) {
            final String zzaHD;
            final int zzaHK;
            final zzpe zzaHL;

            {
                zzpe.this = zzpe0;
                this.zzaHK = v;
                this.zzaHD = s;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zze)api$Client0));
            }

            protected void zza(zze zze0) {
                this.setCancelToken(zze0.zza(this, this.zzaHK, this.zzaHD));
            }
        });
    }

    @Override  // com.google.android.gms.plus.People
    public PendingResult loadVisible(GoogleApiClient googleApiClient, String pageToken) {
        return googleApiClient.zza(new zza(googleApiClient, pageToken) {
            final String zzaHD;
            final zzpe zzaHL;

            {
                zzpe.this = zzpe0;
                this.zzaHD = s;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zze)api$Client0));
            }

            protected void zza(zze zze0) {
                this.setCancelToken(zze0.zzq(this, this.zzaHD));
            }
        });
    }
}

