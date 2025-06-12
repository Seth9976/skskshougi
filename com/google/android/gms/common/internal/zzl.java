package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

final class zzl extends zzk implements Handler.Callback {
    static final class zza {
        private final ComponentName zzaaO;
        private final String zzuO;

        public zza(ComponentName componentName0) {
            this.zzuO = null;
            this.zzaaO = (ComponentName)zzu.zzu(componentName0);
        }

        public zza(String s) {
            this.zzuO = zzu.zzcj(s);
            this.zzaaO = null;
        }

        @Override
        public boolean equals(Object o) {
            if(this == o) {
                return true;
            }
            return o instanceof zza ? zzt.equal(this.zzuO, ((zza)o).zzuO) && zzt.equal(this.zzaaO, ((zza)o).zzaaO) : false;
        }

        @Override
        public int hashCode() {
            return zzt.hashCode(new Object[]{this.zzuO, this.zzaaO});
        }

        @Override
        public String toString() {
            return this.zzuO == null ? this.zzaaO.flattenToString() : this.zzuO;
        }

        public Intent zznV() {
            return this.zzuO == null ? new Intent().setComponent(this.zzaaO) : new Intent(this.zzuO).setPackage("com.google.android.gms");
        }
    }

    final class zzb {
        public class com.google.android.gms.common.internal.zzl.zzb.zza implements ServiceConnection {
            final zzb zzaaU;

            @Override  // android.content.ServiceConnection
            public void onServiceConnected(ComponentName component, IBinder binder) {
                synchronized(zzl.this.zzaaL) {
                    zzb.this.zzZQ = binder;
                    zzb.this.zzaaO = component;
                    for(Object object0: zzb.this.zzaaQ) {
                        ((ServiceConnection)object0).onServiceConnected(component, binder);
                    }
                    zzb.this.mState = 1;
                }
            }

            @Override  // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName component) {
                synchronized(zzl.this.zzaaL) {
                    zzb.this.zzZQ = null;
                    zzb.this.zzaaO = component;
                    for(Object object0: zzb.this.zzaaQ) {
                        ((ServiceConnection)object0).onServiceDisconnected(component);
                    }
                    zzb.this.mState = 2;
                }
            }
        }

        private int mState;
        private IBinder zzZQ;
        private ComponentName zzaaO;
        private final com.google.android.gms.common.internal.zzl.zzb.zza zzaaP;
        private final Set zzaaQ;
        private boolean zzaaR;
        private final zza zzaaS;
        final zzl zzaaT;

        public zzb(zza zzl$zza0) {
            this.zzaaS = zzl$zza0;
            this.zzaaP = new com.google.android.gms.common.internal.zzl.zzb.zza(this);
            this.zzaaQ = new HashSet();
            this.mState = 2;
        }

        public IBinder getBinder() {
            return this.zzZQ;
        }

        public ComponentName getComponentName() {
            return this.zzaaO;
        }

        public int getState() {
            return this.mState;
        }

        public boolean isBound() {
            return this.zzaaR;
        }

        public void zza(ServiceConnection serviceConnection0, String s) {
            zzl.this.zzaaM.zza(zzl.this.zzqw, serviceConnection0, s, this.zzaaS.zznV());
            this.zzaaQ.add(serviceConnection0);
        }

        public boolean zza(ServiceConnection serviceConnection0) {
            return this.zzaaQ.contains(serviceConnection0);
        }

        public void zzb(ServiceConnection serviceConnection0, String s) {
            zzl.this.zzaaM.zzb(zzl.this.zzqw, serviceConnection0);
            this.zzaaQ.remove(serviceConnection0);
        }

        public void zzcc(String s) {
            Intent intent0 = this.zzaaS.zznV();
            this.zzaaR = zzl.this.zzaaM.zza(zzl.this.zzqw, s, intent0, this.zzaaP, 0x81);
            if(this.zzaaR) {
                this.mState = 3;
                return;
            }
            try {
                zzl.this.zzaaM.zza(zzl.this.zzqw, this.zzaaP);
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }

        public void zzcd(String s) {
            zzl.this.zzaaM.zza(zzl.this.zzqw, this.zzaaP);
            this.zzaaR = false;
            this.mState = 2;
        }

        public boolean zznW() {
            return this.zzaaQ.isEmpty();
        }
    }

    private final Handler mHandler;
    private final HashMap zzaaL;
    private final com.google.android.gms.common.stats.zzb zzaaM;
    private final long zzaaN;
    private final Context zzqw;

    zzl(Context context0) {
        this.zzaaL = new HashMap();
        this.zzqw = context0.getApplicationContext();
        this.mHandler = new Handler(context0.getMainLooper(), this);
        this.zzaaM = com.google.android.gms.common.stats.zzb.zzoO();
        this.zzaaN = 5000L;
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(Message msg) {
        if(msg.what != 0) {
            return false;
        }
        zzb zzl$zzb0 = (zzb)msg.obj;
        synchronized(this.zzaaL) {
            if(zzl$zzb0.zznW()) {
                if(zzl$zzb0.isBound()) {
                    zzl$zzb0.zzcd("GmsClientSupervisor");
                }
                this.zzaaL.remove(zzl$zzb0.zzaaS);
            }
            return true;
        }
    }

    private boolean zza(zza zzl$zza0, ServiceConnection serviceConnection0, String s) {
        zzb zzl$zzb0;
        zzu.zzb(serviceConnection0, "ServiceConnection must not be null");
        synchronized(this.zzaaL) {
            zzl$zzb0 = (zzb)this.zzaaL.get(zzl$zza0);
            if(zzl$zzb0 == null) {
                zzl$zzb0 = new zzb(this, zzl$zza0);
                zzl$zzb0.zza(serviceConnection0, s);
                zzl$zzb0.zzcc(s);
                this.zzaaL.put(zzl$zza0, zzl$zzb0);
            }
            else {
                this.mHandler.removeMessages(0, zzl$zzb0);
                if(zzl$zzb0.zza(serviceConnection0)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zzl$zza0);
                }
                zzl$zzb0.zza(serviceConnection0, s);
                switch(zzl$zzb0.getState()) {
                    case 1: {
                        serviceConnection0.onServiceConnected(zzl$zzb0.getComponentName(), zzl$zzb0.getBinder());
                        break;
                    }
                    case 2: {
                        zzl$zzb0.zzcc(s);
                    }
                }
            }
        }
        return zzl$zzb0.isBound();
    }

    @Override  // com.google.android.gms.common.internal.zzk
    public boolean zza(ComponentName componentName0, ServiceConnection serviceConnection0, String s) {
        return this.zza(new zza(componentName0), serviceConnection0, s);
    }

    @Override  // com.google.android.gms.common.internal.zzk
    public boolean zza(String s, ServiceConnection serviceConnection0, String s1) {
        return this.zza(new zza(s), serviceConnection0, s1);
    }

    private void zzb(zza zzl$zza0, ServiceConnection serviceConnection0, String s) {
        zzu.zzb(serviceConnection0, "ServiceConnection must not be null");
        synchronized(this.zzaaL) {
            zzb zzl$zzb0 = (zzb)this.zzaaL.get(zzl$zza0);
            if(zzl$zzb0 == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + zzl$zza0);
            }
            if(!zzl$zzb0.zza(serviceConnection0)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zzl$zza0);
            }
            zzl$zzb0.zzb(serviceConnection0, s);
            if(zzl$zzb0.zznW()) {
                Message message0 = this.mHandler.obtainMessage(0, zzl$zzb0);
                this.mHandler.sendMessageDelayed(message0, this.zzaaN);
            }
        }
    }

    @Override  // com.google.android.gms.common.internal.zzk
    public void zzb(ComponentName componentName0, ServiceConnection serviceConnection0, String s) {
        this.zzb(new zza(componentName0), serviceConnection0, s);
    }

    @Override  // com.google.android.gms.common.internal.zzk
    public void zzb(String s, ServiceConnection serviceConnection0, String s1) {
        this.zzb(new zza(s), serviceConnection0, s1);
    }
}

