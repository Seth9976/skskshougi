package com.google.android.gms.drive.query;

import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;
import com.google.android.gms.drive.query.internal.HasFilter;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.NotFilter;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.query.internal.OwnedByMeFilter;

public class Filters {
    public static Filter and(Filter filter, Filter[] additionalFilters) {
        return new LogicalFilter(Operator.zzaim, filter, additionalFilters);
    }

    public static Filter and(Iterable iterable0) {
        return new LogicalFilter(Operator.zzaim, iterable0);
    }

    public static Filter contains(SearchableMetadataField searchableMetadataField0, String value) {
        return new ComparisonFilter(Operator.zzaip, searchableMetadataField0, value);
    }

    public static Filter eq(CustomPropertyKey key, String value) {
        AppVisibleCustomProperties appVisibleCustomProperties0 = new zza().zza(key, value).zzpU();
        return new HasFilter(SearchableField.zzahN, appVisibleCustomProperties0);
    }

    public static Filter eq(SearchableMetadataField searchableMetadataField0, Object object0) {
        return new ComparisonFilter(Operator.zzaih, searchableMetadataField0, object0);
    }

    public static Filter greaterThan(SearchableOrderedMetadataField searchableOrderedMetadataField0, Comparable comparable0) {
        return new ComparisonFilter(Operator.zzaik, searchableOrderedMetadataField0, comparable0);
    }

    public static Filter greaterThanEquals(SearchableOrderedMetadataField searchableOrderedMetadataField0, Comparable comparable0) {
        return new ComparisonFilter(Operator.zzail, searchableOrderedMetadataField0, comparable0);
    }

    public static Filter in(SearchableCollectionMetadataField searchableCollectionMetadataField0, Object object0) {
        return new InFilter(searchableCollectionMetadataField0, object0);
    }

    public static Filter lessThan(SearchableOrderedMetadataField searchableOrderedMetadataField0, Comparable comparable0) {
        return new ComparisonFilter(Operator.zzaii, searchableOrderedMetadataField0, comparable0);
    }

    public static Filter lessThanEquals(SearchableOrderedMetadataField searchableOrderedMetadataField0, Comparable comparable0) {
        return new ComparisonFilter(Operator.zzaij, searchableOrderedMetadataField0, comparable0);
    }

    public static Filter not(Filter toNegate) {
        return new NotFilter(toNegate);
    }

    public static Filter openedByMe() {
        return new FieldOnlyFilter(SearchableField.LAST_VIEWED_BY_ME);
    }

    public static Filter or(Filter filter, Filter[] additionalFilters) {
        return new LogicalFilter(Operator.zzain, filter, additionalFilters);
    }

    public static Filter or(Iterable iterable0) {
        return new LogicalFilter(Operator.zzain, iterable0);
    }

    public static Filter ownedByMe() {
        return new OwnedByMeFilter();
    }

    public static Filter sharedWithMe() {
        return new FieldOnlyFilter(SearchableField.zzahM);
    }
}

