package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import jeb.synthetic.FIN;

public class zzl extends zzi implements SearchableCollectionMetadataField {
    public zzl(int v) {
        super("parents", Collections.emptySet(), Arrays.asList(new String[]{"parentsExtra", "dbInstanceId", "parentsExtraHolder"}), v);
    }

    private void zzc(DataHolder dataHolder0) {
        int v1;
        synchronized(dataHolder0) {
            DataHolder dataHolder1 = (DataHolder)dataHolder0.zznb().getParcelable("parentsExtraHolder");
            if(dataHolder1 == null) {
                return;
            }
            v1 = FIN.finallyOpen$NT();
            int v2 = dataHolder0.getCount();
            ArrayList arrayList0 = new ArrayList(v2);
            HashMap hashMap0 = new HashMap(v2);
            for(int v3 = 0; v3 < v2; ++v3) {
                int v4 = dataHolder0.zzbh(v3);
                ParentDriveIdSet parentDriveIdSet0 = new ParentDriveIdSet();
                arrayList0.add(parentDriveIdSet0);
                hashMap0.put(dataHolder0.zzb("sqlId", v3, v4), parentDriveIdSet0);
            }
            Bundle bundle0 = dataHolder1.zznb();
            String s = bundle0.getString("childSqlIdColumn");
            String s1 = bundle0.getString("parentSqlIdColumn");
            String s2 = bundle0.getString("parentResIdColumn");
            int v5 = dataHolder1.getCount();
            for(int v6 = 0; v6 < v5; ++v6) {
                int v7 = dataHolder1.zzbh(v6);
                ((ParentDriveIdSet)hashMap0.get(dataHolder1.zzb(s, v6, v7))).zza(new PartialDriveId(dataHolder1.zzd(s2, v6, v7), dataHolder1.zzb(s1, v6, v7), 1));
            }
            dataHolder0.zznb().putParcelableArrayList("parentsExtra", arrayList0);
            FIN.finallyCodeBegin$NT(v1);
            dataHolder1.close();
            dataHolder0.zznb().remove("parentsExtraHolder");
        }
        FIN.finallyCodeEnd$NT(v1);
    }

    @Override  // com.google.android.gms.drive.metadata.zzb
    protected Object zzc(DataHolder dataHolder0, int v, int v1) {
        return this.zzd(dataHolder0, v, v1);
    }

    @Override  // com.google.android.gms.drive.metadata.zzb
    protected Collection zzd(DataHolder dataHolder0, int v, int v1) {
        Bundle bundle0 = dataHolder0.zznb();
        ArrayList arrayList0 = bundle0.getParcelableArrayList("parentsExtra");
        if(arrayList0 == null) {
            if(bundle0.getParcelable("parentsExtraHolder") != null) {
                this.zzc(dataHolder0);
                arrayList0 = bundle0.getParcelableArrayList("parentsExtra");
            }
            if(arrayList0 == null) {
                return null;
            }
        }
        long v2 = bundle0.getLong("dbInstanceId");
        return ((ParentDriveIdSet)arrayList0.get(v)).zzC(v2);
    }

    public void zzd(DataHolder dataHolder0) {
        Bundle bundle0 = dataHolder0.zznb();
        if(bundle0 == null) {
            return;
        }
        synchronized(dataHolder0) {
            DataHolder dataHolder1 = (DataHolder)bundle0.getParcelable("parentsExtraHolder");
            if(dataHolder1 != null) {
                dataHolder1.close();
                bundle0.remove("parentsExtraHolder");
            }
        }
    }

    @Override  // com.google.android.gms.drive.metadata.internal.zzi
    protected Object zzj(Bundle bundle0) {
        return this.zzo(bundle0);
    }

    @Override  // com.google.android.gms.drive.metadata.internal.zzi
    protected Collection zzo(Bundle bundle0) {
        Collection collection0 = super.zzo(bundle0);
        return collection0 == null ? null : new HashSet(collection0);
    }
}

