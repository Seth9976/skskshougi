package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import java.util.Map;

public interface CapabilityApi {
    public interface AddLocalCapabilityResult extends Result {
    }

    public interface CapabilityListener {
        void onCapabilityChanged(CapabilityInfo arg1);
    }

    public interface GetAllCapabilitiesResult extends Result {
        Map getAllCapabilities();
    }

    public interface GetCapabilityResult extends Result {
        CapabilityInfo getCapability();
    }

    public interface RemoveLocalCapabilityResult extends Result {
    }

    public static final int FILTER_ALL = 0;
    public static final int FILTER_REACHABLE = 1;

    PendingResult addCapabilityListener(GoogleApiClient arg1, CapabilityListener arg2, String arg3);

    PendingResult addLocalCapability(GoogleApiClient arg1, String arg2);

    PendingResult getAllCapabilities(GoogleApiClient arg1, int arg2);

    PendingResult getCapability(GoogleApiClient arg1, String arg2, int arg3);

    PendingResult removeCapabilityListener(GoogleApiClient arg1, CapabilityListener arg2, String arg3);

    PendingResult removeLocalCapability(GoogleApiClient arg1, String arg2);
}

