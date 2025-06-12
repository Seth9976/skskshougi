package com.google.android.gms.internal;

import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionResult;
import com.google.android.gms.cast.CastRemoteDisplayApi;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class zzka implements CastRemoteDisplayApi {
    abstract class zza extends com.google.android.gms.internal.zzkc.zza {
        final zzka zzVx;

        private zza() {
        }

        zza(com.google.android.gms.internal.zzka.1 zzka$10) {
        }

        @Override  // com.google.android.gms.internal.zzkc
        public void onDisconnected() throws RemoteException {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.android.gms.internal.zzkc
        public void onError(int statusCode) throws RemoteException {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.android.gms.internal.zzkc
        public void zza(int v, int v1, Surface surface0) throws RemoteException {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.android.gms.internal.zzkc
        public void zzmg() throws RemoteException {
            throw new UnsupportedOperationException();
        }
    }

    abstract class zzb extends com.google.android.gms.common.api.zza.zza {
        public final class com.google.android.gms.internal.zzka.zzb.zza extends zza {
            final zzb zzVA;
            private final zzkb zzVz;

            public com.google.android.gms.internal.zzka.zzb.zza(zzkb zzkb0) {
                super(null);
                this.zzVz = zzkb0;
            }

            @Override  // com.google.android.gms.internal.zzka$zza
            public void onError(int statusCode) throws RemoteException {
                zzka.zzQW.zzb("onError: %d", new Object[]{statusCode});
                zzka.this.zzmf();
                zzc zzka$zzc0 = new zzc(Status.zzXR);
                zzb.this.setResult(zzka$zzc0);
            }

            @Override  // com.google.android.gms.internal.zzka$zza
            public void zza(int v, int v1, Surface surface0) {
                zzka.zzQW.zzb("onConnected", new Object[0]);
                DisplayManager displayManager0 = (DisplayManager)this.zzVz.getContext().getSystemService("display");
                if(displayManager0 == null) {
                    zzka.zzQW.zzc("Unable to get the display manager", new Object[0]);
                    zzc zzka$zzc0 = new zzc(Status.zzXR);
                    zzb.this.setResult(zzka$zzc0);
                    return;
                }
                zzka.this.zzmf();
                VirtualDisplay virtualDisplay0 = displayManager0.createVirtualDisplay("private_display", v, v1, this.zzi(v, v1), surface0, 2);
                zzka.this.zzVv = virtualDisplay0;
                if(zzka.this.zzVv == null) {
                    zzka.zzQW.zzc("Unable to create virtual display", new Object[0]);
                    zzc zzka$zzc1 = new zzc(Status.zzXR);
                    zzb.this.setResult(zzka$zzc1);
                    return;
                }
                if(zzka.this.zzVv.getDisplay() == null) {
                    zzka.zzQW.zzc("Virtual display does not have a display", new Object[0]);
                    zzc zzka$zzc2 = new zzc(Status.zzXR);
                    zzb.this.setResult(zzka$zzc2);
                    return;
                }
                try {
                    int v2 = zzka.this.zzVv.getDisplay().getDisplayId();
                    this.zzVz.zza(this, v2);
                }
                catch(RemoteException unused_ex) {
                    zzc zzka$zzc3 = new zzc(Status.zzXR);
                    zzb.this.setResult(zzka$zzc3);
                }
            }

            private int zzi(int v, int v1) {
                return v >= v1 ? v1 * 320 / 1080 : v * 320 / 1080;
            }

            @Override  // com.google.android.gms.internal.zzka$zza
            public void zzmg() {
                zzka.zzQW.zzb("onConnectedWithDisplay", new Object[0]);
                Display display0 = zzka.this.zzVv.getDisplay();
                if(display0 != null) {
                    zzc zzka$zzc0 = new zzc(display0);
                    zzb.this.setResult(zzka$zzc0);
                    return;
                }
                zzka.zzQW.zzc("Virtual display no longer has a display", new Object[0]);
                zzc zzka$zzc1 = new zzc(Status.zzXR);
                zzb.this.setResult(zzka$zzc1);
            }
        }

        public final class com.google.android.gms.internal.zzka.zzb.zzb extends zza {
            final zzb zzVA;

            protected com.google.android.gms.internal.zzka.zzb.zzb() {
                super(null);
            }

            @Override  // com.google.android.gms.internal.zzka$zza
            public void onDisconnected() throws RemoteException {
                zzka.zzQW.zzb("onDisconnected", new Object[0]);
                zzka.this.zzmf();
                zzc zzka$zzc0 = new zzc(Status.zzXP);
                zzb.this.setResult(zzka$zzc0);
            }

            @Override  // com.google.android.gms.internal.zzka$zza
            public void onError(int statusCode) throws RemoteException {
                zzka.zzQW.zzb("onError: %d", new Object[]{statusCode});
                zzka.this.zzmf();
                zzc zzka$zzc0 = new zzc(Status.zzXR);
                zzb.this.setResult(zzka$zzc0);
            }
        }

        final zzka zzVx;

        public zzb(GoogleApiClient googleApiClient0) {
            super(zzka0.zzVu, googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return this.zzq(x0);
        }

        protected CastRemoteDisplaySessionResult zzq(Status status0) {
            return new zzc(status0);
        }
    }

    static final class zzc implements CastRemoteDisplaySessionResult {
        private final Status zzOt;
        private final Display zzRi;

        public zzc(Display display0) {
            this.zzOt = Status.zzXP;
            this.zzRi = display0;
        }

        public zzc(Status status0) {
            this.zzOt = status0;
            this.zzRi = null;
        }

        @Override  // com.google.android.gms.cast.CastRemoteDisplay$CastRemoteDisplaySessionResult
        public Display getPresentationDisplay() {
            return this.zzRi;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }
    }

    private static final zzl zzQW;
    private ClientKey zzVu;
    private VirtualDisplay zzVv;
    private final zzke zzVw;

    static {
        zzka.zzQW = new zzl("CastRemoteDisplayApiImpl");
    }

    public zzka(ClientKey api$ClientKey0) {
        this.zzVw = new com.google.android.gms.internal.zzke.zza() {
            @Override  // com.google.android.gms.internal.zzke
            public void zzaR(int v) {
                zzka.zzQW.zzb("onRemoteDisplayEnded", new Object[0]);
                zzka.this.zzmf();
            }
        };
        this.zzVu = api$ClientKey0;
    }

    @Override  // com.google.android.gms.cast.CastRemoteDisplayApi
    public PendingResult startRemoteDisplay(GoogleApiClient apiClient, String appId) {
        zzka.zzQW.zzb("startRemoteDisplay", new Object[0]);
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zzkb zzkb0) throws RemoteException {
                zzkb0.zza(new com.google.android.gms.internal.zzka.zzb.zza(this, zzkb0), zzka.this.zzVw, appId);
            }
        });
    }

    @Override  // com.google.android.gms.cast.CastRemoteDisplayApi
    public PendingResult stopRemoteDisplay(GoogleApiClient apiClient) {
        zzka.zzQW.zzb("stopRemoteDisplay", new Object[0]);
        return apiClient.zzb(new zzb(apiClient) {
            protected void zza(zzkb zzkb0) throws RemoteException {
                zzkb0.zza(new com.google.android.gms.internal.zzka.zzb.zzb(this));
            }
        });
    }

    private void zzmf() {
        if(this.zzVv != null) {
            if(this.zzVv.getDisplay() != null) {
                String s = "releasing virtual display: " + this.zzVv.getDisplay().getDisplayId();
                zzka.zzQW.zzb(s, new Object[0]);
            }
            this.zzVv.release();
            this.zzVv = null;
        }
    }
}

