package com.google.android.gms.games.internal.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome;
import java.util.HashMap;
import java.util.Set;

public final class RequestUpdateOutcomes {
    public static final class Builder {
        private int zzTS;
        private HashMap zzatx;

        public Builder() {
            this.zzatx = new HashMap();
            this.zzTS = 0;
        }

        public Builder zzfQ(int v) {
            this.zzTS = v;
            return this;
        }

        public RequestUpdateOutcomes zztD() {
            return new RequestUpdateOutcomes(this.zzTS, this.zzatx, null);
        }

        public Builder zzx(String s, int v) {
            if(RequestUpdateResultOutcome.isValid(v)) {
                this.zzatx.put(s, v);
            }
            return this;
        }
    }

    private final int zzTS;
    private static final String[] zzatw;
    private final HashMap zzatx;

    static {
        RequestUpdateOutcomes.zzatw = new String[]{"requestId", "outcome"};
    }

    private RequestUpdateOutcomes(int statusCode, HashMap hashMap0) {
        this.zzTS = statusCode;
        this.zzatx = hashMap0;
    }

    RequestUpdateOutcomes(int x0, HashMap x1, com.google.android.gms.games.internal.request.RequestUpdateOutcomes.1 x2) {
        this(x0, x1);
    }

    public Set getRequestIds() {
        return this.zzatx.keySet();
    }

    public int getRequestOutcome(String requestId) {
        zzu.zzb(this.zzatx.containsKey(requestId), "Request " + requestId + " was not part of the update operation!");
        return (int)(((Integer)this.zzatx.get(requestId)));
    }

    public static RequestUpdateOutcomes zzX(DataHolder dataHolder0) {
        Builder requestUpdateOutcomes$Builder0 = new Builder();
        requestUpdateOutcomes$Builder0.zzfQ(dataHolder0.getStatusCode());
        int v = dataHolder0.getCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = dataHolder0.zzbh(v1);
            requestUpdateOutcomes$Builder0.zzx(dataHolder0.zzd("requestId", v1, v2), dataHolder0.zzc("outcome", v1, v2));
        }
        return requestUpdateOutcomes$Builder0.zztD();
    }

    class com.google.android.gms.games.internal.request.RequestUpdateOutcomes.1 {
    }

}

