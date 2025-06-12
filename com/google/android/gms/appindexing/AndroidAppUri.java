package com.google.android.gms.appindexing;

import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzt;
import java.util.List;

public final class AndroidAppUri {
    private final Uri mUri;

    private AndroidAppUri(Uri uri) {
        this.mUri = uri;
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object) {
        return object instanceof AndroidAppUri ? this.mUri.equals(((AndroidAppUri)object).mUri) : false;
    }

    public Uri getDeepLinkUri() {
        List list0 = this.mUri.getPathSegments();
        if(list0.size() > 0) {
            String s = (String)list0.get(0);
            Uri.Builder uri$Builder0 = new Uri.Builder();
            uri$Builder0.scheme(s);
            if(list0.size() > 1) {
                uri$Builder0.authority(((String)list0.get(1)));
                for(int v = 2; v < list0.size(); ++v) {
                    uri$Builder0.appendPath(((String)list0.get(v)));
                }
            }
            uri$Builder0.encodedQuery(this.mUri.getEncodedQuery());
            uri$Builder0.encodedFragment(this.mUri.getEncodedFragment());
            return uri$Builder0.build();
        }
        return null;
    }

    public String getPackageName() {
        return this.mUri.getAuthority();
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.mUri});
    }

    public static AndroidAppUri newAndroidAppUri(Uri uri) {
        AndroidAppUri androidAppUri0 = new AndroidAppUri(uri);
        if(!AndroidAppUri.zza(androidAppUri0)) {
            throw new IllegalArgumentException("AndroidAppUri validation failed.");
        }
        return androidAppUri0;
    }

    public static AndroidAppUri newAndroidAppUri(String packageName, Uri deepLink) {
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("android-app").authority(packageName);
        if(deepLink != null) {
            uri$Builder0.appendPath(deepLink.getScheme());
            if(deepLink.getAuthority() != null) {
                uri$Builder0.appendPath(deepLink.getAuthority());
            }
            for(Object object0: deepLink.getPathSegments()) {
                uri$Builder0.appendPath(((String)object0));
            }
            uri$Builder0.encodedQuery(deepLink.getEncodedQuery()).encodedFragment(deepLink.getEncodedFragment());
        }
        return new AndroidAppUri(uri$Builder0.build());
    }

    @Override
    public String toString() {
        return this.mUri.toString();
    }

    public Uri toUri() {
        return this.mUri;
    }

    private static boolean zza(AndroidAppUri androidAppUri0) {
        if(!"android-app".equals(androidAppUri0.mUri.getScheme())) {
            throw new IllegalArgumentException("android-app scheme is required.");
        }
        if(TextUtils.isEmpty(androidAppUri0.getPackageName())) {
            throw new IllegalArgumentException("Package name is empty.");
        }
        Uri uri0 = AndroidAppUri.newAndroidAppUri(androidAppUri0.getPackageName(), androidAppUri0.getDeepLinkUri()).toUri();
        if(!androidAppUri0.mUri.equals(uri0)) {
            throw new IllegalArgumentException("URI is not canonical.");
        }
        return true;
    }
}

