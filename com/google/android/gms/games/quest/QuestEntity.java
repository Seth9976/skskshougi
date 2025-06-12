package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.zzlc;
import java.util.ArrayList;
import java.util.List;

public final class QuestEntity implements SafeParcelable, Quest {
    public static final Parcelable.Creator CREATOR;
    private final String mName;
    private final int mState;
    private final int zzCY;
    private final int zzSq;
    private final String zzakM;
    private final long zzaoj;
    private final String zzauV;
    private final long zzauW;
    private final Uri zzauX;
    private final String zzauY;
    private final long zzauZ;
    private final GameEntity zzaud;
    private final Uri zzava;
    private final String zzavb;
    private final long zzavc;
    private final long zzavd;
    private final ArrayList zzave;

    static {
        QuestEntity.CREATOR = new QuestEntityCreator();
    }

    QuestEntity(int versionCode, GameEntity game, String questId, long acceptedTimestamp, Uri bannerImageUri, String bannerImageUrl, String description, long endTimestamp, long lastUpdatedTimestamp, Uri iconImageUri, String iconImageUrl, String name, long notifyTimestamp, long startTimestamp, int state, int type, ArrayList arrayList0) {
        this.zzCY = versionCode;
        this.zzaud = game;
        this.zzauV = questId;
        this.zzauW = acceptedTimestamp;
        this.zzauX = bannerImageUri;
        this.zzauY = bannerImageUrl;
        this.zzakM = description;
        this.zzauZ = endTimestamp;
        this.zzaoj = lastUpdatedTimestamp;
        this.zzava = iconImageUri;
        this.zzavb = iconImageUrl;
        this.mName = name;
        this.zzavc = notifyTimestamp;
        this.zzavd = startTimestamp;
        this.mState = state;
        this.zzSq = type;
        this.zzave = arrayList0;
    }

    public QuestEntity(Quest quest) {
        this.zzCY = 2;
        this.zzaud = new GameEntity(quest.getGame());
        this.zzauV = quest.getQuestId();
        this.zzauW = quest.getAcceptedTimestamp();
        this.zzakM = quest.getDescription();
        this.zzauX = quest.getBannerImageUri();
        this.zzauY = quest.getBannerImageUrl();
        this.zzauZ = quest.getEndTimestamp();
        this.zzava = quest.getIconImageUri();
        this.zzavb = quest.getIconImageUrl();
        this.zzaoj = quest.getLastUpdatedTimestamp();
        this.mName = quest.getName();
        this.zzavc = quest.zztO();
        this.zzavd = quest.getStartTimestamp();
        this.mState = quest.getState();
        this.zzSq = quest.getType();
        List list0 = quest.zztN();
        int v = list0.size();
        this.zzave = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            MilestoneEntity milestoneEntity0 = (MilestoneEntity)((Milestone)list0.get(v1)).freeze();
            this.zzave.add(milestoneEntity0);
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return QuestEntity.zza(this, obj);
    }

    public Quest freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public long getAcceptedTimestamp() {
        return this.zzauW;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public Uri getBannerImageUri() {
        return this.zzauX;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public String getBannerImageUrl() {
        return this.zzauY;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public Milestone getCurrentMilestone() {
        return (Milestone)this.zztN().get(0);
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public String getDescription() {
        return this.zzakM;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public void getDescription(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzakM, dataOut);
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public long getEndTimestamp() {
        return this.zzauZ;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public Game getGame() {
        return this.zzaud;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public Uri getIconImageUri() {
        return this.zzava;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public String getIconImageUrl() {
        return this.zzavb;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public long getLastUpdatedTimestamp() {
        return this.zzaoj;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public String getName() {
        return this.mName;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public void getName(CharArrayBuffer dataOut) {
        zzlc.zzb(this.mName, dataOut);
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public String getQuestId() {
        return this.zzauV;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public long getStartTimestamp() {
        return this.zzavd;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public int getState() {
        return this.mState;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public int getType() {
        return this.zzSq;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return QuestEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public boolean isEndingSoon() {
        return this.zzavc <= System.currentTimeMillis() + 1800000L;
    }

    @Override
    public String toString() {
        return QuestEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        QuestEntityCreator.zza(this, out, flags);
    }

    static int zza(Quest quest0) {
        return zzt.hashCode(new Object[]{quest0.getGame(), quest0.getQuestId(), quest0.getAcceptedTimestamp(), quest0.getBannerImageUri(), quest0.getDescription(), quest0.getEndTimestamp(), quest0.getIconImageUri(), quest0.getLastUpdatedTimestamp(), quest0.zztN(), quest0.getName(), quest0.zztO(), quest0.getStartTimestamp(), quest0.getState()});
    }

    // 去混淆评级： 中等(140)
    static boolean zza(Quest quest0, Object object0) {
        return object0 instanceof Quest ? quest0 == object0 || zzt.equal(((Quest)object0).getGame(), quest0.getGame()) && zzt.equal(((Quest)object0).getQuestId(), quest0.getQuestId()) && zzt.equal(((Quest)object0).getAcceptedTimestamp(), quest0.getAcceptedTimestamp()) && zzt.equal(((Quest)object0).getBannerImageUri(), quest0.getBannerImageUri()) && zzt.equal(((Quest)object0).getDescription(), quest0.getDescription()) && zzt.equal(((Quest)object0).getEndTimestamp(), quest0.getEndTimestamp()) && zzt.equal(((Quest)object0).getIconImageUri(), quest0.getIconImageUri()) && zzt.equal(((Quest)object0).getLastUpdatedTimestamp(), quest0.getLastUpdatedTimestamp()) && zzt.equal(((Quest)object0).zztN(), quest0.zztN()) && zzt.equal(((Quest)object0).getName(), quest0.getName()) && zzt.equal(((Quest)object0).zztO(), quest0.zztO()) && zzt.equal(((Quest)object0).getStartTimestamp(), quest0.getStartTimestamp()) && zzt.equal(((Quest)object0).getState(), quest0.getState()) : false;
    }

    static String zzb(Quest quest0) {
        return zzt.zzt(quest0).zzg("Game", quest0.getGame()).zzg("QuestId", quest0.getQuestId()).zzg("AcceptedTimestamp", quest0.getAcceptedTimestamp()).zzg("BannerImageUri", quest0.getBannerImageUri()).zzg("BannerImageUrl", quest0.getBannerImageUrl()).zzg("Description", quest0.getDescription()).zzg("EndTimestamp", quest0.getEndTimestamp()).zzg("IconImageUri", quest0.getIconImageUri()).zzg("IconImageUrl", quest0.getIconImageUrl()).zzg("LastUpdatedTimestamp", quest0.getLastUpdatedTimestamp()).zzg("Milestones", quest0.zztN()).zzg("Name", quest0.getName()).zzg("NotifyTimestamp", quest0.zztO()).zzg("StartTimestamp", quest0.getStartTimestamp()).zzg("State", quest0.getState()).toString();
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public List zztN() {
        return new ArrayList(this.zzave);
    }

    @Override  // com.google.android.gms.games.quest.Quest
    public long zztO() {
        return this.zzavc;
    }
}

