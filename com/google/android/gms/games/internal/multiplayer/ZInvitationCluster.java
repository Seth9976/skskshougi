package com.google.android.gms.games.internal.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import java.util.ArrayList;

public final class ZInvitationCluster implements SafeParcelable, Invitation {
    public static final InvitationClusterCreator CREATOR;
    private final int zzCY;
    private final ArrayList zzasO;

    static {
        ZInvitationCluster.CREATOR = new InvitationClusterCreator();
    }

    ZInvitationCluster(int versionCode, ArrayList arrayList0) {
        this.zzCY = versionCode;
        this.zzasO = arrayList0;
        this.zztn();
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ZInvitationCluster)) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        if(((ZInvitationCluster)obj).zzasO.size() != this.zzasO.size()) {
            return false;
        }
        int v = this.zzasO.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((Invitation)this.zzasO.get(v1)).equals(((Invitation)((ZInvitationCluster)obj).zzasO.get(v1)))) {
                return false;
            }
        }
        return true;
    }

    public Invitation freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public int getAvailableAutoMatchSlots() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public long getCreationTimestamp() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public Game getGame() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public String getInvitationId() {
        return ((InvitationEntity)this.zzasO.get(0)).getInvitationId();
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public int getInvitationType() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public Participant getInviter() {
        return ((InvitationEntity)this.zzasO.get(0)).getInviter();
    }

    @Override  // com.google.android.gms.games.multiplayer.Participatable
    public ArrayList getParticipants() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    @Override  // com.google.android.gms.games.multiplayer.Invitation
    public int getVariant() {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(this.zzasO.toArray());
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        InvitationClusterCreator.zza(this, dest, flags);
    }

    private void zztn() {
        zzb.zzU(!this.zzasO.isEmpty());
        Invitation invitation0 = (Invitation)this.zzasO.get(0);
        int v = this.zzasO.size();
        for(int v1 = 1; v1 < v; ++v1) {
            Invitation invitation1 = (Invitation)this.zzasO.get(v1);
            zzb.zza(invitation0.getInviter().equals(invitation1.getInviter()), "All the invitations must be from the same inviter");
        }
    }

    public ArrayList zzto() {
        return new ArrayList(this.zzasO);
    }
}

