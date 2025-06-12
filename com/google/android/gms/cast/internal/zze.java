package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast.ApplicationConnectionResult;
import com.google.android.gms.cast.Cast.Listener;
import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.zzi;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class zze extends zzi {
    static final class zza implements ApplicationConnectionResult {
        private final String zzFE;
        private final Status zzOt;
        private final ApplicationMetadata zzUF;
        private final String zzUG;
        private final boolean zzUH;

        public zza(Status status0) {
            this(status0, null, null, null, false);
        }

        public zza(Status status0, ApplicationMetadata applicationMetadata0, String s, String s1, boolean z) {
            this.zzOt = status0;
            this.zzUF = applicationMetadata0;
            this.zzUG = s;
            this.zzFE = s1;
            this.zzUH = z;
        }

        @Override  // com.google.android.gms.cast.Cast$ApplicationConnectionResult
        public ApplicationMetadata getApplicationMetadata() {
            return this.zzUF;
        }

        @Override  // com.google.android.gms.cast.Cast$ApplicationConnectionResult
        public String getApplicationStatus() {
            return this.zzUG;
        }

        @Override  // com.google.android.gms.cast.Cast$ApplicationConnectionResult
        public String getSessionId() {
            return this.zzFE;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }

        @Override  // com.google.android.gms.cast.Cast$ApplicationConnectionResult
        public boolean getWasLaunched() {
            return this.zzUH;
        }
    }

    static class zzb extends com.google.android.gms.cast.internal.zzj.zza {
        private final Handler mHandler;
        private final AtomicReference zzUI;

        public zzb(zze zze0) {
            this.zzUI = new AtomicReference(zze0);
            this.mHandler = new Handler(zze0.getLooper());
        }

        public boolean isDisposed() {
            return this.zzUI.get() == null;
        }

        @Override  // com.google.android.gms.cast.internal.zzj
        public void onApplicationDisconnected(int statusCode) {
            zze zze0 = (zze)this.zzUI.get();
            if(zze0 != null) {
                zze0.zzUx = null;
                zze0.zzUy = null;
                this.zza(zze0, statusCode);
                if(zze0.zzQI != null) {
                    com.google.android.gms.cast.internal.zze.zzb.1 zze$zzb$10 = new Runnable() {
                        @Override
                        public void run() {
                        }
                    };
                    this.mHandler.post(zze$zzb$10);
                }
            }
        }

        private void zza(zze zze0, long v, int v1) {
            com.google.android.gms.common.api.zza.zzb zza$zzb0;
            synchronized(zze0.zzUA) {
                zza$zzb0 = (com.google.android.gms.common.api.zza.zzb)zze0.zzUA.remove(v);
            }
            if(zza$zzb0 != null) {
                zza$zzb0.zzm(new Status(v1));
            }
        }

        private boolean zza(zze zze0, int v) {
            synchronized(zze.zzUE) {
                if(zze0.zzUC != null) {
                    zze0.zzUC.zzm(new Status(v));
                    zze0.zzUC = null;
                    return true;
                }
                return false;
            }
        }

        @Override  // com.google.android.gms.cast.internal.zzj
        public void zza(ApplicationMetadata applicationMetadata0, String s, String s1, boolean z) {
            zze zze0 = (zze)this.zzUI.get();
            if(zze0 == null) {
                return;
            }
            zze0.zzUl = applicationMetadata0;
            zze0.zzUx = applicationMetadata0.getApplicationId();
            zze0.zzUy = s1;
            synchronized(zze.zzUD) {
                if(zze0.zzUB != null) {
                    zze0.zzUB.zzm(new zza(new Status(0), applicationMetadata0, s, s1, z));
                    zze0.zzUB = null;
                }
            }
        }

        @Override  // com.google.android.gms.cast.internal.zzj
        public void zza(String s, double f, boolean z) {
            zze.zzQW.zzb("Deprecated callback: \"onStatusreceived\"", new Object[0]);
        }

        @Override  // com.google.android.gms.cast.internal.zzj
        public void zza(String s, long v, int v1) {
            zze zze0 = (zze)this.zzUI.get();
            if(zze0 == null) {
                return;
            }
            this.zza(zze0, v, v1);
        }

        @Override  // com.google.android.gms.cast.internal.zzj
        public void zzaM(int v) {
            zze zze0 = this.zzlW();
            if(zze0 != null) {
                zze.zzQW.zzb("ICastDeviceControllerListener.onDisconnected: %d", new Object[]{v});
                if(v != 0) {
                    zze0.zzbs(2);
                }
            }
        }

        @Override  // com.google.android.gms.cast.internal.zzj
        public void zzaN(int v) {
            zze zze0 = (zze)this.zzUI.get();
            if(zze0 == null) {
                return;
            }
            synchronized(zze.zzUD) {
                if(zze0.zzUB != null) {
                    zze0.zzUB.zzm(new zza(new Status(v)));
                    zze0.zzUB = null;
                }
            }
        }

        @Override  // com.google.android.gms.cast.internal.zzj
        public void zzaO(int v) {
            zze zze0 = (zze)this.zzUI.get();
            if(zze0 == null) {
                return;
            }
            this.zza(zze0, v);
        }

        @Override  // com.google.android.gms.cast.internal.zzj
        public void zzaP(int v) {
            zze zze0 = (zze)this.zzUI.get();
            if(zze0 == null) {
                return;
            }
            this.zza(zze0, v);
        }

        @Override  // com.google.android.gms.cast.internal.zzj
        public void zzb(ApplicationStatus applicationStatus0) {
            zze zze0 = (zze)this.zzUI.get();
            if(zze0 == null) {
                return;
            }
            zze.zzQW.zzb("onApplicationStatusChanged", new Object[0]);
            com.google.android.gms.cast.internal.zze.zzb.3 zze$zzb$30 = new Runnable() {
                @Override
                public void run() {
                    zze0.zza(applicationStatus0);
                }
            };
            this.mHandler.post(zze$zzb$30);
        }

        @Override  // com.google.android.gms.cast.internal.zzj
        public void zzb(DeviceStatus deviceStatus0) {
            zze zze0 = (zze)this.zzUI.get();
            if(zze0 == null) {
                return;
            }
            zze.zzQW.zzb("onDeviceStatusChanged", new Object[0]);
            com.google.android.gms.cast.internal.zze.zzb.2 zze$zzb$20 = new Runnable() {
                @Override
                public void run() {
                    zze0.zza(deviceStatus0);
                }
            };
            this.mHandler.post(zze$zzb$20);
        }

        @Override  // com.google.android.gms.cast.internal.zzj
        public void zzb(String s, byte[] arr_b) {
            if(((zze)this.zzUI.get()) == null) {
                return;
            }
            zze.zzQW.zzb("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", new Object[]{s, ((int)arr_b.length)});
        }

        @Override  // com.google.android.gms.cast.internal.zzj
        public void zzd(String s, long v) {
            zze zze0 = (zze)this.zzUI.get();
            if(zze0 == null) {
                return;
            }
            this.zza(zze0, v, 0);
        }

        public zze zzlW() {
            zze zze0 = (zze)this.zzUI.getAndSet(null);
            if(zze0 == null) {
                return null;
            }
            zze0.zzlL();
            return zze0;
        }

        @Override  // com.google.android.gms.cast.internal.zzj
        public void zzq(String s, String s1) {
            zze zze0 = (zze)this.zzUI.get();
            if(zze0 == null) {
                return;
            }
            zze.zzQW.zzb("Receive (type=text, ns=%s) %s", new Object[]{s, s1});
            com.google.android.gms.cast.internal.zze.zzb.4 zze$zzb$40 = new Runnable() {
                @Override
                public void run() {
                    MessageReceivedCallback cast$MessageReceivedCallback0;
                    synchronized(zze0.zzUn) {
                        cast$MessageReceivedCallback0 = (MessageReceivedCallback)zze0.zzUn.get(s);
                    }
                    if(cast$MessageReceivedCallback0 != null) {
                        cast$MessageReceivedCallback0.onMessageReceived(zze0.zzUm, s, s1);
                        return;
                    }
                    zze.zzQW.zzb("Discarded message for unknown namespace \'%s\'", new Object[]{s});
                }
            };
            this.mHandler.post(zze$zzb$40);
        }
    }

    private final Listener zzQI;
    private static final zzl zzQW;
    private double zzSh;
    private boolean zzSi;
    private final Map zzUA;
    private com.google.android.gms.common.api.zza.zzb zzUB;
    private com.google.android.gms.common.api.zza.zzb zzUC;
    private static final Object zzUD;
    private static final Object zzUE;
    private ApplicationMetadata zzUl;
    private final CastDevice zzUm;
    private final Map zzUn;
    private final long zzUo;
    private zzb zzUp;
    private String zzUq;
    private boolean zzUr;
    private boolean zzUs;
    private boolean zzUt;
    private int zzUu;
    private int zzUv;
    private final AtomicLong zzUw;
    private String zzUx;
    private String zzUy;
    private Bundle zzUz;

    static {
        zze.zzQW = new zzl("CastClientImpl");
        zze.zzUD = new Object();
        zze.zzUE = new Object();
    }

    public zze(Context context0, Looper looper0, CastDevice castDevice0, long v, Listener cast$Listener0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        super(context0, looper0, 10, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        this.zzUm = castDevice0;
        this.zzQI = cast$Listener0;
        this.zzUo = v;
        this.zzUn = new HashMap();
        this.zzUw = new AtomicLong(0L);
        this.zzUA = new HashMap();
        this.zzlL();
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public void disconnect() {
        Object[] arr_object = {this.zzUp, Boolean.valueOf(this.isConnected())};
        zze.zzQW.zzb("disconnect(); ServiceListener=%s, isConnected=%b", arr_object);
        zzb zze$zzb0 = this.zzUp;
        this.zzUp = null;
        if(zze$zzb0 == null || zze$zzb0.zzlW() == null) {
            zze.zzQW.zzb("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        this.zzlR();
        try {
            if(this.isConnected() || this.isConnecting()) {
                ((com.google.android.gms.cast.internal.zzi)this.zznM()).disconnect();
            }
        }
        catch(RemoteException remoteException0) {
            zze.zzQW.zzb(remoteException0, "Error while disconnecting the controller interface: %s", new Object[]{remoteException0.getMessage()});
        }
        finally {
            super.disconnect();
        }
    }

    public ApplicationMetadata getApplicationMetadata() throws IllegalStateException {
        this.zzlS();
        return this.zzUl;
    }

    public String getApplicationStatus() throws IllegalStateException {
        this.zzlS();
        return this.zzUq;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public boolean isMute() throws IllegalStateException {
        this.zzlS();
        return this.zzSi;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public void onConnectionFailed(ConnectionResult result) {
        super.onConnectionFailed(result);
        this.zzlR();
    }

    public void zzR(boolean z) throws IllegalStateException, RemoteException {
        ((com.google.android.gms.cast.internal.zzi)this.zznM()).zza(z, this.zzSh, this.zzSi);
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzaw(iBinder0);
    }

    private void zza(ApplicationStatus applicationStatus0) {
        boolean z;
        String s = applicationStatus0.zzlI();
        if(zzf.zza(s, this.zzUq)) {
            z = false;
        }
        else {
            this.zzUq = s;
            z = true;
        }
        zze.zzQW.zzb("hasChanged=%b, mFirstApplicationStatusUpdate=%b", new Object[]{Boolean.valueOf(z), Boolean.valueOf(this.zzUr)});
        this.zzUr = false;
    }

    private void zza(DeviceStatus deviceStatus0) {
        boolean z3;
        boolean z2;
        boolean z;
        ApplicationMetadata applicationMetadata0 = deviceStatus0.getApplicationMetadata();
        if(!zzf.zza(applicationMetadata0, this.zzUl)) {
            this.zzUl = applicationMetadata0;
        }
        double f = deviceStatus0.zzlO();
        if(f == NaN || Math.abs(f - this.zzSh) <= 1.000000E-07) {
            z = false;
        }
        else {
            this.zzSh = f;
            z = true;
        }
        boolean z1 = deviceStatus0.zzlX();
        if(z1 != this.zzSi) {
            this.zzSi = z1;
            z = true;
        }
        zze.zzQW.zzb("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[]{Boolean.valueOf(z), Boolean.valueOf(this.zzUs)});
        int v = deviceStatus0.zzlP();
        if(v == this.zzUu) {
            z2 = false;
        }
        else {
            this.zzUu = v;
            z2 = true;
        }
        zze.zzQW.zzb("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[]{Boolean.valueOf(z2), Boolean.valueOf(this.zzUs)});
        int v1 = deviceStatus0.zzlQ();
        if(v1 == this.zzUv) {
            z3 = false;
        }
        else {
            this.zzUv = v1;
            z3 = true;
        }
        zze.zzQW.zzb("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", new Object[]{Boolean.valueOf(z3), Boolean.valueOf(this.zzUs)});
        this.zzUs = false;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected void zza(int v, IBinder iBinder0, Bundle bundle0, int v1) {
        zze.zzQW.zzb("in onPostInitHandler; statusCode=%d", new Object[]{v});
        if(v != 0 && v != 1001) {
            this.zzUt = false;
        }
        else {
            this.zzUt = true;
            this.zzUr = true;
            this.zzUs = true;
        }
        if(v == 1001) {
            this.zzUz = new Bundle();
            this.zzUz.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            v = 0;
        }
        super.zza(v, iBinder0, bundle0, v1);
    }

    public void zza(String s, MessageReceivedCallback cast$MessageReceivedCallback0) throws IllegalArgumentException, IllegalStateException, RemoteException {
        zzf.zzbD(s);
        this.zzbC(s);
        if(cast$MessageReceivedCallback0 != null) {
            synchronized(this.zzUn) {
                this.zzUn.put(s, cast$MessageReceivedCallback0);
            }
            ((com.google.android.gms.cast.internal.zzi)this.zznM()).zzbH(s);
        }
    }

    public void zza(String s, LaunchOptions launchOptions0, com.google.android.gms.common.api.zza.zzb zza$zzb0) throws IllegalStateException, RemoteException {
        this.zzc(zza$zzb0);
        ((com.google.android.gms.cast.internal.zzi)this.zznM()).zza(s, launchOptions0);
    }

    public void zza(String s, com.google.android.gms.common.api.zza.zzb zza$zzb0) throws IllegalStateException, RemoteException {
        this.zze(zza$zzb0);
        ((com.google.android.gms.cast.internal.zzi)this.zznM()).zzbG(s);
    }

    public void zza(String s, String s1, com.google.android.gms.common.api.zza.zzb zza$zzb0) throws IllegalArgumentException, IllegalStateException, RemoteException {
        if(TextUtils.isEmpty(s1)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        }
        if(s1.length() > 0x10000) {
            throw new IllegalArgumentException("Message exceeds maximum size");
        }
        zzf.zzbD(s);
        this.zzlS();
        long v = this.zzUw.incrementAndGet();
        try {
            this.zzUA.put(v, zza$zzb0);
            ((com.google.android.gms.cast.internal.zzi)this.zznM()).zza(s, s1, v);
        }
        catch(Throwable throwable0) {
            this.zzUA.remove(v);
            throw throwable0;
        }
    }

    public void zza(String s, boolean z, com.google.android.gms.common.api.zza.zzb zza$zzb0) throws IllegalStateException, RemoteException {
        this.zzc(zza$zzb0);
        ((com.google.android.gms.cast.internal.zzi)this.zznM()).zzf(s, z);
    }

    protected com.google.android.gms.cast.internal.zzi zzaw(IBinder iBinder0) {
        return com.google.android.gms.cast.internal.zzi.zza.zzax(iBinder0);
    }

    public void zzb(String s, String s1, com.google.android.gms.common.api.zza.zzb zza$zzb0) throws IllegalStateException, RemoteException {
        this.zzc(zza$zzb0);
        ((com.google.android.gms.cast.internal.zzi)this.zznM()).zzr(s, s1);
    }

    public void zzbC(String s) throws IllegalArgumentException, RemoteException {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("Channel namespace cannot be null or empty");
        }
        synchronized(this.zzUn) {
            MessageReceivedCallback cast$MessageReceivedCallback0 = (MessageReceivedCallback)this.zzUn.remove(s);
        }
        if(cast$MessageReceivedCallback0 != null) {
            try {
                ((com.google.android.gms.cast.internal.zzi)this.zznM()).zzbI(s);
            }
            catch(IllegalStateException illegalStateException0) {
                zze.zzQW.zzb(illegalStateException0, "Error unregistering namespace (%s): %s", new Object[]{s, illegalStateException0.getMessage()});
            }
        }
    }

    private void zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
        synchronized(zze.zzUD) {
            if(this.zzUB != null) {
                this.zzUB.zzm(new zza(new Status(2002)));
            }
            this.zzUB = zza$zzb0;
        }
    }

    public void zzd(double f) throws IllegalArgumentException, IllegalStateException, RemoteException {
        if(Double.isInfinite(f) || Double.isNaN(f)) {
            throw new IllegalArgumentException("Volume cannot be " + f);
        }
        ((com.google.android.gms.cast.internal.zzi)this.zznM()).zza(f, this.zzSh, this.zzSi);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zza$zzb0) throws IllegalStateException, RemoteException {
        this.zze(zza$zzb0);
        ((com.google.android.gms.cast.internal.zzi)this.zznM()).zzlY();
    }

    private void zze(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
        synchronized(zze.zzUE) {
            if(this.zzUC != null) {
                zza$zzb0.zzm(new Status(2001));
                return;
            }
            this.zzUC = zza$zzb0;
        }
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected Bundle zzkR() {
        Bundle bundle0 = new Bundle();
        zze.zzQW.zzb("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", new Object[]{this.zzUx, this.zzUy});
        this.zzUm.putInBundle(bundle0);
        bundle0.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.zzUo);
        this.zzUp = new zzb(this);
        bundle0.putParcelable("listener", new BinderWrapper(this.zzUp.asBinder()));
        if(this.zzUx != null) {
            bundle0.putString("last_application_id", this.zzUx);
            if(this.zzUy != null) {
                bundle0.putString("last_session_id", this.zzUy);
            }
        }
        return bundle0;
    }

    private void zzlL() {
        this.zzUt = false;
        this.zzUu = -1;
        this.zzUv = -1;
        this.zzUl = null;
        this.zzUq = null;
        this.zzSh = 0.0;
        this.zzSi = false;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public Bundle zzlM() {
        if(this.zzUz != null) {
            Bundle bundle0 = this.zzUz;
            this.zzUz = null;
            return bundle0;
        }
        return super.zzlM();
    }

    public void zzlN() throws IllegalStateException, RemoteException {
        ((com.google.android.gms.cast.internal.zzi)this.zznM()).zzlN();
    }

    public double zzlO() throws IllegalStateException {
        this.zzlS();
        return this.zzSh;
    }

    public int zzlP() throws IllegalStateException {
        this.zzlS();
        return this.zzUu;
    }

    public int zzlQ() throws IllegalStateException {
        this.zzlS();
        return this.zzUv;
    }

    private void zzlR() {
        zze.zzQW.zzb("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized(this.zzUn) {
            this.zzUn.clear();
        }
    }

    private void zzlS() throws IllegalStateException {
        if(!this.zzUt || this.zzUp == null || this.zzUp.isDisposed()) {
            throw new IllegalStateException("Not connected to a device");
        }
    }
}

