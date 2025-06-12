package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class MomentEntity extends FastSafeParcelableJsonResponse implements Moment {
    public static final zzb CREATOR;
    final int zzCY;
    String zzEl;
    String zzKI;
    private static final HashMap zzaHP;
    final Set zzaHQ;
    String zzaID;
    ItemScopeEntity zzaIL;
    ItemScopeEntity zzaIM;

    static {
        MomentEntity.CREATOR = new zzb();
        MomentEntity.zzaHP = new HashMap();
        Field fastJsonResponse$Field0 = Field.zzl("id", 2);
        MomentEntity.zzaHP.put("id", fastJsonResponse$Field0);
        Field fastJsonResponse$Field1 = Field.zza("result", 4, ItemScopeEntity.class);
        MomentEntity.zzaHP.put("result", fastJsonResponse$Field1);
        Field fastJsonResponse$Field2 = Field.zzl("startDate", 5);
        MomentEntity.zzaHP.put("startDate", fastJsonResponse$Field2);
        Field fastJsonResponse$Field3 = Field.zza("target", 6, ItemScopeEntity.class);
        MomentEntity.zzaHP.put("target", fastJsonResponse$Field3);
        Field fastJsonResponse$Field4 = Field.zzl("type", 7);
        MomentEntity.zzaHP.put("type", fastJsonResponse$Field4);
    }

    public MomentEntity() {
        this.zzCY = 1;
        this.zzaHQ = new HashSet();
    }

    MomentEntity(Set set0, int versionCode, String id, ItemScopeEntity result, String startDate, ItemScopeEntity target, String type) {
        this.zzaHQ = set0;
        this.zzCY = versionCode;
        this.zzKI = id;
        this.zzaIL = result;
        this.zzaID = startDate;
        this.zzaIM = target;
        this.zzEl = type;
    }

    public MomentEntity(Set set0, String id, ItemScopeEntity result, String startDate, ItemScopeEntity target, String type) {
        this.zzaHQ = set0;
        this.zzCY = 1;
        this.zzKI = id;
        this.zzaIL = result;
        this.zzaID = startDate;
        this.zzaIM = target;
        this.zzEl = type;
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof MomentEntity)) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        for(Object object1: MomentEntity.zzaHP.values()) {
            Field fastJsonResponse$Field0 = (Field)object1;
            if(this.zza(fastJsonResponse$Field0)) {
                if(((MomentEntity)obj).zza(fastJsonResponse$Field0) && this.zzb(fastJsonResponse$Field0).equals(((MomentEntity)obj).zzb(fastJsonResponse$Field0))) {
                    continue;
                }
                return false;
            }
            if(((MomentEntity)obj).zza(fastJsonResponse$Field0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public String getId() {
        return this.zzKI;
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public ItemScope getResult() {
        return this.zzaIL;
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public String getStartDate() {
        return this.zzaID;
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public ItemScope getTarget() {
        return this.zzaIM;
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public String getType() {
        return this.zzEl;
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public boolean hasId() {
        return this.zzaHQ.contains(2);
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public boolean hasResult() {
        return this.zzaHQ.contains(4);
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public boolean hasStartDate() {
        return this.zzaHQ.contains(5);
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public boolean hasTarget() {
        return this.zzaHQ.contains(6);
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public boolean hasType() {
        return this.zzaHQ.contains(7);
    }

    @Override
    public int hashCode() {
        int v = 0;
        for(Object object0: MomentEntity.zzaHP.values()) {
            Field fastJsonResponse$Field0 = (Field)object0;
            v = this.zza(fastJsonResponse$Field0) ? this.zzb(fastJsonResponse$Field0).hashCode() + (v + fastJsonResponse$Field0.zzot()) : v;
        }
        return v;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzb.zza(this, out, flags);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected boolean zza(Field fastJsonResponse$Field0) {
        return this.zzaHQ.contains(fastJsonResponse$Field0.zzot());
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected Object zzb(Field fastJsonResponse$Field0) {
        switch(fastJsonResponse$Field0.zzot()) {
            case 2: {
                return this.zzKI;
            }
            case 4: {
                return this.zzaIL;
            }
            case 5: {
                return this.zzaID;
            }
            case 6: {
                return this.zzaIM;
            }
            case 7: {
                return this.zzEl;
            }
            default: {
                throw new IllegalStateException("Unknown safe parcelable id=" + fastJsonResponse$Field0.zzot());
            }
        }
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public Map zzom() {
        return this.zzxF();
    }

    public HashMap zzxF() {
        return MomentEntity.zzaHP;
    }

    public MomentEntity zzxH() [...] // Inlined contents
}

