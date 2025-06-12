package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzd;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.internal.model.people.zzk;

public final class PersonBuffer extends AbstractDataBuffer {
    private final zzd zzaJw;

    public PersonBuffer(DataHolder dataHolder) {
        super(dataHolder);
        if(dataHolder.zznb() != null && dataHolder.zznb().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false)) {
            this.zzaJw = new zzd(dataHolder, PersonEntity.CREATOR);
            return;
        }
        this.zzaJw = null;
    }

    public Person get(int position) {
        return this.zzaJw != null ? ((Person)this.zzaJw.zzbg(position)) : new zzk(this.zzWu, position);
    }

    @Override  // com.google.android.gms.common.data.AbstractDataBuffer
    public Object get(int x0) {
        return this.get(x0);
    }
}

