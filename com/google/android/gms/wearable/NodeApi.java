package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import java.util.List;

public interface NodeApi {
    public interface GetConnectedNodesResult extends Result {
        List getNodes();
    }

    public interface GetLocalNodeResult extends Result {
        Node getNode();
    }

    public interface NodeListener {
        void onPeerConnected(Node arg1);

        void onPeerDisconnected(Node arg1);
    }

    public interface zza {
        void onConnectedNodes(List arg1);
    }

    PendingResult addListener(GoogleApiClient arg1, NodeListener arg2);

    PendingResult getConnectedNodes(GoogleApiClient arg1);

    PendingResult getLocalNode(GoogleApiClient arg1);

    PendingResult removeListener(GoogleApiClient arg1, NodeListener arg2);
}

