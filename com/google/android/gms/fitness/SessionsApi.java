package com.google.android.gms.fitness;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;

public interface SessionsApi {
    public static class ViewIntentBuilder {
        private final Context mContext;
        private String zzajI;
        private Session zzajJ;
        private boolean zzajK;

        public ViewIntentBuilder(Context context) {
            this.zzajK = false;
            this.mContext = context;
        }

        public Intent build() {
            zzu.zza(this.zzajJ != null, "Session must be set");
            Intent intent0 = new Intent("vnd.google.fitness.VIEW");
            intent0.setType(Session.getMimeType(this.zzajJ.getActivity()));
            zzc.zza(this.zzajJ, intent0, "vnd.google.fitness.session");
            if(!this.zzajK) {
                this.zzajI = this.zzajJ.getAppPackageName();
            }
            return this.zzj(intent0);
        }

        public ViewIntentBuilder setPreferredApplication(String packageName) {
            this.zzajI = packageName;
            this.zzajK = true;
            return this;
        }

        public ViewIntentBuilder setSession(Session session) {
            this.zzajJ = session;
            return this;
        }

        private Intent zzj(Intent intent0) {
            if(this.zzajI != null) {
                Intent intent1 = new Intent(intent0).setPackage(this.zzajI);
                ResolveInfo resolveInfo0 = this.mContext.getPackageManager().resolveActivity(intent1, 0);
                if(resolveInfo0 != null) {
                    intent1.setComponent(new ComponentName(this.zzajI, resolveInfo0.activityInfo.name));
                    return intent1;
                }
            }
            return intent0;
        }
    }

    PendingResult insertSession(GoogleApiClient arg1, SessionInsertRequest arg2);

    PendingResult readSession(GoogleApiClient arg1, SessionReadRequest arg2);

    PendingResult registerForSessions(GoogleApiClient arg1, PendingIntent arg2);

    PendingResult startSession(GoogleApiClient arg1, Session arg2);

    PendingResult stopSession(GoogleApiClient arg1, String arg2);

    PendingResult unregisterForSessions(GoogleApiClient arg1, PendingIntent arg2);
}

