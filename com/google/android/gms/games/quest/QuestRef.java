package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import java.util.ArrayList;
import java.util.List;

public final class QuestRef extends zzc implements Quest {
    private final int zzaoG;
    private final Game zzatB;

    QuestRef(DataHolder holder, int dataRow, int numChildren) {
        super(holder, dataRow);
        this.zzatB = new GameRef(holder, dataRow);
        this.zzaoG = numChildren;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return QuestEntity.zza(this, obj);
    }

    public Quest freeze() {
        return new QuestEntity(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.freeze();
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public long getAcceptedTimestamp() {
        return this.getLong("accepted_ts");
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public Uri getBannerImageUri() {
        return this.zzbW("quest_banner_image_uri");
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public String getBannerImageUrl() {
        return this.getString("quest_banner_image_url");
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public Milestone getCurrentMilestone() {
        return (Milestone)this.zztN().get(0);
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public String getDescription() {
        return this.getString("quest_description");
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public void getDescription(CharArrayBuffer dataOut) {
        this.zza("quest_description", dataOut);
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public long getEndTimestamp() {
        return this.getLong("quest_end_ts");
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public Game getGame() {
        return this.zzatB;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public Uri getIconImageUri() {
        return this.zzbW("quest_icon_image_uri");
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public String getIconImageUrl() {
        return this.getString("quest_icon_image_url");
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public long getLastUpdatedTimestamp() {
        return this.getLong("quest_last_updated_ts");
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public String getName() {
        return this.getString("quest_name");
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public void getName(CharArrayBuffer dataOut) {
        this.zza("quest_name", dataOut);
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public String getQuestId() {
        return this.getString("external_quest_id");
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public long getStartTimestamp() {
        return this.getLong("quest_start_ts");
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public int getState() {
        return this.getInteger("quest_state");
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public int getType() {
        return this.getInteger("quest_type");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return QuestEntity.zza(this);
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public boolean isEndingSoon() {
        return this.zztO() <= System.currentTimeMillis() + 1800000L;
    }

    @Override
    public String toString() {
        return QuestEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((QuestEntity)this.freeze()).writeToParcel(dest, flags);
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public List zztN() {
        List list0 = new ArrayList(this.zzaoG);
        for(int v = 0; v < this.zzaoG; ++v) {
            ((ArrayList)list0).add(new MilestoneRef(this.zzWu, this.zzYs + v));
        }
        return list0;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public long zztO() {
        return this.getLong("notification_ts");
    }
}

