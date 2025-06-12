package com.google.android.gms.games.internal.notification;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.zzt;

public final class GameNotificationRef extends zzc implements GameNotification {
    GameNotificationRef(DataHolder holder, int dataRow) {
        super(holder, dataRow);
    }

    public long getId() {
        return this.getLong("_id");
    }

    public String getText() {
        return this.getString("text");
    }

    public String getTitle() {
        return this.getString("title");
    }

    public int getType() {
        return this.getInteger("type");
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("Id", this.getId()).zzg("NotificationId", this.zztp()).zzg("Type", this.getType()).zzg("Title", this.getTitle()).zzg("Ticker", this.zztq()).zzg("Text", this.getText()).zzg("CoalescedText", this.zztr()).zzg("isAcknowledged", Boolean.valueOf(this.zzts())).zzg("isSilent", Boolean.valueOf(this.zztt())).toString();
    }

    public String zztp() {
        return this.getString("notification_id");
    }

    public String zztq() {
        return this.getString("ticker");
    }

    public String zztr() {
        return this.getString("coalesced_text");
    }

    public boolean zzts() {
        return this.getInteger("acknowledged") > 0;
    }

    public boolean zztt() {
        return this.getInteger("alert_level") == 0;
    }
}

