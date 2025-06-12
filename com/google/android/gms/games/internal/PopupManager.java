package com.google.android.gms.games.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.lang.ref.WeakReference;

public class PopupManager {
    public static final class PopupLocationInfo {
        public int bottom;
        public int gravity;
        public int left;
        public int right;
        public int top;
        public IBinder zzaqv;
        public int zzaqw;

        private PopupLocationInfo(int gravity, IBinder windowToken) {
            this.zzaqw = -1;
            this.left = 0;
            this.top = 0;
            this.right = 0;
            this.bottom = 0;
            this.gravity = gravity;
            this.zzaqv = windowToken;
        }

        PopupLocationInfo(int x0, IBinder x1, com.google.android.gms.games.internal.PopupManager.1 x2) {
            this(x0, x1);
        }

        public Bundle zztc() {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("popupLocationInfo.gravity", this.gravity);
            bundle0.putInt("popupLocationInfo.displayId", this.zzaqw);
            bundle0.putInt("popupLocationInfo.left", this.left);
            bundle0.putInt("popupLocationInfo.top", this.top);
            bundle0.putInt("popupLocationInfo.right", this.right);
            bundle0.putInt("popupLocationInfo.bottom", this.bottom);
            return bundle0;
        }
    }

    static final class PopupManagerHCMR1 extends PopupManager implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        private boolean zzaoV;
        private WeakReference zzaqx;

        protected PopupManagerHCMR1(GamesClientImpl gamesClientImpl, int gravity) {
            super(gamesClientImpl, gravity, null);
            this.zzaoV = false;
        }

        @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
        public void onGlobalLayout() {
            if(this.zzaqx != null) {
                View view0 = (View)this.zzaqx.get();
                if(view0 != null) {
                    this.zzp(view0);
                }
            }
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            this.zzp(v);
        }

        @Override  // android.view.View$OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            this.zzaqt.zzsR();
            v.removeOnAttachStateChangeListener(this);
        }

        @Override  // com.google.android.gms.games.internal.PopupManager
        protected void zzfF(int v) {
            this.zzaqu = new PopupLocationInfo(v, null, null);
        }

        @Override  // com.google.android.gms.games.internal.PopupManager
        public void zzo(View view0) {
            this.zzaqt.zzsR();
            if(this.zzaqx != null) {
                View view1 = (View)this.zzaqx.get();
                Context context0 = this.zzaqt.getContext();
                if(view1 == null && context0 instanceof Activity) {
                    view1 = ((Activity)context0).getWindow().getDecorView();
                }
                if(view1 != null) {
                    view1.removeOnAttachStateChangeListener(this);
                    view1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
            this.zzaqx = null;
            Context context1 = this.zzaqt.getContext();
            if(view0 == null && context1 instanceof Activity) {
                View view2 = ((Activity)context1).findViewById(0x1020002);
                if(view2 == null) {
                    view2 = ((Activity)context1).getWindow().getDecorView();
                }
                GamesLog.zzu("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
                view0 = view2;
            }
            if(view0 != null) {
                this.zzp(view0);
                this.zzaqx = new WeakReference(view0);
                view0.addOnAttachStateChangeListener(this);
                view0.getViewTreeObserver().addOnGlobalLayoutListener(this);
                return;
            }
            GamesLog.zzv("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client\'s calls. Use setViewForPopups() to set your content view.");
        }

        private void zzp(View view0) {
            int v = -1;
            Display display0 = view0.getDisplay();
            if(display0 != null) {
                v = display0.getDisplayId();
            }
            IBinder iBinder0 = view0.getWindowToken();
            int[] arr_v = new int[2];
            view0.getLocationInWindow(arr_v);
            int v1 = view0.getWidth();
            int v2 = view0.getHeight();
            this.zzaqu.zzaqw = v;
            this.zzaqu.zzaqv = iBinder0;
            this.zzaqu.left = arr_v[0];
            this.zzaqu.top = arr_v[1];
            this.zzaqu.right = arr_v[0] + v1;
            this.zzaqu.bottom = arr_v[1] + v2;
            if(this.zzaoV) {
                this.zztd();
                this.zzaoV = false;
            }
        }

        @Override  // com.google.android.gms.games.internal.PopupManager
        public void zztd() {
            if(this.zzaqu.zzaqv != null) {
                super.zztd();
                return;
            }
            this.zzaoV = this.zzaqx != null;
        }
    }

    protected GamesClientImpl zzaqt;
    protected PopupLocationInfo zzaqu;

    private PopupManager(GamesClientImpl gamesClientImpl, int gravity) {
        this.zzaqt = gamesClientImpl;
        this.zzfF(gravity);
    }

    PopupManager(GamesClientImpl x0, int x1, com.google.android.gms.games.internal.PopupManager.1 x2) {
        this(x0, x1);
    }

    public void setGravity(int gravity) {
        this.zzaqu.gravity = gravity;
    }

    // 去混淆评级： 低(30)
    public static PopupManager zza(GamesClientImpl gamesClientImpl0, int v) {
        return new PopupManagerHCMR1(gamesClientImpl0, v);
    }

    protected void zzfF(int v) {
        this.zzaqu = new PopupLocationInfo(v, new Binder(), null);
    }

    public void zzo(View view0) {
    }

    public void zztd() {
        this.zzaqt.zza(this.zzaqu.zzaqv, this.zzaqu.zztc());
    }

    public Bundle zzte() {
        return this.zzaqu.zztc();
    }

    public IBinder zztf() {
        return this.zzaqu.zzaqv;
    }

    public PopupLocationInfo zztg() {
        return this.zzaqu;
    }

    class com.google.android.gms.games.internal.PopupManager.1 {
    }

}

