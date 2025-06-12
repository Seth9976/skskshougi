package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.SessionsApi;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;
import java.util.concurrent.TimeUnit;

public class zznf implements SessionsApi {
    static class zza extends com.google.android.gms.internal.zzms.zza {
        private final zzb zzOs;

        private zza(zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        zza(zzb zza$zzb0, com.google.android.gms.internal.zznf.1 zznf$10) {
            this(zza$zzb0);
        }

        @Override  // com.google.android.gms.internal.zzms
        public void zza(SessionReadResult sessionReadResult0) throws RemoteException {
            this.zzOs.zzm(sessionReadResult0);
        }
    }

    static class com.google.android.gms.internal.zznf.zzb extends com.google.android.gms.internal.zzmt.zza {
        private final zzb zzOs;

        private com.google.android.gms.internal.zznf.zzb(zzb zza$zzb0) {
            this.zzOs = zza$zzb0;
        }

        com.google.android.gms.internal.zznf.zzb(zzb zza$zzb0, com.google.android.gms.internal.zznf.1 zznf$10) {
            this(zza$zzb0);
        }

        @Override  // com.google.android.gms.internal.zzmt
        public void zza(SessionStopResult sessionStopResult0) {
            this.zzOs.zzm(sessionStopResult0);
        }
    }

    @Override  // com.google.android.gms.fitness.SessionsApi
    public PendingResult insertSession(GoogleApiClient client, SessionInsertRequest request) {
        return client.zza(new zzc(client) {
            protected void zza(zzmd zzmd0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmo)zzmd0.zznM()).zza(new SessionInsertRequest(request, zzng0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.SessionsApi
    public PendingResult readSession(GoogleApiClient client, SessionReadRequest request) {
        return client.zza(new com.google.android.gms.internal.zzmd.zza(client) {
            protected SessionReadResult zzI(Status status0) {
                return SessionReadResult.zzO(status0);
            }

            protected void zza(zzmd zzmd0) throws RemoteException {
                zza zznf$zza0 = new zza(this, null);
                ((zzmo)zzmd0.zznM()).zza(new SessionReadRequest(request, zznf$zza0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.SessionsApi
    public PendingResult registerForSessions(GoogleApiClient client, PendingIntent intent) {
        return this.zza(client, intent, 0);
    }

    @Override  // com.google.android.gms.fitness.SessionsApi
    public PendingResult startSession(GoogleApiClient client, Session session) {
        zzu.zzb(session, "Session cannot be null");
        zzu.zzb(session.getEndTime(TimeUnit.MILLISECONDS) == 0L, "Cannot start a session which has already ended");
        return client.zzb(new zzc(client) {
            protected void zza(zzmd zzmd0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmo)zzmd0.zznM()).zza(new SessionStartRequest(session, zzng0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    @Override  // com.google.android.gms.fitness.SessionsApi
    public PendingResult stopSession(GoogleApiClient client, String identifier) {
        return this.zza(client, null, identifier);
    }

    @Override  // com.google.android.gms.fitness.SessionsApi
    public PendingResult unregisterForSessions(GoogleApiClient client, PendingIntent intent) {
        return client.zzb(new zzc(client) {
            protected void zza(zzmd zzmd0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmo)zzmd0.zznM()).zza(new SessionUnregistrationRequest(intent, zzng0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, String s, String s1) {
        return googleApiClient0.zzb(new com.google.android.gms.internal.zzmd.zza(googleApiClient0) {
            protected SessionStopResult zzH(Status status0) {
                return SessionStopResult.zzP(status0);
            }

            protected void zza(zzmd zzmd0) throws RemoteException {
                com.google.android.gms.internal.zznf.zzb zznf$zzb0 = new com.google.android.gms.internal.zznf.zzb(this, null);
                ((zzmo)zzmd0.zznM()).zza(new SessionStopRequest(s, s1, zznf$zzb0, "org.dyndns.vivi.SkskShogi"));
            }
        });
    }

    public PendingResult zza(GoogleApiClient googleApiClient0, PendingIntent pendingIntent0, int v) {
        return googleApiClient0.zzb(new zzc(googleApiClient0) {
            protected void zza(zzmd zzmd0) throws RemoteException {
                zzng zzng0 = new zzng(this);
                ((zzmo)zzmd0.zznM()).zza(new SessionRegistrationRequest(pendingIntent0, zzng0, "org.dyndns.vivi.SkskShogi", v));
            }
        });
    }
}

