package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzf;
import java.util.Collection;
import java.util.Locale;

public final class CastMediaControlIntent {
    public static final String ACTION_SYNC_STATUS = "com.google.android.gms.cast.ACTION_SYNC_STATUS";
    @Deprecated
    public static final String CATEGORY_CAST = "com.google.android.gms.cast.CATEGORY_CAST";
    public static final String DEFAULT_MEDIA_RECEIVER_APPLICATION_ID = "CC1AD845";
    public static final int ERROR_CODE_REQUEST_FAILED = 1;
    public static final int ERROR_CODE_SESSION_START_FAILED = 2;
    public static final int ERROR_CODE_TEMPORARILY_DISCONNECTED = 3;
    public static final String EXTRA_CAST_APPLICATION_ID = "com.google.android.gms.cast.EXTRA_CAST_APPLICATION_ID";
    public static final String EXTRA_CAST_LANGUAGE_CODE = "com.google.android.gms.cast.EXTRA_CAST_LANGUAGE_CODE";
    public static final String EXTRA_CAST_RELAUNCH_APPLICATION = "com.google.android.gms.cast.EXTRA_CAST_RELAUNCH_APPLICATION";
    public static final String EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS = "com.google.android.gms.cast.EXTRA_CAST_STOP_APPLICATION_WHEN_SESSION_ENDS";
    public static final String EXTRA_CUSTOM_DATA = "com.google.android.gms.cast.EXTRA_CUSTOM_DATA";
    public static final String EXTRA_DEBUG_LOGGING_ENABLED = "com.google.android.gms.cast.EXTRA_DEBUG_LOGGING_ENABLED";
    public static final String EXTRA_ERROR_CODE = "com.google.android.gms.cast.EXTRA_ERROR_CODE";

    public static String categoryForCast(String applicationId) throws IllegalArgumentException {
        if(applicationId == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        return CastMediaControlIntent.zza("com.google.android.gms.cast.CATEGORY_CAST", applicationId, null);
    }

    public static String categoryForCast(String applicationId, Collection collection0) {
        if(applicationId == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        if(collection0 == null) {
            throw new IllegalArgumentException("namespaces cannot be null");
        }
        return CastMediaControlIntent.zza("com.google.android.gms.cast.CATEGORY_CAST", applicationId, collection0);
    }

    public static String categoryForCast(Collection collection0) throws IllegalArgumentException {
        if(collection0 == null) {
            throw new IllegalArgumentException("namespaces cannot be null");
        }
        return CastMediaControlIntent.zza("com.google.android.gms.cast.CATEGORY_CAST", null, collection0);
    }

    // 去混淆评级： 低(20)
    public static String categoryForRemotePlayback() {
        return "com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK";
    }

    public static String categoryForRemotePlayback(String applicationId) throws IllegalArgumentException {
        if(TextUtils.isEmpty(applicationId)) {
            throw new IllegalArgumentException("applicationId cannot be null or empty");
        }
        return CastMediaControlIntent.zza("com.google.android.gms.cast.CATEGORY_CAST_REMOTE_PLAYBACK", applicationId, null);
    }

    public static String languageTagForLocale(Locale locale) {
        return zzf.zzb(locale);
    }

    private static String zza(String s, String s1, Collection collection0) throws IllegalArgumentException [...] // Potential decryptor
}

