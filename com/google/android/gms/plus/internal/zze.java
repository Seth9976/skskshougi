package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.internal.model.moments.MomentEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

public class zze extends zzi {
    static final class zza implements LoadMomentsResult {
        private final Status zzOt;
        private final String zzaHn;
        private final String zzaHo;
        private final MomentBuffer zzaHp;

        public zza(Status status0, DataHolder dataHolder0, String s, String s1) {
            this.zzOt = status0;
            this.zzaHn = s;
            this.zzaHo = s1;
            this.zzaHp = dataHolder0 == null ? null : new MomentBuffer(dataHolder0);
        }

        @Override  // com.google.android.gms.plus.Moments$LoadMomentsResult
        public MomentBuffer getMomentBuffer() {
            return this.zzaHp;
        }

        @Override  // com.google.android.gms.plus.Moments$LoadMomentsResult
        public String getNextPageToken() {
            return this.zzaHn;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }

        @Override  // com.google.android.gms.plus.Moments$LoadMomentsResult
        public String getUpdated() {
            return this.zzaHo;
        }

        @Override  // com.google.android.gms.common.api.Releasable
        public void release() {
            if(this.zzaHp != null) {
                this.zzaHp.release();
            }
        }
    }

    static final class zzb implements LoadPeopleResult {
        private final Status zzOt;
        private final String zzaHn;
        private final PersonBuffer zzaHq;

        public zzb(Status status0, DataHolder dataHolder0, String s) {
            this.zzOt = status0;
            this.zzaHn = s;
            this.zzaHq = dataHolder0 == null ? null : new PersonBuffer(dataHolder0);
        }

        @Override  // com.google.android.gms.plus.People$LoadPeopleResult
        public String getNextPageToken() {
            return this.zzaHn;
        }

        @Override  // com.google.android.gms.plus.People$LoadPeopleResult
        public PersonBuffer getPersonBuffer() {
            return this.zzaHq;
        }

        @Override  // com.google.android.gms.common.api.Result
        public Status getStatus() {
            return this.zzOt;
        }

        @Override  // com.google.android.gms.common.api.Releasable
        public void release() {
            if(this.zzaHq != null) {
                this.zzaHq.release();
            }
        }
    }

    static final class zzc extends com.google.android.gms.plus.internal.zza {
        private final com.google.android.gms.common.api.zza.zzb zzayZ;

        public zzc(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzayZ = zza$zzb0;
        }

        @Override  // com.google.android.gms.plus.internal.zza
        public void zzaO(Status status0) {
            this.zzayZ.zzm(status0);
        }
    }

    static final class zzd extends com.google.android.gms.plus.internal.zza {
        private final com.google.android.gms.common.api.zza.zzb zzayZ;

        public zzd(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzayZ = zza$zzb0;
        }

        @Override  // com.google.android.gms.plus.internal.zza
        public void zza(DataHolder dataHolder0, String s, String s1) {
            Status status0 = new Status(dataHolder0.getStatusCode(), null, (dataHolder0.zznb() == null ? null : ((PendingIntent)dataHolder0.zznb().getParcelable("pendingIntent"))));
            if(!status0.isSuccess()) {
                if(!dataHolder0.isClosed()) {
                    dataHolder0.close();
                }
                dataHolder0 = null;
            }
            zza zze$zza0 = new zza(status0, dataHolder0, s, s1);
            this.zzayZ.zzm(zze$zza0);
        }
    }

    static final class com.google.android.gms.plus.internal.zze.zze extends com.google.android.gms.plus.internal.zza {
        private final com.google.android.gms.common.api.zza.zzb zzayZ;

        public com.google.android.gms.plus.internal.zze.zze(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzayZ = zza$zzb0;
        }

        @Override  // com.google.android.gms.plus.internal.zza
        public void zza(DataHolder dataHolder0, String s) {
            Status status0 = new Status(dataHolder0.getStatusCode(), null, (dataHolder0.zznb() == null ? null : ((PendingIntent)dataHolder0.zznb().getParcelable("pendingIntent"))));
            if(!status0.isSuccess()) {
                if(!dataHolder0.isClosed()) {
                    dataHolder0.close();
                }
                dataHolder0 = null;
            }
            zzb zze$zzb0 = new zzb(status0, dataHolder0, s);
            this.zzayZ.zzm(zze$zzb0);
        }
    }

    static final class zzf extends com.google.android.gms.plus.internal.zza {
        private final com.google.android.gms.common.api.zza.zzb zzayZ;

        public zzf(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
            this.zzayZ = zza$zzb0;
        }

        @Override  // com.google.android.gms.plus.internal.zza
        public void zzi(int v, Bundle bundle0) {
            Status status0 = new Status(v, null, (bundle0 == null ? null : ((PendingIntent)bundle0.getParcelable("pendingIntent"))));
            this.zzayZ.zzm(status0);
        }
    }

    private Person zzaHl;
    private final PlusSession zzaHm;

    public zze(Context context0, Looper looper0, com.google.android.gms.common.internal.zze zze0, PlusSession plusSession0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        super(context0, looper0, 2, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0, zze0);
        this.zzaHm = plusSession0;
    }

    public String getAccountName() {
        this.zznL();
        try {
            return ((com.google.android.gms.plus.internal.zzd)this.zznM()).getAccountName();
        }
        catch(RemoteException remoteException0) {
            throw new IllegalStateException(remoteException0);
        }
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getServiceDescriptor() {
        return "com.google.android.gms.plus.internal.IPlusService";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected String getStartServiceAction() {
        return "com.google.android.gms.plus.service.START";
    }

    @Override  // com.google.android.gms.common.internal.zzi
    public boolean requiresSignIn() {
        return zze.zze(this.zznK().zzb(Plus.API));
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected IInterface zzT(IBinder iBinder0) {
        return this.zzdu(iBinder0);
    }

    public ICancelToken zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, int v, String s) {
        this.zznL();
        com.google.android.gms.plus.internal.zze.zze zze$zze0 = new com.google.android.gms.plus.internal.zze.zze(zza$zzb0);
        try {
            return ((com.google.android.gms.plus.internal.zzd)this.zznM()).zza(zze$zze0, 1, v, -1, s);
        }
        catch(RemoteException unused_ex) {
            zze$zze0.zza(DataHolder.zzbi(8), null);
            return null;
        }
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected void zza(int v, IBinder iBinder0, Bundle bundle0, int v1) {
        if(v == 0 && bundle0 != null && bundle0.containsKey("loaded_person")) {
            this.zzaHl = PersonEntity.zzp(bundle0.getByteArray("loaded_person"));
        }
        super.zza(v, iBinder0, bundle0, v1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, int v, String s, Uri uri0, String s1, String s2) {
        this.zznL();
        zzd zze$zzd0 = zza$zzb0 == null ? null : new zzd(zza$zzb0);
        try {
            ((com.google.android.gms.plus.internal.zzd)this.zznM()).zza(zze$zzd0, v, s, uri0, s1, s2);
        }
        catch(RemoteException unused_ex) {
            zze$zzd0.zza(DataHolder.zzbi(8), null, null);
        }
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, Moment moment0) {
        this.zznL();
        zzc zze$zzc0 = zza$zzb0 == null ? null : new zzc(zza$zzb0);
        try {
            SafeParcelResponse safeParcelResponse0 = SafeParcelResponse.zza(((MomentEntity)moment0));
            ((com.google.android.gms.plus.internal.zzd)this.zznM()).zza(zze$zzc0, safeParcelResponse0);
        }
        catch(RemoteException remoteException0) {
            if(zze$zzc0 == null) {
                throw new IllegalStateException(remoteException0);
            }
            zze$zzc0.zzaO(new Status(8, null, null));
        }
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zza$zzb0, Collection collection0) {
        this.zznL();
        com.google.android.gms.plus.internal.zze.zze zze$zze0 = new com.google.android.gms.plus.internal.zze.zze(zza$zzb0);
        try {
            ((com.google.android.gms.plus.internal.zzd)this.zznM()).zza(zze$zze0, new ArrayList(collection0));
        }
        catch(RemoteException unused_ex) {
            zze$zze0.zza(DataHolder.zzbi(8), null);
        }
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zza$zzb0, String[] arr_s) {
        this.zza(zza$zzb0, Arrays.asList(arr_s));
    }

    public void zzdX(String s) {
        this.zznL();
        try {
            ((com.google.android.gms.plus.internal.zzd)this.zznM()).zzdX(s);
        }
        catch(RemoteException remoteException0) {
            throw new IllegalStateException(remoteException0);
        }
    }

    protected com.google.android.gms.plus.internal.zzd zzdu(IBinder iBinder0) {
        return com.google.android.gms.plus.internal.zzd.zza.zzdt(iBinder0);
    }

    // 去混淆评级： 低(40)
    public static boolean zze(Set set0) {
        return set0 != null && !set0.isEmpty() ? set0.size() != 1 || !set0.contains(new Scope("plus_one_placeholder_scope")) : false;
    }

    public void zzi(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
        this.zza(zza$zzb0, 20, null, null, null, "me");
    }

    public void zzj(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
        this.zznL();
        com.google.android.gms.plus.internal.zze.zze zze$zze0 = new com.google.android.gms.plus.internal.zze.zze(zza$zzb0);
        try {
            ((com.google.android.gms.plus.internal.zzd)this.zznM()).zza(zze$zze0, 2, 1, -1, null);
        }
        catch(RemoteException unused_ex) {
            zze$zze0.zza(DataHolder.zzbi(8), null);
        }
    }

    public void zzk(com.google.android.gms.common.api.zza.zzb zza$zzb0) {
        this.zznL();
        this.zzxr();
        zzf zze$zzf0 = new zzf(zza$zzb0);
        try {
            ((com.google.android.gms.plus.internal.zzd)this.zznM()).zzb(zze$zzf0);
        }
        catch(RemoteException unused_ex) {
            zze$zzf0.zzi(8, null);
        }
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected Bundle zzkR() {
        return this.zzkS();
    }

    private Bundle zzkS() {
        Bundle bundle0 = this.zzaHm.zzxE();
        bundle0.putStringArray("request_visible_actions", this.zzaHm.zzxy());
        bundle0.putString("auth_package", this.zzaHm.zzxA());
        return bundle0;
    }

    @Override  // com.google.android.gms.common.internal.zzi
    protected Bundle zznN() {
        return this.zzkS();
    }

    public ICancelToken zzq(com.google.android.gms.common.api.zza.zzb zza$zzb0, String s) {
        return this.zza(zza$zzb0, 0, s);
    }

    public void zzxr() {
        this.zznL();
        try {
            this.zzaHl = null;
            ((com.google.android.gms.plus.internal.zzd)this.zznM()).zzxr();
        }
        catch(RemoteException remoteException0) {
            throw new IllegalStateException(remoteException0);
        }
    }

    public Person zzxu() {
        this.zznL();
        return this.zzaHl;
    }
}

