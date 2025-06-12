package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class GetRecentContextCall {
    public static class Request implements SafeParcelable {
        public static final zzf CREATOR;
        final int zzCY;
        public final Account zzNj;
        public final boolean zzNk;
        public final boolean zzNl;
        public final boolean zzNm;

        static {
            Request.CREATOR = new zzf();
        }

        public Request() {
            this(null, false, false, false);
        }

        Request(int versionCode, Account filterAccount, boolean includeDeviceOnlyData, boolean includeThirdPartyContext, boolean includeUsageEnded) {
            this.zzCY = versionCode;
            this.zzNj = filterAccount;
            this.zzNk = includeDeviceOnlyData;
            this.zzNl = includeThirdPartyContext;
            this.zzNm = includeUsageEnded;
        }

        public Request(Account filterAccount, boolean includeDeviceOnlyData, boolean includeThirdPartyContext, boolean includeUsageEnded) {
            this(1, filterAccount, includeDeviceOnlyData, includeThirdPartyContext, includeUsageEnded);
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            zzf.zza(this, out, flags);
        }
    }

    public static class Response implements Result, SafeParcelable {
        public static final zzg CREATOR;
        final int zzCY;
        public Status zzNn;
        public List zzNo;
        public String[] zzNp;

        static {
            Response.CREATOR = new zzg();
        }

        public Response() {
            this.zzCY = 1;
        }

        Response(int versionCode, Status status, List list0, String[] topRunningPackages) {
            this.zzCY = versionCode;
            this.zzNn = status;
            this.zzNo = list0;
            this.zzNp = topRunningPackages;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzNn;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            zzg.zza(this, out, flags);
        }
    }

}

