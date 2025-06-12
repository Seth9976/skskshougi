package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;

class zzo implements ContainerHolder {
    public interface zza {
        void zzej(String arg1);

        String zzyo();

        void zzyq();
    }

    class zzb extends Handler {
        private final ContainerAvailableListener zzaKL;
        final zzo zzaKM;

        public zzb(ContainerAvailableListener containerHolder$ContainerAvailableListener0, Looper looper0) {
            super(looper0);
            this.zzaKL = containerHolder$ContainerAvailableListener0;
        }

        @Override  // android.os.Handler
        public void handleMessage(Message msg) {
            if(msg.what != 1) {
                zzbg.zzaz("Don\'t know how to handle this message.");
                return;
            }
            this.zzel(((String)msg.obj));
        }

        public void zzek(String s) {
            this.sendMessage(this.obtainMessage(1, s));
        }

        protected void zzel(String s) {
            this.zzaKL.onContainerAvailable(zzo.this, s);
        }
    }

    private Status zzOt;
    private final Looper zzWt;
    private Container zzaKG;
    private Container zzaKH;
    private zzb zzaKI;
    private zza zzaKJ;
    private TagManager zzaKK;
    private boolean zzaea;

    public zzo(Status status0) {
        this.zzOt = status0;
        this.zzWt = null;
    }

    public zzo(TagManager tagManager0, Looper looper0, Container container0, zza zzo$zza0) {
        this.zzaKK = tagManager0;
        if(looper0 == null) {
            looper0 = Looper.getMainLooper();
        }
        this.zzWt = looper0;
        this.zzaKG = container0;
        this.zzaKJ = zzo$zza0;
        this.zzOt = Status.zzXP;
        tagManager0.zza(this);
    }

    @Override  // com.google.android.gms.tagmanager.ContainerHolder
    public Container getContainer() {
        Container container0 = null;
        synchronized(this) {
            if(this.zzaea) {
                zzbg.zzaz("ContainerHolder is released.");
            }
            else {
                if(this.zzaKH != null) {
                    this.zzaKG = this.zzaKH;
                    this.zzaKH = null;
                }
                container0 = this.zzaKG;
            }
            return container0;
        }
    }

    String getContainerId() {
        if(this.zzaea) {
            zzbg.zzaz("getContainerId called on a released ContainerHolder.");
            return "";
        }
        return this.zzaKG.getContainerId();
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzOt;
    }

    @Override  // com.google.android.gms.tagmanager.ContainerHolder
    public void refresh() {
        synchronized(this) {
            if(this.zzaea) {
                zzbg.zzaz("Refreshing a released ContainerHolder.");
            }
            else {
                this.zzaKJ.zzyq();
            }
        }
    }

    @Override  // com.google.android.gms.common.api.Releasable
    public void release() {
        synchronized(this) {
            if(this.zzaea) {
                zzbg.zzaz("Releasing a released ContainerHolder.");
            }
            else {
                this.zzaea = true;
                this.zzaKK.zzb(this);
                this.zzaKG.release();
                this.zzaKG = null;
                this.zzaKH = null;
                this.zzaKJ = null;
                this.zzaKI = null;
            }
        }
    }

    @Override  // com.google.android.gms.tagmanager.ContainerHolder
    public void setContainerAvailableListener(ContainerAvailableListener listener) {
        synchronized(this) {
            if(this.zzaea) {
                zzbg.zzaz("ContainerHolder is released.");
            }
            else if(listener == null) {
                this.zzaKI = null;
            }
            else {
                this.zzaKI = new zzb(this, listener, this.zzWt);
                if(this.zzaKH != null) {
                    this.zzyp();
                }
            }
        }
    }

    public void zza(Container container0) {
        synchronized(this) {
            if(!this.zzaea) {
                if(container0 == null) {
                    zzbg.zzaz("Unexpected null container.");
                }
                else {
                    this.zzaKH = container0;
                    this.zzyp();
                }
            }
        }
    }

    public void zzeh(String s) {
        synchronized(this) {
            if(!this.zzaea) {
                this.zzaKG.zzeh(s);
            }
        }
    }

    void zzej(String s) {
        if(this.zzaea) {
            zzbg.zzaz("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return;
        }
        this.zzaKJ.zzej(s);
    }

    String zzyo() {
        if(this.zzaea) {
            zzbg.zzaz("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
            return "";
        }
        return this.zzaKJ.zzyo();
    }

    private void zzyp() {
        if(this.zzaKI != null) {
            this.zzaKI.zzek(this.zzaKH.zzym());
        }
    }
}

