package com.google.android.gms.common.api;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public final class Api {
    public interface ApiOptions {
        public interface HasOptions extends ApiOptions {
        }

        public static final class NoOptions implements NotRequiredOptions {
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }

    }

    public interface Client {
        void connect(ConnectionProgressReportCallbacks arg1);

        void disconnect();

        void dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

        void getRemoteService(IAccountAccessor arg1, Set arg2);

        boolean isConnected();

        boolean isConnecting();

        boolean requiresAccount();

        boolean requiresSignIn();

        void validateAccount(IAccountAccessor arg1);
    }

    public static final class ClientKey {
    }

    public interface zza {
        int getPriority();

        Client zza(Context arg1, Looper arg2, zze arg3, Object arg4, ConnectionCallbacks arg5, OnConnectionFailedListener arg6);
    }

    public interface zzb {
        String getServiceDescriptor();

        String getStartServiceAction();

        IInterface zzT(IBinder arg1);
    }

    public interface zzc {
        zzb zzl(Object arg1);

        int zzmu();
    }

    public static final class zzd {
    }

    private final String mName;
    private final ClientKey zzVu;
    private final zza zzWi;
    private final zzc zzWj;
    private final zzd zzWk;
    private final ArrayList zzWl;

    public Api(String name, zza api$zza0, ClientKey api$ClientKey0, Scope[] impliedScopes) {
        zzu.zzb(api$zza0, "Cannot construct an Api with a null ClientBuilder");
        zzu.zzb(api$ClientKey0, "Cannot construct an Api with a null ClientKey");
        this.mName = name;
        this.zzWi = api$zza0;
        this.zzWj = null;
        this.zzVu = api$ClientKey0;
        this.zzWk = null;
        this.zzWl = new ArrayList(Arrays.asList(impliedScopes));
    }

    public String getName() {
        return this.mName;
    }

    public zza zzmp() {
        zzu.zza(this.zzWi != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.zzWi;
    }

    public zzc zzmq() {
        zzu.zza(this.zzWj != null, "This API was constructed with a ClientBuilder. Use getClientBuilder");
        return this.zzWj;
    }

    public List zzmr() {
        return this.zzWl;
    }

    public ClientKey zzms() {
        zzu.zza(this.zzVu != null, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey");
        return this.zzVu;
    }

    public boolean zzmt() {
        return this.zzWk != null;
    }
}

