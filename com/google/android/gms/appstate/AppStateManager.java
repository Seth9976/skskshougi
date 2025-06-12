package com.google.android.gms.appstate;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzjb;

@Deprecated
public final class AppStateManager {
    public interface StateConflictResult extends Releasable, Result {
        byte[] getLocalData();

        String getResolvedVersion();

        byte[] getServerData();

        int getStateKey();
    }

    public interface StateDeletedResult extends Result {
        int getStateKey();
    }

    public interface StateListResult extends Result {
        AppStateBuffer getStateBuffer();
    }

    public interface StateLoadedResult extends Releasable, Result {
        byte[] getLocalData();

        int getStateKey();
    }

    public interface StateResult extends Releasable, Result {
        StateConflictResult getConflictResult();

        StateLoadedResult getLoadedResult();
    }

    public static abstract class zza extends com.google.android.gms.common.api.zza.zza {
        public zza(GoogleApiClient googleApiClient0) {
            super(AppStateManager.zzNX, googleApiClient0);
        }
    }

    static abstract class zzb extends zza {
        zzb(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }
    }

    static abstract class zzc extends zza {
        public zzc(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzg(x0);
        }

        public StateListResult zzg(Status status0) {
            return new StateListResult() {
                @Override  // com.google.android.gms.appstate.AppStateManager$StateListResult
                public AppStateBuffer getStateBuffer() {
                    return new AppStateBuffer(null);
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }
            };
        }
    }

    static abstract class zzd extends zza {
        public zzd(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return x0;
        }

        public Status zzb(Status status0) [...] // Inlined contents
    }

    static abstract class zze extends zza {
        public zze(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzh(x0);
        }

        public StateResult zzh(Status status0) {
            return AppStateManager.zzd(status0);
        }
    }

    public static final Api API;
    public static final Scope SCOPE_APP_STATE;
    static final ClientKey zzNX;
    private static final com.google.android.gms.common.api.Api.zza zzNY;

    static {
        AppStateManager.zzNX = new ClientKey();
        AppStateManager.zzNY = new com.google.android.gms.common.api.Api.zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zzjb zzc(Context context0, Looper looper0, com.google.android.gms.common.internal.zze zze0, NoOptions api$ApiOptions$NoOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                return new zzjb(context0, looper0, zze0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
            }
        };
        AppStateManager.SCOPE_APP_STATE = new Scope("https://www.googleapis.com/auth/appstate");
        AppStateManager.API = new Api("AppStateManager.API", AppStateManager.zzNY, AppStateManager.zzNX, new Scope[]{AppStateManager.SCOPE_APP_STATE});
    }

    public static PendingResult delete(GoogleApiClient googleApiClient, int stateKey) {
        return googleApiClient.zzb(new zzb(googleApiClient) {
            protected void zza(zzjb zzjb0) throws RemoteException {
                zzjb0.zza(this, stateKey);
            }

            public StateDeletedResult zzf(Status status0) {
                return new StateDeletedResult() {
                    @Override  // com.google.android.gms.appstate.AppStateManager$StateDeletedResult
                    public int getStateKey() {
                        return com.google.android.gms.appstate.AppStateManager.5.this.zzOm;
                    }

                    @Override  // com.google.android.gms.common.api.Result
                    public Status getStatus() {
                        return status0;
                    }
                };
            }
        });
    }

    public static int getMaxNumKeys(GoogleApiClient googleApiClient) {
        return AppStateManager.zza(googleApiClient).zzkW();
    }

    public static int getMaxStateSize(GoogleApiClient googleApiClient) {
        return AppStateManager.zza(googleApiClient).zzkV();
    }

    public static PendingResult list(GoogleApiClient googleApiClient) {
        return googleApiClient.zza(new zzc(googleApiClient) {
            protected void zza(zzjb zzjb0) throws RemoteException {
                zzjb0.zza(this);
            }
        });
    }

    public static PendingResult load(GoogleApiClient googleApiClient, int stateKey) {
        return googleApiClient.zza(new zze(googleApiClient) {
            protected void zza(zzjb zzjb0) throws RemoteException {
                zzjb0.zzb(this, stateKey);
            }
        });
    }

    public static PendingResult resolve(GoogleApiClient googleApiClient, int stateKey, String resolvedVersion, byte[] resolvedData) {
        return googleApiClient.zzb(new zze(googleApiClient) {
            protected void zza(zzjb zzjb0) throws RemoteException {
                zzjb0.zza(this, stateKey, resolvedVersion, resolvedData);
            }
        });
    }

    public static PendingResult signOut(GoogleApiClient googleApiClient) {
        return googleApiClient.zzb(new zzd(googleApiClient) {
            protected void zza(zzjb zzjb0) throws RemoteException {
                zzjb0.zzb(this);
            }
        });
    }

    public static void update(GoogleApiClient googleApiClient, int stateKey, byte[] data) {
        googleApiClient.zzb(new zze(googleApiClient) {
            protected void zza(zzjb zzjb0) throws RemoteException {
                zzjb0.zza(null, stateKey, data);
            }
        });
    }

    public static PendingResult updateImmediate(GoogleApiClient googleApiClient, int stateKey, byte[] data) {
        return googleApiClient.zzb(new zze(googleApiClient) {
            protected void zza(zzjb zzjb0) throws RemoteException {
                zzjb0.zza(this, stateKey, data);
            }
        });
    }

    public static zzjb zza(GoogleApiClient googleApiClient0) {
        zzu.zzb(googleApiClient0 != null, "GoogleApiClient parameter is required.");
        zzu.zza(googleApiClient0.isConnected(), "GoogleApiClient must be connected.");
        zzu.zza(googleApiClient0.zza(AppStateManager.API), "GoogleApiClient is not configured to use the AppState API. Pass AppStateManager.API into GoogleApiClient.Builder#addApi() to use this feature.");
        return (zzjb)googleApiClient0.zza(AppStateManager.zzNX);
    }

    private static StateResult zzd(Status status0) {
        return new StateResult() {
            @Override  // com.google.android.gms.appstate.AppStateManager$StateResult
            public StateConflictResult getConflictResult() {
                return null;
            }

            @Override  // com.google.android.gms.appstate.AppStateManager$StateResult
            public StateLoadedResult getLoadedResult() {
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

