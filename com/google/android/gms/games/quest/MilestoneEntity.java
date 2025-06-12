package com.google.android.gms.games.quest;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

public final class MilestoneEntity implements SafeParcelable, Milestone {
    public static final Parcelable.Creator CREATOR;
    private final int mState;
    private final int zzCY;
    private final String zzaoK;
    private final String zzapR;
    private final long zzauS;
    private final long zzauT;
    private final byte[] zzauU;

    static {
        MilestoneEntity.CREATOR = new MilestoneEntityCreator();
    }

    MilestoneEntity(int versionCode, String milestoneId, long currentProgress, long targetProgress, byte[] completionBlob, int state, String eventId) {
        this.zzCY = versionCode;
        this.zzapR = milestoneId;
        this.zzauS = currentProgress;
        this.zzauT = targetProgress;
        this.zzauU = completionBlob;
        this.mState = state;
        this.zzaoK = eventId;
    }

    public MilestoneEntity(Milestone milestone) {
        this.zzCY = 4;
        this.zzapR = milestone.getMilestoneId();
        this.zzauS = milestone.getCurrentProgress();
        this.zzauT = milestone.getTargetProgress();
        this.mState = milestone.getState();
        this.zzaoK = milestone.getEventId();
        byte[] arr_b = milestone.getCompletionRewardData();
        if(arr_b == null) {
            this.zzauU = null;
            return;
        }
        this.zzauU = new byte[arr_b.length];
        System.arraycopy(arr_b, 0, this.zzauU, 0, arr_b.length);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return MilestoneEntity.zza(this, obj);
    }

    public Milestone freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.quest.Milestone
    public byte[] getCompletionRewardData() {
        return this.zzauU;
    }

    @Override  // com.google.android.gms.games.quest.Milestone
    public long getCurrentProgress() {
        return this.zzauS;
    }

    @Override  // com.google.android.gms.games.quest.Milestone
    public String getEventId() {
        return this.zzaoK;
    }

    @Override  // com.google.android.gms.games.quest.Milestone
    public String getMilestoneId() {
        return this.zzapR;
    }

    @Override  // com.google.android.gms.games.quest.Milestone
    public int getState() {
        return this.mState;
    }

    @Override  // com.google.android.gms.games.quest.Milestone
    public long getTargetProgress() {
        return this.zzauT;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return MilestoneEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override
    public String toString() {
        return MilestoneEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        MilestoneEntityCreator.zza(this, out, flags);
    }

    static int zza(Milestone milestone0) {
        return zzt.hashCode(new Object[]{milestone0.getMilestoneId(), milestone0.getCurrentProgress(), milestone0.getTargetProgress(), milestone0.getState(), milestone0.getEventId()});
    }

    // 去混淆评级： 中等(60)
    static boolean zza(Milestone milestone0, Object object0) {
        return object0 instanceof Milestone ? milestone0 == object0 || zzt.equal(((Milestone)object0).getMilestoneId(), milestone0.getMilestoneId()) && zzt.equal(((Milestone)object0).getCurrentProgress(), milestone0.getCurrentProgress()) && zzt.equal(((Milestone)object0).getTargetProgress(), milestone0.getTargetProgress()) && zzt.equal(((Milestone)object0).getState(), milestone0.getState()) && zzt.equal(((Milestone)object0).getEventId(), milestone0.getEventId()) : false;
    }

    static String zzb(Milestone milestone0) {
        return zzt.zzt(milestone0).zzg("MilestoneId", milestone0.getMilestoneId()).zzg("CurrentProgress", milestone0.getCurrentProgress()).zzg("TargetProgress", milestone0.getTargetProgress()).zzg("State", milestone0.getState()).zzg("CompletionRewardData", milestone0.getCompletionRewardData()).zzg("EventId", milestone0.getEventId()).toString();
    }
}

