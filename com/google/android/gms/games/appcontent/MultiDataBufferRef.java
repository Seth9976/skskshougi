package com.google.android.gms.games.appcontent;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import java.util.ArrayList;

public abstract class MultiDataBufferRef extends zzc {
    protected final ArrayList zzaoD;

    protected MultiDataBufferRef(ArrayList arrayList0, int indexForRef, int dataRow) {
        super(((DataHolder)arrayList0.get(indexForRef)), dataRow);
        this.zzaoD = arrayList0;
    }
}

