package com.google.android.gms.wearable;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.List;

public abstract class WearableListenerService extends Service implements CapabilityListener, ChannelListener, DataListener, MessageListener, NodeListener, zza {
    class com.google.android.gms.wearable.WearableListenerService.zza extends com.google.android.gms.wearable.internal.zzas.zza {
        boolean zzaTf;
        final WearableListenerService zzaTg;

        com.google.android.gms.wearable.WearableListenerService.zza() {
            this.zzaTf = wearableListenerService0 instanceof zzh;
        }

        @Override  // com.google.android.gms.wearable.internal.zzas
        public void onConnectedNodes(List list0) {
            if(Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onConnectedNodes: " + WearableListenerService.this.zzMZ + ": " + list0);
            }
            WearableListenerService.this.zzAS();
            synchronized(WearableListenerService.this.zzaTe) {
                if(WearableListenerService.this.zzJA) {
                    return;
                }
                WearableListenerService.this.zzaTd.post(new Runnable() {
                    @Override
                    public void run() {
                    }
                });
            }
        }

        @Override  // com.google.android.gms.wearable.internal.zzas
        public void zza(AncsNotificationParcelable ancsNotificationParcelable0) {
            if(Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onNotificationReceived: " + ancsNotificationParcelable0);
            }
            if(!this.zzaTf) {
                return;
            }
            WearableListenerService.this.zzAS();
            zzh zzh0 = (zzh)WearableListenerService.this;
            synchronized(WearableListenerService.this.zzaTe) {
                if(WearableListenerService.this.zzJA) {
                    return;
                }
                com.google.android.gms.wearable.WearableListenerService.zza.7 wearableListenerService$zza$70 = new Runnable() {
                    @Override
                    public void run() {
                    }
                };
                WearableListenerService.this.zzaTd.post(wearableListenerService$zza$70);
            }
        }

        @Override  // com.google.android.gms.wearable.internal.zzas
        public void zza(CapabilityInfoParcelable capabilityInfoParcelable0) {
            if(Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onConnectedCapabilityChanged: " + capabilityInfoParcelable0);
            }
            WearableListenerService.this.zzAS();
            synchronized(WearableListenerService.this.zzaTe) {
                if(WearableListenerService.this.zzJA) {
                    return;
                }
                com.google.android.gms.wearable.WearableListenerService.zza.6 wearableListenerService$zza$60 = new Runnable() {
                    @Override
                    public void run() {
                    }
                };
                WearableListenerService.this.zzaTd.post(wearableListenerService$zza$60);
            }
        }

        @Override  // com.google.android.gms.wearable.internal.zzas
        public void zza(ChannelEventParcelable channelEventParcelable0) {
            if(Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onChannelEvent: " + channelEventParcelable0);
            }
            WearableListenerService.this.zzAS();
            synchronized(WearableListenerService.this.zzaTe) {
                if(WearableListenerService.this.zzJA) {
                    return;
                }
                com.google.android.gms.wearable.WearableListenerService.zza.8 wearableListenerService$zza$80 = new Runnable() {
                    @Override
                    public void run() {
                        channelEventParcelable0.zza(WearableListenerService.this);
                    }
                };
                WearableListenerService.this.zzaTd.post(wearableListenerService$zza$80);
            }
        }

        @Override  // com.google.android.gms.wearable.internal.zzas
        public void zza(MessageEventParcelable messageEventParcelable0) {
            if(Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onMessageReceived: " + messageEventParcelable0);
            }
            WearableListenerService.this.zzAS();
            synchronized(WearableListenerService.this.zzaTe) {
                if(WearableListenerService.this.zzJA) {
                    return;
                }
                com.google.android.gms.wearable.WearableListenerService.zza.2 wearableListenerService$zza$20 = new Runnable() {
                    @Override
                    public void run() {
                    }
                };
                WearableListenerService.this.zzaTd.post(wearableListenerService$zza$20);
            }
        }

        @Override  // com.google.android.gms.wearable.internal.zzas
        public void zza(NodeParcelable nodeParcelable0) {
            if(Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onPeerConnected: " + WearableListenerService.this.zzMZ + ": " + nodeParcelable0);
            }
            WearableListenerService.this.zzAS();
            synchronized(WearableListenerService.this.zzaTe) {
                if(WearableListenerService.this.zzJA) {
                    return;
                }
                com.google.android.gms.wearable.WearableListenerService.zza.3 wearableListenerService$zza$30 = new Runnable() {
                    @Override
                    public void run() {
                    }
                };
                WearableListenerService.this.zzaTd.post(wearableListenerService$zza$30);
            }
        }

        @Override  // com.google.android.gms.wearable.internal.zzas
        public void zzac(DataHolder dataHolder0) {
            if(Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onDataItemChanged: " + WearableListenerService.this.zzMZ + ": " + dataHolder0);
            }
            WearableListenerService.this.zzAS();
            synchronized(WearableListenerService.this.zzaTe) {
                if(WearableListenerService.this.zzJA) {
                    dataHolder0.close();
                    return;
                }
                com.google.android.gms.wearable.WearableListenerService.zza.1 wearableListenerService$zza$10 = new Runnable() {
                    @Override
                    public void run() {
                        new DataEventBuffer(dataHolder0).release();
                    }
                };
                WearableListenerService.this.zzaTd.post(wearableListenerService$zza$10);
            }
        }

        @Override  // com.google.android.gms.wearable.internal.zzas
        public void zzb(NodeParcelable nodeParcelable0) {
            if(Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", "onPeerDisconnected: " + WearableListenerService.this.zzMZ + ": " + nodeParcelable0);
            }
            WearableListenerService.this.zzAS();
            synchronized(WearableListenerService.this.zzaTe) {
                if(WearableListenerService.this.zzJA) {
                    return;
                }
                com.google.android.gms.wearable.WearableListenerService.zza.4 wearableListenerService$zza$40 = new Runnable() {
                    @Override
                    public void run() {
                    }
                };
                WearableListenerService.this.zzaTd.post(wearableListenerService$zza$40);
            }
        }
    }

    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private boolean zzJA;
    private String zzMZ;
    private volatile int zzZN;
    private IBinder zzZQ;
    private Handler zzaTd;
    private Object zzaTe;

    public WearableListenerService() {
        this.zzZN = -1;
        this.zzaTe = new Object();
    }

    // 去混淆评级： 低(20)
    @Override  // android.app.Service
    public final IBinder onBind(Intent intent) {
        return "com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()) ? this.zzZQ : null;
    }

    @Override  // com.google.android.gms.wearable.CapabilityApi$CapabilityListener
    public void onCapabilityChanged(CapabilityInfo capabilityInfo) {
    }

    @Override  // com.google.android.gms.wearable.ChannelApi$ChannelListener
    public void onChannelClosed(Channel channel, int closeReason, int appSpecificErrorCode) {
    }

    @Override  // com.google.android.gms.wearable.ChannelApi$ChannelListener
    public void onChannelOpened(Channel channel) {
    }

    @Override  // com.google.android.gms.wearable.NodeApi$zza
    public void onConnectedNodes(List list0) {
    }

    @Override  // android.app.Service
    public void onCreate() {
        super.onCreate();
        if(Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: org.dyndns.vivi.SkskShogi");
        }
        this.zzMZ = "org.dyndns.vivi.SkskShogi";
        HandlerThread handlerThread0 = new HandlerThread("WearableListenerService");
        handlerThread0.start();
        this.zzaTd = new Handler(handlerThread0.getLooper());
        this.zzZQ = new com.google.android.gms.wearable.WearableListenerService.zza(this);
    }

    @Override  // com.google.android.gms.wearable.DataApi$DataListener
    public void onDataChanged(DataEventBuffer dataEvents) {
    }

    @Override  // android.app.Service
    public void onDestroy() {
        synchronized(this.zzaTe) {
            this.zzJA = true;
            if(this.zzaTd == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
            }
            this.zzaTd.getLooper().quit();
        }
        super.onDestroy();
    }

    @Override  // com.google.android.gms.wearable.ChannelApi$ChannelListener
    public void onInputClosed(Channel channel, int closeReason, int appSpecificErrorCode) {
    }

    @Override  // com.google.android.gms.wearable.MessageApi$MessageListener
    public void onMessageReceived(MessageEvent messageEvent) {
    }

    @Override  // com.google.android.gms.wearable.ChannelApi$ChannelListener
    public void onOutputClosed(Channel channel, int closeReason, int appSpecificErrorCode) {
    }

    @Override  // com.google.android.gms.wearable.NodeApi$NodeListener
    public void onPeerConnected(Node peer) {
    }

    @Override  // com.google.android.gms.wearable.NodeApi$NodeListener
    public void onPeerDisconnected(Node peer) {
    }

    private void zzAS() throws SecurityException {
        int v = Binder.getCallingUid();
        if(v == this.zzZN) {
            return;
        }
        if(!GooglePlayServicesUtil.zzd(this, v)) {
            throw new SecurityException("Caller is not GooglePlayServices");
        }
        this.zzZN = v;
    }
}

