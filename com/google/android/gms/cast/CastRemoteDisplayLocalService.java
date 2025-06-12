package com.google.android.gms.cast;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v7.media.MediaRouteSelector.Builder;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter.Callback;
import android.support.v7.media.MediaRouter.RouteInfo;
import android.support.v7.media.MediaRouter;
import android.text.TextUtils;
import android.view.Display;
import com.google.android.gms.R.drawable;
import com.google.android.gms.R.id;
import com.google.android.gms.R.string;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class CastRemoteDisplayLocalService extends Service {
    public interface Callbacks {
        void onRemoteDisplaySessionError(Status arg1);

        void onRemoteDisplaySessionStarted(CastRemoteDisplayLocalService arg1);
    }

    public static final class NotificationSettings {
        public static final class Builder {
            private NotificationSettings zzRy;

            public Builder() {
                this.zzRy = new NotificationSettings(null);
            }

            public NotificationSettings build() {
                if(this.zzRy.mNotification != null) {
                    if(!TextUtils.isEmpty(this.zzRy.zzRw)) {
                        throw new IllegalArgumentException("notificationTitle requires using the default notification");
                    }
                    if(!TextUtils.isEmpty(this.zzRy.zzRx)) {
                        throw new IllegalArgumentException("notificationText requires using the default notification");
                    }
                    if(this.zzRy.zzRv != null) {
                        throw new IllegalArgumentException("notificationPendingIntent requires using the default notification");
                    }
                }
                else if(TextUtils.isEmpty(this.zzRy.zzRw) && TextUtils.isEmpty(this.zzRy.zzRx) && this.zzRy.zzRv == null) {
                    throw new IllegalArgumentException("At least an argument must be provided");
                }
                return this.zzRy;
            }

            public Builder setNotification(Notification notification) {
                this.zzRy.mNotification = notification;
                return this;
            }

            public Builder setNotificationPendingIntent(PendingIntent notificationPendingIntent) {
                this.zzRy.zzRv = notificationPendingIntent;
                return this;
            }

            public Builder setNotificationText(String notificationText) {
                this.zzRy.zzRx = notificationText;
                return this;
            }

            public Builder setNotificationTitle(String notificationTitle) {
                this.zzRy.zzRw = notificationTitle;
                return this;
            }
        }

        private Notification mNotification;
        private PendingIntent zzRv;
        private String zzRw;
        private String zzRx;

        private NotificationSettings() {
        }

        NotificationSettings(com.google.android.gms.cast.CastRemoteDisplayLocalService.1 x0) {
        }

        private NotificationSettings(NotificationSettings newSettings) {
            this.mNotification = newSettings.mNotification;
            this.zzRv = newSettings.zzRv;
            this.zzRw = newSettings.zzRw;
            this.zzRx = newSettings.zzRx;
        }

        NotificationSettings(NotificationSettings x0, com.google.android.gms.cast.CastRemoteDisplayLocalService.1 x1) {
            this(x0);
        }
    }

    class zza extends Binder {
        final CastRemoteDisplayLocalService zzRp;

        private zza() {
        }

        zza(com.google.android.gms.cast.CastRemoteDisplayLocalService.1 castRemoteDisplayLocalService$10) {
        }

        CastRemoteDisplayLocalService zzlp() {
            return CastRemoteDisplayLocalService.this;
        }
    }

    static final class zzb extends BroadcastReceiver {
        private zzb() {
        }

        zzb(com.google.android.gms.cast.CastRemoteDisplayLocalService.1 castRemoteDisplayLocalService$10) {
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if(intent.getAction().equals("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT")) {
                CastRemoteDisplayLocalService.zzQW.zzb("disconnecting", new Object[0]);
                CastRemoteDisplayLocalService.stopService();
            }
        }
    }

    private Handler mHandler;
    private Notification mNotification;
    private static final zzl zzQW;
    private static final int zzQX;
    private static final Object zzQY;
    private static AtomicBoolean zzQZ;
    private String zzQv;
    private GoogleApiClient zzRa;
    private CastRemoteDisplaySessionCallbacks zzRb;
    private Callbacks zzRc;
    private zzb zzRd;
    private NotificationSettings zzRe;
    private Boolean zzRf;
    private PendingIntent zzRg;
    private CastDevice zzRh;
    private Display zzRi;
    private Context zzRj;
    private ServiceConnection zzRk;
    private MediaRouter zzRl;
    private final MediaRouter.Callback zzRm;
    private static CastRemoteDisplayLocalService zzRn;
    private final IBinder zzRo;

    static {
        CastRemoteDisplayLocalService.zzQW = new zzl("CastRemoteDisplayLocalService");
        CastRemoteDisplayLocalService.zzQX = id.cast_notification_id;
        CastRemoteDisplayLocalService.zzQY = new Object();
        CastRemoteDisplayLocalService.zzQZ = new AtomicBoolean(false);
    }

    public CastRemoteDisplayLocalService() {
        this.zzRm = new MediaRouter.Callback() {
            public void onRouteUnselected(MediaRouter router, MediaRouter.RouteInfo info) {
                CastRemoteDisplayLocalService.zzQW.zzb("onRouteUnselected", new Object[0]);
                if(CastRemoteDisplayLocalService.this.zzRh == null) {
                    CastRemoteDisplayLocalService.zzQW.zzb("onRouteUnselected, no device was selected", new Object[0]);
                    return;
                }
                if(!CastDevice.getFromBundle(info.getExtras()).getDeviceId().equals(CastRemoteDisplayLocalService.this.zzRh.getDeviceId())) {
                    CastRemoteDisplayLocalService.zzQW.zzb("onRouteUnselected, device does not match", new Object[0]);
                    return;
                }
                CastRemoteDisplayLocalService.stopService();
            }
        };
        this.zzRo = new zza(this, null);
    }

    @Override  // android.content.ContextWrapper
    protected Display getDisplay() {
        return this.zzRi;
    }

    public static CastRemoteDisplayLocalService getInstance() {
        synchronized(CastRemoteDisplayLocalService.zzQY) {
        }
        return CastRemoteDisplayLocalService.zzRn;
    }

    @Override  // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.zzRo;
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zzRb = new CastRemoteDisplaySessionCallbacks() {
            @Override  // com.google.android.gms.cast.CastRemoteDisplay$CastRemoteDisplaySessionCallbacks
            public void onRemoteDisplayEnded(Status status) {
                CastRemoteDisplayLocalService.zzQW.zzb(String.format("Cast screen has ended: %d", status.getStatusCode()), new Object[0]);
                if(CastRemoteDisplayLocalService.this.mHandler != null) {
                    CastRemoteDisplayLocalService.this.mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            CastRemoteDisplayLocalService.zzM(false);
                        }
                    });
                }
            }
        };
    }

    public abstract void onCreatePresentation(Display arg1);

    public abstract void onDismissPresentation();

    @Override  // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        CastRemoteDisplayLocalService.zzQW.zzb("onStartCommand", new Object[0]);
        return 2;
    }

    protected static void setDebugEnabled() {
        CastRemoteDisplayLocalService.zzQW.zzS(true);
    }

    public static void startService(Context activityContext, Class class0, String applicationId, CastDevice device, NotificationSettings notificationSettings, Callbacks callbacks) {
        CastRemoteDisplayLocalService.zzQW.zzb("Starting Service", new Object[0]);
        CastRemoteDisplayLocalService.zzb(activityContext, class0);
        zzu.zzb(activityContext, "activityContext is required.");
        zzu.zzb(class0, "serviceClass is required.");
        zzu.zzb(applicationId, "applicationId is required.");
        zzu.zzb(device, "device is required.");
        zzu.zzb(notificationSettings, "notificationSettings is required.");
        zzu.zzb(callbacks, "callbacks is required.");
        if(notificationSettings.mNotification == null && notificationSettings.zzRv == null) {
            throw new IllegalArgumentException("notificationSettings: Either the notification or the notificationPendingIntent must be provided");
        }
        if(CastRemoteDisplayLocalService.zzQZ.getAndSet(true)) {
            CastRemoteDisplayLocalService.zzQW.zzc("Service is already being started, startService has been called twice", new Object[0]);
            return;
        }
        Intent intent0 = new Intent(activityContext, class0);
        activityContext.startService(intent0);
        activityContext.bindService(intent0, new ServiceConnection() {
            @Override  // android.content.ServiceConnection
            public void onServiceConnected(ComponentName className, IBinder binder) {
                CastRemoteDisplayLocalService castRemoteDisplayLocalService0 = ((zza)binder).zzlp();
                if(castRemoteDisplayLocalService0 != null) {
                    castRemoteDisplayLocalService0.zza(applicationId, device, notificationSettings, activityContext, this, callbacks);
                    return;
                }
                CastRemoteDisplayLocalService.zzQW.zzc("Connected but unable to get the service instance", new Object[0]);
                Status status0 = new Status(2200);
                callbacks.onRemoteDisplaySessionError(status0);
                CastRemoteDisplayLocalService.zzQZ.set(false);
                activityContext.unbindService(this);
            }

            @Override  // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName arg0) {
                CastRemoteDisplayLocalService.zzQW.zzb("onServiceDisconnected", new Object[0]);
                Status status0 = new Status(2201, "Service Disconnected");
                callbacks.onRemoteDisplaySessionError(status0);
                CastRemoteDisplayLocalService.zzQZ.set(false);
                activityContext.unbindService(this);
            }
        }, 0x40);
    }

    public static void stopService() {
        CastRemoteDisplayLocalService.zzM(false);
    }

    public void updateNotificationSettings(NotificationSettings notificationSettings) {
        zzu.zzb(notificationSettings, "notificationSettings is required.");
        if(this.zzRf.booleanValue()) {
            if(notificationSettings.mNotification != null) {
                throw new IllegalStateException("Current mode is default notification, notification attribute must not be provided");
            }
            if(notificationSettings.zzRv != null) {
                this.zzRe.zzRv = notificationSettings.zzRv;
            }
            if(!TextUtils.isEmpty(notificationSettings.zzRw)) {
                this.zzRe.zzRw = notificationSettings.zzRw;
            }
            if(!TextUtils.isEmpty(notificationSettings.zzRx)) {
                this.zzRe.zzRx = notificationSettings.zzRx;
            }
            this.mNotification = this.zzN(true);
        }
        else {
            zzu.zzb(notificationSettings.mNotification, "notification is required.");
            this.mNotification = notificationSettings.mNotification;
            this.zzRe.mNotification = this.mNotification;
        }
        this.startForeground(CastRemoteDisplayLocalService.zzQX, this.mNotification);
    }

    private static void zzM(boolean z) {
        CastRemoteDisplayLocalService castRemoteDisplayLocalService0;
        CastRemoteDisplayLocalService.zzQW.zzb("Stopping Service", new Object[0]);
        CastRemoteDisplayLocalService.zzQZ.set(false);
        synchronized(CastRemoteDisplayLocalService.zzQY) {
            if(CastRemoteDisplayLocalService.zzRn == null) {
                CastRemoteDisplayLocalService.zzQW.zzc("Service is already being stopped", new Object[0]);
                return;
            }
            castRemoteDisplayLocalService0 = CastRemoteDisplayLocalService.zzRn;
            CastRemoteDisplayLocalService.zzRn = null;
        }
        if(!z && castRemoteDisplayLocalService0.zzRl != null) {
            CastRemoteDisplayLocalService.zzQW.zzb("Setting default route", new Object[0]);
            castRemoteDisplayLocalService0.zzRl.selectRoute(castRemoteDisplayLocalService0.zzRl.getDefaultRoute());
        }
        if(castRemoteDisplayLocalService0.zzRd != null) {
            CastRemoteDisplayLocalService.zzQW.zzb("Unregistering notification receiver", new Object[0]);
            castRemoteDisplayLocalService0.unregisterReceiver(castRemoteDisplayLocalService0.zzRd);
        }
        castRemoteDisplayLocalService0.zzlk();
        castRemoteDisplayLocalService0.zzll();
        castRemoteDisplayLocalService0.zzlg();
        if(castRemoteDisplayLocalService0.zzRj != null && castRemoteDisplayLocalService0.zzRk != null) {
            castRemoteDisplayLocalService0.zzRj.unbindService(castRemoteDisplayLocalService0.zzRk);
            castRemoteDisplayLocalService0.zzRk = null;
            castRemoteDisplayLocalService0.zzRj = null;
        }
        castRemoteDisplayLocalService0.zzRc = null;
        castRemoteDisplayLocalService0.zzQv = null;
        castRemoteDisplayLocalService0.zzRa = null;
        castRemoteDisplayLocalService0.zzRh = null;
        castRemoteDisplayLocalService0.zzRe = null;
        castRemoteDisplayLocalService0.mNotification = null;
        castRemoteDisplayLocalService0.zzRi = null;
    }

    private Notification zzN(boolean z) {
        int v2;
        int v1;
        int v = this.getApplicationInfo().labelRes;
        String s = this.zzRe.zzRw;
        String s1 = this.zzRe.zzRx;
        if(z) {
            v1 = string.cast_notification_connected_message;
            v2 = drawable.cast_ic_notification_on;
        }
        else {
            v1 = string.cast_notification_connecting_message;
            v2 = drawable.cast_ic_notification_connecting;
        }
        if(TextUtils.isEmpty(s)) {
            s = this.getString(v);
        }
        String s2 = TextUtils.isEmpty(s1) ? this.getString(v1, new Object[]{this.zzRh.getFriendlyName()}) : s1;
        Notification notification0 = new NotificationCompat.Builder(this).setContentTitle(s).setContentText(s2).setContentIntent(this.zzRe.zzRv).setSmallIcon(v2).setOngoing(true).addAction(0x1080038, this.getString(string.cast_notification_disconnect), this.zzlm()).build();
        this.startForeground(CastRemoteDisplayLocalService.zzQX, notification0);
        return notification0;
    }

    private GoogleApiClient zza(CastDevice castDevice0) {
        com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplayOptions.Builder castRemoteDisplay$CastRemoteDisplayOptions$Builder0 = new com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplayOptions.Builder(castDevice0, this.zzRb);
        com.google.android.gms.common.api.GoogleApiClient.Builder googleApiClient$Builder0 = new com.google.android.gms.common.api.GoogleApiClient.Builder(this, new ConnectionCallbacks() {
            @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
            public void onConnected(Bundle bundle) {
                CastRemoteDisplayLocalService.zzQW.zzb("onConnected", new Object[0]);
                CastRemoteDisplayLocalService.this.zzlh();
            }

            @Override  // com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
            public void onConnectionSuspended(int cause) {
                CastRemoteDisplayLocalService.zzQW.zzf(String.format("ConnectionSuspended %d", cause), new Object[0]);
            }
        }, new OnConnectionFailedListener() {
            @Override  // com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener
            public void onConnectionFailed(ConnectionResult connectionResult) {
                CastRemoteDisplayLocalService.zzQW.zzc("Connection failed: " + connectionResult, new Object[0]);
                CastRemoteDisplayLocalService.this.zzlj();
            }
        });
        CastRemoteDisplayOptions castRemoteDisplay$CastRemoteDisplayOptions0 = castRemoteDisplay$CastRemoteDisplayOptions$Builder0.build();
        return googleApiClient$Builder0.addApi(CastRemoteDisplay.API, castRemoteDisplay$CastRemoteDisplayOptions0).build();
    }

    private void zza(Display display0) {
        this.zzRi = display0;
        if(this.zzRf.booleanValue()) {
            this.mNotification = this.zzN(true);
        }
        if(this.zzRc != null) {
            this.zzRc.onRemoteDisplaySessionStarted(this);
            this.zzRc = null;
        }
        this.onCreatePresentation(this.zzRi);
    }

    private void zza(String s, CastDevice castDevice0, NotificationSettings castRemoteDisplayLocalService$NotificationSettings0, Context context0, ServiceConnection serviceConnection0, Callbacks castRemoteDisplayLocalService$Callbacks0) {
        CastRemoteDisplayLocalService.zzQW.zzb("startRemoteDisplaySession", new Object[0]);
        zzu.zzbY("Starting the Cast Remote Display must be done on the main thread");
        synchronized(CastRemoteDisplayLocalService.zzQY) {
            if(CastRemoteDisplayLocalService.zzRn != null) {
                CastRemoteDisplayLocalService.zzM(true);
                CastRemoteDisplayLocalService.zzQW.zzf("An existing service had not been stopped before starting one", new Object[0]);
            }
            CastRemoteDisplayLocalService.zzRn = this;
        }
        this.zzRc = castRemoteDisplayLocalService$Callbacks0;
        this.zzQv = s;
        this.zzRh = castDevice0;
        this.zzRj = context0;
        this.zzRk = serviceConnection0;
        this.zzRl = MediaRouter.getInstance(this.getApplicationContext());
        MediaRouteSelector mediaRouteSelector0 = new MediaRouteSelector.Builder().addControlCategory(CastMediaControlIntent.categoryForCast(this.zzQv)).build();
        this.zzRl.addCallback(mediaRouteSelector0, this.zzRm, 4);
        this.mHandler = new Handler(this.getMainLooper());
        this.mNotification = castRemoteDisplayLocalService$NotificationSettings0.mNotification;
        this.zzRd = new zzb(null);
        this.registerReceiver(this.zzRd, new IntentFilter("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"));
        this.zzRe = new NotificationSettings(castRemoteDisplayLocalService$NotificationSettings0, null);
        if(this.zzRe.mNotification == null) {
            this.zzRf = Boolean.TRUE;
            this.mNotification = this.zzN(false);
        }
        else {
            this.zzRf = Boolean.FALSE;
            this.mNotification = this.zzRe.mNotification;
        }
        this.zzRa = this.zza(castDevice0);
        this.zzRa.connect();
    }

    private static void zzb(Context context0, Class class0) {
        try {
            ComponentName componentName0 = new ComponentName(context0, class0);
            ServiceInfo serviceInfo0 = context0.getPackageManager().getServiceInfo(componentName0, 0x80);
            if(serviceInfo0 != null && serviceInfo0.exported) {
                throw new IllegalStateException("The service must not be exported, verify the manifest configuration");
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            throw new IllegalStateException("Service not found, did you forget to configure it in the manifest?");
        }
    }

    private void zzlg() {
        if(this.zzRl != null) {
            zzu.zzbY("CastRemoteDisplayLocalService calls must be done on the main thread");
            this.zzRl.removeCallback(this.zzRm);
        }
    }

    private void zzlh() {
        CastRemoteDisplayLocalService.zzQW.zzb("startRemoteDisplay", new Object[0]);
        if(this.zzRa == null || !this.zzRa.isConnected()) {
            CastRemoteDisplayLocalService.zzQW.zzc("Unable to start the remote display as the API client is not ready", new Object[0]);
            return;
        }
        CastRemoteDisplay.CastRemoteDisplayApi.startRemoteDisplay(this.zzRa, this.zzQv).setResultCallback(new ResultCallback() {
            public void zza(CastRemoteDisplaySessionResult castRemoteDisplay$CastRemoteDisplaySessionResult0) {
                if(!castRemoteDisplay$CastRemoteDisplaySessionResult0.getStatus().isSuccess()) {
                    CastRemoteDisplayLocalService.zzQW.zzc("Connection was not successful", new Object[0]);
                    CastRemoteDisplayLocalService.this.zzlj();
                    return;
                }
                Display display0 = castRemoteDisplay$CastRemoteDisplaySessionResult0.getPresentationDisplay();
                if(display0 == null) {
                    CastRemoteDisplayLocalService.zzQW.zzc("Cast Remote Display session created without display", new Object[0]);
                }
                else {
                    CastRemoteDisplayLocalService.this.zza(display0);
                }
                CastRemoteDisplayLocalService.zzQZ.set(false);
                if(CastRemoteDisplayLocalService.this.zzRj != null && CastRemoteDisplayLocalService.this.zzRk != null) {
                    CastRemoteDisplayLocalService.this.zzRj.unbindService(CastRemoteDisplayLocalService.this.zzRk);
                    CastRemoteDisplayLocalService.this.zzRk = null;
                    CastRemoteDisplayLocalService.this.zzRj = null;
                }
            }
        });
    }

    private void zzli() {
        CastRemoteDisplayLocalService.zzQW.zzb("stopRemoteDisplay", new Object[0]);
        if(this.zzRa == null || !this.zzRa.isConnected()) {
            CastRemoteDisplayLocalService.zzQW.zzc("Unable to stop the remote display as the API client is not ready", new Object[0]);
            return;
        }
        CastRemoteDisplay.CastRemoteDisplayApi.stopRemoteDisplay(this.zzRa).setResultCallback(new ResultCallback() {
            public void zza(CastRemoteDisplaySessionResult castRemoteDisplay$CastRemoteDisplaySessionResult0) {
                if(castRemoteDisplay$CastRemoteDisplaySessionResult0.getStatus().isSuccess()) {
                    CastRemoteDisplayLocalService.zzQW.zzb("remote display stopped", new Object[0]);
                }
                else {
                    CastRemoteDisplayLocalService.zzQW.zzb("Unable to stop the remote display, result unsuccessful", new Object[0]);
                }
                CastRemoteDisplayLocalService.this.zzRi = null;
            }
        });
    }

    private void zzlj() {
        if(this.zzRc != null) {
            this.zzRc.onRemoteDisplaySessionError(new Status(2200));
            this.zzRc = null;
        }
        CastRemoteDisplayLocalService.stopService();
    }

    private void zzlk() {
        CastRemoteDisplayLocalService.zzQW.zzb("stopRemoteDisplaySession", new Object[0]);
        this.zzli();
        this.onDismissPresentation();
    }

    private void zzll() {
        CastRemoteDisplayLocalService.zzQW.zzb("Stopping the remote display Service", new Object[0]);
        this.stopForeground(true);
        this.stopSelf();
    }

    private PendingIntent zzlm() {
        if(this.zzRg == null) {
            this.zzRg = PendingIntent.getBroadcast(this, 0, new Intent("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"), 0x10000000);
        }
        return this.zzRg;
    }
}

