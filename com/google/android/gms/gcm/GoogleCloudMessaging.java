package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.zzc;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class GoogleCloudMessaging {
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String INSTANCE_ID_SCOPE = "GCM";
    @Deprecated
    public static final String MESSAGE_TYPE_DELETED = "deleted_messages";
    @Deprecated
    public static final String MESSAGE_TYPE_MESSAGE = "gcm";
    @Deprecated
    public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";
    @Deprecated
    public static final String MESSAGE_TYPE_SEND_EVENT = "send_event";
    public static int zzavP;
    public static int zzavQ;
    public static int zzavR;
    static GoogleCloudMessaging zzavS;
    private PendingIntent zzavT;
    private Map zzavU;
    private static final AtomicInteger zzavV;
    private final BlockingQueue zzavW;
    final Messenger zzavX;
    private Context zzpH;

    static {
        GoogleCloudMessaging.zzavP = 5000000;
        GoogleCloudMessaging.zzavQ = 6500000;
        GoogleCloudMessaging.zzavR = 7000000;
        GoogleCloudMessaging.zzavV = new AtomicInteger(1);
    }

    public GoogleCloudMessaging() {
        this.zzavW = new LinkedBlockingQueue();
        this.zzavU = Collections.synchronizedMap(new HashMap());
        this.zzavX = new Messenger(new Handler(Looper.getMainLooper()) {
            @Override  // android.os.Handler
            public void handleMessage(Message msg) {
                if(msg == null || !(msg.obj instanceof Intent)) {
                    Log.w("GCM", "Dropping invalid message");
                }
                Intent intent0 = (Intent)msg.obj;
                if("com.google.android.c2dm.intent.REGISTRATION".equals(intent0.getAction())) {
                    GoogleCloudMessaging.this.zzavW.add(intent0);
                    return;
                }
                if(!GoogleCloudMessaging.this.zzl(intent0)) {
                    intent0.setPackage("org.dyndns.vivi.SkskShogi");
                    GoogleCloudMessaging.this.zzpH.sendBroadcast(intent0);
                }
            }
        });
    }

    public void close() {
        GoogleCloudMessaging.zzavS = null;
        zza.zzavF = null;
        this.zztT();
    }

    public static GoogleCloudMessaging getInstance(Context context) {
        synchronized(GoogleCloudMessaging.class) {
            if(GoogleCloudMessaging.zzavS == null) {
                GoogleCloudMessaging.zzavS = new GoogleCloudMessaging();
                GoogleCloudMessaging googleCloudMessaging0 = GoogleCloudMessaging.zzavS;
                googleCloudMessaging0.zzpH = context.getApplicationContext();
            }
            return GoogleCloudMessaging.zzavS;
        }
    }

    public String getMessageType(Intent intent) {
        if(!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        String s = intent.getStringExtra("message_type");
        return s == null ? "gcm" : s;
    }

    @Deprecated
    public String register(String[] senderIds) throws IOException {
        String s1;
        synchronized(this) {
            String s = this.zzc(senderIds);
            Bundle bundle0 = new Bundle();
            if(GoogleCloudMessaging.zzas(this.zzpH).contains(".gsf")) {
                bundle0.putString("legacy.sender", s);
                s1 = InstanceID.getInstance(this.zzpH).getToken(s, "GCM", bundle0);
            }
            else {
                bundle0.putString("sender", s);
                s1 = GoogleCloudMessaging.zza(this.zzx(bundle0), "registration_id");
            }
            return s1;
        }
    }

    public void send(String to, String msgId, long timeToLive, Bundle data) throws IOException {
        this.zza(to, msgId, timeToLive, -1, data);
    }

    public void send(String to, String msgId, Bundle data) throws IOException {
        this.send(to, msgId, -1L, data);
    }

    @Deprecated
    public void unregister() throws IOException {
        synchronized(this) {
            if(Looper.getMainLooper() == Looper.myLooper()) {
                throw new IOException("MAIN_THREAD");
            }
            InstanceID.getInstance(this.zzpH).deleteInstanceID();
        }
    }

    static String zza(Intent intent0, String s) throws IOException {
        if(intent0 == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String s1 = intent0.getStringExtra(s);
        if(s1 != null) {
            return s1;
        }
        String s2 = intent0.getStringExtra("error");
        throw s2 == null ? new IOException("SERVICE_NOT_AVAILABLE") : new IOException(s2);
    }

    private void zza(String s, String s1, long v, int v1, Bundle bundle0) throws IOException {
        if(s == null) {
            throw new IllegalArgumentException("Missing \'to\'");
        }
        Intent intent0 = new Intent("com.google.android.gcm.intent.SEND");
        if(bundle0 != null) {
            intent0.putExtras(bundle0);
        }
        this.zzm(intent0);
        intent0.setPackage(GoogleCloudMessaging.zzas(this.zzpH));
        intent0.putExtra("google.to", s);
        intent0.putExtra("google.message_id", s1);
        intent0.putExtra("google.ttl", Long.toString(v));
        intent0.putExtra("google.delay", Integer.toString(v1));
        if(GoogleCloudMessaging.zzas(this.zzpH).contains(".gsf")) {
            Bundle bundle1 = new Bundle();
            for(Object object0: bundle0.keySet()) {
                String s2 = (String)object0;
                Object object1 = bundle0.get(s2);
                if(object1 instanceof String) {
                    bundle1.putString("gcm." + s2, ((String)object1));
                }
            }
            bundle1.putString("google.to", s);
            bundle1.putString("google.message_id", s1);
            InstanceID.getInstance(this.zzpH).zzc("GCM", "upstream", bundle1);
            return;
        }
        this.zzpH.sendOrderedBroadcast(intent0, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public static String zzas(Context context0) {
        return zzc.zzaw(context0);
    }

    public static int zzat(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            return packageManager0.getPackageInfo(GoogleCloudMessaging.zzas(context0), 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return -1;
        }
    }

    String zzc(String[] arr_s) {
        if(arr_s == null || arr_s.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder stringBuilder0 = new StringBuilder(arr_s[0]);
        for(int v = 1; v < arr_s.length; ++v) {
            stringBuilder0.append(',').append(arr_s[v]);
        }
        return stringBuilder0.toString();
    }

    private boolean zzl(Intent intent0) {
        String s = intent0.getStringExtra("In-Reply-To");
        if(s == null && intent0.hasExtra("error")) {
            s = intent0.getStringExtra("google.message_id");
        }
        if(s != null) {
            Handler handler0 = (Handler)this.zzavU.remove(s);
            if(handler0 != null) {
                Message message0 = Message.obtain();
                message0.obj = intent0;
                return handler0.sendMessage(message0);
            }
        }
        return false;
    }

    void zzm(Intent intent0) {
        synchronized(this) {
            if(this.zzavT == null) {
                Intent intent1 = new Intent();
                intent1.setPackage("com.google.example.invalidpackage");
                this.zzavT = PendingIntent.getBroadcast(this.zzpH, 0, intent1, 0);
            }
            intent0.putExtra("app", this.zzavT);
        }
    }

    // 去混淆评级： 低(40)
    private String zztS() [...] // Potential decryptor

    void zztT() {
        synchronized(this) {
            if(this.zzavT != null) {
                this.zzavT.cancel();
                this.zzavT = null;
            }
        }
    }

    @Deprecated
    Intent zzx(Bundle bundle0) throws IOException {
        if(Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        if(GoogleCloudMessaging.zzat(this.zzpH) < 0) {
            throw new IOException("Google Play Services missing");
        }
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        Intent intent0 = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent0.setPackage(GoogleCloudMessaging.zzas(this.zzpH));
        this.zzm(intent0);
        intent0.putExtra("google.message_id", "google.rpc1");
        intent0.putExtras(bundle0);
        intent0.putExtra("google.messenger", this.zzavX);
        this.zzpH.startService(intent0);
        try {
            return (Intent)this.zzavW.poll(30000L, TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException interruptedException0) {
            throw new IOException(interruptedException0.getMessage());
        }
    }
}

