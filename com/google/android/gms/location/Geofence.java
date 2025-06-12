package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.location.internal.ParcelableGeofence;

public interface Geofence {
    public static final class Builder {
        private String zzDK;
        private short zzaxA;
        private double zzaxB;
        private double zzaxC;
        private float zzaxD;
        private int zzaxE;
        private int zzaxF;
        private int zzaxy;
        private long zzaxz;

        public Builder() {
            this.zzDK = null;
            this.zzaxy = 0;
            this.zzaxz = 0x8000000000000000L;
            this.zzaxA = -1;
            this.zzaxE = 0;
            this.zzaxF = -1;
        }

        public Geofence build() {
            if(this.zzDK == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            if(this.zzaxy == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if((this.zzaxy & 4) != 0 && this.zzaxF < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            if(this.zzaxz == 0x8000000000000000L) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if(this.zzaxA == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            if(this.zzaxE < 0) {
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            }
            return new ParcelableGeofence(this.zzDK, this.zzaxy, 1, this.zzaxB, this.zzaxC, this.zzaxD, this.zzaxz, this.zzaxE, this.zzaxF);
        }

        public Builder setCircularRegion(double latitude, double longitude, float radius) {
            this.zzaxA = 1;
            this.zzaxB = latitude;
            this.zzaxC = longitude;
            this.zzaxD = radius;
            return this;
        }

        public Builder setExpirationDuration(long durationMillis) {
            if(durationMillis < 0L) {
                this.zzaxz = -1L;
                return this;
            }
            this.zzaxz = SystemClock.elapsedRealtime() + durationMillis;
            return this;
        }

        public Builder setLoiteringDelay(int loiteringDelayMs) {
            this.zzaxF = loiteringDelayMs;
            return this;
        }

        public Builder setNotificationResponsiveness(int notificationResponsivenessMs) {
            this.zzaxE = notificationResponsivenessMs;
            return this;
        }

        public Builder setRequestId(String requestId) {
            this.zzDK = requestId;
            return this;
        }

        public Builder setTransitionTypes(int transitionTypes) {
            this.zzaxy = transitionTypes;
            return this;
        }
    }

    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1L;

    String getRequestId();
}

