package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.zzo;
import java.util.List;

@zzgd
public final class zzbz {
    public static final zzbv zztC;
    public static final zzbv zztD;
    public static final zzbv zztE;
    public static final zzbv zztF;
    public static final zzbv zztG;
    public static final zzbv zztH;
    public static final zzbv zztI;
    public static final zzbv zztJ;
    public static final zzbv zztK;
    public static final zzbv zztL;
    public static final zzbv zztM;
    public static final zzbv zztN;
    public static final zzbv zztO;
    public static final zzbv zztP;
    public static final zzbv zztQ;
    public static final zzbv zztR;
    public static final zzbv zztS;
    public static final zzbv zztT;
    public static final zzbv zztU;
    public static final zzbv zztV;
    public static final zzbv zztW;
    public static final zzbv zztX;
    public static final zzbv zztY;
    public static final zzbv zztZ;
    public static final zzbv zzua;
    public static final zzbv zzub;
    public static final zzbv zzuc;
    public static final zzbv zzud;
    public static final zzbv zzue;
    public static final zzbv zzuf;
    public static final zzbv zzug;
    public static final zzbv zzuh;
    public static final zzbv zzui;
    public static final zzbv zzuj;
    public static final zzbv zzuk;
    public static final zzbv zzul;
    public static final zzbv zzum;
    public static final zzbv zzun;
    public static final zzbv zzuo;
    public static final zzbv zzup;
    public static final zzbv zzuq;
    public static final zzbv zzur;
    public static final zzbv zzus;
    public static final zzbv zzut;
    public static final zzbv zzuu;
    public static final zzbv zzuv;
    public static final zzbv zzuw;
    public static final zzbv zzux;

    static {
        zzbz.zztC = zzbv.zzO("gads:sdk_core_experiment_id");
        zzbz.zztD = zzbv.zzc("gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html");
        zzbz.zztE = zzbv.zza("gads:request_builder:singleton_webview", Boolean.FALSE);
        zzbz.zztF = zzbv.zzO("gads:request_builder:singleton_webview_experiment_id");
        zzbz.zztG = zzbv.zza("gads:sdk_crash_report_enabled", Boolean.FALSE);
        zzbz.zztH = zzbv.zza("gads:sdk_crash_report_full_stacktrace", Boolean.FALSE);
        zzbz.zztI = zzbv.zza("gads:block_autoclicks", Boolean.FALSE);
        zzbz.zztJ = zzbv.zzO("gads:block_autoclicks_experiment_id");
        zzbz.zztK = zzbv.zzP("gads:prefetch:experiment_id");
        zzbz.zztL = zzbv.zzO("gads:spam_app_context:experiment_id");
        zzbz.zztM = zzbv.zza("gads:spam_app_context:enabled", Boolean.FALSE);
        zzbz.zztN = zzbv.zzO("gads:video_stream_cache:experiment_id");
        zzbz.zztO = zzbv.zza("gads:video_stream_cache:limit_count", 5);
        zzbz.zztP = zzbv.zza("gads:video_stream_cache:limit_space", 0x800000);
        zzbz.zztQ = zzbv.zzb("gads:video_stream_cache:limit_time_sec", 300L);
        zzbz.zztR = zzbv.zzb("gads:video_stream_cache:notify_interval_millis", 1000L);
        zzbz.zztS = zzbv.zza("gads:video_stream_cache:connect_timeout_millis", 10000);
        zzbz.zztT = zzbv.zzP("gads:spam_ad_id_decorator:experiment_id");
        zzbz.zztU = zzbv.zza("gads:spam_ad_id_decorator:enabled", Boolean.FALSE);
        zzbz.zztV = zzbv.zzc("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");
        zzbz.zztW = zzbv.zzc("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");
        zzbz.zztX = zzbv.zzc("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");
        zzbz.zztY = zzbv.zza("gads:enabled_sdk_csi", Boolean.FALSE);
        zzbz.zztZ = zzbv.zza("gads:sdk_csi_batch_size", 20);
        zzbz.zzua = zzbv.zzc("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
        zzbz.zzub = zzbv.zza("gads:sdk_csi_write_to_file", Boolean.FALSE);
        zzbz.zzuc = zzbv.zza("gads:enable_content_fetching", Boolean.TRUE);
        zzbz.zzud = zzbv.zza("gads:content_length_weight", 1);
        zzbz.zzue = zzbv.zza("gads:content_age_weight", 1);
        zzbz.zzuf = zzbv.zza("gads:min_content_len", 11);
        zzbz.zzug = zzbv.zza("gads:fingerprint_number", 10);
        zzbz.zzuh = zzbv.zza("gads:sleep_sec", 10);
        zzbz.zzui = zzbv.zzO("gads:kitkat_interstitial_workaround:experiment_id");
        zzbz.zzuj = zzbv.zza("gads:kitkat_interstitial_workaround:enabled", Boolean.TRUE);
        zzbz.zzuk = zzbv.zza("gads:interstitial_follow_url", Boolean.TRUE);
        zzbz.zzul = zzbv.zza("gads:interstitial_follow_url:register_click", Boolean.TRUE);
        zzbz.zzum = zzbv.zzO("gads:interstitial_follow_url:experiment_id");
        zzbz.zzun = zzbv.zza("gads:analytics_enabled", Boolean.TRUE);
        zzbz.zzuo = zzbv.zza("gads:ad_key_enabled", Boolean.FALSE);
        zzbz.zzup = zzbv.zza("gads:webview_cache_version", 0);
        zzbz.zzuq = zzbv.zzP("gads:pan:experiment_id");
        zzbz.zzur = zzbv.zzc("gads:native:engine_url", "//googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
        zzbz.zzus = zzbv.zza("gads:ad_manager_creator:enabled", Boolean.TRUE);
        zzbz.zzut = zzbv.zza("gads:log:verbose_enabled", Boolean.FALSE);
        zzbz.zzuu = zzbv.zza("gads:sdk_less_mediation:enabled", Boolean.TRUE);
        zzbz.zzuv = zzbv.zza("gads:device_info_caching:enabled", Boolean.TRUE);
        zzbz.zzuw = zzbv.zzb("gads:device_info_caching_expiry_ms:expiry", 300000L);
        zzbz.zzux = zzbv.zza("gads:gen204_signals:enabled", Boolean.FALSE);
    }

    public static List zzdb() {
        return zzo.zzbD().zzdb();
    }

    public static void zzw(Context context0) {
        zzo.zzbE().zzw(context0);
    }

    // 去混淆评级： 低(20)
    public static List zzx(Context context0) {
        return zzk.zzcA().zzP(context0) ? zzo.zzbD().zzda() : null;
    }
}

