package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

public final class zzc extends com.google.android.gms.common.data.zzc implements Moment {
    private MomentEntity zzaIN;

    public zzc(DataHolder dataHolder0, int v) {
        super(dataHolder0, v);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        return this.zzxH();
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public String getId() {
        return this.zzxI().getId();
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public ItemScope getResult() {
        return this.zzxI().getResult();
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public String getStartDate() {
        return this.zzxI().getStartDate();
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public ItemScope getTarget() {
        return this.zzxI().getTarget();
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public String getType() {
        return this.zzxI().getType();
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public boolean hasId() {
        return this.zzxI().hasId();
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public boolean hasResult() {
        return this.zzxI().hasResult();
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public boolean hasStartDate() {
        return this.zzxI().hasStartDate();
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public boolean hasTarget() {
        return this.zzxI().hasTarget();
    }

    @Override  // com.google.android.gms.plus.model.moments.Moment
    public boolean hasType() {
        return this.zzxI().hasType();
    }

    public MomentEntity zzxH() {
        return this.zzxI();
    }

    private MomentEntity zzxI() {
        synchronized(this) {
            if(this.zzaIN == null) {
                byte[] arr_b = this.getByteArray("momentImpl");
                Parcel parcel0 = Parcel.obtain();
                parcel0.unmarshall(arr_b, 0, arr_b.length);
                parcel0.setDataPosition(0);
                this.zzaIN = MomentEntity.CREATOR.zzfL(parcel0);
                parcel0.recycle();
            }
            return this.zzaIN;
        }
    }
}

