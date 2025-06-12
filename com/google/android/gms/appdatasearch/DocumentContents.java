package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class DocumentContents implements SafeParcelable {
    public static class zza {
        private List zzMV;
        private String zzMW;
        private boolean zzMX;
        private Account zzMY;

        public zza zzI(boolean z) {
            this.zzMX = z;
            return this;
        }

        public zza zza(Account account0) {
            this.zzMY = account0;
            return this;
        }

        public zza zza(DocumentSection documentSection0) {
            if(this.zzMV == null) {
                this.zzMV = new ArrayList();
            }
            this.zzMV.add(documentSection0);
            return this;
        }

        public zza zzbp(String s) {
            this.zzMW = s;
            return this;
        }

        public DocumentContents zzkJ() {
            String s = this.zzMW;
            boolean z = this.zzMX;
            Account account0 = this.zzMY;
            return this.zzMV == null ? new DocumentContents(s, z, account0, null) : new DocumentContents(s, z, account0, ((DocumentSection[])this.zzMV.toArray(new DocumentSection[this.zzMV.size()])));
        }
    }

    public static final zzb CREATOR;
    public final Account account;
    final int zzCY;
    final DocumentSection[] zzMS;
    public final String zzMT;
    public final boolean zzMU;

    static {
        DocumentContents.CREATOR = new zzb();
    }

    DocumentContents(int versionCode, DocumentSection[] sectionContents, String schemaOrgType, boolean globalSearchEnabled, Account account) {
        this.zzCY = versionCode;
        this.zzMS = sectionContents;
        this.zzMT = schemaOrgType;
        this.zzMU = globalSearchEnabled;
        this.account = account;
    }

    DocumentContents(String schemaOrgType, boolean globalSearchEnabled, Account account, DocumentSection[] sections) {
        this(1, sections, schemaOrgType, globalSearchEnabled, account);
        BitSet bitSet0 = new BitSet(9);
        for(int v = 0; v < sections.length; ++v) {
            int v1 = sections[v].zzNg;
            if(v1 != -1) {
                if(bitSet0.get(v1)) {
                    throw new IllegalArgumentException("Duplicate global search section type " + zzh.zzai(v1));
                }
                bitSet0.set(v1);
            }
        }
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzb.zza(this, dest, flags);
    }
}

