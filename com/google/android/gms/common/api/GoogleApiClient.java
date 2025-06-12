package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzpq;
import com.google.android.gms.internal.zzpt;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public interface GoogleApiClient {
    public static final class Builder {
        private final Context mContext;
        private Account zzMY;
        private String zzOd;
        private String zzOe;
        private FragmentActivity zzWA;
        private int zzWB;
        private int zzWC;
        private OnConnectionFailedListener zzWD;
        private zza zzWE;
        private final Set zzWF;
        private final Set zzWG;
        private com.google.android.gms.internal.zzpt.zza zzWH;
        private Looper zzWt;
        private final Set zzWv;
        private int zzWw;
        private View zzWx;
        private final Map zzWy;
        private final Map zzWz;

        public Builder(Context context) {
            this.zzWv = new HashSet();
            this.zzWy = new HashMap();
            this.zzWz = new HashMap();
            this.zzWB = -1;
            this.zzWC = -1;
            this.zzWF = new HashSet();
            this.zzWG = new HashSet();
            this.zzWH = new com.google.android.gms.internal.zzpt.zza();
            this.mContext = context;
            this.zzWt = context.getMainLooper();
            this.zzOe = "org.dyndns.vivi.SkskShogi";
            this.zzOd = context.getClass().getName();
            this.zzWE = zzpq.zzNY;
        }

        public Builder(Context context, ConnectionCallbacks connectedListener, OnConnectionFailedListener connectionFailedListener) {
            this(context);
            zzu.zzb(connectedListener, "Must provide a connected listener");
            this.zzWF.add(connectedListener);
            zzu.zzb(connectionFailedListener, "Must provide a connection failed listener");
            this.zzWG.add(connectionFailedListener);
        }

        public Builder addApi(Api api0) {
            this.zzWz.put(api0, null);
            this.zzWv.addAll(api0.zzmr());
            return this;
        }

        public Builder addApi(Api api0, HasOptions api$ApiOptions$HasOptions0) {
            zzu.zzb(api$ApiOptions$HasOptions0, "Null options are not permitted for this Api");
            this.zzWz.put(api0, api$ApiOptions$HasOptions0);
            this.zzWv.addAll(api0.zzmr());
            return this;
        }

        public Builder addApiIfAvailable(Api api0, HasOptions api$ApiOptions$HasOptions0, Scope[] scopes) {
            zzu.zzb(api$ApiOptions$HasOptions0, "Null options are not permitted for this Api");
            this.zzWz.put(api0, api$ApiOptions$HasOptions0);
            this.zza(api0, 1, scopes);
            return this;
        }

        public Builder addApiIfAvailable(Api api0, Scope[] scopes) {
            this.zzWz.put(api0, null);
            this.zza(api0, 1, scopes);
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks listener) {
            this.zzWF.add(listener);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener listener) {
            this.zzWG.add(listener);
            return this;
        }

        public Builder addScope(Scope scope) {
            this.zzWv.add(scope);
            return this;
        }

        public GoogleApiClient build() {
            zzu.zzb(!this.zzWz.isEmpty(), "must call addApi() to add at least one API");
            if(this.zzWB >= 0) {
                return this.zzmy();
            }
            if(this.zzWC >= 0) {
                return this.zzmz();
            }
            Looper looper0 = this.zzWt;
            zze zze0 = this.zzmx();
            return new zzg(this.mContext, looper0, zze0, this.zzWE, this.zzWz, this.zzWF, this.zzWG, -1, -1);
        }

        public Builder enableAutoManage(FragmentActivity fragmentActivity, int clientId, OnConnectionFailedListener unresolvedConnectionFailedListener) {
            zzu.zzb(clientId >= 0, "clientId must be non-negative");
            this.zzWB = clientId;
            this.zzWA = (FragmentActivity)zzu.zzb(fragmentActivity, "Null activity is not permitted.");
            this.zzWD = unresolvedConnectionFailedListener;
            return this;
        }

        public Builder requestServerAuthCode(String serverClientId, ServerAuthCodeCallbacks callbacks) {
            this.zzWH.zza(serverClientId, callbacks);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.zzMY = accountName == null ? null : new Account(accountName, "com.google");
            return this;
        }

        public Builder setGravityForPopups(int gravityForPopups) {
            this.zzWw = gravityForPopups;
            return this;
        }

        public Builder setHandler(Handler handler) {
            zzu.zzb(handler, "Handler must not be null");
            this.zzWt = handler.getLooper();
            return this;
        }

        public Builder setViewForPopups(View viewForPopups) {
            this.zzWx = viewForPopups;
            return this;
        }

        public Builder useDefaultAccount() {
            return this.setAccountName("<<default account>>");
        }

        private void zza(Api api0, int v, Scope[] arr_scope) {
            boolean z = true;
            if(v != 1) {
                if(v != 2) {
                    throw new IllegalArgumentException("Invalid resolution mode: \'" + v + "\', use a constant from GoogleApiClient.ResolutionMode");
                }
                z = false;
            }
            HashSet hashSet0 = new HashSet(api0.zzmr());
            for(int v1 = 0; v1 < arr_scope.length; ++v1) {
                hashSet0.add(arr_scope[v1]);
            }
            com.google.android.gms.common.internal.zze.zza zze$zza0 = new com.google.android.gms.common.internal.zze.zza(hashSet0, z);
            this.zzWy.put(api0, zze$zza0);
        }

        public zze zzmx() {
            Account account0 = this.zzMY;
            int v = this.zzWw;
            View view0 = this.zzWx;
            String s = this.zzOe;
            String s1 = this.zzOd;
            zzpt zzpt0 = this.zzWH.zzyc();
            return new zze(account0, this.zzWv, this.zzWy, v, view0, s, s1, zzpt0);
        }

        private GoogleApiClient zzmy() {
            zzm zzm0 = zzm.zza(this.zzWA);
            GoogleApiClient googleApiClient0 = new zzg(this.mContext.getApplicationContext(), this.zzWt, this.zzmx(), this.zzWE, this.zzWz, this.zzWF, this.zzWG, this.zzWB, -1);
            zzm0.zza(this.zzWB, googleApiClient0, this.zzWD);
            return googleApiClient0;
        }

        private GoogleApiClient zzmz() {
            zzn zzn0 = zzn.zzb(this.zzWA);
            GoogleApiClient googleApiClient0 = zzn0.zzbc(this.zzWC);
            if(googleApiClient0 == null) {
                googleApiClient0 = new zzg(this.mContext.getApplicationContext(), this.zzWt, this.zzmx(), this.zzWE, this.zzWz, this.zzWF, this.zzWG, -1, this.zzWC);
            }
            zzn0.zza(this.zzWC, googleApiClient0, this.zzWD);
            return googleApiClient0;
        }
    }

    public interface ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(Bundle arg1);

        void onConnectionSuspended(int arg1);
    }

    public interface ConnectionProgressReportCallbacks {
        void onReportAccountValidation(ConnectionResult arg1);

        void onReportServiceBinding(ConnectionResult arg1);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult arg1);
    }

    public interface ServerAuthCodeCallbacks {
        public static class CheckResult {
            private boolean zzWI;
            private Set zzWJ;

            private CheckResult(boolean requiresNewAuthCode, Set set0) {
                this.zzWI = requiresNewAuthCode;
                this.zzWJ = set0;
            }

            public static CheckResult newAuthNotRequiredResult() {
                return new CheckResult(false, null);
            }

            public static CheckResult newAuthRequiredResult(Set set0) {
                zzu.zzb(set0 != null && !set0.isEmpty(), "A non-empty scope set is required if further auth is needed.");
                return new CheckResult(true, set0);
            }

            public boolean zzmA() {
                return this.zzWI;
            }

            public Set zzmB() {
                return this.zzWJ;
            }
        }

        CheckResult onCheckServerAuthorization(String arg1, Set arg2);

        boolean onUploadServerAuthCode(String arg1, String arg2);
    }

    ConnectionResult blockingConnect();

    ConnectionResult blockingConnect(long arg1, TimeUnit arg2);

    PendingResult clearDefaultAccountAndReconnect();

    void connect();

    void disconnect();

    void dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

    ConnectionResult getConnectionResult(Api arg1);

    Context getContext();

    Looper getLooper();

    int getSessionId();

    boolean hasConnectedApi(Api arg1);

    boolean isConnected();

    boolean isConnecting();

    boolean isConnectionCallbacksRegistered(ConnectionCallbacks arg1);

    boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener arg1);

    void reconnect();

    void registerConnectionCallbacks(ConnectionCallbacks arg1);

    void registerConnectionFailedListener(OnConnectionFailedListener arg1);

    void stopAutoManage(FragmentActivity arg1);

    void unregisterConnectionCallbacks(ConnectionCallbacks arg1);

    void unregisterConnectionFailedListener(OnConnectionFailedListener arg1);

    Client zza(ClientKey arg1);

    com.google.android.gms.common.api.zza.zza zza(com.google.android.gms.common.api.zza.zza arg1);

    boolean zza(Api arg1);

    boolean zza(Scope arg1);

    com.google.android.gms.common.api.zza.zza zzb(com.google.android.gms.common.api.zza.zza arg1);

    zzi zzo(Object arg1);
}

