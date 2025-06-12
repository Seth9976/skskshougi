package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

public final class EventRef extends zzc implements Event {
    EventRef(DataHolder holder, int dataRow) {
        super(holder, dataRow);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.zzc
    public boolean equals(Object obj) {
        return EventEntity.zza(this, obj);
    }

    public Event freeze() {
        return new EventEntity(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.freeze();
    }

    @Override  // com.google.android.gms.games.event.Event
    public String getDescription() {
        return this.getString("description");
    }

    @Override  // com.google.android.gms.games.event.Event
    public void getDescription(CharArrayBuffer dataOut) {
        this.zza("description", dataOut);
    }

    @Override  // com.google.android.gms.games.event.Event
    public String getEventId() {
        return this.getString("external_event_id");
    }

    @Override  // com.google.android.gms.games.event.Event
    public String getFormattedValue() {
        return this.getString("formatted_value");
    }

    @Override  // com.google.android.gms.games.event.Event
    public void getFormattedValue(CharArrayBuffer dataOut) {
        this.zza("formatted_value", dataOut);
    }

    @Override  // com.google.android.gms.games.event.Event
    public Uri getIconImageUri() {
        return this.zzbW("icon_image_uri");
    }

    @Override  // com.google.android.gms.games.event.Event
    public String getIconImageUrl() {
        return this.getString("icon_image_url");
    }

    @Override  // com.google.android.gms.games.event.Event
    public String getName() {
        return this.getString("name");
    }

    @Override  // com.google.android.gms.games.event.Event
    public void getName(CharArrayBuffer dataOut) {
        this.zza("name", dataOut);
    }

    @Override  // com.google.android.gms.games.event.Event
    public Player getPlayer() {
        return new PlayerRef(this.zzWu, this.zzYs);
    }

    @Override  // com.google.android.gms.games.event.Event
    public long getValue() {
        return this.getLong("value");
    }

    @Override  // com.google.android.gms.common.data.zzc
    public int hashCode() {
        return EventEntity.zza(this);
    }

    @Override  // com.google.android.gms.games.event.Event
    public boolean isVisible() {
        return this.getBoolean("visibility");
    }

    @Override
    public String toString() {
        return EventEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((EventEntity)this.freeze()).writeToParcel(dest, flags);
    }
}

