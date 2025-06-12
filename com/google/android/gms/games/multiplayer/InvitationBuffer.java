package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class InvitationBuffer extends zzf {
    public InvitationBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected Object zzj(int v, int v1) {
        return this.zzo(v, v1);
    }

    @Override  // com.google.android.gms.common.data.zzf
    protected String zzni() {
        return "external_invitation_id";
    }

    protected Invitation zzo(int v, int v1) {
        return new InvitationRef(this.zzWu, v, v1);
    }
}

