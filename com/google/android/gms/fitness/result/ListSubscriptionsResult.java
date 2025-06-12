package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSubscriptionsResult implements Result, SafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zzCY;
    private final Status zzOt;
    private final List zzamW;

    static {
        ListSubscriptionsResult.CREATOR = new zzh();
    }

    ListSubscriptionsResult(int versionCode, List list0, Status status) {
        this.zzCY = versionCode;
        this.zzamW = list0;
        this.zzOt = status;
    }

    public ListSubscriptionsResult(List list0, Status status) {
        this.zzCY = 3;
        this.zzamW = Collections.unmodifiableList(list0);
        this.zzOt = (Status)zzu.zzb(status, "status");
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object that) {
        return this == that || that instanceof ListSubscriptionsResult && this.zzb(((ListSubscriptionsResult)that));
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    public List getSubscriptions() {
        return this.zzamW;
    }

    public List getSubscriptions(DataType dataType) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.zzamW) {
            Subscription subscription0 = (Subscription)object0;
            if(dataType.equals(subscription0.zzqM())) {
                arrayList0.add(subscription0);
            }
        }
        return Collections.unmodifiableList(arrayList0);
    }

    int getVersionCode() {
        return this.zzCY;
    }

    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[]{this.zzOt, this.zzamW});
    }

    @Override
    public String toString() {
        return zzt.zzt(this).zzg("status", this.zzOt).zzg("subscriptions", this.zzamW).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        zzh.zza(this, dest, flags);
    }

    public static ListSubscriptionsResult zzN(Status status0) {
        return new ListSubscriptionsResult(Collections.emptyList(), status0);
    }

    // 去混淆评级： 低(20)
    private boolean zzb(ListSubscriptionsResult listSubscriptionsResult0) {
        return this.zzOt.equals(listSubscriptionsResult0.zzOt) && zzt.equal(this.zzamW, listSubscriptionsResult0.zzamW);
    }
}

