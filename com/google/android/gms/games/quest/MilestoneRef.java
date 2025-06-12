package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class MilestoneRef extends zzc implements Milestone {
    MilestoneRef(DataHolder holder, int dataRow) {
        super(holder, dataRow);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return MilestoneEntity.zza(this, obj);
    }

    public Milestone freeze() {
        return new MilestoneEntity(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.freeze();
    }

    @Override  // com.google.android.gms.games.quest.Milestone
    public byte[] getCompletionRewardData() {
        return this.getByteArray("completion_reward_data");
    }

    @Override  // com.google.android.gms.games.quest.Milestone
    public long getCurrentProgress() {
        switch(this.getState()) {
            case 2: {
                return this.getLong("current_value") - this.zztM();
            }
            case 3: 
            case 4: {
                return this.getTargetProgress();
            }
            default: {
                return 0L;
            }
        }
    }

    @Override  // com.google.android.gms.games.quest.Milestone
    public String getEventId() {
        return this.getString("external_event_id");
    }

    @Override  // com.google.android.gms.games.quest.Milestone
    public String getMilestoneId() {
        return this.getString("external_milestone_id");
    }

    @Override  // com.google.android.gms.games.quest.Milestone
    public int getState() {
        return this.getInteger("milestone_state");
    }

    @Override  // com.google.android.gms.games.quest.Milestone
    public long getTargetProgress() {
        return this.getLong("target_value");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return MilestoneEntity.zza(this);
    }

    @Override
    public String toString() {
        return MilestoneEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((MilestoneEntity)this.freeze()).writeToParcel(dest, flags);
    }

    private long zztM() {
        return this.getLong("initial_value");
    }
}

