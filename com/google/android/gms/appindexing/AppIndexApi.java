package com.google.android.gms.appindexing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.List;

public interface AppIndexApi {
    @Deprecated
    public interface ActionResult {
        PendingResult end(GoogleApiClient arg1);

        PendingResult getPendingResult();
    }

    @Deprecated
    public static final class AppIndexingLink {
        public final Uri appIndexingUrl;
        public final int viewId;
        public final Uri webUrl;

        public AppIndexingLink(Uri appUri, Uri webUrl, View view) {
            this.appIndexingUrl = appUri;
            this.webUrl = webUrl;
            this.viewId = view.getId();
        }

        public AppIndexingLink(Uri appUri, View view) {
            this(appUri, null, view);
        }
    }

    @Deprecated
    ActionResult action(GoogleApiClient arg1, Action arg2);

    PendingResult end(GoogleApiClient arg1, Action arg2);

    PendingResult start(GoogleApiClient arg1, Action arg2);

    @Deprecated
    PendingResult view(GoogleApiClient arg1, Activity arg2, Intent arg3, String arg4, Uri arg5, List arg6);

    @Deprecated
    PendingResult view(GoogleApiClient arg1, Activity arg2, Uri arg3, String arg4, Uri arg5, List arg6);

    @Deprecated
    PendingResult viewEnd(GoogleApiClient arg1, Activity arg2, Intent arg3);

    @Deprecated
    PendingResult viewEnd(GoogleApiClient arg1, Activity arg2, Uri arg3);
}

