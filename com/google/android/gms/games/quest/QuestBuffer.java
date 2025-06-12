package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class QuestBuffer extends zzf {
    public QuestBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected Object zzj(int v, int v1) {
        return this.zzr(v, v1);
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected String zzni() {
        return "external_quest_id";
    }

    protected Quest zzr(int v, int v1) {
        return new QuestRef(this.zzWu, v, v1);
    }
}

