package com.google.android.gms.gcm;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.iid.InstanceID;
import java.io.IOException;
import java.util.regex.Pattern;

public class GcmPubSub {
    private static GcmPubSub zzavH;
    private InstanceID zzavI;
    private static final Pattern zzavJ;

    static {
        GcmPubSub.zzavJ = Pattern.compile("/topics/[a-zA-Z0-9-_.~%]{1,900}");
    }

    private GcmPubSub(Context context) {
        this.zzavI = InstanceID.getInstance(context);
    }

    public static GcmPubSub getInstance(Context context) {
        synchronized(GcmPubSub.class) {
            if(GcmPubSub.zzavH == null) {
                GcmPubSub.zzavH = new GcmPubSub(context);
            }
            return GcmPubSub.zzavH;
        }
    }

    public void subscribe(String registrationToken, String topic, Bundle extras) throws IOException {
        if(registrationToken == null || registrationToken.isEmpty()) {
            throw new IllegalArgumentException("Invalid appInstanceToken: " + registrationToken);
        }
        if(topic == null || !GcmPubSub.zzavJ.matcher(topic).matches()) {
            throw new IllegalArgumentException("Invalid topic name: " + topic);
        }
        if(extras == null) {
            extras = new Bundle();
        }
        extras.putString("gcm.topic", topic);
        this.zzavI.getToken(registrationToken, topic, extras);
    }

    public void unsubscribe(String registrationToken, String topic) throws IOException {
        Bundle bundle0 = new Bundle();
        bundle0.putString("gcm.topic", topic);
        this.zzavI.zzb(registrationToken, topic, bundle0);
    }
}

