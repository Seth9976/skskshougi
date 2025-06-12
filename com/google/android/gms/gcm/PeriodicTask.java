package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class PeriodicTask extends Task {
    public static class Builder extends com.google.android.gms.gcm.Task.Builder {
        private long zzawd;
        private long zzawe;

        public Builder() {
            this.zzawd = -1L;
            this.zzawe = -1L;
            this.isPersisted = true;
        }

        public PeriodicTask build() {
            this.checkConditions();
            return new PeriodicTask(this, null);
        }

        @Override  // com.google.android.gms.gcm.Task$Builder
        public Task build() {
            return this.build();
        }

        @Override  // com.google.android.gms.gcm.Task$Builder
        protected void checkConditions() {
            super.checkConditions();
            if(this.zzawd == -1L) {
                throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
            }
            if(this.zzawe == -1L) {
                this.zzawe = (long)(((float)this.zzawd) * 0.1f);
            }
        }

        public Builder setFlex(long flexInSeconds) {
            this.zzawe = flexInSeconds;
            return this;
        }

        public Builder setPeriod(long intervalInSeconds) {
            this.zzawd = intervalInSeconds;
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
    protected long mFlexInSeconds;
    protected long mIntervalInSeconds;

    static {
        PeriodicTask.CREATOR = new Parcelable.Creator() {
            public PeriodicTask zzdX(Parcel parcel0) {
                return new PeriodicTask(parcel0, null);
            }

            public PeriodicTask[] zzgj(int v) {
                return new PeriodicTask[v];
            }
        };
    }

    @Deprecated
    private PeriodicTask(Parcel in) {
        super(in);
        this.mFlexInSeconds = -1L;
        this.mIntervalInSeconds = in.readLong();
        this.mFlexInSeconds = in.readLong();
    }

    PeriodicTask(Parcel x0, com.google.android.gms.gcm.PeriodicTask.1 x1) {
        this(x0);
    }

    private PeriodicTask(Builder builder) {
        super(builder);
        this.mIntervalInSeconds = builder.zzawd;
        this.mFlexInSeconds = builder.zzawe;
    }

    PeriodicTask(Builder x0, com.google.android.gms.gcm.PeriodicTask.1 x1) {
        this(x0);
    }

    public long getFlex() {
        return this.mFlexInSeconds;
    }

    public long getPeriod() {
        return this.mIntervalInSeconds;
    }

    @Override  // com.google.android.gms.gcm.Task
    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putLong("period", this.mIntervalInSeconds);
        bundle.putLong("period_flex", this.mFlexInSeconds);
    }

    @Override
    public String toString() {
        return super.toString() + " " + "period=" + this.getPeriod() + " " + "flex=" + this.getFlex();
    }

    @Override  // com.google.android.gms.gcm.Task
    public void writeToParcel(Parcel parcel, int flags) {
        super.writeToParcel(parcel, flags);
        parcel.writeLong(this.mIntervalInSeconds);
        parcel.writeLong(this.mFlexInSeconds);
    }
}

