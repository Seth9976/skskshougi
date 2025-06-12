package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class zzi implements Client, zza {
    abstract class com.google.android.gms.common.internal.zzi.zza extends zzc {
        public final int statusCode;
        public final Bundle zzaaw;
        final zzi zzaax;

        protected com.google.android.gms.common.internal.zzi.zza(int v, Bundle bundle0) {
            super(Boolean.TRUE);
            this.statusCode = v;
            this.zzaaw = bundle0;
        }

        protected void zzc(Boolean boolean0) {
            PendingIntent pendingIntent0 = null;
            if(boolean0 == null) {
                zzi.this.zza(1, null);
                return;
            }
            switch(this.statusCode) {
                case 0: {
                    if(!this.zznO()) {
                        zzi.this.zza(1, null);
                        this.zzg(new ConnectionResult(8, null));
                        return;
                    }
                    return;
                }
                case 10: {
                    zzi.this.zza(1, null);
                    throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
                }
                default: {
                    zzi.this.zza(1, null);
                    if(this.zzaaw != null) {
                        pendingIntent0 = (PendingIntent)this.zzaaw.getParcelable("pendingIntent");
                    }
                    this.zzg(new ConnectionResult(this.statusCode, pendingIntent0));
                }
            }
        }

        protected abstract void zzg(ConnectionResult arg1);

        protected abstract boolean zznO();

        @Override  // com.google.android.gms.common.internal.zzi$zzc
        protected void zznP() {
        }

        @Override  // com.google.android.gms.common.internal.zzi$zzc
        protected void zzr(Object object0) {
            this.zzc(((Boolean)object0));
        }
    }

    final class zzb extends Handler {
        final zzi zzaax;

        public zzb(Looper looper0) {
            super(looper0);
        }

        @Override  // android.os.Handler
        public void handleMessage(Message msg) {
            if(zzi.this.zzaau.get() != msg.arg1) {
                if(this.zzb(msg)) {
                    this.zza(msg);
                }
                return;
            }
            if((msg.what == 1 || msg.what == 5 || msg.what == 6) && !zzi.this.isConnecting()) {
                this.zza(msg);
                return;
            }
            switch(msg.what) {
                case 2: {
                    if(!zzi.this.isConnected()) {
                        this.zza(msg);
                        return;
                    }
                    break;
                }
                case 3: {
                    ConnectionResult connectionResult0 = new ConnectionResult(msg.arg2, null);
                    zzi.this.zzaam.onReportServiceBinding(connectionResult0);
                    zzi.this.onConnectionFailed(connectionResult0);
                    return;
                }
                case 4: {
                    zzi.this.zza(4, null);
                    if(zzi.this.zzaar != null) {
                        zzi.this.zzaar.onConnectionSuspended(msg.arg2);
                    }
                    zzi.this.zza(4, 1, null);
                    return;
                }
            }
            if(this.zzb(msg)) {
                ((zzc)msg.obj).zznQ();
                return;
            }
            Log.wtf("GmsClient", "Don\'t know how to handle this message.");
        }

        private void zza(Message message0) {
            zzc zzi$zzc0 = (zzc)message0.obj;
            zzi$zzc0.zznP();
            zzi$zzc0.unregister();
        }

        private boolean zzb(Message message0) {
            return message0.what == 1 || message0.what == 2 || (message0.what == 5 || message0.what == 6);
        }
    }

    public abstract class zzc {
        private Object mListener;
        final zzi zzaax;
        private boolean zzaay;

        public zzc(Object object0) {
            this.mListener = object0;
            this.zzaay = false;
        }

        public void unregister() {
            this.zznR();
            synchronized(zzi.this.zzaao) {
                zzi.this.zzaao.remove(this);
            }
        }

        protected abstract void zznP();

        public void zznQ() {
            Object object0;
            synchronized(this) {
                object0 = this.mListener;
                if(this.zzaay) {
                    Log.w("GmsClient", "Callback proxy " + this + " being reused. This is not safe.");
                }
            }
            if(object0 == null) {
                this.zznP();
            }
            else {
                try {
                    this.zzr(object0);
                }
                catch(RuntimeException runtimeException0) {
                    this.zznP();
                    throw runtimeException0;
                }
            }
            synchronized(this) {
                this.zzaay = true;
            }
            this.unregister();
        }

        public void zznR() {
            synchronized(this) {
                this.mListener = null;
            }
        }

        protected abstract void zzr(Object arg1);
    }

    public static final class zzd extends com.google.android.gms.common.internal.zzo.zza {
        private final int zzaaA;
        private zzi zzaaz;

        public zzd(zzi zzi0, int v) {
            this.zzaaz = zzi0;
            this.zzaaA = v;
        }

        @Override  // com.google.android.gms.common.internal.zzo
        public void zza(int v, IBinder iBinder0, Bundle bundle0) {
            zzu.zzb(this.zzaaz, "onPostInitComplete can be called only once per call to getRemoteService");
            this.zzaaz.zza(v, iBinder0, bundle0, this.zzaaA);
            this.zznS();
        }

        @Override  // com.google.android.gms.common.internal.zzo
        public void zzb(int v, Bundle bundle0) {
            zzu.zzb(this.zzaaz, "onAccountValidationComplete can be called only once per call to validateAccount");
            this.zzaaz.zza(v, bundle0, this.zzaaA);
            this.zznS();
        }

        private void zznS() {
            this.zzaaz = null;
        }
    }

    public final class zze implements ServiceConnection {
        private final int zzaaA;
        final zzi zzaax;

        public zze(int v) {
            this.zzaaA = v;
        }

        @Override  // android.content.ServiceConnection
        public void onServiceConnected(ComponentName component, IBinder binder) {
            zzu.zzb(binder, "Expecting a valid IBinder");
            zzp zzp0 = com.google.android.gms.common.internal.zzp.zza.zzaG(binder);
            zzi.this.zzaal = zzp0;
            zzi.this.zzbt(this.zzaaA);
        }

        @Override  // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName component) {
            Message message0 = zzi.this.mHandler.obtainMessage(4, this.zzaaA, 1);
            zzi.this.mHandler.sendMessage(message0);
        }
    }

    public class zzf implements ConnectionProgressReportCallbacks {
        final zzi zzaax;

        @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionProgressReportCallbacks
        public void onReportAccountValidation(ConnectionResult result) {
            throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
        }

        @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionProgressReportCallbacks
        public void onReportServiceBinding(ConnectionResult result) {
            if(result.isSuccess()) {
                zzi.this.getRemoteService(null, zzi.this.zzWJ);
                return;
            }
            if(zzi.this.zzaas != null) {
                zzi.this.zzaas.onConnectionFailed(result);
            }
        }
    }

    public final class zzg extends com.google.android.gms.common.internal.zzi.zza {
        public final IBinder zzaaB;
        final zzi zzaax;

        public zzg(int v, IBinder iBinder0, Bundle bundle0) {
            super(v, bundle0);
            this.zzaaB = iBinder0;
        }

        @Override  // com.google.android.gms.common.internal.zzi$zza
        protected void zzg(ConnectionResult connectionResult0) {
            if(zzi.this.zzaas != null) {
                zzi.this.zzaas.onConnectionFailed(connectionResult0);
            }
            zzi.this.onConnectionFailed(connectionResult0);
        }

        @Override  // com.google.android.gms.common.internal.zzi$zza
        protected boolean zznO() {
            String s;
            try {
                s = this.zzaaB.getInterfaceDescriptor();
            }
            catch(RemoteException unused_ex) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
            if(!zzi.this.getServiceDescriptor().equals(s)) {
                Log.e("GmsClient", "service descriptor mismatch: " + zzi.this.getServiceDescriptor() + " vs. " + s);
                return false;
            }
            IInterface iInterface0 = zzi.this.zzT(this.zzaaB);
            if(iInterface0 != null && zzi.this.zza(2, 3, iInterface0)) {
                Bundle bundle0 = zzi.this.zzlM();
                if(zzi.this.zzaar != null) {
                    zzi.this.zzaar.onConnected(bundle0);
                }
                GooglePlayServicesUtil.zzac(zzi.this.mContext);
                return true;
            }
            return false;
        }
    }

    public final class zzh extends com.google.android.gms.common.internal.zzi.zza {
        final zzi zzaax;

        public zzh() {
            super(0, null);
        }

        @Override  // com.google.android.gms.common.internal.zzi$zza
        protected void zzg(ConnectionResult connectionResult0) {
            zzi.this.zzaam.onReportServiceBinding(connectionResult0);
            zzi.this.onConnectionFailed(connectionResult0);
        }

        @Override  // com.google.android.gms.common.internal.zzi$zza
        protected boolean zznO() {
            zzi.this.zzaam.onReportServiceBinding(ConnectionResult.zzVG);
            return true;
        }
    }

    public final class com.google.android.gms.common.internal.zzi.zzi extends com.google.android.gms.common.internal.zzi.zza {
        final zzi zzaax;

        public com.google.android.gms.common.internal.zzi.zzi(int v, Bundle bundle0) {
            super(v, bundle0);
        }

        @Override  // com.google.android.gms.common.internal.zzi$zza
        protected void zzg(ConnectionResult connectionResult0) {
            zzi.this.zzaam.onReportAccountValidation(connectionResult0);
            zzi.this.onConnectionFailed(connectionResult0);
        }

        @Override  // com.google.android.gms.common.internal.zzi$zza
        protected boolean zznO() {
            zzi.this.zzaam.onReportAccountValidation(ConnectionResult.zzVG);
            return true;
        }
    }

    private final Context mContext;
    final Handler mHandler;
    private final Account zzMY;
    private final Set zzWJ;
    private final Looper zzWt;
    private final com.google.android.gms.common.internal.zze zzXa;
    private final zzk zzaak;
    private zzp zzaal;
    private ConnectionProgressReportCallbacks zzaam;
    private IInterface zzaan;
    private final ArrayList zzaao;
    private zze zzaap;
    private int zzaaq;
    private ConnectionCallbacks zzaar;
    private OnConnectionFailedListener zzaas;
    private final int zzaat;
    protected AtomicInteger zzaau;
    public static final String[] zzaav;
    private final Object zzqt;

    static {
        zzi.zzaav = new String[]{"service_esmobile", "service_googleme"};
    }

    @Deprecated
    protected zzi(Context context0, Looper looper0, int v, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        this.zzqt = new Object();
        this.zzaao = new ArrayList();
        this.zzaaq = 1;
        this.zzaau = new AtomicInteger(0);
        this.mContext = (Context)zzu.zzu(context0);
        this.zzWt = (Looper)zzu.zzb(looper0, "Looper must not be null");
        this.zzaak = zzk.zzah(context0);
        this.mHandler = new zzb(this, looper0);
        this.zzaat = v;
        this.zzMY = null;
        this.zzWJ = Collections.emptySet();
        this.zzXa = new Builder(context0).zzmx();
        this.zzaar = (ConnectionCallbacks)zzu.zzu(googleApiClient$ConnectionCallbacks0);
        this.zzaas = (OnConnectionFailedListener)zzu.zzu(googleApiClient$OnConnectionFailedListener0);
    }

    protected zzi(Context context0, Looper looper0, int v, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0, com.google.android.gms.common.internal.zze zze0) {
        this(context0, looper0, zzk.zzah(context0), v, zze0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
    }

    protected zzi(Context context0, Looper looper0, zzk zzk0, int v, com.google.android.gms.common.internal.zze zze0) {
        this.zzqt = new Object();
        this.zzaao = new ArrayList();
        this.zzaaq = 1;
        this.zzaau = new AtomicInteger(0);
        this.mContext = (Context)zzu.zzb(context0, "Context must not be null");
        this.zzWt = (Looper)zzu.zzb(looper0, "Looper must not be null");
        this.zzaak = (zzk)zzu.zzb(zzk0, "Supervisor must not be null");
        this.mHandler = new zzb(this, looper0);
        this.zzaat = v;
        this.zzXa = (com.google.android.gms.common.internal.zze)zzu.zzu(zze0);
        this.zzMY = zze0.getAccount();
        this.zzWJ = this.zzb(zze0.zznw());
    }

    protected zzi(Context context0, Looper looper0, zzk zzk0, int v, com.google.android.gms.common.internal.zze zze0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        this(context0, looper0, zzk0, v, zze0);
        this.zzaar = (ConnectionCallbacks)zzu.zzu(googleApiClient$ConnectionCallbacks0);
        this.zzaas = (OnConnectionFailedListener)zzu.zzu(googleApiClient$OnConnectionFailedListener0);
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public void connect(ConnectionProgressReportCallbacks callbacks) {
        this.zza(callbacks);
        this.zza(2, null);
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public void disconnect() {
        this.zzaau.incrementAndGet();
        synchronized(this.zzaao) {
            int v1 = this.zzaao.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((zzc)this.zzaao.get(v2)).zznR();
            }
            this.zzaao.clear();
        }
        this.zza(1, null);
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        IInterface iInterface0;
        synchronized(this.zzqt) {
            int v = this.zzaaq;
            iInterface0 = this.zzaan;
        }
        writer.append(prefix).append("mConnectState=");
        switch(v) {
            case 1: {
                writer.print("DISCONNECTED");
                break;
            }
            case 2: {
                writer.print("CONNECTING");
                break;
            }
            case 3: {
                writer.print("CONNECTED");
                break;
            }
            case 4: {
                writer.print("DISCONNECTING");
                break;
            }
            default: {
                writer.print("UNKNOWN");
            }
        }
        writer.append(" mService=");
        if(iInterface0 == null) {
            writer.println("null");
            return;
        }
        writer.append(this.getServiceDescriptor()).append("@").println(Integer.toHexString(System.identityHashCode(iInterface0.asBinder())));
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final Looper getLooper() {
        return this.zzWt;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public void getRemoteService(IAccountAccessor authedAccountAccessor, Set set0) {
        try {
            Bundle bundle0 = this.zzkR();
            GetServiceRequest getServiceRequest0 = new GetServiceRequest(this.zzaat).zzcb("org.dyndns.vivi.SkskShogi").zzf(bundle0);
            if(set0 != null) {
                getServiceRequest0.zzb(set0);
            }
            if(this.requiresSignIn()) {
                getServiceRequest0.zzb(this.zznt()).zzb(authedAccountAccessor);
            }
            else if(this.requiresAccount()) {
                getServiceRequest0.zzb(this.zzMY);
            }
            this.zzaal.zza(new zzd(this, this.zzaau.get()), getServiceRequest0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("GmsClient", "service died");
            this.zzbs(1);
        }
        catch(RemoteException remoteException0) {
            Log.w("GmsClient", "Remote exception occurred", remoteException0);
        }
    }

    protected abstract String getServiceDescriptor();

    protected abstract String getStartServiceAction();

    @Override  // com.google.android.gms.common.api.Api$Client, com.google.android.gms.common.internal.zzj$zza
    public boolean isConnected() {
        synchronized(this.zzqt) {
        }
        return this.zzaaq == 3;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public boolean isConnecting() {
        synchronized(this.zzqt) {
        }
        return this.zzaaq == 2;
    }

    protected void onConnectionFailed(ConnectionResult result) {
    }

    protected void onConnectionSuspended(int cause) {
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public boolean requiresAccount() {
        return false;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public boolean requiresSignIn() {
        return false;
    }

    @Override  // com.google.android.gms.common.api.Api$Client
    public void validateAccount(IAccountAccessor resolvedAccountAccessor) {
        ValidateAccountRequest validateAccountRequest0 = new ValidateAccountRequest(resolvedAccountAccessor, ((Scope[])this.zzWJ.toArray(new Scope[this.zzWJ.size()])), "org.dyndns.vivi.SkskShogi", this.zznN());
        try {
            this.zzaal.zza(new zzd(this, this.zzaau.get()), validateAccountRequest0);
        }
        catch(DeadObjectException unused_ex) {
            Log.w("GmsClient", "service died");
            this.zzbs(1);
        }
        catch(RemoteException remoteException0) {
            Log.w("GmsClient", "Remote exception occurred", remoteException0);
        }
    }

    protected abstract IInterface zzT(IBinder arg1);

    private void zza(int v, IInterface iInterface0) {
        Object object0;
        int v1;
        boolean z = true;
        if(v == 3) {
            v1 = 1;
        }
        else {
            v1 = 0;
        label_5:
            int v2 = iInterface0 == null ? 0 : 1;
            if(v1 != v2) {
                z = false;
            }
            goto label_11;
        }
        goto label_5;
    label_11:
        zzu.zzV(z);
        object0 = this.zzqt;
        synchronized(object0) {
            this.zzaaq = v;
            this.zzaan = iInterface0;
            switch(v) {
                case 1: {
                    this.zznI();
                    break;
                }
                case 2: {
                    this.zznH();
                    break;
                }
                case 3: {
                    this.zznG();
                }
            }
        }
    }

    private void zza(ConnectionProgressReportCallbacks googleApiClient$ConnectionProgressReportCallbacks0) {
        this.zzaam = (ConnectionProgressReportCallbacks)zzu.zzb(googleApiClient$ConnectionProgressReportCallbacks0, "Connection progress callbacks cannot be null.");
    }

    private boolean zza(int v, int v1, IInterface iInterface0) {
        synchronized(this.zzqt) {
            if(this.zzaaq != v) {
                return false;
            }
            this.zza(v1, iInterface0);
            return true;
        }
    }

    protected Set zza(Set set0) {
        return set0;
    }

    protected void zza(int v, Bundle bundle0, int v1) {
        com.google.android.gms.common.internal.zzi.zzi zzi$zzi0 = new com.google.android.gms.common.internal.zzi.zzi(this, v, bundle0);
        Message message0 = this.mHandler.obtainMessage(5, v1, -1, zzi$zzi0);
        this.mHandler.sendMessage(message0);
    }

    protected void zza(int v, IBinder iBinder0, Bundle bundle0, int v1) {
        zzg zzi$zzg0 = new zzg(this, v, iBinder0, bundle0);
        Message message0 = this.mHandler.obtainMessage(1, v1, -1, zzi$zzg0);
        this.mHandler.sendMessage(message0);
    }

    @Deprecated
    public final void zza(zzc zzi$zzc0) {
        synchronized(this.zzaao) {
            this.zzaao.add(zzi$zzc0);
        }
        int v1 = this.zzaau.get();
        Message message0 = this.mHandler.obtainMessage(2, v1, -1, zzi$zzc0);
        this.mHandler.sendMessage(message0);
    }

    private Set zzb(Set set0) {
        Set set1 = this.zza(set0);
        if(set1 == null) {
            return null;
        }
        for(Object object0: set1) {
            if(!set0.contains(((Scope)object0))) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
            if(false) {
                break;
            }
        }
        return set1;
    }

    public void zzbs(int v) {
        int v1 = this.zzaau.get();
        Message message0 = this.mHandler.obtainMessage(4, v1, v);
        this.mHandler.sendMessage(message0);
    }

    protected void zzbt(int v) {
        zzh zzi$zzh0 = new zzh(this);
        Message message0 = this.mHandler.obtainMessage(6, v, -1, zzi$zzh0);
        this.mHandler.sendMessage(message0);
    }

    protected String zzkQ() {
        return this.zzXa.zznz();
    }

    protected Bundle zzkR() {
        return new Bundle();
    }

    @Override  // com.google.android.gms.common.internal.zzj$zza
    public Bundle zzlM() {
        return null;
    }

    protected void zznG() {
    }

    private void zznH() {
        if(this.zzaap != null) {
            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + this.getStartServiceAction());
            String s = this.getStartServiceAction();
            zze zzi$zze0 = this.zzaap;
            String s1 = this.zzkQ();
            this.zzaak.zzb(s, zzi$zze0, s1);
            this.zzaau.incrementAndGet();
        }
        this.zzaap = new zze(this, this.zzaau.get());
        String s2 = this.getStartServiceAction();
        zze zzi$zze1 = this.zzaap;
        String s3 = this.zzkQ();
        if(!this.zzaak.zza(s2, zzi$zze1, s3)) {
            Log.e("GmsClient", "unable to connect to service: " + this.getStartServiceAction());
            int v = this.zzaau.get();
            Message message0 = this.mHandler.obtainMessage(3, v, 9);
            this.mHandler.sendMessage(message0);
        }
    }

    private void zznI() {
        if(this.zzaap != null) {
            String s = this.getStartServiceAction();
            zze zzi$zze0 = this.zzaap;
            String s1 = this.zzkQ();
            this.zzaak.zzb(s, zzi$zze0, s1);
            this.zzaap = null;
        }
    }

    public void zznJ() {
        int v = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.mContext);
        if(v != 0) {
            this.zza(1, null);
            this.zzaam = new zzf(this);
            int v1 = this.zzaau.get();
            Message message0 = this.mHandler.obtainMessage(3, v1, v);
            this.mHandler.sendMessage(message0);
            return;
        }
        this.connect(new zzf(this));
    }

    protected final com.google.android.gms.common.internal.zze zznK() {
        return this.zzXa;
    }

    protected final void zznL() {
        if(!this.isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final IInterface zznM() throws DeadObjectException {
        synchronized(this.zzqt) {
            if(this.zzaaq == 4) {
                throw new DeadObjectException();
            }
            this.zznL();
            zzu.zza(this.zzaan != null, "Client is connected but service is null");
            return this.zzaan;
        }
    }

    protected Bundle zznN() {
        return null;
    }

    public final Account zznt() {
        return this.zzMY == null ? new Account("<<default account>>", "com.google") : this.zzMY;
    }
}

