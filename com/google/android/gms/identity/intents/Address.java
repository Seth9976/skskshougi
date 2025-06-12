package com.google.android.gms.identity.intents;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zznk;

public final class Address {
    public static final class AddressOptions implements HasOptions {
        public final int theme;

        public AddressOptions() {
            this.theme = 0;
        }

        public AddressOptions(int theme) {
            this.theme = theme;
        }
    }

    static abstract class zza extends com.google.android.gms.common.api.zza.zza {
        public zza(GoogleApiClient googleApiClient0) {
            super(Address.zzNX, googleApiClient0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        public Result createFailedResult(Status x0) {
            return x0;
        }

        public Status zzb(Status status0) [...] // Inlined contents
    }

    public static final Api API;
    static final ClientKey zzNX;
    private static final com.google.android.gms.common.api.Api.zza zzNY;

    static {
        Address.zzNX = new ClientKey();
        Address.zzNY = new com.google.android.gms.common.api.Api.zza() {
            @Override  // com.google.android.gms.common.api.Api$zza
            public int getPriority() {
                return 0x7FFFFFFF;
            }

            public zznk zza(Context context0, Looper looper0, zze zze0, AddressOptions address$AddressOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
                zzu.zzb(context0 instanceof Activity, "An Activity must be used for Address APIs");
                if(address$AddressOptions0 == null) {
                    address$AddressOptions0 = new AddressOptions();
                }
                return new zznk(((Activity)context0), looper0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0.getAccountName(), address$AddressOptions0.theme);
            }
        };
        Address.API = new Api("Address.API", Address.zzNY, Address.zzNX, new Scope[0]);
    }

    public static void requestUserAddress(GoogleApiClient googleApiClient, UserAddressRequest request, int requestCode) {
        googleApiClient.zza(new zza(googleApiClient) {
            protected void zza(zznk zznk0) throws RemoteException {
                zznk0.zza(request, requestCode);
                this.setResult(Status.zzXP);
            }
        });
    }
}

