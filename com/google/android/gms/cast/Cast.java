package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzb;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzh;
import com.google.android.gms.cast.internal.zzk;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import java.io.IOException;

public final class Cast {
    public interface ApplicationConnectionResult extends Result {
        ApplicationMetadata getApplicationMetadata();

        String getApplicationStatus();

        String getSessionId();

        boolean getWasLaunched();
    }

    public interface CastApi {
        public static final class zza implements CastApi {
            @Override  // com.google.android.gms.cast.Cast$CastApi
            public int getActiveInputState(GoogleApiClient client) throws IllegalStateException {
                return ((zze)client.zza(zzk.zzNX)).zzlP();
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public ApplicationMetadata getApplicationMetadata(GoogleApiClient client) throws IllegalStateException {
                return ((zze)client.zza(zzk.zzNX)).getApplicationMetadata();
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public String getApplicationStatus(GoogleApiClient client) throws IllegalStateException {
                return ((zze)client.zza(zzk.zzNX)).getApplicationStatus();
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public int getStandbyState(GoogleApiClient client) throws IllegalStateException {
                return ((zze)client.zza(zzk.zzNX)).zzlQ();
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public double getVolume(GoogleApiClient client) throws IllegalStateException {
                return ((zze)client.zza(zzk.zzNX)).zzlO();
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public boolean isMute(GoogleApiClient client) throws IllegalStateException {
                return ((zze)client.zza(zzk.zzNX)).isMute();
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public PendingResult joinApplication(GoogleApiClient client) {
                return client.zzb(new com.google.android.gms.cast.Cast.zza(client) {
                    protected void zza(zze zze0) throws RemoteException {
                        try {
                            zze0.zzb(null, null, this);
                        }
                        catch(IllegalStateException unused_ex) {
                            this.zzaL(2001);
                        }
                    }
                });
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public PendingResult joinApplication(GoogleApiClient client, String applicationId) {
                return client.zzb(new com.google.android.gms.cast.Cast.zza(client) {
                    protected void zza(zze zze0) throws RemoteException {
                        try {
                            zze0.zzb(applicationId, null, this);
                        }
                        catch(IllegalStateException unused_ex) {
                            this.zzaL(2001);
                        }
                    }
                });
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public PendingResult joinApplication(GoogleApiClient client, String applicationId, String sessionId) {
                return client.zzb(new com.google.android.gms.cast.Cast.zza(client) {
                    protected void zza(zze zze0) throws RemoteException {
                        try {
                            zze0.zzb(applicationId, sessionId, this);
                        }
                        catch(IllegalStateException unused_ex) {
                            this.zzaL(2001);
                        }
                    }
                });
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public PendingResult launchApplication(GoogleApiClient client, String applicationId) {
                return client.zzb(new com.google.android.gms.cast.Cast.zza(client) {
                    protected void zza(zze zze0) throws RemoteException {
                        try {
                            zze0.zza(applicationId, false, this);
                        }
                        catch(IllegalStateException unused_ex) {
                            this.zzaL(2001);
                        }
                    }
                });
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public PendingResult launchApplication(GoogleApiClient client, String applicationId, LaunchOptions options) {
                return client.zzb(new com.google.android.gms.cast.Cast.zza(client) {
                    protected void zza(zze zze0) throws RemoteException {
                        try {
                            zze0.zza(applicationId, options, this);
                        }
                        catch(IllegalStateException unused_ex) {
                            this.zzaL(2001);
                        }
                    }
                });
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            @Deprecated
            public PendingResult launchApplication(GoogleApiClient client, String applicationId, boolean relaunchIfRunning) {
                return this.launchApplication(client, applicationId, new Builder().setRelaunchIfRunning(relaunchIfRunning).build());
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public PendingResult leaveApplication(GoogleApiClient client) {
                return client.zzb(new zzh(client) {
                    protected void zza(zze zze0) throws RemoteException {
                        try {
                            zze0.zzd(this);
                        }
                        catch(IllegalStateException unused_ex) {
                            this.zzaL(2001);
                        }
                    }
                });
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public void removeMessageReceivedCallbacks(GoogleApiClient client, String namespace) throws IOException, IllegalArgumentException {
                try {
                    ((zze)client.zza(zzk.zzNX)).zzbC(namespace);
                }
                catch(RemoteException unused_ex) {
                    throw new IOException("service error");
                }
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public void requestStatus(GoogleApiClient client) throws IOException, IllegalStateException {
                try {
                    ((zze)client.zza(zzk.zzNX)).zzlN();
                }
                catch(RemoteException unused_ex) {
                    throw new IOException("service error");
                }
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public PendingResult sendMessage(GoogleApiClient client, String namespace, String message) {
                return client.zzb(new zzh(client) {
                    protected void zza(zze zze0) throws RemoteException {
                        try {
                            zze0.zza(namespace, message, this);
                        }
                        catch(IllegalArgumentException | IllegalStateException unused_ex) {
                            this.zzaL(2001);
                        }
                    }
                });
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public void setMessageReceivedCallbacks(GoogleApiClient client, String namespace, MessageReceivedCallback callbacks) throws IOException, IllegalStateException {
                try {
                    ((zze)client.zza(zzk.zzNX)).zza(namespace, callbacks);
                }
                catch(RemoteException unused_ex) {
                    throw new IOException("service error");
                }
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public void setMute(GoogleApiClient client, boolean mute) throws IOException, IllegalStateException {
                try {
                    ((zze)client.zza(zzk.zzNX)).zzR(mute);
                }
                catch(RemoteException unused_ex) {
                    throw new IOException("service error");
                }
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public void setVolume(GoogleApiClient client, double volume) throws IOException, IllegalArgumentException, IllegalStateException {
                try {
                    ((zze)client.zza(zzk.zzNX)).zzd(volume);
                }
                catch(RemoteException unused_ex) {
                    throw new IOException("service error");
                }
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public PendingResult stopApplication(GoogleApiClient client) {
                return client.zzb(new zzh(client) {
                    protected void zza(zze zze0) throws RemoteException {
                        try {
                            zze0.zza("", this);
                        }
                        catch(IllegalStateException unused_ex) {
                            this.zzaL(2001);
                        }
                    }
                });
            }

            @Override  // com.google.android.gms.cast.Cast$CastApi
            public PendingResult stopApplication(GoogleApiClient client, String sessionId) {
                return client.zzb(new zzh(client) {
                    protected void zza(zze zze0) throws RemoteException {
                        if(TextUtils.isEmpty(sessionId)) {
                            this.zzd(2001, "IllegalArgument: sessionId cannot be null or empty");
                            return;
                        }
                        try {
                            zze0.zza(sessionId, this);
                        }
                        catch(IllegalStateException unused_ex) {
                            this.zzaL(2001);
                        }
                    }
                });
            }
        }

        int getActiveInputState(GoogleApiClient arg1) throws IllegalStateException;

        ApplicationMetadata getApplicationMetadata(GoogleApiClient arg1) throws IllegalStateException;

        String getApplicationStatus(GoogleApiClient arg1) throws IllegalStateException;

        int getStandbyState(GoogleApiClient arg1) throws IllegalStateException;

        double getVolume(GoogleApiClient arg1) throws IllegalStateException;

        boolean isMute(GoogleApiClient arg1) throws IllegalStateException;

        PendingResult joinApplication(GoogleApiClient arg1);

        PendingResult joinApplication(GoogleApiClient arg1, String arg2);

        PendingResult joinApplication(GoogleApiClient arg1, String arg2, String arg3);

        PendingResult launchApplication(GoogleApiClient arg1, String arg2);

        PendingResult launchApplication(GoogleApiClient arg1, String arg2, LaunchOptions arg3);

        @Deprecated
        PendingResult launchApplication(GoogleApiClient arg1, String arg2, boolean arg3);

        PendingResult leaveApplication(GoogleApiClient arg1);

        void removeMessageReceivedCallbacks(GoogleApiClient arg1, String arg2) throws IOException, IllegalArgumentException;

        void requestStatus(GoogleApiClient arg1) throws IOException, IllegalStateException;

        PendingResult sendMessage(GoogleApiClient arg1, String arg2, String arg3);

        void setMessageReceivedCallbacks(GoogleApiClient arg1, String arg2, MessageReceivedCallback arg3) throws IOException, IllegalStateException;

        void setMute(GoogleApiClient arg1, boolean arg2) throws IOException, IllegalStateException;

        void setVolume(GoogleApiClient arg1, double arg2) throws IOException, IllegalArgumentException, IllegalStateException;

        PendingResult stopApplication(GoogleApiClient arg1);

        PendingResult stopApplication(GoogleApiClient arg1, String arg2);
    }

    public static final class CastOptions implements HasOptions {
        public static final class com.google.android.gms.cast.Cast.CastOptions.Builder {
            CastDevice zzQH;
            Listener zzQI;
            private int zzQJ;

            public com.google.android.gms.cast.Cast.CastOptions.Builder(CastDevice castDevice, Listener castListener) {
                zzu.zzb(castDevice, "CastDevice parameter cannot be null");
                zzu.zzb(castListener, "CastListener parameter cannot be null");
                this.zzQH = castDevice;
                this.zzQI = castListener;
                this.zzQJ = 0;
            }

            public CastOptions build() {
                return new CastOptions(this, null);
            }

            public com.google.android.gms.cast.Cast.CastOptions.Builder setVerboseLoggingEnabled(boolean enabled) {
                if(enabled) {
                    this.zzQJ |= 1;
                    return this;
                }
                this.zzQJ &= -2;
                return this;
            }
        }

        final CastDevice zzQE;
        final Listener zzQF;
        private final int zzQG;

        private CastOptions(com.google.android.gms.cast.Cast.CastOptions.Builder builder) {
            this.zzQE = builder.zzQH;
            this.zzQF = builder.zzQI;
            this.zzQG = builder.zzQJ;
        }

        CastOptions(com.google.android.gms.cast.Cast.CastOptions.Builder x0, com.google.android.gms.cast.Cast.1 x1) {
            this(x0);
        }

        @Deprecated
        public static com.google.android.gms.cast.Cast.CastOptions.Builder builder(CastDevice castDevice, Listener castListener) {
            return new com.google.android.gms.cast.Cast.CastOptions.Builder(castDevice, castListener);
        }
    }

    public static class Listener {
        public void onActiveInputStateChanged(int activeInputState) {
        }

        public void onApplicationDisconnected(int statusCode) {
        }

        public void onApplicationMetadataChanged(ApplicationMetadata applicationMetadata) {
        }

        public void onApplicationStatusChanged() {
        }

        public void onStandbyStateChanged(int standbyState) {
        }

        public void onVolumeChanged() {
        }
    }

    public interface MessageReceivedCallback {
        void onMessageReceived(CastDevice arg1, String arg2, String arg3);
    }

    static abstract class com.google.android.gms.cast.Cast.zza extends zzb {
        public com.google.android.gms.cast.Cast.zza(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return this.zzl(x0);
        }

        public ApplicationConnectionResult zzl(Status status0) {
            return new ApplicationConnectionResult() {
                @Override  // com.google.android.gms.cast.Cast$ApplicationConnectionResult
                public ApplicationMetadata getApplicationMetadata() {
                    return null;
                }

                @Override  // com.google.android.gms.cast.Cast$ApplicationConnectionResult
                public String getApplicationStatus() {
                    return null;
                }

                @Override  // com.google.android.gms.cast.Cast$ApplicationConnectionResult
                public String getSessionId() {
                    return null;
                }

                @Override  // com.google.android.gms.common.api.Result
                public Status getStatus() {
                    return status0;
                }

                @Override  // com.google.android.gms.cast.Cast$ApplicationConnectionResult
                public boolean getWasLaunched() {
                    return false;
                }
            };
        }
    }

    public static final int ACTIVE_INPUT_STATE_NO = 0;
    public static final int ACTIVE_INPUT_STATE_UNKNOWN = -1;
    public static final int ACTIVE_INPUT_STATE_YES = 1;
    public static final Api API = null;
    public static final CastApi CastApi = null;
    public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
    public static final int MAX_MESSAGE_LENGTH = 0x10000;
    public static final int MAX_NAMESPACE_LENGTH = 0x80;
    public static final int STANDBY_STATE_NO = 0;
    public static final int STANDBY_STATE_UNKNOWN = -1;
    public static final int STANDBY_STATE_YES = 1;
    private static final com.google.android.gms.common.api.Api.zza zzNY;

    static {
        Cast.zzNY = new com.google.android.gms.common.api.Api.zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zze zza(Context context0, Looper looper0, com.google.android.gms.common.internal.zze zze0, CastOptions cast$CastOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                zzu.zzb(cast$CastOptions0, "Setting the API options is required.");
                long v = (long)cast$CastOptions0.zzQG;
                return new zze(context0, looper0, cast$CastOptions0.zzQE, v, cast$CastOptions0.zzQF, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
            }
        };
        Cast.API = new Api("Cast.API", Cast.zzNY, zzk.zzNX, new Scope[0]);
        Cast.CastApi = new zza();
    }
}

