package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import java.util.concurrent.atomic.AtomicReference;

public class zza {
    public static abstract class com.google.android.gms.common.api.zza.zza extends AbstractPendingResult implements zzb, zze {
        private final ClientKey zzVu;
        private AtomicReference zzWm;

        protected com.google.android.gms.common.api.zza.zza(ClientKey api$ClientKey0, GoogleApiClient googleApiClient0) {
            super(((GoogleApiClient)zzu.zzb(googleApiClient0, "GoogleApiClient must not be null")).getLooper());
            this.zzWm = new AtomicReference();
            this.zzVu = (ClientKey)zzu.zzu(api$ClientKey0);
        }

        @Override  // com.google.android.gms.common.api.AbstractPendingResult
        protected void onResultConsumed() {
            zzc zzg$zzc0 = (zzc)this.zzWm.getAndSet(null);
            if(zzg$zzc0 != null) {
                zzg$zzc0.zzc(this);
            }
        }

        private void zza(RemoteException remoteException0) {
            this.zzr(new Status(8, remoteException0.getLocalizedMessage(), null));
        }

        protected abstract void zza(Client arg1) throws RemoteException;

        @Override  // com.google.android.gms.common.api.zzg$zze
        public void zza(zzc zzg$zzc0) {
            this.zzWm.set(zzg$zzc0);
        }

        @Override  // com.google.android.gms.common.api.zzg$zze
        public final void zzb(Client api$Client0) throws DeadObjectException {
            try {
                this.zza(api$Client0);
            }
            catch(DeadObjectException deadObjectException0) {
                this.zza(deadObjectException0);
                throw deadObjectException0;
            }
            catch(RemoteException remoteException0) {
                this.zza(remoteException0);
            }
        }

        @Override  // com.google.android.gms.common.api.zza$zzb
        public void zzm(Object object0) {
            super.setResult(((Result)object0));
        }

        @Override  // com.google.android.gms.common.api.zzg$zze
        public final ClientKey zzms() {
            return this.zzVu;
        }

        @Override  // com.google.android.gms.common.api.zzg$zze
        public int zzmv() {
            return 0;
        }

        @Override  // com.google.android.gms.common.api.zza$zzb, com.google.android.gms.common.api.zzg$zze
        public final void zzr(Status status0) {
            zzu.zzb(!status0.isSuccess(), "Failed result must not be success");
            this.setResult(this.createFailedResult(status0));
        }
    }

    public interface zzb {
        void zzm(Object arg1);

        void zzr(Status arg1);
    }

}

