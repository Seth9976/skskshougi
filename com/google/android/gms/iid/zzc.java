package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class zzc {
    PendingIntent zzavT;
    Messenger zzavX;
    static String zzaxd;
    static int zzaxe;
    static int zzaxf;
    static int zzaxg;
    Map zzaxh;
    Messenger zzaxi;
    MessengerCompat zzaxj;
    long zzaxk;
    long zzaxl;
    int zzaxm;
    int zzaxn;
    long zzaxo;
    Context zzpH;

    static {
        zzc.zzaxd = null;
        zzc.zzaxe = 0;
        zzc.zzaxf = 0;
        zzc.zzaxg = 0;
    }

    public zzc(Context context0) {
        this.zzaxh = new HashMap();
        this.zzpH = context0;
    }

    static String zza(KeyPair keyPair0, String[] arr_s) {
        byte[] arr_b;
        try {
            arr_b = TextUtils.join("\n", arr_s).getBytes("UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            Log.e("InstanceID/Rpc", "Unable to encode string", unsupportedEncodingException0);
            return null;
        }
        try {
            PrivateKey privateKey0 = keyPair0.getPrivate();
            Signature signature0 = Signature.getInstance((privateKey0 instanceof RSAPrivateKey ? "SHA256withRSA" : "SHA256withECDSA"));
            signature0.initSign(privateKey0);
            signature0.update(arr_b);
            return InstanceID.zzm(signature0.sign());
        }
        catch(GeneralSecurityException generalSecurityException0) {
            Log.e("InstanceID/Rpc", "Unable to sign registration request", generalSecurityException0);
            return null;
        }
    }

    Intent zza(Bundle bundle0, KeyPair keyPair0) throws IOException {
        Intent intent0 = this.zzb(bundle0, keyPair0);
        return intent0 == null || !intent0.hasExtra("google.messenger") ? intent0 : this.zzb(bundle0, keyPair0);
    }

    void zza(Bundle bundle0, KeyPair keyPair0, String s) throws IOException {
        long v = SystemClock.elapsedRealtime();
        if(this.zzaxo != 0L && v <= this.zzaxo) {
            Log.w("InstanceID/Rpc", "Backoff mode, next request attempt: " + (this.zzaxo - v) + " interval: " + this.zzaxn);
            throw new IOException("RETRY_LATER");
        }
        this.zzuj();
        if(zzc.zzaxd == null) {
            throw new IOException("MISSING_INSTANCEID_SERVICE");
        }
        this.zzaxk = SystemClock.elapsedRealtime();
        Intent intent0 = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent0.setPackage(zzc.zzaxd);
        bundle0.putString("gmsv", Integer.toString(GoogleCloudMessaging.zzat(this.zzpH)));
        bundle0.putString("osv", "33");
        bundle0.putString("app_ver", Integer.toString(InstanceID.zzau(this.zzpH)));
        bundle0.putString("cliv", "1");
        bundle0.putString("appid", InstanceID.zza(keyPair0));
        String s1 = InstanceID.zzm(keyPair0.getPublic().getEncoded());
        bundle0.putString("pub2", s1);
        bundle0.putString("sig", zzc.zza(keyPair0, new String[]{"org.dyndns.vivi.SkskShogi", s1}));
        intent0.putExtras(bundle0);
        this.zzo(intent0);
        this.zzb(intent0, s);
    }

    public static String zzaw(Context context0) {
        if(zzc.zzaxd != null) {
            return zzc.zzaxd;
        }
        zzc.zzaxe = Process.myUid();
        PackageManager packageManager0 = context0.getPackageManager();
        for(Object object0: packageManager0.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0)) {
            ResolveInfo resolveInfo0 = (ResolveInfo)object0;
            if(packageManager0.checkPermission("com.google.android.c2dm.permission.RECEIVE", resolveInfo0.serviceInfo.packageName) == 0) {
                try {
                    ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo(resolveInfo0.serviceInfo.packageName, 0);
                    Log.w("InstanceID/Rpc", "Found " + applicationInfo0.uid);
                    zzc.zzaxf = applicationInfo0.uid;
                    zzc.zzaxd = resolveInfo0.serviceInfo.packageName;
                    return zzc.zzaxd;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    continue;
                }
            }
            Log.w("InstanceID/Rpc", "Possible malicious package " + resolveInfo0.serviceInfo.packageName + " declares " + "com.google.android.c2dm.intent.REGISTER" + " without permission");
        }
        Log.w("InstanceID/Rpc", "Failed to resolve REGISTER intent, falling back");
        try {
            ApplicationInfo applicationInfo1 = packageManager0.getApplicationInfo("com.google.android.gms", 0);
            zzc.zzaxd = applicationInfo1.packageName;
            zzc.zzaxf = applicationInfo1.uid;
            return zzc.zzaxd;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            try {
                ApplicationInfo applicationInfo2 = packageManager0.getApplicationInfo("com.google.android.gsf", 0);
                zzc.zzaxd = applicationInfo2.packageName;
                zzc.zzaxf = applicationInfo2.uid;
                return zzc.zzaxd;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                Log.w("InstanceID/Rpc", "Both Google Play Services and legacy GSF package are missing");
                return null;
            }
        }
    }

    private Intent zzb(Bundle bundle0, KeyPair keyPair0) throws IOException {
        ConditionVariable conditionVariable0 = new ConditionVariable();
        synchronized(this.getClass()) {
            this.zzaxh.put("0", conditionVariable0);
        }
        this.zza(bundle0, keyPair0, "0");
        conditionVariable0.block(30000L);
        synchronized(this.getClass()) {
            Object object0 = this.zzaxh.remove("0");
            if(object0 instanceof Intent) {
                return (Intent)object0;
            }
            if(object0 instanceof String) {
                throw new IOException(((String)object0));
            }
            Log.w("InstanceID/Rpc", "No response " + object0);
        }
        throw new IOException("TIMEOUT");
    }

    protected void zzb(Intent intent0, String s) {
        this.zzaxk = SystemClock.elapsedRealtime();
        intent0.putExtra("kid", "|ID|" + s + "|");
        intent0.putExtra("X-kid", "|ID|" + s + "|");
        boolean z = "com.google.android.gsf".equals(zzc.zzaxd);
        String s1 = intent0.getStringExtra("useGsf");
        if(s1 != null) {
            z = "1".equals(s1);
        }
        if(Log.isLoggable("InstanceID/Rpc", 3)) {
            Log.d("InstanceID/Rpc", "Sending " + intent0.getExtras());
        }
        if(this.zzaxi != null) {
            intent0.putExtra("google.messenger", this.zzavX);
            Message message0 = Message.obtain();
            message0.obj = intent0;
            try {
                this.zzaxi.send(message0);
                return;
            }
            catch(RemoteException unused_ex) {
                if(Log.isLoggable("InstanceID/Rpc", 3)) {
                    Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
                }
            }
        }
        if(z) {
            Intent intent1 = new Intent("com.google.android.gms.iid.InstanceID");
            intent1.setPackage("org.dyndns.vivi.SkskShogi");
            intent1.putExtra("GSF", intent0);
            this.zzpH.startService(intent1);
            return;
        }
        intent0.putExtra("google.messenger", this.zzavX);
        intent0.putExtra("messenger2", "1");
        if(this.zzaxj != null) {
            Message message1 = Message.obtain();
            message1.obj = intent0;
            try {
                this.zzaxj.send(message1);
                return;
            }
            catch(RemoteException unused_ex) {
                if(Log.isLoggable("InstanceID/Rpc", 3)) {
                    Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
                }
            }
        }
        this.zzpH.startService(intent0);
    }

    private void zzdd(String s) {
        if("com.google.android.gsf".equals(zzc.zzaxd)) {
            ++this.zzaxm;
            if(this.zzaxm >= 3) {
                if(this.zzaxm == 3) {
                    this.zzaxn = new Random().nextInt(1000) + 1000;
                }
                this.zzaxn *= 2;
                this.zzaxo = SystemClock.elapsedRealtime() + ((long)this.zzaxn);
                Log.w("InstanceID/Rpc", "Backoff due to " + s + " for " + this.zzaxn);
            }
        }
    }

    private void zze(Object object0, Object object1) {
        if(object0 instanceof ConditionVariable) {
            ((ConditionVariable)object0).open();
        }
        if(object0 instanceof Messenger) {
            Messenger messenger0 = (Messenger)object0;
            Message message0 = Message.obtain();
            message0.obj = object1;
            try {
                messenger0.send(message0);
            }
            catch(RemoteException remoteException0) {
                Log.w("InstanceID/Rpc", "Failed to send response " + remoteException0);
            }
        }
    }

    public void zze(Message message0) {
        if(message0 == null) {
            return;
        }
        if(message0.obj instanceof Intent) {
            Intent intent0 = (Intent)message0.obj;
            intent0.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
            if(intent0.hasExtra("google.messenger")) {
                Parcelable parcelable0 = intent0.getParcelableExtra("google.messenger");
                if(parcelable0 instanceof MessengerCompat) {
                    this.zzaxj = (MessengerCompat)parcelable0;
                }
                if(parcelable0 instanceof Messenger) {
                    this.zzaxi = (Messenger)parcelable0;
                }
            }
            this.zzr(((Intent)message0.obj));
            return;
        }
        Log.w("InstanceID/Rpc", "Dropping invalid message");
    }

    private void zzi(String s, Object object0) {
        synchronized(this.getClass()) {
            Object object1 = this.zzaxh.get(s);
            this.zzaxh.put(s, object0);
            this.zze(object1, object0);
        }
    }

    void zzo(Intent intent0) {
        synchronized(this) {
            if(this.zzavT == null) {
                Intent intent1 = new Intent();
                intent1.setPackage("com.google.example.invalidpackage");
                this.zzavT = PendingIntent.getBroadcast(this.zzpH, 0, intent1, 0);
            }
            intent0.putExtra("app", this.zzavT);
        }
    }

    String zzp(Intent intent0) throws IOException {
        if(intent0 == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String s = intent0.getStringExtra("registration_id");
        if(s == null) {
            s = intent0.getStringExtra("unregistered");
        }
        intent0.getLongExtra("Retry-After", 0L);
        if(s == null) {
            String s1 = intent0.getStringExtra("error");
            if(s1 != null) {
                throw new IOException(s1);
            }
            Log.w("InstanceID/Rpc", "Unexpected response from GCM " + intent0.getExtras(), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return s;
    }

    void zzq(Intent intent0) {
        String s = intent0.getStringExtra("error");
        if(s == null) {
            Log.w("InstanceID/Rpc", "Unexpected response, no error or registration id " + intent0.getExtras());
            return;
        }
        if(Log.isLoggable("InstanceID/Rpc", 3)) {
            Log.d("InstanceID/Rpc", "Received InstanceID error " + s);
        }
        String s1 = null;
        if(s.startsWith("|")) {
            String[] arr_s = s.split("\\|");
            if(!"ID".equals(arr_s[1])) {
                Log.w("InstanceID/Rpc", "Unexpected structured response " + s);
            }
            if(arr_s.length > 2) {
                s1 = arr_s[2];
                s = arr_s[3];
                if(s.startsWith(":")) {
                    s = s.substring(1);
                }
            }
            else {
                s = "UNKNOWN";
            }
            intent0.putExtra("error", s);
        }
        if(s1 == null) {
            this.zzx(s);
        }
        else {
            this.zzi(s1, s);
        }
        long v = intent0.getLongExtra("Retry-After", 0L);
        if(v > 0L) {
            this.zzaxl = SystemClock.elapsedRealtime();
            this.zzaxn = ((int)v) * 1000;
            this.zzaxo = SystemClock.elapsedRealtime() + ((long)this.zzaxn);
            Log.w("InstanceID/Rpc", "Explicit request from server to backoff: " + this.zzaxn);
            return;
        }
        if("SERVICE_NOT_AVAILABLE".equals(s) || "AUTHENTICATION_FAILED".equals(s)) {
            this.zzdd(s);
        }
    }

    void zzr(Intent intent0) {
        if(intent0 == null) {
            if(!Log.isLoggable("InstanceID/Rpc", 3)) {
                return;
            }
            Log.d("InstanceID/Rpc", "Unexpected response: null");
            return;
        }
        String s = intent0.getAction();
        if(!"com.google.android.c2dm.intent.REGISTRATION".equals(s) && !"com.google.android.gms.iid.InstanceID".equals(s)) {
            if(Log.isLoggable("InstanceID/Rpc", 3)) {
                Log.d("InstanceID/Rpc", "Unexpected response " + intent0.getAction());
                return;
            }
            return;
        }
        String s1 = intent0.getStringExtra("registration_id");
        String s2 = s1 == null ? intent0.getStringExtra("unregistered") : s1;
        if(s2 == null) {
            this.zzq(intent0);
            return;
        }
        this.zzaxk = SystemClock.elapsedRealtime();
        this.zzaxo = 0L;
        this.zzaxm = 0;
        this.zzaxn = 0;
        if(Log.isLoggable("InstanceID/Rpc", 3)) {
            Log.d("InstanceID/Rpc", "AppIDResponse: " + s2 + " " + intent0.getExtras());
        }
        String s3 = null;
        if(s2.startsWith("|")) {
            String[] arr_s = s2.split("\\|");
            if(!"ID".equals(arr_s[1])) {
                Log.w("InstanceID/Rpc", "Unexpected structured response " + s2);
            }
            String s4 = arr_s[2];
            if(arr_s.length > 4) {
                if("SYNC".equals(arr_s[3])) {
                    InstanceIDListenerService.zzav(this.zzpH);
                }
                else if("RST".equals(arr_s[3])) {
                    InstanceIDListenerService.zza(this.zzpH, InstanceID.getInstance(this.zzpH).zzug());
                    intent0.removeExtra("registration_id");
                    this.zzi(s4, intent0);
                    return;
                }
            }
            String s5 = arr_s[arr_s.length - 1];
            if(s5.startsWith(":")) {
                s5 = s5.substring(1);
            }
            intent0.putExtra("registration_id", s5);
            s3 = s4;
        }
        if(s3 == null) {
            this.zzx(intent0);
            return;
        }
        this.zzi(s3, intent0);
    }

    void zzuj() {
        if(this.zzavX != null) {
            return;
        }
        zzc.zzaw(this.zzpH);
        this.zzavX = new Messenger(new Handler(Looper.getMainLooper()) {
            @Override  // android.os.Handler
            public void handleMessage(Message msg) {
                zzc.this.zze(msg);
            }
        });
    }

    public static String zzuk() [...] // Potential decryptor

    private void zzx(Object object0) {
        synchronized(this.getClass()) {
            for(Object object1: this.zzaxh.keySet()) {
                Object object2 = this.zzaxh.get(((String)object1));
                this.zzaxh.put(((String)object1), object0);
                this.zze(object2, object0);
            }
        }
    }
}

