package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.TurnBasedMatchTurnStatus;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

public final class LoadMatchesResponse {
    private final InvitationBuffer zzauD;
    private final TurnBasedMatchBuffer zzauE;
    private final TurnBasedMatchBuffer zzauF;
    private final TurnBasedMatchBuffer zzauG;

    public LoadMatchesResponse(Bundle matchData) {
        DataHolder dataHolder0 = LoadMatchesResponse.zza(matchData, 0);
        this.zzauD = dataHolder0 == null ? null : new InvitationBuffer(dataHolder0);
        DataHolder dataHolder1 = LoadMatchesResponse.zza(matchData, 1);
        this.zzauE = dataHolder1 == null ? null : new TurnBasedMatchBuffer(dataHolder1);
        DataHolder dataHolder2 = LoadMatchesResponse.zza(matchData, 2);
        this.zzauF = dataHolder2 == null ? null : new TurnBasedMatchBuffer(dataHolder2);
        DataHolder dataHolder3 = LoadMatchesResponse.zza(matchData, 3);
        if(dataHolder3 != null) {
            this.zzauG = new TurnBasedMatchBuffer(dataHolder3);
            return;
        }
        this.zzauG = null;
    }

    @Deprecated
    public void close() {
        this.release();
    }

    public TurnBasedMatchBuffer getCompletedMatches() {
        return this.zzauG;
    }

    public InvitationBuffer getInvitations() {
        return this.zzauD;
    }

    public TurnBasedMatchBuffer getMyTurnMatches() {
        return this.zzauE;
    }

    public TurnBasedMatchBuffer getTheirTurnMatches() {
        return this.zzauF;
    }

    // 去混淆评级： 低(30)
    public boolean hasData() {
        return this.zzauD == null || this.zzauD.getCount() <= 0 ? this.zzauE != null && this.zzauE.getCount() > 0 || this.zzauF != null && this.zzauF.getCount() > 0 || this.zzauG != null && this.zzauG.getCount() > 0 : true;
    }

    public void release() {
        if(this.zzauD != null) {
            this.zzauD.release();
        }
        if(this.zzauE != null) {
            this.zzauE.release();
        }
        if(this.zzauF != null) {
            this.zzauF.release();
        }
        if(this.zzauG != null) {
            this.zzauG.release();
        }
    }

    private static DataHolder zza(Bundle bundle0, int v) {
        String s = TurnBasedMatchTurnStatus.zzfG(v);
        return bundle0.containsKey(s) ? ((DataHolder)bundle0.getParcelable(s)) : null;
    }
}

