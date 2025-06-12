package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.zzkx;
import java.util.ArrayList;

public final class AppContentUtils {
    interface AppContentRunner {
        void zzb(ArrayList arg1, int arg2);
    }

    public static ArrayList zza(DataHolder dataHolder0, ArrayList arrayList0, String s, int v) {
        ArrayList arrayList1 = new ArrayList();
        AppContentUtils.zza(dataHolder0, 1, s, "action_id", v, new AppContentRunner() {
            @Override  // com.google.android.gms.games.appcontent.AppContentUtils$AppContentRunner
            public void zzb(ArrayList arrayList0, int v) {
                AppContentActionRef appContentActionRef0 = new AppContentActionRef(arrayList0, v);
                arrayList1.add(appContentActionRef0);
            }
        }, arrayList0);
        return arrayList1;
    }

    private static void zza(DataHolder dataHolder0, int v, String s, String s1, int v1, AppContentRunner appContentUtils$AppContentRunner0, ArrayList arrayList0) {
        DataHolder dataHolder1 = (DataHolder)arrayList0.get(v);
        String s2 = dataHolder0.zzd(s, v1, dataHolder0.zzbh(v1));
        if(!TextUtils.isEmpty(s2)) {
            int v2 = dataHolder1.getCount();
            String[] arr_s = s2.split(",");
            for(int v3 = 0; v3 < v2; ++v3) {
                String s3 = dataHolder1.zzd(s1, v3, dataHolder1.zzbh(v3));
                if(!TextUtils.isEmpty(s3) && zzkx.zzb(arr_s, s3)) {
                    appContentUtils$AppContentRunner0.zzb(arrayList0, v3);
                }
            }
        }
    }

    public static ArrayList zzb(DataHolder dataHolder0, ArrayList arrayList0, String s, int v) {
        ArrayList arrayList1 = new ArrayList();
        AppContentUtils.zza(dataHolder0, 2, s, "annotation_id", v, new AppContentRunner() {
            @Override  // com.google.android.gms.games.appcontent.AppContentUtils$AppContentRunner
            public void zzb(ArrayList arrayList0, int v) {
                AppContentAnnotationRef appContentAnnotationRef0 = new AppContentAnnotationRef(arrayList0, v);
                arrayList1.add(appContentAnnotationRef0);
            }
        }, arrayList0);
        return arrayList1;
    }

    public static ArrayList zzc(DataHolder dataHolder0, ArrayList arrayList0, String s, int v) {
        ArrayList arrayList1 = new ArrayList();
        AppContentUtils.zza(dataHolder0, 4, s, "condition_id", v, new AppContentRunner() {
            @Override  // com.google.android.gms.games.appcontent.AppContentUtils$AppContentRunner
            public void zzb(ArrayList arrayList0, int v) {
                AppContentConditionRef appContentConditionRef0 = new AppContentConditionRef(arrayList0, v);
                arrayList1.add(appContentConditionRef0);
            }
        }, arrayList0);
        return arrayList1;
    }

    public static Bundle zzd(DataHolder dataHolder0, ArrayList arrayList0, String s, int v) {
        Bundle bundle0 = new Bundle();
        AppContentUtils.zza(dataHolder0, 3, s, "tuple_id", v, new AppContentRunner() {
            @Override  // com.google.android.gms.games.appcontent.AppContentUtils$AppContentRunner
            public void zzb(ArrayList arrayList0, int v) {
                AppContentTupleRef appContentTupleRef0 = new AppContentTupleRef(((DataHolder)arrayList0.get(3)), v);
                String s = appContentTupleRef0.getName();
                String s1 = appContentTupleRef0.getValue();
                bundle0.putString(s, s1);
            }
        }, arrayList0);
        return bundle0;
    }
}

