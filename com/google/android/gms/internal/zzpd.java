package com.google.android.gms.internal;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.Moments;
import com.google.android.gms.plus.internal.zze;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;

public final class zzpd implements Moments {
    static abstract class zza extends com.google.android.gms.plus.Plus.zza {
        private zza(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        zza(GoogleApiClient googleApiClient0, com.google.android.gms.internal.zzpd.1 zzpd$10) {
            this(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzaP(x0);
        }

        public LoadMomentsResult zzaP(Status status0) {
            return new LoadMomentsResult() {
                @Override  // com.google.android.gms.plus.Moments$LoadMomentsResult
                public MomentBuffer getMomentBuffer() {
                    return null;
                }

                @Override  // com.google.android.gms.plus.Moments$LoadMomentsResult
                public String getNextPageToken() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }

                @Override  // com.google.android.gms.plus.Moments$LoadMomentsResult
                public String getUpdated() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Releasable
                public void release() {
                }
            };
        }
    }

    static abstract class zzb extends com.google.android.gms.plus.Plus.zza {
        private zzb(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        zzb(GoogleApiClient googleApiClient0, com.google.android.gms.internal.zzpd.1 zzpd$10) {
            this(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return x0;
        }

        public Status zzb(Status status0) [...] // Inlined contents
    }

    static abstract class zzc extends com.google.android.gms.plus.Plus.zza {
        private zzc(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        zzc(GoogleApiClient googleApiClient0, com.google.android.gms.internal.zzpd.1 zzpd$10) {
            this(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return x0;
        }

        public Status zzb(Status status0) [...] // Inlined contents
    }

    @Override  // com.google.android.gms.plus.Moments
    public PendingResult load(GoogleApiClient googleApiClient) {
        return googleApiClient.zza(new zza(googleApiClient) {
            final zzpd zzaHC;

            {
                zzpd.this = zzpd0;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zze)api$Client0));
            }

            protected void zza(zze zze0) {
                zze0.zzi(this);
            }
        });
    }

    @Override  // com.google.android.gms.plus.Moments
    public PendingResult load(GoogleApiClient googleApiClient, int maxResults, String pageToken, Uri targetUrl, String type, String userId) {
        return googleApiClient.zza(new zza(googleApiClient, maxResults, pageToken, targetUrl, type, userId) {
            final zzpd zzaHC;
            final String zzaHD;
            final Uri zzaHE;
            final String zzaHF;
            final String zzaHG;
            final int zzard;

            {
                zzpd.this = zzpd0;
                this.zzard = v;
                this.zzaHD = s;
                this.zzaHE = uri0;
                this.zzaHF = s1;
                this.zzaHG = s2;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zze)api$Client0));
            }

            protected void zza(zze zze0) {
                zze0.zza(this, this.zzard, this.zzaHD, this.zzaHE, this.zzaHF, this.zzaHG);
            }
        });
    }

    @Override  // com.google.android.gms.plus.Moments
    public PendingResult remove(GoogleApiClient googleApiClient, String momentId) {
        return googleApiClient.zzb(new zzb(googleApiClient, momentId) {
            final zzpd zzaHC;
            final String zzaHI;

            {
                zzpd.this = zzpd0;
                this.zzaHI = s;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zze)api$Client0));
            }

            protected void zza(zze zze0) {
                zze0.zzdX(this.zzaHI);
                this.setResult(Status.zzXP);
            }
        });
    }

    @Override  // com.google.android.gms.plus.Moments
    public PendingResult write(GoogleApiClient googleApiClient, Moment moment) {
        return googleApiClient.zzb(new zzc(googleApiClient, moment) {
            final zzpd zzaHC;
            final Moment zzaHH;

            {
                zzpd.this = zzpd0;
                this.zzaHH = moment0;
                super(googleApiClient0, null);
            }

            @Override  // com.google.android.gms.common.api.zza$zza
            protected void zza(Client api$Client0) throws RemoteException {
                this.zza(((zze)api$Client0));
            }

            protected void zza(zze zze0) {
                zze0.zza(this, this.zzaHH);
            }
        });
    }
}

