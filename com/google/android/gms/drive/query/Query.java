package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Query implements SafeParcelable {
    public static class Builder {
        private Set zzadS;
        private String zzahH;
        private SortOrder zzahI;
        private List zzahJ;
        private boolean zzahK;
        private final List zzahL;

        public Builder() {
            this.zzahL = new ArrayList();
        }

        public Builder(Query query) {
            this.zzahL = new ArrayList();
            this.zzahL.add(query.getFilter());
            this.zzahH = query.getPageToken();
            this.zzahI = query.getSortOrder();
            this.zzahJ = query.zzpZ();
            this.zzahK = query.zzqa();
            this.zzadS = query.zzqb();
        }

        public Builder addFilter(Filter filter) {
            if(!(filter instanceof MatchAllFilter)) {
                this.zzahL.add(filter);
            }
            return this;
        }

        public Query build() {
            return new Query(new LogicalFilter(Operator.zzaim, this.zzahL), this.zzahH, this.zzahI, this.zzahJ, this.zzahK, this.zzadS, null);
        }

        @Deprecated
        public Builder setPageToken(String token) {
            this.zzahH = token;
            return this;
        }

        public Builder setSortOrder(SortOrder sortOrder) {
            this.zzahI = sortOrder;
            return this;
        }
    }

    public static final Parcelable.Creator CREATOR;
    final int zzCY;
    final List zzadR;
    private final Set zzadS;
    final LogicalFilter zzahG;
    final String zzahH;
    final SortOrder zzahI;
    final List zzahJ;
    final boolean zzahK;

    static {
        Query.CREATOR = new zza();
    }

    Query(int versionCode, LogicalFilter clause, String pageToken, SortOrder sortOrder, List list0, boolean shouldIncludeParents, List list1) {
        this(versionCode, clause, pageToken, sortOrder, list0, shouldIncludeParents, list1, (list1 == null ? null : new HashSet(list1)));
    }

    private Query(int versionCode, LogicalFilter clause, String pageToken, SortOrder sortOrder, List list0, boolean shouldIncludeParents, List list1, Set set0) {
        this.zzCY = versionCode;
        this.zzahG = clause;
        this.zzahH = pageToken;
        this.zzahI = sortOrder;
        this.zzahJ = list0;
        this.zzahK = shouldIncludeParents;
        this.zzadR = list1;
        this.zzadS = set0;
    }

    private Query(LogicalFilter clause, String pageToken, SortOrder sortOrder, List list0, boolean shouldIncludeParents, Set set0) {
        this(1, clause, pageToken, sortOrder, list0, shouldIncludeParents, (set0 == null ? null : new ArrayList(set0)), set0);
    }

    Query(LogicalFilter x0, String x1, SortOrder x2, List x3, boolean x4, Set x5, com.google.android.gms.drive.query.Query.1 x6) {
        this(x0, x1, x2, x3, x4, x5);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Filter getFilter() {
        return this.zzahG;
    }

    @Deprecated
    public String getPageToken() {
        return this.zzahH;
    }

    public SortOrder getSortOrder() {
        return this.zzahI;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", this.zzahG, this.zzahI, this.zzahH, this.zzadR);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        zza.zza(this, out, flags);
    }

    public List zzpZ() {
        return this.zzahJ;
    }

    public boolean zzqa() {
        return this.zzahK;
    }

    public Set zzqb() {
        return this.zzadS;
    }

    class com.google.android.gms.drive.query.Query.1 {
    }

}

