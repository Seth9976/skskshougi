package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public Object zzck(String s) {
        return null;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean zzcl(String s) {
        return false;
    }
}

