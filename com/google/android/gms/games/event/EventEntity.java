package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzlc;

public final class EventEntity implements SafeParcelable, Event {
    public static final EventEntityCreator CREATOR;
    private final String mName;
    private final int zzCY;
    private final String zzakM;
    private final Uri zzanf;
    private final String zzanq;
    private final String zzaoK;
    private final long zzaoL;
    private final String zzaoM;
    private final boolean zzaoN;
    private final PlayerEntity zzaog;

    static {
        EventEntity.CREATOR = new EventEntityCreator();
    }

    EventEntity(int versionCode, String eventId, String name, String description, Uri iconImageUri, String iconImageUrl, Player player, long value, String formattedValue, boolean isVisible) {
        this.zzCY = versionCode;
        this.zzaoK = eventId;
        this.mName = name;
        this.zzakM = description;
        this.zzanf = iconImageUri;
        this.zzanq = iconImageUrl;
        this.zzaog = new PlayerEntity(player);
        this.zzaoL = value;
        this.zzaoM = formattedValue;
        this.zzaoN = isVisible;
    }

    public EventEntity(Event event) {
        this.zzCY = 1;
        this.zzaoK = event.getEventId();
        this.mName = event.getName();
        this.zzakM = event.getDescription();
        this.zzanf = event.getIconImageUri();
        this.zzanq = event.getIconImageUrl();
        this.zzaog = (PlayerEntity)event.getPlayer().freeze();
        this.zzaoL = event.getValue();
        this.zzaoM = event.getFormattedValue();
        this.zzaoN = event.isVisible();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return EventEntity.zza(this, obj);
    }

    public Event freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.event.Event
    public String getDescription() {
        return this.zzakM;
    }

    @Override  // com.google.android.gms.games.event.Event
    public void getDescription(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzakM, dataOut);
    }

    @Override  // com.google.android.gms.games.event.Event
    public String getEventId() {
        return this.zzaoK;
    }

    @Override  // com.google.android.gms.games.event.Event
    public String getFormattedValue() {
        return this.zzaoM;
    }

    @Override  // com.google.android.gms.games.event.Event
    public void getFormattedValue(CharArrayBuffer dataOut) {
        zzlc.zzb(this.zzaoM, dataOut);
    }

    @Override  // com.google.android.gms.games.event.Event
    public Uri getIconImageUri() {
        return this.zzanf;
    }

    @Override  // com.google.android.gms.games.event.Event
    public String getIconImageUrl() {
        return this.zzanq;
    }

    @Override  // com.google.android.gms.games.event.Event
    public String getName() {
        return this.mName;
    }

    @Override  // com.google.android.gms.games.event.Event
    public void getName(CharArrayBuffer dataOut) {
        zzlc.zzb(this.mName, dataOut);
    }

    @Override  // com.google.android.gms.games.event.Event
    public Player getPlayer() {
        return this.zzaog;
    }

    @Override  // com.google.android.gms.games.event.Event
    public long getValue() {
        return this.zzaoL;
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return EventEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override  // com.google.android.gms.games.event.Event
    public boolean isVisible() {
        return this.zzaoN;
    }

    @Override
    public String toString() {
        return EventEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        EventEntityCreator.zza(this, out, flags);
    }

    static int zza(Event event0) {
        return zzt.hashCode(new Object[]{event0.getEventId(), event0.getName(), event0.getDescription(), event0.getIconImageUri(), event0.getIconImageUrl(), event0.getPlayer(), event0.getValue(), event0.getFormattedValue(), Boolean.valueOf(event0.isVisible())});
    }

    // 去混淆评级： 中等(100)
    static boolean zza(Event event0, Object object0) {
        return object0 instanceof Event ? event0 == object0 || zzt.equal(((Event)object0).getEventId(), event0.getEventId()) && zzt.equal(((Event)object0).getName(), event0.getName()) && zzt.equal(((Event)object0).getDescription(), event0.getDescription()) && zzt.equal(((Event)object0).getIconImageUri(), event0.getIconImageUri()) && zzt.equal(((Event)object0).getIconImageUrl(), event0.getIconImageUrl()) && zzt.equal(((Event)object0).getPlayer(), event0.getPlayer()) && zzt.equal(((Event)object0).getValue(), event0.getValue()) && zzt.equal(((Event)object0).getFormattedValue(), event0.getFormattedValue()) && zzt.equal(Boolean.valueOf(((Event)object0).isVisible()), Boolean.valueOf(event0.isVisible())) : false;
    }

    static String zzb(Event event0) {
        return zzt.zzt(event0).zzg("Id", event0.getEventId()).zzg("Name", event0.getName()).zzg("Description", event0.getDescription()).zzg("IconImageUri", event0.getIconImageUri()).zzg("IconImageUrl", event0.getIconImageUrl()).zzg("Player", event0.getPlayer()).zzg("Value", event0.getValue()).zzg("FormattedValue", event0.getFormattedValue()).zzg("isVisible", Boolean.valueOf(event0.isVisible())).toString();
    }
}

