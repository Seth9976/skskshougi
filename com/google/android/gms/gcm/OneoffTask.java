package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class OneoffTask extends Task {
    public static class Builder extends com.google.android.gms.gcm.Task.Builder {
        private long zzawb;
        private long zzawc;

        public Builder() {
            this.zzawb = -1L;
            this.zzawc = -1L;
            this.isPersisted = false;
        }

        public OneoffTask build() {
            this.checkConditions();
            return new OneoffTask(this, null);
        }

        @Override  // com.google.android.gms.gcm.Task$Builder
        public Task build() {
            return this.build();
        }

        @Override  // com.google.android.gms.gcm.Task$Builder
        protected void checkConditions() {
            super.checkConditions();
            if(this.zzawb == -1L || this.zzawc == -1L) {
                throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
            }
            if(this.zzawb >= this.zzawc) {
                throw new IllegalArgumentException("Window start must be shorter than window end.");
            }
        }

        public Builder setExecutionWindow(long windowStartDelaySeconds, long windowEndDelaySeconds) {
            this.zzawb = windowStartDelaySeconds;
            this.zzawc = windowEndDelaySeconds;
            return this;
        }

        public Builder setPersisted(boolean isPersisted) {
            this.isPersisted = isPersisted;
            return this;
        }

        @Override  // com.google.android.gms.gcm.Task$Builder
        public com.google.android.gms.gcm.Task.Builder setPersisted(boolean x0) {
            return this.setPersisted(x0);
        }

        public Builder setRequiredNetwork(int requiredNetworkState) {
            this.requiredNetworkState = requiredNetworkState;
            return this;
        }

        @Override  // com.google.android.gms.gcm.Task$Builder
        public com.google.android.gms.gcm.Task.Builder setRequiredNetwork(int x0) {
            return this.setRequiredNetwork(x0);
        }

        public Builder setRequiresCharging(boolean requiresCharging) {
            this.requiresCharging = requiresCharging;
            return this;
        }

        @Override  // com.google.android.gms.gcm.Task$Builder
        public com.google.android.gms.gcm.Task.Builder setRequiresCharging(boolean x0) {
            return this.setRequiresCharging(x0);
        }

        public Builder setService(Class class0) {
            this.gcmTaskService = class0.getName();
            return this;
        }

        @Override  // com.google.android.gms.gcm.Task$Builder
        public com.google.android.gms.gcm.Task.Builder setService(Class x0) {
            return this.setService(x0);
        }

        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }

        @Override  // com.google.android.gms.gcm.Task$Builder
        public com.google.android.gms.gcm.Task.Builder setTag(String x0) {
            return this.setTag(x0);
        }

        public Builder setUpdateCurrent(boolean updateCurrent) {
            this.updateCurrent = updateCurrent;
            return this;
        }

        @Override  // com.google.android.gms.gcm.Task$Builder
        public com.google.android.gms.gcm.Task.Builder setUpdateCurrent(boolean x0) {
            return this.setUpdateCurrent(x0);
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final long zzavZ;
    private final long zzawa;

    static {
        OneoffTask.CREATOR = new Parcelable.Creator() {
            public OneoffTask zzdV(Parcel parcel0) {
                return new OneoffTask(parcel0, null);
            }

            public OneoffTask[] zzgh(int v) {
                return new OneoffTask[v];
            }
        };
    }

    @Deprecated
    private OneoffTask(Parcel in) {
        super(in);
        this.zzavZ = in.readLong();
        this.zzawa = in.readLong();
    }

    OneoffTask(Parcel x0, com.google.android.gms.gcm.OneoffTask.1 x1) {
        this(x0);
    }

    private OneoffTask(Builder builder) {
        super(builder);
        this.zzavZ = builder.zzawb;
        this.zzawa = builder.zzawc;
    }

    OneoffTask(Builder x0, com.google.android.gms.gcm.OneoffTask.1 x1) {
        this(x0);
    }

    public long getWindowEnd() {
        return this.zzawa;
    }

    public long getWindowStart() {
        return this.zzavZ;
    }

    @Override  // com.google.android.gms.gcm.Task
    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putLong("window_start", this.zzavZ);
        bundle.putLong("window_end", this.zzawa);
    }

    @Override
    public String toString() {
        return super.toString() + " " + "windowStart=" + this.getWindowStart() + " " + "windowEnd=" + this.getWindowEnd();
    }

    @Override  // com.google.android.gms.gcm.Task
    public void writeToParcel(Parcel parcel, int flags) {
        super.writeToParcel(parcel, flags);
        parcel.writeLong(this.zzavZ);
        parcel.writeLong(this.zzawa);
    }
}

