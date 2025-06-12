package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.List;

public interface Connections {
    public interface ConnectionRequestListener {
        void onConnectionRequest(String arg1, String arg2, String arg3, byte[] arg4);
    }

    public interface ConnectionResponseCallback {
        void onConnectionResponse(String arg1, Status arg2, byte[] arg3);
    }

    public interface EndpointDiscoveryListener {
        void onEndpointFound(String arg1, String arg2, String arg3, String arg4);

        void onEndpointLost(String arg1);
    }

    public interface MessageListener {
        void onDisconnected(String arg1);

        void onMessageReceived(String arg1, byte[] arg2, boolean arg3);
    }

    public interface StartAdvertisingResult extends Result {
        String getLocalEndpointName();
    }

    public static final long DURATION_INDEFINITE = 0L;
    public static final int MAX_RELIABLE_MESSAGE_LEN = 0x1000;
    public static final int MAX_UNRELIABLE_MESSAGE_LEN = 0x490;
    public static final List zzaFo;

    static {
        Connections.zzaFo = Arrays.asList(new Integer[]{1, 2});
    }

    PendingResult acceptConnectionRequest(GoogleApiClient arg1, String arg2, byte[] arg3, MessageListener arg4);

    void disconnectFromEndpoint(GoogleApiClient arg1, String arg2);

    String getLocalDeviceId(GoogleApiClient arg1);

    String getLocalEndpointId(GoogleApiClient arg1);

    PendingResult rejectConnectionRequest(GoogleApiClient arg1, String arg2);

    PendingResult sendConnectionRequest(GoogleApiClient arg1, String arg2, String arg3, byte[] arg4, ConnectionResponseCallback arg5, MessageListener arg6);

    void sendReliableMessage(GoogleApiClient arg1, String arg2, byte[] arg3);

    void sendReliableMessage(GoogleApiClient arg1, List arg2, byte[] arg3);

    void sendUnreliableMessage(GoogleApiClient arg1, String arg2, byte[] arg3);

    void sendUnreliableMessage(GoogleApiClient arg1, List arg2, byte[] arg3);

    PendingResult startAdvertising(GoogleApiClient arg1, String arg2, AppMetadata arg3, long arg4, ConnectionRequestListener arg5);

    PendingResult startDiscovery(GoogleApiClient arg1, String arg2, long arg3, EndpointDiscoveryListener arg4);

    void stopAdvertising(GoogleApiClient arg1);

    void stopAllEndpoints(GoogleApiClient arg1);

    void stopDiscovery(GoogleApiClient arg1, String arg2);
}

