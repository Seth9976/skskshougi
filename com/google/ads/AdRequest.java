package com.google.ads;

@Deprecated
public final class AdRequest {
    public static enum ErrorCode {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");

        private final String description;

        private ErrorCode(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return this.description;
        }
    }

    public static enum Gender {
        UNKNOWN,
        MALE,
        FEMALE;

    }

    public static final String LOGTAG = "Ads";
    public static final String TEST_EMULATOR = null;
    public static final String VERSION = "0.0.0";

    static {
        AdRequest.TEST_EMULATOR = com.google.android.gms.ads.AdRequest.DEVICE_ID_EMULATOR;
    }
}

