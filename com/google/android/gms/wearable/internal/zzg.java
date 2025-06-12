package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.AddLocalCapabilityResult;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult;
import com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult;
import com.google.android.gms.wearable.CapabilityApi.RemoveLocalCapabilityResult;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Map;
import java.util.Set;

public class zzg implements CapabilityApi {
    static final class zza extends zzf {
        private CapabilityListener zzaTC;
        private String zzaTD;

        private zza(GoogleApiClient googleApiClient0, CapabilityListener capabilityApi$CapabilityListener0, String s) {
            super(googleApiClient0);
            this.zzaTC = capabilityApi$CapabilityListener0;
            this.zzaTD = s;
        }

        zza(GoogleApiClient googleApiClient0, CapabilityListener capabilityApi$CapabilityListener0, String s, com.google.android.gms.wearable.internal.zzg.1 zzg$10) {
            this(googleApiClient0, capabilityApi$CapabilityListener0, s);
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
            zzbk0.zza(this, this.zzaTC, this.zzaTD);
            this.zzaTC = null;
            this.zzaTD = null;
        }

        public Status zzb(Status status0) {
            this.zzaTC = null;
            this.zzaTD = null;
            return status0;
        }
    }

    public static class zzb implements AddLocalCapabilityResult, RemoveLocalCapabilityResult {
        private final Status zzOt;

        public zzb(Status status0) {
            this.zzOt = status0;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    public static class zzc implements CapabilityInfo {
        private final String mName;
        private final Set zzaTE;

        public zzc(CapabilityInfo capabilityInfo0) {
            this(capabilityInfo0.getName(), capabilityInfo0.getNodes());
        }

        public zzc(String s, Set set0) {
            this.mName = s;
            this.zzaTE = set0;
        }

        @Override  // com.google.android.gms.wearable.CapabilityInfo
        public String getName() {
            return this.mName;
        }

        @Override  // com.google.android.gms.wearable.CapabilityInfo
        public Set getNodes() {
            return this.zzaTE;
        }
    }

    public static class zzd implements GetAllCapabilitiesResult {
        private final Status zzOt;
        private final Map zzaTF;

        public zzd(Status status0, Map map0) {
            this.zzOt = status0;
            this.zzaTF = map0;
        }

        @Override  // com.google.android.gms.wearable.CapabilityApi$GetAllCapabilitiesResult
        public Map getAllCapabilities() {
            return this.zzaTF;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    public static class zze implements GetCapabilityResult {
        private final Status zzOt;
        private final CapabilityInfo zzaTG;

        public zze(Status status0, CapabilityInfo capabilityInfo0) {
            this.zzOt = status0;
            this.zzaTG = capabilityInfo0;
        }

        @Override  // com.google.android.gms.wearable.CapabilityApi$GetCapabilityResult
        public CapabilityInfo getCapability() {
            return this.zzaTG;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    static final class com.google.android.gms.wearable.internal.zzg.zzf extends zzf {
        private CapabilityListener zzaTC;
        private String zzaTD;

        private com.google.android.gms.wearable.internal.zzg.zzf(GoogleApiClient googleApiClient0, CapabilityListener capabilityApi$CapabilityListener0, String s) {
            super(googleApiClient0);
            this.zzaTC = capabilityApi$CapabilityListener0;
            this.zzaTD = s;
        }

        com.google.android.gms.wearable.internal.zzg.zzf(GoogleApiClient googleApiClient0, CapabilityListener capabilityApi$CapabilityListener0, String s, com.google.android.gms.wearable.internal.zzg.1 zzg$10) {
            this(googleApiClient0, capabilityApi$CapabilityListener0, s);
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
            zzbk0.zzb(this, this.zzaTC, this.zzaTD);
            this.zzaTC = null;
            this.zzaTD = null;
        }

        public Status zzb(Status status0) {
            this.zzaTC = null;
            this.zzaTD = null;
            return status0;
        }
    }

    @Override  // com.google.android.gms.wearable.CapabilityApi
    public PendingResult addCapabilityListener(GoogleApiClient client, CapabilityListener listener, String capability) {
        return client.zza(new zza(client, listener, capability, null));
    }

    @Override  // com.google.android.gms.wearable.CapabilityApi
    public PendingResult addLocalCapability(GoogleApiClient client, String capability) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zzr(this, capability);
            }

            protected AddLocalCapabilityResult zzaY(Status status0) {
                return new zzb(status0);
            }
        });
    }

    @Override  // com.google.android.gms.wearable.CapabilityApi
    public PendingResult getAllCapabilities(GoogleApiClient client, int filter) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zzd(this, filter);
            }

            protected GetAllCapabilitiesResult zzaX(Status status0) {
                return new zzd(status0, null);
            }
        });
    }

    @Override  // com.google.android.gms.wearable.CapabilityApi
    public PendingResult getCapability(GoogleApiClient client, String capability, int filter) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zzg(this, capability, filter);
            }

            protected GetCapabilityResult zzaW(Status status0) {
                return new zze(status0, null);
            }
        });
    }

    @Override  // com.google.android.gms.wearable.CapabilityApi
    public PendingResult removeCapabilityListener(GoogleApiClient client, CapabilityListener listener, String capability) {
        return client.zza(new com.google.android.gms.wearable.internal.zzg.zzf(client, listener, capability, null));
    }

    @Override  // com.google.android.gms.wearable.CapabilityApi
    public PendingResult removeLocalCapability(GoogleApiClient client, String capability) {
        return client.zza(new zzf(client) {
            protected void zza(zzbk zzbk0) throws RemoteException {
                zzbk0.zzs(this, capability);
            }

            protected RemoveLocalCapabilityResult zzaZ(Status status0) {
                return new zzb(status0);
            }
        });
    }
}

