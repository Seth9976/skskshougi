package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.List;

public class LogicalFilter extends AbstractFilter {
    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    private List zzahL;
    final Operator zzahQ;
    final List zzaif;

    static {
        LogicalFilter.CREATOR = new zzk();
    }

    LogicalFilter(int versionCode, Operator operator, List list0) {
        this.zzCY = versionCode;
        this.zzahQ = operator;
        this.zzaif = list0;
    }

    public LogicalFilter(Operator operator, Filter filter, Filter[] additionalFilters) {
        this.zzCY = 1;
        this.zzahQ = operator;
        this.zzaif = new ArrayList(additionalFilters.length + 1);
        FilterHolder filterHolder0 = new FilterHolder(filter);
        this.zzaif.add(filterHolder0);
        this.zzahL = new ArrayList(additionalFilters.length + 1);
        this.zzahL.add(filter);
        for(int v = 0; v < additionalFilters.length; ++v) {
            Filter filter1 = additionalFilters[v];
            FilterHolder filterHolder1 = new FilterHolder(filter1);
            this.zzaif.add(filterHolder1);
            this.zzahL.add(filter1);
        }
    }

    public LogicalFilter(Operator operator, Iterable iterable0) {
        this.zzCY = 1;
        this.zzahQ = operator;
        this.zzahL = new ArrayList();
        this.zzaif = new ArrayList();
        for(Object object0: iterable0) {
            this.zzahL.add(((Filter)object0));
            FilterHolder filterHolder0 = new FilterHolder(((Filter)object0));
            this.zzaif.add(filterHolder0);
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zzk.zza(this, out, flags);
    }

    @Override  // com.google.android.gms.drive.query.Filter
    public Object zza(zzf zzf0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.zzaif) {
            arrayList0.add(((FilterHolder)object0).getFilter().zza(zzf0));
        }
        return zzf0.zzb(this.zzahQ, arrayList0);
    }
}

