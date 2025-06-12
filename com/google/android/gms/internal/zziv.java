package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.zzk;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi.ActionResult;
import com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class zziv implements zzk, AppIndexApi {
    @Deprecated
    static final class zza implements ActionResult {
        private zziv zzNS;
        private PendingResult zzNT;
        private Action zzNU;

        zza(zziv zziv0, PendingResult pendingResult0, Action action0) {
            this.zzNS = zziv0;
            this.zzNT = pendingResult0;
            this.zzNU = action0;
        }

        @Override  // com.google.android.gms.appindexing.AppIndexApi$ActionResult
        public PendingResult end(GoogleApiClient apiClient) {
            UsageInfo[] arr_usageInfo = {zziu.zza(this.zzNU, System.currentTimeMillis(), "org.dyndns.vivi.SkskShogi", 2)};
            return this.zzNS.zza(apiClient, arr_usageInfo);
        }

        @Override  // com.google.android.gms.appindexing.AppIndexApi$ActionResult
        public PendingResult getPendingResult() {
            return this.zzNT;
        }
    }

    static abstract class zzb extends com.google.android.gms.common.api.zza.zza {
        public zzb(GoogleApiClient googleApiClient0) {
            super(com.google.android.gms.appdatasearch.zza.zzMO, googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.zza$zza
        protected void zza(Client api$Client0) throws RemoteException {
            this.zza(((zzit)api$Client0));
        }

        protected abstract void zza(zziq arg1) throws RemoteException;

        protected final void zza(zzit zzit0) throws RemoteException {
            this.zza(zzit0.zzkO());
        }
    }

    static abstract class zzc extends zzb {
        zzc(GoogleApiClient googleApiClient0) {
            super(googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected Result createFailedResult(Status x0) {
            return x0;
        }

        protected Status zzb(Status status0) [...] // Inlined contents
    }

    static final class zzd extends zzis {
        public zzd(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            super(zza$zzb0);
        }

        @Override  // com.google.android.gms.internal.zzis
        public void zza(Status status0) {
            this.zzNO.zzm(status0);
        }
    }

    @Override  // com.google.android.gms.appindexing.AppIndexApi
    public ActionResult action(GoogleApiClient apiClient, Action action) {
        return new zza(this, this.zza(apiClient, action, 1), action);
    }

    @Override  // com.google.android.gms.appindexing.AppIndexApi
    public PendingResult end(GoogleApiClient apiClient, Action action) {
        return this.zza(apiClient, action, 2);
    }

    @Override  // com.google.android.gms.appindexing.AppIndexApi
    public PendingResult start(GoogleApiClient apiClient, Action action) {
        return this.zza(apiClient, action, 1);
    }

    @Override  // com.google.android.gms.appindexing.AppIndexApi
    public PendingResult view(GoogleApiClient apiClient, Activity activity, Intent viewIntent, String title, Uri webUrl, List list0) {
        zziv.zzi(list0);
        return this.zza(apiClient, new UsageInfo[]{new UsageInfo("org.dyndns.vivi.SkskShogi", viewIntent, title, webUrl, null, list0, 1)});
    }

    @Override  // com.google.android.gms.appindexing.AppIndexApi
    public PendingResult view(GoogleApiClient apiClient, Activity activity, Uri appIndexingUrl, String title, Uri webUrl, List list0) {
        zziv.zzb("org.dyndns.vivi.SkskShogi", appIndexingUrl);
        return this.view(apiClient, activity, zziv.zza("org.dyndns.vivi.SkskShogi", appIndexingUrl), title, webUrl, list0);
    }

    @Override  // com.google.android.gms.appindexing.AppIndexApi
    public PendingResult viewEnd(GoogleApiClient apiClient, Activity activity, Intent viewIntent) {
        return this.zza(apiClient, new UsageInfo[]{new com.google.android.gms.appdatasearch.UsageInfo.zza().zza(UsageInfo.zza("org.dyndns.vivi.SkskShogi", viewIntent)).zzw(System.currentTimeMillis()).zzal(0).zzam(2).zzkN()});
    }

    @Override  // com.google.android.gms.appindexing.AppIndexApi
    public PendingResult viewEnd(GoogleApiClient apiClient, Activity activity, Uri appUri) {
        return this.viewEnd(apiClient, activity, zziv.zza("org.dyndns.vivi.SkskShogi", appUri));
    }

    public static Intent zza(String s, Uri uri0) {
        zziv.zzb(s, uri0);
        List list0 = uri0.getPathSegments();
        String s1 = (String)list0.get(0);
        Uri.Builder uri$Builder0 = new Uri.Builder();
        uri$Builder0.scheme(s1);
        if(list0.size() > 1) {
            uri$Builder0.authority(((String)list0.get(1)));
            for(int v = 2; v < list0.size(); ++v) {
                uri$Builder0.appendPath(((String)list0.get(v)));
            }
        }
        uri$Builder0.encodedQuery(uri0.getEncodedQuery());
        uri$Builder0.encodedFragment(uri0.getEncodedFragment());
        return new Intent("android.intent.action.VIEW", uri$Builder0.build());
    }

    private PendingResult zza(GoogleApiClient googleApiClient0, Action action0, int v) {
        return this.zza(googleApiClient0, new UsageInfo[]{zziu.zza(action0, System.currentTimeMillis(), "org.dyndns.vivi.SkskShogi", v)});
    }

    public PendingResult zza(GoogleApiClient googleApiClient0, UsageInfo[] arr_usageInfo) {
        return googleApiClient0.zza(new zzc(googleApiClient0) {
            @Override  // com.google.android.gms.internal.zziv$zzb
            protected void zza(zziq zziq0) throws RemoteException {
                zziq0.zza(new zzd(this), "org.dyndns.vivi.SkskShogi", arr_usageInfo);
            }
        });
    }

    private static void zzb(String s, Uri uri0) {
        if(!"android-app".equals(uri0.getScheme())) {
            throw new IllegalArgumentException("AppIndex: The URI scheme must be \'android-app\' and follow the format (android-app://<package_name>/<scheme>/[host_path]). Provided URI: " + uri0);
        }
        if(s != null && !s.equals(uri0.getHost())) {
            throw new IllegalArgumentException("AppIndex: The URI host must match the package name and follow the format (android-app://<package_name>/<scheme>/[host_path]). Provided URI: " + uri0);
        }
        List list0 = uri0.getPathSegments();
        if(list0.isEmpty() || ((String)list0.get(0)).isEmpty()) {
            throw new IllegalArgumentException("AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/[host_path]). Provided URI: " + uri0);
        }
    }

    public static void zzi(List list0) {
        if(list0 != null) {
            for(Object object0: list0) {
                zziv.zzb(null, ((AppIndexingLink)object0).appIndexingUrl);
            }
        }
    }
}

