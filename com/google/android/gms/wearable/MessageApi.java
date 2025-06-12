package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

public interface MessageApi {
    public interface MessageListener {
        void onMessageReceived(MessageEvent arg1);
    }

    public interface SendMessageResult extends Result {
        int getRequestId();
    }

    public static final int UNKNOWN_REQUEST_ID = -1;

    PendingResult addListener(GoogleApiClient arg1, MessageListener arg2);

    PendingResult removeListener(GoogleApiClient arg1, MessageListener arg2);

    PendingResult sendMessage(GoogleApiClient arg1, String arg2, String arg3, byte[] arg4);
}

