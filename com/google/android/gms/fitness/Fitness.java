package com.google.android.gms.fitness;

import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.zzma.zza;
import com.google.android.gms.internal.zzmc.zzb;
import com.google.android.gms.internal.zzmx;
import com.google.android.gms.internal.zzmz;
import com.google.android.gms.internal.zzna;
import com.google.android.gms.internal.zznb;
import com.google.android.gms.internal.zznc;
import com.google.android.gms.internal.zznd;
import com.google.android.gms.internal.zzne;
import com.google.android.gms.internal.zznf;
import com.google.android.gms.internal.zznh;
import java.util.concurrent.TimeUnit;

public class Fitness {
    public static final String ACTION_TRACK = "vnd.google.fitness.TRACK";
    public static final String ACTION_VIEW = "vnd.google.fitness.VIEW";
    public static final String ACTION_VIEW_GOAL = "vnd.google.fitness.VIEW_GOAL";
    @Deprecated
    public static final Void API = null;
    public static final Api BLE_API = null;
    public static final BleApi BleApi = null;
    public static final Api CONFIG_API = null;
    public static final ConfigApi ConfigApi = null;
    public static final String EXTRA_END_TIME = "vnd.google.fitness.end_time";
    public static final String EXTRA_START_TIME = "vnd.google.fitness.start_time";
    public static final Api HISTORY_API;
    public static final HistoryApi HistoryApi;
    public static final Api RECORDING_API;
    public static final RecordingApi RecordingApi;
    public static final Scope SCOPE_ACTIVITY_READ;
    public static final Scope SCOPE_ACTIVITY_READ_WRITE;
    public static final Scope SCOPE_BODY_READ;
    public static final Scope SCOPE_BODY_READ_WRITE;
    public static final Scope SCOPE_LOCATION_READ;
    public static final Scope SCOPE_LOCATION_READ_WRITE;
    public static final Scope SCOPE_NUTRITION_READ;
    public static final Scope SCOPE_NUTRITION_READ_WRITE;
    public static final Api SENSORS_API;
    public static final Api SESSIONS_API;
    public static final SensorsApi SensorsApi;
    public static final SessionsApi SessionsApi;
    public static final Api zzada;
    public static final ClientKey zzajA;
    public static final ClientKey zzajB;
    public static final ClientKey zzajC;
    public static final zzmx zzajD;
    public static final ClientKey zzajw;
    public static final ClientKey zzajx;
    public static final ClientKey zzajy;
    public static final ClientKey zzajz;

    static {
        Fitness.zzajw = new ClientKey();
        Fitness.zzajx = new ClientKey();
        Fitness.zzajy = new ClientKey();
        Fitness.zzajz = new ClientKey();
        Fitness.zzajA = new ClientKey();
        Fitness.zzajB = new ClientKey();
        Fitness.zzajC = new ClientKey();
        Fitness.API = null;
        Fitness.SENSORS_API = new Api("Fitness.SENSORS_API", new zzb(), Fitness.zzajB, new Scope[0]);
        Fitness.SensorsApi = new zzne();
        Fitness.RECORDING_API = new Api("Fitness.RECORDING_API", new com.google.android.gms.internal.zzmb.zzb(), Fitness.zzajA, new Scope[0]);
        Fitness.RecordingApi = new zznd();
        Fitness.SESSIONS_API = new Api("Fitness.SESSIONS_API", new com.google.android.gms.internal.zzmd.zzb(), Fitness.zzajC, new Scope[0]);
        Fitness.SessionsApi = new zznf();
        Fitness.HISTORY_API = new Api("Fitness.HISTORY_API", new com.google.android.gms.internal.zzlz.zzb(), Fitness.zzajy, new Scope[0]);
        Fitness.HistoryApi = new zznb();
        Fitness.CONFIG_API = new Api("Fitness.CONFIG_API", new com.google.android.gms.internal.zzly.zzb(), Fitness.zzajx, new Scope[0]);
        Fitness.ConfigApi = new zzna();
        Fitness.BLE_API = new Api("Fitness.BLE_API", new com.google.android.gms.internal.zzlx.zzb(), Fitness.zzajw, new Scope[0]);
        Fitness.BleApi = Fitness.zzqo();
        Fitness.zzada = new Api("Fitness.INTERNAL_API", new zza(), Fitness.zzajz, new Scope[0]);
        Fitness.zzajD = new zznc();
        Fitness.SCOPE_ACTIVITY_READ = new Scope("https://www.googleapis.com/auth/fitness.activity.read");
        Fitness.SCOPE_ACTIVITY_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.activity.write");
        Fitness.SCOPE_LOCATION_READ = new Scope("https://www.googleapis.com/auth/fitness.location.read");
        Fitness.SCOPE_LOCATION_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.location.write");
        Fitness.SCOPE_BODY_READ = new Scope("https://www.googleapis.com/auth/fitness.body.read");
        Fitness.SCOPE_BODY_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.body.write");
        Fitness.SCOPE_NUTRITION_READ = new Scope("https://www.googleapis.com/auth/fitness.nutrition.read");
        Fitness.SCOPE_NUTRITION_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.nutrition.write");
    }

    public static long getEndTime(Intent intent, TimeUnit timeUnit) {
        long v = intent.getLongExtra("vnd.google.fitness.end_time", -1L);
        return v == -1L ? -1L : timeUnit.convert(v, TimeUnit.MILLISECONDS);
    }

    public static long getStartTime(Intent intent, TimeUnit timeUnit) {
        long v = intent.getLongExtra("vnd.google.fitness.start_time", -1L);
        return v == -1L ? -1L : timeUnit.convert(v, TimeUnit.MILLISECONDS);
    }

    private static BleApi zzqo() {
        return Build.VERSION.SDK_INT >= 18 ? new zzmz() : new zznh();
    }
}

